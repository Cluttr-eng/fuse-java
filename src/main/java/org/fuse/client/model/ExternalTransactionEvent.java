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
import org.fuse.client.model.ExternalTransactionEventStatus;
import org.fuse.client.model.TransactionEventType;

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
 * ExternalTransactionEvent
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-12T15:13:43.182056Z[UTC]")
public class ExternalTransactionEvent {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  /**
   * Gets or Sets eventType
   */
  @JsonAdapter(EventTypeEnum.Adapter.class)
  public enum EventTypeEnum {
    EXTERNAL_TRANSACTION("external_transaction");

    private String value;

    EventTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EventTypeEnum fromValue(String value) {
      for (EventTypeEnum b : EventTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EventTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EventTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EventTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EventTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_EVENT_TYPE = "event_type";
  @SerializedName(SERIALIZED_NAME_EVENT_TYPE)
  private EventTypeEnum eventType;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private ExternalTransactionEventStatus status;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private BigDecimal amount;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "country_code";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode = "US";

  public static final String SERIALIZED_NAME_ISO_CURRENCY_CODE = "iso_currency_code";
  @SerializedName(SERIALIZED_NAME_ISO_CURRENCY_CODE)
  private String isoCurrencyCode;

  public static final String SERIALIZED_NAME_TRANSACTION_TYPE = "transaction_type";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_TYPE)
  private TransactionEventType transactionType;

  public static final String SERIALIZED_NAME_TRANSACTION_DESCRIPTION = "transaction_description";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_DESCRIPTION)
  private String transactionDescription;

  /**
   * Gets or Sets transactionOwnerType
   */
  @JsonAdapter(TransactionOwnerTypeEnum.Adapter.class)
  public enum TransactionOwnerTypeEnum {
    CONSUMER("consumer"),
    
    BUSINESS("business");

    private String value;

    TransactionOwnerTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TransactionOwnerTypeEnum fromValue(String value) {
      for (TransactionOwnerTypeEnum b : TransactionOwnerTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TransactionOwnerTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TransactionOwnerTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TransactionOwnerTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TransactionOwnerTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TRANSACTION_OWNER_TYPE = "transaction_owner_type";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_OWNER_TYPE)
  private TransactionOwnerTypeEnum transactionOwnerType = TransactionOwnerTypeEnum.CONSUMER;

  public static final String SERIALIZED_NAME_MERCHANT_NAME = "merchant_name";
  @SerializedName(SERIALIZED_NAME_MERCHANT_NAME)
  private String merchantName;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private String timestamp;

  public static final String SERIALIZED_NAME_BALANCE = "balance";
  @SerializedName(SERIALIZED_NAME_BALANCE)
  private BigDecimal balance;

  public ExternalTransactionEvent() {
  }

  public ExternalTransactionEvent id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * ID of the transaction
   * @return id
  **/
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ExternalTransactionEvent eventType(EventTypeEnum eventType) {
    
    this.eventType = eventType;
    return this;
  }

   /**
   * Get eventType
   * @return eventType
  **/
  @javax.annotation.Nonnull
  public EventTypeEnum getEventType() {
    return eventType;
  }


  public void setEventType(EventTypeEnum eventType) {
    this.eventType = eventType;
  }


  public ExternalTransactionEvent status(ExternalTransactionEventStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  public ExternalTransactionEventStatus getStatus() {
    return status;
  }


  public void setStatus(ExternalTransactionEventStatus status) {
    this.status = status;
  }


  public ExternalTransactionEvent amount(BigDecimal amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Amount in cents associated with the transaction. Use positive values to represent money going out and negative to represent money going in.
   * @return amount
  **/
  @javax.annotation.Nonnull
  public BigDecimal getAmount() {
    return amount;
  }


  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }


  public ExternalTransactionEvent countryCode(String countryCode) {
    
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Get countryCode
   * @return countryCode
  **/
  @javax.annotation.Nullable
  public String getCountryCode() {
    return countryCode;
  }


  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  public ExternalTransactionEvent isoCurrencyCode(String isoCurrencyCode) {
    
    this.isoCurrencyCode = isoCurrencyCode;
    return this;
  }

   /**
   * The ISO-4217 currency code.
   * @return isoCurrencyCode
  **/
  @javax.annotation.Nonnull
  public String getIsoCurrencyCode() {
    return isoCurrencyCode;
  }


  public void setIsoCurrencyCode(String isoCurrencyCode) {
    this.isoCurrencyCode = isoCurrencyCode;
  }


  public ExternalTransactionEvent transactionType(TransactionEventType transactionType) {
    
    this.transactionType = transactionType;
    return this;
  }

   /**
   * Get transactionType
   * @return transactionType
  **/
  @javax.annotation.Nullable
  public TransactionEventType getTransactionType() {
    return transactionType;
  }


  public void setTransactionType(TransactionEventType transactionType) {
    this.transactionType = transactionType;
  }


  public ExternalTransactionEvent transactionDescription(String transactionDescription) {
    
    this.transactionDescription = transactionDescription;
    return this;
  }

   /**
   * Get transactionDescription
   * @return transactionDescription
  **/
  @javax.annotation.Nullable
  public String getTransactionDescription() {
    return transactionDescription;
  }


  public void setTransactionDescription(String transactionDescription) {
    this.transactionDescription = transactionDescription;
  }


  public ExternalTransactionEvent transactionOwnerType(TransactionOwnerTypeEnum transactionOwnerType) {
    
    this.transactionOwnerType = transactionOwnerType;
    return this;
  }

   /**
   * Get transactionOwnerType
   * @return transactionOwnerType
  **/
  @javax.annotation.Nullable
  public TransactionOwnerTypeEnum getTransactionOwnerType() {
    return transactionOwnerType;
  }


  public void setTransactionOwnerType(TransactionOwnerTypeEnum transactionOwnerType) {
    this.transactionOwnerType = transactionOwnerType;
  }


  public ExternalTransactionEvent merchantName(String merchantName) {
    
    this.merchantName = merchantName;
    return this;
  }

   /**
   * Get merchantName
   * @return merchantName
  **/
  @javax.annotation.Nonnull
  public String getMerchantName() {
    return merchantName;
  }


  public void setMerchantName(String merchantName) {
    this.merchantName = merchantName;
  }


  public ExternalTransactionEvent timestamp(String timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Datetime of the transaction In ISO-8601 format
   * @return timestamp
  **/
  @javax.annotation.Nonnull
  public String getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }


  public ExternalTransactionEvent balance(BigDecimal balance) {
    
    this.balance = balance;
    return this;
  }

   /**
   * The running balance of the account after the transaction has occurred, in cents
   * @return balance
  **/
  @javax.annotation.Nullable
  public BigDecimal getBalance() {
    return balance;
  }


  public void setBalance(BigDecimal balance) {
    this.balance = balance;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalTransactionEvent externalTransactionEvent = (ExternalTransactionEvent) o;
    return Objects.equals(this.id, externalTransactionEvent.id) &&
        Objects.equals(this.eventType, externalTransactionEvent.eventType) &&
        Objects.equals(this.status, externalTransactionEvent.status) &&
        Objects.equals(this.amount, externalTransactionEvent.amount) &&
        Objects.equals(this.countryCode, externalTransactionEvent.countryCode) &&
        Objects.equals(this.isoCurrencyCode, externalTransactionEvent.isoCurrencyCode) &&
        Objects.equals(this.transactionType, externalTransactionEvent.transactionType) &&
        Objects.equals(this.transactionDescription, externalTransactionEvent.transactionDescription) &&
        Objects.equals(this.transactionOwnerType, externalTransactionEvent.transactionOwnerType) &&
        Objects.equals(this.merchantName, externalTransactionEvent.merchantName) &&
        Objects.equals(this.timestamp, externalTransactionEvent.timestamp) &&
        Objects.equals(this.balance, externalTransactionEvent.balance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, eventType, status, amount, countryCode, isoCurrencyCode, transactionType, transactionDescription, transactionOwnerType, merchantName, timestamp, balance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalTransactionEvent {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    isoCurrencyCode: ").append(toIndentedString(isoCurrencyCode)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    transactionDescription: ").append(toIndentedString(transactionDescription)).append("\n");
    sb.append("    transactionOwnerType: ").append(toIndentedString(transactionOwnerType)).append("\n");
    sb.append("    merchantName: ").append(toIndentedString(merchantName)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("event_type");
    openapiFields.add("status");
    openapiFields.add("amount");
    openapiFields.add("country_code");
    openapiFields.add("iso_currency_code");
    openapiFields.add("transaction_type");
    openapiFields.add("transaction_description");
    openapiFields.add("transaction_owner_type");
    openapiFields.add("merchant_name");
    openapiFields.add("timestamp");
    openapiFields.add("balance");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("event_type");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("iso_currency_code");
    openapiRequiredFields.add("merchant_name");
    openapiRequiredFields.add("timestamp");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ExternalTransactionEvent
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ExternalTransactionEvent.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExternalTransactionEvent is not found in the empty JSON string", ExternalTransactionEvent.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ExternalTransactionEvent.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ExternalTransactionEvent` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ExternalTransactionEvent.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("event_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `event_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("event_type").toString()));
      }
      if ((jsonObj.get("country_code") != null && !jsonObj.get("country_code").isJsonNull()) && !jsonObj.get("country_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country_code").toString()));
      }
      if (!jsonObj.get("iso_currency_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `iso_currency_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("iso_currency_code").toString()));
      }
      if ((jsonObj.get("transaction_description") != null && !jsonObj.get("transaction_description").isJsonNull()) && !jsonObj.get("transaction_description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transaction_description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transaction_description").toString()));
      }
      if ((jsonObj.get("transaction_owner_type") != null && !jsonObj.get("transaction_owner_type").isJsonNull()) && !jsonObj.get("transaction_owner_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transaction_owner_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transaction_owner_type").toString()));
      }
      if (!jsonObj.get("merchant_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_name").toString()));
      }
      if (!jsonObj.get("timestamp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timestamp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timestamp").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExternalTransactionEvent.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExternalTransactionEvent' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExternalTransactionEvent> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExternalTransactionEvent.class));

       return (TypeAdapter<T>) new TypeAdapter<ExternalTransactionEvent>() {
           @Override
           public void write(JsonWriter out, ExternalTransactionEvent value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ExternalTransactionEvent read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ExternalTransactionEvent given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExternalTransactionEvent
  * @throws IOException if the JSON string is invalid with respect to ExternalTransactionEvent
  */
  public static ExternalTransactionEvent fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExternalTransactionEvent.class);
  }

 /**
  * Convert an instance of ExternalTransactionEvent to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

