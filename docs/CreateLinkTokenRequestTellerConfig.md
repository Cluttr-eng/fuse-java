

# CreateLinkTokenRequestTellerConfig


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**selectAccount** | [**SelectAccountEnum**](#SelectAccountEnum) | The mode of account selection: - &#39;disabled&#39;: automatically connect all the supported financial accounts associated with this user&#39;s account at the institution (default). - &#39;single&#39;: the user will see a list of supported financial accounts and will need to select one to connect - &#39;multiple&#39;: the user will see a list of supported financial accounts and will need to select one or more to connect |  [optional] |
|**accountFilter** | [**CreateLinkTokenRequestTellerConfigAccountFilter**](CreateLinkTokenRequestTellerConfigAccountFilter.md) |  |  [optional] |



## Enum: SelectAccountEnum

| Name | Value |
|---- | -----|
| DISABLED | &quot;disabled&quot; |
| SINGLE | &quot;single&quot; |
| MULTIPLE | &quot;multiple&quot; |



