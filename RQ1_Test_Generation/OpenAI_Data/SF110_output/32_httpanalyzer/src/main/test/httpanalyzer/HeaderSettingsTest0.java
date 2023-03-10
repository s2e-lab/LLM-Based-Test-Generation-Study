// HeaderSettingsTest0.java
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
class HeaderSettingsTest0 {

	/**
	* Test case for {@link HeaderSettings#setHeaders()} method.
	*/
	@Test
	void testSetHeaders0() {
		HeaderSettings.initHeaders(0, "http://www.google.com");
		Header[] headers = HeaderSettings.setHeaders();
		assertEquals(5, headers.length);
		assertEquals("User-Agent", headers[0].getName());
		assertEquals("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1; .NET CLR 1.1.4322; .NET CLR 2.0.50727)", headers[0].getValue());
		assertEquals("Accept", headers[1].getName());
		assertEquals("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8", headers[1].getValue());
		assertEquals("Referer", headers[2].getName());
		assertEquals("http://www.google.com", headers[2].getValue());
		assertEquals("Connection", headers[3].getName());
		assertEquals("Keep-Alive", headers[3].getValue());
		assertEquals("Keep-Alive", headers[4].getName());
		assertEquals("300", headers[4].getValue());
	}
	
	/**
	* Test case for {@link HeaderSettings#setHeaders()} method.
	*/
	@Test
	void testSetHeaders1() {
		HeaderSettings.initHeaders(1, "http://www.google.com");
		Header[] headers = HeaderSettings.setHeaders();
		assertEquals(5, headers.length);
		assertEquals("User-Agent", headers[0].getName());
		assertEquals("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1)", headers[0].getValue());
		assertEquals("Accept", headers[1].getName());
		assertEquals("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8", headers[1].getValue());
		assertEquals("Referer", headers[2].getName());
		assertEquals("http://www.google.com", headers[2].getValue());
		assertEquals("Connection", headers[3].getName());
		assertEquals("Keep-Alive", headers[3].getValue());
		assertEquals("Keep-Alive", headers[4].getName());
		assertEquals("300", headers[4].getValue());
	}
	
	/**
	* Test case for {@link HeaderSettings#setHeaders()} method.
	*/
	@Test
	void testSetHeaders2() {
		HeaderSettings.initHeaders(2, "http://www.google.com");
		Header[] headers = HeaderSettings.setHeaders();
		assertEquals(5, headers.length);
		assertEquals("User-Agent", headers[0].getName());
		assertEquals("Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 6.0)", headers[0].getValue());
		assertEquals("Accept", headers[1].getName());
		assertEquals("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8", headers[1].getValue());
		assertEquals("Referer", headers[2].getName());
		assertEquals("http://www.google.com", headers[2].getValue());
		assertEquals("Connection", headers[3].getName());
		assertEquals("Keep-Alive", headers[3].getValue());
		assertEquals("Keep-Alive", headers[4].getName());
		assertEquals("300", headers[4].getValue());
	}
	
	/**
	* Test case for {@link HeaderSettings#setHeaders()} method.
	*/
	@Test
	void testSetHeaders3() {
		HeaderSettings.initHeaders(3, "http://www.google.com");
		Header[] headers = HeaderSettings.setHeaders();
		assertEquals(5, headers.length);
		assertEquals("User-Agent", headers[0].getName());
		assertEquals("Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 6.1)", headers[0].getValue());
		assertEquals("Accept", headers[1].getName());
		assertEquals("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8", headers[1].getValue());
		assertEquals("Referer", headers[2].getName());
		assertEquals("http://www.google.com", headers[2].getValue());
		assertEquals("Connection", headers[3].getName());
		assertEquals("Keep-Alive", headers[3].getValue());
		assertEquals("Keep-Alive", headers[4].getName());
		assertEquals("300", headers[4].getValue());
	}
	
	/**
	* Test case for {@link HeaderSettings#setHeaders()} method.
	*/
	@Test
	void testSetHeaders4() {
		HeaderSettings.initHeaders(4, "http://www.google.com");
		Header[] headers = HeaderSettings.setHeaders();
		assertEquals(5, headers.length);
		assertEquals("User-Agent", headers[0].getName());
		assertEquals("Mozilla/5.0 (compatible; Googlebot/2.1; +http://www.google.com/bot.html)", headers[0].getValue());
		assertEquals("Accept", headers[1].getName());
		assertEquals("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8", headers[1].getValue());
		assertEquals("Referer", headers[2].getName());
		assertEquals("http://www.google.com", headers[2].getValue());
		assertEquals("Connection", headers[3].getName());
		assertEquals("Keep-Alive", headers[3].getValue());
		assertEquals("Keep-Alive", headers[4].getName());
		assertEquals("300", headers[4].getValue());
	}
	
	/**
	* Test case for {@link HeaderSettings#setHeaders()} method.
	*/
	@Test
	void testSetHeaders5() {
		HeaderSettings.initHeaders(5, "http://www.google.com");
		Header[] headers = HeaderSettings.setHeaders();
		assertEquals(5, headers.length);
		assertEquals("User-Agent", headers[0].getName());
		assertEquals("msnbot/1.1 (+http://search.msn.com/msnbot.htm)", headers[0].getValue());
		assertEquals("Accept", headers[1].getName());
		assertEquals("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8", headers[1].getValue());
		assertEquals("Referer", headers[2].getName());
		assertEquals("http://www.google.com", headers[2].getValue());
		assertEquals("Connection", headers[3].getName());
		assertEquals("Keep-Alive", headers[3].getValue());
		assertEquals("Keep-Alive", headers[4].getName());
		assertEquals("300", headers[4].getValue());
	}
	
	/**
	* Test case for {@link HeaderSettings#setHeaders()} method.
	*/
	@Test
	void testSetHeaders6() {
		HeaderSettings.initHeaders(6, "http://www.google.com");
		Header[] headers = HeaderSettings.setHeaders();
		assertEquals(5, headers.length);
		assertEquals("User-Agent", headers[0].getName());
		assertEquals("Mozilla/5.0 (compatible; Yahoo! Slur