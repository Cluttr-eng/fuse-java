/*
 * Fuse
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.AddAccountEventsRequest;
import org.openapitools.client.model.AddAccountEventsResponse;
import org.openapitools.client.model.AssetReportResponse;
import org.openapitools.client.model.CreateAssetReportRequest;
import org.openapitools.client.model.CreateAssetReportResponse;
import org.openapitools.client.model.CreateConsumerRiskReportCustomizationRequest;
import org.openapitools.client.model.CreateConsumerRiskReportCustomizationResponse;
import org.openapitools.client.model.CreateConsumerRiskReportRequest;
import org.openapitools.client.model.CreateConsumerRiskReportResponse;
import org.openapitools.client.model.CreateLinkTokenRequest;
import org.openapitools.client.model.CreateLinkTokenResponse;
import org.openapitools.client.model.CreateSessionRequest;
import org.openapitools.client.model.CreateSessionResponse;
import org.openapitools.client.model.DeleteFinancialConnectionResponse;
import org.openapitools.client.model.EnrichTransactionsRequest;
import org.openapitools.client.model.EnrichTransactionsResponse;
import org.openapitools.client.model.ExchangeFinancialConnectionsPublicTokenRequest;
import org.openapitools.client.model.ExchangeFinancialConnectionsPublicTokenResponse;
import org.openapitools.client.model.GetAssetReportRequest;
import org.openapitools.client.model.GetConsumerRiskReportResponse;
import org.openapitools.client.model.GetEntityResponse;
import org.openapitools.client.model.GetFinanceScoreResponse;
import org.openapitools.client.model.GetFinancialConnectionResponse;
import org.openapitools.client.model.GetFinancialConnectionsAccountDetailsRequest;
import org.openapitools.client.model.GetFinancialConnectionsAccountDetailsResponse;
import org.openapitools.client.model.GetFinancialConnectionsAccountStatementRequest;
import org.openapitools.client.model.GetFinancialConnectionsAccountStatementResponse;
import org.openapitools.client.model.GetFinancialConnectionsAccountsRequest;
import org.openapitools.client.model.GetFinancialConnectionsAccountsResponse;
import org.openapitools.client.model.GetFinancialConnectionsBalanceRequest;
import org.openapitools.client.model.GetFinancialConnectionsBalanceResponse;
import org.openapitools.client.model.GetFinancialConnectionsOwnersRequest;
import org.openapitools.client.model.GetFinancialConnectionsOwnersResponse;
import org.openapitools.client.model.GetFinancialConnectionsTransactionsRequest;
import org.openapitools.client.model.GetFinancialConnectionsTransactionsResponse;
import org.openapitools.client.model.GetFinancialInstitutionResponse;
import org.openapitools.client.model.GetInvestmentHoldingsRequest;
import org.openapitools.client.model.GetInvestmentHoldingsResponse;
import org.openapitools.client.model.GetInvestmentTransactionsRequest;
import org.openapitools.client.model.GetInvestmentTransactionsResponse;
import org.openapitools.client.model.GetLiabilitiesRequest;
import org.openapitools.client.model.GetLiabilitiesResponse;
import org.openapitools.client.model.MigrateFinancialConnectionsTokenRequest;
import org.openapitools.client.model.MigrateFinancialConnectionsTokenResponse;
import org.openapitools.client.model.RefreshAssetReportRequest;
import org.openapitools.client.model.RefreshAssetReportResponse;
import org.openapitools.client.model.SyncFinancialConnectionsDataResponse;
import org.openapitools.client.model.UpdateConsumerRiskReportCustomizationRequest;
import org.openapitools.client.model.UpdateConsumerRiskReportCustomizationResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FuseApi
 */
@Disabled
public class FuseApiTest {

    private final FuseApi api = new FuseApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addAccountEventsTest() throws ApiException {
        String accountId = null;
        AddAccountEventsRequest addAccountEventsRequest = null;
        AddAccountEventsResponse response = api.addAccountEvents(accountId, addAccountEventsRequest);
        // TODO: test validations
    }

