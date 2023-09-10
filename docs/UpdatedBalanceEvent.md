

# UpdatedBalanceEvent


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**eventType** | [**EventTypeEnum**](#EventTypeEnum) |  |  |
|**isoCurrencyCode** | **String** | The ISO-4217 currency code. |  |
|**timestamp** | **String** | Datetime that the balance is accurate for In ISO-8601 format |  |
|**available** | **BigDecimal** | The current balance of the account factoring in pending transactions. |  [optional] |
|**current** | **BigDecimal** | The current balance of the account without factoring in pending transactions. |  [optional] |



## Enum: EventTypeEnum

| Name | Value |
|---- | -----|
| UPDATED_BALANCE | &quot;updated_balance&quot; |



