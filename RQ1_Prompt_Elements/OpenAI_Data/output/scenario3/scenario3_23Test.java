// StrlenTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Strlen}.
* It contains ten unit test cases for the {@link Strlen#strlen(String)} method.
*/
class StrlenTest {

	@Test
	void testStrlenEmptyString() {
		assertEquals(0, Strlen.strlen(""));
	}
	
	@Test
	void testStrlenOneChar() {
		assertEquals(1, Strlen.strlen("x"));
	}
	
	@Test
	void testStrlenMultipleChars() {
		assertEquals(9, Strlen.strlen("asdasnakj"));
	}
	
	@Test
	void testStrlenEmptyStringWithQuotes() {
		assertEquals(0, Strlen.strlen(""));
	}
	
	@Test
	void testStrlenOneCharWithQuotes() {
		assertEquals(1, Strlen.strlen("x"));
	}
	
	@Test
	void testStrlenMultipleCharsWithQuotes() {
		assertEquals(9, Strlen.strlen("asdasnakj"));
	}
	
	@Test
	void testStrlenEmptyStringWithSingleQuotes() {
		assertEquals(0, Strlen.strlen(''));
	}
	
	@Test
	void testStrlenOneCharWithSingleQuotes() {
		assertEquals(1, Strlen.strlen('x'));
	}
	
	@Test
	void testStrlenMultipleCharsWithSingleQuotes() {
		assertEquals(9, Strlen.strlen('asdasnakj'));
	}
	
	@Test
	void testStrlenEmptyStringWithSingleQuotesAndQuotes() {
		assertEquals(0, Strlen.strlen(''));
	}
	
	@Test
	void testStrlenOneCharWithSingleQuotesAndQuotes() {
		assertEquals(1, Strlen.strlen('x'));
	}
	
	@Test
	void testStrlenMultipleCharsWithSingleQuotesAndQuotes() {
		assertEquals(9, Strlen.strlen('asdasnakj'));
	}
}