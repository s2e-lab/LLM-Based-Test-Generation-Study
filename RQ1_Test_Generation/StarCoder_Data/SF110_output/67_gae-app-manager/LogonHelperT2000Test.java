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
    * It tests the login to Google App Engine with a valid user id and password.
    */
    @Test
    void testLoginToGoogleAppEngine() throws Exception {
        String userid = "<EMAIL>";
        String password = "<PASSWORD>";
        String source = "test";
        String acsid = LogonHelper.loginToGoogleAppEngine(userid, password, source);
        assertNotNull(acsid);
    }

    /**
    * Test case for the {@link LogonHelper#loginToGoogleAppEngine(String, String, String)} method.
    * It tests the login to Google App Engine with an invalid user id.
    */
    @Test
    void testLoginToGoogleAppEngineWithInvalidUserId() throws Exception {
        String userid = "<EMAIL>";
        String password = "<PASSWORD>";
        String source = "test";
        String acsid = LogonHelper.loginToGoogleAppEngine(userid, password, source);
        assertNull(acsid);
    }

    /**
    * Test case for the {@link LogonHelper#loginToGoogleAppEngine(String, String, String)} method.
    * It tests the login to Google App Engine with an invalid password.
    */
    @Test
    void testLoginToGoogleAppEngineWithInvalidPassword() throws Exception {
        String userid = "<EMAIL>";
        String password = "<PASSWORD>";
        String source = "test";
        String acsid = LogonHelper.loginToGoogleAppEngine(userid, password, source);
        assertNull(acsid);
    }

    /**
    * Test case for the {@link LogonHelper#loginToGoogleAppEngine(String, String, String)} method.
    * It tests the login to Google App Engine with an invalid source.
    */
    @Test
    void testLoginToGoogleAppEngineWithInvalidSource() throws Exception {
        String userid = "<EMAIL>";
        String password = "<PASSWORD>";
        String source = "test";
        String acsid = LogonHelper.loginToGoogleAppEngine(userid, password, source);
        assertNull(acsid);
    }

    /**
    * Test case for the {@link LogonHelper#loginToGoogleAppEngine(String, String, String)} method.
    * It tests the login to Google App Engine with an invalid user id and password.
    */
    @Test
    void testLoginToGoogleAppEngineWithInvalidUserIdAndPassword() throws Exception {
        String userid = "<EMAIL>";
        String password = "<PASSWORD>";
        String source = "test";
        String acsid = LogonHelper.loginToGoogleAppEngine(userid, password, source);
        assertNull(acsid);
    }

    /**
    * Test case for the {@link LogonHelper#loginToGoogleAppEngine(String, String, String)} method.
    * It tests the login to Google App Engine with an invalid user id and valid password.
    */
    @Test
    void testLoginToGoogleAppEngineWithInvalidUserIdAndValidPassword() throws Exception {
        String userid = "<EMAIL>";
        String password = "<PASSWORD>";
        String source = "test";
        String acsid = LogonHelper.loginToGoogleAppEngine(userid, password, source);
        assertNull(acsid);
    }

    /**
    * Test case for the {@link LogonHelper#loginToGoogleAppEngine(String, String, String)} method.
    * It tests the login to Google App Engine with a valid user id and invalid password.
    */
    @Test
    void testLoginToGoogleAppEngineWithValidUserIdAndInvalidPassword() throws Exception {
        String userid = "<EMAIL>";
        String password = "<PASSWORD>";
        String source = "test";
        String acsid = LogonHelper.loginToGoogleAppEngine(userid, password, source);
        assertNull(acsid);
    }

    /**
    * Test case for the {@link LogonHelper#loginToGoogleAppEngine(String, String, String)} method.
    * It tests the login to Google App Engine with an invalid user id and invalid password.
    */
    @Test
    void testLoginToGoogleAppEngineWithInvalidUserIdAndInvalidPassword() throws Exception {
        String userid = "<EMAIL>";
        String password = "<PASSWORD>";
        String source = "test";
        String acsid = LogonHelper.loginToGoogleAppEngine(userid, password, source);
        assertNull(acsid);
    }

    /**
    * Test case for the {@link LogonHelper#loginToGoogleAppEngine(String, String, String)} method.
    * It tests the login to Google App Engine with an invalid user id, invalid password and invalid source.
    */
    @Test
    void testLoginToGoogleAppEngineWithInvalidUserIdInvalidPasswordAndInvalidSource() throws Exception {
        String userid = "<EMAIL>";
        String password = "<PASSWORD>";
        String source = "test";
        String acsid = LogonHelper.loginToGoogleAppEngine(userid, password, source);
        assertNull(acsid);
    }

    /**
    * Test case for the {@link LogonHelper#loginToGoogleAppEngine(String, String, String)} method.
    * It tests the login to Google App Engine with an invalid user id, invalid password and valid source.
    */
    @Test
    void testLoginToGoogleAppEngineWithInvalidUserIdInvalidPasswordAndValidSource() throws Exception {
        String userid = "<EMAIL>";
        String password = "<PASSWORD>";
        String source = "test";
        String acsid = LogonHelper.loginToGoogleAppEngine(userid, password, source);
        assertNull(acsid);
    }

    /**
    * Test case for the {@link LogonHelper#loginToGoogleAppEngine(String, String, String)} method.
    * It tests the login to Google App Engine with an invalid user id, valid password and invalid source.
    */
    @Test
    void testLoginToGoogleAppEngineWithInvalidUserIdValidPasswordAndInvalidSource() throws Exception {
        String userid = "<EMAIL>";
        String password = "<PASSWORD>";
        String source = "test";
        String acsid = LogonHelper.loginToGoogleAppEngine(userid, password, source);
        assertNull(acsid);
    }

    /**
    * Test case for the {@link LogonHelper#loginToGoogleAppEngine(String, String, String)} method.
    * It tests the login to Google App Engine with an invalid user id, valid password and valid source.
    */
    @Test
    void testLoginToGoogleAppEngineWithInvalidUserIdValidPasswordAndValidSource() throws Exception {
        String userid = "<EMAIL>";
        String password = "<PASSWORD>";
        String source = "test";
        String acsid = LogonHelper.loginToGoogleAppEngine(userid, password, source);
        assertNull(acsid);
    }

    /**
    * Test case for the {@link LogonHelper#loginToGoogleAppEngine(String, String, String)} method.
    * It tests the login to Google App Engine with a valid user id, invalid password and invalid source.
    */
    @Test
    void testLoginToGoogleAppEngineWithValidUserIdInvalidPasswordAndInvalidSource() throws Exception {
        String userid = "<EMAIL>";
        String password = "<PASSWORD>";
        String source = "test";
        String acsid = LogonHelper.loginToGoogleAppEngine(userid, password, source);
        assertNull(acsid);
    }

    /**
    * Test case for the {@link LogonHelper#loginToGoogleAppEngine(String, String, String)} method.
    * It tests the login to Google App Engine with a valid user id, invalid password and valid source.
    */
    @Test
    void testLoginToGoogleAppEngineWithValidUserIdInvalidPasswordAndValidSource() throws Exception {
        String userid = "<EMAIL>";
        String password = "<PASSWORD>";
        String source = "test";
        String acsid = LogonHelper.loginToGoogleAppEngine(userid, password, source);
        assertNull(acsid);
    }

    /**
    * Test case for the {@link LogonHelper#loginToGoogleAppEngine(String, String, String)} method.
    * It tests the login to Google App Engine with a valid user id, valid password and invalid source.
    */
    @Test
    void testLoginToGoogleAppEngineWithValidUserIdValidPasswordAndInvalidSource() throws Exception {
        String userid = "<EMAIL>";
        String password = "<PASSWORD>";
        String source = "test";
        String acsid = LogonHelper.loginToGoogleAppEngine(userid, password, source);
        assertNull(acsid);
    }

    /**
    * Test case for the {@link LogonHelper#loginToGoogleAppEngine(String, String, String)} method.
    * It tests the login to Google App Engine with a valid user id, valid password and valid source.
    */
    @Test
    void testLoginToGoogleAppEngineWithValidUserIdValidPasswordAndValidSource() throws Exception {
        String userid = "<EMAIL>";
        String password = "<PASSWORD>";
        String source = "test";
        String acsid = LogonHelper.loginToGoogleAppEngine(userid, password, source);
        assertNotNull(acsid);
    }
}
