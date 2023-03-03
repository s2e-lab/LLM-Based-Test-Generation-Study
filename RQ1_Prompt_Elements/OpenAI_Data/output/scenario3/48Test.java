// IsPalindromeTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsPalindrome}.
* It contains ten unit test cases for the {@link IsPalindrome#isPalindrome(String)} method.
*/
class IsPalindromeTest {

	@Test
	void testIsPalindrome_emptyString() {
		assertTrue(IsPalindrome.isPalindrome(""));
	}
	
	@Test
	void testIsPalindrome_aba() {
		assertTrue(IsPalindrome.isPalindrome("aba"));
	}
	
	@Test
	void testIsPalindrome_aaaaa() {
		assertTrue(IsPalindrome.isPalindrome("aaaaa"));
	}
	
	@Test
	void testIsPalindrome_zbcd() {
		assertFalse(IsPalindrome.isPalindrome("zbcd"));
	}
	
	@Test
	void testIsPalindrome_xywyx() {
		assertTrue(IsPalindrome.isPalindrome("xywyx"));
	}
	
	@Test
	void testIsPalindrome_xywyz() {
		assertFalse(IsPalindrome.isPalindrome("xywyz"));
	}
	
	@Test
	void testIsPalindrome_xywzx() {
		assertFalse(IsPalindrome.isPalindrome("xywzx"));
	}
	
	@Test
	void testIsPalindrome_xywzy() {
		assertFalse(IsPalindrome.isPalindrome("xywzy"));
	}
	
	@Test
	void testIsPalindrome_xywzz() {
		assertFalse(IsPalindrome.isPalindrome("xywzz"));
	}
	
	@Test
	void testIsPalindrome_xyx() {
		assertTrue(IsPalindrome.isPalindrome("xyx"));
	}
}