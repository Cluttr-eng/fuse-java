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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets FuseApiErrorType
 */
@JsonAdapter(FuseApiErrorType.Adapter.class)
public enum FuseApiErrorType {
  
  AUTH_ERROR("auth_error"),
  
  NOT_FOUND("not_found"),
  
  BAD_REQUEST("bad_request"),
  
  SERVER_ERROR("server_error");

  private String value;

  FuseApiErrorType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static FuseApiErrorType fromValue(String value) {
    for (FuseApiErrorType b : FuseApiErrorType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<FuseApiErrorType> {
    @Override
    public void write(final JsonWriter jsonWriter, final FuseApiErrorType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public FuseApiErrorType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return FuseApiErrorType.fromValue(value);
    }
  }
}
