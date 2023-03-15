// ParamsUrlTools_1Test.java
package httpanalyzer;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ParamsUrlTools}.
* It contains ten unit test cases for the {@link ParamsUrlTools#splitUrl(String, JFrame)} method.
*/
class ParamsUrlTools_1Test {

	/**
	 * Test of splitUrl method, of class ParamsUrlTools.
	 * @throws java.net.URISyntaxException
	 */
	@Test
	void testSplitUrl_1() throws URISyntaxException {
		System.out.println("splitUrl");
		String startUrl = "http://www.google.com/search?q=httpclient&btnG=Search&aq=f&oq=";
		JFrame parentFrame = new JFrame();
		ParamsUrlTools instance = new ParamsUrlTools();
		String[] expResult = {"www.google.com", "-1", "/search", "http://www.google.com/search?q=httpclient&btnG=Search&aq=f&oq="};
		String[] result = instance.splitUrl(startUrl, parentFrame);
		assertArrayEquals(expResult, result);
	}
	
	/**
	 * Test of splitUrl method, of class ParamsUrlTools.
	 * @throws java.net.URISyntaxException
	 */
	@Test
	void testSplitUrl_2() throws URISyntaxException {
		System.out.println("splitUrl");
		String startUrl = "http://www.google.com/search?q=httpclient&btnG=Search&aq=f&oq=";
		JFrame parentFrame = new JFrame();
		ParamsUrlTools instance = new ParamsUrlTools();
		String[] expResult = {"www.google.com", "-1", "/search", "http://www.google.com/search?q=httpclient&btnG=Search&aq=f&oq="};
		String[] result = instance.splitUrl(startUrl, parentFrame);
		assertArrayEquals(expResult, result);
	}
	
	/**
	 * Test of splitUrl method, of class ParamsUrlTools.
	 * @throws java.net.URISyntaxException
	 */
	@Test
	void testSplitUrl_3() throws URISyntaxException {
		System.out.println("splitUrl");
		String startUrl = "http://www.google.com/search?q=httpclient&btnG=Search&aq=f&oq=";
		JFrame parentFrame = new JFrame();
		ParamsUrlTools instance = new ParamsUrlTools();
		String[] expResult = {"www.google.com", "-1", "/search", "http://www.google.com/search?q=httpclient&btnG=Search&aq=f&oq="};
		String[] result = instance.splitUrl(startUrl, parentFrame);
		assertArrayEquals(expResult, result);
	}
	
	/**
	 * Test of splitUrl method, of class ParamsUrlTools.
	 * @throws java.net.URISyntaxException
	 */
	@Test
	void testSplitUrl_4() throws URISyntaxException {
		System.out.println("splitUrl");
		String startUrl = "http://www.google.com/search?q=httpclient&btnG=Search&aq=f&oq=";
		JFrame parentFrame = new JFrame();
		ParamsUrlTools instance = new ParamsUrlTools();
		String[] expResult = {"www.google.com", "-1", "/search", "http://www.google.com/search?q=httpclient&btnG=Search&aq=f&oq="};
		String[] result = instance.splitUrl(startUrl, parentFrame);
		assertArrayEquals(expResult, result);
	}
	
	/**
	 * Test of splitUrl method, of class ParamsUrlTools.
	 * @throws java.net.URISyntaxException
	 */
	@Test
	void testSplitUrl_5() throws URISyntaxException {
		System.out.println("splitUrl");
		String startUrl = "http://www.google.com/search?q=httpclient&btnG=Search&aq=f&oq=";
		JFrame parentFrame = new JFrame();
		ParamsUrlTools instance = new ParamsUrlTools();
		String[] expResult = {"www.google.com", "-1", "/search", "http://www.google.com/search?q=httpclient&btnG=Search&aq=f&oq="};
		String[] result = instance.splitUrl(startUrl, parentFrame);
		assertArrayEquals(expResult, result);
	}
	
	/**
	 * Test of splitUrl method, of class ParamsUrlTools.
	 * @throws java.net.URISyntaxException
	 */
	@Test
	void testSplitUrl_6() throws URISyntaxException {
		System.out.println("splitUrl");
		String startUrl = "http://www.google.com/search?q=httpclient&btnG=Search&aq=f&oq=";
		JFrame parentFrame = new JFrame();
		ParamsUrlTools instance = new ParamsUrlTools();
		String[] expResult = {"www.google.com", "-1", "/search", "http://www.google.com/search?q=httpclient&btnG=Search&aq=f&oq="};
		String[] result = instance.splitUrl(startUrl, parentFrame);
		assertArrayEquals(expResult, result);
	}
	
	/**
	 * Test of splitUrl method, of class ParamsUrlTools.
	 * @throws java.net.URISyntaxException
	 */
	@Test
	void testSplitUrl_7() throws URISyntaxException {
		System.out.println("splitUrl");
		String startUrl = "http://www.google.com/search?q=httpclient&btnG=Search&aq=f&oq=";
		JFrame parentFrame = new JFrame();
		ParamsUrlTools instance = new ParamsUrlTools();
		String[] expResult = {"www.google.com", "-1", "/search", "http://www.google.com/search?q=httpclient&btnG=Search&aq=f&oq="};
		String[] result = instance.splitUrl(startUrl, parentFrame);
		assertArrayEquals(expResult, result);
	}
	
	/**
	 * Test of splitUrl method, of class ParamsUrlTools.
	 * @throws java.net.URISyntaxException
	 */
	@Test
	void testSplitUrl_8() throws URISyntaxException {
		System.out.println("splitUrl");
		String startUrl = "http://www.google.com/search?q=httpclient&btnG=Search&aq=f&oq=";
		JFrame parentFrame = new JFrame();
		ParamsUrlTools instance = new ParamsUrlTools();
		String[] expResult = {"www.google.com", "-1", "/search", "http://www.google.com/search?q=httpclient&btnG=Search&aq=f&oq="};
		String[] result = instance.splitUrl(startUrl, parentFrame);
		assertArrayEquals(expResult, result);
	}
	
	/**
	 * Test of splitUrl method, of class ParamsUrlTools.
	 * @throws java.net.URISyntaxException
	 */
	@Test
	void testSplitUrl_9() throws URISyntaxException {
		System.out.println("splitUrl");
		String startUrl = "http://www.google.com/search?q=httpclient&btnG=Search&aq=f&oq=";
		JFrame parentFrame = new JFrame();
		ParamsUrlTools instance = new ParamsUrlTools();
		String[] expResult = {"www.google.com", "-1", "/search", "http://www.google.com/search?q=httpclient&btnG=Search&aq=f&oq="};
		String[] result = instance.splitUrl(startUrl, parentFrame);
		assertArrayEquals(expResult, result);
	}
	
	/**
	 * Test of splitUrl method, of class ParamsUrlTools.
	 * @throws java.net.URISyntaxException
	 */
