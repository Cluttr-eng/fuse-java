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
 * FinanceScore
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-12T14:48:18.188409Z[UTC]")
public class FinanceScore {
  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private BigDecimal value;

  public static final String SERIALIZED_NAME_SAVINGS_SCORE = "savings_score";
  @SerializedName(SERIALIZED_NAME_SAVINGS_SCORE)
  private BigDecimal savingsScore;

  public static final String SERIALIZED_NAME_EXPENSE_STABILITY_SCORE = "expense_stability_score";
  @SerializedName(SERIALIZED_NAME_EXPENSE_STABILITY_SCORE)
  private BigDecimal expenseStabilityScore;

  public static final String SERIALIZED_NAME_ACTIVITY_AGE_SCORE = "activity_age_score";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_AGE_SCORE)
  private BigDecimal activityAgeScore;

  public static final String SERIALIZED_NAME_INCOME_SCORE = "income_score";
  @SerializedName(SERIALIZED_NAME_INCOME_SCORE)
  private BigDecimal incomeScore;

  public static final String SERIALIZED_NAME_LOAN_PAYMENTS_SCORE = "loan_payments_score";
  @SerializedName(SERIALIZED_NAME_LOAN_PAYMENTS_SCORE)
  private BigDecimal loanPaymentsScore;

  public static final String SERIALIZED_NAME_REPAYMENTS_SCORE = "repayments_score";
  @SerializedName(SERIALIZED_NAME_REPAYMENTS_SCORE)
  private BigDecimal repaymentsScore;

  public FinanceScore() {
  }

  public FinanceScore value(BigDecimal value) {
    
    this.value = value;
    return this;
  }

   /**
   * The likelihood of a credit default. A higher score implies lower risk. The finance score and all finance score metrics are values between 0 and 1. This value is calculated by the weighted sum of the metrics below.
   * @return value
  **/
  @javax.annotation.Nonnull
  public BigDecimal getValue() {
    return value;
  }


  public void setValue(BigDecimal value) {
    this.value = value;
  }


  public FinanceScore savingsScore(BigDecimal savingsScore) {
    
    this.savingsScore = savingsScore;
    return this;
  }

   /**
   * This quantifies a user&#39;s monthly savings habits. A lower score represents minimal savings, while a higher score indicates a user who consistently sets aside a substantial portion of their income.
   * @return savingsScore
  **/
  @javax.annotation.Nonnull
  public BigDecimal getSavingsScore() {
    return savingsScore;
  }


  public void setSavingsScore(BigDecimal savingsScore) {
    this.savingsScore = savingsScore;
  }


  public FinanceScore expenseStabilityScore(BigDecimal expenseStabilityScore) {
    
    this.expenseStabilityScore = expenseStabilityScore;
    return this;
  }

   /**
   * This assesses the consistency of a user&#39;s monthly spending. A lower score indicates variable monthly expenditure, while a higher score represents consistent spending habits.
   * @return expenseStabilityScore
  **/
  @javax.annotation.Nonnull
  public BigDecimal getExpenseStabilityScore() {
    return expenseStabilityScore;
  }


  public void setExpenseStabilityScore(BigDecimal expenseStabilityScore) {
    this.expenseStabilityScore = expenseStabilityScore;
  }


  public FinanceScore activityAgeScore(BigDecimal activityAgeScore) {
    
    this.activityAgeScore = activityAgeScore;
    return this;
  }

   /**
   * This measures the regularity of a user&#39;s financial activity over a period of time. A lower score suggests limited activity, while a higher score is indicative of regular daily transactions over a long period of time.
   * @return activityAgeScore
  **/
  @javax.annotation.Nonnull
  public BigDecimal getActivityAgeScore() {
    return activityAgeScore;
  }


  public void setActivityAgeScore(BigDecimal activityAgeScore) {
    this.activityAgeScore = activityAgeScore;
  }


  public FinanceScore incomeScore(BigDecimal incomeScore) {
    
    this.incomeScore = incomeScore;
    return this;
  }

   /**
   * This evaluates the stability of a user&#39;s income. A lower score suggests inconsistent or low income, while a higher score represents high, consistent income.
   * @return incomeScore
  **/
  @javax.annotation.Nonnull
  public BigDecimal getIncomeScore() {
    return incomeScore;
  }


  public void setIncomeScore(BigDecimal incomeScore) {
    this.incomeScore = incomeScore;
  }


  public FinanceScore loanPaymentsScore(BigDecimal loanPaymentsScore) {
    
    this.loanPaymentsScore = loanPaymentsScore;
    return this;
  }

   /**
   * This evaluates a user&#39;s loan repayment behaviour. A lower score is assigned to those without loan payments, while a higher score denotes consistent loan payments, such as a mortgage.
   * @return loanPaymentsScore
  **/
  @javax.annotation.Nonnull
  public BigDecimal getLoanPaymentsScore() {
    return loanPaymentsScore;
  }


  public void setLoanPaymentsScore(BigDecimal loanPaymentsScore) {
    this.loanPaymentsScore = loanPaymentsScore;
  }


  public FinanceScore repaymentsScore(BigDecimal repaymentsScore) {
    
    this.repaymentsScore = repaymentsScore;
    return this;
  }

   /**
   * This quantifies a user&#39;s ability to repay debts. A lower score corresponds to missed payments, while a higher score signifies consistent debt repayment.
   * @return repaymentsScore
  **/
  @javax.annotation.Nonnull
  public BigDecimal getRepaymentsScore() {
    return repaymentsScore;
  }


  public void setRepaymentsScore(BigDecimal repaymentsScore) {
    this.repaymentsScore = repaymentsScore;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FinanceScore financeScore = (FinanceScore) o;
    return Objects.equals(this.value, financeScore.value) &&
        Objects.equals(this.savingsScore, financeScore.savingsScore) &&
        Objects.equals(this.expenseStabilityScore, financeScore.expenseStabilityScore) &&
        Objects.equals(this.activityAgeScore, financeScore.activityAgeScore) &&
        Objects.equals(this.incomeScore, financeScore.incomeScore) &&
        Objects.equals(this.loanPaymentsScore, financeScore.loanPaymentsScore) &&
        Objects.equals(this.repaymentsScore, financeScore.repaymentsScore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, savingsScore, expenseStabilityScore, activityAgeScore, incomeScore, loanPaymentsScore, repaymentsScore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FinanceScore {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    savingsScore: ").append(toIndentedString(savingsScore)).append("\n");
    sb.append("    expenseStabilityScore: ").append(toIndentedString(expenseStabilityScore)).append("\n");
    sb.append("    activityAgeScore: ").append(toIndentedString(activityAgeScore)).append("\n");
    sb.append("    incomeScore: ").append(toIndentedString(incomeScore)).append("\n");
    sb.append("    loanPaymentsScore: ").append(toIndentedString(loanPaymentsScore)).append("\n");
    sb.append("    repaymentsScore: ").append(toIndentedString(repaymentsScore)).append("\n");
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
    openapiFields.add("value");
    openapiFields.add("savings_score");
    openapiFields.add("expense_stability_score");
    openapiFields.add("activity_age_score");
    openapiFields.add("income_score");
    openapiFields.add("loan_payments_score");
    openapiFields.add("repayments_score");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("value");
    openapiRequiredFields.add("savings_score");
    openapiRequiredFields.add("expense_stability_score");
    openapiRequiredFields.add("activity_age_score");
    openapiRequiredFields.add("income_score");
    openapiRequiredFields.add("loan_payments_score");
    openapiRequiredFields.add("repayments_score");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to FinanceScore
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FinanceScore.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FinanceScore is not found in the empty JSON string", FinanceScore.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FinanceScore.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FinanceScore` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FinanceScore.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FinanceScore.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FinanceScore' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FinanceScore> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FinanceScore.class));

       return (TypeAdapter<T>) new TypeAdapter<FinanceScore>() {
           @Override
           public void write(JsonWriter out, FinanceScore value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FinanceScore read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FinanceScore given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FinanceScore
  * @throws IOException if the JSON string is invalid with respect to FinanceScore
  */
  public static FinanceScore fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FinanceScore.class);
  }

 /**
  * Convert an instance of FinanceScore to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
