// ParamsToolsTest.java
package httpanalyzer;

import java.util.ArrayList;
import java.util.List;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ParamsTools}.
* It contains ten unit test cases for the {@link ParamsTools#getPairParams(String)} method.
*/
class ParamsToolsTest {

	/**
	* Test case for {@link ParamsTools#getPairParams(String)} method.
	* Test data: "".
	* Expected result: empty list.
	*/
	@Test
	void testGetPairParams_1() {
		String params = "";
		List<NameValuePair> expResult = new ArrayList<NameValuePair>();
		List<NameValuePair> result = ParamsTools.getPairParams(params);
		assertEquals(expResult, result);
	}
	
	/**
	* Test case for {@link ParamsTools#getPairParams(String)} method.
	* Test data: "a=b".
	* Expected result: list with one element.
	*/
	@Test
	void testGetPairParams_2() {
		String params = "a=b";
		List<NameValuePair> expResult = new ArrayList<NameValuePair>();
		expResult.add(new BasicNameValuePair("a", "b"));
		List<NameValuePair> result = ParamsTools.getPairParams(params);
		assertEquals(expResult, result);
	}
	
	/**
	* Test case for {@link ParamsTools#getPairParams(String)} method.
	* Test data: "a=b&c=d".
	* Expected result: list with two elements.
	*/
	@Test
	void testGetPairParams_3() {
		String params = "a=b&c=d";
		List<NameValuePair> expResult = new ArrayList<NameValuePair>();
		expResult.add(new BasicNameValuePair("a", "b"));
		expResult.add(new BasicNameValuePair("c", "d"));
		List<NameValuePair> result = ParamsTools.getPairParams(params);
		assertEquals(expResult, result);
	}
	
	/**
	* Test case for {@link ParamsTools#getPairParams(String)} method.
	* Test data: "a=b&c=d&e=f".
	* Expected result: list with three elements.
	*/
	@Test
	void testGetPairParams_4() {
		String params = "a=b&c=d&e=f";
		List<NameValuePair> expResult = new ArrayList<NameValuePair>();
		expResult.add(new BasicNameValuePair("a", "b"));
		expResult.add(new BasicNameValuePair("c", "d"));
		expResult.add(new BasicNameValuePair("e", "f"));
		List<NameValuePair> result = ParamsTools.getPairParams(params);
		assertEquals(expResult, result);
	}
	
	/**
	* Test case for {@link ParamsTools#getPairParams(String)} method.
	* Test data: "a=b&c=d&e=f&g=h".
	* Expected result: list with four elements.
	*/
	@Test
	void testGetPairParams_5() {
		String params = "a=b&c=d&e=f&g=h";
		List<NameValuePair> expResult = new ArrayList<NameValuePair>();
		expResult.add(new BasicNameValuePair("a", "b"));
		expResult.add(new BasicNameValuePair("c", "d"));
		expResult.add(new BasicNameValuePair("e", "f"));
		expResult.add(new BasicNameValuePair("g", "h"));
		List<NameValuePair> result = ParamsTools.getPairParams(params);
		assertEquals(expResult, result);
	}
	
	/**
	* Test case for {@link ParamsTools#getPairParams(String)} method.
	* Test data: "a=b&c=d&e=f&g=h&i=j".
	* Expected result: list with five elements.
	*/
	@Test
	void testGetPairParams_6() {
		String params = "a=b&c=d&e=f&g=h&i=j";
		List<NameValuePair> expResult = new ArrayList<NameValuePair>();
		expResult.add(new BasicNameValuePair("a", "b"));
		expResult.add(new BasicNameValuePair("c", "d"));
		expResult.add(new BasicNameValuePair("e", "f"));
		expResult.add(new BasicNameValuePair("g", "h"));
		expResult.add(new BasicNameValuePair("i", "j"));
		List<NameValuePair> result = ParamsTools.getPairParams(params);
		assertEquals(expResult, result);
	}
	
	/**
	* Test case for {@link ParamsTools#getPairParams(String)} method.
	* Test data: "a=b&c=d&e=f&g=h&i=j&k=l".
	* Expected result: list with six elements.
	*/
	@Test
	void testGetPairParams_7() {
		String params = "a=b&c=d&e=f&g=h&i=j&k=l";
		List<NameValuePair> expResult = new ArrayList<NameValuePair>();
		expResult.add(new BasicNameValuePair("a", "b"));
		expResult.add(new BasicNameValuePair("c", "d"));
		expResult.add(new BasicNameValuePair("e", "f"));
		expResult.add(new BasicNameValuePair("g", "h"));
		expResult.add(new BasicNameValuePair("i", "j"));
		expResult.add(new BasicNameValuePair("k", "l"));
		List<NameValuePair> result = ParamsTools.getPairParams(params);
		assertEquals(expResult, result);
	}
	
	/**
	* Test case for {@link ParamsTools#getPairParams(String)} method.
	* Test data: "a=b&c=d&e=f&g=h&i=j&k=l&m=n".
	* Expected result: list with seven elements.
	*/
	@Test
	void testGetPairParams_8() {
		String params = "a=b&c=d&e=f&g=h&i=j&k=l&m=n";
		List<NameValuePair> expResult = new ArrayList<NameValuePair>();
		expResult.add(new BasicNameValuePair("a", "b"));
		expResult.add(new BasicNameValuePair("c", "d"));
		expResult.add(new BasicNameValuePair("e", "f"));
		expResult.add(new BasicNameValuePair("g", "h"));
		expResult.add(new BasicNameValuePair("i", "j"));
		expResult.add(new BasicNameValuePair("k", "l"));
		expResult.add(new BasicNameValuePair("m", "n"));
		List<NameValuePair> result = ParamsTools.getPairParams(params);
		assertEquals(expResult, result);
	}
	
	/**
	* Test case for {@link ParamsTools#getPairParams(String)} method.
	* Test data: "a=b&c=d&e=f&g=h&i=j&k=l&m=n&o=p".
	* Expected result: list with eight elements.
	*/
	@Test
	void testGetPairParams_9() {
		String params = "a=b&c=d&e=f&g=h&i=j&k=l&m=n&o=p";
		List<NameValuePair> expResult