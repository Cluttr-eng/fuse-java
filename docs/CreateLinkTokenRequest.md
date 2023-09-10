

# CreateLinkTokenRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**institutionId** | **String** | An id that is unique for an institution. |  |
|**entity** | [**Entity**](Entity.md) |  |  |
|**clientName** | **String** | The name of your application. This is what will be displayed to users. |  |
|**sessionClientSecret** | **String** | The session client secret created from the &#39;Create session client secret&#39; endpoint |  |
|**webhookUrl** | **String** | This field allows you to set a unique webhook URL for each individual entity. By specifying an entity-specific webhook URL, you can receive and process data events for each entity separately. If this field is left empty, the organization-wide webhook URL set in the sandbox/production environment will be used as the default for all entities. |  [optional] |
|**mx** | [**CreateLinkTokenRequestMx**](CreateLinkTokenRequestMx.md) |  |  [optional] |
|**plaid** | [**CreateLinkTokenRequestPlaid**](CreateLinkTokenRequestPlaid.md) |  |  [optional] |
|**teller** | [**CreateLinkTokenRequestTeller**](CreateLinkTokenRequestTeller.md) |  |  [optional] |
|**snaptrade** | [**CreateLinkTokenRequestSnaptrade**](CreateLinkTokenRequestSnaptrade.md) |  |  [optional] |



