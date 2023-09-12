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
import org.fuse.client.model.Aggregator;
import org.fuse.client.model.FinancialConnectionDetailsAkoya;
import org.fuse.client.model.FinancialConnectionDetailsBasiq;
import org.fuse.client.model.FinancialConnectionDetailsBelvo;
import org.fuse.client.model.FinancialConnectionDetailsFinicity;
import org.fuse.client.model.FinancialConnectionDetailsFinverse;
import org.fuse.client.model.FinancialConnectionDetailsFlinks;
import org.fuse.client.model.FinancialConnectionDetailsMono;
import org.fuse.client.model.FinancialConnectionDetailsMx;
import org.fuse.client.model.FinancialConnectionDetailsPlaid;
import org.fuse.client.model.FinancialConnectionDetailsSaltedge;
import org.fuse.client.model.FinancialConnectionDetailsSnaptrade;
import org.fuse.client.model.FinancialConnectionDetailsTeller;
import org.fuse.client.model.FinancialConnectionDetailsTruelayer;

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
 * FinancialConnectionDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-12T15:13:43.182056Z[UTC]")
public class FinancialConnectionDetails {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  /**
   * Connection status of the current financial connection
   */
  @JsonAdapter(ConnectionStatusEnum.Adapter.class)
  public enum ConnectionStatusEnum {
    CONNECTED("connected"),
    
    DISCONNECTED("disconnected"),
    
    FINISHED("finished");

    private String value;

    ConnectionStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ConnectionStatusEnum fromValue(String value) {
      for (ConnectionStatusEnum b : ConnectionStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ConnectionStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ConnectionStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ConnectionStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ConnectionStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CONNECTION_STATUS = "connection_status";
  @SerializedName(SERIALIZED_NAME_CONNECTION_STATUS)
  private ConnectionStatusEnum connectionStatus;

  public static final String SERIALIZED_NAME_CONNECTION_STATUS_UPDATED_AT = "connection_status_updated_at";
  @SerializedName(SERIALIZED_NAME_CONNECTION_STATUS_UPDATED_AT)
  private String connectionStatusUpdatedAt;

  public static final String SERIALIZED_NAME_IS_OAUTH = "is_oauth";
  @SerializedName(SERIALIZED_NAME_IS_OAUTH)
  private Boolean isOauth;

  public static final String SERIALIZED_NAME_AGGREGATOR = "aggregator";
  @SerializedName(SERIALIZED_NAME_AGGREGATOR)
  private Aggregator aggregator;

  public static final String SERIALIZED_NAME_PLAID = "plaid";
  @SerializedName(SERIALIZED_NAME_PLAID)
  private FinancialConnectionDetailsPlaid plaid;

  public static final String SERIALIZED_NAME_TELLER = "teller";
  @SerializedName(SERIALIZED_NAME_TELLER)
  private FinancialConnectionDetailsTeller teller;

  public static final String SERIALIZED_NAME_MX = "mx";
  @SerializedName(SERIALIZED_NAME_MX)
  private FinancialConnectionDetailsMx mx;

  public static final String SERIALIZED_NAME_SNAPTRADE = "snaptrade";
  @SerializedName(SERIALIZED_NAME_SNAPTRADE)
  private FinancialConnectionDetailsSnaptrade snaptrade;

  public static final String SERIALIZED_NAME_FLINKS = "flinks";
  @SerializedName(SERIALIZED_NAME_FLINKS)
  private FinancialConnectionDetailsFlinks flinks;

  public static final String SERIALIZED_NAME_MONO = "mono";
  @SerializedName(SERIALIZED_NAME_MONO)
  private FinancialConnectionDetailsMono mono;

  public static final String SERIALIZED_NAME_TRUELAYER = "truelayer";
  @SerializedName(SERIALIZED_NAME_TRUELAYER)
  private FinancialConnectionDetailsTruelayer truelayer;

  public static final String SERIALIZED_NAME_FINVERSE = "finverse";
  @SerializedName(SERIALIZED_NAME_FINVERSE)
  private FinancialConnectionDetailsFinverse finverse;

  public static final String SERIALIZED_NAME_BASIQ = "basiq";
  @SerializedName(SERIALIZED_NAME_BASIQ)
  private FinancialConnectionDetailsBasiq basiq;

  public static final String SERIALIZED_NAME_BELVO = "belvo";
  @SerializedName(SERIALIZED_NAME_BELVO)
  private FinancialConnectionDetailsBelvo belvo;

  public static final String SERIALIZED_NAME_FINICITY = "finicity";
  @SerializedName(SERIALIZED_NAME_FINICITY)
  private FinancialConnectionDetailsFinicity finicity;

  public static final String SERIALIZED_NAME_AKOYA = "akoya";
  @SerializedName(SERIALIZED_NAME_AKOYA)
  private FinancialConnectionDetailsAkoya akoya;

  public static final String SERIALIZED_NAME_SALTEDGE = "saltedge";
  @SerializedName(SERIALIZED_NAME_SALTEDGE)
  private FinancialConnectionDetailsSaltedge saltedge;

  public FinancialConnectionDetails() {
  }

  public FinancialConnectionDetails id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The fuse financial connection id.
   * @return id
  **/
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public FinancialConnectionDetails connectionStatus(ConnectionStatusEnum connectionStatus) {
    
    this.connectionStatus = connectionStatus;
    return this;
  }

   /**
   * Connection status of the current financial connection
   * @return connectionStatus
  **/
  @javax.annotation.Nonnull
  public ConnectionStatusEnum getConnectionStatus() {
    return connectionStatus;
  }


  public void setConnectionStatus(ConnectionStatusEnum connectionStatus) {
    this.connectionStatus = connectionStatus;
  }


  public FinancialConnectionDetails connectionStatusUpdatedAt(String connectionStatusUpdatedAt) {
    
    this.connectionStatusUpdatedAt = connectionStatusUpdatedAt;
    return this;
  }

   /**
   * Last time the connection status was updated in ISO-8601 format.
   * @return connectionStatusUpdatedAt
  **/
  @javax.annotation.Nonnull
  public String getConnectionStatusUpdatedAt() {
    return connectionStatusUpdatedAt;
  }


  public void setConnectionStatusUpdatedAt(String connectionStatusUpdatedAt) {
    this.connectionStatusUpdatedAt = connectionStatusUpdatedAt;
  }


  public FinancialConnectionDetails isOauth(Boolean isOauth) {
    
    this.isOauth = isOauth;
    return this;
  }

   /**
   * Whether this is an oauth connection
   * @return isOauth
  **/
  @javax.annotation.Nonnull
  public Boolean getIsOauth() {
    return isOauth;
  }


  public void setIsOauth(Boolean isOauth) {
    this.isOauth = isOauth;
  }


  public FinancialConnectionDetails aggregator(Aggregator aggregator) {
    
    this.aggregator = aggregator;
    return this;
  }

   /**
   * Get aggregator
   * @return aggregator
  **/
  @javax.annotation.Nonnull
  public Aggregator getAggregator() {
    return aggregator;
  }


  public void setAggregator(Aggregator aggregator) {
    this.aggregator = aggregator;
  }


  public FinancialConnectionDetails plaid(FinancialConnectionDetailsPlaid plaid) {
    
    this.plaid = plaid;
    return this;
  }

   /**
   * Get plaid
   * @return plaid
  **/
  @javax.annotation.Nullable
  public FinancialConnectionDetailsPlaid getPlaid() {
    return plaid;
  }


  public void setPlaid(FinancialConnectionDetailsPlaid plaid) {
    this.plaid = plaid;
  }


  public FinancialConnectionDetails teller(FinancialConnectionDetailsTeller teller) {
    
    this.teller = teller;
    return this;
  }

   /**
   * Get teller
   * @return teller
  **/
  @javax.annotation.Nullable
  public FinancialConnectionDetailsTeller getTeller() {
    return teller;
  }


  public void setTeller(FinancialConnectionDetailsTeller teller) {
    this.teller = teller;
  }


  public FinancialConnectionDetails mx(FinancialConnectionDetailsMx mx) {
    
    this.mx = mx;
    return this;
  }

   /**
   * Get mx
   * @return mx
  **/
  @javax.annotation.Nullable
  public FinancialConnectionDetailsMx getMx() {
    return mx;
  }


  public void setMx(FinancialConnectionDetailsMx mx) {
    this.mx = mx;
  }


  public FinancialConnectionDetails snaptrade(FinancialConnectionDetailsSnaptrade snaptrade) {
    
    this.snaptrade = snaptrade;
    return this;
  }

   /**
   * Get snaptrade
   * @return snaptrade
  **/
  @javax.annotation.Nullable
  public FinancialConnectionDetailsSnaptrade getSnaptrade() {
    return snaptrade;
  }


  public void setSnaptrade(FinancialConnectionDetailsSnaptrade snaptrade) {
    this.snaptrade = snaptrade;
  }


  public FinancialConnectionDetails flinks(FinancialConnectionDetailsFlinks flinks) {
    
    this.flinks = flinks;
    return this;
  }

   /**
   * Get flinks
   * @return flinks
  **/
  @javax.annotation.Nullable
  public FinancialConnectionDetailsFlinks getFlinks() {
    return flinks;
  }


  public void setFlinks(FinancialConnectionDetailsFlinks flinks) {
    this.flinks = flinks;
  }


  public FinancialConnectionDetails mono(FinancialConnectionDetailsMono mono) {
    
    this.mono = mono;
    return this;
  }

   /**
   * Get mono
   * @return mono
  **/
  @javax.annotation.Nullable
  public FinancialConnectionDetailsMono getMono() {
    return mono;
  }


  public void setMono(FinancialConnectionDetailsMono mono) {
    this.mono = mono;
  }


  public FinancialConnectionDetails truelayer(FinancialConnectionDetailsTruelayer truelayer) {
    
    this.truelayer = truelayer;
    return this;
  }

   /**
   * Get truelayer
   * @return truelayer
  **/
  @javax.annotation.Nullable
  public FinancialConnectionDetailsTruelayer getTruelayer() {
    return truelayer;
  }


  public void setTruelayer(FinancialConnectionDetailsTruelayer truelayer) {
    this.truelayer = truelayer;
  }


  public FinancialConnectionDetails finverse(FinancialConnectionDetailsFinverse finverse) {
    
    this.finverse = finverse;
    return this;
  }

   /**
   * Get finverse
   * @return finverse
  **/
  @javax.annotation.Nullable
  public FinancialConnectionDetailsFinverse getFinverse() {
    return finverse;
  }


  public void setFinverse(FinancialConnectionDetailsFinverse finverse) {
    this.finverse = finverse;
  }


  public FinancialConnectionDetails basiq(FinancialConnectionDetailsBasiq basiq) {
    
    this.basiq = basiq;
    return this;
  }

   /**
   * Get basiq
   * @return basiq
  **/
  @javax.annotation.Nullable
  public FinancialConnectionDetailsBasiq getBasiq() {
    return basiq;
  }


  public void setBasiq(FinancialConnectionDetailsBasiq basiq) {
    this.basiq = basiq;
  }


  public FinancialConnectionDetails belvo(FinancialConnectionDetailsBelvo belvo) {
    
    this.belvo = belvo;
    return this;
  }

   /**
   * Get belvo
   * @return belvo
  **/
  @javax.annotation.Nullable
  public FinancialConnectionDetailsBelvo getBelvo() {
    return belvo;
  }


  public void setBelvo(FinancialConnectionDetailsBelvo belvo) {
    this.belvo = belvo;
  }


  public FinancialConnectionDetails finicity(FinancialConnectionDetailsFinicity finicity) {
    
    this.finicity = finicity;
    return this;
  }

   /**
   * Get finicity
   * @return finicity
  **/
  @javax.annotation.Nullable
  public FinancialConnectionDetailsFinicity getFinicity() {
    return finicity;
  }


  public void setFinicity(FinancialConnectionDetailsFinicity finicity) {
    this.finicity = finicity;
  }


  public FinancialConnectionDetails akoya(FinancialConnectionDetailsAkoya akoya) {
    
    this.akoya = akoya;
    return this;
  }

   /**
   * Get akoya
   * @return akoya
  **/
  @javax.annotation.Nullable
  public FinancialConnectionDetailsAkoya getAkoya() {
    return akoya;
  }


  public void setAkoya(FinancialConnectionDetailsAkoya akoya) {
    this.akoya = akoya;
  }


  public FinancialConnectionDetails saltedge(FinancialConnectionDetailsSaltedge saltedge) {
    
    this.saltedge = saltedge;
    return this;
  }

   /**
   * Get saltedge
   * @return saltedge
  **/
  @javax.annotation.Nullable
  public FinancialConnectionDetailsSaltedge getSaltedge() {
    return saltedge;
  }


  public void setSaltedge(FinancialConnectionDetailsSaltedge saltedge) {
    this.saltedge = saltedge;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FinancialConnectionDetails financialConnectionDetails = (FinancialConnectionDetails) o;
    return Objects.equals(this.id, financialConnectionDetails.id) &&
        Objects.equals(this.connectionStatus, financialConnectionDetails.connectionStatus) &&
        Objects.equals(this.connectionStatusUpdatedAt, financialConnectionDetails.connectionStatusUpdatedAt) &&
        Objects.equals(this.isOauth, financialConnectionDetails.isOauth) &&
        Objects.equals(this.aggregator, financialConnectionDetails.aggregator) &&
        Objects.equals(this.plaid, financialConnectionDetails.plaid) &&
        Objects.equals(this.teller, financialConnectionDetails.teller) &&
        Objects.equals(this.mx, financialConnectionDetails.mx) &&
        Objects.equals(this.snaptrade, financialConnectionDetails.snaptrade) &&
        Objects.equals(this.flinks, financialConnectionDetails.flinks) &&
        Objects.equals(this.mono, financialConnectionDetails.mono) &&
        Objects.equals(this.truelayer, financialConnectionDetails.truelayer) &&
        Objects.equals(this.finverse, financialConnectionDetails.finverse) &&
        Objects.equals(this.basiq, financialConnectionDetails.basiq) &&
        Objects.equals(this.belvo, financialConnectionDetails.belvo) &&
        Objects.equals(this.finicity, financialConnectionDetails.finicity) &&
        Objects.equals(this.akoya, financialConnectionDetails.akoya) &&
        Objects.equals(this.saltedge, financialConnectionDetails.saltedge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, connectionStatus, connectionStatusUpdatedAt, isOauth, aggregator, plaid, teller, mx, snaptrade, flinks, mono, truelayer, finverse, basiq, belvo, finicity, akoya, saltedge);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FinancialConnectionDetails {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    connectionStatus: ").append(toIndentedString(connectionStatus)).append("\n");
    sb.append("    connectionStatusUpdatedAt: ").append(toIndentedString(connectionStatusUpdatedAt)).append("\n");
    sb.append("    isOauth: ").append(toIndentedString(isOauth)).append("\n");
    sb.append("    aggregator: ").append(toIndentedString(aggregator)).append("\n");
    sb.append("    plaid: ").append(toIndentedString(plaid)).append("\n");
    sb.append("    teller: ").append(toIndentedString(teller)).append("\n");
    sb.append("    mx: ").append(toIndentedString(mx)).append("\n");
    sb.append("    snaptrade: ").append(toIndentedString(snaptrade)).append("\n");
    sb.append("    flinks: ").append(toIndentedString(flinks)).append("\n");
    sb.append("    mono: ").append(toIndentedString(mono)).append("\n");
    sb.append("    truelayer: ").append(toIndentedString(truelayer)).append("\n");
    sb.append("    finverse: ").append(toIndentedString(finverse)).append("\n");
    sb.append("    basiq: ").append(toIndentedString(basiq)).append("\n");
    sb.append("    belvo: ").append(toIndentedString(belvo)).append("\n");
    sb.append("    finicity: ").append(toIndentedString(finicity)).append("\n");
    sb.append("    akoya: ").append(toIndentedString(akoya)).append("\n");
    sb.append("    saltedge: ").append(toIndentedString(saltedge)).append("\n");
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
    openapiFields.add("connection_status");
    openapiFields.add("connection_status_updated_at");
    openapiFields.add("is_oauth");
    openapiFields.add("aggregator");
    openapiFields.add("plaid");
    openapiFields.add("teller");
    openapiFields.add("mx");
    openapiFields.add("snaptrade");
    openapiFields.add("flinks");
    openapiFields.add("mono");
    openapiFields.add("truelayer");
    openapiFields.add("finverse");
    openapiFields.add("basiq");
    openapiFields.add("belvo");
    openapiFields.add("finicity");
    openapiFields.add("akoya");
    openapiFields.add("saltedge");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("connection_status");
    openapiRequiredFields.add("connection_status_updated_at");
    openapiRequiredFields.add("is_oauth");
    openapiRequiredFields.add("aggregator");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to FinancialConnectionDetails
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FinancialConnectionDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FinancialConnectionDetails is not found in the empty JSON string", FinancialConnectionDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FinancialConnectionDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FinancialConnectionDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FinancialConnectionDetails.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("connection_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `connection_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("connection_status").toString()));
      }
      if (!jsonObj.get("connection_status_updated_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `connection_status_updated_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("connection_status_updated_at").toString()));
      }
      // validate the optional field `plaid`
      if (jsonObj.get("plaid") != null && !jsonObj.get("plaid").isJsonNull()) {
        FinancialConnectionDetailsPlaid.validateJsonElement(jsonObj.get("plaid"));
      }
      // validate the optional field `teller`
      if (jsonObj.get("teller") != null && !jsonObj.get("teller").isJsonNull()) {
        FinancialConnectionDetailsTeller.validateJsonElement(jsonObj.get("teller"));
      }
      // validate the optional field `mx`
      if (jsonObj.get("mx") != null && !jsonObj.get("mx").isJsonNull()) {
        FinancialConnectionDetailsMx.validateJsonElement(jsonObj.get("mx"));
      }
      // validate the optional field `snaptrade`
      if (jsonObj.get("snaptrade") != null && !jsonObj.get("snaptrade").isJsonNull()) {
        FinancialConnectionDetailsSnaptrade.validateJsonElement(jsonObj.get("snaptrade"));
      }
      // validate the optional field `flinks`
      if (jsonObj.get("flinks") != null && !jsonObj.get("flinks").isJsonNull()) {
        FinancialConnectionDetailsFlinks.validateJsonElement(jsonObj.get("flinks"));
      }
      // validate the optional field `mono`
      if (jsonObj.get("mono") != null && !jsonObj.get("mono").isJsonNull()) {
        FinancialConnectionDetailsMono.validateJsonElement(jsonObj.get("mono"));
      }
      // validate the optional field `truelayer`
      if (jsonObj.get("truelayer") != null && !jsonObj.get("truelayer").isJsonNull()) {
        FinancialConnectionDetailsTruelayer.validateJsonElement(jsonObj.get("truelayer"));
      }
      // validate the optional field `finverse`
      if (jsonObj.get("finverse") != null && !jsonObj.get("finverse").isJsonNull()) {
        FinancialConnectionDetailsFinverse.validateJsonElement(jsonObj.get("finverse"));
      }
      // validate the optional field `basiq`
      if (jsonObj.get("basiq") != null && !jsonObj.get("basiq").isJsonNull()) {
        FinancialConnectionDetailsBasiq.validateJsonElement(jsonObj.get("basiq"));
      }
      // validate the optional field `belvo`
      if (jsonObj.get("belvo") != null && !jsonObj.get("belvo").isJsonNull()) {
        FinancialConnectionDetailsBelvo.validateJsonElement(jsonObj.get("belvo"));
      }
      // validate the optional field `finicity`
      if (jsonObj.get("finicity") != null && !jsonObj.get("finicity").isJsonNull()) {
        FinancialConnectionDetailsFinicity.validateJsonElement(jsonObj.get("finicity"));
      }
      // validate the optional field `akoya`
      if (jsonObj.get("akoya") != null && !jsonObj.get("akoya").isJsonNull()) {
        FinancialConnectionDetailsAkoya.validateJsonElement(jsonObj.get("akoya"));
      }
      // validate the optional field `saltedge`
      if (jsonObj.get("saltedge") != null && !jsonObj.get("saltedge").isJsonNull()) {
        FinancialConnectionDetailsSaltedge.validateJsonElement(jsonObj.get("saltedge"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FinancialConnectionDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FinancialConnectionDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FinancialConnectionDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FinancialConnectionDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<FinancialConnectionDetails>() {
           @Override
           public void write(JsonWriter out, FinancialConnectionDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FinancialConnectionDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FinancialConnectionDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FinancialConnectionDetails
  * @throws IOException if the JSON string is invalid with respect to FinancialConnectionDetails
  */
  public static FinancialConnectionDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FinancialConnectionDetails.class);
  }

 /**
  * Convert an instance of FinancialConnectionDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

