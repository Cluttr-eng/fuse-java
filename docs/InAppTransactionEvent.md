

# InAppTransactionEvent


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | ID of the transaction |  |
|**eventType** | [**EventTypeEnum**](#EventTypeEnum) |  |  |
|**status** | **InAppTransactionEventStatus** |  |  |
|**amount** | **BigDecimal** |  |  |
|**isoCurrencyCode** | **String** | The ISO-4217 currency code. |  |
|**transactionType** | **TransactionEventType** |  |  [optional] |
|**merchantName** | **String** |  |  |
|**timestamp** | **String** | Datetime of the transaction In ISO-8601 format |  |
|**balance** | **BigDecimal** | The running balance of the account after the transaction has occurred, in cents. |  [optional] |



## Enum: EventTypeEnum

| Name | Value |
|---- | -----|
| IN_APP_TRANSACTION | &quot;in_app_transaction&quot; |



