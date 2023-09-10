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
import java.util.Arrays;
import org.openapitools.client.model.InAppTransactionEventStatus;
import org.openapitools.client.model.TransactionEventType;

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
 * InAppTransactionEvent
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-10T13:19:07.464573Z[UTC]")
public class InAppTransactionEvent {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  /**
   * Gets or Sets eventType
   */
  @JsonAdapter(EventTypeEnum.Adapter.class)
  public enum EventTypeEnum {
    IN_APP_TRANSACTION("in_app_transaction");

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
  private InAppTransactionEventStatus status;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private BigDecimal amount;

  public static final String SERIALIZED_NAME_ISO_CURRENCY_CODE = "iso_currency_code";
  @SerializedName(SERIALIZED_NAME_ISO_CURRENCY_CODE)
  private String isoCurrencyCode;

  public static final String SERIALIZED_NAME_TRANSACTION_TYPE = "transaction_type";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_TYPE)
  private TransactionEventType transactionType;

  public static final String SERIALIZED_NAME_MERCHANT_NAME = "merchant_name";
  @SerializedName(SERIALIZED_NAME_MERCHANT_NAME)
  private String merchantName;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private String timestamp;

  public static final String SERIALIZED_NAME_BALANCE = "balance";
  @SerializedName(SERIALIZED_NAME_BALANCE)
  private BigDecimal balance;

  public InAppTransactionEvent() {
  }

  public InAppTransactionEvent id(String id) {
    
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


  public InAppTransactionEvent eventType(EventTypeEnum eventType) {
    
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


  public InAppTransactionEvent status(InAppTransactionEventStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  public InAppTransactionEventStatus getStatus() {
    return status;
  }


  public void setStatus(InAppTransactionEventStatus status) {
    this.status = status;
  }


  public InAppTransactionEvent amount(BigDecimal amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nonnull
  public BigDecimal getAmount() {
    return amount;
  }


  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }


  public InAppTransactionEvent isoCurrencyCode(String isoCurrencyCode) {
    
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


  public InAppTransactionEvent transactionType(TransactionEventType transactionType) {
    
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


  public InAppTransactionEvent merchantName(String merchantName) {
    
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


  public InAppTransactionEvent timestamp(String timestamp) {
    
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


  public InAppTransactionEvent balance(BigDecimal balance) {
    
    this.balance = balance;
    return this;
  }

   /**
   * The running balance of the account after the transaction has occurred, in cents.
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
    InAppTransactionEvent inAppTransactionEvent = (InAppTransactionEvent) o;
    return Objects.equals(this.id, inAppTransactionEvent.id) &&
        Objects.equals(this.eventType, inAppTransactionEvent.eventType) &&
        Objects.equals(this.status, inAppTransactionEvent.status) &&
        Objects.equals(this.amount, inAppTransactionEvent.amount) &&
        Objects.equals(this.isoCurrencyCode, inAppTransactionEvent.isoCurrencyCode) &&
        Objects.equals(this.transactionType, inAppTransactionEvent.transactionType) &&
        Objects.equals(this.merchantName, inAppTransactionEvent.merchantName) &&
        Objects.equals(this.timestamp, inAppTransactionEvent.timestamp) &&
        Objects.equals(this.balance, inAppTransactionEvent.balance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, eventType, status, amount, isoCurrencyCode, transactionType, merchantName, timestamp, balance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InAppTransactionEvent {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    isoCurrencyCode: ").append(toIndentedString(isoCurrencyCode)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
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
    openapiFields.add("iso_currency_code");
    openapiFields.add("transaction_type");
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
  * @throws IOException if the JSON Element is invalid with respect to InAppTransactionEvent
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!InAppTransactionEvent.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InAppTransactionEvent is not found in the empty JSON string", InAppTransactionEvent.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!InAppTransactionEvent.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InAppTransactionEvent` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : InAppTransactionEvent.openapiRequiredFields) {
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
      if (!jsonObj.get("iso_currency_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `iso_currency_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("iso_currency_code").toString()));
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
       if (!InAppTransactionEvent.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InAppTransactionEvent' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InAppTransactionEvent> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InAppTransactionEvent.class));

       return (TypeAdapter<T>) new TypeAdapter<InAppTransactionEvent>() {
           @Override
           public void write(JsonWriter out, InAppTransactionEvent value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InAppTransactionEvent read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InAppTransactionEvent given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InAppTransactionEvent
  * @throws IOException if the JSON string is invalid with respect to InAppTransactionEvent
  */
  public static InAppTransactionEvent fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InAppTransactionEvent.class);
  }

 /**
  * Convert an instance of InAppTransactionEvent to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

