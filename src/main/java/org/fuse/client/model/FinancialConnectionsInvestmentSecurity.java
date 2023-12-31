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
import org.fuse.client.model.Currency;
import org.fuse.client.model.FinancialConnectionsInvestmentSecurityExchange;
import org.fuse.client.model.FinancialConnectionsInvestmentSecurityType;

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
 * FinancialConnectionsInvestmentSecurity
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-12T15:13:43.182056Z[UTC]")
public class FinancialConnectionsInvestmentSecurity {
  public static final String SERIALIZED_NAME_REMOTE_ID = "remote_id";
  @SerializedName(SERIALIZED_NAME_REMOTE_ID)
  private String remoteId;

  public static final String SERIALIZED_NAME_SYMBOL = "symbol";
  @SerializedName(SERIALIZED_NAME_SYMBOL)
  private String symbol;

  public static final String SERIALIZED_NAME_ISIN = "isin";
  @SerializedName(SERIALIZED_NAME_ISIN)
  private String isin;

  public static final String SERIALIZED_NAME_SEDOL = "sedol";
  @SerializedName(SERIALIZED_NAME_SEDOL)
  private String sedol;

  public static final String SERIALIZED_NAME_CUSIP = "cusip";
  @SerializedName(SERIALIZED_NAME_CUSIP)
  private String cusip;

  public static final String SERIALIZED_NAME_CLOSE_PRICE = "close_price";
  @SerializedName(SERIALIZED_NAME_CLOSE_PRICE)
  private BigDecimal closePrice;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private Currency currency;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private FinancialConnectionsInvestmentSecurityType type;

  public static final String SERIALIZED_NAME_EXCHANGE = "exchange";
  @SerializedName(SERIALIZED_NAME_EXCHANGE)
  private FinancialConnectionsInvestmentSecurityExchange exchange;

  public FinancialConnectionsInvestmentSecurity() {
  }

  public FinancialConnectionsInvestmentSecurity remoteId(String remoteId) {
    
    this.remoteId = remoteId;
    return this;
  }

   /**
   * Remote Id of the security, ie Plaid or Snaptrade security id
   * @return remoteId
  **/
  @javax.annotation.Nonnull
  public String getRemoteId() {
    return remoteId;
  }


  public void setRemoteId(String remoteId) {
    this.remoteId = remoteId;
  }


  public FinancialConnectionsInvestmentSecurity symbol(String symbol) {
    
    this.symbol = symbol;
    return this;
  }

