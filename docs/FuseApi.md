# FuseApi

All URIs are relative to *https://sandbox-api.letsfuse.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addAccountEvents**](FuseApi.md#addAccountEvents) | **POST** /v1/accounts/{account_id}/events |  |
| [**createAssetReport**](FuseApi.md#createAssetReport) | **POST** /v1/financial_connections/asset_report/create |  |
| [**createConsumerRiskReport**](FuseApi.md#createConsumerRiskReport) | **POST** /v1/risk_report/consumer |  |
| [**createConsumerRiskReportCustomization**](FuseApi.md#createConsumerRiskReportCustomization) | **POST** /v1/risk_report/consumer/customization |  |
| [**createLinkToken**](FuseApi.md#createLinkToken) | **POST** /v1/link/token |  |
| [**createSession**](FuseApi.md#createSession) | **POST** /v1/session |  |
| [**deleteFinancialConnection**](FuseApi.md#deleteFinancialConnection) | **DELETE** /v1/financial_connections/{financial_connection_id_to_delete} | Delete a financial connection |
| [**enrichTransactions**](FuseApi.md#enrichTransactions) | **POST** /v1/transactions/enrich |  |
| [**exchangeFinancialConnectionsPublicToken**](FuseApi.md#exchangeFinancialConnectionsPublicToken) | **POST** /v1/financial_connections/public_token/exchange |  |
| [**getAssetReport**](FuseApi.md#getAssetReport) | **POST** /v1/financial_connections/asset_report |  |
| [**getConsumerRiskReport**](FuseApi.md#getConsumerRiskReport) | **GET** /v1/risk_report/consumer/{consumer_risk_report_id} | Get consumer risk report |
| [**getEntity**](FuseApi.md#getEntity) | **GET** /v1/entities/{entity_id} | Get entity |
| [**getFinanceScore**](FuseApi.md#getFinanceScore) | **GET** /v1/accounts/{account_id}/finance_score | Get finance score |
| [**getFinancialConnection**](FuseApi.md#getFinancialConnection) | **GET** /v1/financial_connections/{financial_connection_id} | Get financial connection details |
| [**getFinancialConnectionsAccountDetails**](FuseApi.md#getFinancialConnectionsAccountDetails) | **POST** /v1/financial_connections/accounts/details | Get account details |
| [**getFinancialConnectionsAccountStatement**](FuseApi.md#getFinancialConnectionsAccountStatement) | **POST** /v1/financial_connections/accounts/statement |  |
| [**getFinancialConnectionsAccounts**](FuseApi.md#getFinancialConnectionsAccounts) | **POST** /v1/financial_connections/accounts | Get accounts |
| [**getFinancialConnectionsBalances**](FuseApi.md#getFinancialConnectionsBalances) | **POST** /v1/financial_connections/balances | Get balances |
| [**getFinancialConnectionsOwners**](FuseApi.md#getFinancialConnectionsOwners) | **POST** /v1/financial_connections/owners | Get account owners |
| [**getFinancialConnectionsTransactions**](FuseApi.md#getFinancialConnectionsTransactions) | **POST** /v1/financial_connections/transactions | Get transactions |
| [**getFinancialInstitution**](FuseApi.md#getFinancialInstitution) | **GET** /v1/financial_connections/institutions/{institution_id} | Get a financial institution |
| [**getInvestmentHoldings**](FuseApi.md#getInvestmentHoldings) | **POST** /v1/financial_connections/investments/holdings | Get investment holdings |
| [**getInvestmentTransactions**](FuseApi.md#getInvestmentTransactions) | **POST** /v1/financial_connections/investments/transactions | Get investment transactions |
| [**migrateFinancialConnection**](FuseApi.md#migrateFinancialConnection) | **POST** /v1/financial_connections/migrate | Migrate financial connection |
| [**refreshAssetReport**](FuseApi.md#refreshAssetReport) | **POST** /v1/financial_connections/asset_report/refresh |  |
| [**syncFinancialConnectionsData**](FuseApi.md#syncFinancialConnectionsData) | **POST** /v1/financial_connections/sync | Sync financial connections data |
| [**updateConsumerRiskReportCustomization**](FuseApi.md#updateConsumerRiskReportCustomization) | **POST** /v1/risk_report/consumer/customization/{consumer_risk_report_customization_id} | Update consumer risk report customization |
| [**v1FinancialConnectionsLiabilitiesPost**](FuseApi.md#v1FinancialConnectionsLiabilitiesPost) | **POST** /v1/financial_connections/liabilities | Get liabilities |


<a id="addAccountEvents"></a>
# **addAccountEvents**
> AddAccountEventsResponse addAccountEvents(accountId, addAccountEventsRequest)



### Example
```java
// Import classes:
import org.fuse.client.ApiClient;
import org.fuse.client.ApiException;
import org.fuse.client.Configuration;
import org.fuse.client.auth.*;
import org.fuse.client.models.*;
import org.fuse.client.api.FuseApi;

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

    FuseApi apiInstance = new FuseApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    AddAccountEventsRequest addAccountEventsRequest = new AddAccountEventsRequest(); // AddAccountEventsRequest | 
    try {
      AddAccountEventsResponse result = apiInstance.addAccountEvents(accountId, addAccountEventsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FuseApi#addAccountEvents");
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
| **accountId** | **String**|  | |
| **addAccountEventsRequest** | [**AddAccountEventsRequest**](AddAccountEventsRequest.md)|  | [optional] |

### Return type

[**AddAccountEventsResponse**](AddAccountEventsResponse.md)

### Authorization

[fuseApiKey](../README.md#fuseApiKey), [fuseClientId](../README.md#fuseClientId)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="createAssetReport"></a>
# **createAssetReport**
> CreateAssetReportResponse createAssetReport(createAssetReportRequest)



Use this endpoint to generate an Asset Report for a user. For Plaid, you will need to have the assets product enabled on your plaid account.

### Example
```java
// Import classes:
import org.fuse.client.ApiClient;
import org.fuse.client.ApiException;
import org.fuse.client.Configuration;
import org.fuse.client.auth.*;
import org.fuse.client.models.*;
import org.fuse.client.api.FuseApi;

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

    FuseApi apiInstance = new FuseApi(defaultClient);
    CreateAssetReportRequest createAssetReportRequest = new CreateAssetReportRequest(); // CreateAssetReportRequest | 
    try {
      CreateAssetReportResponse result = apiInstance.createAssetReport(createAssetReportRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FuseApi#createAssetReport");
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
| **createAssetReportRequest** | [**CreateAssetReportRequest**](CreateAssetReportRequest.md)|  | [optional] |

### Return type

[**CreateAssetReportResponse**](CreateAssetReportResponse.md)

### Authorization

[fuseApiKey](../README.md#fuseApiKey), [fuseClientId](../README.md#fuseClientId)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a id="createConsumerRiskReport"></a>
# **createConsumerRiskReport**
> CreateConsumerRiskReportResponse createConsumerRiskReport(createConsumerRiskReportRequest)



Starts the background process that will calculate the consumer risk report depending on the customization passed in.

### Example
```java
// Import classes:
import org.fuse.client.ApiClient;
import org.fuse.client.ApiException;
import org.fuse.client.Configuration;
import org.fuse.client.auth.*;
import org.fuse.client.models.*;
import org.fuse.client.api.FuseApi;

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

    FuseApi apiInstance = new FuseApi(defaultClient);
    CreateConsumerRiskReportRequest createConsumerRiskReportRequest = new CreateConsumerRiskReportRequest(); // CreateConsumerRiskReportRequest | 
    try {
      CreateConsumerRiskReportResponse result = apiInstance.createConsumerRiskReport(createConsumerRiskReportRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FuseApi#createConsumerRiskReport");
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
| **createConsumerRiskReportRequest** | [**CreateConsumerRiskReportRequest**](CreateConsumerRiskReportRequest.md)|  | [optional] |

### Return type

[**CreateConsumerRiskReportResponse**](CreateConsumerRiskReportResponse.md)

### Authorization

[fuseApiKey](../README.md#fuseApiKey), [fuseClientId](../README.md#fuseClientId)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="createConsumerRiskReportCustomization"></a>
# **createConsumerRiskReportCustomization**
> CreateConsumerRiskReportCustomizationResponse createConsumerRiskReportCustomization(createConsumerRiskReportCustomizationRequest)



### Example
```java
// Import classes:
import org.fuse.client.ApiClient;
import org.fuse.client.ApiException;
import org.fuse.client.Configuration;
import org.fuse.client.auth.*;
import org.fuse.client.models.*;
import org.fuse.client.api.FuseApi;

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

    FuseApi apiInstance = new FuseApi(defaultClient);
    CreateConsumerRiskReportCustomizationRequest createConsumerRiskReportCustomizationRequest = new CreateConsumerRiskReportCustomizationRequest(); // CreateConsumerRiskReportCustomizationRequest | 
    try {
      CreateConsumerRiskReportCustomizationResponse result = apiInstance.createConsumerRiskReportCustomization(createConsumerRiskReportCustomizationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FuseApi#createConsumerRiskReportCustomization");
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
| **createConsumerRiskReportCustomizationRequest** | [**CreateConsumerRiskReportCustomizationRequest**](CreateConsumerRiskReportCustomizationRequest.md)|  | [optional] |

### Return type

[**CreateConsumerRiskReportCustomizationResponse**](CreateConsumerRiskReportCustomizationResponse.md)

### Authorization

[fuseApiKey](../README.md#fuseApiKey), [fuseClientId](../README.md#fuseClientId)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="createLinkToken"></a>
# **createLinkToken**
> CreateLinkTokenResponse createLinkToken(createLinkTokenRequest)



Create a link token to start the process of a user connecting to a specific financial institution.

### Example
```java
// Import classes:
import org.fuse.client.ApiClient;
import org.fuse.client.ApiException;
import org.fuse.client.Configuration;
import org.fuse.client.auth.*;
import org.fuse.client.models.*;
import org.fuse.client.api.FuseApi;

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

    FuseApi apiInstance = new FuseApi(defaultClient);
    CreateLinkTokenRequest createLinkTokenRequest = new CreateLinkTokenRequest(); // CreateLinkTokenRequest | 
    try {
      CreateLinkTokenResponse result = apiInstance.createLinkToken(createLinkTokenRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FuseApi#createLinkToken");
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
| **createLinkTokenRequest** | [**CreateLinkTokenRequest**](CreateLinkTokenRequest.md)|  | [optional] |

### Return type

[**CreateLinkTokenResponse**](CreateLinkTokenResponse.md)

### Authorization

[fuseApiKey](../README.md#fuseApiKey), [fuseClientId](../README.md#fuseClientId)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a id="createSession"></a>
# **createSession**
> CreateSessionResponse createSession(createSessionRequest)



Creates a session that returns a client_secret which is required as a parameter when initializing the Fuse SDK.

### Example
```java
// Import classes:
import org.fuse.client.ApiClient;
import org.fuse.client.ApiException;
import org.fuse.client.Configuration;
import org.fuse.client.auth.*;
import org.fuse.client.models.*;
import org.fuse.client.api.FuseApi;

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

    FuseApi apiInstance = new FuseApi(defaultClient);
    CreateSessionRequest createSessionRequest = new CreateSessionRequest(); // CreateSessionRequest | 
    try {
      CreateSessionResponse result = apiInstance.createSession(createSessionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FuseApi#createSession");
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
| **createSessionRequest** | [**CreateSessionRequest**](CreateSessionRequest.md)|  | [optional] |

### Return type

[**CreateSessionResponse**](CreateSessionResponse.md)

### Authorization

[fuseApiKey](../README.md#fuseApiKey), [fuseClientId](../README.md#fuseClientId)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a id="deleteFinancialConnection"></a>
# **deleteFinancialConnection**
> DeleteFinancialConnectionResponse deleteFinancialConnection(financialConnectionIdToDelete)

Delete a financial connection

### Example
```java
// Import classes:
import org.fuse.client.ApiClient;
import org.fuse.client.ApiException;
import org.fuse.client.Configuration;
import org.fuse.client.auth.*;
import org.fuse.client.models.*;
import org.fuse.client.api.FuseApi;

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

    FuseApi apiInstance = new FuseApi(defaultClient);
    String financialConnectionIdToDelete = "financialConnectionIdToDelete_example"; // String | 
    try {
      DeleteFinancialConnectionResponse result = apiInstance.deleteFinancialConnection(financialConnectionIdToDelete);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FuseApi#deleteFinancialConnection");
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
| **financialConnectionIdToDelete** | **String**|  | |

### Return type

[**DeleteFinancialConnectionResponse**](DeleteFinancialConnectionResponse.md)

### Authorization

[fuseApiKey](../README.md#fuseApiKey), [fuseClientId](../README.md#fuseClientId)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a id="enrichTransactions"></a>
# **enrichTransactions**
> EnrichTransactionsResponse enrichTransactions(fuseClientId, fuseApiKey, enrichTransactionsRequest)



### Example
```java
// Import classes:
import org.fuse.client.ApiClient;
import org.fuse.client.ApiException;
import org.fuse.client.Configuration;
import org.fuse.client.auth.*;
import org.fuse.client.models.*;
import org.fuse.client.api.FuseApi;

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

    FuseApi apiInstance = new FuseApi(defaultClient);
    String fuseClientId = "fuseClientId_example"; // String | 
    String fuseApiKey = "fuseApiKey_example"; // String | 
    EnrichTransactionsRequest enrichTransactionsRequest = new EnrichTransactionsRequest(); // EnrichTransactionsRequest | 
    try {
      EnrichTransactionsResponse result = apiInstance.enrichTransactions(fuseClientId, fuseApiKey, enrichTransactionsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FuseApi#enrichTransactions");
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
| **fuseClientId** | **String**|  | |
| **fuseApiKey** | **String**|  | |
| **enrichTransactionsRequest** | [**EnrichTransactionsRequest**](EnrichTransactionsRequest.md)|  | [optional] |

### Return type

[**EnrichTransactionsResponse**](EnrichTransactionsResponse.md)

### Authorization

[fuseApiKey](../README.md#fuseApiKey), [fuseClientId](../README.md#fuseClientId)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a id="exchangeFinancialConnectionsPublicToken"></a>
# **exchangeFinancialConnectionsPublicToken**
> ExchangeFinancialConnectionsPublicTokenResponse exchangeFinancialConnectionsPublicToken(exchangeFinancialConnectionsPublicTokenRequest)



API to exchange a public token for an access token and financial connection id

### Example
```java
// Import classes:
import org.fuse.client.ApiClient;
import org.fuse.client.ApiException;
import org.fuse.client.Configuration;
import org.fuse.client.auth.*;
import org.fuse.client.models.*;
import org.fuse.client.api.FuseApi;

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

    FuseApi apiInstance = new FuseApi(defaultClient);
    ExchangeFinancialConnectionsPublicTokenRequest exchangeFinancialConnectionsPublicTokenRequest = new ExchangeFinancialConnectionsPublicTokenRequest(); // ExchangeFinancialConnectionsPublicTokenRequest | 
    try {
      ExchangeFinancialConnectionsPublicTokenResponse result = apiInstance.exchangeFinancialConnectionsPublicToken(exchangeFinancialConnectionsPublicTokenRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FuseApi#exchangeFinancialConnectionsPublicToken");
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
| **exchangeFinancialConnectionsPublicTokenRequest** | [**ExchangeFinancialConnectionsPublicTokenRequest**](ExchangeFinancialConnectionsPublicTokenRequest.md)|  | [optional] |

### Return type

[**ExchangeFinancialConnectionsPublicTokenResponse**](ExchangeFinancialConnectionsPublicTokenResponse.md)

### Authorization

[fuseApiKey](../README.md#fuseApiKey), [fuseClientId](../README.md#fuseClientId)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a id="getAssetReport"></a>
# **getAssetReport**
> RefreshAssetReportResponse getAssetReport(getAssetReportRequest)



Retrieves the Asset Report in JSON format. For Plaid, you will need to have the assets product enabled on your plaid account.

### Example
```java
// Import classes:
import org.fuse.client.ApiClient;
import org.fuse.client.ApiException;
import org.fuse.client.Configuration;
import org.fuse.client.auth.*;
import org.fuse.client.models.*;
import org.fuse.client.api.FuseApi;

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

    FuseApi apiInstance = new FuseApi(defaultClient);
    GetAssetReportRequest getAssetReportRequest = new GetAssetReportRequest(); // GetAssetReportRequest | 
    try {
      RefreshAssetReportResponse result = apiInstance.getAssetReport(getAssetReportRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FuseApi#getAssetReport");
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
| **getAssetReportRequest** | [**GetAssetReportRequest**](GetAssetReportRequest.md)|  | [optional] |

### Return type

[**RefreshAssetReportResponse**](RefreshAssetReportResponse.md)

### Authorization

[fuseApiKey](../README.md#fuseApiKey), [fuseClientId](../README.md#fuseClientId)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a id="getConsumerRiskReport"></a>
# **getConsumerRiskReport**
> GetConsumerRiskReportResponse getConsumerRiskReport(consumerRiskReportId, recalculate)

Get consumer risk report

### Example
```java
// Import classes:
import org.fuse.client.ApiClient;
import org.fuse.client.ApiException;
import org.fuse.client.Configuration;
import org.fuse.client.auth.*;
import org.fuse.client.models.*;
import org.fuse.client.api.FuseApi;

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

    FuseApi apiInstance = new FuseApi(defaultClient);
    String consumerRiskReportId = "consumerRiskReportId_example"; // String | 
    Boolean recalculate = true; // Boolean | An optional boolean parameter. If set to true, the system will recalculate before returning the risk report. If omitted or set to false, the current risk report will be returned without recalculation.
    try {
      GetConsumerRiskReportResponse result = apiInstance.getConsumerRiskReport(consumerRiskReportId, recalculate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FuseApi#getConsumerRiskReport");
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
| **recalculate** | **Boolean**| An optional boolean parameter. If set to true, the system will recalculate before returning the risk report. If omitted or set to false, the current risk report will be returned without recalculation. | [optional] |

### Return type

[**GetConsumerRiskReportResponse**](GetConsumerRiskReportResponse.md)

### Authorization

[fuseApiKey](../README.md#fuseApiKey), [fuseClientId](../README.md#fuseClientId)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="getEntity"></a>
# **getEntity**
> GetEntityResponse getEntity(entityId)

Get entity

An entity is automatically created after a successful connection. The id of the entity is what is set when calling the &#39;create session&#39; endpoint

### Example
```java
// Import classes:
import org.fuse.client.ApiClient;
import org.fuse.client.ApiException;
import org.fuse.client.Configuration;
import org.fuse.client.auth.*;
import org.fuse.client.models.*;
import org.fuse.client.api.FuseApi;

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

    FuseApi apiInstance = new FuseApi(defaultClient);
    String entityId = "entityId_example"; // String | 
    try {
      GetEntityResponse result = apiInstance.getEntity(entityId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FuseApi#getEntity");
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
| **entityId** | **String**|  | |

### Return type

[**GetEntityResponse**](GetEntityResponse.md)

### Authorization

[fuseApiKey](../README.md#fuseApiKey), [fuseClientId](../README.md#fuseClientId)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a id="getFinanceScore"></a>
# **getFinanceScore**
> GetFinanceScoreResponse getFinanceScore(accountId)

Get finance score

### Example
```java
// Import classes:
import org.fuse.client.ApiClient;
import org.fuse.client.ApiException;
import org.fuse.client.Configuration;
import org.fuse.client.auth.*;
import org.fuse.client.models.*;
import org.fuse.client.api.FuseApi;

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

    FuseApi apiInstance = new FuseApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    try {
      GetFinanceScoreResponse result = apiInstance.getFinanceScore(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FuseApi#getFinanceScore");
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
| **accountId** | **String**|  | |

### Return type

[**GetFinanceScoreResponse**](GetFinanceScoreResponse.md)

### Authorization

[fuseApiKey](../README.md#fuseApiKey), [fuseClientId](../README.md#fuseClientId)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="getFinancialConnection"></a>
# **getFinancialConnection**
> GetFinancialConnectionResponse getFinancialConnection(financialConnectionId)

Get financial connection details

### Example
```java
// Import classes:
import org.fuse.client.ApiClient;
import org.fuse.client.ApiException;
import org.fuse.client.Configuration;
import org.fuse.client.auth.*;
import org.fuse.client.models.*;
import org.fuse.client.api.FuseApi;

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

    FuseApi apiInstance = new FuseApi(defaultClient);
    String financialConnectionId = "financialConnectionId_example"; // String | 
    try {
      GetFinancialConnectionResponse result = apiInstance.getFinancialConnection(financialConnectionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FuseApi#getFinancialConnection");
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
| **financialConnectionId** | **String**|  | |

### Return type

[**GetFinancialConnectionResponse**](GetFinancialConnectionResponse.md)

### Authorization

[fuseApiKey](../README.md#fuseApiKey), [fuseClientId](../README.md#fuseClientId)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a id="getFinancialConnectionsAccountDetails"></a>
# **getFinancialConnectionsAccountDetails**
> GetFinancialConnectionsAccountDetailsResponse getFinancialConnectionsAccountDetails(getFinancialConnectionsAccountDetailsRequest)

Get account details

### Example
```java
// Import classes:
import org.fuse.client.ApiClient;
import org.fuse.client.ApiException;
import org.fuse.client.Configuration;
import org.fuse.client.auth.*;
import org.fuse.client.models.*;
import org.fuse.client.api.FuseApi;

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

    FuseApi apiInstance = new FuseApi(defaultClient);
    GetFinancialConnectionsAccountDetailsRequest getFinancialConnectionsAccountDetailsRequest = new GetFinancialConnectionsAccountDetailsRequest(); // GetFinancialConnectionsAccountDetailsRequest | 
    try {
      GetFinancialConnectionsAccountDetailsResponse result = apiInstance.getFinancialConnectionsAccountDetails(getFinancialConnectionsAccountDetailsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FuseApi#getFinancialConnectionsAccountDetails");
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
| **getFinancialConnectionsAccountDetailsRequest** | [**GetFinancialConnectionsAccountDetailsRequest**](GetFinancialConnectionsAccountDetailsRequest.md)|  | |

### Return type

[**GetFinancialConnectionsAccountDetailsResponse**](GetFinancialConnectionsAccountDetailsResponse.md)

### Authorization

[fuseApiKey](../README.md#fuseApiKey), [fuseClientId](../README.md#fuseClientId)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a id="getFinancialConnectionsAccountStatement"></a>
# **getFinancialConnectionsAccountStatement**
> GetFinancialConnectionsAccountStatementResponse getFinancialConnectionsAccountStatement(getFinancialConnectionsAccountStatementRequest)



Retrieves an account statement for the given financial connection, account and date. This endpoint may time out so we recommend using a retry mechanism with exponential backoff.

### Example
```java
// Import classes:
import org.fuse.client.ApiClient;
import org.fuse.client.ApiException;
import org.fuse.client.Configuration;
import org.fuse.client.auth.*;
import org.fuse.client.models.*;
import org.fuse.client.api.FuseApi;

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

    FuseApi apiInstance = new FuseApi(defaultClient);
    GetFinancialConnectionsAccountStatementRequest getFinancialConnectionsAccountStatementRequest = new GetFinancialConnectionsAccountStatementRequest(); // GetFinancialConnectionsAccountStatementRequest | 
    try {
      GetFinancialConnectionsAccountStatementResponse result = apiInstance.getFinancialConnectionsAccountStatement(getFinancialConnectionsAccountStatementRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FuseApi#getFinancialConnectionsAccountStatement");
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
| **getFinancialConnectionsAccountStatementRequest** | [**GetFinancialConnectionsAccountStatementRequest**](GetFinancialConnectionsAccountStatementRequest.md)|  | [optional] |

### Return type

[**GetFinancialConnectionsAccountStatementResponse**](GetFinancialConnectionsAccountStatementResponse.md)

### Authorization

[fuseApiKey](../README.md#fuseApiKey), [fuseClientId](../README.md#fuseClientId)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="getFinancialConnectionsAccounts"></a>
# **getFinancialConnectionsAccounts**
> GetFinancialConnectionsAccountsResponse getFinancialConnectionsAccounts(getFinancialConnectionsAccountsRequest)

Get accounts

### Example
```java
// Import classes:
import org.fuse.client.ApiClient;
import org.fuse.client.ApiException;
import org.fuse.client.Configuration;
import org.fuse.client.auth.*;
import org.fuse.client.models.*;
import org.fuse.client.api.FuseApi;

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

    FuseApi apiInstance = new FuseApi(defaultClient);
    GetFinancialConnectionsAccountsRequest getFinancialConnectionsAccountsRequest = new GetFinancialConnectionsAccountsRequest(); // GetFinancialConnectionsAccountsRequest | 
    try {
      GetFinancialConnectionsAccountsResponse result = apiInstance.getFinancialConnectionsAccounts(getFinancialConnectionsAccountsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FuseApi#getFinancialConnectionsAccounts");
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
| **getFinancialConnectionsAccountsRequest** | [**GetFinancialConnectionsAccountsRequest**](GetFinancialConnectionsAccountsRequest.md)|  | |

### Return type

[**GetFinancialConnectionsAccountsResponse**](GetFinancialConnectionsAccountsResponse.md)

### Authorization

[fuseApiKey](../README.md#fuseApiKey), [fuseClientId](../README.md#fuseClientId)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="getFinancialConnectionsBalances"></a>
# **getFinancialConnectionsBalances**
> GetFinancialConnectionsBalanceResponse getFinancialConnectionsBalances(getFinancialConnectionsBalanceRequest)

Get balances

### Example
```java
// Import classes:
import org.fuse.client.ApiClient;
import org.fuse.client.ApiException;
import org.fuse.client.Configuration;
import org.fuse.client.auth.*;
import org.fuse.client.models.*;
import org.fuse.client.api.FuseApi;

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

    FuseApi apiInstance = new FuseApi(defaultClient);
    GetFinancialConnectionsBalanceRequest getFinancialConnectionsBalanceRequest = new GetFinancialConnectionsBalanceRequest(); // GetFinancialConnectionsBalanceRequest | 
    try {
      GetFinancialConnectionsBalanceResponse result = apiInstance.getFinancialConnectionsBalances(getFinancialConnectionsBalanceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FuseApi#getFinancialConnectionsBalances");
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
| **getFinancialConnectionsBalanceRequest** | [**GetFinancialConnectionsBalanceRequest**](GetFinancialConnectionsBalanceRequest.md)|  | |

### Return type

[**GetFinancialConnectionsBalanceResponse**](GetFinancialConnectionsBalanceResponse.md)

### Authorization

[fuseApiKey](../README.md#fuseApiKey), [fuseClientId](../README.md#fuseClientId)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="getFinancialConnectionsOwners"></a>
# **getFinancialConnectionsOwners**
> GetFinancialConnectionsOwnersResponse getFinancialConnectionsOwners(getFinancialConnectionsOwnersRequest)

Get account owners

### Example
```java
// Import classes:
import org.fuse.client.ApiClient;
import org.fuse.client.ApiException;
import org.fuse.client.Configuration;
import org.fuse.client.auth.*;
import org.fuse.client.models.*;
import org.fuse.client.api.FuseApi;

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

    FuseApi apiInstance = new FuseApi(defaultClient);
    GetFinancialConnectionsOwnersRequest getFinancialConnectionsOwnersRequest = new GetFinancialConnectionsOwnersRequest(); // GetFinancialConnectionsOwnersRequest | 
    try {
      GetFinancialConnectionsOwnersResponse result = apiInstance.getFinancialConnectionsOwners(getFinancialConnectionsOwnersRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FuseApi#getFinancialConnectionsOwners");
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
| **getFinancialConnectionsOwnersRequest** | [**GetFinancialConnectionsOwnersRequest**](GetFinancialConnectionsOwnersRequest.md)|  | |

### Return type

[**GetFinancialConnectionsOwnersResponse**](GetFinancialConnectionsOwnersResponse.md)

### Authorization

[fuseApiKey](../README.md#fuseApiKey), [fuseClientId](../README.md#fuseClientId)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a id="getFinancialConnectionsTransactions"></a>
# **getFinancialConnectionsTransactions**
> GetFinancialConnectionsTransactionsResponse getFinancialConnectionsTransactions(getFinancialConnectionsTransactionsRequest)

Get transactions

### Example
```java
// Import classes:
import org.fuse.client.ApiClient;
import org.fuse.client.ApiException;
import org.fuse.client.Configuration;
import org.fuse.client.auth.*;
import org.fuse.client.models.*;
import org.fuse.client.api.FuseApi;

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

    FuseApi apiInstance = new FuseApi(defaultClient);
    GetFinancialConnectionsTransactionsRequest getFinancialConnectionsTransactionsRequest = new GetFinancialConnectionsTransactionsRequest(); // GetFinancialConnectionsTransactionsRequest | 
    try {
      GetFinancialConnectionsTransactionsResponse result = apiInstance.getFinancialConnectionsTransactions(getFinancialConnectionsTransactionsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FuseApi#getFinancialConnectionsTransactions");
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
| **getFinancialConnectionsTransactionsRequest** | [**GetFinancialConnectionsTransactionsRequest**](GetFinancialConnectionsTransactionsRequest.md)|  | |

### Return type

[**GetFinancialConnectionsTransactionsResponse**](GetFinancialConnectionsTransactionsResponse.md)

### Authorization

[fuseApiKey](../README.md#fuseApiKey), [fuseClientId](../README.md#fuseClientId)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a id="getFinancialInstitution"></a>
# **getFinancialInstitution**
> GetFinancialInstitutionResponse getFinancialInstitution(institutionId)

Get a financial institution

Receive metadata for a financial institution

### Example
```java
// Import classes:
import org.fuse.client.ApiClient;
import org.fuse.client.ApiException;
import org.fuse.client.Configuration;
import org.fuse.client.auth.*;
import org.fuse.client.models.*;
import org.fuse.client.api.FuseApi;

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

    FuseApi apiInstance = new FuseApi(defaultClient);
    String institutionId = "institutionId_example"; // String | 
    try {
      GetFinancialInstitutionResponse result = apiInstance.getFinancialInstitution(institutionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FuseApi#getFinancialInstitution");
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
| **institutionId** | **String**|  | |

### Return type

[**GetFinancialInstitutionResponse**](GetFinancialInstitutionResponse.md)

### Authorization

[fuseApiKey](../README.md#fuseApiKey), [fuseClientId](../README.md#fuseClientId)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Financial institution metadata |  -  |

<a id="getInvestmentHoldings"></a>
# **getInvestmentHoldings**
> GetInvestmentHoldingsResponse getInvestmentHoldings(getInvestmentHoldingsRequest)

Get investment holdings

### Example
```java
// Import classes:
import org.fuse.client.ApiClient;
import org.fuse.client.ApiException;
import org.fuse.client.Configuration;
import org.fuse.client.auth.*;
import org.fuse.client.models.*;
import org.fuse.client.api.FuseApi;

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

    FuseApi apiInstance = new FuseApi(defaultClient);
    GetInvestmentHoldingsRequest getInvestmentHoldingsRequest = new GetInvestmentHoldingsRequest(); // GetInvestmentHoldingsRequest | 
    try {
      GetInvestmentHoldingsResponse result = apiInstance.getInvestmentHoldings(getInvestmentHoldingsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FuseApi#getInvestmentHoldings");
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
| **getInvestmentHoldingsRequest** | [**GetInvestmentHoldingsRequest**](GetInvestmentHoldingsRequest.md)|  | |

### Return type

[**GetInvestmentHoldingsResponse**](GetInvestmentHoldingsResponse.md)

### Authorization

[fuseApiKey](../README.md#fuseApiKey), [fuseClientId](../README.md#fuseClientId)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="getInvestmentTransactions"></a>
# **getInvestmentTransactions**
> GetInvestmentTransactionsResponse getInvestmentTransactions(getInvestmentTransactionsRequest)

Get investment transactions

### Example
```java
// Import classes:
import org.fuse.client.ApiClient;
import org.fuse.client.ApiException;
import org.fuse.client.Configuration;
import org.fuse.client.auth.*;
import org.fuse.client.models.*;
import org.fuse.client.api.FuseApi;

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

    FuseApi apiInstance = new FuseApi(defaultClient);
    GetInvestmentTransactionsRequest getInvestmentTransactionsRequest = new GetInvestmentTransactionsRequest(); // GetInvestmentTransactionsRequest | 
    try {
      GetInvestmentTransactionsResponse result = apiInstance.getInvestmentTransactions(getInvestmentTransactionsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FuseApi#getInvestmentTransactions");
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
| **getInvestmentTransactionsRequest** | [**GetInvestmentTransactionsRequest**](GetInvestmentTransactionsRequest.md)|  | |

### Return type

[**GetInvestmentTransactionsResponse**](GetInvestmentTransactionsResponse.md)

### Authorization

[fuseApiKey](../README.md#fuseApiKey), [fuseClientId](../README.md#fuseClientId)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="migrateFinancialConnection"></a>
# **migrateFinancialConnection**
> MigrateFinancialConnectionsTokenResponse migrateFinancialConnection(migrateFinancialConnectionsTokenRequest)

Migrate financial connection

This endpoint migrates financial connections from Plaid or MX into the unified Fuse API. It accepts a POST request with connection data, aggregator, entity, and Fuse products, and responds with a JSON payload containing the migrated connection&#39;s data, access token, ID, and request ID.

### Example
```java
// Import classes:
import org.fuse.client.ApiClient;
import org.fuse.client.ApiException;
import org.fuse.client.Configuration;
import org.fuse.client.auth.*;
import org.fuse.client.models.*;
import org.fuse.client.api.FuseApi;

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

    FuseApi apiInstance = new FuseApi(defaultClient);
    MigrateFinancialConnectionsTokenRequest migrateFinancialConnectionsTokenRequest = new MigrateFinancialConnectionsTokenRequest(); // MigrateFinancialConnectionsTokenRequest | 
    try {
      MigrateFinancialConnectionsTokenResponse result = apiInstance.migrateFinancialConnection(migrateFinancialConnectionsTokenRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FuseApi#migrateFinancialConnection");
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
| **migrateFinancialConnectionsTokenRequest** | [**MigrateFinancialConnectionsTokenRequest**](MigrateFinancialConnectionsTokenRequest.md)|  | [optional] |

### Return type

[**MigrateFinancialConnectionsTokenResponse**](MigrateFinancialConnectionsTokenResponse.md)

### Authorization

[fuseApiKey](../README.md#fuseApiKey), [fuseClientId](../README.md#fuseClientId)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a id="refreshAssetReport"></a>
# **refreshAssetReport**
> AssetReportResponse refreshAssetReport(refreshAssetReportRequest)



Refreshes the Asset Report in JSON format. For Plaid, you will need to have the assets product enabled on your plaid account.

### Example
```java
// Import classes:
import org.fuse.client.ApiClient;
import org.fuse.client.ApiException;
import org.fuse.client.Configuration;
import org.fuse.client.auth.*;
import org.fuse.client.models.*;
import org.fuse.client.api.FuseApi;

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

    FuseApi apiInstance = new FuseApi(defaultClient);
    RefreshAssetReportRequest refreshAssetReportRequest = new RefreshAssetReportRequest(); // RefreshAssetReportRequest | 
    try {
      AssetReportResponse result = apiInstance.refreshAssetReport(refreshAssetReportRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FuseApi#refreshAssetReport");
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
| **refreshAssetReportRequest** | [**RefreshAssetReportRequest**](RefreshAssetReportRequest.md)|  | [optional] |

### Return type

[**AssetReportResponse**](AssetReportResponse.md)

### Authorization

[fuseApiKey](../README.md#fuseApiKey), [fuseClientId](../README.md#fuseClientId)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

<a id="syncFinancialConnectionsData"></a>
# **syncFinancialConnectionsData**
> SyncFinancialConnectionsDataResponse syncFinancialConnectionsData(fuseVerification, body)

Sync financial connections data

Call this endpoint upon receiving a financial_connection.sync_data webhook. This will keep the financial connections data up to date.

### Example
```java
// Import classes:
import org.fuse.client.ApiClient;
import org.fuse.client.ApiException;
import org.fuse.client.Configuration;
import org.fuse.client.auth.*;
import org.fuse.client.models.*;
import org.fuse.client.api.FuseApi;

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

    FuseApi apiInstance = new FuseApi(defaultClient);
    String fuseVerification = "fuseVerification_example"; // String | 
    Object body = null; // Object | 
    try {
      SyncFinancialConnectionsDataResponse result = apiInstance.syncFinancialConnectionsData(fuseVerification, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FuseApi#syncFinancialConnectionsData");
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
| **fuseVerification** | **String**|  | |
| **body** | **Object**|  | |

### Return type

[**SyncFinancialConnectionsDataResponse**](SyncFinancialConnectionsDataResponse.md)

### Authorization

[fuseApiKey](../README.md#fuseApiKey), [fuseClientId](../README.md#fuseClientId)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully synchronized transactions |  -  |

<a id="updateConsumerRiskReportCustomization"></a>
# **updateConsumerRiskReportCustomization**
> UpdateConsumerRiskReportCustomizationResponse updateConsumerRiskReportCustomization(consumerRiskReportCustomizationId, updateConsumerRiskReportCustomizationRequest)

Update consumer risk report customization

### Example
```java
// Import classes:
import org.fuse.client.ApiClient;
import org.fuse.client.ApiException;
import org.fuse.client.Configuration;
import org.fuse.client.auth.*;
import org.fuse.client.models.*;
import org.fuse.client.api.FuseApi;

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

    FuseApi apiInstance = new FuseApi(defaultClient);
    String consumerRiskReportCustomizationId = "consumerRiskReportCustomizationId_example"; // String | 
    UpdateConsumerRiskReportCustomizationRequest updateConsumerRiskReportCustomizationRequest = new UpdateConsumerRiskReportCustomizationRequest(); // UpdateConsumerRiskReportCustomizationRequest | 
    try {
      UpdateConsumerRiskReportCustomizationResponse result = apiInstance.updateConsumerRiskReportCustomization(consumerRiskReportCustomizationId, updateConsumerRiskReportCustomizationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FuseApi#updateConsumerRiskReportCustomization");
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
| **updateConsumerRiskReportCustomizationRequest** | [**UpdateConsumerRiskReportCustomizationRequest**](UpdateConsumerRiskReportCustomizationRequest.md)|  | [optional] |

### Return type

[**UpdateConsumerRiskReportCustomizationResponse**](UpdateConsumerRiskReportCustomizationResponse.md)

### Authorization

[fuseApiKey](../README.md#fuseApiKey), [fuseClientId](../README.md#fuseClientId)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="v1FinancialConnectionsLiabilitiesPost"></a>
# **v1FinancialConnectionsLiabilitiesPost**
> GetLiabilitiesResponse v1FinancialConnectionsLiabilitiesPost(getLiabilitiesRequest)

Get liabilities

### Example
```java
// Import classes:
import org.fuse.client.ApiClient;
import org.fuse.client.ApiException;
import org.fuse.client.Configuration;
import org.fuse.client.auth.*;
import org.fuse.client.models.*;
import org.fuse.client.api.FuseApi;

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

    FuseApi apiInstance = new FuseApi(defaultClient);
    GetLiabilitiesRequest getLiabilitiesRequest = new GetLiabilitiesRequest(); // GetLiabilitiesRequest | 
    try {
      GetLiabilitiesResponse result = apiInstance.v1FinancialConnectionsLiabilitiesPost(getLiabilitiesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FuseApi#v1FinancialConnectionsLiabilitiesPost");
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
| **getLiabilitiesRequest** | [**GetLiabilitiesRequest**](GetLiabilitiesRequest.md)|  | |

### Return type

[**GetLiabilitiesResponse**](GetLiabilitiesResponse.md)

### Authorization

[fuseApiKey](../README.md#fuseApiKey), [fuseClientId](../README.md#fuseClientId)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

