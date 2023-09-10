

# ExternalTransactionEvent


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | ID of the transaction |  |
|**eventType** | [**EventTypeEnum**](#EventTypeEnum) |  |  |
|**status** | **ExternalTransactionEventStatus** |  |  |
|**amount** | **BigDecimal** | Amount in cents associated with the transaction. Use positive values to represent money going out and negative to represent money going in. |  |
|**countryCode** | **String** |  |  [optional] |
|**isoCurrencyCode** | **String** | The ISO-4217 currency code. |  |
|**transactionType** | **TransactionEventType** |  |  [optional] |
|**transactionDescription** | **String** |  |  [optional] |
|**transactionOwnerType** | [**TransactionOwnerTypeEnum**](#TransactionOwnerTypeEnum) |  |  [optional] |
|**merchantName** | **String** |  |  |
|**timestamp** | **String** | Datetime of the transaction In ISO-8601 format |  |
|**balance** | **BigDecimal** | The running balance of the account after the transaction has occurred, in cents |  [optional] |



## Enum: EventTypeEnum

| Name | Value |
|---- | -----|
| EXTERNAL_TRANSACTION | &quot;external_transaction&quot; |



## Enum: TransactionOwnerTypeEnum

| Name | Value |
|---- | -----|
| CONSUMER | &quot;consumer&quot; |
| BUSINESS | &quot;business&quot; |



