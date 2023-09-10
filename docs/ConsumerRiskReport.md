

# ConsumerRiskReport


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  |
|**customizationId** | **String** |  |  |
|**spendLimit** | **BigDecimal** | The total limit for the current timeframe, in cents. |  |
|**currentSpend** | **BigDecimal** | The total current spend in the current timeframe, in cents, without factoring in pending payments. |  |
|**pendingPaymentsAmount** | **BigDecimal** | The total unpaid amount, in cents, from all timeframes. |  |
|**isoCurrencyCode** | **String** | The ISO-4217 currency code of the transaction |  |
|**lastUpdated** | **String** | The datetime of when the consumer risk report was most recently updated, in ISO-8601 format. |  |
|**financeScore** | [**FinanceScore**](FinanceScore.md) |  |  |
|**predictedBalance** | **BigDecimal** | Predicted balance for the timeframe. |  |



