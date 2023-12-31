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
 * CreateLinkTokenRequestTellerConfigAccountFilterCreditOneOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-12T15:13:43.182056Z[UTC]")
public class CreateLinkTokenRequestTellerConfigAccountFilterCreditOneOf {
  /**
   * Gets or Sets subtypes
   */
  @JsonAdapter(SubtypesEnum.Adapter.class)
  public enum SubtypesEnum {
    CREDIT_CARD("credit_card");

    private String value;

    SubtypesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SubtypesEnum fromValue(String value) {
      for (SubtypesEnum b : SubtypesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SubtypesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SubtypesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SubtypesEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SubtypesEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SUBTYPES = "subtypes";
  @SerializedName(SERIALIZED_NAME_SUBTYPES)
  private List<SubtypesEnum> subtypes;

  public CreateLinkTokenRequestTellerConfigAccountFilterCreditOneOf() {
  }

  public CreateLinkTokenRequestTellerConfigAccountFilterCreditOneOf subtypes(List<SubtypesEnum> subtypes) {
    
    this.subtypes = subtypes;
    return this;
  }

  public CreateLinkTokenRequestTellerConfigAccountFilterCreditOneOf addSubtypesItem(SubtypesEnum subtypesItem) {
    if (this.subtypes == null) {
      this.subtypes = new ArrayList<>();
    }
    this.subtypes.add(subtypesItem);
    return this;
  }

   /**
   * Get subtypes
   * @return subtypes
  **/
  @javax.annotation.Nullable
  public List<SubtypesEnum> getSubtypes() {
    return subtypes;
  }


  public void setSubtypes(List<SubtypesEnum> subtypes) {
    this.subtypes = subtypes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateLinkTokenRequestTellerConfigAccountFilterCreditOneOf createLinkTokenRequestTellerConfigAccountFilterCreditOneOf = (CreateLinkTokenRequestTellerConfigAccountFilterCreditOneOf) o;
    return Objects.equals(this.subtypes, createLinkTokenRequestTellerConfigAccountFilterCreditOneOf.subtypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subtypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateLinkTokenRequestTellerConfigAccountFilterCreditOneOf {\n");
    sb.append("    subtypes: ").append(toIndentedString(subtypes)).append("\n");
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
    openapiFields.add("subtypes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateLinkTokenRequestTellerConfigAccountFilterCreditOneOf
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateLinkTokenRequestTellerConfigAccountFilterCreditOneOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateLinkTokenRequestTellerConfigAccountFilterCreditOneOf is not found in the empty JSON string", CreateLinkTokenRequestTellerConfigAccountFilterCreditOneOf.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateLinkTokenRequestTellerConfigAccountFilterCreditOneOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateLinkTokenRequestTellerConfigAccountFilterCreditOneOf` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("subtypes") != null && !jsonObj.get("subtypes").isJsonNull() && !jsonObj.get("subtypes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `subtypes` to be an array in the JSON string but got `%s`", jsonObj.get("subtypes").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateLinkTokenRequestTellerConfigAccountFilterCreditOneOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateLinkTokenRequestTellerConfigAccountFilterCreditOneOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateLinkTokenRequestTellerConfigAccountFilterCreditOneOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateLinkTokenRequestTellerConfigAccountFilterCreditOneOf.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateLinkTokenRequestTellerConfigAccountFilterCreditOneOf>() {
           @Override
           public void write(JsonWriter out, CreateLinkTokenRequestTellerConfigAccountFilterCreditOneOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateLinkTokenRequestTellerConfigAccountFilterCreditOneOf read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateLinkTokenRequestTellerConfigAccountFilterCreditOneOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateLinkTokenRequestTellerConfigAccountFilterCreditOneOf
  * @throws IOException if the JSON string is invalid with respect to CreateLinkTokenRequestTellerConfigAccountFilterCreditOneOf
  */
  public static CreateLinkTokenRequestTellerConfigAccountFilterCreditOneOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateLinkTokenRequestTellerConfigAccountFilterCreditOneOf.class);
  }

 /**
  * Convert an instance of CreateLinkTokenRequestTellerConfigAccountFilterCreditOneOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

