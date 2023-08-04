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

    @Test
    void testRetrieveAppQuotaDetails() throws Exception {
        String userid = "your_userid";
        String password = "<PASSWORD>";
        String source = "your_source";
        String application = "your_application";
        QuotaDetails quotaDetails = Manager.retrieveAppQuotaDetails(userid, password, source, application);
        assertNotNull(quotaDetails);
        assertEquals(application, quotaDetails.getApplication());
        assertEquals(1000000000000000000L, quotaDetails.getLimit());
        assertEquals(1000000000000000000L, quotaDetails.getUsage());
        assertEquals(1000000000000000000L, quotaDetails.getUsageInLast7Days());
        assertEquals(1000000000000000000L, quotaDetails.getUsageInLast30Days());
        assertEquals(1000000000000000000L, quotaDetails.getUsageInLast90Days());
        assertEquals(1000000000000000000L, quotaDetails.getUsageInLast365Days());
    }
}
