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
import org.openapitools.client.model.FinanceScore;

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
 * ConsumerRiskReport
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-10T13:19:07.464573Z[UTC]")
public class ConsumerRiskReport {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CUSTOMIZATION_ID = "customization_id";
  @SerializedName(SERIALIZED_NAME_CUSTOMIZATION_ID)
  private String customizationId;

  public static final String SERIALIZED_NAME_SPEND_LIMIT = "spend_limit";
  @SerializedName(SERIALIZED_NAME_SPEND_LIMIT)
  private BigDecimal spendLimit;

  public static final String SERIALIZED_NAME_CURRENT_SPEND = "current_spend";
  @SerializedName(SERIALIZED_NAME_CURRENT_SPEND)
  private BigDecimal currentSpend;

  public static final String SERIALIZED_NAME_PENDING_PAYMENTS_AMOUNT = "pending_payments_amount";
  @SerializedName(SERIALIZED_NAME_PENDING_PAYMENTS_AMOUNT)
  private BigDecimal pendingPaymentsAmount;

  public static final String SERIALIZED_NAME_ISO_CURRENCY_CODE = "iso_currency_code";
  @SerializedName(SERIALIZED_NAME_ISO_CURRENCY_CODE)
  private String isoCurrencyCode;

  public static final String SERIALIZED_NAME_LAST_UPDATED = "last_updated";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATED)
  private String lastUpdated;

  public static final String SERIALIZED_NAME_FINANCE_SCORE = "finance_score";
  @SerializedName(SERIALIZED_NAME_FINANCE_SCORE)
  private FinanceScore financeScore;

  public static final String SERIALIZED_NAME_PREDICTED_BALANCE = "predicted_balance";
  @SerializedName(SERIALIZED_NAME_PREDICTED_BALANCE)
  private BigDecimal predictedBalance;

  public ConsumerRiskReport() {
  }

  public ConsumerRiskReport id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ConsumerRiskReport customizationId(String customizationId) {
    
    this.customizationId = customizationId;
    return this;
  }

   /**
   * Get customizationId
   * @return customizationId
  **/
  @javax.annotation.Nonnull
  public String getCustomizationId() {
    return customizationId;
  }


  public void setCustomizationId(String customizationId) {
    this.customizationId = customizationId;
  }


  public ConsumerRiskReport spendLimit(BigDecimal spendLimit) {
    
    this.spendLimit = spendLimit;
    return this;
  }

   /**
   * The total limit for the current timeframe, in cents.
   * @return spendLimit
  **/
  @javax.annotation.Nonnull
  public BigDecimal getSpendLimit() {
    return spendLimit;
  }


  public void setSpendLimit(BigDecimal spendLimit) {
    this.spendLimit = spendLimit;
  }


  public ConsumerRiskReport currentSpend(BigDecimal currentSpend) {
    
    this.currentSpend = currentSpend;
    return this;
  }

   /**
   * The total current spend in the current timeframe, in cents, without factoring in pending payments.
   * @return currentSpend
  **/
  @javax.annotation.Nonnull
  public BigDecimal getCurrentSpend() {
    return currentSpend;
  }


  public void setCurrentSpend(BigDecimal currentSpend) {
    this.currentSpend = currentSpend;
  }


  public ConsumerRiskReport pendingPaymentsAmount(BigDecimal pendingPaymentsAmount) {
    
    this.pendingPaymentsAmount = pendingPaymentsAmount;
    return this;
  }

   /**
   * The total unpaid amount, in cents, from all timeframes.
   * @return pendingPaymentsAmount
  **/
  @javax.annotation.Nonnull
  public BigDecimal getPendingPaymentsAmount() {
    return pendingPaymentsAmount;
  }


  public void setPendingPaymentsAmount(BigDecimal pendingPaymentsAmount) {
    this.pendingPaymentsAmount = pendingPaymentsAmount;
  }


  public ConsumerRiskReport isoCurrencyCode(String isoCurrencyCode) {
    
    this.isoCurrencyCode = isoCurrencyCode;
    return this;
  }

   /**
   * The ISO-4217 currency code of the transaction
   * @return isoCurrencyCode
  **/
  @javax.annotation.Nonnull
  public String getIsoCurrencyCode() {
    return isoCurrencyCode;
  }


  public void setIsoCurrencyCode(String isoCurrencyCode) {
    this.isoCurrencyCode = isoCurrencyCode;
  }


  public ConsumerRiskReport lastUpdated(String lastUpdated) {
    
    this.lastUpdated = lastUpdated;
    return this;
  }

   /**
   * The datetime of when the consumer risk report was most recently updated, in ISO-8601 format.
   * @return lastUpdated
  **/
  @javax.annotation.Nonnull
  public String getLastUpdated() {
    return lastUpdated;
  }


  public void setLastUpdated(String lastUpdated) {
    this.lastUpdated = lastUpdated;
  }


  public ConsumerRiskReport financeScore(FinanceScore financeScore) {
    
    this.financeScore = financeScore;
    return this;
  }

   /**
   * Get financeScore
   * @return financeScore
  **/
  @javax.annotation.Nonnull
  public FinanceScore getFinanceScore() {
    return financeScore;
  }


  public void setFinanceScore(FinanceScore financeScore) {
    this.financeScore = financeScore;
  }


  public ConsumerRiskReport predictedBalance(BigDecimal predictedBalance) {
    
    this.predictedBalance = predictedBalance;
    return this;
  }

   /**
   * Predicted balance for the timeframe.
   * @return predictedBalance
  **/
  @javax.annotation.Nonnull
  public BigDecimal getPredictedBalance() {
    return predictedBalance;
  }


  public void setPredictedBalance(BigDecimal predictedBalance) {
    this.predictedBalance = predictedBalance;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsumerRiskReport consumerRiskReport = (ConsumerRiskReport) o;
    return Objects.equals(this.id, consumerRiskReport.id) &&
        Objects.equals(this.customizationId, consumerRiskReport.customizationId) &&
        Objects.equals(this.spendLimit, consumerRiskReport.spendLimit) &&
        Objects.equals(this.currentSpend, consumerRiskReport.currentSpend) &&
        Objects.equals(this.pendingPaymentsAmount, consumerRiskReport.pendingPaymentsAmount) &&
        Objects.equals(this.isoCurrencyCode, consumerRiskReport.isoCurrencyCode) &&
        Objects.equals(this.lastUpdated, consumerRiskReport.lastUpdated) &&
        Objects.equals(this.financeScore, consumerRiskReport.financeScore) &&
        Objects.equals(this.predictedBalance, consumerRiskReport.predictedBalance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, customizationId, spendLimit, currentSpend, pendingPaymentsAmount, isoCurrencyCode, lastUpdated, financeScore, predictedBalance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsumerRiskReport {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    customizationId: ").append(toIndentedString(customizationId)).append("\n");
    sb.append("    spendLimit: ").append(toIndentedString(spendLimit)).append("\n");
    sb.append("    currentSpend: ").append(toIndentedString(currentSpend)).append("\n");
    sb.append("    pendingPaymentsAmount: ").append(toIndentedString(pendingPaymentsAmount)).append("\n");
    sb.append("    isoCurrencyCode: ").append(toIndentedString(isoCurrencyCode)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    financeScore: ").append(toIndentedString(financeScore)).append("\n");
    sb.append("    predictedBalance: ").append(toIndentedString(predictedBalance)).append("\n");
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
    openapiFields.add("customization_id");
    openapiFields.add("spend_limit");
    openapiFields.add("current_spend");
    openapiFields.add("pending_payments_amount");
    openapiFields.add("iso_currency_code");
    openapiFields.add("last_updated");
    openapiFields.add("finance_score");
    openapiFields.add("predicted_balance");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("customization_id");
    openapiRequiredFields.add("spend_limit");
    openapiRequiredFields.add("current_spend");
    openapiRequiredFields.add("pending_payments_amount");
    openapiRequiredFields.add("iso_currency_code");
    openapiRequiredFields.add("last_updated");
    openapiRequiredFields.add("finance_score");
    openapiRequiredFields.add("predicted_balance");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ConsumerRiskReport
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ConsumerRiskReport.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConsumerRiskReport is not found in the empty JSON string", ConsumerRiskReport.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ConsumerRiskReport.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ConsumerRiskReport` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ConsumerRiskReport.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("customization_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customization_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customization_id").toString()));
      }
      if (!jsonObj.get("iso_currency_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `iso_currency_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("iso_currency_code").toString()));
      }
      if (!jsonObj.get("last_updated").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_updated` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_updated").toString()));
      }
      // validate the required field `finance_score`
      FinanceScore.validateJsonElement(jsonObj.get("finance_score"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConsumerRiskReport.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConsumerRiskReport' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConsumerRiskReport> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConsumerRiskReport.class));

       return (TypeAdapter<T>) new TypeAdapter<ConsumerRiskReport>() {
           @Override
           public void write(JsonWriter out, ConsumerRiskReport value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ConsumerRiskReport read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ConsumerRiskReport given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ConsumerRiskReport
  * @throws IOException if the JSON string is invalid with respect to ConsumerRiskReport
  */
  public static ConsumerRiskReport fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConsumerRiskReport.class);
  }

 /**
  * Convert an instance of ConsumerRiskReport to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

