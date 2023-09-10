

# MigrateFinancialConnectionsAggregatorConnectionDataPlaid

Details of the Plaid connection to migrate into the unified Fuse API.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accessToken** | **String** | The Plaid access token associated with the user&#39;s financial accounts. |  |
|**useItemWebhook** | **Boolean** | If true, any webhooks received for this new financial connection will be sent to the webhook url used when the item was created. If false, the webhook url set at the organization sandbox/production environment level will be used instead. |  [optional] |



