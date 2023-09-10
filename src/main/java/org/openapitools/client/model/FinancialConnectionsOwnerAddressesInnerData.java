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

import org.openapitools.client.JSON;

/**
 * FinancialConnectionsOwnerAddressesInnerData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-10T13:25:52.697721Z[UTC]")
public class FinancialConnectionsOwnerAddressesInnerData {
  public static final String SERIALIZED_NAME_FULL_ADDRESS = "full_address";
  @SerializedName(SERIALIZED_NAME_FULL_ADDRESS)
  private String fullAddress;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_POSTAL_CODE = "postal_code";
  @SerializedName(SERIALIZED_NAME_POSTAL_CODE)
  private String postalCode;

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private String region;

  public static final String SERIALIZED_NAME_STREET = "street";
  @SerializedName(SERIALIZED_NAME_STREET)
  private String street;

  public FinancialConnectionsOwnerAddressesInnerData() {
  }

  public FinancialConnectionsOwnerAddressesInnerData fullAddress(String fullAddress) {
    
    this.fullAddress = fullAddress;
    return this;
  }

   /**
   * Full address of the owner
   * @return fullAddress
  **/
  @javax.annotation.Nullable
  public String getFullAddress() {
    return fullAddress;
  }


  public void setFullAddress(String fullAddress) {
    this.fullAddress = fullAddress;
  }


  public FinancialConnectionsOwnerAddressesInnerData city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * City of the address
   * @return city
  **/
  @javax.annotation.Nullable
  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public FinancialConnectionsOwnerAddressesInnerData country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * Country of the address
   * @return country
  **/
  @javax.annotation.Nullable
  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public FinancialConnectionsOwnerAddressesInnerData postalCode(String postalCode) {
    
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Postal code of the address
   * @return postalCode
  **/
  @javax.annotation.Nullable
  public String getPostalCode() {
    return postalCode;
  }


  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  public FinancialConnectionsOwnerAddressesInnerData region(String region) {
    
    this.region = region;
    return this;
  }

   /**
   * Region of the address
   * @return region
  **/
  @javax.annotation.Nullable
  public String getRegion() {
    return region;
  }


  public void setRegion(String region) {
    this.region = region;
  }


  public FinancialConnectionsOwnerAddressesInnerData street(String street) {
    
    this.street = street;
    return this;
  }

   /**
   * Street of the address
   * @return street
  **/
  @javax.annotation.Nullable
  public String getStreet() {
    return street;
  }


  public void setStreet(String street) {
    this.street = street;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FinancialConnectionsOwnerAddressesInnerData financialConnectionsOwnerAddressesInnerData = (FinancialConnectionsOwnerAddressesInnerData) o;
    return Objects.equals(this.fullAddress, financialConnectionsOwnerAddressesInnerData.fullAddress) &&
        Objects.equals(this.city, financialConnectionsOwnerAddressesInnerData.city) &&
        Objects.equals(this.country, financialConnectionsOwnerAddressesInnerData.country) &&
        Objects.equals(this.postalCode, financialConnectionsOwnerAddressesInnerData.postalCode) &&
        Objects.equals(this.region, financialConnectionsOwnerAddressesInnerData.region) &&
        Objects.equals(this.street, financialConnectionsOwnerAddressesInnerData.street);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullAddress, city, country, postalCode, region, street);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FinancialConnectionsOwnerAddressesInnerData {\n");
    sb.append("    fullAddress: ").append(toIndentedString(fullAddress)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
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
    openapiFields.add("full_address");
    openapiFields.add("city");
    openapiFields.add("country");
    openapiFields.add("postal_code");
    openapiFields.add("region");
    openapiFields.add("street");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to FinancialConnectionsOwnerAddressesInnerData
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FinancialConnectionsOwnerAddressesInnerData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FinancialConnectionsOwnerAddressesInnerData is not found in the empty JSON string", FinancialConnectionsOwnerAddressesInnerData.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FinancialConnectionsOwnerAddressesInnerData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FinancialConnectionsOwnerAddressesInnerData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("full_address") != null && !jsonObj.get("full_address").isJsonNull()) && !jsonObj.get("full_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `full_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("full_address").toString()));
      }
      if ((jsonObj.get("city") != null && !jsonObj.get("city").isJsonNull()) && !jsonObj.get("city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city").toString()));
      }
      if ((jsonObj.get("country") != null && !jsonObj.get("country").isJsonNull()) && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if ((jsonObj.get("postal_code") != null && !jsonObj.get("postal_code").isJsonNull()) && !jsonObj.get("postal_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `postal_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("postal_code").toString()));
      }
      if ((jsonObj.get("region") != null && !jsonObj.get("region").isJsonNull()) && !jsonObj.get("region").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `region` to be a primitive type in the JSON string but got `%s`", jsonObj.get("region").toString()));
      }
      if ((jsonObj.get("street") != null && !jsonObj.get("street").isJsonNull()) && !jsonObj.get("street").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `street` to be a primitive type in the JSON string but got `%s`", jsonObj.get("street").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FinancialConnectionsOwnerAddressesInnerData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FinancialConnectionsOwnerAddressesInnerData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FinancialConnectionsOwnerAddressesInnerData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FinancialConnectionsOwnerAddressesInnerData.class));

       return (TypeAdapter<T>) new TypeAdapter<FinancialConnectionsOwnerAddressesInnerData>() {
           @Override
           public void write(JsonWriter out, FinancialConnectionsOwnerAddressesInnerData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FinancialConnectionsOwnerAddressesInnerData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FinancialConnectionsOwnerAddressesInnerData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FinancialConnectionsOwnerAddressesInnerData
  * @throws IOException if the JSON string is invalid with respect to FinancialConnectionsOwnerAddressesInnerData
  */
  public static FinancialConnectionsOwnerAddressesInnerData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FinancialConnectionsOwnerAddressesInnerData.class);
  }

 /**
  * Convert an instance of FinancialConnectionsOwnerAddressesInnerData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

