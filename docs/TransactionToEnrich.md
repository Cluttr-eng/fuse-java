

# TransactionToEnrich


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | A unique ID for the transaction that to help you tie data back to your systems. |  |
|**description** | **String** | The name of the merchant if available or a description of the transaction. |  |
|**mcc** | **String** | The merchant category code. |  [optional] |
|**amount** | **BigDecimal** | The amount of the transaction in cents, in the currency of the account. Must be a positive value. Use the type field to indicate the direction. |  |
|**direction** | [**DirectionEnum**](#DirectionEnum) | The direction of the transaction. |  |
|**countryCode** | **String** |  |  [optional] |
|**isoCurrencyCode** | **String** |  |  [optional] |
|**date** | **String** | The date the transaction was posted. |  [optional] |
|**ownerType** | [**OwnerTypeEnum**](#OwnerTypeEnum) |  |  [optional] |



## Enum: DirectionEnum

| Name | Value |
|---- | -----|
| INCOMING | &quot;incoming&quot; |
| OUTGOING | &quot;outgoing&quot; |



## Enum: OwnerTypeEnum

| Name | Value |
|---- | -----|
| CONSUMER | &quot;consumer&quot; |
| BUSINESS | &quot;business&quot; |



