// IsPalindromeTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsPalindrome}.
* It contains ten unit test cases for the {@link IsPalindrome#isPalindrome(String)} method.
*/
class IsPalindromeTest {

    /**
     * Test case for the {@link IsPalindrome#isPalindrome(String)} method.
     * Checks if given string is a palindrome
     */
    @Test
    void testIsPalindrome() {
        assertTrue(IsPalindrome.isPalindrome(""));
        assertTrue(IsPalindrome.isPalindrome("aba"));
        assertTrue(IsPalindrome.isPalindrome("aaaaa"));
        assertFalse(IsPalindrome.isPalindrome("zbcd"));
        assertTrue(IsPalindrome.isPalindrome("xywyx"));
        assertFalse(IsPalindrome.isPalindrome("xywyz"));
        assertFalse(IsPalindrome.isPalindrome("xywzx"));
    }
}
