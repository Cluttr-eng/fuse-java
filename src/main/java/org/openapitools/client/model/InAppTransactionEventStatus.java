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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets InAppTransactionEventStatus
 */
@JsonAdapter(InAppTransactionEventStatus.Adapter.class)
public enum InAppTransactionEventStatus {
  
  PENDING("pending"),
  
  SUCCEEDED("succeeded"),
  
  FAILED("failed");

  private String value;

  InAppTransactionEventStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static InAppTransactionEventStatus fromValue(String value) {
    for (InAppTransactionEventStatus b : InAppTransactionEventStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<InAppTransactionEventStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final InAppTransactionEventStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public InAppTransactionEventStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return InAppTransactionEventStatus.fromValue(value);
    }
  }
}

