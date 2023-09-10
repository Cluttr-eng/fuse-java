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
import java.math.BigDecimal;
import java.util.Arrays;
import org.openapitools.client.model.ExternalTransactionEvent;
import org.openapitools.client.model.InAppTransactionEvent;
import org.openapitools.client.model.InAppTransactionEventStatus;
import org.openapitools.client.model.TransactionEventType;
import org.openapitools.client.model.UpdatedBalanceEvent;
import org.openapitools.jackson.nullable.JsonNullable;



import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;

import org.openapitools.client.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-10T13:19:07.464573Z[UTC]")
public class AddAccountEventsRequestEventsInner extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(AddAccountEventsRequestEventsInner.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!AddAccountEventsRequestEventsInner.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'AddAccountEventsRequestEventsInner' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ExternalTransactionEvent> adapterExternalTransactionEvent = gson.getDelegateAdapter(this, TypeToken.get(ExternalTransactionEvent.class));
            final TypeAdapter<InAppTransactionEvent> adapterInAppTransactionEvent = gson.getDelegateAdapter(this, TypeToken.get(InAppTransactionEvent.class));
            final TypeAdapter<UpdatedBalanceEvent> adapterUpdatedBalanceEvent = gson.getDelegateAdapter(this, TypeToken.get(UpdatedBalanceEvent.class));

            return (TypeAdapter<T>) new TypeAdapter<AddAccountEventsRequestEventsInner>() {
                @Override
                public void write(JsonWriter out, AddAccountEventsRequestEventsInner value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `ExternalTransactionEvent`
                    if (value.getActualInstance() instanceof ExternalTransactionEvent) {
                      JsonElement element = adapterExternalTransactionEvent.toJsonTree((ExternalTransactionEvent)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `InAppTransactionEvent`
                    if (value.getActualInstance() instanceof InAppTransactionEvent) {
                      JsonElement element = adapterInAppTransactionEvent.toJsonTree((InAppTransactionEvent)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `UpdatedBalanceEvent`
                    if (value.getActualInstance() instanceof UpdatedBalanceEvent) {
                      JsonElement element = adapterUpdatedBalanceEvent.toJsonTree((UpdatedBalanceEvent)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: ExternalTransactionEvent, InAppTransactionEvent, UpdatedBalanceEvent");
                }

                @Override
                public AddAccountEventsRequestEventsInner read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize ExternalTransactionEvent
                    try {
                      // validate the JSON object to see if any exception is thrown
                      ExternalTransactionEvent.validateJsonElement(jsonElement);
                      actualAdapter = adapterExternalTransactionEvent;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'ExternalTransactionEvent'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for ExternalTransactionEvent failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'ExternalTransactionEvent'", e);
                    }
                    // deserialize InAppTransactionEvent
                    try {
                      // validate the JSON object to see if any exception is thrown
                      InAppTransactionEvent.validateJsonElement(jsonElement);
                      actualAdapter = adapterInAppTransactionEvent;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'InAppTransactionEvent'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for InAppTransactionEvent failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'InAppTransactionEvent'", e);
                    }
                    // deserialize UpdatedBalanceEvent
                    try {
                      // validate the JSON object to see if any exception is thrown
                      UpdatedBalanceEvent.validateJsonElement(jsonElement);
                      actualAdapter = adapterUpdatedBalanceEvent;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'UpdatedBalanceEvent'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for UpdatedBalanceEvent failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'UpdatedBalanceEvent'", e);
                    }

                    if (match == 1) {
                        AddAccountEventsRequestEventsInner ret = new AddAccountEventsRequestEventsInner();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for AddAccountEventsRequestEventsInner: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public AddAccountEventsRequestEventsInner() {
        super("oneOf", Boolean.FALSE);
    }

    public AddAccountEventsRequestEventsInner(ExternalTransactionEvent o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public AddAccountEventsRequestEventsInner(InAppTransactionEvent o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public AddAccountEventsRequestEventsInner(UpdatedBalanceEvent o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("ExternalTransactionEvent", ExternalTransactionEvent.class);
        schemas.put("InAppTransactionEvent", InAppTransactionEvent.class);
        schemas.put("UpdatedBalanceEvent", UpdatedBalanceEvent.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return AddAccountEventsRequestEventsInner.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * ExternalTransactionEvent, InAppTransactionEvent, UpdatedBalanceEvent
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof ExternalTransactionEvent) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof InAppTransactionEvent) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof UpdatedBalanceEvent) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be ExternalTransactionEvent, InAppTransactionEvent, UpdatedBalanceEvent");
    }

    /**
     * Get the actual instance, which can be the following:
     * ExternalTransactionEvent, InAppTransactionEvent, UpdatedBalanceEvent
     *
     * @return The actual instance (ExternalTransactionEvent, InAppTransactionEvent, UpdatedBalanceEvent)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `ExternalTransactionEvent`. If the actual instance is not `ExternalTransactionEvent`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ExternalTransactionEvent`
     * @throws ClassCastException if the instance is not `ExternalTransactionEvent`
     */
    public ExternalTransactionEvent getExternalTransactionEvent() throws ClassCastException {
        return (ExternalTransactionEvent)super.getActualInstance();
    }
    /**
     * Get the actual instance of `InAppTransactionEvent`. If the actual instance is not `InAppTransactionEvent`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `InAppTransactionEvent`
     * @throws ClassCastException if the instance is not `InAppTransactionEvent`
     */
    public InAppTransactionEvent getInAppTransactionEvent() throws ClassCastException {
        return (InAppTransactionEvent)super.getActualInstance();
    }
    /**
     * Get the actual instance of `UpdatedBalanceEvent`. If the actual instance is not `UpdatedBalanceEvent`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UpdatedBalanceEvent`
     * @throws ClassCastException if the instance is not `UpdatedBalanceEvent`
     */
    public UpdatedBalanceEvent getUpdatedBalanceEvent() throws ClassCastException {
        return (UpdatedBalanceEvent)super.getActualInstance();
    }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AddAccountEventsRequestEventsInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with ExternalTransactionEvent
    try {
      ExternalTransactionEvent.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for ExternalTransactionEvent failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with InAppTransactionEvent
    try {
      InAppTransactionEvent.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for InAppTransactionEvent failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with UpdatedBalanceEvent
    try {
      UpdatedBalanceEvent.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for UpdatedBalanceEvent failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for AddAccountEventsRequestEventsInner with oneOf schemas: ExternalTransactionEvent, InAppTransactionEvent, UpdatedBalanceEvent. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
    }
  }

 /**
  * Create an instance of AddAccountEventsRequestEventsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AddAccountEventsRequestEventsInner
  * @throws IOException if the JSON string is invalid with respect to AddAccountEventsRequestEventsInner
  */
  public static AddAccountEventsRequestEventsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddAccountEventsRequestEventsInner.class);
  }

 /**
  * Convert an instance of AddAccountEventsRequestEventsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

