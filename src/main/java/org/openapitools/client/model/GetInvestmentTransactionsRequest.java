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
import org.openapitools.client.model.GetInvestmentTransactionsRequestOptions;

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
 * GetInvestmentTransactionsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-10T13:19:07.464573Z[UTC]")
public class GetInvestmentTransactionsRequest {
  public static final String SERIALIZED_NAME_ACCESS_TOKEN = "access_token";
  @SerializedName(SERIALIZED_NAME_ACCESS_TOKEN)
  private String accessToken;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private String startDate;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private String endDate;

  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  private Integer page;

  public static final String SERIALIZED_NAME_RECORDS_PER_PAGE = "records_per_page";
  @SerializedName(SERIALIZED_NAME_RECORDS_PER_PAGE)
  private Integer recordsPerPage = 25;

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private GetInvestmentTransactionsRequestOptions options;

  public GetInvestmentTransactionsRequest() {
  }

  public GetInvestmentTransactionsRequest accessToken(String accessToken) {
    
    this.accessToken = accessToken;
    return this;
  }

   /**
   * Access token for authentication
   * @return accessToken
  **/
  @javax.annotation.Nonnull
  public String getAccessToken() {
    return accessToken;
  }


  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }


  public GetInvestmentTransactionsRequest startDate(String startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * The earliest date for which data should be returned. Dates should be formatted as YYYY-MM-DD.
   * @return startDate
  **/
  @javax.annotation.Nonnull
  public String getStartDate() {
    return startDate;
  }


  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  public GetInvestmentTransactionsRequest endDate(String endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * The latest date for which data should be returned. Dates should be formatted as YYYY-MM-DD.
   * @return endDate
  **/
  @javax.annotation.Nonnull
  public String getEndDate() {
    return endDate;
  }


  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  public GetInvestmentTransactionsRequest page(Integer page) {
    
    this.page = page;
    return this;
  }

   /**
   * Specify current page.
   * minimum: 1
   * @return page
  **/
  @javax.annotation.Nonnull
  public Integer getPage() {
    return page;
  }


  public void setPage(Integer page) {
    this.page = page;
  }


  public GetInvestmentTransactionsRequest recordsPerPage(Integer recordsPerPage) {
    
    this.recordsPerPage = recordsPerPage;
    return this;
  }

   /**
   * Number of items per page.
   * minimum: 10
   * maximum: 100
   * @return recordsPerPage
  **/
  @javax.annotation.Nonnull
  public Integer getRecordsPerPage() {
    return recordsPerPage;
  }


  public void setRecordsPerPage(Integer recordsPerPage) {
    this.recordsPerPage = recordsPerPage;
  }


  public GetInvestmentTransactionsRequest options(GetInvestmentTransactionsRequestOptions options) {
    
    this.options = options;
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @javax.annotation.Nullable
  public GetInvestmentTransactionsRequestOptions getOptions() {
    return options;
  }


  public void setOptions(GetInvestmentTransactionsRequestOptions options) {
    this.options = options;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetInvestmentTransactionsRequest getInvestmentTransactionsRequest = (GetInvestmentTransactionsRequest) o;
    return Objects.equals(this.accessToken, getInvestmentTransactionsRequest.accessToken) &&
        Objects.equals(this.startDate, getInvestmentTransactionsRequest.startDate) &&
        Objects.equals(this.endDate, getInvestmentTransactionsRequest.endDate) &&
        Objects.equals(this.page, getInvestmentTransactionsRequest.page) &&
        Objects.equals(this.recordsPerPage, getInvestmentTransactionsRequest.recordsPerPage) &&
        Objects.equals(this.options, getInvestmentTransactionsRequest.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, startDate, endDate, page, recordsPerPage, options);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetInvestmentTransactionsRequest {\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    recordsPerPage: ").append(toIndentedString(recordsPerPage)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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
    openapiFields.add("start_date");
    openapiFields.add("end_date");
    openapiFields.add("page");
    openapiFields.add("records_per_page");
    openapiFields.add("options");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("access_token");
    openapiRequiredFields.add("start_date");
    openapiRequiredFields.add("end_date");
    openapiRequiredFields.add("page");
    openapiRequiredFields.add("records_per_page");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GetInvestmentTransactionsRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetInvestmentTransactionsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetInvestmentTransactionsRequest is not found in the empty JSON string", GetInvestmentTransactionsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetInvestmentTransactionsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetInvestmentTransactionsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetInvestmentTransactionsRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("access_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `access_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("access_token").toString()));
      }
      if (!jsonObj.get("start_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `start_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("start_date").toString()));
      }
      if (!jsonObj.get("end_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `end_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("end_date").toString()));
      }
      // validate the optional field `options`
      if (jsonObj.get("options") != null && !jsonObj.get("options").isJsonNull()) {
        GetInvestmentTransactionsRequestOptions.validateJsonElement(jsonObj.get("options"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetInvestmentTransactionsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetInvestmentTransactionsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetInvestmentTransactionsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetInvestmentTransactionsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<GetInvestmentTransactionsRequest>() {
           @Override
           public void write(JsonWriter out, GetInvestmentTransactionsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetInvestmentTransactionsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetInvestmentTransactionsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetInvestmentTransactionsRequest
  * @throws IOException if the JSON string is invalid with respect to GetInvestmentTransactionsRequest
  */
  public static GetInvestmentTransactionsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetInvestmentTransactionsRequest.class);
  }

 /**
  * Convert an instance of GetInvestmentTransactionsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

