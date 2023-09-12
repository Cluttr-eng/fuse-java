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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.fuse.client.JSON;

/**
 * GetFinancialConnectionsBalanceRequestOptions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-12T14:48:18.188409Z[UTC]")
public class GetFinancialConnectionsBalanceRequestOptions {
  public static final String SERIALIZED_NAME_REMOTE_ACCOUNT_IDS = "remote_account_ids";
  @SerializedName(SERIALIZED_NAME_REMOTE_ACCOUNT_IDS)
  private List<String> remoteAccountIds;

  public GetFinancialConnectionsBalanceRequestOptions() {
  }

  public GetFinancialConnectionsBalanceRequestOptions remoteAccountIds(List<String> remoteAccountIds) {
    
    this.remoteAccountIds = remoteAccountIds;
    return this;
  }

  public GetFinancialConnectionsBalanceRequestOptions addRemoteAccountIdsItem(String remoteAccountIdsItem) {
    if (this.remoteAccountIds == null) {
      this.remoteAccountIds = new ArrayList<>();
    }
    this.remoteAccountIds.add(remoteAccountIdsItem);
    return this;
  }

   /**
   * An array of remote account ids to retrieve balances for.
   * @return remoteAccountIds
  **/
  @javax.annotation.Nullable
  public List<String> getRemoteAccountIds() {
    return remoteAccountIds;
  }


  public void setRemoteAccountIds(List<String> remoteAccountIds) {
    this.remoteAccountIds = remoteAccountIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetFinancialConnectionsBalanceRequestOptions getFinancialConnectionsBalanceRequestOptions = (GetFinancialConnectionsBalanceRequestOptions) o;
    return Objects.equals(this.remoteAccountIds, getFinancialConnectionsBalanceRequestOptions.remoteAccountIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(remoteAccountIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFinancialConnectionsBalanceRequestOptions {\n");
    sb.append("    remoteAccountIds: ").append(toIndentedString(remoteAccountIds)).append("\n");
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
    openapiFields.add("remote_account_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GetFinancialConnectionsBalanceRequestOptions
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetFinancialConnectionsBalanceRequestOptions.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetFinancialConnectionsBalanceRequestOptions is not found in the empty JSON string", GetFinancialConnectionsBalanceRequestOptions.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetFinancialConnectionsBalanceRequestOptions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetFinancialConnectionsBalanceRequestOptions` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("remote_account_ids") != null && !jsonObj.get("remote_account_ids").isJsonNull() && !jsonObj.get("remote_account_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `remote_account_ids` to be an array in the JSON string but got `%s`", jsonObj.get("remote_account_ids").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetFinancialConnectionsBalanceRequestOptions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetFinancialConnectionsBalanceRequestOptions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetFinancialConnectionsBalanceRequestOptions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetFinancialConnectionsBalanceRequestOptions.class));

       return (TypeAdapter<T>) new TypeAdapter<GetFinancialConnectionsBalanceRequestOptions>() {
           @Override
           public void write(JsonWriter out, GetFinancialConnectionsBalanceRequestOptions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetFinancialConnectionsBalanceRequestOptions read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetFinancialConnectionsBalanceRequestOptions given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetFinancialConnectionsBalanceRequestOptions
  * @throws IOException if the JSON string is invalid with respect to GetFinancialConnectionsBalanceRequestOptions
  */
  public static GetFinancialConnectionsBalanceRequestOptions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetFinancialConnectionsBalanceRequestOptions.class);
  }

 /**
  * Convert an instance of GetFinancialConnectionsBalanceRequestOptions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
