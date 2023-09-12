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
import org.fuse.client.model.MigrateFinancialConnectionsAggregatorConnectionDataMx;
import org.fuse.client.model.MigrateFinancialConnectionsAggregatorConnectionDataPlaid;
import org.fuse.client.model.MigrateFinancialConnectionsAggregatorConnectionDataTeller;

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
 * The input data for the financial connections to be migrated into the unified Fuse API.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-12T15:13:43.182056Z[UTC]")
public class MigrateFinancialConnectionsAggregatorConnectionData {
  public static final String SERIALIZED_NAME_PLAID = "plaid";
  @SerializedName(SERIALIZED_NAME_PLAID)
  private MigrateFinancialConnectionsAggregatorConnectionDataPlaid plaid;

  public static final String SERIALIZED_NAME_MX = "mx";
  @SerializedName(SERIALIZED_NAME_MX)
  private MigrateFinancialConnectionsAggregatorConnectionDataMx mx;

  public static final String SERIALIZED_NAME_TELLER = "teller";
  @SerializedName(SERIALIZED_NAME_TELLER)
  private MigrateFinancialConnectionsAggregatorConnectionDataTeller teller;

  public MigrateFinancialConnectionsAggregatorConnectionData() {
  }

  public MigrateFinancialConnectionsAggregatorConnectionData plaid(MigrateFinancialConnectionsAggregatorConnectionDataPlaid plaid) {
    
    this.plaid = plaid;
    return this;
  }

   /**
   * Get plaid
   * @return plaid
  **/
  @javax.annotation.Nullable
  public MigrateFinancialConnectionsAggregatorConnectionDataPlaid getPlaid() {
    return plaid;
  }


  public void setPlaid(MigrateFinancialConnectionsAggregatorConnectionDataPlaid plaid) {
    this.plaid = plaid;
  }


  public MigrateFinancialConnectionsAggregatorConnectionData mx(MigrateFinancialConnectionsAggregatorConnectionDataMx mx) {
    
    this.mx = mx;
    return this;
  }

   /**
   * Get mx
   * @return mx
  **/
  @javax.annotation.Nullable
  public MigrateFinancialConnectionsAggregatorConnectionDataMx getMx() {
    return mx;
  }


  public void setMx(MigrateFinancialConnectionsAggregatorConnectionDataMx mx) {
    this.mx = mx;
  }


  public MigrateFinancialConnectionsAggregatorConnectionData teller(MigrateFinancialConnectionsAggregatorConnectionDataTeller teller) {
    
    this.teller = teller;
    return this;
  }

   /**
   * Get teller
   * @return teller
  **/
  @javax.annotation.Nullable
  public MigrateFinancialConnectionsAggregatorConnectionDataTeller getTeller() {
    return teller;
  }


  public void setTeller(MigrateFinancialConnectionsAggregatorConnectionDataTeller teller) {
    this.teller = teller;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MigrateFinancialConnectionsAggregatorConnectionData migrateFinancialConnectionsAggregatorConnectionData = (MigrateFinancialConnectionsAggregatorConnectionData) o;
    return Objects.equals(this.plaid, migrateFinancialConnectionsAggregatorConnectionData.plaid) &&
        Objects.equals(this.mx, migrateFinancialConnectionsAggregatorConnectionData.mx) &&
        Objects.equals(this.teller, migrateFinancialConnectionsAggregatorConnectionData.teller);
  }

  @Override
  public int hashCode() {
    return Objects.hash(plaid, mx, teller);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MigrateFinancialConnectionsAggregatorConnectionData {\n");
    sb.append("    plaid: ").append(toIndentedString(plaid)).append("\n");
    sb.append("    mx: ").append(toIndentedString(mx)).append("\n");
    sb.append("    teller: ").append(toIndentedString(teller)).append("\n");
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
    openapiFields.add("plaid");
    openapiFields.add("mx");
    openapiFields.add("teller");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to MigrateFinancialConnectionsAggregatorConnectionData
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MigrateFinancialConnectionsAggregatorConnectionData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MigrateFinancialConnectionsAggregatorConnectionData is not found in the empty JSON string", MigrateFinancialConnectionsAggregatorConnectionData.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!MigrateFinancialConnectionsAggregatorConnectionData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MigrateFinancialConnectionsAggregatorConnectionData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `plaid`
      if (jsonObj.get("plaid") != null && !jsonObj.get("plaid").isJsonNull()) {
        MigrateFinancialConnectionsAggregatorConnectionDataPlaid.validateJsonElement(jsonObj.get("plaid"));
      }
      // validate the optional field `mx`
      if (jsonObj.get("mx") != null && !jsonObj.get("mx").isJsonNull()) {
        MigrateFinancialConnectionsAggregatorConnectionDataMx.validateJsonElement(jsonObj.get("mx"));
      }
      // validate the optional field `teller`
      if (jsonObj.get("teller") != null && !jsonObj.get("teller").isJsonNull()) {
        MigrateFinancialConnectionsAggregatorConnectionDataTeller.validateJsonElement(jsonObj.get("teller"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MigrateFinancialConnectionsAggregatorConnectionData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MigrateFinancialConnectionsAggregatorConnectionData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MigrateFinancialConnectionsAggregatorConnectionData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MigrateFinancialConnectionsAggregatorConnectionData.class));

       return (TypeAdapter<T>) new TypeAdapter<MigrateFinancialConnectionsAggregatorConnectionData>() {
           @Override
           public void write(JsonWriter out, MigrateFinancialConnectionsAggregatorConnectionData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MigrateFinancialConnectionsAggregatorConnectionData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MigrateFinancialConnectionsAggregatorConnectionData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MigrateFinancialConnectionsAggregatorConnectionData
  * @throws IOException if the JSON string is invalid with respect to MigrateFinancialConnectionsAggregatorConnectionData
  */
  public static MigrateFinancialConnectionsAggregatorConnectionData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MigrateFinancialConnectionsAggregatorConnectionData.class);
  }

 /**
  * Convert an instance of MigrateFinancialConnectionsAggregatorConnectionData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

