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


package org.fuse.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import org.fuse.client.model.ConsumerRiskReportTimeFrame;

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

import org.fuse.client.JSON;

/**
 * CreateConsumerRiskReportCustomizationRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-12T15:13:43.182056Z[UTC]")
public class CreateConsumerRiskReportCustomizationRequest {
  public static final String SERIALIZED_NAME_TIMEFRAME = "timeframe";
  @SerializedName(SERIALIZED_NAME_TIMEFRAME)
  private ConsumerRiskReportTimeFrame timeframe;

  public static final String SERIALIZED_NAME_MIN_LIMIT = "min_limit";
  @SerializedName(SERIALIZED_NAME_MIN_LIMIT)
  private BigDecimal minLimit;

  public static final String SERIALIZED_NAME_MAX_LIMIT = "max_limit";
  @SerializedName(SERIALIZED_NAME_MAX_LIMIT)
  private BigDecimal maxLimit;

  public static final String SERIALIZED_NAME_RISK_TOLERANCE = "risk_tolerance";
  @SerializedName(SERIALIZED_NAME_RISK_TOLERANCE)
  private BigDecimal riskTolerance;

  public CreateConsumerRiskReportCustomizationRequest() {
  }

  public CreateConsumerRiskReportCustomizationRequest timeframe(ConsumerRiskReportTimeFrame timeframe) {
    
    this.timeframe = timeframe;
    return this;
  }

   /**
   * Get timeframe
   * @return timeframe
  **/
  @javax.annotation.Nonnull
  public ConsumerRiskReportTimeFrame getTimeframe() {
    return timeframe;
  }


  public void setTimeframe(ConsumerRiskReportTimeFrame timeframe) {
    this.timeframe = timeframe;
  }


  public CreateConsumerRiskReportCustomizationRequest minLimit(BigDecimal minLimit) {
    
    this.minLimit = minLimit;
    return this;
  }

   /**
   * The minimum allowed limit, in cents.
   * minimum: 0
   * @return minLimit
  **/
  @javax.annotation.Nonnull
  public BigDecimal getMinLimit() {
    return minLimit;
  }


  public void setMinLimit(BigDecimal minLimit) {
    this.minLimit = minLimit;
  }


  public CreateConsumerRiskReportCustomizationRequest maxLimit(BigDecimal maxLimit) {
    
    this.maxLimit = maxLimit;
    return this;
  }

   /**
   * The maximum allowed limit, in cents.
   * minimum: 1
   * @return maxLimit
  **/
  @javax.annotation.Nonnull
  public BigDecimal getMaxLimit() {
    return maxLimit;
  }


  public void setMaxLimit(BigDecimal maxLimit) {
    this.maxLimit = maxLimit;
  }


  public CreateConsumerRiskReportCustomizationRequest riskTolerance(BigDecimal riskTolerance) {
    
    this.riskTolerance = riskTolerance;
    return this;
  }

   /**
   * This parameter indicates the risk tolerance associated with spend limits. A high risk tolerance allow for higher limits, increasing both potential gains and losses. A Lower risk tolerance enforces strict limits, reducing the potential for loss but also limiting transaction volume for reliable users.
   * minimum: 1
   * maximum: 100
   * @return riskTolerance
  **/
  @javax.annotation.Nonnull
  public BigDecimal getRiskTolerance() {
    return riskTolerance;
  }


  public void setRiskTolerance(BigDecimal riskTolerance) {
    this.riskTolerance = riskTolerance;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateConsumerRiskReportCustomizationRequest createConsumerRiskReportCustomizationRequest = (CreateConsumerRiskReportCustomizationRequest) o;
    return Objects.equals(this.timeframe, createConsumerRiskReportCustomizationRequest.timeframe) &&
        Objects.equals(this.minLimit, createConsumerRiskReportCustomizationRequest.minLimit) &&
        Objects.equals(this.maxLimit, createConsumerRiskReportCustomizationRequest.maxLimit) &&
        Objects.equals(this.riskTolerance, createConsumerRiskReportCustomizationRequest.riskTolerance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeframe, minLimit, maxLimit, riskTolerance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateConsumerRiskReportCustomizationRequest {\n");
    sb.append("    timeframe: ").append(toIndentedString(timeframe)).append("\n");
    sb.append("    minLimit: ").append(toIndentedString(minLimit)).append("\n");
    sb.append("    maxLimit: ").append(toIndentedString(maxLimit)).append("\n");
    sb.append("    riskTolerance: ").append(toIndentedString(riskTolerance)).append("\n");
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
    openapiFields.add("timeframe");
    openapiFields.add("min_limit");
    openapiFields.add("max_limit");
    openapiFields.add("risk_tolerance");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("timeframe");
    openapiRequiredFields.add("min_limit");
    openapiRequiredFields.add("max_limit");
    openapiRequiredFields.add("risk_tolerance");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateConsumerRiskReportCustomizationRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateConsumerRiskReportCustomizationRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateConsumerRiskReportCustomizationRequest is not found in the empty JSON string", CreateConsumerRiskReportCustomizationRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateConsumerRiskReportCustomizationRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateConsumerRiskReportCustomizationRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateConsumerRiskReportCustomizationRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateConsumerRiskReportCustomizationRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateConsumerRiskReportCustomizationRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateConsumerRiskReportCustomizationRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateConsumerRiskReportCustomizationRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateConsumerRiskReportCustomizationRequest>() {
           @Override
           public void write(JsonWriter out, CreateConsumerRiskReportCustomizationRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateConsumerRiskReportCustomizationRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateConsumerRiskReportCustomizationRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateConsumerRiskReportCustomizationRequest
  * @throws IOException if the JSON string is invalid with respect to CreateConsumerRiskReportCustomizationRequest
  */
  public static CreateConsumerRiskReportCustomizationRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateConsumerRiskReportCustomizationRequest.class);
  }

 /**
  * Convert an instance of CreateConsumerRiskReportCustomizationRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

