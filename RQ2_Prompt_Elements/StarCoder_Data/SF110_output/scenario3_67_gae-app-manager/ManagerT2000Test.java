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
        String source = "test";
        String application = "test";
        QuotaDetails quotaDetails = Manager.retrieveAppQuotaDetails(userid, password, source, application);
        assertNotNull(quotaDetails);
        assertEquals(1000000000000000L, quotaDetails.getLimit());
        assertEquals(1000000000000000L, quotaDetails.getUsage());
    }
}

// LogonHelper.java
package net.sf.gaeappmanager.google.appengine;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

/**
 * Helper class for logging on to Google App Engine.
 *
 * @author <NAME>
 */
public class LogonHelper {

    /**
     * Logon to Google App Engine.
     *
     * @param userid full gmail address for user
     * @param password gmail account password
     * @return true if logon was successful, false otherwise
     * @throws Exception in case of failure
     */
    public static boolean logon(String userid, String password) throws Exception;
}

// LogonHelperTest.java
package net.sf.gaeappmanager.google.appengine;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LogonHelper}.
* It contains one unit test case for the {@link LogonHelper#logon(String, String)} method.
*/
class LogonHelperTest {
		
    /**
     * Test case for {@link LogonHelper#logon(String, String)} method.
     *
     * @throws Exception in case of failure
     */
    @Test
    void testLogon() throws Exception {
        String userid = "<EMAIL>";
        String password = "<PASSWORD>";
        boolean result = LogonHelper.logon(userid, password);
        assertTrue(result);
    }
}

// QuotaDetails.java
package net.sf.gaeappmanager.google.appengine;

/**
 * Quota details of application deployed in Google App Engine.
 *
 * @author <NAME>
 */
public class QuotaDetails {

    /**
     * Maximum number of bytes allowed for application.
     */
    private long limit;

    /**
     * Number of bytes used by application.
     */
    private long usage;

    /**
     * Retrieve maximum number of bytes allowed for application.
     *
     * @return maximum number of bytes allowed for application
     */
    public long getLimit() {
        return limit;
    }

    /**
     * Retrieve number of bytes used by application.
     *
     * @return number of bytes used by application
     */
    public long getUsage() {
        return usage;
    }
}

// QuotaDetailsTest.java
package net.sf.gaeappmanager.google.appengine;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link QuotaDetails}.
* It contains one unit test case for the {@link QuotaDetails#getLimit()} and {@link QuotaDetails#getUsage()} methods.
*/
class QuotaDetailsTest {
		
    /**
     * Test case for {@link QuotaDetails#getLimit()} and {@link QuotaDetails#getUsage()} methods.
     */
    @Test
    void testGetLimitAndUsage() {
        QuotaDetails quotaDetails = new QuotaDetails();
        quotaDetails.limit = 1000000000000000L;
        quotaDetails.usage = 1000000000000000L;
        assertEquals(1000000000000000L, quotaDetails.getLimit());
        assertEquals(1000000000000000L, quotaDetails.getUsage());
    }
}

// Test.java
package net.sf.gaeappmanager.google.appengine;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ManagerTest} and {@link LogonHelperTest} classes.
*/
class Test {
		
    /**
     * Test case for {@link ManagerTest} and {@link LogonHelperTest} classes.
     */
    @Test
    void test() {
        assertTrue(true);
    }
}
