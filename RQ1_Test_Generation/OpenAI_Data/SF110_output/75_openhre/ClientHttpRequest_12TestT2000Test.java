// ClientHttpRequest_12Test.java
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
* It contains ten unit test cases for the {@link ClientHttpRequest#post(URL, String[], Object[])} method.
*/
class ClientHttpRequest_12Test {

	/**
	* Test case 1 for method post(URL, String[], Object[])
	*
	* @throws IOException
	*/
	@Test
	void testPost1() throws IOException {
		URL url = new URL("http://www.google.com");
		String[] cookies = new String[]{"name1", "value1", "name2", "value2"};
		Object[] parameters = new Object[]{"name1", "value1", "name2", "value2"};
		InputStream result = ClientHttpRequest.post(url, cookies, parameters);
		assertNotNull(result);
	}
	
	/**
	* Test case 2 for method post(URL, String[], Object[])
	*
	* @throws IOException
	*/
	@Test
	void testPost2() throws IOException {
		URL url = new URL("http://www.google.com");
		String[] cookies = new String[]{"name1", "value1", "name2", "value2"};
		Object[] parameters = new Object[]{"name1", "value1", "name2", "value2"};
		InputStream result = ClientHttpRequest.post(url, cookies, parameters);
		assertNotNull(result);
	}
	
	/**
	* Test case 3 for method post(URL, String[], Object[])
	*
	* @throws IOException
	*/
	@Test
	void testPost3() throws IOException {
		URL url = new URL("http://www.google.com");
		String[] cookies = new String[]{"name1", "value1", "name2", "value2"};
		Object[] parameters = new Object[]{"name1", "value1", "name2", "value2"};
		InputStream result = ClientHttpRequest.post(url, cookies, parameters);
		assertNotNull(result);
	}
	
	/**
	* Test case 4 for method post(URL, String[], Object[])
	*
	* @throws IOException
	*/
	@Test
	void testPost4() throws IOException {
		URL url = new URL("http://www.google.com");
		String[] cookies = new String[]{"name1", "value1", "name2", "value2"};
		Object[] parameters = new Object[]{"name1", "value1", "name2", "value2"};
		InputStream result = ClientHttpRequest.post(url, cookies, parameters);
		assertNotNull(result);
	}
	
	/**
	* Test case 5 for method post(URL, String[], Object[])
	*
	* @throws IOException
	*/
	@Test
	void testPost5() throws IOException {
		URL url = new URL("http://www.google.com");
		String[] cookies = new String[]{"name1", "value1", "name2", "value2"};
		Object[] parameters = new Object[]{"name1", "value1", "name2", "value2"};
		InputStream result = ClientHttpRequest.post(url, cookies, parameters);
		assertNotNull(result);
	}
	
	/**
	* Test case 6 for method post(URL, String[], Object[])
	*
	* @throws IOException
	*/
	@Test
	void testPost6() throws IOException {
		URL url = new URL("http://www.google.com");
		String[] cookies = new String[]{"name1", "value1", "name2", "value2"};
		Object[] parameters = new Object[]{"name1", "value1", "name2", "value2"};
		InputStream result = ClientHttpRequest.post(url, cookies, parameters);
		assertNotNull(result);
	}
	
	/**
	* Test case 7 for method post(URL, String[], Object[])
	*
	* @throws IOException
	*/
	@Test
	void testPost7() throws IOException {
		URL url = new URL("http://www.google.com");
		String[] cookies = new String[]{"name1", "value1", "name2", "value2"};
		Object[] parameters = new Object[]{"name1", "value1", "name2", "value2"};
		InputStream result = ClientHttpRequest.post(url, cookies, parameters);
		assertNotNull(result);
	}
	
	/**
	* Test case 8 for method post(URL, String[], Object[])
	*
	* @throws IOException
	*/
	@Test
	void testPost8() throws IOException {
		URL url = new URL("http://www.google.com");
		String[] cookies = new String[]{"name1", "value1", "name2", "value2"};
		Object[] parameters = new Object[]{"name1", "value1", "name2", "value2"};
		InputStream result = ClientHttpRequest.post(url, cookies, parameters);
		assertNotNull(result);
	}
	
	/**
	* Test case 9 for method post(URL, String[], Object[])
	*
	* @throws IOException
	*/
	@Test
	void testPost9() throws IOException {
		URL url = new URL("http://www.google.com");
		String[] cookies = new String[]{"name1", "value1", "name2", "value2"};
		Object[] parameters = new Object[]{"name1", "value1", "name2", "value2"};
		InputStream result = ClientHttpRequest.post(url, cookies, parameters);
		assertNotNull(result);
	}
	
	/**
	* Test case 10 for method post(URL, String[], Object[])
	*
	* @throws IOException
	*/
	@Test
	void testPost10() throws IOException {
		URL url = new URL("http://www.google.com");
		String[] cookies = new String[]{"name1", "value1", "name2", "value2"};
		Object[] parameters = new Object[]{"name1", "value1", "name2", "value2"};
		InputStream result = ClientHttpRequest.post(url, cookies, parameters);
		assertNotNull(result);
	}
}