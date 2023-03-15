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
	 * It tests the method with valid userid, password, source and application.
	 * It expects the method to return a non-null {@link QuotaDetails} object.
	 * @throws Exception in case of failure
	 */
	@Test
	void testRetrieveAppQuotaDetails() throws Exception {
		String userid = "userid";
		String password = "password";
		String source = "source";
		String application = "application";
		QuotaDetails quotaDetails = Manager.retrieveAppQuotaDetails(userid, password, source, application);
		assertNotNull(quotaDetails);
	}
	
	/**
	 * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the method with valid userid, password, source and application.
	 * It expects the method to return a non-null {@link QuotaDetails} object.
	 * @throws Exception in case of failure
	 */
	@Test
	void testRetrieveAppQuotaDetails1() throws Exception {
		String userid = "userid";
		String password = "password";
		String source = "source";
		String application = "application";
		QuotaDetails quotaDetails = Manager.retrieveAppQuotaDetails(userid, password, source, application);
		assertNotNull(quotaDetails);
	}
	
	/**
	 * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the method with valid userid, password, source and application.
	 * It expects the method to return a non-null {@link QuotaDetails} object.
	 * @throws Exception in case of failure
	 */
	@Test
	void testRetrieveAppQuotaDetails2() throws Exception {
		String userid = "userid";
		String password = "password";
		String source = "source";
		String application = "application";
		QuotaDetails quotaDetails = Manager.retrieveAppQuotaDetails(userid, password, source, application);
		assertNotNull(quotaDetails);
	}
	
	/**
	 * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the method with valid userid, password, source and application.
	 * It expects the method to return a non-null {@link QuotaDetails} object.
	 * @throws Exception in case of failure
	 */
	@Test
	void testRetrieveAppQuotaDetails3() throws Exception {
		String userid = "userid";
		String password = "password";
		String source = "source";
		String application = "application";
		QuotaDetails quotaDetails = Manager.retrieveAppQuotaDetails(userid, password, source, application);
		assertNotNull(quotaDetails);
	}
	
	/**
	 * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the method with valid userid, password, source and application.
	 * It expects the method to return a non-null {@link QuotaDetails} object.
	 * @throws Exception in case of failure
	 */
	@Test
	void testRetrieveAppQuotaDetails4() throws Exception {
		String userid = "userid";
		String password = "password";
		String source = "source";
		String application = "application";
		QuotaDetails quotaDetails = Manager.retrieveAppQuotaDetails(userid, password, source, application);
		assertNotNull(quotaDetails);
	}
	
	/**
	 * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the method with valid userid, password, source and application.
	 * It expects the method to return a non-null {@link QuotaDetails} object.
	 * @throws Exception in case of failure
	 */
	@Test
	void testRetrieveAppQuotaDetails5() throws Exception {
		String userid = "userid";
		String password = "password";
		String source = "source";
		String application = "application";
		QuotaDetails quotaDetails = Manager.retrieveAppQuotaDetails(userid, password, source, application);
		assertNotNull(quotaDetails);
	}
	
	/**
	 * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the method with valid userid, password, source and application.
	 * It expects the method to return a non-null {@link QuotaDetails} object.
	 * @throws Exception in case of failure
	 */
	@Test
	void testRetrieveAppQuotaDetails6() throws Exception {
		String userid = "userid";
		String password = "password";
		String source = "source";
		String application = "application";
		QuotaDetails quotaDetails = Manager.retrieveAppQuotaDetails(userid, password, source, application);
		assertNotNull(quotaDetails);
	}
	
	/**
	 * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the method with valid userid, password, source and application.
	 * It expects the method to return a non-null {@link QuotaDetails} object.
	 * @throws Exception in case of failure
	 */
	@Test
	void testRetrieveAppQuotaDetails7() throws Exception {
		String userid = "userid";
		String password = "password";
		String source = "source";
		String application = "application";
		QuotaDetails quotaDetails = Manager.retrieveAppQuotaDetails(userid, password, source, application);
		assertNotNull(quotaDetails);
	}
	
	/**
	 * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the method with valid userid, password, source and application.
	 * It expects the method to return a non-null {@link QuotaDetails} object.
	 * @throws Exception in case of failure
	 */
	@Test
	void testRetrieveAppQuotaDetails8() throws Exception {
		String userid = "userid";
		String password = "password";
		String source = "source";
		String application = "application";
		QuotaDetails quotaDetails = Manager.retrieveAppQuotaDetails(userid, password, source, application);
		assertNotNull(quotaDetails);
	}
	
	/**
	 * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the method with valid userid, password, source and application.
	 * It expects the method to return a non-null {@link QuotaDetails} object.
	 * @throws Exception in case of failure
	 */
	@Test
	void testRetrieveAppQuotaDetails9() throws Exception {
		String userid = "userid";
		String password = "password";
		String source = "source";
		String application = "application";
		QuotaDetails quotaDetails = Manager.retrieveAppQuotaDetails(userid, password, source, application);
		assertNotNull(quotaDetails);
	}
	
	/**
	 * Test case for {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
	 * It tests the method with valid userid, password, source and application.
	 * It expects the method to return a non-null {@link QuotaDetails} object.
	 * @throws Exception in case of failure
	 */
	@Test
	void testRetrieveAppQuotaDetails10() throws Exception {
		String userid = "userid";
		String password = "password";
		String source = "source";
		String application = "application";
		QuotaDetails quotaDetails = Manager.retrieveAppQuotaDetails(userid, password, source, application);
		assertNotNull(quotaDetails);
	}
}

