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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.AssetReportAccountsInner;

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
 * The Asset Report in JSON format.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-10T13:25:52.697721Z[UTC]")
public class AssetReport {
  public static final String SERIALIZED_NAME_ASSET_REPORT_ID = "asset_report_id";
  @SerializedName(SERIALIZED_NAME_ASSET_REPORT_ID)
  private String assetReportId;

  public static final String SERIALIZED_NAME_ASSET_REPORT_TOKEN = "asset_report_token";
  @SerializedName(SERIALIZED_NAME_ASSET_REPORT_TOKEN)
  private String assetReportToken;

  public static final String SERIALIZED_NAME_DATE_GENERATED = "date_generated";
  @SerializedName(SERIALIZED_NAME_DATE_GENERATED)
  private String dateGenerated;

  public static final String SERIALIZED_NAME_DAYS_REQUESTED = "days_requested";
  @SerializedName(SERIALIZED_NAME_DAYS_REQUESTED)
  private Integer daysRequested;

  public static final String SERIALIZED_NAME_ACCOUNTS = "accounts";
  @SerializedName(SERIALIZED_NAME_ACCOUNTS)
  private List<AssetReportAccountsInner> accounts;

  public AssetReport() {
  }

  public AssetReport assetReportId(String assetReportId) {
    
    this.assetReportId = assetReportId;
    return this;
  }

   /**
   * A unique ID identifying an Asset Report.
   * @return assetReportId
  **/
  @javax.annotation.Nullable
  public String getAssetReportId() {
    return assetReportId;
  }


  public void setAssetReportId(String assetReportId) {
    this.assetReportId = assetReportId;
  }


  public AssetReport assetReportToken(String assetReportToken) {
    
    this.assetReportToken = assetReportToken;
    return this;
  }

   /**
   * A token that can be provided to endpoints such as /asset_report/get or /asset_report/pdf/get to fetch or update an Asset Report.
   * @return assetReportToken
  **/
  @javax.annotation.Nullable
  public String getAssetReportToken() {
    return assetReportToken;
  }


  public void setAssetReportToken(String assetReportToken) {
    this.assetReportToken = assetReportToken;
  }


  public AssetReport dateGenerated(String dateGenerated) {
    
    this.dateGenerated = dateGenerated;
    return this;
  }

   /**
   * The date and time when the Asset Report was created, in ISO 8601 format
   * @return dateGenerated
  **/
  @javax.annotation.Nullable
  public String getDateGenerated() {
    return dateGenerated;
  }


  public void setDateGenerated(String dateGenerated) {
    this.dateGenerated = dateGenerated;
  }


  public AssetReport daysRequested(Integer daysRequested) {
    
    this.daysRequested = daysRequested;
    return this;
  }

   /**
   * The duration of transaction history you requested
   * @return daysRequested
  **/
  @javax.annotation.Nullable
  public Integer getDaysRequested() {
    return daysRequested;
  }


  public void setDaysRequested(Integer daysRequested) {
    this.daysRequested = daysRequested;
  }


  public AssetReport accounts(List<AssetReportAccountsInner> accounts) {
    
    this.accounts = accounts;
    return this;
  }

  public AssetReport addAccountsItem(AssetReportAccountsInner accountsItem) {
    if (this.accounts == null) {
      this.accounts = new ArrayList<>();
    }
    this.accounts.add(accountsItem);
    return this;
  }

   /**
   * An array of Asset Reports, one for each account in the Asset Report.
   * @return accounts
  **/
  @javax.annotation.Nullable
  public List<AssetReportAccountsInner> getAccounts() {
    return accounts;
  }


  public void setAccounts(List<AssetReportAccountsInner> accounts) {
    this.accounts = accounts;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetReport assetReport = (AssetReport) o;
    return Objects.equals(this.assetReportId, assetReport.assetReportId) &&
        Objects.equals(this.assetReportToken, assetReport.assetReportToken) &&
        Objects.equals(this.dateGenerated, assetReport.dateGenerated) &&
        Objects.equals(this.daysRequested, assetReport.daysRequested) &&
        Objects.equals(this.accounts, assetReport.accounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetReportId, assetReportToken, dateGenerated, daysRequested, accounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetReport {\n");
    sb.append("    assetReportId: ").append(toIndentedString(assetReportId)).append("\n");
    sb.append("    assetReportToken: ").append(toIndentedString(assetReportToken)).append("\n");
    sb.append("    dateGenerated: ").append(toIndentedString(dateGenerated)).append("\n");
    sb.append("    daysRequested: ").append(toIndentedString(daysRequested)).append("\n");
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
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
    openapiFields.add("asset_report_id");
    openapiFields.add("asset_report_token");
    openapiFields.add("date_generated");
    openapiFields.add("days_requested");
    openapiFields.add("accounts");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AssetReport
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AssetReport.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AssetReport is not found in the empty JSON string", AssetReport.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AssetReport.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AssetReport` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("asset_report_id") != null && !jsonObj.get("asset_report_id").isJsonNull()) && !jsonObj.get("asset_report_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `asset_report_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("asset_report_id").toString()));
      }
      if ((jsonObj.get("asset_report_token") != null && !jsonObj.get("asset_report_token").isJsonNull()) && !jsonObj.get("asset_report_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `asset_report_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("asset_report_token").toString()));
      }
      if ((jsonObj.get("date_generated") != null && !jsonObj.get("date_generated").isJsonNull()) && !jsonObj.get("date_generated").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `date_generated` to be a primitive type in the JSON string but got `%s`", jsonObj.get("date_generated").toString()));
      }
      if (jsonObj.get("accounts") != null && !jsonObj.get("accounts").isJsonNull()) {
        JsonArray jsonArrayaccounts = jsonObj.getAsJsonArray("accounts");
        if (jsonArrayaccounts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("accounts").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `accounts` to be an array in the JSON string but got `%s`", jsonObj.get("accounts").toString()));
          }

          // validate the optional field `accounts` (array)
          for (int i = 0; i < jsonArrayaccounts.size(); i++) {
            AssetReportAccountsInner.validateJsonElement(jsonArrayaccounts.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AssetReport.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AssetReport' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AssetReport> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AssetReport.class));

       return (TypeAdapter<T>) new TypeAdapter<AssetReport>() {
           @Override
           public void write(JsonWriter out, AssetReport value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AssetReport read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AssetReport given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AssetReport
  * @throws IOException if the JSON string is invalid with respect to AssetReport
  */
  public static AssetReport fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AssetReport.class);
  }

 /**
  * Convert an instance of AssetReport to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

