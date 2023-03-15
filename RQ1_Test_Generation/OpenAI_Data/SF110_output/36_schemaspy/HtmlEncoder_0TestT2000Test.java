// HtmlEncoder_0Test.java
package net.sourceforge.schemaspy.util;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HtmlEncoder}.
* It contains ten unit test cases for the {@link HtmlEncoder#encodeToken(char)} method.
*/
class HtmlEncoder_0Test {

	/**
	 * Test case for {@link HtmlEncoder#encodeToken(char)}
	 * <p>
	 * Test if the method returns the correct encoded string for the given character.
	 * </p>
	 */
	@Test
	void testEncodeToken_0() {
		char ch = '<';
		String result = HtmlEncoder.encodeToken(ch);
		assertEquals("&lt;", result);
	}
	
	/**
	 * Test case for {@link HtmlEncoder#encodeToken(char)}
	 * <p>
	 * Test if the method returns the correct encoded string for the given character.
	 * </p>
	 */
	@Test
	void testEncodeToken_1() {
		char ch = '>';
		String result = HtmlEncoder.encodeToken(ch);
		assertEquals("&gt;", result);
	}
	
	/**
	 * Test case for {@link HtmlEncoder#encodeToken(char)}
	 * <p>
	 * Test if the method returns the correct encoded string for the given character.
	 * </p>
	 */
	@Test
	void testEncodeToken_2() {
		char ch = '\n';
		String result = HtmlEncoder.encodeToken(ch);
		assertEquals("<br>" + System.getProperty("line.separator"), result);
	}
	
	/**
	 * Test case for {@link HtmlEncoder#encodeToken(char)}
	 * <p>
	 * Test if the method returns the correct encoded string for the given character.
	 * </p>
	 */
	@Test
	void testEncodeToken_3() {
		char ch = '\r';
		String result = HtmlEncoder.encodeToken(ch);
		assertEquals("", result);
	}
	
	/**
	 * Test case for {@link HtmlEncoder#encodeToken(char)}
	 * <p>
	 * Test if the method returns the correct encoded string for the given character.
	 * </p>
	 */
	@Test
	void testEncodeToken_4() {
		char ch = 'a';
		String result = HtmlEncoder.encodeToken(ch);
		assertEquals("a", result);
	}
	
	/**
	 * Test case for {@link HtmlEncoder#encodeToken(char)}
	 * <p>
	 * Test if the method returns the correct encoded string for the given character.
	 * </p>
	 */
	@Test
	void testEncodeToken_5() {
		char ch = 'b';
		String result = HtmlEncoder.encodeToken(ch);
		assertEquals("b", result);
	}
	
	/**
	 * Test case for {@link HtmlEncoder#encodeToken(char)}
	 * <p>
	 * Test if the method returns the correct encoded string for the given character.
	 * </p>
	 */
	@Test
	void testEncodeToken_6() {
		char ch = 'c';
		String result = HtmlEncoder.encodeToken(ch);
		assertEquals("c", result);
	}
	
	/**
	 * Test case for {@link HtmlEncoder#encodeToken(char)}
	 * <p>
	 * Test if the method returns the correct encoded string for the given character.
	 * </p>
	 */
	@Test
	void testEncodeToken_7() {
		char ch = 'd';
		String result = HtmlEncoder.encodeToken(ch);
		assertEquals("d", result);
	}
	
	/**
	 * Test case for {@link HtmlEncoder#encodeToken(char)}
	 * <p>
	 * Test if the method returns the correct encoded string for the given character.
	 * </p>
	 */
	@Test
	void testEncodeToken_8() {
		char ch = 'e';
		String result = HtmlEncoder.encodeToken(ch);
		assertEquals("e", result);
	}
	
	/**
	 * Test case for {@link HtmlEncoder#encodeToken(char)}
	 * <p>
	 * Test if the method returns the correct encoded string for the given character.
	 * </p>
	 */
	@Test
	void testEncodeToken_9() {
		char ch = 'f';
		String result = HtmlEncoder.encodeToken(ch);
		assertEquals("f", result);
	}
	
}

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
	 * Test case for {@link HtmlEncoder#encodeToken(String)}
	 * <p>
	 * Test if the method returns the correct encoded string for the given token.
	 * </p>
	 */
	@Test
	void testEncodeToken_0() {
		String str = "<";
		String result = HtmlEncoder.encodeToken(str);
		assertEquals("&lt;", result);
	}
	
	/**
	 * Test case for {@link HtmlEncoder#encodeToken(String)}
	 * <p>
	 * Test if the method returns the correct encoded string for the given token.
	 * </p>
	 */
	@Test
	void testEncodeToken_1() {
		String str = ">";
		String result = HtmlEncoder.encodeToken(str);
		assertEquals("&gt;", result);
	}
	
	/**
	 * Test case for {@link HtmlEncoder#encodeToken(String)}
	 * <p>
	 * Test if the method returns the correct encoded string for the given token.
	 * </p>
	 */
	@Test
	void testEncodeToken_2() {
		String str = "\n";
		String result = HtmlEncoder.encodeToken(str);
		assertEquals("<br>" + System.getProperty("line.separator"), result);
	}
	
	/**
	 * Test case for {@link HtmlEncoder#encodeToken(String)}
	 * <p>
	 * Test if the method returns the correct encoded string for the given token.
	 * </p>
	 */
	@Test
	void testEncodeToken_3() {
		String str = "\r";
		String result = HtmlEncoder.encodeToken(str);
		assertEquals("", result);
	}
	
	/**
	 * Test case for {@link HtmlEncoder#encodeToken(String)}
	 * <p>
	 * Test if the method returns the correct encoded string for the given token.
	 * </p>
	 */
	@Test
	void testEncodeToken_4() {
		String str = "a";
		String result = HtmlEncoder.encodeToken(str);
		assertEquals("a", result);
	}
	
	/**
	 * Test case for {@link HtmlEncoder#encodeToken(String)}
	 * <p>
	 * Test if the method returns the correct encoded string for the given token.
	 * </p>
	 */
	@Test
	void testEncodeToken_5() {
		String str = "b";
		String result = HtmlEncoder.encodeToken(str);
		assertEquals("b", result);
	}
	
	/**
	 * Test case for {@link HtmlEncoder#encodeToken(String)}
	 * <p>
	 * Test if the method returns the correct encoded string for