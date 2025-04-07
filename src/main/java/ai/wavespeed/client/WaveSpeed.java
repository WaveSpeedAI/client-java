package ai.wavespeed.client;

import ai.wavespeed.openapi.client.ApiException;
import ai.wavespeed.openapi.client.api.DefaultApi;
import ai.wavespeed.openapi.client.model.Prediction;
import ai.wavespeed.openapi.client.model.PredictionResponse;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

@Setter
@Getter
@Slf4j
public class WaveSpeed extends DefaultApi {

    public int pollInterval = 1000;

    public WaveSpeed() {
        super();
        String apiKey = System.getenv("WAVESPEED_API_KEY");
        if (apiKey != null) {
            throw new RuntimeException("Not set WAVESPEED_API_KEY environment variable.");
        }
        getApiClient().setBearerToken(apiKey);
    }

    public WaveSpeed(String apiKey) {
        super();
        getApiClient().setBearerToken(apiKey);
    }

    public Prediction run(String modelId, Map<String, Object> input) throws ApiException {
        return this.run(modelId, input, Options.builder().build());
    }

    public Prediction run(String modelId, Map<String, Object> input, Options options) throws ApiException {
        PredictionResponse predictionResponse = createPrediction(modelId, input, options.webhookUrl);
        if (predictionResponse.getCode() != 200) {
            throw new ApiException(String.format("Failed : Response error code : %s, message: %s"
                    , predictionResponse.getCode(), predictionResponse.getMessage()));
        }
        Prediction prediction = predictionResponse.getData();

        try {
            while (prediction.getStatus() != Prediction.StatusEnum.COMPLETED &&
                    prediction.getStatus() != Prediction.StatusEnum.FAILED) {
                Thread.sleep(pollInterval);
                log.debug("Polling prediction: {} status: {}", prediction.getId(), prediction.getStatus());
                predictionResponse = getPrediction(prediction.getId());
                prediction = predictionResponse.getData();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return prediction;
    }

    public Prediction create(String id, Map<String, Object> input) throws ApiException {
        return this.create(id, input, Options.builder().build());
    }

    public Prediction create(String id, Map<String, Object> input, Options options) throws ApiException {
        PredictionResponse predictionResponse = createPrediction(id, input, options.webhookUrl);
        if (predictionResponse.getCode() != 200) {
            throw new RuntimeException(String.format("Failed : Response error code : %s, message: %s", predictionResponse.getCode(), predictionResponse.getMessage()));
        }
        return predictionResponse.getData();
    }

    public Prediction get(String predictionId) throws ApiException {
        PredictionResponse predictionResponse = getPrediction(predictionId);
        if (predictionResponse.getCode() != 200) {
            throw new ApiException(String.format("Failed : Response error code : %s, message: %s", predictionResponse.getCode(), predictionResponse.getMessage()));
        }
        return predictionResponse.getData();
    }
}
