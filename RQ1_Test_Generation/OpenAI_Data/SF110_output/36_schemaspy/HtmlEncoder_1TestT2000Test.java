// HtmlEncoder_1Test.java
package net.sourceforge.schemaspy.util;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HtmlEncoder}.
* It contains ten unit test cases for the {@link HtmlEncoder#encodeToken(String)} method.
*/
class HtmlEncoder_1Test {

	/**
	* Test case for {@link HtmlEncoder#encodeToken(String)} method.
	* It tests the case when the input string is null.
	*/
	@Test
	void testEncodeToken_1() {
		String str = null;
		String result = HtmlEncoder.encodeToken(str);
		assertNull(result);
	}
	
	/**
	* Test case for {@link HtmlEncoder#encodeToken(String)} method.
	* It tests the case when the input string is empty.
	*/
	@Test
	void testEncodeToken_2() {
		String str = "";
		String result = HtmlEncoder.encodeToken(str);
		assertEquals("", result);
	}
	
	/**
	* Test case for {@link HtmlEncoder#encodeToken(String)} method.
	* It tests the case when the input string is a single character.
	*/
	@Test
	void testEncodeToken_3() {
		String str = "a";
		String result = HtmlEncoder.encodeToken(str);
		assertEquals("a", result);
	}
	
	/**
	* Test case for {@link HtmlEncoder#encodeToken(String)} method.
	* It tests the case when the input string is a single character.
	*/
	@Test
	void testEncodeToken_4() {
		String str = "A";
		String result = HtmlEncoder.encodeToken(str);
		assertEquals("A", result);
	}
	
	/**
	* Test case for {@link HtmlEncoder#encodeToken(String)} method.
	* It tests the case when the input string is a single character.
	*/
	@Test
	void testEncodeToken_5() {
		String str = "1";
		String result = HtmlEncoder.encodeToken(str);
		assertEquals("1", result);
	}
	
	/**
	* Test case for {@link HtmlEncoder#encodeToken(String)} method.
	* It tests the case when the input string is a single character.
	*/
	@Test
	void testEncodeToken_6() {
		String str = "!";
		String result = HtmlEncoder.encodeToken(str);
		assertEquals("!", result);
	}
	
	/**
	* Test case for {@link HtmlEncoder#encodeToken(String)} method.
	* It tests the case when the input string is a single character.
	*/
	@Test
	void testEncodeToken_7() {
		String str = "&";
		String result = HtmlEncoder.encodeToken(str);
		assertEquals("&", result);
	}
	
	/**
	* Test case for {@link HtmlEncoder#encodeToken(String)} method.
	* It tests the case when the input string is a single character.
	*/
	@Test
	void testEncodeToken_8() {
		String str = " ";
		String result = HtmlEncoder.encodeToken(str);
		assertEquals(" ", result);
	}
	
	/**
	* Test case for {@link HtmlEncoder#encodeToken(String)} method.
	* It tests the case when the input string is a single character.
	*/
	@Test
	void testEncodeToken_9() {
		String str = ".";
		String result = HtmlEncoder.encodeToken(str);
		assertEquals(".", result);
	}
	
	/**
	* Test case for {@link HtmlEncoder#encodeToken(String)} method.
	* It tests the case when the input string is a single character.
	*/
	@Test
	void testEncodeToken_10() {
		String str = ",";
		String result = HtmlEncoder.encodeToken(str);
		assertEquals(",", result);
	}
	
}

// HtmlEncoder_2Test.java
package net.sourceforge.schemaspy.util;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HtmlEncoder}.
* It contains ten unit test cases for the {@link HtmlEncoder#encodeToken(String)} method.
*/
class HtmlEncoder_2Test {
		
	/**
	* Test case for {@link HtmlEncoder#encodeToken(String)} method.
	* It tests the case when the input string is a single character.
	*/
	@Test
	void testEncodeToken_1() {
		String str = "<";
		String result = HtmlEncoder.encodeToken(str);
		assertEquals("&lt;", result);
	}
	
	/**
	* Test case for {@link HtmlEncoder#encodeToken(String)} method.
	* It tests the case when the input string is a single character.
	*/
	@Test
	void testEncodeToken_2() {
		String str = ">";
		String result = HtmlEncoder.encodeToken(str);
		assertEquals("&gt;", result);
	}
	
	/**
	* Test case for {@link HtmlEncoder#encodeToken(String)} method.
	* It tests the case when the input string is a single character.
	*/
	@Test
	void testEncodeToken_3() {
		String str = "\n";
		String result = HtmlEncoder.encodeToken(str);
		assertEquals("<br>" + System.getProperty("line.separator"), result);
	}
	
	/**
	* Test case for {@link HtmlEncoder#encodeToken(String)} method.
	* It tests the case when the input string is a single character.
	*/
	@Test
	void testEncodeToken_4() {
		String str = "\r";
		String result = HtmlEncoder.encodeToken(str);
		assertEquals("", result);
	}
	
	/**
	* Test case for {@link HtmlEncoder#encodeToken(String)} method.
	* It tests the case when the input string is a single character.
	*/
	@Test
	void testEncodeToken_5() {
		String str = "a<";
		String result = HtmlEncoder.encodeToken(str);
		assertEquals("a<", result);
	}
	
	/**
	* Test case for {@link HtmlEncoder#encodeToken(String)} method.
	* It tests the case when the input string is a single character.
	*/
	@Test
	void testEncodeToken_6() {
		String str = "a>";
		String result = HtmlEncoder.encodeToken(str);
		assertEquals("a>", result);
	}
	
	/**
	* Test case for {@link HtmlEncoder#encodeToken(String)} method.
	* It tests the case when the input string is a single character.
	*/
	@Test
	void testEncodeToken_7() {
		String str = "a\n";
		String result = HtmlEncoder.encodeToken(str);
		assertEquals("a<br>" + System.getProperty("line.separator"), result);
	}
	
	/**
	* Test case for {@link HtmlEncoder#encodeToken(String)} method.
	* It tests the case when the input string is a single character.
	*/
	@Test
	void testEncodeToken_8() {
		String str = "a\r";
		String result = HtmlEncoder.encodeToken(str);
		assertEquals("a", result);
	}
	
	/**
	* Test case for {@link HtmlEncoder#encodeToken(String)} method.