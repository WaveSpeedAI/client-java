

# PredictionResponseData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier for the prediction |  [optional] |
|**model** | **String** | Model ID used for the prediction |  [optional] |
|**outputs** | **List&lt;URI&gt;** |  |  [optional] |
|**urls** | [**PredictionResponseDataUrls**](PredictionResponseDataUrls.md) |  |  [optional] |
|**hasNsfwContents** | **List&lt;Boolean&gt;** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Status of the task |  [optional] |
|**createdAt** | **OffsetDateTime** | ISO timestamp of when the request was created |  [optional] |
|**error** | **String** | Error message (empty if no error occurred) |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| CREATED | &quot;created&quot; |
| PROCESSING | &quot;processing&quot; |
| COMPLETED | &quot;completed&quot; |
| FAILED | &quot;failed&quot; |



