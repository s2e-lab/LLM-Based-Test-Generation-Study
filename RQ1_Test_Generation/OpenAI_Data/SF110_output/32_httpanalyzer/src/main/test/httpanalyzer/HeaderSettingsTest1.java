// HeaderSettingsTest1.java
package httpanalyzer;

import org.apache.http.Header;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpRequestBase;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HeaderSettings}.
* It contains ten unit test cases for the {@link HeaderSettings#getHeaders()} method.
*/
class HeaderSettingsTest1 {

		/**
		* Test case for {@link HeaderSettings#getHeaders()} method.
		* It checks if the method returns the correct value.
		*/
		@Test
		void testGetHeaders() {
				HeaderSettings.initHeaders(HeaderSettings.FIREFOX, "http://www.google.com");
				String headers = HeaderSettings.getHeaders();
				assertEquals("User-Agent: Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1; .NET CLR 1.1.4322; .NET CLR 2.0.50727)\nAccept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8\nReferer: http://www.google.com\nConnection: Keep-Alive\nKeep-Alive: 300\n", headers);
		}
		
		/**
		* Test case for {@link HeaderSettings#getHeaders()} method.
		* It checks if the method returns the correct value.
		*/
		@Test
		void testGetHeaders1() {
				HeaderSettings.initHeaders(HeaderSettings.IE6, "http://www.google.com");
				String headers = HeaderSettings.getHeaders();
				assertEquals("User-Agent: Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1)\nAccept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8\nReferer: http://www.google.com\nConnection: Keep-Alive\nKeep-Alive: 300\n", headers);
		}
		
		/**
		* Test case for {@link HeaderSettings#getHeaders()} method.
		* It checks if the method returns the correct value.
		*/
		@Test
		void testGetHeaders2() {
				HeaderSettings.initHeaders(HeaderSettings.IE7, "http://www.google.com");
				String headers = HeaderSettings.getHeaders();
				assertEquals("User-Agent: Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 6.0)\nAccept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8\nReferer: http://www.google.com\nConnection: Keep-Alive\nKeep-Alive: 300\n", headers);
		}
		
		/**
		* Test case for {@link HeaderSettings#getHeaders()} method.
		* It checks if the method returns the correct value.
		*/
		@Test
		void testGetHeaders3() {
				HeaderSettings.initHeaders(HeaderSettings.IE8, "http://www.google.com");
				String headers = HeaderSettings.getHeaders();
				assertEquals("User-Agent: Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 6.1)\nAccept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8\nReferer: http://www.google.com\nConnection: Keep-Alive\nKeep-Alive: 300\n", headers);
		}
		
		/**
		* Test case for {@link HeaderSettings#getHeaders()} method.
		* It checks if the method returns the correct value.
		*/
		@Test
		void testGetHeaders4() {
				HeaderSettings.initHeaders(HeaderSettings.GOOGLEBOT, "http://www.google.com");
				String headers = HeaderSettings.getHeaders();
				assertEquals("User-Agent: Mozilla/5.0 (compatible; Googlebot/2.1; +http://www.google.com/bot.html)\nAccept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8\nReferer: http://www.google.com\nConnection: Keep-Alive\nKeep-Alive: 300\n", headers);
		}
		
		/**
		* Test case for {@link HeaderSettings#getHeaders()} method.
		* It checks if the method returns the correct value.
		*/
		@Test
		void testGetHeaders5() {
				HeaderSettings.initHeaders(HeaderSettings.MSNBOT, "http://www.google.com");
				String headers = HeaderSettings.getHeaders();
				assertEquals("User-Agent: msnbot/1.1 (+http://search.msn.com/msnbot.htm)\nAccept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8\nReferer: http://www.google.com\nConnection: Keep-Alive\nKeep-Alive: 300\n", headers);
		}
		
		/**
		* Test case for {@link HeaderSettings#getHeaders()} method.
		* It checks if the method returns the correct value.
		*/
		@Test
		void testGetHeaders6() {
				HeaderSettings.initHeaders(HeaderSettings.YAHOOBOT, "http://www.google.com");
				String headers = HeaderSettings.getHeaders();
				assertEquals("User-Agent: Mozilla/5.0 (compatible; Yahoo! Slurp; http://help.yahoo.com/help/us/ysearch/slurp)\nAccept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8\nReferer: http://www.google.com\nConnection: Keep-Alive\nKeep-Alive: 300\n", headers);
		}
		
		/**
		* Test case for {@link HeaderSettings#getHeaders()} method.
		* It checks if the method returns the correct value.
		*/
		@Test
		void testGetHeaders7() {
				HeaderSettings.initHeaders(HeaderSettings.IPHONE, "http://www.google.com");
				String headers = HeaderSettings.getHeaders();
				assertEquals("User-Agent: Mozilla/5.0 (iPhone; U; CPU iPhone OS 3_0 like Mac OS X; en-us) AppleWebKit/528.18 (KHTML, like Gecko) Version/4.0 Mobile/7A341 Safari/528.16\nAccept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8\nReferer: http://www.google.com\nConnection: Keep-Alive\nKeep-Alive: 300\n", headers);
		}
		
		/**
		* Test case for {@link HeaderSettings#getHeaders()} method.
		* It checks if the method returns the correct value.
		*/
		@Test
		void testGetHeaders8() {
				HeaderSettings.initHeaders(HeaderSettings.CUSTOM, "http://www.google.com");
				String headers = HeaderSettings.getHeaders();
				assertEquals("User-Agent: Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1; .NET CLR 1.1.4322; .NET CLR 2.0.50727)\nAccept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8\nReferer: http://www.google.com\nConnection: Keep-Alive\nKeep-Alive: 300\n", headers);
		}
		
		/**
		* Test case for {@link HeaderSettings#getHeaders()} method.
		* It checks if the method returns the correct value.
		*/
		@Test
		void testGetHeaders9() {
				HeaderSettings.initHeaders("User-Agent: Mozilla/4.0 (compatible; MSIE 6.0