

# FinancialConnectionsAccountLiability


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
|**additionalBalances** | [**List&lt;FinancialConnectionsAccountCachedBalance&gt;**](FinancialConnectionsAccountCachedBalance.md) | An array of additional balances. This may be used for investment type accounts where the user can have multiple balances across different currencies. |  [optional] |
|**remoteData** | **Object** |  |  |
|**aprs** | [**List&lt;FinancialConnectionsAccountLiabilityAllOfAprs&gt;**](FinancialConnectionsAccountLiabilityAllOfAprs.md) | The various interest rates that apply to the account. If APR data is not available, this array will be empty. |  [optional] |
|**interestRatePercentage** | **BigDecimal** | The interest rate on the loan as a percentage. |  [optional] |
|**originationPrincipalAmount** | **BigDecimal** | The original principal balance of the loan. |  [optional] |
|**nextPaymentDueDate** | **String** | The due date for the next payment. The due date is null if a payment is not expected. |  [optional] |
|**lastPaymentDate** | **String** | The date of the last payment. Dates are returned in an ISO 8601 format (YYYY-MM-DD). |  [optional] |
|**lastPaymentAmount** | **BigDecimal** | The amount of the last payment. |  [optional] |
|**minimumPaymentAmount** | **BigDecimal** | The minimum payment required for an account. This can apply to any debt account. |  [optional] |



