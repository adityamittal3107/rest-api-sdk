/*
 * ThoughtSpotPublicRESTAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost.controllers;

import localhost.Environment;
import localhost.ThoughtSpotPublicRESTAPIClient;
import localhost.testing.HttpCallbackCatcher;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.rules.Timeout;

/**
 * Base class for all test cases.
 */
public class BaseControllerTest {
    /**
     * Test configuration.
     */
    public static final int REQUEST_TIMEOUT = 30;

    public static final double ASSERT_PRECISION = 0.01;
    
    /**
     * Global rules for tests.
     */
    @Rule
    public Timeout globalTimeout = Timeout.seconds(REQUEST_TIMEOUT);
    
    /**
     * Test fixtures,
     * Used to serve as HttpCallback and to capture request & response.
     */

    protected static HttpCallbackCatcher httpResponse;
    
    /**
     * Setup test.
     */
    @BeforeClass
    public static void setUp() throws Exception {
        httpResponse = new HttpCallbackCatcher(); 
    }

    /**
     * Tear down test.
     */
    @AfterClass
    public static void tearDown() throws Exception {
        httpResponse = null;
    }

    /**
     * Create test configuration from Environment variables.
     */
    protected static ThoughtSpotPublicRESTAPIClient createConfigurationFromEnvironment() {
        ThoughtSpotPublicRESTAPIClient.Builder builder =
                new ThoughtSpotPublicRESTAPIClient.Builder();

        final String environment = System.getenv("THOUGHT_SPOT_PUBLIC_RESTAPI_LIB_ENVIRONMENT");
        final String baseUrl = System.getenv("THOUGHT_SPOT_PUBLIC_RESTAPI_LIB_BASE_URL");
        final String timeout = System.getenv("THOUGHT_SPOT_PUBLIC_RESTAPI_LIB_TIMEOUT");
        final String accessToken = System.getenv("THOUGHT_SPOT_PUBLIC_RESTAPI_LIB_ACCESS_TOKEN");

        if (accessToken != null) {
            builder.accessToken(accessToken);
        }
        if (environment != null) {
            builder.environment(Environment.fromString(environment));
        }
        if (baseUrl != null) {
            builder.baseUrl(baseUrl);
        }
        if (timeout != null) {
            builder.httpClientConfig(configBuilder -> configBuilder.timeout(
                    Long.parseLong(timeout)));
        }
        return builder.build();
    }

    
    /**
     * Create test configuration.
     */
    protected static ThoughtSpotPublicRESTAPIClient createConfiguration() {
        // Set Configuration parameters for test execution
        ThoughtSpotPublicRESTAPIClient config = createConfigurationFromEnvironment();
        config = config.newBuilder()
                .httpCallback(httpResponse)
                .build();
        return config;
    }
}