    /**
     * Use this endpoint to generate an Asset Report for a user. For Plaid, you will need to have the assets product enabled on your plaid account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createAssetReportTest() throws ApiException {
        CreateAssetReportRequest createAssetReportRequest = null;
        CreateAssetReportResponse response = api.createAssetReport(createAssetReportRequest);
        // TODO: test validations
    }

    /**
     * Starts the background process that will calculate the consumer risk report depending on the customization passed in.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createConsumerRiskReportTest() throws ApiException {
        CreateConsumerRiskReportRequest createConsumerRiskReportRequest = null;
        CreateConsumerRiskReportResponse response = api.createConsumerRiskReport(createConsumerRiskReportRequest);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createConsumerRiskReportCustomizationTest() throws ApiException {
        CreateConsumerRiskReportCustomizationRequest createConsumerRiskReportCustomizationRequest = null;
        CreateConsumerRiskReportCustomizationResponse response = api.createConsumerRiskReportCustomization(createConsumerRiskReportCustomizationRequest);
        // TODO: test validations
    }

    /**
     * Create a link token to start the process of a user connecting to a specific financial institution.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createLinkTokenTest() throws ApiException {
        CreateLinkTokenRequest createLinkTokenRequest = null;
        CreateLinkTokenResponse response = api.createLinkToken(createLinkTokenRequest);
        // TODO: test validations
    }

    /**
     * Creates a session that returns a client_secret which is required as a parameter when initializing the Fuse SDK.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createSessionTest() throws ApiException {
        CreateSessionRequest createSessionRequest = null;
        CreateSessionResponse response = api.createSession(createSessionRequest);
        // TODO: test validations
    }

    /**
     * Delete a financial connection
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteFinancialConnectionTest() throws ApiException {
        String financialConnectionIdToDelete = null;
        DeleteFinancialConnectionResponse response = api.deleteFinancialConnection(financialConnectionIdToDelete);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void enrichTransactionsTest() throws ApiException {
        String fuseClientId = null;
        String fuseApiKey = null;
        EnrichTransactionsRequest enrichTransactionsRequest = null;
        EnrichTransactionsResponse response = api.enrichTransactions(fuseClientId, fuseApiKey, enrichTransactionsRequest);
        // TODO: test validations
    }

    /**
     * API to exchange a public token for an access token and financial connection id
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void exchangeFinancialConnectionsPublicTokenTest() throws ApiException {
        ExchangeFinancialConnectionsPublicTokenRequest exchangeFinancialConnectionsPublicTokenRequest = null;
        ExchangeFinancialConnectionsPublicTokenResponse response = api.exchangeFinancialConnectionsPublicToken(exchangeFinancialConnectionsPublicTokenRequest);
        // TODO: test validations
    }

    /**
     * Retrieves the Asset Report in JSON format. For Plaid, you will need to have the assets product enabled on your plaid account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAssetReportTest() throws ApiException {
        GetAssetReportRequest getAssetReportRequest = null;
        RefreshAssetReportResponse response = api.getAssetReport(getAssetReportRequest);
        // TODO: test validations
    }

    /**
     * Get consumer risk report
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getConsumerRiskReportTest() throws ApiException {
        String consumerRiskReportId = null;
        Boolean recalculate = null;
        GetConsumerRiskReportResponse response = api.getConsumerRiskReport(consumerRiskReportId, recalculate);
        // TODO: test validations
    }

    /**
     * Get entity
     *
     * An entity is automatically created after a successful connection. The id of the entity is what is set when calling the &#39;create session&#39; endpoint
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getEntityTest() throws ApiException {
        String entityId = null;
        GetEntityResponse response = api.getEntity(entityId);
        // TODO: test validations
    }

    /**
     * Get finance score
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getFinanceScoreTest() throws ApiException {
        String accountId = null;
        GetFinanceScoreResponse response = api.getFinanceScore(accountId);
        // TODO: test validations
    }

    /**
     * Get financial connection details
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getFinancialConnectionTest() throws ApiException {
        String financialConnectionId = null;
        GetFinancialConnectionResponse response = api.getFinancialConnection(financialConnectionId);
        // TODO: test validations
    }

    /**
     * Get account details
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getFinancialConnectionsAccountDetailsTest() throws ApiException {
        GetFinancialConnectionsAccountDetailsRequest getFinancialConnectionsAccountDetailsRequest = null;
        GetFinancialConnectionsAccountDetailsResponse response = api.getFinancialConnectionsAccountDetails(getFinancialConnectionsAccountDetailsRequest);
        // TODO: test validations
    }

    /**
     * Retrieves an account statement for the given financial connection, account and date. This endpoint may time out so we recommend using a retry mechanism with exponential backoff.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getFinancialConnectionsAccountStatementTest() throws ApiException {
        GetFinancialConnectionsAccountStatementRequest getFinancialConnectionsAccountStatementRequest = null;
        GetFinancialConnectionsAccountStatementResponse response = api.getFinancialConnectionsAccountStatement(getFinancialConnectionsAccountStatementRequest);
        // TODO: test validations
    }

    /**
     * Get accounts
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getFinancialConnectionsAccountsTest() throws ApiException {
        GetFinancialConnectionsAccountsRequest getFinancialConnectionsAccountsRequest = null;
        GetFinancialConnectionsAccountsResponse response = api.getFinancialConnectionsAccounts(getFinancialConnectionsAccountsRequest);
        // TODO: test validations
    }

    /**
     * Get balances
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getFinancialConnectionsBalancesTest() throws ApiException {
        GetFinancialConnectionsBalanceRequest getFinancialConnectionsBalanceRequest = null;
        GetFinancialConnectionsBalanceResponse response = api.getFinancialConnectionsBalances(getFinancialConnectionsBalanceRequest);
        // TODO: test validations
    }

    /**
     * Get account owners
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getFinancialConnectionsOwnersTest() throws ApiException {
        GetFinancialConnectionsOwnersRequest getFinancialConnectionsOwnersRequest = null;
        GetFinancialConnectionsOwnersResponse response = api.getFinancialConnectionsOwners(getFinancialConnectionsOwnersRequest);
        // TODO: test validations
    }

    /**
     * Get transactions
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getFinancialConnectionsTransactionsTest() throws ApiException {
        GetFinancialConnectionsTransactionsRequest getFinancialConnectionsTransactionsRequest = null;
        GetFinancialConnectionsTransactionsResponse response = api.getFinancialConnectionsTransactions(getFinancialConnectionsTransactionsRequest);
        // TODO: test validations
    }

    /**
     * Get a financial institution
     *
     * Receive metadata for a financial institution
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getFinancialInstitutionTest() throws ApiException {
        String institutionId = null;
        GetFinancialInstitutionResponse response = api.getFinancialInstitution(institutionId);
        // TODO: test validations
    }

    /**
     * Get investment holdings
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getInvestmentHoldingsTest() throws ApiException {
        GetInvestmentHoldingsRequest getInvestmentHoldingsRequest = null;
        GetInvestmentHoldingsResponse response = api.getInvestmentHoldings(getInvestmentHoldingsRequest);
        // TODO: test validations
    }

    /**
     * Get investment transactions
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getInvestmentTransactionsTest() throws ApiException {
        GetInvestmentTransactionsRequest getInvestmentTransactionsRequest = null;
        GetInvestmentTransactionsResponse response = api.getInvestmentTransactions(getInvestmentTransactionsRequest);
        // TODO: test validations
    }

    /**
     * Migrate financial connection
     *
     * This endpoint migrates financial connections from Plaid or MX into the unified Fuse API. It accepts a POST request with connection data, aggregator, entity, and Fuse products, and responds with a JSON payload containing the migrated connection&#39;s data, access token, ID, and request ID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void migrateFinancialConnectionTest() throws ApiException {
        MigrateFinancialConnectionsTokenRequest migrateFinancialConnectionsTokenRequest = null;
        MigrateFinancialConnectionsTokenResponse response = api.migrateFinancialConnection(migrateFinancialConnectionsTokenRequest);
        // TODO: test validations
    }

    /**
     * Refreshes the Asset Report in JSON format. For Plaid, you will need to have the assets product enabled on your plaid account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void refreshAssetReportTest() throws ApiException {
        RefreshAssetReportRequest refreshAssetReportRequest = null;
        AssetReportResponse response = api.refreshAssetReport(refreshAssetReportRequest);
        // TODO: test validations
    }

    /**
     * Sync financial connections data
     *
     * Call this endpoint upon receiving a financial_connection.sync_data webhook. This will keep the financial connections data up to date.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void syncFinancialConnectionsDataTest() throws ApiException {
        String fuseVerification = null;
        Object body = null;
        SyncFinancialConnectionsDataResponse response = api.syncFinancialConnectionsData(fuseVerification, body);
        // TODO: test validations
    }

    /**
     * Update consumer risk report customization
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateConsumerRiskReportCustomizationTest() throws ApiException {
        String consumerRiskReportCustomizationId = null;
        UpdateConsumerRiskReportCustomizationRequest updateConsumerRiskReportCustomizationRequest = null;
        UpdateConsumerRiskReportCustomizationResponse response = api.updateConsumerRiskReportCustomization(consumerRiskReportCustomizationId, updateConsumerRiskReportCustomizationRequest);
        // TODO: test validations
    }

    /**
     * Get liabilities
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void v1FinancialConnectionsLiabilitiesPostTest() throws ApiException {
        GetLiabilitiesRequest getLiabilitiesRequest = null;
        GetLiabilitiesResponse response = api.v1FinancialConnectionsLiabilitiesPost(getLiabilitiesRequest);
        // TODO: test validations
    }

}
