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
	void testAbsoluteURL_1() {
		assertTrue(Utils.absoluteURL("http://www.example.com/"));
	}
	
	@Test
	void testAbsoluteURL_2() {
		assertTrue(Utils.absoluteURL("http://www.example.com/index.html"));
	}
	
	@Test
	void testAbsoluteURL_3() {
		assertTrue(Utils.absoluteURL("http://www.example.com/index.html#fragment"));
	}
	
	@Test
	void testAbsoluteURL_4() {
		assertTrue(Utils.absoluteURL("http://www.example.com/index.html?query"));
	}
	
	@Test
	void testAbsoluteURL_5() {
		assertTrue(Utils.absoluteURL("http://www.example.com/index.html?query#fragment"));
	}
	
	@Test
	void testAbsoluteURL_6() {
		assertTrue(Utils.absoluteURL("http://www.example.com/index.html?query#fragment?query"));
	}
	
	@Test
	void testAbsoluteURL_7() {
		assertTrue(Utils.absoluteURL("http://www.example.com/index.html?query#fragment?query#fragment"));
	}
	
	@Test
	void testAbsoluteURL_8() {
		assertTrue(Utils.absoluteURL("http://www.example.com/index.html?query#fragment?query#fragment?query"));
	}
	
	@Test
	void testAbsoluteURL_9() {
		assertTrue(Utils.absoluteURL("http://www.example.com/index.html?query#fragment?query#fragment?query#fragment"));
	}
	
	@Test
	void testAbsoluteURL_10() {
		assertTrue(Utils.absoluteURL("http://www.example.com/index.html?query#fragment?query#fragment?query#fragment?query"));
	}
}

