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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.fuse.client.model.Transaction;

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
 * GetFinancialConnectionsTransactionsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-12T15:13:43.182056Z[UTC]")
public class GetFinancialConnectionsTransactionsResponse {
  public static final String SERIALIZED_NAME_TRANSACTIONS = "transactions";
  @SerializedName(SERIALIZED_NAME_TRANSACTIONS)
  private List<Transaction> transactions = new ArrayList<>();

  public static final String SERIALIZED_NAME_TOTAL_TRANSACTIONS = "total_transactions";
  @SerializedName(SERIALIZED_NAME_TOTAL_TRANSACTIONS)
  private BigDecimal totalTransactions;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;

  public GetFinancialConnectionsTransactionsResponse() {
  }

  public GetFinancialConnectionsTransactionsResponse transactions(List<Transaction> transactions) {
    
    this.transactions = transactions;
    return this;
  }

  public GetFinancialConnectionsTransactionsResponse addTransactionsItem(Transaction transactionsItem) {
    if (this.transactions == null) {
      this.transactions = new ArrayList<>();
    }
    this.transactions.add(transactionsItem);
    return this;
  }

   /**
   * Get transactions
   * @return transactions
  **/
  @javax.annotation.Nonnull
  public List<Transaction> getTransactions() {
    return transactions;
  }


  public void setTransactions(List<Transaction> transactions) {
    this.transactions = transactions;
  }


  public GetFinancialConnectionsTransactionsResponse totalTransactions(BigDecimal totalTransactions) {
    
    this.totalTransactions = totalTransactions;
    return this;
  }

   /**
   * The total number of transactions available within the date range specified. If total_transactions is larger than the size of the transactions array, more transactions are available and can be fetched
   * @return totalTransactions
  **/
  @javax.annotation.Nonnull
  public BigDecimal getTotalTransactions() {
    return totalTransactions;
  }


  public void setTotalTransactions(BigDecimal totalTransactions) {
    this.totalTransactions = totalTransactions;
  }


  public GetFinancialConnectionsTransactionsResponse requestId(String requestId) {
    
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
    GetFinancialConnectionsTransactionsResponse getFinancialConnectionsTransactionsResponse = (GetFinancialConnectionsTransactionsResponse) o;
    return Objects.equals(this.transactions, getFinancialConnectionsTransactionsResponse.transactions) &&
        Objects.equals(this.totalTransactions, getFinancialConnectionsTransactionsResponse.totalTransactions) &&
        Objects.equals(this.requestId, getFinancialConnectionsTransactionsResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactions, totalTransactions, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFinancialConnectionsTransactionsResponse {\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
    sb.append("    totalTransactions: ").append(toIndentedString(totalTransactions)).append("\n");
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
    openapiFields.add("transactions");
    openapiFields.add("total_transactions");
    openapiFields.add("request_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("transactions");
    openapiRequiredFields.add("total_transactions");
    openapiRequiredFields.add("request_id");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GetFinancialConnectionsTransactionsResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetFinancialConnectionsTransactionsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetFinancialConnectionsTransactionsResponse is not found in the empty JSON string", GetFinancialConnectionsTransactionsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetFinancialConnectionsTransactionsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetFinancialConnectionsTransactionsResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetFinancialConnectionsTransactionsResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("transactions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `transactions` to be an array in the JSON string but got `%s`", jsonObj.get("transactions").toString()));
      }

      JsonArray jsonArraytransactions = jsonObj.getAsJsonArray("transactions");
      // validate the required field `transactions` (array)
      for (int i = 0; i < jsonArraytransactions.size(); i++) {
        Transaction.validateJsonElement(jsonArraytransactions.get(i));
      };
      if (!jsonObj.get("request_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `request_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("request_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetFinancialConnectionsTransactionsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetFinancialConnectionsTransactionsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetFinancialConnectionsTransactionsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetFinancialConnectionsTransactionsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<GetFinancialConnectionsTransactionsResponse>() {
           @Override
           public void write(JsonWriter out, GetFinancialConnectionsTransactionsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetFinancialConnectionsTransactionsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetFinancialConnectionsTransactionsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetFinancialConnectionsTransactionsResponse
  * @throws IOException if the JSON string is invalid with respect to GetFinancialConnectionsTransactionsResponse
  */
  public static GetFinancialConnectionsTransactionsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetFinancialConnectionsTransactionsResponse.class);
  }

 /**
  * Convert an instance of GetFinancialConnectionsTransactionsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

