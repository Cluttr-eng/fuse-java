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
import org.openapitools.client.model.MigrateFinancialConnectionsAggregatorConnectionData;

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
 * MigrateFinancialConnectionsTokenResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-10T13:19:07.464573Z[UTC]")
public class MigrateFinancialConnectionsTokenResponse {
  public static final String SERIALIZED_NAME_CONNECTION_DATA = "connection_data";
  @SerializedName(SERIALIZED_NAME_CONNECTION_DATA)
  private MigrateFinancialConnectionsAggregatorConnectionData connectionData;

  public static final String SERIALIZED_NAME_FUSE_ACCESS_TOKEN = "fuse_access_token";
  @SerializedName(SERIALIZED_NAME_FUSE_ACCESS_TOKEN)
  private String fuseAccessToken;

  public static final String SERIALIZED_NAME_FUSE_FINANCIAL_CONNECTION_ID = "fuse_financial_connection_id";
  @SerializedName(SERIALIZED_NAME_FUSE_FINANCIAL_CONNECTION_ID)
  private String fuseFinancialConnectionId;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;

  public MigrateFinancialConnectionsTokenResponse() {
  }

  public MigrateFinancialConnectionsTokenResponse connectionData(MigrateFinancialConnectionsAggregatorConnectionData connectionData) {
    
    this.connectionData = connectionData;
    return this;
  }

   /**
   * Get connectionData
   * @return connectionData
  **/
  @javax.annotation.Nonnull
  public MigrateFinancialConnectionsAggregatorConnectionData getConnectionData() {
    return connectionData;
  }


  public void setConnectionData(MigrateFinancialConnectionsAggregatorConnectionData connectionData) {
    this.connectionData = connectionData;
  }


  public MigrateFinancialConnectionsTokenResponse fuseAccessToken(String fuseAccessToken) {
    
    this.fuseAccessToken = fuseAccessToken;
    return this;
  }

   /**
   * Fuse access token for the fuse connection
   * @return fuseAccessToken
  **/
  @javax.annotation.Nonnull
  public String getFuseAccessToken() {
    return fuseAccessToken;
  }


  public void setFuseAccessToken(String fuseAccessToken) {
    this.fuseAccessToken = fuseAccessToken;
  }


  public MigrateFinancialConnectionsTokenResponse fuseFinancialConnectionId(String fuseFinancialConnectionId) {
    
    this.fuseFinancialConnectionId = fuseFinancialConnectionId;
    return this;
  }

   /**
   * Financial connection id for the fuse connection
   * @return fuseFinancialConnectionId
  **/
  @javax.annotation.Nonnull
  public String getFuseFinancialConnectionId() {
    return fuseFinancialConnectionId;
  }


  public void setFuseFinancialConnectionId(String fuseFinancialConnectionId) {
    this.fuseFinancialConnectionId = fuseFinancialConnectionId;
  }


  public MigrateFinancialConnectionsTokenResponse requestId(String requestId) {
    
    this.requestId = requestId;
    return this;
  }

   /**
   * An identifier that is exclusive to the request and can serve as a means for investigating and resolving issues.
   * @return requestId
  **/
  @javax.annotation.Nullable
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
    MigrateFinancialConnectionsTokenResponse migrateFinancialConnectionsTokenResponse = (MigrateFinancialConnectionsTokenResponse) o;
    return Objects.equals(this.connectionData, migrateFinancialConnectionsTokenResponse.connectionData) &&
        Objects.equals(this.fuseAccessToken, migrateFinancialConnectionsTokenResponse.fuseAccessToken) &&
        Objects.equals(this.fuseFinancialConnectionId, migrateFinancialConnectionsTokenResponse.fuseFinancialConnectionId) &&
        Objects.equals(this.requestId, migrateFinancialConnectionsTokenResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectionData, fuseAccessToken, fuseFinancialConnectionId, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MigrateFinancialConnectionsTokenResponse {\n");
    sb.append("    connectionData: ").append(toIndentedString(connectionData)).append("\n");
    sb.append("    fuseAccessToken: ").append(toIndentedString(fuseAccessToken)).append("\n");
    sb.append("    fuseFinancialConnectionId: ").append(toIndentedString(fuseFinancialConnectionId)).append("\n");
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
    openapiFields.add("connection_data");
    openapiFields.add("fuse_access_token");
    openapiFields.add("fuse_financial_connection_id");
    openapiFields.add("request_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("connection_data");
    openapiRequiredFields.add("fuse_access_token");
    openapiRequiredFields.add("fuse_financial_connection_id");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to MigrateFinancialConnectionsTokenResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MigrateFinancialConnectionsTokenResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MigrateFinancialConnectionsTokenResponse is not found in the empty JSON string", MigrateFinancialConnectionsTokenResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!MigrateFinancialConnectionsTokenResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MigrateFinancialConnectionsTokenResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MigrateFinancialConnectionsTokenResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `connection_data`
      MigrateFinancialConnectionsAggregatorConnectionData.validateJsonElement(jsonObj.get("connection_data"));
      if (!jsonObj.get("fuse_access_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fuse_access_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fuse_access_token").toString()));
      }
      if (!jsonObj.get("fuse_financial_connection_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fuse_financial_connection_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fuse_financial_connection_id").toString()));
      }
      if ((jsonObj.get("request_id") != null && !jsonObj.get("request_id").isJsonNull()) && !jsonObj.get("request_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `request_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("request_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MigrateFinancialConnectionsTokenResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MigrateFinancialConnectionsTokenResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MigrateFinancialConnectionsTokenResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MigrateFinancialConnectionsTokenResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<MigrateFinancialConnectionsTokenResponse>() {
           @Override
           public void write(JsonWriter out, MigrateFinancialConnectionsTokenResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MigrateFinancialConnectionsTokenResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MigrateFinancialConnectionsTokenResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MigrateFinancialConnectionsTokenResponse
  * @throws IOException if the JSON string is invalid with respect to MigrateFinancialConnectionsTokenResponse
  */
  public static MigrateFinancialConnectionsTokenResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MigrateFinancialConnectionsTokenResponse.class);
  }

 /**
  * Convert an instance of MigrateFinancialConnectionsTokenResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

