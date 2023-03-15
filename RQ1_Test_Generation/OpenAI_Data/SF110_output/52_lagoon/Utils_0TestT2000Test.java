// Utils_0Test.java
package nu.staldal.util;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Utils}.
* It contains ten unit test cases for the {@link Utils#encodePath(String)} method.
*/
class Utils_0Test {

	@Test
	void testEncodePath_0() {
		String path = "";
		String result = Utils.encodePath(path);
		assertEquals("", result);
	}
	
	@Test
	void testEncodePath_1() {
		String path = "a";
		String result = Utils.encodePath(path);
		assertEquals("a", result);
	}
	
	@Test
	void testEncodePath_2() {
		String path = "ab";
		String result = Utils.encodePath(path);
		assertEquals("ab", result);
	}
	
	@Test
	void testEncodePath_3() {
		String path = "abc";
		String result = Utils.encodePath(path);
		assertEquals("abc", result);
	}
	
	@Test
	void testEncodePath_4() {
		String path = "abcd";
		String result = Utils.encodePath(path);
		assertEquals("abcd", result);
	}
	
	@Test
	void testEncodePath_5() {
		String path = "abcde";
		String result = Utils.encodePath(path);
		assertEquals("abcde", result);
	}
	
	@Test
	void testEncodePath_6() {
		String path = "abcdef";
		String result = Utils.encodePath(path);
		assertEquals("abcdef", result);
	}
	
	@Test
	void testEncodePath_7() {
		String path = "abcdefg";
		String result = Utils.encodePath(path);
		assertEquals("abcdefg", result);
	}
	
	@Test
	void testEncodePath_8() {
		String path = "abcdefgh";
		String result = Utils.encodePath(path);
		assertEquals("abcdefgh", result);
	}
	
	@Test
	void testEncodePath_9() {
		String path = "abcdefghi";
		String result = Utils.encodePath(path);
		assertEquals("abcdefghi", result);
	}
	
}

// Utils_1Test.java
package nu.staldal.util;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Utils}.
* It contains ten unit test cases for the {@link Utils#encodePathAsIdentifier(String)} method.
*/
class Utils_1Test {
		
	@Test
	void testEncodePathAsIdentifier_0() {
		String path = "";
		String result = Utils.encodePathAsIdentifier(path);
		assertEquals("", result);
	}
	
	@Test
	void testEncodePathAsIdentifier_1() {
		String path = "a";
		String result = Utils.encodePathAsIdentifier(path);
		assertEquals("a", result);
	}
	
	@Test
	void testEncodePathAsIdentifier_2() {
		String path = "ab";
		String result = Utils.encodePathAsIdentifier(path);
		assertEquals("ab", result);
	}
	
	@Test
	void testEncodePathAsIdentifier_3() {
		String path = "abc";
		String result = Utils.encodePathAsIdentifier(path);
		assertEquals("abc", result);
	}
	
	@Test
	void testEncodePathAsIdentifier_4() {
		String path = "abcd";
		String result = Utils.encodePathAsIdentifier(path);
		assertEquals("abcd", result);
	}
	
	@Test
	void testEncodePathAsIdentifier_5() {
		String path = "abcde";
		String result = Utils.encodePathAsIdentifier(path);
		assertEquals("abcde", result);
	}
	
	@Test
	void testEncodePathAsIdentifier_6() {
		String path = "abcdef";
		String result = Utils.encodePathAsIdentifier(path);
		assertEquals("abcdef", result);
	}
	
	@Test
	void testEncodePathAsIdentifier_7() {
		String path = "abcdefg";
		String result = Utils.encodePathAsIdentifier(path);
		assertEquals("abcdefg", result);
	}
	
	@Test
	void testEncodePathAsIdentifier_8() {
		String path = "abcdefgh";
		String result = Utils.encodePathAsIdentifier(path);
		assertEquals("abcdefgh", result);
	}
	
	@Test
	void testEncodePathAsIdentifier_9() {
		String path = "abcdefghi";
		String result = Utils.encodePathAsIdentifier(path);
		assertEquals("abcdefghi", result);
	}
	
}

// Utils_2Test.java
package nu.staldal.util;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Utils}.
* It contains ten unit test cases for the {@link Utils#absoluteURL(String)} method.
*/
class Utils_2Test {
		
	@Test
	void testAbsoluteURL_0() {
		String url = "";
		boolean result = Utils.absoluteURL(url);
		assertEquals(false, result);
	}
	
	@Test
	void testAbsoluteURL_1() {
		String url = "a";
		boolean result = Utils.absoluteURL(url);
		assertEquals(false, result);
	}
	
	@Test
	void testAbsoluteURL_2() {
		String url = "ab";
		boolean result = Utils.absoluteURL(url);
		assertEquals(false, result);
	}
	
	@Test
	void testAbsoluteURL_3() {
		String url = "abc";
		boolean result = Utils.absoluteURL(url);
		assertEquals(false, result);
	}
	
	@Test
	void testAbsoluteURL_4() {
		String url = "abcd";
		boolean result = Utils.absoluteURL(url);
		assertEquals(false, result);
	}
	
	@Test
	void testAbsoluteURL_5() {
		String url = "abcde";
		boolean result = Utils.absoluteURL(url);
		assertEquals(false, result);
	}
	
	@Test
	void testAbsoluteURL_6() {
		String url = "abcdef";
		boolean result = Utils.absoluteURL(url);
		assertEquals(false, result);
	}
	
	@Test
	void testAbsoluteURL_7() {
		String url = "abcdefg";
		boolean result = Utils.absoluteURL(url);
		assertEquals(false, result);
	}
	
	@Test
	void testAbsoluteURL_8() {
		String url = "abcdefgh";
		boolean result = Utils.absoluteURL(url);
		assertEquals(false, result);
	}
	
	@Test
	void testAbsoluteURL_9() {
		String url = "abcdefghi";
		boolean result = Utils.absoluteURL(url);
		assertEquals(false, result);
	}
	
}

// Utils_3Test.java
package nu.staldal.util;


import org.junit.j