// Utils_3Test.java
package nu.staldal.util;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Utils}.
* It contains ten unit test cases for the {@link Utils#pseudoAbsoluteURL(String)} method.
*/
class Utils_3Test {
		
	@Test
	void testPseudoAbsoluteURL_1() {
		assertTrue(Utils.pseudoAbsoluteURL("/"));
	}
	
	@Test
	void testPseudoAbsoluteURL_2() {
		assertTrue(Utils.pseudoAbsoluteURL("/index.html"));
	}
	
	@Test
	void testPseudoAbsoluteURL_3() {
		assertTrue(Utils.pseudoAbsoluteURL("/index.html#fragment"));
	}
	
	@Test
	void testPseudoAbsoluteURL_4() {
		assertTrue(Utils.pseudoAbsoluteURL("/index.html?query"));
	}
	
	@Test
	void testPseudoAbsoluteURL_5() {
		assertTrue(Utils.pseudoAbsoluteURL("/index.html?query#fragment"));
	}
	
	@Test
	void testPseudoAbsoluteURL_6() {
		assertTrue(Utils.pseudoAbsoluteURL("/index.html?query#fragment?query"));
	}
	
	@Test
	void testPseudoAbsoluteURL_7() {
		assertTrue(Utils.pseudoAbsoluteURL("/index.html?query#fragment?query#fragment"));
	}
	
	@Test
	void testPseudoAbsoluteURL_8() {
		assertTrue(Utils.pseudoAbsoluteURL("/index.html?query#fragment?query#fragment?query"));
	}
	
	@Test
	void testPseudoAbsoluteURL_9() {
		assertTrue(Utils.pseudoAbsoluteURL("/index.html?query#fragment?query#fragment?query#fragment"));
	}
	
	@Test
	void testPseudoAbsoluteURL_10() {
		assertTrue(Utils.pseudoAbsoluteURL("/index.html?query#fragment?query#fragment?query#fragment?query"));
	}
}

// Utils_4Test.java
package nu.staldal.util;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Utils}.
* It contains ten unit test cases for the {@link Utils#nChars(int, char)} method.
*/
class Utils_4Test {
		
	@Test
	void testNChars_1() {
		assertEquals("", Utils.nChars(0, 'a'));
	}
	
	@Test
	void testNChars_2() {
		assertEquals("a", Utils.nChars(1, 'a'));
	}
	
	@Test
	void testNChars_3() {
		assertEquals("aa", Utils.nChars(2, 'a'));
	}
	
	@Test
	void testNChars_4() {
		assertEquals("aaa", Utils.nChars(3, 'a'));
	}
	
	@Test
	void testNChars_5() {
		assertEquals("aaaa", Utils.nChars(4, 'a'));
	}
	
	@Test
	void testNChars_6() {
		assertEquals("aaaaa", Utils.nChars(5, 'a'));
	}
	
	@Test
	void testNChars_7() {
		assertEquals("aaaaaa", Utils.nChars(6, 'a'));
	}
	
	@Test
	void testNChars_8() {
		assertEquals("aaaaaaa", Utils.nChars(7, 'a'));
	}
	
	@Test
	void testNChars_9() {
		assertEquals("aaaaaaaa", Utils.nChars(8, 'a'));
	}
	
	@Test
	void testNChars_10() {
		assertEquals("aaaaaaaaa", Utils.nChars(9, 'a'));
	}
}

// Utils_5Test.java
package nu.staldal.util;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Utils}.
* It contains ten unit test cases for the {@link Utils#encodePath(String)} method.
*/
class Utils_5Test {
		
	@Test
	void testEncodePath_1() {
		assertEquals("", Utils.encodePath(""));
	}
	
	@Test
	void testEncodePath_2() {
		assertEquals("a", Utils.encodePath("a"));
	}
	
	@Test
	void testEncodePath_3() {
		assertEquals("aa", Utils.encodePath("aa"));
	}
	
	@Test
	void testEncodePath_4() {
		assertEquals("aaa", Utils.encodePath("aaa"));
	}
	
	@Test
	void testEncodePath_5() {
		assertEquals("aaaa", Utils.encodePath("aaaa"));
	}
	
	@Test
	void testEncodePath_6() {
		assertEquals("aaaaa", Utils.encodePath("aaaaa"));
	}
	
	@Test
	void testEncodePath_7() {
		assertEquals("aaaaaa", Utils.encodePath("aaaaaa"));
	}
	
	@Test
	void testEncodePath_8() {
		assertEquals("aaaaaaa", Utils.encodePath("aaaaaaa"));
	}
	
	@Test
	void testEncodePath_9() {
		assertEquals("aaaaaaaa", Utils.encodePath("aaaaaaaa"));
	}
	
	@Test
	void testEncodePath_10() {
		assertEquals("aaaaaaaaa", Utils.encodePath("aaaaaaaaa"));
	}
}

// Utils_6Test.java
package nu.staldal.util;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Utils}.
* It contains ten unit test cases for the {@link Utils#encodePathAsIdentifier(String)} method.
*/
class Utils_6Test {
		
	@Test
	void testEncodePathAsIdentifier_1() {
		assertEquals("", Utils.encodePathAsIdentifier(""));
	}
	
	@Test
	void testEncodePathAsIdentifier_2() {
		assertEquals("a", Utils.encodePathAsIdentifier("a"));
	}
	
	@Test
	void testEncodePathAsIdentifier_3() {
		assertEquals("aa", Utils.encodePathAsIdentifier("aa"));
	}
	
	@Test
	void testEncodePathAsIdentifier_4() {
		assertEquals("aaa", Utils.encodePathAsIdentifier("aaa"));
	}
	
	@Test
	void testEncodePathAsIdentifier_5() {
		assertEquals("aaaa", Utils.encodePathAsIdentifier("aaaa"));
	}
	
	@Test
	void testEncodePathAsIdentifier_6() {
		assertEquals("aaaaa", Utils.encodePathAsIdentifier("aaaaa"));
	}
	
	@Test
	void testEncodePathAsIdentifier_7() {
		assertEquals("aaaaaa", Utils.encodePathAsIdentifier("aaaaaa"));
	}
	
	@Test
	void testEncodePathAsIdentifier_8() {
		assertEquals("aaaaaaa", Utils.encodePathAsIdentifier("aaaaaaa"));
	}
	
	@Test
	void testEncodePathAsIdentifier_9() {
		assertEquals("aaaaaaaa", Utils.encodePathAsIdentifier("aaaaaaaa"));
	}
	
	@Test
	void testEncodePathAsIdentifier_10() {
		assertEquals("aaaaaaaaa", Utils.encodePathAsIdentifier("aaaaaaaaa"));
	}
}

// Utils_7Test.java
package nu.staldal.util;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Utils}.
* It contains ten unit test cases for the {@link Utils#encodePath(String)} method.
*/
class Utils_7Test {
		
	@Test
	void testEncodePath_1() {
		assertEquals("", Utils.encodePath(""));
	}
	
	@Test
	void testEncodePath_2() {
		assertEquals("a", Utils.encodePath("a"));
	}
	
	@Test
	void testEncodePath_3() {
		assertEquals("aa", Utils.encodePath("aa"));
	}
	
	@Test
	void testEncodePath_4() {
		assertEquals("aaa", Utils.encodePath("aaa"));
	}
	
	@Test
	void testEncodePath_5() {
		assertEquals("aaaa", Utils.encodePath("aaaa"));
	}
	
	@Test
	void testEncodePath_6() {
		assertEquals("aaaaa", Utils.encodePath("aaaaa"));
	}
	
	@Test
	void testEncodePath_7() {
		assertEquals("aaaaaa", Utils.encodePath("aaaaaa"));
	}
	
	@Test
	void testEncodePath_8() {
		assertEquals("aaaaaaa", Utils.encodePath("aaaaaaa"));
	}
	
	@Test
	void testEncodePath_9() {
		assertEquals("aaaaaaaa", Utils.encodePath("aaaaaaaa"));
	}
	
	@Test
	void testEncodePath_10() {
		assertEquals("aaaaaaaaa", Utils.encodePath("aaaaaaaaa"));
	}
}

// Utils_8Test.java
package nu.staldal.util;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Utils}.
* It contains ten unit test cases for the {@link Utils#encodePathAsIdentifier(String)} method.
*/
class Utils_8Test {
		
	@Test
	void testEncodePathAsIdentifier_1() {
		assertEquals("", Utils.encodePathAsIdentifier(""));
	}
	
	@Test
	void testEncodePathAsIdentifier_2() {
		assertEquals("a", Utils.encodePathAsIdentifier("a"));
	}
	
	@Test
	void testEncodePathAsIdentifier_3() {
		assertEquals("aa", Utils.encodePathAsIdentifier("aa"));
	}
	
	@Test
	void testEncodePathAsIdentifier_4() {
		assertEquals("aaa", Utils.encodePathAsIdentifier("aaa"));
	}
	
	@Test
	void testEncodePathAsIdentifier_5() {
		assertEquals("aaaa", Utils.encodePathAsIdentifier("aaaa"));
	}
	
	@Test
	void testEncodePathAsIdentifier_6() {
		assertEquals("aaaaa", Utils.encodePathAsIdentifier("aaaaa"));
	}
	
	@Test
	void testEncodePathAsIdentifier_7() {
		assertEquals("aaaaaa", Utils.encodePathAsIdentifier("aaaaaa"));
	}
	
	@Test
	void testEncodePathAsIdentifier_8() {
		assertEquals("aaaaaaa", Utils.encodePathAsIdentifier("aaaaaaa"));
	}
	
	@Test
	void testEncodePathAsIdentifier_9() {
		assertEquals("aaaaaaaa", Utils.encodePathAsIdentifier("aaaaaaaa"));
	}
	
	@Test
	void testEncodePathAsIdentifier_10() {
		assertEquals("aaaaaaaaa", Utils.encodePathAsIdentifier("aaaaaaaaa"));
	}
}

// Utils_9Test.java
package nu.staldal.util;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Utils}.
* It contains ten unit test cases for the {@link Utils#encodePath(String)} method.
*/
class Utils_9Test {
		
	@Test
	void testEncodePath_1() {
		assertEquals("", Utils.encodePath(""));
	}
	
	@Test
	void testEncodePath_2() {
		assertEquals("a", Utils.en