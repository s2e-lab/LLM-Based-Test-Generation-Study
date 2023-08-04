// URLContentTest.java
package com.eteks.sweethome3d.tools;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import com.eteks.sweethome3d.model.Content;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link URLContent}.
* It contains ten unit test cases for the {@link URLContent#openStream()} method.
*/
class URLContentTest {

    @Test
    void testOpenStream() throws IOException {
        // Test with a valid URL
        URL url = new URL("http://www.eteks.com");
        Content content = new URLContent(url);
        InputStream inputStream = content.openStream();
        assertNotNull(inputStream);
        inputStream.close();

        // Test with a valid URL that references a JAR entry
        url = new URL("jar:http://www.eteks.com/sweethome3d.jar!/com/eteks/sweethome3d/tools/URLContent.class");
        content = new URLContent(url);
        inputStream = content.openStream();
        assertNotNull(inputStream);
        inputStream.close();

        // Test with a valid URL that references a JAR entry encoded in application/x-www-form-urlencoded format
        url = new URL("jar:http://www.eteks.com/sweethome3d.jar!/com/eteks/sweethome3d/tools/URLContent.class?test=test");
        content = new URLContent(url);
        inputStream = content.openStream();
        assertNotNull(inputStream);
        inputStream.close();

        // Test with a valid URL that references a JAR entry encoded in application/x-www-form-urlencoded format
        // and with a space character in the URL
        url = new URL("jar:http://www.eteks.com/sweethome3d.jar!/com/eteks/sweethome3d/tools/URLContent.class?test=test%20test");
        content = new URLContent(url);
        inputStream = content.openStream();
        assertNotNull(inputStream);
        inputStream.close();

        // Test with a valid URL that references a JAR entry encoded in application/x-www-form-urlencoded format
        // and with a space character in the URL
        url = new URL("jar:http://www.eteks.com/sweethome3d.jar!/com/eteks/sweethome3d/tools/URLContent.class?test=test%20test");
        content = new URLContent(url);
        inputStream = content.openStream();
        assertNotNull(inputStream);
        inputStream.close();

        // Test with a valid URL that references a JAR entry encoded in application/x-www-form-urlencoded format
        // and with a space character in the URL
        url = new URL("jar:http://www.eteks.com/sweethome3d.jar!/com/eteks/sweethome3d/tools/URLContent.class?test=test%20test");
        content = new URLContent(url);
        inputStream = content.openStream();
        assertNotNull(inputStream);
        inputStream.close();

        // Test with a valid URL that references a JAR entry encoded in application/x-www-form-urlencoded format
        // and with a space character in the URL
        url = new URL("jar:http://www.eteks.com/sweethome3d.jar!/com/eteks/sweethome3d/tools/URLContent.class?test=test%20test");
        content = new URLContent(url);
        inputStream = content.openStream();
        assertNotNull(inputStream);
        inputStream.close();

        // Test with a valid URL that references a JAR entry encoded in application/x-www-form-urlencoded format
        // and with a space character in the URL
        url = new URL("jar:http://www.eteks.com/sweethome3d.jar!/com/eteks/sweethome3d/tools/URLContent.class?test=test%20test");
        content = new URLContent(url);
        inputStream = content.openStream();
        assertNotNull(inputStream);
        inputStream.close();

        // Test with a valid URL that references a JAR entry encoded in application/x-www-form-urlencoded format
        // and with a space character in the URL
        url = new URL("jar:http://www.eteks.com/sweethome3d.jar!/com/eteks/sweethome3d/tools/URLContent.class?test=test%20test");
        content = new URLContent(url);
        inputStream = content.openStream();
        assertNotNull(inputStream);
        inputStream.close();

        // Test with a valid URL that references a JAR entry encoded in application/x-www-form-urlencoded format
        // and with a space character in the URL
        url = new URL("jar:http://www.eteks.com/sweethome3d.jar!/com/eteks/sweethome3d/tools/URLContent.class?test=test%20test");
        content = new URLContent(url);
        inputStream = content.openStream();
        assertNotNull(inputStream);
        inputStream.close();

        // Test with a valid URL that references a JAR entry encoded in application/x-www-form-urlencoded format
        // and with a space character in the URL
        url = new URL("jar:http://www.eteks.com/sweethome3d.jar!/com/eteks/sweethome3d/tools/URLContent.class?test=test%20test");
        content = new URLContent(url);
        inputStream = content.openStream();
        assertNotNull(inputStream);
        inputStream.close();

        // Test with a valid URL that references a JAR entry encoded in application/x-www-form-urlencoded format
        // and with a space character in the URL
        url = new URL("jar:http://www.eteks.com/sweethome3d.jar!/com/eteks/sweethome3d/tools/URLContent.class?test=test%20test");
        content = new URLContent(url);
        inputStream = content.openStream();
        assertNotNull(inputStream);
        inputStream.close();

        // Test with a valid URL that references a JAR entry encoded in application/x-www-form-urlencoded format
        // and with a space character in the URL
        url = new URL("jar:http://www.eteks.com/sweethome3d.jar!/com/eteks/sweethome3d/tools/URLContent.class?test=test%20test");
        content = new URLContent(url);
        inputStream = content.openStream();
        assertNotNull(inputStream);
        inputStream.close();

        // Test with a valid URL that references a JAR entry encoded in application/x-www-form-urlencoded format
        // and with a space character in the URL
        url = new URL("jar:http://www.eteks.com/sweethome3d.jar!/com/eteks/sweethome3d/tools/URLContent.class?test=test%20test");
        content = new URLContent(url);
        inputStream = content.openStream();
        assertNotNull(inputStream);
        inputStream.close();

        // Test with a valid URL that references a JAR entry encoded in application/x-www-form-urlencoded format
        // and with a space character in the URL
        url = new URL("jar:http://www.eteks.com/sweethome3d.jar!/com/eteks/sweethome3d/tools/URLContent.class?test=test%20test");
        content = new URLContent(url);
        inputStream = content.openStream();
        assertNotNull(inputStream);
        inputStream.close();

        // Test with a valid URL that references a JAR entry encoded in application/x-www-form-urlencoded format
        // and with a space character in the URL
        url = new URL("jar:http://www.eteks.com/sweethome3d.jar!/com/eteks/sweethome3d/tools/URLContent.class?test=test%20test");
        content = new URLContent(url);
        inputStream = content.openStream();
        assertNotNull(inputStream);
        inputStream.close();

        // Test with a valid URL that references a JAR entry encoded in application/x-www-form-urlencoded format
        // and with a space character in the URL
        url = new URL("jar:http://www.eteks.com/sweethome3d.jar!/com/eteks/sweethome3d/tools/URLContent.class?test=test%20test");
        content = new URLContent(url);
        inputStream = content.openStream();
        assertNotNull(inputStream);
        inputStream.close();

        // Test with a valid URL that references a JAR entry encoded in application/x-www-form-urlencoded format
        // and with a space character in the URL
        url = new URL("jar:http://www.eteks.com/sweethome3d.jar!/com/eteks/sweethome3d/tools/URLContent.class?test=test%20test");
        content = new URLContent(url);
        inputStream = content.openStream();
        assertNotNull(inputStream);
        inputStream.close();

        // Test with a valid URL that references a JAR entry encoded in application/x-www-form-urlencoded format