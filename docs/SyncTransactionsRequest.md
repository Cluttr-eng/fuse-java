

# SyncTransactionsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accessToken** | **String** | The access token of the financial institution connection |  |
|**cursor** | **String** | The cursor value represents the last update requested. Providing it will cause the response to only return changes after this update. If omitted, the entire history of updates will be returned, starting with the first-added transactions on the item. |  [optional] |
|**count** | **Integer** | The number of transaction updates to fetch. |  [optional] |



