

# CreateLinkTokenRequestPlaid

An object specifying information about the Plaid configuration to use when creating a link token. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**config** | **Object** | Follows the same schema as Plaid&#39;s Link Token Create Schema(https://plaid.com/docs/api/tokens/#linktokencreate). &#39;products&#39;, &#39;client_id&#39;, &#39;secret&#39;, &#39;client_user_id&#39;, &#39;client_name&#39;, &#39;webhook&#39;, &#39;institution_data&#39; and &#39;country_codes&#39; (only US and Canada is supported right now) will be set by Fuse and override any values you set. |  [optional] |



