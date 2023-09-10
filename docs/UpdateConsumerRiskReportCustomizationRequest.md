

# UpdateConsumerRiskReportCustomizationRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**timeframe** | **ConsumerRiskReportTimeFrame** |  |  [optional] |
|**minLimit** | **BigDecimal** | The minimum allowed limit, in cents. |  [optional] |
|**maxLimit** | **BigDecimal** | The maximum allowed limit, in cents. |  [optional] |
|**riskTolerance** | **BigDecimal** | This parameter indicates the risk tolerance associated with spend limits. A high risk tolerance allow for higher limits, increasing both potential gains and losses. A Lower risk tolerance enforces strict limits, reducing the potential for loss but also limiting transaction volume for reliable users. |  [optional] |



