

# MigrateFinancialConnectionsTokenRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**connectionData** | [**MigrateFinancialConnectionsAggregatorConnectionData**](MigrateFinancialConnectionsAggregatorConnectionData.md) |  |  |
|**aggregator** | [**AggregatorEnum**](#AggregatorEnum) | The aggregator being migrated (either &#39;plaid&#39;, &#39;mx&#39; or &#39;teller). |  |
|**entity** | [**MigrateFinancialConnectionsTokenRequestEntity**](MigrateFinancialConnectionsTokenRequestEntity.md) |  |  |
|**fuseProducts** | **List&lt;Product&gt;** | A list of Fuse products that the migrated connection will have access to. |  |



## Enum: AggregatorEnum

| Name | Value |
|---- | -----|
| PLAID | &quot;plaid&quot; |
| MX | &quot;mx&quot; |
| TELLER | &quot;teller&quot; |



