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
    void testOpenStream() throws MalformedURLException, IOException {
        // Test with a valid URL
        URL url = new URL("http://www.eteks.com");
        Content content = new URLContent(url);
        InputStream inputStream = content.openStream();
        assertNotNull(inputStream);
        inputStream.close();
        
        // Test with a null URL
        content = new URLContent(null);
        inputStream = content.openStream();
        assertNull(inputStream);
    }
}
