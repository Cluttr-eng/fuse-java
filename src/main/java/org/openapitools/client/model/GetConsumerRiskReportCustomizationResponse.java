/*
 * Fuse
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import org.openapitools.client.model.ConsumerRiskReportCustomization;

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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * GetConsumerRiskReportCustomizationResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-10T13:19:07.464573Z[UTC]")
public class GetConsumerRiskReportCustomizationResponse {
  public static final String SERIALIZED_NAME_CONSUMER_RISK_REPORT_CUSTOMIZATION = "consumer_risk_report_customization";
  @SerializedName(SERIALIZED_NAME_CONSUMER_RISK_REPORT_CUSTOMIZATION)
  private ConsumerRiskReportCustomization consumerRiskReportCustomization;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;

  public GetConsumerRiskReportCustomizationResponse() {
  }

  public GetConsumerRiskReportCustomizationResponse consumerRiskReportCustomization(ConsumerRiskReportCustomization consumerRiskReportCustomization) {
    
    this.consumerRiskReportCustomization = consumerRiskReportCustomization;
    return this;
  }

   /**
   * Get consumerRiskReportCustomization
   * @return consumerRiskReportCustomization
  **/
  @javax.annotation.Nonnull
  public ConsumerRiskReportCustomization getConsumerRiskReportCustomization() {
    return consumerRiskReportCustomization;
  }


  public void setConsumerRiskReportCustomization(ConsumerRiskReportCustomization consumerRiskReportCustomization) {
    this.consumerRiskReportCustomization = consumerRiskReportCustomization;
  }


  public GetConsumerRiskReportCustomizationResponse requestId(String requestId) {
    
    this.requestId = requestId;
    return this;
  }

   /**
   * An identifier that is exclusive to the request and can serve as a means for investigating and resolving issues.
   * @return requestId
  **/
  @javax.annotation.Nonnull
  public String getRequestId() {
    return requestId;
  }


  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetConsumerRiskReportCustomizationResponse getConsumerRiskReportCustomizationResponse = (GetConsumerRiskReportCustomizationResponse) o;
    return Objects.equals(this.consumerRiskReportCustomization, getConsumerRiskReportCustomizationResponse.consumerRiskReportCustomization) &&
        Objects.equals(this.requestId, getConsumerRiskReportCustomizationResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consumerRiskReportCustomization, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetConsumerRiskReportCustomizationResponse {\n");
    sb.append("    consumerRiskReportCustomization: ").append(toIndentedString(consumerRiskReportCustomization)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
    openapiFields.add("consumer_risk_report_customization");
    openapiFields.add("request_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("consumer_risk_report_customization");
    openapiRequiredFields.add("request_id");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GetConsumerRiskReportCustomizationResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetConsumerRiskReportCustomizationResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetConsumerRiskReportCustomizationResponse is not found in the empty JSON string", GetConsumerRiskReportCustomizationResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetConsumerRiskReportCustomizationResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetConsumerRiskReportCustomizationResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetConsumerRiskReportCustomizationResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `consumer_risk_report_customization`
      ConsumerRiskReportCustomization.validateJsonElement(jsonObj.get("consumer_risk_report_customization"));
      if (!jsonObj.get("request_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `request_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("request_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetConsumerRiskReportCustomizationResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetConsumerRiskReportCustomizationResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetConsumerRiskReportCustomizationResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetConsumerRiskReportCustomizationResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<GetConsumerRiskReportCustomizationResponse>() {
           @Override
           public void write(JsonWriter out, GetConsumerRiskReportCustomizationResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetConsumerRiskReportCustomizationResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetConsumerRiskReportCustomizationResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetConsumerRiskReportCustomizationResponse
  * @throws IOException if the JSON string is invalid with respect to GetConsumerRiskReportCustomizationResponse
  */
  public static GetConsumerRiskReportCustomizationResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetConsumerRiskReportCustomizationResponse.class);
  }

 /**
  * Convert an instance of GetConsumerRiskReportCustomizationResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

