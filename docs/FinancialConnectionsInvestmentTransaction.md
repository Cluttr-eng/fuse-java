

# FinancialConnectionsInvestmentTransaction


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**remoteId** | **String** | The remote ID of the Investment transaction |  |
|**remoteAccountId** | **String** | Remote Account Id of the transaction, ie Plaid Account Id |  |
|**accountName** | **String** | The name of the account associated with the investment transaction |  [optional] |
|**amount** | **BigDecimal** | The amount of the investment transaction, in cents. The format of this value is a double. |  |
|**description** | **String** | A description of the investment transaction |  |
|**fees** | **BigDecimal** | The fees associated with the investment transaction, in cents. The format of this value is a double. |  |
|**currency** | [**Currency**](Currency.md) |  |  |
|**date** | **OffsetDateTime** | The date and time of the investment transaction |  |
|**type** | [**TypeEnum**](#TypeEnum) | The type of the investment transaction (e.g., &#39;buy&#39;, &#39;sell&#39;, &#39;dividend&#39;) |  |
|**subtype** | **FinancialConnectionsInvestmentTransactionSubtype** |  |  [optional] |
|**quantity** | **BigDecimal** | The number of units of the security involved in this transaction |  |
|**price** | **BigDecimal** | The price of the security involved in this transaction, in cents. The format of this value is a double. |  |
|**security** | [**FinancialConnectionsInvestmentSecurity**](FinancialConnectionsInvestmentSecurity.md) |  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| CASH | &quot;cash&quot; |
| BUY | &quot;buy&quot; |
| SELL | &quot;sell&quot; |
| TRANSFER | &quot;transfer&quot; |
| FEE | &quot;fee&quot; |
| CANCEL | &quot;cancel&quot; |
| MINUS | &quot;-&quot; |



