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
import org.fuse.client.model.FinancialConnectionsAccountLiability;

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
 * GetLiabilitiesResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-12T14:48:18.188409Z[UTC]")
public class GetLiabilitiesResponse {
  public static final String SERIALIZED_NAME_LIABILITIES = "liabilities";
  @SerializedName(SERIALIZED_NAME_LIABILITIES)
  private List<FinancialConnectionsAccountLiability> liabilities;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;

  public GetLiabilitiesResponse() {
  }

  public GetLiabilitiesResponse liabilities(List<FinancialConnectionsAccountLiability> liabilities) {
    
    this.liabilities = liabilities;
    return this;
  }

  public GetLiabilitiesResponse addLiabilitiesItem(FinancialConnectionsAccountLiability liabilitiesItem) {
    if (this.liabilities == null) {
      this.liabilities = new ArrayList<>();
    }
    this.liabilities.add(liabilitiesItem);
    return this;
  }

   /**
   * Get liabilities
   * @return liabilities
  **/
  @javax.annotation.Nullable
  public List<FinancialConnectionsAccountLiability> getLiabilities() {
    return liabilities;
  }


  public void setLiabilities(List<FinancialConnectionsAccountLiability> liabilities) {
    this.liabilities = liabilities;
  }


  public GetLiabilitiesResponse requestId(String requestId) {
    
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
    GetLiabilitiesResponse getLiabilitiesResponse = (GetLiabilitiesResponse) o;
    return Objects.equals(this.liabilities, getLiabilitiesResponse.liabilities) &&
        Objects.equals(this.requestId, getLiabilitiesResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(liabilities, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetLiabilitiesResponse {\n");
    sb.append("    liabilities: ").append(toIndentedString(liabilities)).append("\n");
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
    openapiFields.add("liabilities");
    openapiFields.add("request_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GetLiabilitiesResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetLiabilitiesResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetLiabilitiesResponse is not found in the empty JSON string", GetLiabilitiesResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetLiabilitiesResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetLiabilitiesResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("liabilities") != null && !jsonObj.get("liabilities").isJsonNull()) {
        JsonArray jsonArrayliabilities = jsonObj.getAsJsonArray("liabilities");
        if (jsonArrayliabilities != null) {
          // ensure the json data is an array
          if (!jsonObj.get("liabilities").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `liabilities` to be an array in the JSON string but got `%s`", jsonObj.get("liabilities").toString()));
          }

          // validate the optional field `liabilities` (array)
          for (int i = 0; i < jsonArrayliabilities.size(); i++) {
            FinancialConnectionsAccountLiability.validateJsonElement(jsonArrayliabilities.get(i));
          };
        }
      }
      if ((jsonObj.get("request_id") != null && !jsonObj.get("request_id").isJsonNull()) && !jsonObj.get("request_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `request_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("request_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetLiabilitiesResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetLiabilitiesResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetLiabilitiesResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetLiabilitiesResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<GetLiabilitiesResponse>() {
           @Override
           public void write(JsonWriter out, GetLiabilitiesResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetLiabilitiesResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetLiabilitiesResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetLiabilitiesResponse
  * @throws IOException if the JSON string is invalid with respect to GetLiabilitiesResponse
  */
  public static GetLiabilitiesResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetLiabilitiesResponse.class);
  }

 /**
  * Convert an instance of GetLiabilitiesResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