// QuotaDetails.java
package net.sf.gaeappmanager.google.appengine;

import java.util.ArrayList;
import java.util.List;

/**
 * Quota details of application deployed in Google App Engine.
 *
 * @author Alois Belaska
 */
public class QuotaDetails {

    private List<Quota> quotas = new ArrayList<Quota>();

    /**
     * @return the quotas
     */
    public List<Quota> getQuotas() {
        return quotas;
    }

    /**
     * @param quotas
     *            the quotas to set
     */
    public void setQuotas(List<Quota> quotas) {
        this.quotas = quotas;
    }
}

// QuotaDetailsParser.java
package net.sf.gaeappmanager.google.appengine;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * Parser for quota details of application deployed in Google App Engine.
 *
 * @author Alois Belaska
 */
public class QuotaDetailsParser {

    /**
     * Parse quota details of application deployed in Google App Engine.
     *
     * @param inputStream
     *            input stream with quota details
     * @return quota details of application
     * @throws ParserConfigurationException
     *             in case of failure
     * @throws SAXException
     *             in case of failure
     * @throws IOException
     *             in case of failure
     */
    public QuotaDetails parse(InputStream inputStream) throws ParserConfigurationException, SAXException, IOException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(inputStream);
        Element root = document.getDocumentElement();
        QuotaDetails quotaDetails = new QuotaDetails();
        NodeList quotas = root.getElementsByTagName("quota");
        for (int i = 0; i < quotas.getLength(); i++) {
            Node quota = quotas.item(i);
            if (quota instanceof Element) {
                Element quotaElement = (Element) quota;
                Quota q = new Quota();
                q.setName(quotaElement.getAttribute("name"));
                q.setLimit(quotaElement.getAttribute("limit"));
                q.setUsage(quotaElement.getAttribute("usage"));
                q.setUnit(quotaElement.getAttribute("unit"));
                quotaDetails.getQuotas().add(q);
            }
        }
        return quotaDetails;
    }
}

// Quota.java
package net.sf.gaeappmanager.google.appengine;

/**
 * Quota of application deployed in Google App Engine.
 *
 * @author Alois Belaska
 */
public class Quota {

    private String name;

    private String limit;

    private String usage;

    private String unit;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     *            the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the limit
     */
    public String getLimit() {
        return limit;
    }

    /**
     * @param limit
     *            the limit to set
     */
    public void setLimit(String limit) {
        this.limit = limit;
    }

    /**
     * @return the usage
     */
    public String getUsage() {
        return usage;
    }

    /**
     * @param usage
     *            the usage to set
     */
    public void setUsage(String usage) {
        this.usage = usage;
    }

    /**
     * @return the unit
     */
    public String getUnit() {
        return unit;
    }

    /**
     * @param unit
     *            the unit to set
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }
}

// LogonHelper.java
package net.sf.gaeappmanager.google.appengine;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * Helper class for logging on to Google App Engine.
 *
 * @author Alois Belaska
 */
public class LogonHelper {

    /**
     * Log on to Google App Engine.
     *
     * @param userid
     *            full gmail address for user
     * @param password
     *            gmail account password
     * @param source
     *            name of application requesting quota details
     * @return authentication cookie
     * @throws ParserConfigurationException
     *             in case of failure
     * @throws SAXException
     *             in case of failure
     * @throws IOException
     *             in case of failure
     */
    public static String loginToGoogleAppEngine(String userid, String password, String source) throws ParserConfigurationException, SAXException, IOException {
        DefaultHttpClient client = new DefaultHttpClient();
        try {
            HttpPost post = new HttpPost("https://www.google.com/accounts/ClientLogin");
            List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();
            nameValuePairs.add(new BasicNameValuePair("Email", userid));
            nameValuePairs.add(new BasicNameValuePair("Passwd", password));
            nameValuePairs.add(new BasicNameValuePair("service", "ah"));
            nameValuePairs.add(new BasicNameValuePair("source", source));
            nameValuePairs.add(new BasicNameValuePair("accountType", "HOSTED_OR_GOOGLE"));
            post.setEntity(new UrlEncodedFormEntity(nameValuePairs));
            HttpResponse response = client.execute(post);
            return parseAuthCookie(response.getEntity().getContent());
        } finally {
            client.getConnectionManager().shutdown();
        }
    }

    private static String parseAuthCookie(InputStream inputStream) throws ParserConfigurationException, SAXException, IOException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(inputStream);
        Element root = document.getDocumentElement();
        NodeList authCookie = root.getElementsByTagName("Auth");
        if (authCookie.getLength() == 1) {
            Node authCookieNode = authCookie.item(0);
            if (authCookieNode instanceof Element) {
               