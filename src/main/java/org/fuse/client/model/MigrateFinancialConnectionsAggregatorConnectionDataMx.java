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
 * Details of the MX connection to migrate into the unified Fuse API.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-23T12:03:45.546785Z[UTC]")
public class MigrateFinancialConnectionsAggregatorConnectionDataMx {
  public static final String SERIALIZED_NAME_USER_GUID = "user_guid";
  @SerializedName(SERIALIZED_NAME_USER_GUID)
  private String userGuid;

  public static final String SERIALIZED_NAME_MEMBER_GUID = "member_guid";
  @SerializedName(SERIALIZED_NAME_MEMBER_GUID)
  private String memberGuid;

  public MigrateFinancialConnectionsAggregatorConnectionDataMx() {
  }

  public MigrateFinancialConnectionsAggregatorConnectionDataMx userGuid(String userGuid) {
    this.userGuid = userGuid;
    return this;
  }

   /**
   * The unique identifier (GUID) of the user within the MX platform.
   * @return userGuid
  **/
  @javax.annotation.Nonnull
  public String getUserGuid() {
    return userGuid;
  }

  public void setUserGuid(String userGuid) {
    this.userGuid = userGuid;
  }


  public MigrateFinancialConnectionsAggregatorConnectionDataMx memberGuid(String memberGuid) {
    this.memberGuid = memberGuid;
    return this;
  }

   /**
   * The unique identifier (GUID) of the member (connection) associated with the user within the MX platform.
   * @return memberGuid
  **/
  @javax.annotation.Nullable
  public String getMemberGuid() {
    return memberGuid;
  }

  public void setMemberGuid(String memberGuid) {
    this.memberGuid = memberGuid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MigrateFinancialConnectionsAggregatorConnectionDataMx migrateFinancialConnectionsAggregatorConnectionDataMx = (MigrateFinancialConnectionsAggregatorConnectionDataMx) o;
    return Objects.equals(this.userGuid, migrateFinancialConnectionsAggregatorConnectionDataMx.userGuid) &&
        Objects.equals(this.memberGuid, migrateFinancialConnectionsAggregatorConnectionDataMx.memberGuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userGuid, memberGuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MigrateFinancialConnectionsAggregatorConnectionDataMx {\n");
    sb.append("    userGuid: ").append(toIndentedString(userGuid)).append("\n");
    sb.append("    memberGuid: ").append(toIndentedString(memberGuid)).append("\n");
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
    openapiFields.add("user_guid");
    openapiFields.add("member_guid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("user_guid");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to MigrateFinancialConnectionsAggregatorConnectionDataMx
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MigrateFinancialConnectionsAggregatorConnectionDataMx.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MigrateFinancialConnectionsAggregatorConnectionDataMx is not found in the empty JSON string", MigrateFinancialConnectionsAggregatorConnectionDataMx.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MigrateFinancialConnectionsAggregatorConnectionDataMx.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MigrateFinancialConnectionsAggregatorConnectionDataMx` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MigrateFinancialConnectionsAggregatorConnectionDataMx.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("user_guid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_guid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_guid").toString()));
      }
      if ((jsonObj.get("member_guid") != null && !jsonObj.get("member_guid").isJsonNull()) && !jsonObj.get("member_guid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `member_guid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("member_guid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MigrateFinancialConnectionsAggregatorConnectionDataMx.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MigrateFinancialConnectionsAggregatorConnectionDataMx' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MigrateFinancialConnectionsAggregatorConnectionDataMx> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MigrateFinancialConnectionsAggregatorConnectionDataMx.class));

       return (TypeAdapter<T>) new TypeAdapter<MigrateFinancialConnectionsAggregatorConnectionDataMx>() {
           @Override
           public void write(JsonWriter out, MigrateFinancialConnectionsAggregatorConnectionDataMx value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MigrateFinancialConnectionsAggregatorConnectionDataMx read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MigrateFinancialConnectionsAggregatorConnectionDataMx given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MigrateFinancialConnectionsAggregatorConnectionDataMx
  * @throws IOException if the JSON string is invalid with respect to MigrateFinancialConnectionsAggregatorConnectionDataMx
  */
  public static MigrateFinancialConnectionsAggregatorConnectionDataMx fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MigrateFinancialConnectionsAggregatorConnectionDataMx.class);
  }

 /**
  * Convert an instance of MigrateFinancialConnectionsAggregatorConnectionDataMx to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

