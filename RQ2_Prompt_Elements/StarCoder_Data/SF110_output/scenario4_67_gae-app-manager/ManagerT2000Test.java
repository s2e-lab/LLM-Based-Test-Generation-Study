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
     * @throws Exception
     *             in case of failure
     */
    @Test
    void testRetrieveAppQuotaDetails() throws Exception {
        String userid = "<EMAIL>";
        String password = "<PASSWORD>";
        String source = "test";
        String application = "test";
        QuotaDetails quotaDetails = Manager.retrieveAppQuotaDetails(userid, password, source, application);
        assertNotNull(quotaDetails);
        assertEquals(1000000000000000L, quotaDetails.getLimit());
        assertEquals(1000000000000000L, quotaDetails.getUsage());
    }

    /**
     * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
     *
     * @throws Exception
     *             in case of failure
     */
    @Test
    void testRetrieveAppQuotaDetailsWithWrongCredentials() throws Exception {
        String userid = "<EMAIL>";
        String password = "<PASSWORD>";
        String source = "test";
        String application = "test";
        QuotaDetails quotaDetails = Manager.retrieveAppQuotaDetails(userid, password, source, application);
        assertNull(quotaDetails);
    }

    /**
     * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
     *
     * @throws Exception
     *             in case of failure
     */
    @Test
    void testRetrieveAppQuotaDetailsWithWrongSource() throws Exception {
        String userid = "<EMAIL>";
        String password = "<PASSWORD>";
        String source = "wrong";
        String application = "test";
        QuotaDetails quotaDetails = Manager.retrieveAppQuotaDetails(userid, password, source, application);
        assertNull(quotaDetails);
    }

    /**
     * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
     *
     * @throws Exception
     *             in case of failure
     */
    @Test
    void testRetrieveAppQuotaDetailsWithWrongApplication() throws Exception {
        String userid = "<EMAIL>";
        String password = "<PASSWORD>";
        String source = "test";
        String application = "wrong";
        QuotaDetails quotaDetails = Manager.retrieveAppQuotaDetails(userid, password, source, application);
        assertNull(quotaDetails);
    }

    /**
     * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
     *
     * @throws Exception
     *             in case of failure
     */
    @Test
    void testRetrieveAppQuotaDetailsWithWrongCredentialsAndSource() throws Exception {
        String userid = "<EMAIL>";
        String password = "<PASSWORD>";
        String source = "wrong";
        String application = "test";
        QuotaDetails quotaDetails = Manager.retrieveAppQuotaDetails(userid, password, source, application);
        assertNull(quotaDetails);
    }

    /**
     * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
     *
     * @throws Exception
     *             in case of failure
     */
    @Test
    void testRetrieveAppQuotaDetailsWithWrongCredentialsAndApplication() throws Exception {
        String userid = "<EMAIL>";
        String password = "<PASSWORD>";
        String source = "test";
        String application = "wrong";
        QuotaDetails quotaDetails = Manager.retrieveAppQuotaDetails(userid, password, source, application);
        assertNull(quotaDetails);
    }

    /**
     * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
     *
     * @throws Exception
     *             in case of failure
     */
    @Test
    void testRetrieveAppQuotaDetailsWithWrongCredentialsAndSourceAndApplication() throws Exception {
        String userid = "<EMAIL>";
        String password = "<PASSWORD>";
        String source = "wrong";
        String application = "wrong";
        QuotaDetails quotaDetails = Manager.retrieveAppQuotaDetails(userid, password, source, application);
        assertNull(quotaDetails);
    }

    /**
     * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
     *
     * @throws Exception
     *             in case of failure
     */
    @Test
    void testRetrieveAppQuotaDetailsWithNullCredentials() throws Exception {
        String userid = "<EMAIL>";
        String password = null;
        String source = "test";
        String application = "test";
        QuotaDetails quotaDetails = Manager.retrieveAppQuotaDetails(userid, password, source, application);
        assertNull(quotaDetails);
    }

    /**
     * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
     *
     * @throws Exception
     *             in case of failure
     */
    @Test
    void testRetrieveAppQuotaDetailsWithNullSource() throws Exception {
        String userid = "<EMAIL>";
        String password = "<PASSWORD>";
        String source = null;
        String application = "test";
        QuotaDetails quotaDetails = Manager.retrieveAppQuotaDetails(userid, password, source, application);
        assertNull(quotaDetails);
    }

    /**
     * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
     *
     * @throws Exception
     *             in case of failure
     */
    @Test
    void testRetrieveAppQuotaDetailsWithNullApplication() throws Exception {
        String userid = "<EMAIL>";
        String password = "<PASSWORD>";
        String source = "test";
        String application = null;
        QuotaDetails quotaDetails = Manager.retrieveAppQuotaDetails(userid, password, source, application);
        assertNull(quotaDetails);
    }

    /**
     * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
     *
     * @throws Exception
     *             in case of failure
     */
    @Test
    void testRetrieveAppQuotaDetailsWithNullCredentialsAndSource() throws Exception {
        String userid = "<EMAIL>";
        String password = null;
        String source = null;
        String application = "test";
        QuotaDetails quotaDetails = Manager.retrieveAppQuotaDetails(userid, password, source, application);
        assertNull(quotaDetails);
    }

    /**
     * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
     *
     * @throws Exception
     *             in case of failure
     */
    @Test
    void testRetrieveAppQuotaDetailsWithNullCredentialsAndApplication() throws Exception {
        String userid = "<EMAIL>";
        String password = null;
        String source = "test";
        String application = null;
        QuotaDetails quotaDetails = Manager.retrieveAppQuotaDetails(userid, password, source, application);
        assertNull(quotaDetails);
    }

    /**
     * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
     *
     * @throws Exception
     *             in case of failure
     */
    @Test
    void testRetrieveAppQuotaDetailsWithNullCredentialsAndSourceAndApplication() throws Exception {
        String userid = "<EMAIL>";
        String password = null;
        String source = null;
        String application = null;
        QuotaDetails quotaDetails = Manager.retrieveAppQuotaDetails(userid, password, source, application);
        assertNull(quotaDetails);
    }

    /**
     * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
     *
     * @throws Exception
     *             in case of failure
     */
    @Test
    void testRetrieveAppQuotaDetailsWithEmptyCredentials() throws Exception {
        String userid = "<EMAIL>";
        String password = "";
        String source = "test";
        String application = "test";
        QuotaDetails quotaDetails = Manager.retrieveAppQuotaDetails(userid, password, source, application);
        assertNull(quotaDetails);
    }

    /**
     * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
     *
     * @throws Exception
     *             in case of failure
     */
    @Test
    void testRetrieveAppQuotaDetailsWithEmptySource() throws Exception {
        String userid = "<EMAIL>";
        String password = "<PASSWORD>";
        String source = "";
        String application = "test";
        QuotaDetails quotaDetails = Manager.retrieveAppQuotaDetails(userid, password, source, application);
        assertNull(quotaDetails);
    }

    /**
     * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
     *
     * @throws Exception
     *             in case of failure
     */
    @Test
    void testRetrieveAppQuotaDetailsWithEmptyApplication() throws Exception {
        String userid = "<EMAIL>";
        String password = "<PASSWORD>";
        String source = "test";
        String application = "";
        QuotaDetails quotaDetails = Manager.retrieveAppQuotaDetails(userid, password, source, application);
        assertNull(quotaDetails);
    }

    /**
     * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
     *
     * @throws Exception
     *             in case of failure
     */
    @Test
    void testRetrieveAppQuotaDetailsWithEmptyCredentialsAndSource() throws Exception {
        String userid = "<EMAIL>";
        String password = "";
        String source =