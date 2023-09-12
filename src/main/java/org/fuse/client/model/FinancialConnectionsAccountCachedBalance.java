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
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * FinancialConnectionsAccountCachedBalance
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-12T15:13:43.182056Z[UTC]")
public class FinancialConnectionsAccountCachedBalance {
  public static final String SERIALIZED_NAME_AVAILABLE = "available";
  @SerializedName(SERIALIZED_NAME_AVAILABLE)
  private BigDecimal available;

  public static final String SERIALIZED_NAME_CURRENT = "current";
  @SerializedName(SERIALIZED_NAME_CURRENT)
  private BigDecimal current;

  public static final String SERIALIZED_NAME_ISO_CURRENCY_CODE = "iso_currency_code";
  @SerializedName(SERIALIZED_NAME_ISO_CURRENCY_CODE)
  private String isoCurrencyCode;

  public static final String SERIALIZED_NAME_LAST_UPDATED_DATE = "last_updated_date";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATED_DATE)
  private String lastUpdatedDate;

  public FinancialConnectionsAccountCachedBalance() {
  }

  public FinancialConnectionsAccountCachedBalance available(BigDecimal available) {
    
    this.available = available;
    return this;
  }

   /**
   * The amount of funds available, in cents, to be withdrawn from the account, as determined by the financial institution. The format of this value is a double. Available balance may be cached and is not guaranteed to be up-to-date in realtime unless the value was returned by /financial_connections/balances. For accounts with credit features, the available funds generally equal the credit limit. Some institutions may not provide an available balance calculation. If this is the case, Fuse will return a null value for the available balance. To ensure you have the most accurate information, we recommend obtaining the current balance by using &#39;balance.available || balance.current&#39;.
   * @return available
  **/
  @javax.annotation.Nullable
  public BigDecimal getAvailable() {
    return available;
  }


  public void setAvailable(BigDecimal available) {
    this.available = available;
  }


  public FinancialConnectionsAccountCachedBalance current(BigDecimal current) {
    
    this.current = current;
    return this;
  }

   /**
   * Amount without factoring in pending balances, in cents. The format of this value is a double.
   * @return current
  **/
  @javax.annotation.Nullable
  public BigDecimal getCurrent() {
    return current;
  }


  public void setCurrent(BigDecimal current) {
    this.current = current;
  }


  public FinancialConnectionsAccountCachedBalance isoCurrencyCode(String isoCurrencyCode) {
    
    this.isoCurrencyCode = isoCurrencyCode;
    return this;
  }

   /**
   * The ISO-4217 currency code of the balance.
   * @return isoCurrencyCode
  **/
  @javax.annotation.Nullable
  public String getIsoCurrencyCode() {
    return isoCurrencyCode;
  }


  public void setIsoCurrencyCode(String isoCurrencyCode) {
    this.isoCurrencyCode = isoCurrencyCode;
  }


  public FinancialConnectionsAccountCachedBalance lastUpdatedDate(String lastUpdatedDate) {
    
    this.lastUpdatedDate = lastUpdatedDate;
    return this;
  }

   /**
   * The date of the last update to the balance.
   * @return lastUpdatedDate
  **/
  @javax.annotation.Nullable
  public String getLastUpdatedDate() {
    return lastUpdatedDate;
  }


  public void setLastUpdatedDate(String lastUpdatedDate) {
    this.lastUpdatedDate = lastUpdatedDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FinancialConnectionsAccountCachedBalance financialConnectionsAccountCachedBalance = (FinancialConnectionsAccountCachedBalance) o;
    return Objects.equals(this.available, financialConnectionsAccountCachedBalance.available) &&
        Objects.equals(this.current, financialConnectionsAccountCachedBalance.current) &&
        Objects.equals(this.isoCurrencyCode, financialConnectionsAccountCachedBalance.isoCurrencyCode) &&
        Objects.equals(this.lastUpdatedDate, financialConnectionsAccountCachedBalance.lastUpdatedDate);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(available, current, isoCurrencyCode, lastUpdatedDate);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FinancialConnectionsAccountCachedBalance {\n");
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
    sb.append("    isoCurrencyCode: ").append(toIndentedString(isoCurrencyCode)).append("\n");
    sb.append("    lastUpdatedDate: ").append(toIndentedString(lastUpdatedDate)).append("\n");
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
    openapiFields.add("available");
    openapiFields.add("current");
    openapiFields.add("iso_currency_code");
    openapiFields.add("last_updated_date");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to FinancialConnectionsAccountCachedBalance
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FinancialConnectionsAccountCachedBalance.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FinancialConnectionsAccountCachedBalance is not found in the empty JSON string", FinancialConnectionsAccountCachedBalance.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FinancialConnectionsAccountCachedBalance.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FinancialConnectionsAccountCachedBalance` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("iso_currency_code") != null && !jsonObj.get("iso_currency_code").isJsonNull()) && !jsonObj.get("iso_currency_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `iso_currency_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("iso_currency_code").toString()));
      }
      if ((jsonObj.get("last_updated_date") != null && !jsonObj.get("last_updated_date").isJsonNull()) && !jsonObj.get("last_updated_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_updated_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_updated_date").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FinancialConnectionsAccountCachedBalance.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FinancialConnectionsAccountCachedBalance' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FinancialConnectionsAccountCachedBalance> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FinancialConnectionsAccountCachedBalance.class));

       return (TypeAdapter<T>) new TypeAdapter<FinancialConnectionsAccountCachedBalance>() {
           @Override
           public void write(JsonWriter out, FinancialConnectionsAccountCachedBalance value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FinancialConnectionsAccountCachedBalance read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FinancialConnectionsAccountCachedBalance given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FinancialConnectionsAccountCachedBalance
  * @throws IOException if the JSON string is invalid with respect to FinancialConnectionsAccountCachedBalance
  */
  public static FinancialConnectionsAccountCachedBalance fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FinancialConnectionsAccountCachedBalance.class);
  }

 /**
  * Convert an instance of FinancialConnectionsAccountCachedBalance to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

