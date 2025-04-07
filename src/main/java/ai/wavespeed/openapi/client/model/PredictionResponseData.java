/*
 * WaveSpeed AI API
 * API for generating images using WaveSpeed AI
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package ai.wavespeed.openapi.client.model;

import java.util.Objects;
import ai.wavespeed.openapi.client.model.PredictionResponseDataUrls;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import ai.wavespeed.openapi.client.JSON;

/**
 * PredictionResponseData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-07T13:56:24.897845047+08:00[Asia/Shanghai]", comments = "Generator version: 7.10.0")
public class PredictionResponseData {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private String id;

  public static final String SERIALIZED_NAME_MODEL = "model";
  @SerializedName(SERIALIZED_NAME_MODEL)
  @javax.annotation.Nullable
  private String model;

  public static final String SERIALIZED_NAME_OUTPUTS = "outputs";
  @SerializedName(SERIALIZED_NAME_OUTPUTS)
  @javax.annotation.Nullable
  private List<URI> outputs;

  public static final String SERIALIZED_NAME_URLS = "urls";
  @SerializedName(SERIALIZED_NAME_URLS)
  @javax.annotation.Nullable
  private PredictionResponseDataUrls urls;

  public static final String SERIALIZED_NAME_HAS_NSFW_CONTENTS = "has_nsfw_contents";
  @SerializedName(SERIALIZED_NAME_HAS_NSFW_CONTENTS)
  @javax.annotation.Nullable
  private List<Boolean> hasNsfwContents;

  /**
   * Status of the task
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    CREATED("created"),
    
    PROCESSING("processing"),
    
    COMPLETED("completed"),
    
    FAILED("failed");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      StatusEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nullable
  private StatusEnum status;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  @javax.annotation.Nullable
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  @javax.annotation.Nullable
  private String error;

  public PredictionResponseData() {
  }

  public PredictionResponseData id(@javax.annotation.Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier for the prediction
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable String id) {
    this.id = id;
  }


  public PredictionResponseData model(@javax.annotation.Nullable String model) {
    this.model = model;
    return this;
  }

  /**
   * Model ID used for the prediction
   * @return model
   */
  @javax.annotation.Nullable
  public String getModel() {
    return model;
  }

  public void setModel(@javax.annotation.Nullable String model) {
    this.model = model;
  }


  public PredictionResponseData outputs(@javax.annotation.Nullable List<URI> outputs) {
    this.outputs = outputs;
    return this;
  }

  public PredictionResponseData addOutputsItem(URI outputsItem) {
    if (this.outputs == null) {
      this.outputs = new ArrayList<>();
    }
    this.outputs.add(outputsItem);
    return this;
  }

  /**
   * Get outputs
   * @return outputs
   */
  @javax.annotation.Nullable
  public List<URI> getOutputs() {
    return outputs;
  }

  public void setOutputs(@javax.annotation.Nullable List<URI> outputs) {
    this.outputs = outputs;
  }


  public PredictionResponseData urls(@javax.annotation.Nullable PredictionResponseDataUrls urls) {
    this.urls = urls;
    return this;
  }

  /**
   * Get urls
   * @return urls
   */
  @javax.annotation.Nullable
  public PredictionResponseDataUrls getUrls() {
    return urls;
  }

  public void setUrls(@javax.annotation.Nullable PredictionResponseDataUrls urls) {
    this.urls = urls;
  }


  public PredictionResponseData hasNsfwContents(@javax.annotation.Nullable List<Boolean> hasNsfwContents) {
    this.hasNsfwContents = hasNsfwContents;
    return this;
  }

  public PredictionResponseData addHasNsfwContentsItem(Boolean hasNsfwContentsItem) {
    if (this.hasNsfwContents == null) {
      this.hasNsfwContents = new ArrayList<>();
    }
    this.hasNsfwContents.add(hasNsfwContentsItem);
    return this;
  }

  /**
   * Get hasNsfwContents
   * @return hasNsfwContents
   */
  @javax.annotation.Nullable
  public List<Boolean> getHasNsfwContents() {
    return hasNsfwContents;
  }

  public void setHasNsfwContents(@javax.annotation.Nullable List<Boolean> hasNsfwContents) {
    this.hasNsfwContents = hasNsfwContents;
  }


  public PredictionResponseData status(@javax.annotation.Nullable StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Status of the task
   * @return status
   */
  @javax.annotation.Nullable
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nullable StatusEnum status) {
    this.status = status;
  }


  public PredictionResponseData createdAt(@javax.annotation.Nullable OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * ISO timestamp of when the request was created
   * @return createdAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(@javax.annotation.Nullable OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public PredictionResponseData error(@javax.annotation.Nullable String error) {
    this.error = error;
    return this;
  }

  /**
   * Error message (empty if no error occurred)
   * @return error
   */
  @javax.annotation.Nullable
  public String getError() {
    return error;
  }

  public void setError(@javax.annotation.Nullable String error) {
    this.error = error;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PredictionResponseData predictionResponseData = (PredictionResponseData) o;
    return Objects.equals(this.id, predictionResponseData.id) &&
        Objects.equals(this.model, predictionResponseData.model) &&
        Objects.equals(this.outputs, predictionResponseData.outputs) &&
        Objects.equals(this.urls, predictionResponseData.urls) &&
        Objects.equals(this.hasNsfwContents, predictionResponseData.hasNsfwContents) &&
        Objects.equals(this.status, predictionResponseData.status) &&
        Objects.equals(this.createdAt, predictionResponseData.createdAt) &&
        Objects.equals(this.error, predictionResponseData.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, model, outputs, urls, hasNsfwContents, status, createdAt, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PredictionResponseData {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
    sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
    sb.append("    hasNsfwContents: ").append(toIndentedString(hasNsfwContents)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("model");
    openapiFields.add("outputs");
    openapiFields.add("urls");
    openapiFields.add("has_nsfw_contents");
    openapiFields.add("status");
    openapiFields.add("created_at");
    openapiFields.add("error");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PredictionResponseData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PredictionResponseData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PredictionResponseData is not found in the empty JSON string", PredictionResponseData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PredictionResponseData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PredictionResponseData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("model") != null && !jsonObj.get("model").isJsonNull()) && !jsonObj.get("model").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `model` to be a primitive type in the JSON string but got `%s`", jsonObj.get("model").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("outputs") != null && !jsonObj.get("outputs").isJsonNull() && !jsonObj.get("outputs").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `outputs` to be an array in the JSON string but got `%s`", jsonObj.get("outputs").toString()));
      }
      // validate the optional field `urls`
      if (jsonObj.get("urls") != null && !jsonObj.get("urls").isJsonNull()) {
        PredictionResponseDataUrls.validateJsonElement(jsonObj.get("urls"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("has_nsfw_contents") != null && !jsonObj.get("has_nsfw_contents").isJsonNull() && !jsonObj.get("has_nsfw_contents").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `has_nsfw_contents` to be an array in the JSON string but got `%s`", jsonObj.get("has_nsfw_contents").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        StatusEnum.validateJsonElement(jsonObj.get("status"));
      }
      if ((jsonObj.get("error") != null && !jsonObj.get("error").isJsonNull()) && !jsonObj.get("error").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `error` to be a primitive type in the JSON string but got `%s`", jsonObj.get("error").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PredictionResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PredictionResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PredictionResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PredictionResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<PredictionResponseData>() {
           @Override
           public void write(JsonWriter out, PredictionResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PredictionResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PredictionResponseData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PredictionResponseData
   * @throws IOException if the JSON string is invalid with respect to PredictionResponseData
   */
  public static PredictionResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PredictionResponseData.class);
  }

  /**
   * Convert an instance of PredictionResponseData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

