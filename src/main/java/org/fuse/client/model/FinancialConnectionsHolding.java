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
import org.fuse.client.model.FinancialConnectionsInvestmentSecurity;

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
 * FinancialConnectionsHolding
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-12T15:13:43.182056Z[UTC]")
public class FinancialConnectionsHolding {
  public static final String SERIALIZED_NAME_REMOTE_ACCOUNT_ID = "remote_account_id";
  @SerializedName(SERIALIZED_NAME_REMOTE_ACCOUNT_ID)
  private String remoteAccountId;

  public static final String SERIALIZED_NAME_COST_BASIS = "cost_basis";
  @SerializedName(SERIALIZED_NAME_COST_BASIS)
  private BigDecimal costBasis;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private BigDecimal value;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private BigDecimal quantity;

  public static final String SERIALIZED_NAME_INSTITUTION_PRICE = "institution_price";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_PRICE)
  private BigDecimal institutionPrice;

  public static final String SERIALIZED_NAME_SECURITY = "security";
  @SerializedName(SERIALIZED_NAME_SECURITY)
  private FinancialConnectionsInvestmentSecurity security;

  public FinancialConnectionsHolding() {
  }

  public FinancialConnectionsHolding remoteAccountId(String remoteAccountId) {
    
    this.remoteAccountId = remoteAccountId;
    return this;
  }

   /**
   * The remote account ID associated with this holding.
   * @return remoteAccountId
  **/
  @javax.annotation.Nonnull
  public String getRemoteAccountId() {
    return remoteAccountId;
  }


  public void setRemoteAccountId(String remoteAccountId) {
    this.remoteAccountId = remoteAccountId;
  }


  public FinancialConnectionsHolding costBasis(BigDecimal costBasis) {
    
    this.costBasis = costBasis;
    return this;
  }

   /**
   * The original total value of the holding, in cents, when it was purchased. The format of this value is a double.
   * @return costBasis
  **/
  @javax.annotation.Nonnull
  public BigDecimal getCostBasis() {
    return costBasis;
  }


  public void setCostBasis(BigDecimal costBasis) {
    this.costBasis = costBasis;
  }


  public FinancialConnectionsHolding value(BigDecimal value) {
    
    this.value = value;
    return this;
  }

   /**
   * The current market value of the holding, in cents. The format of this value is a double.
   * @return value
  **/
  @javax.annotation.Nonnull
  public BigDecimal getValue() {
    return value;
  }


  public void setValue(BigDecimal value) {
    this.value = value;
  }


  public FinancialConnectionsHolding quantity(BigDecimal quantity) {
    
    this.quantity = quantity;
    return this;
  }

   /**
   * The number of units of the security held in this holding.
   * @return quantity
  **/
  @javax.annotation.Nonnull
  public BigDecimal getQuantity() {
    return quantity;
  }


  public void setQuantity(BigDecimal quantity) {
    this.quantity = quantity;
  }


  public FinancialConnectionsHolding institutionPrice(BigDecimal institutionPrice) {
    
    this.institutionPrice = institutionPrice;
    return this;
  }

   /**
   * The price of the security, in cents, as provided by the financial institution managing the holding. The format of this value is a double.
   * @return institutionPrice
  **/
  @javax.annotation.Nonnull
  public BigDecimal getInstitutionPrice() {
    return institutionPrice;
  }


  public void setInstitutionPrice(BigDecimal institutionPrice) {
    this.institutionPrice = institutionPrice;
  }


  public FinancialConnectionsHolding security(FinancialConnectionsInvestmentSecurity security) {
    
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
    FinancialConnectionsHolding financialConnectionsHolding = (FinancialConnectionsHolding) o;
    return Objects.equals(this.remoteAccountId, financialConnectionsHolding.remoteAccountId) &&
        Objects.equals(this.costBasis, financialConnectionsHolding.costBasis) &&
        Objects.equals(this.value, financialConnectionsHolding.value) &&
        Objects.equals(this.quantity, financialConnectionsHolding.quantity) &&
        Objects.equals(this.institutionPrice, financialConnectionsHolding.institutionPrice) &&
        Objects.equals(this.security, financialConnectionsHolding.security);
  }

  @Override
  public int hashCode() {
    return Objects.hash(remoteAccountId, costBasis, value, quantity, institutionPrice, security);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FinancialConnectionsHolding {\n");
    sb.append("    remoteAccountId: ").append(toIndentedString(remoteAccountId)).append("\n");
    sb.append("    costBasis: ").append(toIndentedString(costBasis)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    institutionPrice: ").append(toIndentedString(institutionPrice)).append("\n");
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
    openapiFields.add("remote_account_id");
    openapiFields.add("cost_basis");
    openapiFields.add("value");
    openapiFields.add("quantity");
    openapiFields.add("institution_price");
    openapiFields.add("security");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("remote_account_id");
    openapiRequiredFields.add("cost_basis");
    openapiRequiredFields.add("value");
    openapiRequiredFields.add("quantity");
    openapiRequiredFields.add("institution_price");
    openapiRequiredFields.add("security");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to FinancialConnectionsHolding
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FinancialConnectionsHolding.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FinancialConnectionsHolding is not found in the empty JSON string", FinancialConnectionsHolding.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FinancialConnectionsHolding.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FinancialConnectionsHolding` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FinancialConnectionsHolding.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("remote_account_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `remote_account_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("remote_account_id").toString()));
      }
      // validate the required field `security`
      FinancialConnectionsInvestmentSecurity.validateJsonElement(jsonObj.get("security"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FinancialConnectionsHolding.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FinancialConnectionsHolding' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FinancialConnectionsHolding> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FinancialConnectionsHolding.class));

       return (TypeAdapter<T>) new TypeAdapter<FinancialConnectionsHolding>() {
           @Override
           public void write(JsonWriter out, FinancialConnectionsHolding value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FinancialConnectionsHolding read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FinancialConnectionsHolding given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FinancialConnectionsHolding
  * @throws IOException if the JSON string is invalid with respect to FinancialConnectionsHolding
  */
  public static FinancialConnectionsHolding fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FinancialConnectionsHolding.class);
  }

 /**
  * Convert an instance of FinancialConnectionsHolding to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

