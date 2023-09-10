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
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.client.model.Currency;
import org.openapitools.client.model.FinancialConnectionsInvestmentSecurity;
import org.openapitools.client.model.FinancialConnectionsInvestmentTransactionSubtype;

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
 * FinancialConnectionsInvestmentTransaction
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-10T13:19:07.464573Z[UTC]")
public class FinancialConnectionsInvestmentTransaction {
  public static final String SERIALIZED_NAME_REMOTE_ID = "remote_id";
  @SerializedName(SERIALIZED_NAME_REMOTE_ID)
  private String remoteId;

  public static final String SERIALIZED_NAME_REMOTE_ACCOUNT_ID = "remote_account_id";
  @SerializedName(SERIALIZED_NAME_REMOTE_ACCOUNT_ID)
  private String remoteAccountId;

  public static final String SERIALIZED_NAME_ACCOUNT_NAME = "account_name";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NAME)
  private String accountName;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private BigDecimal amount;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_FEES = "fees";
  @SerializedName(SERIALIZED_NAME_FEES)
  private BigDecimal fees;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private Currency currency;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private OffsetDateTime date;

  /**
   * The type of the investment transaction (e.g., &#39;buy&#39;, &#39;sell&#39;, &#39;dividend&#39;)
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    CASH("cash"),
    
    BUY("buy"),
    
    SELL("sell"),
    
    TRANSFER("transfer"),
    
    FEE("fee"),
    
    CANCEL("cancel"),
    
    MINUS("-");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_SUBTYPE = "subtype";
  @SerializedName(SERIALIZED_NAME_SUBTYPE)
  private FinancialConnectionsInvestmentTransactionSubtype subtype;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private BigDecimal quantity;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private BigDecimal price;

  public static final String SERIALIZED_NAME_SECURITY = "security";
  @SerializedName(SERIALIZED_NAME_SECURITY)
  private FinancialConnectionsInvestmentSecurity security;

  public FinancialConnectionsInvestmentTransaction() {
  }

  public FinancialConnectionsInvestmentTransaction remoteId(String remoteId) {
    
    this.remoteId = remoteId;
    return this;
  }

   /**
   * The remote ID of the Investment transaction
   * @return remoteId
  **/
  @javax.annotation.Nonnull
  public String getRemoteId() {
    return remoteId;
  }


  public void setRemoteId(String remoteId) {
    this.remoteId = remoteId;
  }


  public FinancialConnectionsInvestmentTransaction remoteAccountId(String remoteAccountId) {
    
    this.remoteAccountId = remoteAccountId;
    return this;
  }

   /**
   * Remote Account Id of the transaction, ie Plaid Account Id
   * @return remoteAccountId
  **/
  @javax.annotation.Nonnull
  public String getRemoteAccountId() {
    return remoteAccountId;
  }


  public void setRemoteAccountId(String remoteAccountId) {
    this.remoteAccountId = remoteAccountId;
  }


  public FinancialConnectionsInvestmentTransaction accountName(String accountName) {
    
    this.accountName = accountName;
    return this;
  }

   /**
   * The name of the account associated with the investment transaction
   * @return accountName
  **/
  @javax.annotation.Nullable
  public String getAccountName() {
    return accountName;
  }


  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }


  public FinancialConnectionsInvestmentTransaction amount(BigDecimal amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The amount of the investment transaction, in cents. The format of this value is a double.
   * @return amount
  **/
  @javax.annotation.Nonnull
  public BigDecimal getAmount() {
    return amount;
  }


  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }


  public FinancialConnectionsInvestmentTransaction description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * A description of the investment transaction
   * @return description
  **/
  @javax.annotation.Nonnull
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public FinancialConnectionsInvestmentTransaction fees(BigDecimal fees) {
    
    this.fees = fees;
    return this;
  }

   /**
   * The fees associated with the investment transaction, in cents. The format of this value is a double.
   * @return fees
  **/
  @javax.annotation.Nonnull
  public BigDecimal getFees() {
    return fees;
  }


  public void setFees(BigDecimal fees) {
    this.fees = fees;
  }


  public FinancialConnectionsInvestmentTransaction currency(Currency currency) {
    
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


  public FinancialConnectionsInvestmentTransaction date(OffsetDateTime date) {
    
    this.date = date;
    return this;
  }

   /**
   * The date and time of the investment transaction
   * @return date
  **/
  @javax.annotation.Nonnull
  public OffsetDateTime getDate() {
    return date;
  }


  public void setDate(OffsetDateTime date) {
    this.date = date;
  }


  public FinancialConnectionsInvestmentTransaction type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of the investment transaction (e.g., &#39;buy&#39;, &#39;sell&#39;, &#39;dividend&#39;)
   * @return type
  **/
  @javax.annotation.Nonnull
  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public FinancialConnectionsInvestmentTransaction subtype(FinancialConnectionsInvestmentTransactionSubtype subtype) {
    
    this.subtype = subtype;
    return this;
  }

   /**
   * Get subtype
   * @return subtype
  **/
  @javax.annotation.Nullable
  public FinancialConnectionsInvestmentTransactionSubtype getSubtype() {
    return subtype;
  }


  public void setSubtype(FinancialConnectionsInvestmentTransactionSubtype subtype) {
    this.subtype = subtype;
  }


  public FinancialConnectionsInvestmentTransaction quantity(BigDecimal quantity) {
    
    this.quantity = quantity;
    return this;
  }

   /**
   * The number of units of the security involved in this transaction
   * @return quantity
  **/
  @javax.annotation.Nonnull
  public BigDecimal getQuantity() {
    return quantity;
  }


  public void setQuantity(BigDecimal quantity) {
    this.quantity = quantity;
  }


  public FinancialConnectionsInvestmentTransaction price(BigDecimal price) {
    
    this.price = price;
    return this;
  }

   /**
   * The price of the security involved in this transaction, in cents. The format of this value is a double.
   * @return price
  **/
  @javax.annotation.Nonnull
  public BigDecimal getPrice() {
    return price;
  }


  public void setPrice(BigDecimal price) {
    this.price = price;
  }


  public FinancialConnectionsInvestmentTransaction security(FinancialConnectionsInvestmentSecurity security) {
    
    this.security = security;
    return this;
  }

   /**
   * Get security
   * @return security
  **/
  @javax.annotation.Nonnull
  public FinancialConnectionsInvestmentSecurity getSecurity() {
    return security;
  }


  public void setSecurity(FinancialConnectionsInvestmentSecurity security) {
    this.security = security;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FinancialConnectionsInvestmentTransaction financialConnectionsInvestmentTransaction = (FinancialConnectionsInvestmentTransaction) o;
    return Objects.equals(this.remoteId, financialConnectionsInvestmentTransaction.remoteId) &&
        Objects.equals(this.remoteAccountId, financialConnectionsInvestmentTransaction.remoteAccountId) &&
        Objects.equals(this.accountName, financialConnectionsInvestmentTransaction.accountName) &&
        Objects.equals(this.amount, financialConnectionsInvestmentTransaction.amount) &&
        Objects.equals(this.description, financialConnectionsInvestmentTransaction.description) &&
        Objects.equals(this.fees, financialConnectionsInvestmentTransaction.fees) &&
        Objects.equals(this.currency, financialConnectionsInvestmentTransaction.currency) &&
        Objects.equals(this.date, financialConnectionsInvestmentTransaction.date) &&
        Objects.equals(this.type, financialConnectionsInvestmentTransaction.type) &&
        Objects.equals(this.subtype, financialConnectionsInvestmentTransaction.subtype) &&
        Objects.equals(this.quantity, financialConnectionsInvestmentTransaction.quantity) &&
        Objects.equals(this.price, financialConnectionsInvestmentTransaction.price) &&
        Objects.equals(this.security, financialConnectionsInvestmentTransaction.security);
  }

  @Override
  public int hashCode() {
    return Objects.hash(remoteId, remoteAccountId, accountName, amount, description, fees, currency, date, type, subtype, quantity, price, security);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FinancialConnectionsInvestmentTransaction {\n");
    sb.append("    remoteId: ").append(toIndentedString(remoteId)).append("\n");
    sb.append("    remoteAccountId: ").append(toIndentedString(remoteAccountId)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    fees: ").append(toIndentedString(fees)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    subtype: ").append(toIndentedString(subtype)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    security: ").append(toIndentedString(security)).append("\n");
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
    openapiFields.add("remote_account_id");
    openapiFields.add("account_name");
    openapiFields.add("amount");
    openapiFields.add("description");
    openapiFields.add("fees");
    openapiFields.add("currency");
    openapiFields.add("date");
    openapiFields.add("type");
    openapiFields.add("subtype");
    openapiFields.add("quantity");
    openapiFields.add("price");
    openapiFields.add("security");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("remote_id");
    openapiRequiredFields.add("remote_account_id");
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("fees");
    openapiRequiredFields.add("currency");
    openapiRequiredFields.add("date");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("quantity");
    openapiRequiredFields.add("price");
    openapiRequiredFields.add("security");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to FinancialConnectionsInvestmentTransaction
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FinancialConnectionsInvestmentTransaction.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FinancialConnectionsInvestmentTransaction is not found in the empty JSON string", FinancialConnectionsInvestmentTransaction.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FinancialConnectionsInvestmentTransaction.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FinancialConnectionsInvestmentTransaction` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FinancialConnectionsInvestmentTransaction.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("remote_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `remote_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("remote_id").toString()));
      }
      if (!jsonObj.get("remote_account_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `remote_account_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("remote_account_id").toString()));
      }
      if ((jsonObj.get("account_name") != null && !jsonObj.get("account_name").isJsonNull()) && !jsonObj.get("account_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_name").toString()));
      }
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the required field `currency`
      Currency.validateJsonElement(jsonObj.get("currency"));
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the required field `security`
      FinancialConnectionsInvestmentSecurity.validateJsonElement(jsonObj.get("security"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FinancialConnectionsInvestmentTransaction.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FinancialConnectionsInvestmentTransaction' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FinancialConnectionsInvestmentTransaction> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FinancialConnectionsInvestmentTransaction.class));

       return (TypeAdapter<T>) new TypeAdapter<FinancialConnectionsInvestmentTransaction>() {
           @Override
           public void write(JsonWriter out, FinancialConnectionsInvestmentTransaction value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FinancialConnectionsInvestmentTransaction read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FinancialConnectionsInvestmentTransaction given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FinancialConnectionsInvestmentTransaction
  * @throws IOException if the JSON string is invalid with respect to FinancialConnectionsInvestmentTransaction
  */
  public static FinancialConnectionsInvestmentTransaction fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FinancialConnectionsInvestmentTransaction.class);
  }

 /**
  * Convert an instance of FinancialConnectionsInvestmentTransaction to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

