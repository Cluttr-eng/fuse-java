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
import org.openapitools.client.model.CreateLinkTokenRequestMx;
import org.openapitools.client.model.CreateLinkTokenRequestPlaid;
import org.openapitools.client.model.CreateLinkTokenRequestSnaptrade;
import org.openapitools.client.model.CreateLinkTokenRequestTeller;
import org.openapitools.client.model.Entity;

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
 * CreateLinkTokenRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-10T13:19:07.464573Z[UTC]")
public class CreateLinkTokenRequest {
  public static final String SERIALIZED_NAME_INSTITUTION_ID = "institution_id";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_ID)
  private String institutionId;

  public static final String SERIALIZED_NAME_ENTITY = "entity";
  @SerializedName(SERIALIZED_NAME_ENTITY)
  private Entity entity;

  public static final String SERIALIZED_NAME_CLIENT_NAME = "client_name";
  @SerializedName(SERIALIZED_NAME_CLIENT_NAME)
  private String clientName;

  public static final String SERIALIZED_NAME_SESSION_CLIENT_SECRET = "session_client_secret";
  @SerializedName(SERIALIZED_NAME_SESSION_CLIENT_SECRET)
  private String sessionClientSecret;

  public static final String SERIALIZED_NAME_WEBHOOK_URL = "webhook_url";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_URL)
  private String webhookUrl;

  public static final String SERIALIZED_NAME_MX = "mx";
  @SerializedName(SERIALIZED_NAME_MX)
  private CreateLinkTokenRequestMx mx;

  public static final String SERIALIZED_NAME_PLAID = "plaid";
  @SerializedName(SERIALIZED_NAME_PLAID)
  private CreateLinkTokenRequestPlaid plaid;

  public static final String SERIALIZED_NAME_TELLER = "teller";
  @SerializedName(SERIALIZED_NAME_TELLER)
  private CreateLinkTokenRequestTeller teller;

  public static final String SERIALIZED_NAME_SNAPTRADE = "snaptrade";
  @SerializedName(SERIALIZED_NAME_SNAPTRADE)
  private CreateLinkTokenRequestSnaptrade snaptrade;

  public CreateLinkTokenRequest() {
  }

  public CreateLinkTokenRequest institutionId(String institutionId) {
    
    this.institutionId = institutionId;
    return this;
  }

   /**
   * An id that is unique for an institution.
   * @return institutionId
  **/
  @javax.annotation.Nonnull
  public String getInstitutionId() {
    return institutionId;
  }


  public void setInstitutionId(String institutionId) {
    this.institutionId = institutionId;
  }


  public CreateLinkTokenRequest entity(Entity entity) {
    
    this.entity = entity;
    return this;
  }

   /**
   * Get entity
   * @return entity
  **/
  @javax.annotation.Nonnull
  public Entity getEntity() {
    return entity;
  }


  public void setEntity(Entity entity) {
    this.entity = entity;
  }


  public CreateLinkTokenRequest clientName(String clientName) {
    
    this.clientName = clientName;
    return this;
  }

   /**
   * The name of your application. This is what will be displayed to users.
   * @return clientName
  **/
  @javax.annotation.Nonnull
  public String getClientName() {
    return clientName;
  }


  public void setClientName(String clientName) {
    this.clientName = clientName;
  }


  public CreateLinkTokenRequest sessionClientSecret(String sessionClientSecret) {
    
    this.sessionClientSecret = sessionClientSecret;
    return this;
  }

   /**
   * The session client secret created from the &#39;Create session client secret&#39; endpoint
   * @return sessionClientSecret
  **/
  @javax.annotation.Nonnull
  public String getSessionClientSecret() {
    return sessionClientSecret;
  }


  public void setSessionClientSecret(String sessionClientSecret) {
    this.sessionClientSecret = sessionClientSecret;
  }


  public CreateLinkTokenRequest webhookUrl(String webhookUrl) {
    
    this.webhookUrl = webhookUrl;
    return this;
  }

   /**
   * This field allows you to set a unique webhook URL for each individual entity. By specifying an entity-specific webhook URL, you can receive and process data events for each entity separately. If this field is left empty, the organization-wide webhook URL set in the sandbox/production environment will be used as the default for all entities.
   * @return webhookUrl
  **/
  @javax.annotation.Nullable
  public String getWebhookUrl() {
    return webhookUrl;
  }


  public void setWebhookUrl(String webhookUrl) {
    this.webhookUrl = webhookUrl;
  }


  public CreateLinkTokenRequest mx(CreateLinkTokenRequestMx mx) {
    
    this.mx = mx;
    return this;
  }

   /**
   * Get mx
   * @return mx
  **/
  @javax.annotation.Nullable
  public CreateLinkTokenRequestMx getMx() {
    return mx;
  }


  public void setMx(CreateLinkTokenRequestMx mx) {
    this.mx = mx;
  }


  public CreateLinkTokenRequest plaid(CreateLinkTokenRequestPlaid plaid) {
    
    this.plaid = plaid;
    return this;
  }

   /**
   * Get plaid
   * @return plaid
  **/
  @javax.annotation.Nullable
  public CreateLinkTokenRequestPlaid getPlaid() {
    return plaid;
  }


  public void setPlaid(CreateLinkTokenRequestPlaid plaid) {
    this.plaid = plaid;
  }


  public CreateLinkTokenRequest teller(CreateLinkTokenRequestTeller teller) {
    
    this.teller = teller;
    return this;
  }

   /**
   * Get teller
   * @return teller
  **/
  @javax.annotation.Nullable
  public CreateLinkTokenRequestTeller getTeller() {
    return teller;
  }


  public void setTeller(CreateLinkTokenRequestTeller teller) {
    this.teller = teller;
  }


  public CreateLinkTokenRequest snaptrade(CreateLinkTokenRequestSnaptrade snaptrade) {
    
    this.snaptrade = snaptrade;
    return this;
  }

   /**
   * Get snaptrade
   * @return snaptrade
  **/
  @javax.annotation.Nullable
  public CreateLinkTokenRequestSnaptrade getSnaptrade() {
    return snaptrade;
  }


  public void setSnaptrade(CreateLinkTokenRequestSnaptrade snaptrade) {
    this.snaptrade = snaptrade;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateLinkTokenRequest createLinkTokenRequest = (CreateLinkTokenRequest) o;
    return Objects.equals(this.institutionId, createLinkTokenRequest.institutionId) &&
        Objects.equals(this.entity, createLinkTokenRequest.entity) &&
        Objects.equals(this.clientName, createLinkTokenRequest.clientName) &&
        Objects.equals(this.sessionClientSecret, createLinkTokenRequest.sessionClientSecret) &&
        Objects.equals(this.webhookUrl, createLinkTokenRequest.webhookUrl) &&
        Objects.equals(this.mx, createLinkTokenRequest.mx) &&
        Objects.equals(this.plaid, createLinkTokenRequest.plaid) &&
        Objects.equals(this.teller, createLinkTokenRequest.teller) &&
        Objects.equals(this.snaptrade, createLinkTokenRequest.snaptrade);
  }

  @Override
  public int hashCode() {
    return Objects.hash(institutionId, entity, clientName, sessionClientSecret, webhookUrl, mx, plaid, teller, snaptrade);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateLinkTokenRequest {\n");
    sb.append("    institutionId: ").append(toIndentedString(institutionId)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    clientName: ").append(toIndentedString(clientName)).append("\n");
    sb.append("    sessionClientSecret: ").append(toIndentedString(sessionClientSecret)).append("\n");
    sb.append("    webhookUrl: ").append(toIndentedString(webhookUrl)).append("\n");
    sb.append("    mx: ").append(toIndentedString(mx)).append("\n");
    sb.append("    plaid: ").append(toIndentedString(plaid)).append("\n");
    sb.append("    teller: ").append(toIndentedString(teller)).append("\n");
    sb.append("    snaptrade: ").append(toIndentedString(snaptrade)).append("\n");
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
    openapiFields.add("institution_id");
    openapiFields.add("entity");
    openapiFields.add("client_name");
    openapiFields.add("session_client_secret");
    openapiFields.add("webhook_url");
    openapiFields.add("mx");
    openapiFields.add("plaid");
    openapiFields.add("teller");
    openapiFields.add("snaptrade");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("institution_id");
    openapiRequiredFields.add("entity");
    openapiRequiredFields.add("client_name");
    openapiRequiredFields.add("session_client_secret");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateLinkTokenRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateLinkTokenRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateLinkTokenRequest is not found in the empty JSON string", CreateLinkTokenRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateLinkTokenRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateLinkTokenRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateLinkTokenRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("institution_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `institution_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("institution_id").toString()));
      }
      // validate the required field `entity`
      Entity.validateJsonElement(jsonObj.get("entity"));
      if (!jsonObj.get("client_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `client_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("client_name").toString()));
      }
      if (!jsonObj.get("session_client_secret").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `session_client_secret` to be a primitive type in the JSON string but got `%s`", jsonObj.get("session_client_secret").toString()));
      }
      if ((jsonObj.get("webhook_url") != null && !jsonObj.get("webhook_url").isJsonNull()) && !jsonObj.get("webhook_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `webhook_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("webhook_url").toString()));
      }
      // validate the optional field `mx`
      if (jsonObj.get("mx") != null && !jsonObj.get("mx").isJsonNull()) {
        CreateLinkTokenRequestMx.validateJsonElement(jsonObj.get("mx"));
      }
      // validate the optional field `plaid`
      if (jsonObj.get("plaid") != null && !jsonObj.get("plaid").isJsonNull()) {
        CreateLinkTokenRequestPlaid.validateJsonElement(jsonObj.get("plaid"));
      }
      // validate the optional field `teller`
      if (jsonObj.get("teller") != null && !jsonObj.get("teller").isJsonNull()) {
        CreateLinkTokenRequestTeller.validateJsonElement(jsonObj.get("teller"));
      }
      // validate the optional field `snaptrade`
      if (jsonObj.get("snaptrade") != null && !jsonObj.get("snaptrade").isJsonNull()) {
        CreateLinkTokenRequestSnaptrade.validateJsonElement(jsonObj.get("snaptrade"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateLinkTokenRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateLinkTokenRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateLinkTokenRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateLinkTokenRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateLinkTokenRequest>() {
           @Override
           public void write(JsonWriter out, CreateLinkTokenRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateLinkTokenRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateLinkTokenRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateLinkTokenRequest
  * @throws IOException if the JSON string is invalid with respect to CreateLinkTokenRequest
  */
  public static CreateLinkTokenRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateLinkTokenRequest.class);
  }

 /**
  * Convert an instance of CreateLinkTokenRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

