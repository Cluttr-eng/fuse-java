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
 * Gets or Sets FuseApiErrorCode
 */
@JsonAdapter(FuseApiErrorCode.Adapter.class)
public enum FuseApiErrorCode {
  
  ASSET_REPORT_GENERATION_FAILED("asset_report_generation_failed"),
  
  ASSET_REPORT_NOT_READY("asset_report_not_ready"),
  
  CLIENT_ERROR("client_error"),
  
  INVALID_HEADERS("invalid_headers"),
  
  INVALID_REQUEST_BODY("invalid_request_body"),
  
  INTERNAL_SERVER_ERROR("internal_server_error"),
  
  ORGANIZATION_NOT_FOUND("organization_not_found"),
  
  ENTITY_NOT_FOUND("entity_not_found"),
  
  SESSION_NOT_FOUND("session_not_found"),
  
  FINANCIAL_INSTITUTION_NOT_FOUND("financial_institution_not_found"),
  
  CONSUMER_RISK_REPORT_NOT_FOUND("consumer_risk_report_not_found"),
  
  CONSUMER_RISK_REPORT_CUSTOMIZATION_NOT_FOUND("consumer_risk_report_customization_not_found"),
  
  MISSING_ACCESS_TOKEN("missing_access_token"),
  
  MISSING_PLAID_CLIENT_ID_HEADER("missing_plaid_client_id_header"),
  
  MISSING_PLAID_SECRET_HEADER("missing_plaid_secret_header"),
  
  MISSING_MX_CLIENT_ID_HEADER("missing_mx_client_id_header"),
  
  MISSING_MX_API_KEY_HEADER("missing_mx_api_key_header"),
  
  MISSING_TELLER_PRIVATE_KEY_HEADER("missing_teller_private_key_header"),
  
  MISSING_TELLER_CERTIFICATE_HEADER("missing_teller_certificate_header"),
  
  MISSING_TELLER_APPLICATION_ID_HEADER("missing_teller_application_id_header"),
  
  MISSING_TELLER_SIGNING_SECRET_HEADER("missing_teller_signing_secret_header"),
  
  MISSING_SNAPTRADE_CLIENT_ID_HEADER("missing_snaptrade_client_id_header"),
  
  MISSING_SNAPTRADE_CONSUMER_KEY_HEADER("missing_snaptrade_consumer_key_header"),
  
  MISSING_FLINKS_CA_CUSTOMER_ID_HEADER("missing_flinks_ca_customer_id_header"),
  
  MISSING_FLINKS_US_CUSTOMER_ID_HEADER("missing_flinks_us_customer_id_header"),
  
  MISSING_FLINKS_CA_INSTANCE_ID_HEADER("missing_flinks_ca_instance_id_header"),
  
  MISSING_FLINKS_US_INSTANCE_ID_HEADER("missing_flinks_us_instance_id_header"),
  
  MISSING_MONO_PUBLIC_KEY_HEADER("missing_mono_public_key_header"),
  
  MISSING_MONO_SECRET_KEY_HEADER("missing_mono_secret_key_header"),
  
  MISSING_MONO_WEBHOOK_SECRET_HEADER("missing_mono_webhook_secret_header"),
  
  MISSING_TRUELAYER_CLIENT_ID_HEADER("missing_truelayer_client_id_header"),
  
  MISSING_TRUELAYER_CLIENT_SECRET_HEADER("missing_truelayer_client_secret_header"),
  
  MISSING_TRUELAYER_REDIRECT_URI_HEADER("missing_truelayer_redirect_uri_header"),
  
  MISSING_FINVERSE_CLIENT_ID_HEADER("missing_finverse_client_id_header"),
  
  MISSING_FINVERSE_CLIENT_SECRET_HEADER("missing_finverse_client_secret_header"),
  
  MISSING_FINVERSE_REDIRECT_URI_HEADER("missing_finverse_redirect_uri_header"),
  
  MISSING_BASIQ_API_KEY_HEADER("missing_basiq_api_key_header"),
  
  MISSING_BELVO_SECRET_ID_HEADER("missing_belvo_secret_id_header"),
  
  MISSING_BELVO_SECRET_PASSWORD_HEADER("missing_belvo_secret_password_header"),
  
  MISSING_FINICITY_PARTNER_ID_HEADER("missing_finicity_partner_id_header"),
  
  MISSING_FINICITY_APP_KEY_HEADER("missing_finicity_app_key_header"),
  
  MISSING_FINICITY_PARTNER_SECRET_HEADER("missing_finicity_partner_secret_header"),
  
  MISSING_FUSE_VERIFICATION_HEADER("missing_fuse_verification_header"),
  
  MISSING_AKOYA_CLIENT_ID_HEADER("missing_akoya_client_id_header"),
  
  MISSING_AKOYA_CLIENT_SECRET_HEADER("missing_akoya_client_secret_header"),
  
  MISSING_SALTEDGE_APP_ID_HEADER("missing_saltedge_app_id_header"),
  
  MISSING_SALTEDGE_APP_SECRET_HEADER("missing_saltedge_app_secret_header"),
  
  AGGREGATOR_ERROR("aggregator_error"),
  
  AGGREGATOR_DISCONNECTED_ERROR("aggregator_disconnected_error"),
  
  AGGREGATOR_CONNECTION_FINISHED_ERROR("aggregator_connection_finished_error"),
  
  AGGREGATOR_RATE_LIMIT_ERROR("aggregator_rate_limit_error"),
  
  REQUEST_BODY_MISSING("request_body_missing"),
  
  REQUEST_CONTENT_TYPE_INVALID("request_content_type_invalid"),
  
  REQUEST_BODY_INVALID_JSON("request_body_invalid_json"),
  
  WEBHOOK_ERROR("webhook_error"),
  
  TIMEOUT("timeout"),
  
  INVALID_CERTIFICATE("invalid_certificate"),
  
  INVALID_PRIVATE_KEY("invalid_private_key"),
  
  OTHER("other");

  private String value;

  FuseApiErrorCode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static FuseApiErrorCode fromValue(String value) {
    for (FuseApiErrorCode b : FuseApiErrorCode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<FuseApiErrorCode> {
    @Override
    public void write(final JsonWriter jsonWriter, final FuseApiErrorCode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public FuseApiErrorCode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return FuseApiErrorCode.fromValue(value);
    }
  }
}

