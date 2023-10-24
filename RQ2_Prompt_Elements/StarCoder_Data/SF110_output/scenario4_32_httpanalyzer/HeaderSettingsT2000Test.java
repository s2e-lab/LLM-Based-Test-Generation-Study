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
     * Test of setHeaders method, of class HeaderSettings.
     */
    @Test
    void testSetHeaders() {
        System.out.println("setHeaders");
        HeaderSettings.initHeaders(HeaderSettings.FIREFOX, "http://www.google.com");
        Header[] headers = HeaderSettings.setHeaders();
        String expResult = "User-Agent: Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1; .NET CLR 1.1.4322; .NET CLR 2.0.50727)\r\n" + "Accept-Encoding: gzip,deflate\r\n" + "Accept-Language: ru-RU,ru;q=0.8,en-US;q=0.5,en;q=0.3\r\n" + "Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8\r\n" + "Referer: http://www.google.com\r\n" + "Connection: Keep-Alive\r\n";
        String result = HeaderSettings.showHeaders(headers);
        assertEquals(expResult, result);
    }

    /**
     * Test of setHeaders method, of class HeaderSettings.
     */
    @Test
    void testSetHeaders2() {
        System.out.println("setHeaders");
        HeaderSettings.initHeaders(HeaderSettings.IE6, "http://www.google.com");
        Header[] headers = HeaderSettings.setHeaders();
        String expResult = "User-Agent: Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1)\r\n" + "Accept-Encoding: gzip,deflate\r\n" + "Accept-Language: ru-RU,ru;q=0.8,en-US;q=0.5,en;q=0.3\r\n" + "Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8\r\n" + "Referer: http://www.google.com\r\n" + "Connection: Keep-Alive\r\n";
        String result = HeaderSettings.showHeaders(headers);
        assertEquals(expResult, result);
    }

    /**
     * Test of setHeaders method, of class HeaderSettings.
     */
    @Test
    void testSetHeaders3() {
        System.out.println("setHeaders");
        HeaderSettings.initHeaders(HeaderSettings.IE7, "http://www.google.com");
        Header[] headers = HeaderSettings.setHeaders();
        String expResult = "User-Agent: Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 6.0)\r\n" + "Accept-Encoding: gzip,deflate\r\n" + "Accept-Language: ru-RU,ru;q=0.8,en-US;q=0.5,en;q=0.3\r\n" + "Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8\r\n" + "Referer: http://www.google.com\r\n" + "Connection: Keep-Alive\r\n";
        String result = HeaderSettings.showHeaders(headers);
        assertEquals(expResult, result);
    }

    /**
     * Test of setHeaders method, of class HeaderSettings.
     */
    @Test
    void testSetHeaders4() {
        System.out.println("setHeaders");
        HeaderSettings.initHeaders(HeaderSettings.IE8, "http://www.google.com");
        Header[] headers = HeaderSettings.setHeaders();
        String expResult = "User-Agent: Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 6.1)\r\n" + "Accept-Encoding: gzip,deflate\r\n" + "Accept-Language: ru-RU,ru;q=0.8,en-US;q=0.5,en;q=0.3\r\n" + "Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8\r\n" + "Referer: http://www.google.com\r\n" + "Connection: Keep-Alive\r\n";
        String result = HeaderSettings.showHeaders(headers);
        assertEquals(expResult, result);
    }

    /**
     * Test of setHeaders method, of class HeaderSettings.
     */
    @Test
    void testSetHeaders5() {
        System.out.println("setHeaders");
        HeaderSettings.initHeaders(HeaderSettings.GOOGLEBOT, "http://www.google.com");
        Header[] headers = HeaderSettings.setHeaders();
        String expResult = "User-Agent: Mozilla/5.0 (compatible; Googlebot/2.1; +http://www.google.com/bot.html)\r\n" + "Accept-Encoding: gzip,deflate\r\n" + "Accept-Language: ru-RU,ru;q=0.8,en-US;q=0.5,en;q=0.3\r\n" + "Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8\r\n" + "Referer: http://www.google.com\r\n" + "Connection: Keep-Alive\r\n";
        String result = HeaderSettings.showHeaders(headers);
        assertEquals(expResult, result);
    }

    /**
     * Test of setHeaders method, of class HeaderSettings.
     */
    @Test
    void testSetHeaders6() {
        System.out.println("setHeaders");
        HeaderSettings.initHeaders(HeaderSettings.MSNBOT, "http://www.google.com");
        Header[] headers = HeaderSettings.setHeaders();
        String expResult = "User-Agent: msnbot/1.1 (+http://search.msn.com/msnbot.htm)\r\n" + "Accept-Encoding: gzip,deflate\r\n" + "Accept-Language: ru-RU,ru;q=0.8,en-US;q=0.5,en;q=0.3\r\n" + "Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8\r\n" + "Referer: http://www.google.com\r\n" + "Connection: Keep-Alive\r\n";
        String result = HeaderSettings.showHeaders(headers);
        assertEquals(expResult, result);
    }

    /**
     * Test of setHeaders method, of class HeaderSettings.
     */
    @Test
    void testSetHeaders7() {
        System.out.println("setHeaders");
        HeaderSettings.initHeaders(HeaderSettings.YAHOOBOT, "http://www.google.com");
        Header[] headers = HeaderSettings.setHeaders();
        String expResult = "User-Agent: Mozilla/5.0 (compatible; Yahoo! Slurp; http://help.yahoo.com/help/us/ysearch/slurp)\r\n" + "Accept-Encoding: gzip,deflate\r\n" + "Accept-Language: ru-RU,ru;q=0.8,en-US;q=0.5,en;q=0.3\r\n" + "Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8\r\n" + "Referer: http://www.google.com\r\n" + "Connection: Keep-Alive\r\n";
        String result = HeaderSettings.showHeaders(headers);
        assertEquals(expResult, result);
    }

    /**
     * Test of setHeaders method, of class HeaderSettings.
     */
    @Test
    void testSetHeaders8() {
        System.out.println("setHeaders");
        HeaderSettings.initHeaders(HeaderSettings.IPHONE, "http://www.google.com");
        Header[] headers = HeaderSettings.setHeaders();
        String expResult = "User-Agent: Mozilla/5.0 (iPhone; U; CPU iPhone OS 3_0 like Mac OS X; en-us) AppleWebKit/528.18 (KHTML, like Gecko) Version/4.0 Mobile/7A341 Safari/528.16\r\n" + "Accept-Encoding: gzip,deflate\r\n" + "Accept-Language: ru-RU,ru;q=0.8,en-US;q=0.5,en;q=0.3\r\n" +