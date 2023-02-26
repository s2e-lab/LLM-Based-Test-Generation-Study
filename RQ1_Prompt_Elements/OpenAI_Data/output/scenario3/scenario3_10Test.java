// MakePalindromeTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MakePalindrome}.
* It contains ten unit test cases for the {@link MakePalindrome#makePalindrome(String)} method.
*/
class MakePalindromeTest {

	@Test
	void testMakePalindrome() {
		assertEquals("", MakePalindrome.makePalindrome(""));
		assertEquals("x", MakePalindrome.makePalindrome("x"));
		assertEquals("catac", MakePalindrome.makePalindrome("cat"));
		assertEquals("catac", MakePalindrome.makePalindrome("cata"));
		assertEquals("xyzyx", MakePalindrome.makePalindrome("xyz"));
		assertEquals("xyx", MakePalindrome.makePalindrome("xyx"));
		assertEquals("jerryrrej", MakePalindrome.makePalindrome("jerry"));
		assertEquals("jerryrrej", MakePalindrome.makePalindrome("jerryrrej"));
		assertEquals("jerryrrej", MakePalindrome.makePalindrome("jerryrrejjerryrrej"));
		assertEquals("jerryrrej", MakePalindrome.makePalindrome("jerryrrejjerryrrejjerryrrej"));
	}
}