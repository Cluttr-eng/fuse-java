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
import java.util.Set;

import org.fuse.client.JSON;

/**
 * FinancialConnectionsAccountDetailsAccountNumber
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-23T12:03:45.546785Z[UTC]")
public class FinancialConnectionsAccountDetailsAccountNumber {
  public static final String SERIALIZED_NAME_NUMBER = "number";
  @SerializedName(SERIALIZED_NAME_NUMBER)
  private String number;

  public static final String SERIALIZED_NAME_SORT_CODE = "sort_code";
  @SerializedName(SERIALIZED_NAME_SORT_CODE)
  private String sortCode;

  public static final String SERIALIZED_NAME_IBAN = "iban";
  @SerializedName(SERIALIZED_NAME_IBAN)
  private String iban;

  public static final String SERIALIZED_NAME_SWIFT_BIC = "swift_bic";
  @SerializedName(SERIALIZED_NAME_SWIFT_BIC)
  private String swiftBic;

  public static final String SERIALIZED_NAME_BSB = "bsb";
  @SerializedName(SERIALIZED_NAME_BSB)
  private String bsb;

  public static final String SERIALIZED_NAME_BIC = "bic";
  @SerializedName(SERIALIZED_NAME_BIC)
  private String bic;

  public FinancialConnectionsAccountDetailsAccountNumber() {
  }

  public FinancialConnectionsAccountDetailsAccountNumber number(String number) {
    this.number = number;
    return this;
  }

   /**
   * Unique identifier representing the account, typically referred to as the account number.
   * @return number
  **/
  @javax.annotation.Nonnull
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }


  public FinancialConnectionsAccountDetailsAccountNumber sortCode(String sortCode) {
    this.sortCode = sortCode;
    return this;
  }

   /**
   * A six-digit number used by banks in the United Kingdom and Ireland to identify the branch where the account is held.
   * @return sortCode
  **/
  @javax.annotation.Nullable
  public String getSortCode() {
    return sortCode;
  }

  public void setSortCode(String sortCode) {
    this.sortCode = sortCode;
  }


  public FinancialConnectionsAccountDetailsAccountNumber iban(String iban) {
    this.iban = iban;
    return this;
  }

   /**
   * International Bank Account Number (IBAN) is an internationally agreed system of identifying bank accounts across national borders to facilitate the communication and processing of cross border transactions.
   * @return iban
  **/
  @javax.annotation.Nullable
  public String getIban() {
    return iban;
  }

  public void setIban(String iban) {
    this.iban = iban;
  }


  public FinancialConnectionsAccountDetailsAccountNumber swiftBic(String swiftBic) {
    this.swiftBic = swiftBic;
    return this;
  }

   /**
   * SWIFT/BIC code is an international identifier used to distinctively recognize a particular bank during financial transactions, such as money transfers.
   * @return swiftBic
  **/
  @javax.annotation.Nullable
  public String getSwiftBic() {
    return swiftBic;
  }

  public void setSwiftBic(String swiftBic) {
    this.swiftBic = swiftBic;
  }


  public FinancialConnectionsAccountDetailsAccountNumber bsb(String bsb) {
    this.bsb = bsb;
    return this;
  }

   /**
   * Bank-State-Branch (BSB) code is a six-digit numerical code used to identify an individual branch of a financial institution in Australia.
   * @return bsb
  **/
  @javax.annotation.Nullable
  public String getBsb() {
    return bsb;
  }

  public void setBsb(String bsb) {
    this.bsb = bsb;
  }


  public FinancialConnectionsAccountDetailsAccountNumber bic(String bic) {
    this.bic = bic;
    return this;
  }

   /**
   * Bank Identifier Code (BIC) is an international standard identifier used by banks and financial institutions globally to carry out transactions.
   * @return bic
  **/
  @javax.annotation.Nullable
  public String getBic() {
    return bic;
  }

  public void setBic(String bic) {
    this.bic = bic;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FinancialConnectionsAccountDetailsAccountNumber financialConnectionsAccountDetailsAccountNumber = (FinancialConnectionsAccountDetailsAccountNumber) o;
    return Objects.equals(this.number, financialConnectionsAccountDetailsAccountNumber.number) &&
        Objects.equals(this.sortCode, financialConnectionsAccountDetailsAccountNumber.sortCode) &&
        Objects.equals(this.iban, financialConnectionsAccountDetailsAccountNumber.iban) &&
        Objects.equals(this.swiftBic, financialConnectionsAccountDetailsAccountNumber.swiftBic) &&
        Objects.equals(this.bsb, financialConnectionsAccountDetailsAccountNumber.bsb) &&
        Objects.equals(this.bic, financialConnectionsAccountDetailsAccountNumber.bic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, sortCode, iban, swiftBic, bsb, bic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FinancialConnectionsAccountDetailsAccountNumber {\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    sortCode: ").append(toIndentedString(sortCode)).append("\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    swiftBic: ").append(toIndentedString(swiftBic)).append("\n");
    sb.append("    bsb: ").append(toIndentedString(bsb)).append("\n");
    sb.append("    bic: ").append(toIndentedString(bic)).append("\n");
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
    openapiFields.add("number");
    openapiFields.add("sort_code");
    openapiFields.add("iban");
    openapiFields.add("swift_bic");
    openapiFields.add("bsb");
    openapiFields.add("bic");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("number");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to FinancialConnectionsAccountDetailsAccountNumber
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FinancialConnectionsAccountDetailsAccountNumber.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FinancialConnectionsAccountDetailsAccountNumber is not found in the empty JSON string", FinancialConnectionsAccountDetailsAccountNumber.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!FinancialConnectionsAccountDetailsAccountNumber.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FinancialConnectionsAccountDetailsAccountNumber` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FinancialConnectionsAccountDetailsAccountNumber.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("number").toString()));
      }
      if ((jsonObj.get("sort_code") != null && !jsonObj.get("sort_code").isJsonNull()) && !jsonObj.get("sort_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sort_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sort_code").toString()));
      }
      if ((jsonObj.get("iban") != null && !jsonObj.get("iban").isJsonNull()) && !jsonObj.get("iban").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `iban` to be a primitive type in the JSON string but got `%s`", jsonObj.get("iban").toString()));
      }
      if ((jsonObj.get("swift_bic") != null && !jsonObj.get("swift_bic").isJsonNull()) && !jsonObj.get("swift_bic").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `swift_bic` to be a primitive type in the JSON string but got `%s`", jsonObj.get("swift_bic").toString()));
      }
      if ((jsonObj.get("bsb") != null && !jsonObj.get("bsb").isJsonNull()) && !jsonObj.get("bsb").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bsb` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bsb").toString()));
      }
      if ((jsonObj.get("bic") != null && !jsonObj.get("bic").isJsonNull()) && !jsonObj.get("bic").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bic` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bic").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FinancialConnectionsAccountDetailsAccountNumber.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FinancialConnectionsAccountDetailsAccountNumber' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FinancialConnectionsAccountDetailsAccountNumber> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FinancialConnectionsAccountDetailsAccountNumber.class));

       return (TypeAdapter<T>) new TypeAdapter<FinancialConnectionsAccountDetailsAccountNumber>() {
           @Override
           public void write(JsonWriter out, FinancialConnectionsAccountDetailsAccountNumber value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FinancialConnectionsAccountDetailsAccountNumber read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FinancialConnectionsAccountDetailsAccountNumber given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FinancialConnectionsAccountDetailsAccountNumber
  * @throws IOException if the JSON string is invalid with respect to FinancialConnectionsAccountDetailsAccountNumber
  */
  public static FinancialConnectionsAccountDetailsAccountNumber fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FinancialConnectionsAccountDetailsAccountNumber.class);
  }

 /**
  * Convert an instance of FinancialConnectionsAccountDetailsAccountNumber to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

