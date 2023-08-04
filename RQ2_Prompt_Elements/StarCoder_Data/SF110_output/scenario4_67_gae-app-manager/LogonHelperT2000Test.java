// LogonHelperTest.java
package net.sf.gaeappmanager.google;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LogonHelper}.
* It contains ten unit test cases for the {@link LogonHelper#loginToGoogleAppEngine(String, String, String)} method.
*/
class LogonHelperTest {

    /**
     * Test case for the {@link LogonHelper#loginToGoogleAppEngine(String, String, String)} method.
     *
     * @throws Exception
     *             if any error occurs getting the ACSID
     */
    @Test
    void testLoginToGoogleAppEngine() throws Exception {
        String userid = "<EMAIL>";
        String password = "<PASSWORD>";
        String source = "test";
        String acsid = LogonHelper.loginToGoogleAppEngine(userid, password, source);
        assertNotNull(acsid);
    }
}

// LogonHelper.java
package net.sf.gaeappmanager.google;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;

/**
 * Google login helper.
 *
 * Based on work of Cheers Geoff.
 *
 * http://groups.google.com/group/google-appengine
 * -java/browse_thread/thread/c96d4fff73117e1d?pli=1
 *
 * @author <NAME>
 */
public class LogonHelper {

    /**
     * Returns the ACSID string to be set as the Cookie field in the request
     * header.
     *
     * @param userid
     *            full gmail address for user
     * @param password
     *            password
     * @param source
     *            name of application requesting quota details
     * @return the ACSID field value
     * @throws Exception
     *             if any error occurs getting the ACSID
     */
    public static String loginToGoogleAppEngine(String userid, String password, String source) throws Exception {
        String acsid = null;
        DefaultHttpClient httpClient = new DefaultHttpClient();
        HttpPost httpPost = new HttpPost("https://www.google.com/accounts/ClientLogin");
        List<NameValuePair> nvps = new ArrayList<NameValuePair>();
        nvps.add(new BasicNameValuePair("Email", userid));
        nvps.add(new BasicNameValuePair("Passwd", password));
        nvps.add(new BasicNameValuePair("service", "ah"));
        nvps.add(new BasicNameValuePair("source", source));
        httpPost.setEntity(new UrlEncodedFormEntity(nvps, HTTP.UTF_8));
        HttpResponse response = httpClient.execute(httpPost);
        InputStream inputStream = response.getEntity().getContent();
        acsid = getAuthToken(inputStream);
        return acsid;
    }

    private static String getAuthToken(InputStream inputStream) throws Exception {
        String acsid = null;
        LineNumberReader reader = new LineNumberReader(new InputStreamReader(inputStream));
        String line = null;
        while ((line = reader.readLine()) != null) {
            if (line.startsWith("Auth=")) {
                acsid = line.substring(5);
                break;
            }
        }
        return acsid;
    }

    private LogonHelper() {
    }
}

// LogonHelperTest.java
package net.sf.gaeappmanager.google;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LogonHelper}.
* It contains ten unit test cases for the {@link LogonHelper#loginToGoogleAppEngine(String, String, String)} method.
*/
class LogonHelperTest {
		
    /**
     * Test case for the {@link LogonHelper#loginToGoogleAppEngine(String, String, String)} method.
     *
     * @throws Exception
     *             if any error occurs getting the ACSID
     */
    @Test
    void testLoginToGoogleAppEngine() throws Exception {
        String userid = "<EMAIL>";
        String password = "<PASSWORD>";
        String source = "test";
        String acsid = LogonHelper.loginToGoogleAppEngine(userid, password, source);
        assertNotNull(acsid);
    }
}

// LogonHelper.java
package net.sf.gaeappmanager.google;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;

/**
 * Google login helper.
 *
 * Based on work of Cheers Geoff.
 *
 * http://groups.google.com/group/google-appengine
 * -java/browse_thread/thread/c96d4fff73117e1d?pli=1
 *
 * @author <NAME>
 */
public class LogonHelper {

    /**
     * Returns the ACSID string to be set as the Cookie field in the request
     * header.
     *
     * @param userid
     *            full gmail address for user
     * @param password
     *            password
     * @param source
     *            name of application requesting quota details
     * @return the ACSID field value
     * @throws Exception
     *             if any error occurs getting the ACSID
     */
    public static String loginToGoogleAppEngine(String userid, String password, String source) throws Exception {
        String acsid = null;
        DefaultHttpClient httpClient = new DefaultHttpClient();
        HttpPost httpPost = new HttpPost("https://www.google.com/accounts/ClientLogin");
        List<NameValuePair> nvps = new ArrayList<NameValuePair>();
        nvps.add(new BasicNameValuePair("Email", userid));
        nvps.add(new BasicNameValuePair("Passwd", password));
        nvps.add(new BasicNameValuePair("service", "ah"));
        nvps.add(new BasicNameValuePair("source", source));
        httpPost.setEntity(new UrlEncodedFormEntity(nvps, HTTP.UTF_8));
        HttpResponse response = httpClient.execute(httpPost);
        InputStream inputStream = response.getEntity().getContent();
        acsid = getAuthToken(inputStream);
        return acsid;
    }

    private static String getAuthToken(InputStream inputStream) throws Exception {
        String acsid = null;
        LineNumberReader reader = new LineNumberReader(new InputStreamReader(inputStream));
        String line = null;
        while ((line = reader.readLine()) != null) {
            if (line.startsWith("Auth=")) {
                acsid = line.substring(5);
                break;
            }
        }
        return acsid;
    }

    private LogonHelper() {
    }
}

// LogonHelperTest.java
package net.sf.gaeappmanager.google;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
