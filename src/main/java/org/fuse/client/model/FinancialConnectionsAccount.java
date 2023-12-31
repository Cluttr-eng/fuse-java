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
import org.fuse.client.model.AccountSubtype;
import org.fuse.client.model.AccountType;
import org.fuse.client.model.FinancialConnectionsAccountCachedBalance;
import org.fuse.client.model.FinancialConnectionsAccountInstitution;
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
 * FinancialConnectionsAccount
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-12T15:13:43.182056Z[UTC]")
public class FinancialConnectionsAccount {
  public static final String SERIALIZED_NAME_REMOTE_ID = "remote_id";
  @SerializedName(SERIALIZED_NAME_REMOTE_ID)
  private String remoteId;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_FINGERPRINT = "fingerprint";
  @SerializedName(SERIALIZED_NAME_FINGERPRINT)
  private String fingerprint;

  public static final String SERIALIZED_NAME_INSTITUTION = "institution";
  @SerializedName(SERIALIZED_NAME_INSTITUTION)
  private FinancialConnectionsAccountInstitution institution;

  public static final String SERIALIZED_NAME_MASK = "mask";
  @SerializedName(SERIALIZED_NAME_MASK)
  private String mask;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private AccountType type;

  public static final String SERIALIZED_NAME_SUBTYPE = "subtype";
  @SerializedName(SERIALIZED_NAME_SUBTYPE)
  private AccountSubtype subtype;

  public static final String SERIALIZED_NAME_BALANCE = "balance";
  @SerializedName(SERIALIZED_NAME_BALANCE)
  private FinancialConnectionsAccountCachedBalance balance;

  public static final String SERIALIZED_NAME_REMOTE_DATA = "remote_data";
  @SerializedName(SERIALIZED_NAME_REMOTE_DATA)
  private Object remoteData = null;

  public FinancialConnectionsAccount() {
  }

  public FinancialConnectionsAccount remoteId(String remoteId) {
    
    this.remoteId = remoteId;
    return this;
  }

   /**
   * Remote Id of the account, ie Plaid or Teller account id
   * @return remoteId
  **/
  @javax.annotation.Nonnull
  public String getRemoteId() {
    return remoteId;
  }


  public void setRemoteId(String remoteId) {
    this.remoteId = remoteId;
  }


  public FinancialConnectionsAccount currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * The ISO-4217 currency code of the account.
   * @return currency
  **/
  @javax.annotation.Nonnull
  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public FinancialConnectionsAccount fingerprint(String fingerprint) {
    
    this.fingerprint = fingerprint;
    return this;
  }

   /**
   * Uniquely identifies this account across all accounts for a single financial connection. Used for reconnection deduplication. See more information here: https://letsfuse.readme.io/docs/duplicate-accounts
   * @return fingerprint
  **/
  @javax.annotation.Nonnull
  public String getFingerprint() {
    return fingerprint;
  }


  public void setFingerprint(String fingerprint) {
    this.fingerprint = fingerprint;
  }


  public FinancialConnectionsAccount institution(FinancialConnectionsAccountInstitution institution) {
    
    this.institution = institution;
    return this;
  }

   /**
   * Get institution
   * @return institution
  **/
  @javax.annotation.Nullable
  public FinancialConnectionsAccountInstitution getInstitution() {
    return institution;
  }


  public void setInstitution(FinancialConnectionsAccountInstitution institution) {
    this.institution = institution;
  }


  public FinancialConnectionsAccount mask(String mask) {
    
    this.mask = mask;
    return this;
  }

   /**
   * The partial account number.
   * @return mask
  **/
  @javax.annotation.Nullable
  public String getMask() {
    return mask;
  }


  public void setMask(String mask) {
    this.mask = mask;
  }


