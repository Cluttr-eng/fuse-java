

# CreateSessionRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**supportedFinancialInstitutionAggregators** | **List&lt;Aggregator&gt;** |  |  |
|**products** | **List&lt;Product&gt;** | List of products that you would like the institutions to support |  |
|**countryCodes** | **List&lt;CountryCode&gt;** | List of country codes that you would like the institutions to support |  [optional] |
|**entity** | [**Entity**](Entity.md) |  |  |
|**accessToken** | **String** | The fuse access token for an existing financial connection. This will perform the process to reconnect an existing disconnected account. |  [optional] |
|**isWebView** | **Boolean** | Set to false for web SDKs (e.g., React), and true for mobile SDKs (e.g., React Native, Flutter, iOS, Android). |  [optional] |



