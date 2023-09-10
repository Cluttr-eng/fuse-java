

# FinancialConnectionsInvestmentSecurity


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**remoteId** | **String** | Remote Id of the security, ie Plaid or Snaptrade security id |  |
|**symbol** | **String** | The trading symbol for publicly traded securities, or a short identifier if available. |  |
|**isin** | **String** | The International Securities Identification Number (ISIN) uniquely identifies the security. |  [optional] |
|**sedol** | **String** | The Stock Exchange Daily Official List (SEDOL) code uniquely identifies the security, primarily used in the United Kingdom and Ireland. |  [optional] |
|**cusip** | **String** | The Committee on Uniform Securities Identification Procedures (CUSIP) number uniquely identifies the security, primarily used in the United States and Canada. |  [optional] |
|**closePrice** | **BigDecimal** | The closing price of the security, in cents, at the end of the most recent trading day. The format of this value is a double. |  [optional] |
|**currency** | [**Currency**](Currency.md) |  |  |
|**name** | **String** | A descriptive name for the security, suitable for display. |  [optional] |
|**type** | **FinancialConnectionsInvestmentSecurityType** |  |  [optional] |
|**exchange** | [**FinancialConnectionsInvestmentSecurityExchange**](FinancialConnectionsInvestmentSecurityExchange.md) |  |  [optional] |



