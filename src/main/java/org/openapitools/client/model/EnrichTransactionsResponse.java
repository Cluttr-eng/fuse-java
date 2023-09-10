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
import org.openapitools.client.model.EnrichedTransaction;

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
 * EnrichTransactionsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-10T13:19:07.464573Z[UTC]")
public class EnrichTransactionsResponse {
  public static final String SERIALIZED_NAME_ENRICHED_TRANSACTIONS = "enriched_transactions";
  @SerializedName(SERIALIZED_NAME_ENRICHED_TRANSACTIONS)
  private List<EnrichedTransaction> enrichedTransactions;

  public EnrichTransactionsResponse() {
  }

  public EnrichTransactionsResponse enrichedTransactions(List<EnrichedTransaction> enrichedTransactions) {
    
    this.enrichedTransactions = enrichedTransactions;
    return this;
  }

  public EnrichTransactionsResponse addEnrichedTransactionsItem(EnrichedTransaction enrichedTransactionsItem) {
    if (this.enrichedTransactions == null) {
      this.enrichedTransactions = new ArrayList<>();
    }
    this.enrichedTransactions.add(enrichedTransactionsItem);
    return this;
  }

   /**
   * The enriched transactions.
   * @return enrichedTransactions
  **/
  @javax.annotation.Nullable
  public List<EnrichedTransaction> getEnrichedTransactions() {
    return enrichedTransactions;
  }


  public void setEnrichedTransactions(List<EnrichedTransaction> enrichedTransactions) {
    this.enrichedTransactions = enrichedTransactions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnrichTransactionsResponse enrichTransactionsResponse = (EnrichTransactionsResponse) o;
    return Objects.equals(this.enrichedTransactions, enrichTransactionsResponse.enrichedTransactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enrichedTransactions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnrichTransactionsResponse {\n");
    sb.append("    enrichedTransactions: ").append(toIndentedString(enrichedTransactions)).append("\n");
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
    openapiFields.add("enriched_transactions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EnrichTransactionsResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EnrichTransactionsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EnrichTransactionsResponse is not found in the empty JSON string", EnrichTransactionsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!EnrichTransactionsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EnrichTransactionsResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("enriched_transactions") != null && !jsonObj.get("enriched_transactions").isJsonNull()) {
        JsonArray jsonArrayenrichedTransactions = jsonObj.getAsJsonArray("enriched_transactions");
        if (jsonArrayenrichedTransactions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("enriched_transactions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `enriched_transactions` to be an array in the JSON string but got `%s`", jsonObj.get("enriched_transactions").toString()));
          }

          // validate the optional field `enriched_transactions` (array)
          for (int i = 0; i < jsonArrayenrichedTransactions.size(); i++) {
            EnrichedTransaction.validateJsonElement(jsonArrayenrichedTransactions.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EnrichTransactionsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EnrichTransactionsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EnrichTransactionsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EnrichTransactionsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<EnrichTransactionsResponse>() {
           @Override
           public void write(JsonWriter out, EnrichTransactionsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EnrichTransactionsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EnrichTransactionsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EnrichTransactionsResponse
  * @throws IOException if the JSON string is invalid with respect to EnrichTransactionsResponse
  */
  public static EnrichTransactionsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EnrichTransactionsResponse.class);
  }

 /**
  * Convert an instance of EnrichTransactionsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