  public FinancialConnectionsAccount name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The account&#39;s name, ie &#39;My Checking&#39;
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public FinancialConnectionsAccount type(AccountType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  public AccountType getType() {
    return type;
  }


  public void setType(AccountType type) {
    this.type = type;
  }


  public FinancialConnectionsAccount subtype(AccountSubtype subtype) {
    
    this.subtype = subtype;
    return this;
  }

   /**
   * Get subtype
   * @return subtype
  **/
  @javax.annotation.Nullable
  public AccountSubtype getSubtype() {
    return subtype;
  }


  public void setSubtype(AccountSubtype subtype) {
    this.subtype = subtype;
  }


  public FinancialConnectionsAccount balance(FinancialConnectionsAccountCachedBalance balance) {
    
    this.balance = balance;
    return this;
  }

   /**
   * Get balance
   * @return balance
  **/
  @javax.annotation.Nonnull
  public FinancialConnectionsAccountCachedBalance getBalance() {
    return balance;
  }


  public void setBalance(FinancialConnectionsAccountCachedBalance balance) {
    this.balance = balance;
  }


  public FinancialConnectionsAccount remoteData(Object remoteData) {
    
    this.remoteData = remoteData;
    return this;
  }

   /**
   * Get remoteData
   * @return remoteData
  **/
  @javax.annotation.Nullable
  public Object getRemoteData() {
    return remoteData;
  }


  public void setRemoteData(Object remoteData) {
    this.remoteData = remoteData;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FinancialConnectionsAccount financialConnectionsAccount = (FinancialConnectionsAccount) o;
    return Objects.equals(this.remoteId, financialConnectionsAccount.remoteId) &&
        Objects.equals(this.currency, financialConnectionsAccount.currency) &&
        Objects.equals(this.fingerprint, financialConnectionsAccount.fingerprint) &&
        Objects.equals(this.institution, financialConnectionsAccount.institution) &&
        Objects.equals(this.mask, financialConnectionsAccount.mask) &&
        Objects.equals(this.name, financialConnectionsAccount.name) &&
        Objects.equals(this.type, financialConnectionsAccount.type) &&
        Objects.equals(this.subtype, financialConnectionsAccount.subtype) &&
        Objects.equals(this.balance, financialConnectionsAccount.balance) &&
        Objects.equals(this.remoteData, financialConnectionsAccount.remoteData);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(remoteId, currency, fingerprint, institution, mask, name, type, subtype, balance, remoteData);
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
    sb.append("class FinancialConnectionsAccount {\n");
    sb.append("    remoteId: ").append(toIndentedString(remoteId)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    fingerprint: ").append(toIndentedString(fingerprint)).append("\n");
    sb.append("    institution: ").append(toIndentedString(institution)).append("\n");
    sb.append("    mask: ").append(toIndentedString(mask)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    subtype: ").append(toIndentedString(subtype)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    remoteData: ").append(toIndentedString(remoteData)).append("\n");
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
    openapiFields.add("currency");
    openapiFields.add("fingerprint");
    openapiFields.add("institution");
    openapiFields.add("mask");
    openapiFields.add("name");
    openapiFields.add("type");
    openapiFields.add("subtype");
    openapiFields.add("balance");
    openapiFields.add("remote_data");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("remote_id");
    openapiRequiredFields.add("currency");
    openapiRequiredFields.add("fingerprint");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("balance");
    openapiRequiredFields.add("remote_data");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to FinancialConnectionsAccount
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FinancialConnectionsAccount.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FinancialConnectionsAccount is not found in the empty JSON string", FinancialConnectionsAccount.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FinancialConnectionsAccount.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FinancialConnectionsAccount` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FinancialConnectionsAccount.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("remote_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `remote_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("remote_id").toString()));
      }
      if (!jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      if (!jsonObj.get("fingerprint").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fingerprint` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fingerprint").toString()));
      }
      // validate the optional field `institution`
      if (jsonObj.get("institution") != null && !jsonObj.get("institution").isJsonNull()) {
        FinancialConnectionsAccountInstitution.validateJsonElement(jsonObj.get("institution"));
      }
      if ((jsonObj.get("mask") != null && !jsonObj.get("mask").isJsonNull()) && !jsonObj.get("mask").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mask` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mask").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the required field `balance`
      FinancialConnectionsAccountCachedBalance.validateJsonElement(jsonObj.get("balance"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FinancialConnectionsAccount.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FinancialConnectionsAccount' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FinancialConnectionsAccount> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FinancialConnectionsAccount.class));

       return (TypeAdapter<T>) new TypeAdapter<FinancialConnectionsAccount>() {
           @Override
           public void write(JsonWriter out, FinancialConnectionsAccount value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FinancialConnectionsAccount read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FinancialConnectionsAccount given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FinancialConnectionsAccount
  * @throws IOException if the JSON string is invalid with respect to FinancialConnectionsAccount
  */
  public static FinancialConnectionsAccount fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FinancialConnectionsAccount.class);
  }

 /**
  * Convert an instance of FinancialConnectionsAccount to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

