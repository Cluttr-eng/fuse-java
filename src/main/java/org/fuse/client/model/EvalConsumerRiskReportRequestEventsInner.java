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
import java.util.Arrays;
import org.fuse.client.model.AddAccountEventsRequestEventsInner;

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
 * EvalConsumerRiskReportRequestEventsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-12T14:48:18.188409Z[UTC]")
public class EvalConsumerRiskReportRequestEventsInner {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_EVENT = "event";
  @SerializedName(SERIALIZED_NAME_EVENT)
  private AddAccountEventsRequestEventsInner event;

  public EvalConsumerRiskReportRequestEventsInner() {
  }

  public EvalConsumerRiskReportRequestEventsInner accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * The id of the account that event belongs to
   * @return accountId
  **/
  @javax.annotation.Nonnull
  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public EvalConsumerRiskReportRequestEventsInner event(AddAccountEventsRequestEventsInner event) {
    
    this.event = event;
    return this;
  }

   /**
   * Get event
   * @return event
  **/
  @javax.annotation.Nonnull
  public AddAccountEventsRequestEventsInner getEvent() {
    return event;
  }


  public void setEvent(AddAccountEventsRequestEventsInner event) {
    this.event = event;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvalConsumerRiskReportRequestEventsInner evalConsumerRiskReportRequestEventsInner = (EvalConsumerRiskReportRequestEventsInner) o;
    return Objects.equals(this.accountId, evalConsumerRiskReportRequestEventsInner.accountId) &&
        Objects.equals(this.event, evalConsumerRiskReportRequestEventsInner.event);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, event);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvalConsumerRiskReportRequestEventsInner {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
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
    openapiFields.add("account_id");
    openapiFields.add("event");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("account_id");
    openapiRequiredFields.add("event");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EvalConsumerRiskReportRequestEventsInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EvalConsumerRiskReportRequestEventsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EvalConsumerRiskReportRequestEventsInner is not found in the empty JSON string", EvalConsumerRiskReportRequestEventsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!EvalConsumerRiskReportRequestEventsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EvalConsumerRiskReportRequestEventsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EvalConsumerRiskReportRequestEventsInner.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("account_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_id").toString()));
      }
      // validate the required field `event`
      AddAccountEventsRequestEventsInner.validateJsonElement(jsonObj.get("event"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EvalConsumerRiskReportRequestEventsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EvalConsumerRiskReportRequestEventsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EvalConsumerRiskReportRequestEventsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EvalConsumerRiskReportRequestEventsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<EvalConsumerRiskReportRequestEventsInner>() {
           @Override
           public void write(JsonWriter out, EvalConsumerRiskReportRequestEventsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EvalConsumerRiskReportRequestEventsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EvalConsumerRiskReportRequestEventsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EvalConsumerRiskReportRequestEventsInner
  * @throws IOException if the JSON string is invalid with respect to EvalConsumerRiskReportRequestEventsInner
  */
  public static EvalConsumerRiskReportRequestEventsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EvalConsumerRiskReportRequestEventsInner.class);
  }

 /**
  * Convert an instance of EvalConsumerRiskReportRequestEventsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
