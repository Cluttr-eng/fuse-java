

# AssetReport

The Asset Report in JSON format.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**assetReportId** | **String** | A unique ID identifying an Asset Report. |  [optional] |
|**assetReportToken** | **String** | A token that can be provided to endpoints such as /asset_report/get or /asset_report/pdf/get to fetch or update an Asset Report. |  [optional] |
|**dateGenerated** | **String** | The date and time when the Asset Report was created, in ISO 8601 format |  [optional] |
|**daysRequested** | **Integer** | The duration of transaction history you requested |  [optional] |
|**accounts** | [**List&lt;AssetReportAccountsInner&gt;**](AssetReportAccountsInner.md) | An array of Asset Reports, one for each account in the Asset Report. |  [optional] |



