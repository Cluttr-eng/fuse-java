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
import org.fuse.client.model.Aggregator;
import org.fuse.client.model.FinancialInstitution;

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
 * ExchangeFinancialConnectionsPublicTokenResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-12T15:13:43.182056Z[UTC]")
public class ExchangeFinancialConnectionsPublicTokenResponse {
  public static final String SERIALIZED_NAME_ACCESS_TOKEN = "access_token";
  @SerializedName(SERIALIZED_NAME_ACCESS_TOKEN)
  private String accessToken;

  public static final String SERIALIZED_NAME_FINANCIAL_CONNECTION_ID = "financial_connection_id";
  @SerializedName(SERIALIZED_NAME_FINANCIAL_CONNECTION_ID)
  private String financialConnectionId;

  public static final String SERIALIZED_NAME_INSTITUTION = "institution";
  @SerializedName(SERIALIZED_NAME_INSTITUTION)
  private FinancialInstitution institution;

  public static final String SERIALIZED_NAME_AGGREGATOR = "aggregator";
  @SerializedName(SERIALIZED_NAME_AGGREGATOR)
  private Aggregator aggregator;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;

  public ExchangeFinancialConnectionsPublicTokenResponse() {
  }

  public ExchangeFinancialConnectionsPublicTokenResponse accessToken(String accessToken) {
    
    this.accessToken = accessToken;
    return this;
  }

   /**
   * Token used for querying data on the user, ie account details, balances etc. This does NOT expire and should be stored securely.
   * @return accessToken
  **/
  @javax.annotation.Nonnull
  public String getAccessToken() {
    return accessToken;
  }


  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }


  public ExchangeFinancialConnectionsPublicTokenResponse financialConnectionId(String financialConnectionId) {
    
    this.financialConnectionId = financialConnectionId;
    return this;
  }

   /**
   * The id of the new financial connection. Every webhook will be sent with this id. Use this id when calling the GET /financial_connection/${financial_connection_id} endpoint. 
   * @return financialConnectionId
  **/
  @javax.annotation.Nonnull
  public String getFinancialConnectionId() {
    return financialConnectionId;
  }


  public void setFinancialConnectionId(String financialConnectionId) {
    this.financialConnectionId = financialConnectionId;
  }


  public ExchangeFinancialConnectionsPublicTokenResponse institution(FinancialInstitution institution) {
    
    this.institution = institution;
    return this;
  }

   /**
   * Get institution
   * @return institution
  **/
  @javax.annotation.Nullable
  public FinancialInstitution getInstitution() {
    return institution;
  }


  public void setInstitution(FinancialInstitution institution) {
    this.institution = institution;
  }


  public ExchangeFinancialConnectionsPublicTokenResponse aggregator(Aggregator aggregator) {
    
    this.aggregator = aggregator;
    return this;
  }

   /**
   * Get aggregator
   * @return aggregator
  **/
  @javax.annotation.Nonnull
  public Aggregator getAggregator() {
    return aggregator;
  }


  public void setAggregator(Aggregator aggregator) {
    this.aggregator = aggregator;
  }


  public ExchangeFinancialConnectionsPublicTokenResponse requestId(String requestId) {
    
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
    ExchangeFinancialConnectionsPublicTokenResponse exchangeFinancialConnectionsPublicTokenResponse = (ExchangeFinancialConnectionsPublicTokenResponse) o;
    return Objects.equals(this.accessToken, exchangeFinancialConnectionsPublicTokenResponse.accessToken) &&
        Objects.equals(this.financialConnectionId, exchangeFinancialConnectionsPublicTokenResponse.financialConnectionId) &&
        Objects.equals(this.institution, exchangeFinancialConnectionsPublicTokenResponse.institution) &&
        Objects.equals(this.aggregator, exchangeFinancialConnectionsPublicTokenResponse.aggregator) &&
        Objects.equals(this.requestId, exchangeFinancialConnectionsPublicTokenResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, financialConnectionId, institution, aggregator, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExchangeFinancialConnectionsPublicTokenResponse {\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    financialConnectionId: ").append(toIndentedString(financialConnectionId)).append("\n");
    sb.append("    institution: ").append(toIndentedString(institution)).append("\n");
    sb.append("    aggregator: ").append(toIndentedString(aggregator)).append("\n");
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
    openapiFields.add("access_token");
    openapiFields.add("financial_connection_id");
    openapiFields.add("institution");
    openapiFields.add("aggregator");
    openapiFields.add("request_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("access_token");
    openapiRequiredFields.add("financial_connection_id");
    openapiRequiredFields.add("aggregator");
    openapiRequiredFields.add("request_id");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ExchangeFinancialConnectionsPublicTokenResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ExchangeFinancialConnectionsPublicTokenResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExchangeFinancialConnectionsPublicTokenResponse is not found in the empty JSON string", ExchangeFinancialConnectionsPublicTokenResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ExchangeFinancialConnectionsPublicTokenResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ExchangeFinancialConnectionsPublicTokenResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ExchangeFinancialConnectionsPublicTokenResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("access_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `access_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("access_token").toString()));
      }
      if (!jsonObj.get("financial_connection_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `financial_connection_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("financial_connection_id").toString()));
      }
      // validate the optional field `institution`
      if (jsonObj.get("institution") != null && !jsonObj.get("institution").isJsonNull()) {
        FinancialInstitution.validateJsonElement(jsonObj.get("institution"));
      }
      if (!jsonObj.get("request_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `request_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("request_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExchangeFinancialConnectionsPublicTokenResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExchangeFinancialConnectionsPublicTokenResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExchangeFinancialConnectionsPublicTokenResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExchangeFinancialConnectionsPublicTokenResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ExchangeFinancialConnectionsPublicTokenResponse>() {
           @Override
           public void write(JsonWriter out, ExchangeFinancialConnectionsPublicTokenResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ExchangeFinancialConnectionsPublicTokenResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ExchangeFinancialConnectionsPublicTokenResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExchangeFinancialConnectionsPublicTokenResponse
  * @throws IOException if the JSON string is invalid with respect to ExchangeFinancialConnectionsPublicTokenResponse
  */
  public static ExchangeFinancialConnectionsPublicTokenResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExchangeFinancialConnectionsPublicTokenResponse.class);
  }

 /**
  * Convert an instance of ExchangeFinancialConnectionsPublicTokenResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

