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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.fuse.client.model.ConsumerRiskReportTimeFrame;
import org.fuse.client.model.EvalConsumerRiskReportRequestEventsInner;

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
 * EvalConsumerRiskReportRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-12T15:13:43.182056Z[UTC]")
public class EvalConsumerRiskReportRequest {
  public static final String SERIALIZED_NAME_WINDOW_SIZE = "window_size";
  @SerializedName(SERIALIZED_NAME_WINDOW_SIZE)
  private BigDecimal windowSize;

  public static final String SERIALIZED_NAME_TIME_FRAME = "time_frame";
  @SerializedName(SERIALIZED_NAME_TIME_FRAME)
  private ConsumerRiskReportTimeFrame timeFrame;

  public static final String SERIALIZED_NAME_EVENTS = "events";
  @SerializedName(SERIALIZED_NAME_EVENTS)
  private List<EvalConsumerRiskReportRequestEventsInner> events = new ArrayList<>();

  public EvalConsumerRiskReportRequest() {
  }

  public EvalConsumerRiskReportRequest windowSize(BigDecimal windowSize) {
    
    this.windowSize = windowSize;
    return this;
  }

   /**
   * The size of the window for training
   * @return windowSize
  **/
  @javax.annotation.Nonnull
  public BigDecimal getWindowSize() {
    return windowSize;
  }


  public void setWindowSize(BigDecimal windowSize) {
    this.windowSize = windowSize;
  }


  public EvalConsumerRiskReportRequest timeFrame(ConsumerRiskReportTimeFrame timeFrame) {
    
    this.timeFrame = timeFrame;
    return this;
  }

   /**
   * Get timeFrame
   * @return timeFrame
  **/
  @javax.annotation.Nonnull
  public ConsumerRiskReportTimeFrame getTimeFrame() {
    return timeFrame;
  }


  public void setTimeFrame(ConsumerRiskReportTimeFrame timeFrame) {
    this.timeFrame = timeFrame;
  }


  public EvalConsumerRiskReportRequest events(List<EvalConsumerRiskReportRequestEventsInner> events) {
    
    this.events = events;
    return this;
  }

  public EvalConsumerRiskReportRequest addEventsItem(EvalConsumerRiskReportRequestEventsInner eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<>();
    }
    this.events.add(eventsItem);
    return this;
  }

   /**
   * Get events
   * @return events
  **/
  @javax.annotation.Nonnull
  public List<EvalConsumerRiskReportRequestEventsInner> getEvents() {
    return events;
  }


  public void setEvents(List<EvalConsumerRiskReportRequestEventsInner> events) {
    this.events = events;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvalConsumerRiskReportRequest evalConsumerRiskReportRequest = (EvalConsumerRiskReportRequest) o;
    return Objects.equals(this.windowSize, evalConsumerRiskReportRequest.windowSize) &&
        Objects.equals(this.timeFrame, evalConsumerRiskReportRequest.timeFrame) &&
        Objects.equals(this.events, evalConsumerRiskReportRequest.events);
  }

  @Override
  public int hashCode() {
    return Objects.hash(windowSize, timeFrame, events);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvalConsumerRiskReportRequest {\n");
    sb.append("    windowSize: ").append(toIndentedString(windowSize)).append("\n");
    sb.append("    timeFrame: ").append(toIndentedString(timeFrame)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
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
    openapiFields.add("window_size");
    openapiFields.add("time_frame");
    openapiFields.add("events");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("window_size");
    openapiRequiredFields.add("time_frame");
    openapiRequiredFields.add("events");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EvalConsumerRiskReportRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EvalConsumerRiskReportRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EvalConsumerRiskReportRequest is not found in the empty JSON string", EvalConsumerRiskReportRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!EvalConsumerRiskReportRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EvalConsumerRiskReportRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EvalConsumerRiskReportRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("events").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `events` to be an array in the JSON string but got `%s`", jsonObj.get("events").toString()));
      }

      JsonArray jsonArrayevents = jsonObj.getAsJsonArray("events");
      // validate the required field `events` (array)
      for (int i = 0; i < jsonArrayevents.size(); i++) {
        EvalConsumerRiskReportRequestEventsInner.validateJsonElement(jsonArrayevents.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EvalConsumerRiskReportRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EvalConsumerRiskReportRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EvalConsumerRiskReportRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EvalConsumerRiskReportRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<EvalConsumerRiskReportRequest>() {
           @Override
           public void write(JsonWriter out, EvalConsumerRiskReportRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EvalConsumerRiskReportRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EvalConsumerRiskReportRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EvalConsumerRiskReportRequest
  * @throws IOException if the JSON string is invalid with respect to EvalConsumerRiskReportRequest
  */
  public static EvalConsumerRiskReportRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EvalConsumerRiskReportRequest.class);
  }

 /**
  * Convert an instance of EvalConsumerRiskReportRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

