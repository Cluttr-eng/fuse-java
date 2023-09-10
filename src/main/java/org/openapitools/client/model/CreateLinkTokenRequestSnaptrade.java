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
import org.openapitools.client.model.CreateLinkTokenRequestSnaptradeConfig;

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
 * An object specifying information about the SnapTrade configuration to use when creating a link token. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-10T13:25:52.697721Z[UTC]")
public class CreateLinkTokenRequestSnaptrade {
  public static final String SERIALIZED_NAME_CONFIG = "config";
  @SerializedName(SERIALIZED_NAME_CONFIG)
  private CreateLinkTokenRequestSnaptradeConfig config;

  public CreateLinkTokenRequestSnaptrade() {
  }

  public CreateLinkTokenRequestSnaptrade config(CreateLinkTokenRequestSnaptradeConfig config) {
    
    this.config = config;
    return this;
  }

   /**
   * Get config
   * @return config
  **/
  @javax.annotation.Nullable
  public CreateLinkTokenRequestSnaptradeConfig getConfig() {
    return config;
  }


  public void setConfig(CreateLinkTokenRequestSnaptradeConfig config) {
    this.config = config;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateLinkTokenRequestSnaptrade createLinkTokenRequestSnaptrade = (CreateLinkTokenRequestSnaptrade) o;
    return Objects.equals(this.config, createLinkTokenRequestSnaptrade.config);
  }

  @Override
  public int hashCode() {
    return Objects.hash(config);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateLinkTokenRequestSnaptrade {\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
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
    openapiFields.add("config");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateLinkTokenRequestSnaptrade
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateLinkTokenRequestSnaptrade.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateLinkTokenRequestSnaptrade is not found in the empty JSON string", CreateLinkTokenRequestSnaptrade.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateLinkTokenRequestSnaptrade.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateLinkTokenRequestSnaptrade` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `config`
      if (jsonObj.get("config") != null && !jsonObj.get("config").isJsonNull()) {
        CreateLinkTokenRequestSnaptradeConfig.validateJsonElement(jsonObj.get("config"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateLinkTokenRequestSnaptrade.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateLinkTokenRequestSnaptrade' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateLinkTokenRequestSnaptrade> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateLinkTokenRequestSnaptrade.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateLinkTokenRequestSnaptrade>() {
           @Override
           public void write(JsonWriter out, CreateLinkTokenRequestSnaptrade value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateLinkTokenRequestSnaptrade read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateLinkTokenRequestSnaptrade given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateLinkTokenRequestSnaptrade
  * @throws IOException if the JSON string is invalid with respect to CreateLinkTokenRequestSnaptrade
  */
  public static CreateLinkTokenRequestSnaptrade fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateLinkTokenRequestSnaptrade.class);
  }

 /**
  * Convert an instance of CreateLinkTokenRequestSnaptrade to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

