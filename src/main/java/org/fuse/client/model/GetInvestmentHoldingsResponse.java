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
import org.fuse.client.model.FinancialConnectionsAccount;
import org.fuse.client.model.FinancialConnectionsHolding;

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
import java.util.Set;

import org.fuse.client.JSON;

/**
 * GetInvestmentHoldingsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-23T12:03:45.546785Z[UTC]")
public class GetInvestmentHoldingsResponse {
  public static final String SERIALIZED_NAME_ACCOUNTS = "accounts";
  @SerializedName(SERIALIZED_NAME_ACCOUNTS)
  private List<FinancialConnectionsAccount> accounts = new ArrayList<>();

  public static final String SERIALIZED_NAME_HOLDINGS = "holdings";
  @SerializedName(SERIALIZED_NAME_HOLDINGS)
  private List<FinancialConnectionsHolding> holdings = new ArrayList<>();

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;

  public GetInvestmentHoldingsResponse() {
  }

  public GetInvestmentHoldingsResponse accounts(List<FinancialConnectionsAccount> accounts) {
    this.accounts = accounts;
    return this;
  }

  public GetInvestmentHoldingsResponse addAccountsItem(FinancialConnectionsAccount accountsItem) {
    if (this.accounts == null) {
      this.accounts = new ArrayList<>();
    }
    this.accounts.add(accountsItem);
    return this;
  }

   /**
   * Get accounts
   * @return accounts
  **/
  @javax.annotation.Nonnull
  public List<FinancialConnectionsAccount> getAccounts() {
    return accounts;
  }

  public void setAccounts(List<FinancialConnectionsAccount> accounts) {
    this.accounts = accounts;
  }


  public GetInvestmentHoldingsResponse holdings(List<FinancialConnectionsHolding> holdings) {
    this.holdings = holdings;
    return this;
  }

  public GetInvestmentHoldingsResponse addHoldingsItem(FinancialConnectionsHolding holdingsItem) {
    if (this.holdings == null) {
      this.holdings = new ArrayList<>();
    }
    this.holdings.add(holdingsItem);
    return this;
  }

   /**
   * Get holdings
   * @return holdings
  **/
  @javax.annotation.Nonnull
  public List<FinancialConnectionsHolding> getHoldings() {
    return holdings;
  }

  public void setHoldings(List<FinancialConnectionsHolding> holdings) {
    this.holdings = holdings;
  }


  public GetInvestmentHoldingsResponse requestId(String requestId) {
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
    GetInvestmentHoldingsResponse getInvestmentHoldingsResponse = (GetInvestmentHoldingsResponse) o;
    return Objects.equals(this.accounts, getInvestmentHoldingsResponse.accounts) &&
        Objects.equals(this.holdings, getInvestmentHoldingsResponse.holdings) &&
        Objects.equals(this.requestId, getInvestmentHoldingsResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accounts, holdings, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetInvestmentHoldingsResponse {\n");
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
    sb.append("    holdings: ").append(toIndentedString(holdings)).append("\n");
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
    openapiFields.add("accounts");
    openapiFields.add("holdings");
    openapiFields.add("request_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("accounts");
    openapiRequiredFields.add("holdings");
    openapiRequiredFields.add("request_id");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GetInvestmentHoldingsResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetInvestmentHoldingsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetInvestmentHoldingsResponse is not found in the empty JSON string", GetInvestmentHoldingsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetInvestmentHoldingsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetInvestmentHoldingsResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetInvestmentHoldingsResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("accounts").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `accounts` to be an array in the JSON string but got `%s`", jsonObj.get("accounts").toString()));
      }

      JsonArray jsonArrayaccounts = jsonObj.getAsJsonArray("accounts");
      // validate the required field `accounts` (array)
      for (int i = 0; i < jsonArrayaccounts.size(); i++) {
        FinancialConnectionsAccount.validateJsonElement(jsonArrayaccounts.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("holdings").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `holdings` to be an array in the JSON string but got `%s`", jsonObj.get("holdings").toString()));
      }

      JsonArray jsonArrayholdings = jsonObj.getAsJsonArray("holdings");
      // validate the required field `holdings` (array)
      for (int i = 0; i < jsonArrayholdings.size(); i++) {
        FinancialConnectionsHolding.validateJsonElement(jsonArrayholdings.get(i));
      };
      if (!jsonObj.get("request_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `request_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("request_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetInvestmentHoldingsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetInvestmentHoldingsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetInvestmentHoldingsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetInvestmentHoldingsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<GetInvestmentHoldingsResponse>() {
           @Override
           public void write(JsonWriter out, GetInvestmentHoldingsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetInvestmentHoldingsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetInvestmentHoldingsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetInvestmentHoldingsResponse
  * @throws IOException if the JSON string is invalid with respect to GetInvestmentHoldingsResponse
  */
  public static GetInvestmentHoldingsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetInvestmentHoldingsResponse.class);
  }

 /**
  * Convert an instance of GetInvestmentHoldingsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

