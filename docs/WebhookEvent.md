

# WebhookEvent


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **WebhookType** |  |  |
|**financialConnectionId** | **String** | Financial connection id associated with the webhook |  |
|**environment** | [**EnvironmentEnum**](#EnvironmentEnum) |  |  |
|**source** | **WebhookSource** |  |  |
|**verificationToken** | **String** | Aggregator verification data needed to verify the webhook |  [optional] |
|**assetReportId** | **String** | Exists for assets.report_ready webhooks |  [optional] |
|**historicalTransactionsAvailable** | **Boolean** | Exists for transactions.updates webhooks. Indicates if historical transaction information (up to 24 months) is ready to be queried. |  [optional] |
|**removedTransactionIds** | **List&lt;String&gt;** | Exists for transactions.updates webhooks. Currently only supported by Plaid. |  [optional] |
|**remoteData** | **Object** |  |  |



## Enum: EnvironmentEnum

| Name | Value |
|---- | -----|
| SANDBOX | &quot;sandbox&quot; |
| PRODUCTION | &quot;production&quot; |



