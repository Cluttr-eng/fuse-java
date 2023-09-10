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
import org.openapitools.client.model.ConsumerRiskReportTimeFrame;

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
 * ConsumerRiskReportCustomization
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-10T13:25:52.697721Z[UTC]")
public class ConsumerRiskReportCustomization {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TIMEFRAME = "timeframe";
  @SerializedName(SERIALIZED_NAME_TIMEFRAME)
  private ConsumerRiskReportTimeFrame timeframe;

  public static final String SERIALIZED_NAME_MIN_LIMIT = "min_limit";
  @SerializedName(SERIALIZED_NAME_MIN_LIMIT)
  private Integer minLimit;

  public static final String SERIALIZED_NAME_MAX_LIMIT = "max_limit";
  @SerializedName(SERIALIZED_NAME_MAX_LIMIT)
  private Integer maxLimit;

  public static final String SERIALIZED_NAME_RISK_TOLERANCE = "risk_tolerance";
  @SerializedName(SERIALIZED_NAME_RISK_TOLERANCE)
  private Integer riskTolerance;

  public ConsumerRiskReportCustomization() {
  }

  public ConsumerRiskReportCustomization id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ConsumerRiskReportCustomization timeframe(ConsumerRiskReportTimeFrame timeframe) {
    
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


  public ConsumerRiskReportCustomization minLimit(Integer minLimit) {
    
    this.minLimit = minLimit;
    return this;
  }

   /**
   * The minimum allowed limit, in cents.
   * minimum: 0
   * @return minLimit
  **/
  @javax.annotation.Nonnull
  public Integer getMinLimit() {
    return minLimit;
  }


  public void setMinLimit(Integer minLimit) {
    this.minLimit = minLimit;
  }


  public ConsumerRiskReportCustomization maxLimit(Integer maxLimit) {
    
    this.maxLimit = maxLimit;
    return this;
  }

   /**
   * The maximum allowed limit, in cents.
   * minimum: 1
   * @return maxLimit
  **/
  @javax.annotation.Nonnull
  public Integer getMaxLimit() {
    return maxLimit;
  }


  public void setMaxLimit(Integer maxLimit) {
    this.maxLimit = maxLimit;
  }


  public ConsumerRiskReportCustomization riskTolerance(Integer riskTolerance) {
    
    this.riskTolerance = riskTolerance;
    return this;
  }

   /**
   * This parameter indicates the risk tolerance associated with spend limits. A high risk tolerance allow for higher limits, increasing both potential gains and losses. A Lower risk tolerance enforces strict limits, reducing the potential for loss but also limiting transaction volume for reliable users.
   * minimum: 1
   * maximum: 100
   * @return riskTolerance
  **/
  @javax.annotation.Nullable
  public Integer getRiskTolerance() {
    return riskTolerance;
  }


  public void setRiskTolerance(Integer riskTolerance) {
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
    ConsumerRiskReportCustomization consumerRiskReportCustomization = (ConsumerRiskReportCustomization) o;
    return Objects.equals(this.id, consumerRiskReportCustomization.id) &&
        Objects.equals(this.timeframe, consumerRiskReportCustomization.timeframe) &&
        Objects.equals(this.minLimit, consumerRiskReportCustomization.minLimit) &&
        Objects.equals(this.maxLimit, consumerRiskReportCustomization.maxLimit) &&
        Objects.equals(this.riskTolerance, consumerRiskReportCustomization.riskTolerance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, timeframe, minLimit, maxLimit, riskTolerance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsumerRiskReportCustomization {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("timeframe");
    openapiFields.add("min_limit");
    openapiFields.add("max_limit");
    openapiFields.add("risk_tolerance");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("timeframe");
    openapiRequiredFields.add("min_limit");
    openapiRequiredFields.add("max_limit");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ConsumerRiskReportCustomization
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ConsumerRiskReportCustomization.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConsumerRiskReportCustomization is not found in the empty JSON string", ConsumerRiskReportCustomization.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ConsumerRiskReportCustomization.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ConsumerRiskReportCustomization` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ConsumerRiskReportCustomization.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConsumerRiskReportCustomization.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConsumerRiskReportCustomization' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConsumerRiskReportCustomization> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConsumerRiskReportCustomization.class));

       return (TypeAdapter<T>) new TypeAdapter<ConsumerRiskReportCustomization>() {
           @Override
           public void write(JsonWriter out, ConsumerRiskReportCustomization value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ConsumerRiskReportCustomization read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ConsumerRiskReportCustomization given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ConsumerRiskReportCustomization
  * @throws IOException if the JSON string is invalid with respect to ConsumerRiskReportCustomization
  */
  public static ConsumerRiskReportCustomization fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConsumerRiskReportCustomization.class);
  }

 /**
  * Convert an instance of ConsumerRiskReportCustomization to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

