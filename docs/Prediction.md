

# Prediction


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier for the prediction |  |
|**model** | **String** | Model ID used for the prediction |  [optional] |
|**outputs** | **List&lt;URI&gt;** |  |  [optional] |
|**urls** | [**PredictionUrls**](PredictionUrls.md) |  |  [optional] |
|**hasNsfwContents** | **List&lt;Boolean&gt;** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Status of the task |  |
|**createdAt** | **OffsetDateTime** | Timestamp of when the request was created |  [optional] |
|**error** | **String** | Error message (empty if no error occurred) |  [optional] |
|**executionTime** | **BigDecimal** | model execution time |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| CREATED | &quot;created&quot; |
| PROCESSING | &quot;processing&quot; |
| COMPLETED | &quot;completed&quot; |
| FAILED | &quot;failed&quot; |



