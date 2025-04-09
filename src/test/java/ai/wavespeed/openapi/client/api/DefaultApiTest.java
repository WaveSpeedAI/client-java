/*
 * WaveSpeed AI API
 * API for generating images using WaveSpeed AI
 *
 * The version of the OpenAPI document: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package ai.wavespeed.openapi.client.api;

import ai.wavespeed.openapi.client.ApiException;
import ai.wavespeed.openapi.client.model.CreatePredictionData400Response;
import ai.wavespeed.openapi.client.model.CreatePredictionData401Response;
import ai.wavespeed.openapi.client.model.CreatePredictionData500Response;
import ai.wavespeed.openapi.client.model.PredictionResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DefaultApi
 */
@Disabled
public class DefaultApiTest {

    private final DefaultApi api = new DefaultApi();

    /**
     * Generate an image using the specified model
     *
     * This endpoint generates an image based on the provided parameters. The &#x60;model_id&#x60; is a required path parameter specifying the model to use. The request body can contain various key-value pairs to customize the model generation process. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createPredictionDataTest() throws ApiException {
        String modelId = null;
        Map<String, Object> requestBody = null;
        String webhook = null;
        PredictionResponse response = api.createPredictionData(modelId, requestBody, webhook);
        // TODO: test validations
    }

    /**
     * Retrieve the result of a prediction
     *
     * This endpoint retrieves the result of a prediction based on the provided request ID. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPredictionDataTest() throws ApiException {
        String predictionId = null;
        PredictionResponse response = api.getPredictionData(predictionId);
        // TODO: test validations
    }

}
