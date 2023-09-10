

# FinancialConnectionsAccount


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**remoteId** | **String** | Remote Id of the account, ie Plaid or Teller account id |  |
|**currency** | **String** | The ISO-4217 currency code of the account. |  |
|**fingerprint** | **String** | Uniquely identifies this account across all accounts for a single financial connection. Used for reconnection deduplication. See more information here: https://letsfuse.readme.io/docs/duplicate-accounts |  |
|**institution** | [**FinancialConnectionsAccountInstitution**](FinancialConnectionsAccountInstitution.md) |  |  [optional] |
|**mask** | **String** | The partial account number. |  [optional] |
|**name** | **String** | The account&#39;s name, ie &#39;My Checking&#39; |  |
|**type** | **AccountType** |  |  |
|**subtype** | **AccountSubtype** |  |  [optional] |
|**balance** | [**FinancialConnectionsAccountCachedBalance**](FinancialConnectionsAccountCachedBalance.md) |  |  |
|**remoteData** | **Object** |  |  |



