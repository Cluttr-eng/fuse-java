# fuse-java


## Quick start
Documentation for each method, request param, and response field are available in docstrings and will appear on hover in most modern editors.

```
package mypackage;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.fuse.client.ApiClient;
import org.fuse.client.ApiException;
import org.fuse.client.Configuration;
import org.fuse.client.auth.*;
import org.fuse.client.model.*;
import org.fuse.client.api.FuseApi;

class SdkTest {

    private final FuseApi apiInstance;
    public SdkTest() {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath(System.getenv("BASE_URL"));
        ApiKeyAuth fuseClientId = (ApiKeyAuth) defaultClient.getAuthentication("fuseClientId");
        fuseClientId.setApiKey("my-fuse-client-id");
        ApiKeyAuth fuseApiKey = (ApiKeyAuth) defaultClient.getAuthentication("fuseApiKey");
        fuseApiKey.setApiKey("my-fuse-api-key");

        defaultClient.addDefaultHeader("Plaid-Client-Id", "my-plaid-client-id");
        defaultClient.addDefaultHeader("Plaid-Secret", "my-plaid-secret");

        apiInstance = new FuseApi(defaultClient);
    }

    void run() throws ApiException {
        CreateSessionRequest createSessionRequest = new CreateSessionRequest();

        List<Aggregator> aggregatorList = new ArrayList<>();
        aggregatorList.add(Aggregator.PLAID);
        createSessionRequest.setSupportedFinancialInstitutionAggregators(aggregatorList);

        Entity entity = new Entity();
        entity.setId("entity-id");
        createSessionRequest.setEntity(entity);

        List<CountryCode> countryCodeList = new ArrayList<>();
        countryCodeList.add(CountryCode.US);
        createSessionRequest.setCountryCodes(countryCodeList);

        List<Product> productList = new ArrayList<>();
        productList.add(Product.ACCOUNT_DETAILS);
        productList.add(Product.BALANCE);
        createSessionRequest.setProducts(productList);

        CreateSessionResponse createSessionResponse = apiInstance.createSession(createSessionRequest);


        CreateLinkTokenRequest createLinkTokenRequest = new CreateLinkTokenRequest();

        createLinkTokenRequest.setInstitutionId("an-institution-id");
        createLinkTokenRequest.setSessionClientSecret(createSessionResponse.getClientSecret()); 
        createLinkTokenRequest.setEntity(entity);
        createLinkTokenRequest.setClientName("Fuse");

        CreateLinkTokenResponse createLinkTokenResponse = apiInstance.createLinkToken(createLinkTokenRequest);
    }
}
```
