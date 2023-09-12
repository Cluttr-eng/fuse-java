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
 * Details of the Plaid connection to migrate into the unified Fuse API.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-12T15:13:43.182056Z[UTC]")
public class MigrateFinancialConnectionsAggregatorConnectionDataPlaid {
  public static final String SERIALIZED_NAME_ACCESS_TOKEN = "access_token";
  @SerializedName(SERIALIZED_NAME_ACCESS_TOKEN)
  private String accessToken;

  public static final String SERIALIZED_NAME_USE_ITEM_WEBHOOK = "use_item_webhook";
  @SerializedName(SERIALIZED_NAME_USE_ITEM_WEBHOOK)
  private Boolean useItemWebhook;

  public MigrateFinancialConnectionsAggregatorConnectionDataPlaid() {
  }

  public MigrateFinancialConnectionsAggregatorConnectionDataPlaid accessToken(String accessToken) {
    
    this.accessToken = accessToken;
    return this;
  }

   /**
   * The Plaid access token associated with the user&#39;s financial accounts.
   * @return accessToken
  **/
  @javax.annotation.Nonnull
  public String getAccessToken() {
    return accessToken;
  }


  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }


  public MigrateFinancialConnectionsAggregatorConnectionDataPlaid useItemWebhook(Boolean useItemWebhook) {
    
    this.useItemWebhook = useItemWebhook;
    return this;
  }

   /**
   * If true, any webhooks received for this new financial connection will be sent to the webhook url used when the item was created. If false, the webhook url set at the organization sandbox/production environment level will be used instead.
   * @return useItemWebhook
  **/
  @javax.annotation.Nullable
  public Boolean getUseItemWebhook() {
    return useItemWebhook;
  }


  public void setUseItemWebhook(Boolean useItemWebhook) {
    this.useItemWebhook = useItemWebhook;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MigrateFinancialConnectionsAggregatorConnectionDataPlaid migrateFinancialConnectionsAggregatorConnectionDataPlaid = (MigrateFinancialConnectionsAggregatorConnectionDataPlaid) o;
    return Objects.equals(this.accessToken, migrateFinancialConnectionsAggregatorConnectionDataPlaid.accessToken) &&
        Objects.equals(this.useItemWebhook, migrateFinancialConnectionsAggregatorConnectionDataPlaid.useItemWebhook);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, useItemWebhook);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MigrateFinancialConnectionsAggregatorConnectionDataPlaid {\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    useItemWebhook: ").append(toIndentedString(useItemWebhook)).append("\n");
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
    openapiFields.add("access_token");
    openapiFields.add("use_item_webhook");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("access_token");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to MigrateFinancialConnectionsAggregatorConnectionDataPlaid
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MigrateFinancialConnectionsAggregatorConnectionDataPlaid.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MigrateFinancialConnectionsAggregatorConnectionDataPlaid is not found in the empty JSON string", MigrateFinancialConnectionsAggregatorConnectionDataPlaid.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!MigrateFinancialConnectionsAggregatorConnectionDataPlaid.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MigrateFinancialConnectionsAggregatorConnectionDataPlaid` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MigrateFinancialConnectionsAggregatorConnectionDataPlaid.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("access_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `access_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("access_token").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MigrateFinancialConnectionsAggregatorConnectionDataPlaid.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MigrateFinancialConnectionsAggregatorConnectionDataPlaid' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MigrateFinancialConnectionsAggregatorConnectionDataPlaid> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MigrateFinancialConnectionsAggregatorConnectionDataPlaid.class));

       return (TypeAdapter<T>) new TypeAdapter<MigrateFinancialConnectionsAggregatorConnectionDataPlaid>() {
           @Override
           public void write(JsonWriter out, MigrateFinancialConnectionsAggregatorConnectionDataPlaid value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MigrateFinancialConnectionsAggregatorConnectionDataPlaid read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MigrateFinancialConnectionsAggregatorConnectionDataPlaid given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MigrateFinancialConnectionsAggregatorConnectionDataPlaid
  * @throws IOException if the JSON string is invalid with respect to MigrateFinancialConnectionsAggregatorConnectionDataPlaid
  */
  public static MigrateFinancialConnectionsAggregatorConnectionDataPlaid fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MigrateFinancialConnectionsAggregatorConnectionDataPlaid.class);
  }

 /**
  * Convert an instance of MigrateFinancialConnectionsAggregatorConnectionDataPlaid to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

