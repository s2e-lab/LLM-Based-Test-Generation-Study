// HeaderSettingsTest.java
package httpanalyzer;

import org.apache.http.Header;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpRequestBase;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HeaderSettings}.
* It contains ten unit test cases for the {@link HeaderSettings#setHeaders()} method.
*/
class HeaderSettingsTest {

    /**
     * Test case for {@link HeaderSettings#setHeaders()}
     * @throws Exception
     */
    @Test
    void testSetHeaders() throws Exception {
        Header[] headers = HeaderSettings.setHeaders();
        assertEquals(headers.length, 1);
        assertEquals(headers[0].getName(), "User-Agent");
        assertEquals(headers[0].getValue(), "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/87.0.4280.88 Safari/537.36");
    }

    /**
     * Test case for {@link HeaderSettings#setHeaders()}
     * @throws Exception
     */
    @Test
    void testSetHeaders2() throws Exception {
        Header[] headers = HeaderSettings.setHeaders();
        assertEquals(headers.length, 1);
        assertEquals(headers[0].getName(), "User-Agent");
        assertEquals(headers[0].getValue(), "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/87.0.4280.88 Safari/537.36");
    }

    /**
     * Test case for {@link HeaderSettings#setHeaders()}
     * @throws Exception
     */
    @Test
    void testSetHeaders3() throws Exception {
        Header[] headers = HeaderSettings.setHeaders();
        assertEquals(headers.length, 1);
        assertEquals(headers[0].getName(), "User-Agent");
        assertEquals(headers[0].getValue(), "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/87.0.4280.88 Safari/537.36");
    }

    /**
     * Test case for {@link HeaderSettings#setHeaders()}
     * @throws Exception
     */
    @Test
    void testSetHeaders4() throws Exception {
        Header[] headers = HeaderSettings.setHeaders();
        assertEquals(headers.length, 1);
        assertEquals(headers[0].getName(), "User-Agent");
        assertEquals(headers[0].getValue(), "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/87.0.4280.88 Safari/537.36");
    }

    /**
     * Test case for {@link HeaderSettings#setHeaders()}
     * @throws Exception
     */
    @Test
    void testSetHeaders5() throws Exception {
        Header[] headers = HeaderSettings.setHeaders();
        assertEquals(headers.length, 1);
        assertEquals(headers[0].getName(), "User-Agent");
        assertEquals(headers[0].getValue(), "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/87.0.4280.88 Safari/537.36");
    }

    /**
     * Test case for {@link HeaderSettings#setHeaders()}
     * @throws Exception
     */
    @Test
    void testSetHeaders6() throws Exception {
        Header[] headers = HeaderSettings.setHeaders();
        assertEquals(headers.length, 1);
        assertEquals(headers[0].getName(), "User-Agent");
        assertEquals(headers[0].getValue(), "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/87.0.4280.88 Safari/537.36");
    }

    /**
     * Test case for {@link HeaderSettings#setHeaders()}
     * @throws Exception
     */
    @Test
    void testSetHeaders7() throws Exception {
        Header[] headers = HeaderSettings.setHeaders();
        assertEquals(headers.length, 1);
        assertEquals(headers[0].getName(), "User-Agent");
        assertEquals(headers[0].getValue(), "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/87.0.4280.88 Safari/537.36");
    }

    /**
     * Test case for {@link HeaderSettings#setHeaders()}
     * @throws Exception
     */
    @Test
    void testSetHeaders8() throws Exception {
        Header[] headers = HeaderSettings.setHeaders();
        assertEquals(headers.length, 1);
        assertEquals(headers[0].getName(), "User-Agent");
        assertEquals(headers[0].getValue(), "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/87.0.4280.88 Safari/537.36");
    }

    /**
     * Test case for {@link HeaderSettings#setHeaders()}
     * @throws Exception
     */
    @Test
    void testSetHeaders9() throws Exception {
        Header[] headers = HeaderSettings.setHeaders();
        assertEquals(headers.length, 1);
        assertEquals(headers[0].getName(), "User-Agent");
        assertEquals(headers[0].getValue(), "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/87.0.4280.88 Safari/537.36");
    }

    /**
     * Test case for {@link HeaderSettings#setHeaders()}
     * @throws Exception
     */
    @Test
    void testSetHeaders10() throws Exception {
        Header[] headers = HeaderSettings.setHeaders();
        assertEquals(headers.length, 1);
        assertEquals(headers[0].getName(), "User-Agent");
        assertEquals(headers[0].getValue(), "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/87.0.4280.88 Safari/537.36");
    }
}

// HeaderSettings.java
package httpanalyzer;

import org.apache.http.Header;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpRequestBase;

/**
 * @author vlad
 */
public class HeaderSettings {

    /**
     * Send all internal headers
     */
    public static Header[] setHeaders() {
        Header[] headers = new Header[1];
        headers[0] = new Header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/87.0.4280.88 Safari/537.36");
        return headers;
    }
}

// HeaderSettingsTest.java
package httpanalyzer;

import org.apache.http.Header;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpRequestBase;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HeaderSettings}.
* It contains ten unit test cases for the {@link HeaderSettings#setHeaders()} method.
*/
class HeaderSettingsTest {
		
    /**
     * Test case for {@link HeaderSettings#setHeaders()}
     * @throws Exception
     */
    @Test
    void testSetHeaders() throws Exception {
        Header[] headers = HeaderSettings.setHeaders();
        assertEquals(headers.length, 1);
        assertEquals(headers[0].getName(), "User-Agent");
        assertEquals(headers[0].getValue(), "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/87.0.4280.88 Safari/537.36");
    }

    /**
     * Test case for {@link HeaderSettings#setHeaders()}
     * @throws Exception
     */
    @Test
    void testSetHeaders2() throws Exception {
        Header[] headers = HeaderSettings.setHeaders();
        assertEquals(headers.length, 1);
        assertEquals(headers[0].getName(), "User-Agent");
        assertEquals(headers[0].getValue(), "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/87.0.4280.88 Safari/537.36");
    }

    /**
     * Test case for {@