   /**
   * The trading symbol for publicly traded securities, or a short identifier if available.
   * @return symbol
  **/
  @javax.annotation.Nonnull
  public String getSymbol() {
    return symbol;
  }


  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }


  public FinancialConnectionsInvestmentSecurity isin(String isin) {
    
    this.isin = isin;
    return this;
  }

   /**
   * The International Securities Identification Number (ISIN) uniquely identifies the security.
   * @return isin
  **/
  @javax.annotation.Nullable
  public String getIsin() {
    return isin;
  }


  public void setIsin(String isin) {
    this.isin = isin;
  }


  public FinancialConnectionsInvestmentSecurity sedol(String sedol) {
    
    this.sedol = sedol;
    return this;
  }

   /**
   * The Stock Exchange Daily Official List (SEDOL) code uniquely identifies the security, primarily used in the United Kingdom and Ireland.
   * @return sedol
  **/
  @javax.annotation.Nullable
  public String getSedol() {
    return sedol;
  }


  public void setSedol(String sedol) {
    this.sedol = sedol;
  }


  public FinancialConnectionsInvestmentSecurity cusip(String cusip) {
    
    this.cusip = cusip;
    return this;
  }

   /**
   * The Committee on Uniform Securities Identification Procedures (CUSIP) number uniquely identifies the security, primarily used in the United States and Canada.
   * @return cusip
  **/
  @javax.annotation.Nullable
  public String getCusip() {
    return cusip;
  }


  public void setCusip(String cusip) {
    this.cusip = cusip;
  }


  public FinancialConnectionsInvestmentSecurity closePrice(BigDecimal closePrice) {
    
    this.closePrice = closePrice;
    return this;
  }

   /**
   * The closing price of the security, in cents, at the end of the most recent trading day. The format of this value is a double.
   * @return closePrice
  **/
  @javax.annotation.Nullable
  public BigDecimal getClosePrice() {
    return closePrice;
  }


  public void setClosePrice(BigDecimal closePrice) {
    this.closePrice = closePrice;
  }


  public FinancialConnectionsInvestmentSecurity currency(Currency currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nonnull
  public Currency getCurrency() {
    return currency;
  }


  public void setCurrency(Currency currency) {
    this.currency = currency;
  }


  public FinancialConnectionsInvestmentSecurity name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * A descriptive name for the security, suitable for display.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public FinancialConnectionsInvestmentSecurity type(FinancialConnectionsInvestmentSecurityType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  public FinancialConnectionsInvestmentSecurityType getType() {
    return type;
  }


  public void setType(FinancialConnectionsInvestmentSecurityType type) {
    this.type = type;
  }


  public FinancialConnectionsInvestmentSecurity exchange(FinancialConnectionsInvestmentSecurityExchange exchange) {
    
    this.exchange = exchange;
    return this;
  }

   /**
   * Get exchange
   * @return exchange
  **/
  @javax.annotation.Nullable
  public FinancialConnectionsInvestmentSecurityExchange getExchange() {
    return exchange;
  }


  public void setExchange(FinancialConnectionsInvestmentSecurityExchange exchange) {
    this.exchange = exchange;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FinancialConnectionsInvestmentSecurity financialConnectionsInvestmentSecurity = (FinancialConnectionsInvestmentSecurity) o;
    return Objects.equals(this.remoteId, financialConnectionsInvestmentSecurity.remoteId) &&
        Objects.equals(this.symbol, financialConnectionsInvestmentSecurity.symbol) &&
        Objects.equals(this.isin, financialConnectionsInvestmentSecurity.isin) &&
        Objects.equals(this.sedol, financialConnectionsInvestmentSecurity.sedol) &&
        Objects.equals(this.cusip, financialConnectionsInvestmentSecurity.cusip) &&
        Objects.equals(this.closePrice, financialConnectionsInvestmentSecurity.closePrice) &&
        Objects.equals(this.currency, financialConnectionsInvestmentSecurity.currency) &&
        Objects.equals(this.name, financialConnectionsInvestmentSecurity.name) &&
        Objects.equals(this.type, financialConnectionsInvestmentSecurity.type) &&
        Objects.equals(this.exchange, financialConnectionsInvestmentSecurity.exchange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(remoteId, symbol, isin, sedol, cusip, closePrice, currency, name, type, exchange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FinancialConnectionsInvestmentSecurity {\n");
    sb.append("    remoteId: ").append(toIndentedString(remoteId)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    isin: ").append(toIndentedString(isin)).append("\n");
    sb.append("    sedol: ").append(toIndentedString(sedol)).append("\n");
    sb.append("    cusip: ").append(toIndentedString(cusip)).append("\n");
    sb.append("    closePrice: ").append(toIndentedString(closePrice)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    exchange: ").append(toIndentedString(exchange)).append("\n");
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
    openapiFields.add("remote_id");
    openapiFields.add("symbol");
    openapiFields.add("isin");
    openapiFields.add("sedol");
    openapiFields.add("cusip");
    openapiFields.add("close_price");
    openapiFields.add("currency");
    openapiFields.add("name");
    openapiFields.add("type");
    openapiFields.add("exchange");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("remote_id");
    openapiRequiredFields.add("symbol");
    openapiRequiredFields.add("currency");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to FinancialConnectionsInvestmentSecurity
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FinancialConnectionsInvestmentSecurity.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FinancialConnectionsInvestmentSecurity is not found in the empty JSON string", FinancialConnectionsInvestmentSecurity.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FinancialConnectionsInvestmentSecurity.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FinancialConnectionsInvestmentSecurity` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FinancialConnectionsInvestmentSecurity.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("remote_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `remote_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("remote_id").toString()));
      }
      if (!jsonObj.get("symbol").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `symbol` to be a primitive type in the JSON string but got `%s`", jsonObj.get("symbol").toString()));
      }
      if ((jsonObj.get("isin") != null && !jsonObj.get("isin").isJsonNull()) && !jsonObj.get("isin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `isin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("isin").toString()));
      }
      if ((jsonObj.get("sedol") != null && !jsonObj.get("sedol").isJsonNull()) && !jsonObj.get("sedol").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sedol` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sedol").toString()));
      }
      if ((jsonObj.get("cusip") != null && !jsonObj.get("cusip").isJsonNull()) && !jsonObj.get("cusip").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cusip` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cusip").toString()));
      }
      // validate the required field `currency`
      Currency.validateJsonElement(jsonObj.get("currency"));
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `exchange`
      if (jsonObj.get("exchange") != null && !jsonObj.get("exchange").isJsonNull()) {
        FinancialConnectionsInvestmentSecurityExchange.validateJsonElement(jsonObj.get("exchange"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FinancialConnectionsInvestmentSecurity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FinancialConnectionsInvestmentSecurity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FinancialConnectionsInvestmentSecurity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FinancialConnectionsInvestmentSecurity.class));

       return (TypeAdapter<T>) new TypeAdapter<FinancialConnectionsInvestmentSecurity>() {
           @Override
           public void write(JsonWriter out, FinancialConnectionsInvestmentSecurity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FinancialConnectionsInvestmentSecurity read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FinancialConnectionsInvestmentSecurity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FinancialConnectionsInvestmentSecurity
  * @throws IOException if the JSON string is invalid with respect to FinancialConnectionsInvestmentSecurity
  */
  public static FinancialConnectionsInvestmentSecurity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FinancialConnectionsInvestmentSecurity.class);
  }

 /**
  * Convert an instance of FinancialConnectionsInvestmentSecurity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

