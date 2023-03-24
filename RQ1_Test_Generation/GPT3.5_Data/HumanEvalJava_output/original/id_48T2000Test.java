// Here's the corrected code for IsPalindromeTest.java

package original;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link IsPalindrome}.
 * It contains ten unit test cases for the {@link IsPalindrome#isPalindrome(String)} method.
 */
class IsPalindromeTest {

    @Test
    void testEmptyString() {
        assertTrue(IsPalindrome.isPalindrome(""));
    }

    @Test
    void testSingleCharacterString() {
        assertTrue(IsPalindrome.isPalindrome("a"));
    }

    @Test
    void testPalindromeString() {
        assertTrue(IsPalindrome.isPalindrome("aba"));
    }

    @Test
    void testLongerPalindromeString() {
        assertTrue(IsPalindrome.isPalindrome("racecar"));
    }

    @Test
    void testNonPalindromeString() {
        assertFalse(IsPalindrome.isPalindrome("hello"));
    }

    @Test
    void testNonPalindromeStringWithPalindromePrefix() {
        assertFalse(IsPalindrome.isPalindrome("abccbaa"));
    }

    @Test
    void testNonPalindromeStringWithPalindromeSuffix() {
        assertFalse(IsPalindrome.isPalindrome("aabbcca"));
    }

    @Test
    void testNonPalindromeStringWithPalindromeSubstring() {
        assertFalse(IsPalindrome.isPalindrome("abccbab"));
    }

    @Test
    void testStringWithSpaces() {
        assertTrue(IsPalindrome.isPalindrome("a man a plan a canal panama"));
    }

    @Test
    void testStringWithPunctuation() {
        assertTrue(IsPalindrome.isPalindrome("a man, a plan, a canal: Panama!"));
    }
}