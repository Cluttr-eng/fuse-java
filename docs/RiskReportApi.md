# RiskReportApi

All URIs are relative to *https://sandbox-api.letsfuse.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteConsumerRiskReport**](RiskReportApi.md#deleteConsumerRiskReport) | **DELETE** /v1/risk_report/consumer/{consumer_risk_report_id} | Delete consumer risk report |
| [**getConsumerRiskReportCustomization**](RiskReportApi.md#getConsumerRiskReportCustomization) | **GET** /v1/risk_report/consumer/customization/{consumer_risk_report_customization_id} | Get consumer risk report customization |


<a id="deleteConsumerRiskReport"></a>
# **deleteConsumerRiskReport**
> DeleteConsumerRiskReportResponse deleteConsumerRiskReport(consumerRiskReportId, fuseClientId, fuseApiKey)

Delete consumer risk report

### Example
```java
// Import classes:
import org.fuse.client.ApiClient;
import org.fuse.client.ApiException;
import org.fuse.client.Configuration;
import org.fuse.client.auth.*;
import org.fuse.client.models.*;
import org.fuse.client.api.RiskReportApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sandbox-api.letsfuse.com");
    
    // Configure API key authorization: fuseApiKey
    ApiKeyAuth fuseApiKey = (ApiKeyAuth) defaultClient.getAuthentication("fuseApiKey");
    fuseApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //fuseApiKey.setApiKeyPrefix("Token");

    // Configure API key authorization: fuseClientId
    ApiKeyAuth fuseClientId = (ApiKeyAuth) defaultClient.getAuthentication("fuseClientId");
    fuseClientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //fuseClientId.setApiKeyPrefix("Token");

    RiskReportApi apiInstance = new RiskReportApi(defaultClient);
    String consumerRiskReportId = "consumerRiskReportId_example"; // String | 
    String fuseClientId = "fuseClientId_example"; // String | 
    String fuseApiKey = "fuseApiKey_example"; // String | 
    try {
      DeleteConsumerRiskReportResponse result = apiInstance.deleteConsumerRiskReport(consumerRiskReportId, fuseClientId, fuseApiKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RiskReportApi#deleteConsumerRiskReport");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **consumerRiskReportId** | **String**|  | |
| **fuseClientId** | **String**|  | |
| **fuseApiKey** | **String**|  | |

### Return type

[**DeleteConsumerRiskReportResponse**](DeleteConsumerRiskReportResponse.md)

### Authorization

[fuseApiKey](../README.md#fuseApiKey), [fuseClientId](../README.md#fuseClientId)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="getConsumerRiskReportCustomization"></a>
# **getConsumerRiskReportCustomization**
> GetConsumerRiskReportCustomizationResponse getConsumerRiskReportCustomization(consumerRiskReportCustomizationId, fuseClientId, fuseApiKey)

Get consumer risk report customization

### Example
```java
// Import classes:
import org.fuse.client.ApiClient;
import org.fuse.client.ApiException;
import org.fuse.client.Configuration;
import org.fuse.client.auth.*;
import org.fuse.client.models.*;
import org.fuse.client.api.RiskReportApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sandbox-api.letsfuse.com");
    
    // Configure API key authorization: fuseApiKey
    ApiKeyAuth fuseApiKey = (ApiKeyAuth) defaultClient.getAuthentication("fuseApiKey");
    fuseApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //fuseApiKey.setApiKeyPrefix("Token");

    // Configure API key authorization: fuseClientId
    ApiKeyAuth fuseClientId = (ApiKeyAuth) defaultClient.getAuthentication("fuseClientId");
    fuseClientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //fuseClientId.setApiKeyPrefix("Token");

    RiskReportApi apiInstance = new RiskReportApi(defaultClient);
    String consumerRiskReportCustomizationId = "consumerRiskReportCustomizationId_example"; // String | 
    String fuseClientId = "fuseClientId_example"; // String | 
    String fuseApiKey = "fuseApiKey_example"; // String | 
    try {
      GetConsumerRiskReportCustomizationResponse result = apiInstance.getConsumerRiskReportCustomization(consumerRiskReportCustomizationId, fuseClientId, fuseApiKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RiskReportApi#getConsumerRiskReportCustomization");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **consumerRiskReportCustomizationId** | **String**|  | |
| **fuseClientId** | **String**|  | |
| **fuseApiKey** | **String**|  | |

### Return type

[**GetConsumerRiskReportCustomizationResponse**](GetConsumerRiskReportCustomizationResponse.md)

### Authorization

[fuseApiKey](../README.md#fuseApiKey), [fuseClientId](../README.md#fuseClientId)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

