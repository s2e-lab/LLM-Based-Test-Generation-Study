// ClientHttpRequest_11Test.java
package com.browsersoft.servlet.util;

import java.net.URLConnection;
import java.net.URL;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.io.File;
import java.io.InputStream;
import java.util.Random;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.util.Iterator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClientHttpRequest}.
* It contains ten unit test cases for the {@link ClientHttpRequest#post(URL, Map, Map)} method.
*/
class ClientHttpRequest_11Test {

	/**
	* Test case for {@link ClientHttpRequest#post(URL, Map, Map)} method.
	* Test case for <code>null</code> URL.
	*/
	@Test
	void testPost_1() throws IOException {
		URL url = null;
		Map cookies = new HashMap();
		Map parameters = new HashMap();
		
		assertThrows(NullPointerException.class, () -> {
			ClientHttpRequest.post(url, cookies, parameters);
		});
	}
	
	/**
	* Test case for {@link ClientHttpRequest#post(URL, Map, Map)} method.
	* Test case for <code>null</code> cookies.
	*/
	@Test
	void testPost_2() throws IOException {
		URL url = new URL("http://www.google.com");
		Map cookies = null;
		Map parameters = new HashMap();
		
		assertThrows(NullPointerException.class, () -> {
			ClientHttpRequest.post(url, cookies, parameters);
		});
	}
	
	/**
	* Test case for {@link ClientHttpRequest#post(URL, Map, Map)} method.
	* Test case for <code>null</code> parameters.
	*/
	@Test
	void testPost_3() throws IOException {
		URL url = new URL("http://www.google.com");
		Map cookies = new HashMap();
		Map parameters = null;
		
		assertThrows(NullPointerException.class, () -> {
			ClientHttpRequest.post(url, cookies, parameters);
		});
	}
	
	/**
	* Test case for {@link ClientHttpRequest#post(URL, Map, Map)} method.
	* Test case for empty cookies.
	*/
	@Test
	void testPost_4() throws IOException {
		URL url = new URL("http://www.google.com");
		Map cookies = new HashMap();
		Map parameters = new HashMap();
		
		assertThrows(IllegalArgumentException.class, () -> {
			ClientHttpRequest.post(url, cookies, parameters);
		});
	}
	
	/**
	* Test case for {@link ClientHttpRequest#post(URL, Map, Map)} method.
	* Test case for empty parameters.
	*/
	@Test
	void testPost_5() throws IOException {
		URL url = new URL("http://www.google.com");
		Map cookies = new HashMap();
		cookies.put("name", "value");
		Map parameters = new HashMap();
		
		assertThrows(IllegalArgumentException.class, () -> {
			ClientHttpRequest.post(url, cookies, parameters);
		});
	}
	
	/**
	* Test case for {@link ClientHttpRequest#post(URL, Map, Map)} method.
	* Test case for <code>null</code> cookie name.
	*/
	@Test
	void testPost_6() throws IOException {
		URL url = new URL("http://www.google.com");
		Map cookies = new HashMap();
		cookies.put(null, "value");
		Map parameters = new HashMap();
		parameters.put("name", "value");
		
		assertThrows(NullPointerException.class, () -> {
			ClientHttpRequest.post(url, cookies, parameters);
		});
	}
	
	/**
	* Test case for {@link ClientHttpRequest#post(URL, Map, Map)} method.
	* Test case for <code>null</code> cookie value.
	*/
	@Test
	void testPost_7() throws IOException {
		URL url = new URL("http://www.google.com");
		Map cookies = new HashMap();
		cookies.put("name", null);
		Map parameters = new HashMap();
		parameters.put("name", "value");
		
		assertThrows(NullPointerException.class, () -> {
			ClientHttpRequest.post(url, cookies, parameters);
		});
	}
	
	/**
	* Test case for {@link ClientHttpRequest#post(URL, Map, Map)} method.
	* Test case for <code>null</code> parameter name.
	*/
	@Test
	void testPost_8() throws IOException {
		URL url = new URL("http://www.google.com");
		Map cookies = new HashMap();
		cookies.put("name", "value");
		Map parameters = new HashMap();
		parameters.put(null, "value");
		
		assertThrows(NullPointerException.class, () -> {
			ClientHttpRequest.post(url, cookies, parameters);
		});
	}
	
	/**
	* Test case for {@link ClientHttpRequest#post(URL, Map, Map)} method.
	* Test case for <code>null</code> parameter value.
	*/
	@Test
	void testPost_9() throws IOException {
		URL url = new URL("http://www.google.com");
		Map cookies = new HashMap();
		cookies.put("name", "value");
		Map parameters = new HashMap();
		parameters.put("name", null);
		
		assertThrows(NullPointerException.class, () -> {
			ClientHttpRequest.post(url, cookies, parameters);
		});
	}
	
	/**
	* Test case for {@link ClientHttpRequest#post(URL, Map, Map)} method.
	* Test case for <code>null</code> cookie name and <code>null</code> parameter name.
	*/
	@Test
	void testPost_10() throws IOException {
		URL url = new URL("http://www.google.com");
		Map cookies = new HashMap();
		cookies.put(null, "value");
		Map parameters = new HashMap();
		parameters.put(null, "value");
		
		assertThrows(NullPointerException.class, () -> {
			ClientHttpRequest.post(url, cookies, parameters);
		});
	}
	
	/**
	* Test case for {@link ClientHttpRequest#post(URL, Map, Map)} method.
	* Test case for <code>null</code> cookie value and <code>null</code> parameter value.
	*/
	@Test
	void testPost_11() throws IOException {
		URL url = new URL("http://www.google.com");
		Map cookies = new HashMap();
		cookies.put("name", null);
		Map parameters = new HashMap();
		parameters.put("name", null);
		
		assertThrows(NullPointerException.class, () -> {
			ClientHttpRequest.post(url, cookies, parameters);
		});
	}
}