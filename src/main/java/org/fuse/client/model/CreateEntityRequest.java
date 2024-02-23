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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.fuse.client.model.Aggregator;

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
 * CreateEntityRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-23T12:03:45.546785Z[UTC]")
public class CreateEntityRequest {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_AGGREGATORS = "aggregators";
  @SerializedName(SERIALIZED_NAME_AGGREGATORS)
  private List<Aggregator> aggregators;

  public static final String SERIALIZED_NAME_INSTITUTION_IDS = "institution_ids";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_IDS)
  private List<String> institutionIds;

  public CreateEntityRequest() {
  }

  public CreateEntityRequest id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Id of the entity
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public CreateEntityRequest email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Email of the entity
   * @return email
  **/
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public CreateEntityRequest aggregators(List<Aggregator> aggregators) {
    this.aggregators = aggregators;
    return this;
  }

  public CreateEntityRequest addAggregatorsItem(Aggregator aggregatorsItem) {
    if (this.aggregators == null) {
      this.aggregators = new ArrayList<>();
    }
    this.aggregators.add(aggregatorsItem);
    return this;
  }

   /**
   * These will force the user to connect through all of these aggregators
   * @return aggregators
  **/
  @javax.annotation.Nullable
  public List<Aggregator> getAggregators() {
    return aggregators;
  }

  public void setAggregators(List<Aggregator> aggregators) {
    this.aggregators = aggregators;
  }


  public CreateEntityRequest institutionIds(List<String> institutionIds) {
    this.institutionIds = institutionIds;
    return this;
  }

  public CreateEntityRequest addInstitutionIdsItem(String institutionIdsItem) {
    if (this.institutionIds == null) {
      this.institutionIds = new ArrayList<>();
    }
    this.institutionIds.add(institutionIdsItem);
    return this;
  }

   /**
   * Get institutionIds
   * @return institutionIds
  **/
  @javax.annotation.Nullable
  public List<String> getInstitutionIds() {
    return institutionIds;
  }

  public void setInstitutionIds(List<String> institutionIds) {
    this.institutionIds = institutionIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateEntityRequest createEntityRequest = (CreateEntityRequest) o;
    return Objects.equals(this.id, createEntityRequest.id) &&
        Objects.equals(this.email, createEntityRequest.email) &&
        Objects.equals(this.aggregators, createEntityRequest.aggregators) &&
        Objects.equals(this.institutionIds, createEntityRequest.institutionIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, email, aggregators, institutionIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateEntityRequest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    aggregators: ").append(toIndentedString(aggregators)).append("\n");
    sb.append("    institutionIds: ").append(toIndentedString(institutionIds)).append("\n");
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
    openapiFields.add("email");
    openapiFields.add("aggregators");
    openapiFields.add("institution_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateEntityRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateEntityRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateEntityRequest is not found in the empty JSON string", CreateEntityRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateEntityRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateEntityRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("aggregators") != null && !jsonObj.get("aggregators").isJsonNull() && !jsonObj.get("aggregators").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `aggregators` to be an array in the JSON string but got `%s`", jsonObj.get("aggregators").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("institution_ids") != null && !jsonObj.get("institution_ids").isJsonNull() && !jsonObj.get("institution_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `institution_ids` to be an array in the JSON string but got `%s`", jsonObj.get("institution_ids").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateEntityRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateEntityRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateEntityRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateEntityRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateEntityRequest>() {
           @Override
           public void write(JsonWriter out, CreateEntityRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateEntityRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateEntityRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateEntityRequest
  * @throws IOException if the JSON string is invalid with respect to CreateEntityRequest
  */
  public static CreateEntityRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateEntityRequest.class);
  }

 /**
  * Convert an instance of CreateEntityRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

