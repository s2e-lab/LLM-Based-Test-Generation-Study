// HeaderSettingsTest3.java
package httpanalyzer;

import org.apache.http.Header;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpRequestBase;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HeaderSettings}.
* It contains ten unit test cases for the {@link HeaderSettings#showHeaders(Header[])} method.
*/
class HeaderSettingsTest3 {

		/**
		* Test case for {@link HeaderSettings#showHeaders(Header[])} method.
		* It checks if the method returns the correct string representation of the headers.
		*/
		@Test
		void testShowHeaders() {
				HttpGet baseRequest = new HttpGet();
				baseRequest.addHeader("User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1; .NET CLR 1.1.4322; .NET CLR 2.0.50727)");
				baseRequest.addHeader("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
				baseRequest.addHeader("Referer", "http://www.google.com");
				baseRequest.addHeader("Connection", "Keep-Alive");
				baseRequest.addHeader("Keep-Alive", "300");
				Header[] headers = baseRequest.getAllHeaders();
				String headersString = HeaderSettings.showHeaders(headers);
				assertEquals("User-Agent: Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1; .NET CLR 1.1.4322; .NET CLR 2.0.50727)\nAccept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8\nReferer: http://www.google.com\nConnection: Keep-Alive\nKeep-Alive: 300\n", headersString);
		}
		
		/**
		* Test case for {@link HeaderSettings#showHeaders(Header[])} method.
		* It checks if the method returns the correct string representation of the headers.
		*/
		@Test
		void testShowHeaders2() {
				HttpGet baseRequest = new HttpGet();
				baseRequest.addHeader("User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1)");
				baseRequest.addHeader("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
				baseRequest.addHeader("Referer", "http://www.google.com");
				baseRequest.addHeader("Connection", "Keep-Alive");
				baseRequest.addHeader("Keep-Alive", "300");
				Header[] headers = baseRequest.getAllHeaders();
				String headersString = HeaderSettings.showHeaders(headers);
				assertEquals("User-Agent: Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1)\nAccept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8\nReferer: http://www.google.com\nConnection: Keep-Alive\nKeep-Alive: 300\n", headersString);
		}
		
		/**
		* Test case for {@link HeaderSettings#showHeaders(Header[])} method.
		* It checks if the method returns the correct string representation of the headers.
		*/
		@Test
		void testShowHeaders3() {
				HttpGet baseRequest = new HttpGet();
				baseRequest.addHeader("User-Agent", "Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 6.0)");
				baseRequest.addHeader("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
				baseRequest.addHeader("Referer", "http://www.google.com");
				baseRequest.addHeader("Connection", "Keep-Alive");
				baseRequest.addHeader("Keep-Alive", "300");
				Header[] headers = baseRequest.getAllHeaders();
				String headersString = HeaderSettings.showHeaders(headers);
				assertEquals("User-Agent: Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 6.0)\nAccept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8\nReferer: http://www.google.com\nConnection: Keep-Alive\nKeep-Alive: 300\n", headersString);
		}
		
		/**
		* Test case for {@link HeaderSettings#showHeaders(Header[])} method.
		* It checks if the method returns the correct string representation of the headers.
		*/
		@Test
		void testShowHeaders4() {
				HttpGet baseRequest = new HttpGet();
				baseRequest.addHeader("User-Agent", "Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 6.1)");
				baseRequest.addHeader("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
				baseRequest.addHeader("Referer", "http://www.google.com");
				baseRequest.addHeader("Connection", "Keep-Alive");
				baseRequest.addHeader("Keep-Alive", "300");
				Header[] headers = baseRequest.getAllHeaders();
				String headersString = HeaderSettings.showHeaders(headers);
				assertEquals("User-Agent: Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 6.1)\nAccept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8\nReferer: http://www.google.com\nConnection: Keep-Alive\nKeep-Alive: 300\n", headersString);
		}
		
		/**
		* Test case for {@link HeaderSettings#showHeaders(Header[])} method.
		* It checks if the method returns the correct string representation of the headers.
		*/
		@Test
		void testShowHeaders5() {
				HttpGet baseRequest = new HttpGet();
				baseRequest.addHeader("User-Agent", "Mozilla/5.0 (compatible; Googlebot/2.1; +http://www.google.com/bot.html)");
				baseRequest.addHeader("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
				baseRequest.addHeader("Referer", "http://www.google.com");
				baseRequest.addHeader("Connection", "Keep-Alive");
				baseRequest.addHeader("Keep-Alive", "300");
				Header[] headers = baseRequest.getAllHeaders();
				String headersString = HeaderSettings.showHeaders(headers);
				assertEquals("User-Agent: Mozilla/5.0 (compatible; Googlebot/2.1; +http://www.google.com/bot.html)\nAccept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8\nReferer: http://www.google.com\nConnection: Keep-Alive\nKeep-Alive: 300\n", headersString);
		}
		
		/**
		* Test case for {@link HeaderSettings#showHeaders(Header[])} method.
		* It checks if the method returns the correct string representation of the headers.
		*/
		@Test
		void testShowHeaders6() {
				HttpGet baseRequest = new HttpGet();
				baseRequest.addHeader("User-Agent", "msnbot/1.1 (+http://search.msn.com/msnbot.htm)");
				baseRequest.addHeader("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.