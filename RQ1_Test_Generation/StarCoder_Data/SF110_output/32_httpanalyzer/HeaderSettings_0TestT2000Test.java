// HeaderSettings_0Test.java
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
class HeaderSettings_0Test {

    /**
    * Test case for {@link HeaderSettings#setHeaders()} method.
    */
    @Test
    void testSetHeaders() {
        HeaderSettings.initHeaders(HeaderSettings.FIREFOX, "http://www.google.com");
        Header[] headers = HeaderSettings.setHeaders();
        String headersString = HeaderSettings.showHeaders(headers);
        assertEquals("User-Agent: Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1; .NET CLR 1.1.4322; .NET CLR 2.0.50727)\n" + "Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8\n" + "Referer: http://www.google.com\n" + "Connection: Keep-Alive\n" + "Keep-Alive: 300\n", headersString);
    }
}

// HeaderSettings_1Test.java
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
class HeaderSettings_1Test {
		
    /**
    * Test case for {@link HeaderSettings#setHeaders()} method.
    */
    @Test
    void testSetHeaders() {
        HeaderSettings.initHeaders(HeaderSettings.IE6, "http://www.google.com");
        Header[] headers = HeaderSettings.setHeaders();
        String headersString = HeaderSettings.showHeaders(headers);
        assertEquals("User-Agent: Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1; .NET CLR 1.1.4322; .NET CLR 2.0.50727)\n" + "Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8\n" + "Referer: http://www.google.com\n" + "Connection: Keep-Alive\n" + "Keep-Alive: 300\n", headersString);
    }
}

// HeaderSettings_2Test.java
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
class HeaderSettings_2Test {
		
    /**
    * Test case for {@link HeaderSettings#setHeaders()} method.
    */
    @Test
    void testSetHeaders() {
        HeaderSettings.initHeaders(HeaderSettings.IE7, "http://www.google.com");
        Header[] headers = HeaderSettings.setHeaders();
        String headersString = HeaderSettings.showHeaders(headers);
        assertEquals("User-Agent: Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 6.0)\n" + "Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8\n" + "Referer: http://www.google.com\n" + "Connection: Keep-Alive\n" + "Keep-Alive: 300\n", headersString);
    }
}

// HeaderSettings_3Test.java
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
class HeaderSettings_3Test {
		
    /**
    * Test case for {@link HeaderSettings#setHeaders()} method.
    */
    @Test
    void testSetHeaders() {
        HeaderSettings.initHeaders(HeaderSettings.IE8, "http://www.google.com");
        Header[] headers = HeaderSettings.setHeaders();
        String headersString = HeaderSettings.showHeaders(headers);
        assertEquals("User-Agent: Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 6.1)\n" + "Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8\n" + "Referer: http://www.google.com\n" + "Connection: Keep-Alive\n" + "Keep-Alive: 300\n", headersString);
    }
}

// HeaderSettings_4Test.java
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
class HeaderSettings_4Test {
		
    /**
    * Test case for {@link HeaderSettings#setHeaders()} method.
    */
    @Test
    void testSetHeaders() {
        HeaderSettings.initHeaders(HeaderSettings.GOOGLEBOT, "http://www.google.com");
        Header[] headers = HeaderSettings.setHeaders();
        String headersString = HeaderSettings.showHeaders(headers);
        assertEquals("User-Agent: Mozilla/5.0 (compatible; Googlebot/2.1; +http://www.google.com/bot.html)\n" + "Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8\n" + "Referer: http://www.google.com\n" + "Connection: Keep-Alive\n" + "Keep-Alive: 300\n", headersString);
    }
}

// HeaderSettings_5Test.java
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
class HeaderSettings_5Test {
		
    /**
    * Test case for {@link HeaderSettings#setHeaders()} method.
    */
    @Test
    void testSetHeaders() {
        HeaderSettings.initHeaders(HeaderSettings.MSNBOT, "http://www.google.com");
        Header[] headers = HeaderSettings.setHeaders();
        String headersString = HeaderSettings.showHeaders(headers);
        assertEquals("User-Agent: msnbot/1.1 (+http://search.msn.com/msnbot.htm)\n" + "Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8\n" + "Referer: http://www.google.com\n" + "Connection: Keep-Alive\n" + "Keep-Alive: 300\n", headersString);
    }
}

// HeaderSettings_6Test.java
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
class HeaderSettings_6Test {
		
    /**
    * Test case for {@link HeaderSettings#setHeaders()} method.
    */
    @Test
    void testSetHeaders() {
        HeaderSettings.initHeaders(HeaderSettings.YAHOOBOT, "http://www.google.com");
        Header[] headers = HeaderSettings.setHeaders();
        String headersString = HeaderSettings.show