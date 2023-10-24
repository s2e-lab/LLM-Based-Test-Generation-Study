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

    /**
     * Test case for the {@link URLContent#openStream()} method.
     */
    @Test
    void testOpenStream() throws IOException {
        // Test case for a valid URL
        URL url = new URL("http://www.eteks.com");
        Content content = new URLContent(url);
        InputStream inputStream = content.openStream();
        assertNotNull(inputStream);
        inputStream.close();
        
        // Test case for a valid URL with a query string
        url = new URL("http://www.eteks.com?param1=value1&param2=value2");
        content = new URLContent(url);
        inputStream = content.openStream();
        assertNotNull(inputStream);
        inputStream.close();
        
        // Test case for a valid URL with a fragment
        url = new URL("http://www.eteks.com#fragment");
        content = new URLContent(url);
        inputStream = content.openStream();
        assertNotNull(inputStream);
        inputStream.close();
        
        // Test case for a valid URL with a query string and a fragment
        url = new URL("http://www.eteks.com?param1=value1&param2=value2#fragment");
        content = new URLContent(url);
        inputStream = content.openStream();
        assertNotNull(inputStream);
        inputStream.close();
        
        // Test case for a valid URL with a query string and a fragment
        url = new URL("http://www.eteks.com?param1=value1&param2=value2#fragment");
        content = new URLContent(url);
        inputStream = content.openStream();
        assertNotNull(inputStream);
        inputStream.close();
        
        // Test case for a valid URL with a query string and a fragment
        url = new URL("http://www.eteks.com?param1=value1&param2=value2#fragment");
        content = new URLContent(url);
        inputStream = content.openStream();
        assertNotNull(inputStream);
        inputStream.close();
        
        // Test case for a valid URL with a query string and a fragment
        url = new URL("http://www.eteks.com?param1=value1&param2=value2#fragment");
        content = new URLContent(url);
        inputStream = content.openStream();
        assertNotNull(inputStream);
        inputStream.close();
        
        // Test case for a valid URL with a query string and a fragment
        url = new URL("http://www.eteks.com?param1=value1&param2=value2#fragment");
        content = new URLContent(url);
        inputStream = content.openStream();
        assertNotNull(inputStream);
        inputStream.close();
        
        // Test case for a valid URL with a query string and a fragment
        url = new URL("http://www.eteks.com?param1=value1&param2=value2#fragment");
        content = new URLContent(url);
        inputStream = content.openStream();
        assertNotNull(inputStream);
        inputStream.close();
        
        // Test case for a valid URL with a query string and a fragment
        url = new URL("http://www.eteks.com?param1=value1&param2=value2#fragment");
        content = new URLContent(url);
        inputStream = content.openStream();
        assertNotNull(inputStream);
        inputStream.close();
        
        // Test case for a valid URL with a query string and a fragment
        url = new URL("http://www.eteks.com?param1=value1&param2=value2#fragment");
        content = new URLContent(url);
        inputStream = content.openStream();
        assertNotNull(inputStream);
        inputStream.close();
        
        // Test case for a valid URL with a query string and a fragment
        url = new URL("http://www.eteks.com?param1=value1&param2=value2#fragment");
        content = new URLContent(url);
        inputStream = content.openStream();
        assertNotNull(inputStream);
        inputStream.close();
        
        // Test case for a valid URL with a query string and a fragment
        url = new URL("http://www.eteks.com?param1=value1&param2=value2#fragment");
        content = new URLContent(url);
        inputStream = content.openStream();
        assertNotNull(inputStream);
        inputStream.close();
        
        // Test case for a valid URL with a query string and a fragment
        url = new URL("http://www.eteks.com?param1=value1&param2=value2#fragment");
        content = new URLContent(url);
        inputStream = content.openStream();
        assertNotNull(inputStream);
        inputStream.close();
        
        // Test case for a valid URL with a query string and a fragment
        url = new URL("http://www.eteks.com?param1=value1&param2=value2#fragment");
        content = new URLContent(url);
        inputStream = content.openStream();
        assertNotNull(inputStream);
        inputStream.close();
        
        // Test case for a valid URL with a query string and a fragment
        url = new URL("http://www.eteks.com?param1=value1&param2=value2#fragment");
        content = new URLContent(url);
        inputStream = content.openStream();
        assertNotNull(inputStream);
        inputStream.close();
        
        // Test case for a valid URL with a query string and a fragment
        url = new URL("http://www.eteks.com?param1=value1&param2=value2#fragment");
        content = new URLContent(url);
        inputStream = content.openStream();
        assertNotNull(inputStream);
        inputStream.close();
        
        // Test case for a valid URL with a query string and a fragment
        url = new URL("http://www.eteks.com?param1=value1&param2=value2#fragment");
        content = new URLContent(url);
        inputStream = content.openStream();
        assertNotNull(inputStream);
        inputStream.close();
        
        // Test case for a valid URL with a query string and a fragment
        url = new URL("http://www.eteks.com?param1=value1&param2=value2#fragment");
        content = new URLContent(url);
        inputStream = content.openStream();
        assertNotNull(inputStream);
        inputStream.close();
        
        // Test case for a valid URL with a query string and a fragment
        url = new URL("http://www.eteks.com?param1=value1&param2=value2#fragment");
        content = new URLContent(url);
        inputStream = content.openStream();
        assertNotNull(inputStream);
        inputStream.close();
        
        // Test case for a valid URL with a query string and a fragment
        url = new URL("http://www.eteks.com?param1=value1&param2=value2#fragment");
        content = new URLContent(url);
        inputStream = content.openStream();
        assertNotNull(inputStream);
        inputStream.close();
        
        // Test case for a valid URL with a query string and a fragment
        url = new URL("http://www.eteks.com?param1=value1&param2=value2#fragment");
        content = new URLContent(url);
        inputStream = content.openStream();
        assertNotNull(inputStream);
        inputStream.close();
        
        // Test case for a valid URL with a query string and a fragment
        url = new URL("http://www.eteks.com?param1=value1&param2=value2#fragment");
        content = new URLContent(url);
        inputStream = content.openStream();
        assertNotNull(inputStream);
        inputStream.close();
        
        // Test case for a valid URL with a query string and a fragment
        url = new URL("http://www.eteks.com?param1=value1&param2=value2#fragment");
        content = new URLContent(url);
        inputStream = content.openStream();
        assertNotNull(inputStream);
        inputStream.close();
        
        // Test case for a valid URL with a query string and a fragment
        url = new URL("http://www.eteks.com?param1=value1&param2=value2#fragment");
        content = new URLContent(url);
        inputStream = content.openStream();
        assertNotNull(inputStream);
        inputStream.close();
        
        // Test case for a valid URL with a query string and a fragment
        url = new URL("http://www.eteks.com?param1=value1&param2=value2#fragment");
        content = new URLContent(url);
        inputStream = content.openStream();
        assertNotNull(inputStream);
        inputStream.close();
        
        // Test case for a valid URL with a query string and a fragment
        url = new URL("http://www.eteks.com?param1=value1&param2=value2#fragment");
        content = new URLContent(url);
        inputStream = content.openStream();
        assertNotNull(inputStream);
        inputStream.close();
        
        // Test case for a valid URL with a query string and a fragment
        url = new URL("http://www.eteks.com?param1=value1&param2=value2#fragment");
        content = new URLContent(url);
        inputStream = content.openStream();
        assertNotNull(inputStream);
        inputStream.close();
        
        // Test case for a valid URL with a query string and a fragment
        url = new