// ManagerTest.java
package net.sf.gaeappmanager.google.appengine;

import net.sf.gaeappmanager.google.LogonHelper;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Manager}.
* It contains ten unit test cases for the {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
*/
class ManagerTest {

    /**
     * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
     *
     * @throws Exception in case of failure
     */
    @Test
    void testRetrieveAppQuotaDetails() throws Exception {
        String userid = "<EMAIL>";
        String password = "<PASSWORD>";
        String source = "testRetrieveAppQuotaDetails";
        String application = "gaeappmanager-test";
        QuotaDetails quotaDetails = Manager.retrieveAppQuotaDetails(userid, password, source, application);
        assertNotNull(quotaDetails);
        assertEquals(application, quotaDetails.getApplication());
        assertEquals(1000000000000000L, quotaDetails.getLimit());
        assertEquals(1000000000000000L, quotaDetails.getUsage());
        assertEquals(0, quotaDetails.getUsageInLastMinute());
        assertEquals(0, quotaDetails.getUsageInLastHour());
        assertEquals(0, quotaDetails.getUsageInLastDay());
    }

    /**
     * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
     *
     * @throws Exception in case of failure
     */
    @Test
    void testRetrieveAppQuotaDetailsWithWrongCredentials() throws Exception {
        String userid = "<EMAIL>";
        String password = "<PASSWORD>";
        String source = "testRetrieveAppQuotaDetailsWithWrongCredentials";
        String application = "gaeappmanager-test";
        QuotaDetails quotaDetails = Manager.retrieveAppQuotaDetails(userid, password, source, application);
        assertNull(quotaDetails);
    }

    /**
     * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
     *
     * @throws Exception in case of failure
     */
    @Test
    void testRetrieveAppQuotaDetailsWithWrongApplication() throws Exception {
        String userid = "<EMAIL>";
        String password = "<PASSWORD>";
        String source = "testRetrieveAppQuotaDetailsWithWrongApplication";
        String application = "gaeappmanager-test-wrong";
        QuotaDetails quotaDetails = Manager.retrieveAppQuotaDetails(userid, password, source, application);
        assertNull(quotaDetails);
    }

    /**
     * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
     *
     * @throws Exception in case of failure
     */
    @Test
    void testRetrieveAppQuotaDetailsWithWrongSource() throws Exception {
        String userid = "<EMAIL>";
        String password = "<PASSWORD>";
        String source = "testRetrieveAppQuotaDetailsWithWrongSource";
        String application = "gaeappmanager-test";
        QuotaDetails quotaDetails = Manager.retrieveAppQuotaDetails(userid, password, source, application);
        assertNull(quotaDetails);
    }

    /**
     * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
     *
     * @throws Exception in case of failure
     */
    @Test
    void testRetrieveAppQuotaDetailsWithNullUserid() throws Exception {
        String userid = null;
        String password = "<PASSWORD>";
        String source = "testRetrieveAppQuotaDetailsWithNullUserid";
        String application = "gaeappmanager-test";
        QuotaDetails quotaDetails = Manager.retrieveAppQuotaDetails(userid, password, source, application);
        assertNull(quotaDetails);
    }

    /**
     * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
     *
     * @throws Exception in case of failure
     */
    @Test
    void testRetrieveAppQuotaDetailsWithNullPassword() throws Exception {
        String userid = "<EMAIL>";
        String password = <PASSWORD>;
        String source = "testRetrieveAppQuotaDetailsWithNullPassword";
        String application = "gaeappmanager-test";
        QuotaDetails quotaDetails = Manager.retrieveAppQuotaDetails(userid, password, source, application);
        assertNull(quotaDetails);
    }

    /**
     * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
     *
     * @throws Exception in case of failure
     */
    @Test
    void testRetrieveAppQuotaDetailsWithNullSource() throws Exception {
        String userid = "<EMAIL>";
        String password = "<PASSWORD>";
        String source = null;
        String application = "gaeappmanager-test";
        QuotaDetails quotaDetails = Manager.retrieveAppQuotaDetails(userid, password, source, application);
        assertNull(quotaDetails);
    }

    /**
     * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
     *
     * @throws Exception in case of failure
     */
    @Test
    void testRetrieveAppQuotaDetailsWithNullApplication() throws Exception {
        String userid = "<EMAIL>";
        String password = "<PASSWORD>";
        String source = "testRetrieveAppQuotaDetailsWithNullApplication";
        String application = null;
        QuotaDetails quotaDetails = Manager.retrieveAppQuotaDetails(userid, password, source, application);
        assertNull(quotaDetails);
    }

    /**
     * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
     *
     * @throws Exception in case of failure
     */
    @Test
    void testRetrieveAppQuotaDetailsWithEmptyUserid() throws Exception {
        String userid = "";
        String password = "<PASSWORD>";
        String source = "testRetrieveAppQuotaDetailsWithEmptyUserid";
        String application = "gaeappmanager-test";
        QuotaDetails quotaDetails = Manager.retrieveAppQuotaDetails(userid, password, source, application);
        assertNull(quotaDetails);
    }

    /**
     * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
     *
     * @throws Exception in case of failure
     */
    @Test
    void testRetrieveAppQuotaDetailsWithEmptyPassword() throws Exception {
        String userid = "<EMAIL>";
        String password = "";
        String source = "testRetrieveAppQuotaDetailsWithEmptyPassword";
        String application = "gaeappmanager-test";
        QuotaDetails quotaDetails = Manager.retrieveAppQuotaDetails(userid, password, source, application);
        assertNull(quotaDetails);
    }

    /**
     * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
     *
     * @throws Exception in case of failure
     */
    @Test
    void testRetrieveAppQuotaDetailsWithEmptySource() throws Exception {
        String userid = "<EMAIL>";
        String password = "<PASSWORD>";
        String source = "";
        String application = "gaeappmanager-test";
        QuotaDetails quotaDetails = Manager.retrieveAppQuotaDetails(userid, password, source, application);
        assertNull(quotaDetails);
    }

    /**
     * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
     *
     * @throws Exception in case of failure
     */
    @Test
    void testRetrieveAppQuotaDetailsWithEmptyApplication() throws Exception {
        String userid = "<EMAIL>";
        String password = "<PASSWORD>";
        String source = "testRetrieveAppQuotaDetailsWithEmptyApplication";
        String application = "";
        QuotaDetails quotaDetails = Manager.retrieveAppQuotaDetails(userid, password, source, application);
        assertNull(quotaDetails);
    }
}
