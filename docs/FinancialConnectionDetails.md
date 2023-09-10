

# FinancialConnectionDetails


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The fuse financial connection id. |  |
|**connectionStatus** | [**ConnectionStatusEnum**](#ConnectionStatusEnum) | Connection status of the current financial connection |  |
|**connectionStatusUpdatedAt** | **String** | Last time the connection status was updated in ISO-8601 format. |  |
|**isOauth** | **Boolean** | Whether this is an oauth connection |  |
|**aggregator** | **Aggregator** |  |  |
|**plaid** | [**FinancialConnectionDetailsPlaid**](FinancialConnectionDetailsPlaid.md) |  |  [optional] |
|**teller** | [**FinancialConnectionDetailsTeller**](FinancialConnectionDetailsTeller.md) |  |  [optional] |
|**mx** | [**FinancialConnectionDetailsMx**](FinancialConnectionDetailsMx.md) |  |  [optional] |
|**snaptrade** | [**FinancialConnectionDetailsSnaptrade**](FinancialConnectionDetailsSnaptrade.md) |  |  [optional] |
|**flinks** | [**FinancialConnectionDetailsFlinks**](FinancialConnectionDetailsFlinks.md) |  |  [optional] |
|**mono** | [**FinancialConnectionDetailsMono**](FinancialConnectionDetailsMono.md) |  |  [optional] |
|**truelayer** | [**FinancialConnectionDetailsTruelayer**](FinancialConnectionDetailsTruelayer.md) |  |  [optional] |
|**finverse** | [**FinancialConnectionDetailsFinverse**](FinancialConnectionDetailsFinverse.md) |  |  [optional] |
|**basiq** | [**FinancialConnectionDetailsBasiq**](FinancialConnectionDetailsBasiq.md) |  |  [optional] |
|**belvo** | [**FinancialConnectionDetailsBelvo**](FinancialConnectionDetailsBelvo.md) |  |  [optional] |
|**finicity** | [**FinancialConnectionDetailsFinicity**](FinancialConnectionDetailsFinicity.md) |  |  [optional] |
|**akoya** | [**FinancialConnectionDetailsAkoya**](FinancialConnectionDetailsAkoya.md) |  |  [optional] |



## Enum: ConnectionStatusEnum

| Name | Value |
|---- | -----|
| CONNECTED | &quot;connected&quot; |
| DISCONNECTED | &quot;disconnected&quot; |
| FINISHED | &quot;finished&quot; |



