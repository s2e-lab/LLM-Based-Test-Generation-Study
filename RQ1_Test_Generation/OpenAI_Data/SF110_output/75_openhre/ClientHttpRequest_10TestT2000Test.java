// ClientHttpRequest_10Test.java
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
* It contains ten unit test cases for the {@link ClientHttpRequest#post(URL, Object[])} method.
*/
class ClientHttpRequest_10Test {

	/**
	* Test case 1 for {@link ClientHttpRequest#post(URL, Object[])}.
	* It tests the case when the URL is null.
	*/
	@Test
	void testPost_1() throws IOException {
		URL url = null;
		Object[] parameters = null;
		try {
			ClientHttpRequest.post(url, parameters);
			fail("IllegalArgumentException should be thrown.");
		} catch (IllegalArgumentException e) {
			assertEquals("url is null.", e.getMessage());
		}
	}
	
	/**
	* Test case 2 for {@link ClientHttpRequest#post(URL, Object[])}.
	* It tests the case when the URL is not null, but the parameters are null.
	*/
	@Test
	void testPost_2() throws IOException {
		URL url = new URL("http://www.google.com");
		Object[] parameters = null;
		try {
			ClientHttpRequest.post(url, parameters);
			fail("IllegalArgumentException should be thrown.");
		} catch (IllegalArgumentException e) {
			assertEquals("parameters is null.", e.getMessage());
		}
	}
	
	/**
	* Test case 3 for {@link ClientHttpRequest#post(URL, Object[])}.
	* It tests the case when the URL is not null, but the parameters are empty.
	*/
	@Test
	void testPost_3() throws IOException {
		URL url = new URL("http://www.google.com");
		Object[] parameters = new Object[0];
		try {
			ClientHttpRequest.post(url, parameters);
			fail("IllegalArgumentException should be thrown.");
		} catch (IllegalArgumentException e) {
			assertEquals("parameters is empty.", e.getMessage());
		}
	}
	
	/**
	* Test case 4 for {@link ClientHttpRequest#post(URL, Object[])}.
	* It tests the case when the URL is not null, but the parameters are not empty, but the length of the parameters is odd.
	*/
	@Test
	void testPost_4() throws IOException {
		URL url = new URL("http://www.google.com");
		Object[] parameters = new Object[1];
		try {
			ClientHttpRequest.post(url, parameters);
			fail("IllegalArgumentException should be thrown.");
		} catch (IllegalArgumentException e) {
			assertEquals("parameters is not even.", e.getMessage());
		}
	}
	
	/**
	* Test case 5 for {@link ClientHttpRequest#post(URL, Object[])}.
	* It tests the case when the URL is not null, but the parameters are not empty, but the length of the parameters is even, but the first parameter is null.
	*/
	@Test
	void testPost_5() throws IOException {
		URL url = new URL("http://www.google.com");
		Object[] parameters = new Object[2];
		try {
			ClientHttpRequest.post(url, parameters);
			fail("IllegalArgumentException should be thrown.");
		} catch (IllegalArgumentException e) {
			assertEquals("parameters[0] is null.", e.getMessage());
		}
	}
	
	/**
	* Test case 6 for {@link ClientHttpRequest#post(URL, Object[])}.
	* It tests the case when the URL is not null, but the parameters are not empty, but the length of the parameters is even, but the first parameter is not null, but the second parameter is null.
	*/
	@Test
	void testPost_6() throws IOException {
		URL url = new URL("http://www.google.com");
		Object[] parameters = new Object[2];
		parameters[0] = "name";
		try {
			ClientHttpRequest.post(url, parameters);
			fail("IllegalArgumentException should be thrown.");
		} catch (IllegalArgumentException e) {
			assertEquals("parameters[1] is null.", e.getMessage());
		}
	}
	
	/**
	* Test case 7 for {@link ClientHttpRequest#post(URL, Object[])}.
	* It tests the case when the URL is not null, but the parameters are not empty, but the length of the parameters is even, but the first parameter is not null, but the second parameter is not null, but the third parameter is null.
	*/
	@Test
	void testPost_7() throws IOException {
		URL url = new URL("http://www.google.com");
		Object[] parameters = new Object[3];
		parameters[0] = "name";
		parameters[1] = "value";
		try {
			ClientHttpRequest.post(url, parameters);
			fail("IllegalArgumentException should be thrown.");
		} catch (IllegalArgumentException e) {
			assertEquals("parameters[2] is null.", e.getMessage());
		}
	}
	
	/**
	* Test case 8 for {@link ClientHttpRequest#post(URL, Object[])}.
	* It tests the case when the URL is not null, but the parameters are not empty, but the length of the parameters is even, but the first parameter is not null, but the second parameter is not null, but the third parameter is not null, but the fourth parameter is null.
	*/
	@Test
	void testPost_8() throws IOException {
		URL url = new URL("http://www.google.com");
		Object[] parameters = new Object[4];
		parameters[0] = "name";
		parameters[1] = "value";
		parameters[2] = "name";
		try {
			ClientHttpRequest.post(url, parameters);
			fail("IllegalArgumentException should be thrown.");
		} catch (IllegalArgumentException e) {
			assertEquals("parameters[3] is null.", e.getMessage());
		}
	}
	
	/**
	* Test case 9 for {@link ClientHttpRequest#post(URL, Object[])}.
	* It tests the case when the URL is not null, but the parameters are not empty, but the length of the parameters is even, but the first parameter is not null, but the second parameter is not null, but the third parameter is not null, but the fourth parameter is not null, but the fifth parameter is null.
	*/
	@Test
	void testPost_9() throws IOException {
		URL url = new URL("http://www.google.com");
		Object[] parameters = new Object[5];
		parameters[0] = "name";
		parameters[1] = "value";
		parameters[2] = "name";
		parameters[3] = "value";
		try {
			ClientHttpRequest.post(url, parameters);
			fail("IllegalArgumentException should be thrown.");
		} catch (IllegalArgumentException e) {
			assertEquals("parameters[4] is null.", e.getMessage());
		}
	}
	
	/**
	* Test case 10 for {@link ClientHttpRequest#post(URL, Object[])}.
	* It tests the case when the URL is not null, but the parameters are not empty, but the length of the parameters is even, but the first parameter is not null, but the second parameter is not null, but the third parameter is not null, but the fourth parameter is not null, but the fifth parameter is not null, but the sixth parameter is null.
	*/
	@Test
	void testPost_10() throws IOException {
		URL url = new URL("http://www.google.com");
		Object[] parameters = new Object[6];
		parameters[0] = "name";
		parameters[1] = "value";
		parameters[2] = "name";
		parameters