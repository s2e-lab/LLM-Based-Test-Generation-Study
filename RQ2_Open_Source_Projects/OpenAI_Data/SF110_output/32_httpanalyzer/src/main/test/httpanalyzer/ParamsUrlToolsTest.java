// ParamsUrlToolsTest.java
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
class ParamsUrlToolsTest {

	/**
	 * Test of splitUrl method, of class ParamsUrlTools.
	 */
	@Test
	void testSplitUrl() {
		System.out.println("splitUrl");
		String startUrl = "http://www.google.com/search?q=httpclient&btnG=Google+Search&aq=f&oq=";
		JFrame parentFrame = new JFrame();
		ParamsUrlTools instance = new ParamsUrlTools();
		String[] expResult = {"www.google.com", "80", "/search", "http://www.google.com/search?q=httpclient&btnG=Google+Search&aq=f&oq="};
		String[] result = instance.splitUrl(startUrl, parentFrame);
		assertArrayEquals(expResult, result);
	}
	
	/**
	 * Test of splitUrl method, of class ParamsUrlTools.
	 */
	@Test
	void testSplitUrl2() {
		System.out.println("splitUrl");
		String startUrl = "http://www.google.com/search?q=httpclient&btnG=Google+Search&aq=f&oq=";
		JFrame parentFrame = new JFrame();
		ParamsUrlTools instance = new ParamsUrlTools();
		String[] expResult = {"www.google.com", "80", "/search", "http://www.google.com/search?q=httpclient&btnG=Google+Search&aq=f&oq="};
		String[] result = instance.splitUrl(startUrl, parentFrame);
		assertArrayEquals(expResult, result);
	}
	
	/**
	 * Test of splitUrl method, of class ParamsUrlTools.
	 */
	@Test
	void testSplitUrl3() {
		System.out.println("splitUrl");
		String startUrl = "http://www.google.com/search?q=httpclient&btnG=Google+Search&aq=f&oq=";
		JFrame parentFrame = new JFrame();
		ParamsUrlTools instance = new ParamsUrlTools();
		String[] expResult = {"www.google.com", "80", "/search", "http://www.google.com/search?q=httpclient&btnG=Google+Search&aq=f&oq="};
		String[] result = instance.splitUrl(startUrl, parentFrame);
		assertArrayEquals(expResult, result);
	}
	
	/**
	 * Test of splitUrl method, of class ParamsUrlTools.
	 */
	@Test
	void testSplitUrl4() {
		System.out.println("splitUrl");
		String startUrl = "http://www.google.com/search?q=httpclient&btnG=Google+Search&aq=f&oq=";
		JFrame parentFrame = new JFrame();
		ParamsUrlTools instance = new ParamsUrlTools();
		String[] expResult = {"www.google.com", "80", "/search", "http://www.google.com/search?q=httpclient&btnG=Google+Search&aq=f&oq="};
		String[] result = instance.splitUrl(startUrl, parentFrame);
		assertArrayEquals(expResult, result);
	}
	
	/**
	 * Test of splitUrl method, of class ParamsUrlTools.
	 */
	@Test
	void testSplitUrl5() {
		System.out.println("splitUrl");
		String startUrl = "http://www.google.com/search?q=httpclient&btnG=Google+Search&aq=f&oq=";
		JFrame parentFrame = new JFrame();
		ParamsUrlTools instance = new ParamsUrlTools();
		String[] expResult = {"www.google.com", "80", "/search", "http://www.google.com/search?q=httpclient&btnG=Google+Search&aq=f&oq="};
		String[] result = instance.splitUrl(startUrl, parentFrame);
		assertArrayEquals(expResult, result);
	}
	
	/**
	 * Test of splitUrl method, of class ParamsUrlTools.
	 */
	@Test
	void testSplitUrl6() {
		System.out.println("splitUrl");
		String startUrl = "http://www.google.com/search?q=httpclient&btnG=Google+Search&aq=f&oq=";
		JFrame parentFrame = new JFrame();
		ParamsUrlTools instance = new ParamsUrlTools();
		String[] expResult = {"www.google.com", "80", "/search", "http://www.google.com/search?q=httpclient&btnG=Google+Search&aq=f&oq="};
		String[] result = instance.splitUrl(startUrl, parentFrame);
		assertArrayEquals(expResult, result);
	}
	
	/**
	 * Test of splitUrl method, of class ParamsUrlTools.
	 */
	@Test
	void testSplitUrl7() {
		System.out.println("splitUrl");
		String startUrl = "http://www.google.com/search?q=httpclient&btnG=Google+Search&aq=f&oq=";
		JFrame parentFrame = new JFrame();
		ParamsUrlTools instance = new ParamsUrlTools();
		String[] expResult = {"www.google.com", "80", "/search", "http://www.google.com/search?q=httpclient&btnG=Google+Search&aq=f&oq="};
		String[] result = instance.splitUrl(startUrl, parentFrame);
		assertArrayEquals(expResult, result);
	}
	
	/**
	 * Test of splitUrl method, of class ParamsUrlTools.
	 */
	@Test
	void testSplitUrl8() {
		System.out.println("splitUrl");
		String startUrl = "http://www.google.com/search?q=httpclient&btnG=Google+Search&aq=f&oq=";
		JFrame parentFrame = new JFrame();
		ParamsUrlTools instance = new ParamsUrlTools();
		String[] expResult = {"www.google.com", "80", "/search", "http://www.google.com/search?q=httpclient&btnG=Google+Search&aq=f&oq="};
		String[] result = instance.splitUrl(startUrl, parentFrame);
		assertArrayEquals(expResult, result);
	}
	
	/**
	 * Test of splitUrl method, of class ParamsUrlTools.
	 */
	@Test
	void testSplitUrl9() {
		System.out.println("splitUrl");
		String startUrl = "http://www.google.com/search?q=httpclient&btnG=Google+Search&aq=f&oq=";
		JFrame parentFrame = new JFrame();
		ParamsUrlTools instance = new ParamsUrlTools();
		String[] expResult = {"www.google.com", "80", "/search", "http://www.google.com/search?q=httpclient&btnG=Google+Search&aq=f&oq="};
		String[] result = instance.splitUrl(startUrl, parentFrame);
		assertArrayEquals(expResult, result);
	}
	
	/**
	 * Test of splitUrl method, of class ParamsUrlTools.
	 */
	@Test
	void testSplitUrl10() {
		System.out.println("splitUrl");
		String startUrl = "http://www.google.com/search?q=httpclient&btnG=Google+Search&aq=f&oq=";
		JFrame parentFrame = new JFrame();
		ParamsUrlTools instance = new ParamsUrlTools();
		String[] expResult = {"www.google.com", "80", "/search", "http://www.google.com/search?q=httpclient&btnG=Google+Search&aq=f&oq="};
		String[] result = instance.splitUrl(startUrl, parentFrame);
		assertArrayEquals(expResult, result);
	}
}