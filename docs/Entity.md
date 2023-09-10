

# Entity


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier for the user or business account that is connecting to an institution. Use this id when calling the GET /entities/${entity_id} endpoint. |  |
|**name** | **String** | Name for the user or business account. Required for EU connections. |  [optional] |
|**email** | **String** | Email address associated with the user or business account. One of email/phone is required for EU connections. |  [optional] |
|**phone** | **String** | Phone number associated with the user or business account. One of email/phone is required for EU connections. |  [optional] |



