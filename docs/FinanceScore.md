

# FinanceScore


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**value** | **BigDecimal** | The likelihood of a credit default. A higher score implies lower risk. The finance score and all finance score metrics are values between 0 and 1. This value is calculated by the weighted sum of the metrics below. |  |
|**savingsScore** | **BigDecimal** | This quantifies a user&#39;s monthly savings habits. A lower score represents minimal savings, while a higher score indicates a user who consistently sets aside a substantial portion of their income. |  |
|**expenseStabilityScore** | **BigDecimal** | This assesses the consistency of a user&#39;s monthly spending. A lower score indicates variable monthly expenditure, while a higher score represents consistent spending habits. |  |
|**activityAgeScore** | **BigDecimal** | This measures the regularity of a user&#39;s financial activity over a period of time. A lower score suggests limited activity, while a higher score is indicative of regular daily transactions over a long period of time. |  |
|**incomeScore** | **BigDecimal** | This evaluates the stability of a user&#39;s income. A lower score suggests inconsistent or low income, while a higher score represents high, consistent income. |  |
|**loanPaymentsScore** | **BigDecimal** | This evaluates a user&#39;s loan repayment behaviour. A lower score is assigned to those without loan payments, while a higher score denotes consistent loan payments, such as a mortgage. |  |
|**repaymentsScore** | **BigDecimal** | This quantifies a user&#39;s ability to repay debts. A lower score corresponds to missed payments, while a higher score signifies consistent debt repayment. |  |



