

# SyncTransactionsResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**added** | [**List&lt;Transaction&gt;**](Transaction.md) | Transactions that have been added to the item since &#x60;cursor&#x60; ordered by ascending last modified time. |  [optional] |
|**modified** | [**List&lt;Transaction&gt;**](Transaction.md) | Transactions that have been modified on the item since &#x60;cursor&#x60; ordered by ascending last modified time. |  [optional] |
|**removed** | [**List&lt;SyncTransactionsResponseRemovedInner&gt;**](SyncTransactionsResponseRemovedInner.md) | Transactions that have been removed from the item since &#x60;cursor&#x60; ordered by ascending last modified time. |  [optional] |
|**nextCursor** | **String** | Cursor used for fetching any future updates after the latest update provided in this response. The cursor obtained after all pages have been pulled (indicated by &#x60;has_next&#x60; being &#x60;false&#x60;) will be valid for at least 1 year. This cursor should be persisted for later calls. |  [optional] |
|**hasNext** | **Boolean** | Represents if more than requested count of transaction updates exist. If true, the additional updates can be fetched by making an additional request with &#x60;cursor&#x60; set to &#x60;next_cursor&#x60;. If &#x60;has_next&#x60; is true, it&#39;s important to pull all available pages, to make it less likely for underlying data changes to conflict with pagination. |  [optional] |
|**requestId** | **String** | An identifier that is exclusive to the request and can serve as a means for investigating and resolving issues. |  [optional] |



