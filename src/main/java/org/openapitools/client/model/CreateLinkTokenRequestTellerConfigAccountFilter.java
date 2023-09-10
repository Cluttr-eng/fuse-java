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
import org.openapitools.client.model.CreateLinkTokenRequestTellerConfigAccountFilterCredit;
import org.openapitools.client.model.CreateLinkTokenRequestTellerConfigAccountFilterDepository;

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
 * Filter the types of account returned by Teller when enrolling a customer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-10T13:19:07.464573Z[UTC]")
public class CreateLinkTokenRequestTellerConfigAccountFilter {
  public static final String SERIALIZED_NAME_DEPOSITORY = "depository";
  @SerializedName(SERIALIZED_NAME_DEPOSITORY)
  private CreateLinkTokenRequestTellerConfigAccountFilterDepository depository;

  public static final String SERIALIZED_NAME_CREDIT = "credit";
  @SerializedName(SERIALIZED_NAME_CREDIT)
  private CreateLinkTokenRequestTellerConfigAccountFilterCredit credit;

  public CreateLinkTokenRequestTellerConfigAccountFilter() {
  }

  public CreateLinkTokenRequestTellerConfigAccountFilter depository(CreateLinkTokenRequestTellerConfigAccountFilterDepository depository) {
    
    this.depository = depository;
    return this;
  }

   /**
   * Get depository
   * @return depository
  **/
  @javax.annotation.Nullable
  public CreateLinkTokenRequestTellerConfigAccountFilterDepository getDepository() {
    return depository;
  }


  public void setDepository(CreateLinkTokenRequestTellerConfigAccountFilterDepository depository) {
    this.depository = depository;
  }


  public CreateLinkTokenRequestTellerConfigAccountFilter credit(CreateLinkTokenRequestTellerConfigAccountFilterCredit credit) {
    
    this.credit = credit;
    return this;
  }

   /**
   * Get credit
   * @return credit
  **/
  @javax.annotation.Nullable
  public CreateLinkTokenRequestTellerConfigAccountFilterCredit getCredit() {
    return credit;
  }


  public void setCredit(CreateLinkTokenRequestTellerConfigAccountFilterCredit credit) {
    this.credit = credit;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateLinkTokenRequestTellerConfigAccountFilter createLinkTokenRequestTellerConfigAccountFilter = (CreateLinkTokenRequestTellerConfigAccountFilter) o;
    return Objects.equals(this.depository, createLinkTokenRequestTellerConfigAccountFilter.depository) &&
        Objects.equals(this.credit, createLinkTokenRequestTellerConfigAccountFilter.credit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(depository, credit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateLinkTokenRequestTellerConfigAccountFilter {\n");
    sb.append("    depository: ").append(toIndentedString(depository)).append("\n");
    sb.append("    credit: ").append(toIndentedString(credit)).append("\n");
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
    openapiFields.add("depository");
    openapiFields.add("credit");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateLinkTokenRequestTellerConfigAccountFilter
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateLinkTokenRequestTellerConfigAccountFilter.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateLinkTokenRequestTellerConfigAccountFilter is not found in the empty JSON string", CreateLinkTokenRequestTellerConfigAccountFilter.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateLinkTokenRequestTellerConfigAccountFilter.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateLinkTokenRequestTellerConfigAccountFilter` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `depository`
      if (jsonObj.get("depository") != null && !jsonObj.get("depository").isJsonNull()) {
        CreateLinkTokenRequestTellerConfigAccountFilterDepository.validateJsonElement(jsonObj.get("depository"));
      }
      // validate the optional field `credit`
      if (jsonObj.get("credit") != null && !jsonObj.get("credit").isJsonNull()) {
        CreateLinkTokenRequestTellerConfigAccountFilterCredit.validateJsonElement(jsonObj.get("credit"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateLinkTokenRequestTellerConfigAccountFilter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateLinkTokenRequestTellerConfigAccountFilter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateLinkTokenRequestTellerConfigAccountFilter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateLinkTokenRequestTellerConfigAccountFilter.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateLinkTokenRequestTellerConfigAccountFilter>() {
           @Override
           public void write(JsonWriter out, CreateLinkTokenRequestTellerConfigAccountFilter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateLinkTokenRequestTellerConfigAccountFilter read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateLinkTokenRequestTellerConfigAccountFilter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateLinkTokenRequestTellerConfigAccountFilter
  * @throws IOException if the JSON string is invalid with respect to CreateLinkTokenRequestTellerConfigAccountFilter
  */
  public static CreateLinkTokenRequestTellerConfigAccountFilter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateLinkTokenRequestTellerConfigAccountFilter.class);
  }

 /**
  * Convert an instance of CreateLinkTokenRequestTellerConfigAccountFilter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

