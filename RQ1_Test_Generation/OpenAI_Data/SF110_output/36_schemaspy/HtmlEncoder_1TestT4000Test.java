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
	* It tests the case when the input string is not empty and does not contain any special characters.
	*/
	@Test
	void testEncodeToken_3() {
		String str = "abc";
		String result = HtmlEncoder.encodeToken(str);
		assertEquals("abc", result);
	}
	
	/**
	* Test case for {@link HtmlEncoder#encodeToken(String)} method.
	* It tests the case when the input string is not empty and contains a special character.
	*/
	@Test
	void testEncodeToken_4() {
		String str = "<";
		String result = HtmlEncoder.encodeToken(str);
		assertEquals("&lt;", result);
	}
	
	/**
	* Test case for {@link HtmlEncoder#encodeToken(String)} method.
	* It tests the case when the input string is not empty and contains a special character.
	*/
	@Test
	void testEncodeToken_5() {
		String str = ">";
		String result = HtmlEncoder.encodeToken(str);
		assertEquals("&gt;", result);
	}
	
	/**
	* Test case for {@link HtmlEncoder#encodeToken(String)} method.
	* It tests the case when the input string is not empty and contains a special character.
	*/
	@Test
	void testEncodeToken_6() {
		String str = "\n";
		String result = HtmlEncoder.encodeToken(str);
		assertEquals("<br>" + System.getProperty("line.separator"), result);
	}
	
	/**
	* Test case for {@link HtmlEncoder#encodeToken(String)} method.
	* It tests the case when the input string is not empty and contains a special character.
	*/
	@Test
	void testEncodeToken_7() {
		String str = "\r";
		String result = HtmlEncoder.encodeToken(str);
		assertEquals("", result);
	}
	
	/**
	* Test case for {@link HtmlEncoder#encodeToken(String)} method.
	* It tests the case when the input string is not empty and contains a special character.
	*/
	@Test
	void testEncodeToken_8() {
		String str = "a<b";
		String result = HtmlEncoder.encodeToken(str);
		assertEquals("a<b", result);
	}
	
	/**
	* Test case for {@link HtmlEncoder#encodeToken(String)} method.
	* It tests the case when the input string is not empty and contains a special character.
	*/
	@Test
	void testEncodeToken_9() {
		String str = "a>b";
		String result = HtmlEncoder.encodeToken(str);
		assertEquals("a>b", result);
	}
	
	/**
	* Test case for {@link HtmlEncoder#encodeToken(String)} method.
	* It tests the case when the input string is not empty and contains a special character.
	*/
	@Test
	void testEncodeToken_10() {
		String str = "a\nb";
		String result = HtmlEncoder.encodeToken(str);
		assertEquals("a\nb", result);
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
* It contains ten unit test cases for the {@link HtmlEncoder#encodeString(String)} method.
*/
class HtmlEncoder_2Test {
		
	/**
	* Test case for {@link HtmlEncoder#encodeString(String)} method.
	* It tests the case when the input string is null.
	*/
	@Test
	void testEncodeString_1() {
		String str = null;
		String result = HtmlEncoder.encodeString(str);
		assertNull(result);
	}
	
	/**
	* Test case for {@link HtmlEncoder#encodeString(String)} method.
	* It tests the case when the input string is empty.
	*/
	@Test
	void testEncodeString_2() {
		String str = "";
		String result = HtmlEncoder.encodeString(str);
		assertEquals("", result);
	}
	
	/**
	* Test case for {@link HtmlEncoder#encodeString(String)} method.
	* It tests the case when the input string is not empty and does not contain any special characters.
	*/
	@Test
	void testEncodeString_3() {
		String str = "abc";
		String result = HtmlEncoder.encodeString(str);
		assertEquals("abc", result);
	}
	
	/**
	* Test case for {@link HtmlEncoder#encodeString(String)} method.
	* It tests the case when the input string is not empty and contains a special character.
	*/
	@Test
	void testEncodeString_4() {
		String str = "<";
		String result = HtmlEncoder.encodeString(str);
		assertEquals("&lt;", result);
	}
	
	/**
	* Test case for {@link HtmlEncoder#encodeString(String)} method.
	* It tests the case when the input string is not empty and contains a special character.
	*/
	@Test
	void testEncodeString_5() {
		String str = ">";
		String result = HtmlEncoder.encodeString(str);
		assertEquals("&gt;", result);
	}
	
	/**
	* Test case for {@link HtmlEncoder#encodeString(String)} method.
	* It tests the case when the input string is not empty and contains a special character.
	*/
	@Test
	void testEncodeString_6() {
		String str = "\n";
		String result = HtmlEncoder.encodeString(str);
		assertEquals("<br>" + System.getProperty("line.separator"), result);
	}
	
	/**
	* Test case for {@link HtmlEncoder#encodeString(String)} method.
	* It tests the case when the input string is not empty and contains a special character.
	*/
	@Test
	void testEncodeString_7() {
		String str = "\r";
		String result = HtmlEncoder.encodeString(str);
		assertEquals("", result);
	}
	
	/**
	* Test case for {@link HtmlEncoder#encodeString(String)} method.
	* It tests the case when the input string is not empty and contains a special character.
	*/
	@Test
	void testEncodeString_8() {
		String str = "a<b";
		String result = HtmlEncoder.encodeString(str);
		assertEquals("a&lt;b", result);
	}
	
	/**
	* Test case for {@link HtmlEncoder#encodeString(String)} method.
	* It tests the case when the input string is not empty and contains a special character.
	*/
	@Test
	void testEncodeString_9() {
		String str = "a>b";
		String result = HtmlEncoder.encodeString(str);
		assertEquals("a&gt;b", result);
	}
	
	/**
	* Test case for {@link HtmlEncoder#encodeString(String)} method.
	* It tests the case when the input string is not empty and contains a special character.
	*/
	@Test
	void testEncodeString_10() {
		String str = "a\nb";
		String result = HtmlEncoder.encodeString(str);
		assertEquals("a<br>" + System.getProperty("line.separator") + "b", result);
	}
	
}

// HtmlEncoder_3Test.java
package net.sourceforge.schemaspy.util;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HtmlEncoder}.
* It contains ten unit test cases for the {@link HtmlEncoder#encodeToken(char)} method.
*/
class HtmlEncoder_3Test {
		
	/**
	* Test case for {@link HtmlEncoder#encodeToken(char)} method.
	* It tests the case when the input character is a special character.
	*/
	@Test
	void testEncodeToken_1() {
		char ch = '<';
		String result = HtmlEncoder.encodeToken(ch);
		assertEquals("&lt;", result);
	}
	
	/**
	* Test case for {@link HtmlEncoder#encodeToken(char)} method.
	* It tests the case when the input character is a special character.
	*/
	@Test
	void testEncodeToken_2() {
		char ch = '>';
		String result = HtmlEncoder.encodeToken(ch);
		assertEquals("&gt;", result);
	}
	
	/**
	* Test case for {@link HtmlEncoder#encodeToken(char)} method.
	* It tests the case when the input character is a special character.
	*/
	@Test
	void testEncodeToken_3() {
		char ch = '\n';
		String result = HtmlEncoder.encodeToken(ch);
		assertEquals("<br>" + System.getProperty("line.separator"), result);
	}
	
	/**
	* Test case for {@link HtmlEncoder#encodeToken(char)} method.
	* It tests the case when the input character is a special character.
	*/
	@Test
	void testEncodeToken_4() {
		char ch = '\r';
		String result = HtmlEncoder.encodeToken(ch);
		assertEquals("", result);
	}
	
	/**
	* Test case for {@link HtmlEncoder#encodeToken(char)} method.
	* It tests the case when the input character is not a special character.
	*/
	@Test
	void testEncodeToken_5() {
		char ch = 'a';
		String result = HtmlEncoder.encodeToken(ch);
		assertEquals("a", result);
	}
	
	/**
	* Test case for {@link HtmlEncoder#encodeToken(char)} method.
	* It tests the case when the input character is not a special character.
	*/
	@Test
	void testEncodeToken_6() {
		char ch = 'b';
		String result = HtmlEncoder.encodeToken(ch);
		assertEquals("b", result);
	}
	
	/**
	* Test case for {@link HtmlEncoder#encodeToken(char)} method.
	* It tests the case when the input character is not a special character.
	*/
	@Test
	void testEncodeToken_7() {
		char ch = 'c';
		String result = HtmlEncoder.encodeToken(ch);
		assertEquals("c", result);
	}
	
	/**
	* Test case for {@link HtmlEncoder#encodeToken(char)} method.
	* It tests the case when the input character is not a special character.
	*/
	@Test
	void testEncodeToken_8() {
		char ch = 'd';
		String result = HtmlEncoder.encodeToken(ch);
		assertEquals("d", result);
	}
	
	/**
	* Test case for {@link HtmlEncoder#encodeToken(char)} method.
	* It tests the case when the input character is not a special character.
	*/
	@Test
	void testEncodeToken_9() {
		char ch = 'e';
		String result = HtmlEncoder.encodeToken(ch);
		assertEquals("e", result);
	}
	
	/**
	* Test case for {@link HtmlEncoder#encodeToken(char)} method.
	* It tests the case when the input character is not a special character.
	*/
	@Test
	void testEncodeToken_10() {
		char ch = 'f';
		String result = HtmlEncoder.encodeToken(ch);
		assertEquals("f", result);
	}
	
}

// HtmlEncoder_4Test.java
package net.sourceforge.schemaspy.util;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HtmlEncoder}.
* It contains ten unit test cases for the {@link HtmlEncoder#encodeString(String)} method.
*/
class HtmlEncoder_4Test {
		
	/**
	* Test case for {@link HtmlEncoder#encodeString(String)} method.
	* It tests the case when the input string is null.
	*/
	@Test
	void testEncodeString_1() {
		String str = null;
		String result = HtmlEncoder.encodeString(str);
		assertNull(result);
	}
	
	/**
	* Test case for {@link HtmlEncoder#encodeString(String)} method.
	* It tests the case when the input string is empty.
	*/
	@Test
	void testEncodeString_2() {
		String str = "";
		String result = HtmlEncoder.encodeString(str);
		assertEquals("", result);
	}
	
	/**
	* Test case for {@link HtmlEncoder#encodeString(String)} method.
	* It tests the case when the input string is not empty and does not contain any special characters.
	*/
	@Test
	void testEncodeString_3() {
		String str = "abc";
		String result = HtmlEncoder.encodeString(str);
		assertEquals("abc", result);
	}
	
	/**
	* Test case for {@link HtmlEncoder#encodeString(String)} method.
	* It tests the case when the input string is not empty and contains a special character.
	*/
	@Test
	void testEncodeString_4() {
		String str = "<";
		String result = HtmlEncoder.encodeString(str);
		assertEquals("&lt;", result);
	}
	
	/**
	* Test case for {@link HtmlEncoder#en