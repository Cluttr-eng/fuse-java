

# AddAccountEventsRequestEventsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | ID of the transaction |  |
|**eventType** | [**EventTypeEnum**](#EventTypeEnum) |  |  |
|**status** | **InAppTransactionEventStatus** |  |  |
|**amount** | **BigDecimal** |  |  |
|**countryCode** | **String** |  |  [optional] |
|**isoCurrencyCode** | **String** | The ISO-4217 currency code. |  |
|**transactionType** | **TransactionEventType** |  |  [optional] |
|**transactionDescription** | **String** |  |  [optional] |
|**transactionOwnerType** | [**TransactionOwnerTypeEnum**](#TransactionOwnerTypeEnum) |  |  [optional] |
|**merchantName** | **String** |  |  |
|**timestamp** | **String** | Datetime that the balance is accurate for In ISO-8601 format |  |
|**balance** | **BigDecimal** | The running balance of the account after the transaction has occurred, in cents. |  [optional] |
|**available** | **BigDecimal** | The current balance of the account factoring in pending transactions. |  [optional] |
|**current** | **BigDecimal** | The current balance of the account without factoring in pending transactions. |  [optional] |



## Enum: EventTypeEnum

| Name | Value |
|---- | -----|
| UPDATED_BALANCE | &quot;updated_balance&quot; |



## Enum: TransactionOwnerTypeEnum

| Name | Value |
|---- | -----|
| CONSUMER | &quot;consumer&quot; |
| BUSINESS | &quot;business&quot; |



