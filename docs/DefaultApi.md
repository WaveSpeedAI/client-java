# DefaultApi

All URIs are relative to *https://api.wavespeed.ai/api/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createPrediction**](DefaultApi.md#createPrediction) | **POST** /{model_id} | Generate an image using the specified model |
| [**getPrediction**](DefaultApi.md#getPrediction) | **GET** /predictions/{predictionId}/result | Retrieve the result of a prediction |


<a id="createPrediction"></a>
# **createPrediction**
> PredictionResponse createPrediction(modelId, requestBody, webhook)

Generate an image using the specified model

This endpoint generates an image based on the provided parameters. The &#x60;model_id&#x60; is a required path parameter specifying the model to use. The request body can contain various key-value pairs to customize the model generation process. 

### Example
```java
// Import classes:
import ai.wavespeed.openapi.client.ApiClient;
import ai.wavespeed.openapi.client.ApiException;
import ai.wavespeed.openapi.client.Configuration;
import ai.wavespeed.openapi.client.auth.*;
import ai.wavespeed.openapi.client.models.*;
import ai.wavespeed.openapi.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.wavespeed.ai/api/v2");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String modelId = "modelId_example"; // String | The ID of the model to use for image generation
    Map<String, Object> requestBody = null; // Map<String, Object> | 
    String webhook = "webhook_example"; // String | The URL to which the webhook will be sent
    try {
      PredictionResponse result = apiInstance.createPrediction(modelId, requestBody, webhook);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#createPrediction");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **modelId** | **String**| The ID of the model to use for image generation | |
| **requestBody** | [**Map&lt;String, Object&gt;**](Object.md)|  | |
| **webhook** | **String**| The URL to which the webhook will be sent | [optional] |

### Return type

[**PredictionResponse**](PredictionResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Image generation successful |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **500** | Internal Server Error |  -  |

<a id="getPrediction"></a>
# **getPrediction**
> PredictionResponse getPrediction(predictionId)

Retrieve the result of a prediction

This endpoint retrieves the result of a prediction based on the provided request ID. 

### Example
```java
// Import classes:
import ai.wavespeed.openapi.client.ApiClient;
import ai.wavespeed.openapi.client.ApiException;
import ai.wavespeed.openapi.client.Configuration;
import ai.wavespeed.openapi.client.auth.*;
import ai.wavespeed.openapi.client.models.*;
import ai.wavespeed.openapi.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.wavespeed.ai/api/v2");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String predictionId = "predictionId_example"; // String | The ID of the prediction request
    try {
      PredictionResponse result = apiInstance.getPrediction(predictionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getPrediction");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **predictionId** | **String**| The ID of the prediction request | |

### Return type

[**PredictionResponse**](PredictionResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Image generation successful |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **500** | Internal Server Error |  -  |

