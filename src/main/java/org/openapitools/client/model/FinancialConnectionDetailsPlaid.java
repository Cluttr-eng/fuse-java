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
 * Data needed to query data from Plaid
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-10T13:25:52.697721Z[UTC]")
public class FinancialConnectionDetailsPlaid {
  public static final String SERIALIZED_NAME_ACCESS_TOKEN = "access_token";
  @SerializedName(SERIALIZED_NAME_ACCESS_TOKEN)
  private String accessToken;

  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private String itemId;

  public FinancialConnectionDetailsPlaid() {
  }

  public FinancialConnectionDetailsPlaid accessToken(String accessToken) {
    
    this.accessToken = accessToken;
    return this;
  }

   /**
   * Access token for Plaid
   * @return accessToken
  **/
  @javax.annotation.Nonnull
  public String getAccessToken() {
    return accessToken;
  }


  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }


  public FinancialConnectionDetailsPlaid itemId(String itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * ID of the item associated with the access token in Plaid
   * @return itemId
  **/
  @javax.annotation.Nonnull
  public String getItemId() {
    return itemId;
  }


  public void setItemId(String itemId) {
    this.itemId = itemId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FinancialConnectionDetailsPlaid financialConnectionDetailsPlaid = (FinancialConnectionDetailsPlaid) o;
    return Objects.equals(this.accessToken, financialConnectionDetailsPlaid.accessToken) &&
        Objects.equals(this.itemId, financialConnectionDetailsPlaid.itemId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, itemId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FinancialConnectionDetailsPlaid {\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
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
    openapiFields.add("item_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("access_token");
    openapiRequiredFields.add("item_id");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to FinancialConnectionDetailsPlaid
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FinancialConnectionDetailsPlaid.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FinancialConnectionDetailsPlaid is not found in the empty JSON string", FinancialConnectionDetailsPlaid.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FinancialConnectionDetailsPlaid.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FinancialConnectionDetailsPlaid` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FinancialConnectionDetailsPlaid.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("access_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `access_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("access_token").toString()));
      }
      if (!jsonObj.get("item_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `item_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("item_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FinancialConnectionDetailsPlaid.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FinancialConnectionDetailsPlaid' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FinancialConnectionDetailsPlaid> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FinancialConnectionDetailsPlaid.class));

       return (TypeAdapter<T>) new TypeAdapter<FinancialConnectionDetailsPlaid>() {
           @Override
           public void write(JsonWriter out, FinancialConnectionDetailsPlaid value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FinancialConnectionDetailsPlaid read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FinancialConnectionDetailsPlaid given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FinancialConnectionDetailsPlaid
  * @throws IOException if the JSON string is invalid with respect to FinancialConnectionDetailsPlaid
  */
  public static FinancialConnectionDetailsPlaid fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FinancialConnectionDetailsPlaid.class);
  }

 /**
  * Convert an instance of FinancialConnectionDetailsPlaid to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

