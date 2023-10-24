// IsPalindromeTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsPalindrome}.
* It contains ten unit test cases for the {@link IsPalindrome#isPalindrome(String)} method.
*/
class IsPalindromeTest {

    /**
     * * Test case for palindrome string
     */
    @Test
    void testIsPalindromePalindrome() {
        assertTrue(IsPalindrome.isPalindrome("racecar"));
    }

    /**
     * * Test case for non-palindrome string
     */
    @Test
    void testIsPalindromeNonPalindrome() {
        assertFalse(IsPalindrome.isPalindrome("racecar1"));
    }

    /**
     * * Test case for empty string
     */
    @Test
    void testIsPalindromeEmptyString() {
        assertTrue(IsPalindrome.isPalindrome(""));
    }

    /**
     * * Test case for string with one character
     */
    @Test
    void testIsPalindromeStringWithOneCharacter() {
        assertTrue(IsPalindrome.isPalindrome("a"));
    }

    /**
     * * Test case for string with two characters
     */
    @Test
    void testIsPalindromeStringWithTwoCharacters() {
        assertTrue(IsPalindrome.isPalindrome("aa"));
    }

    /**
     * * Test case for string with three characters
     */
    @Test
    void testIsPalindromeStringWithThreeCharacters() {
        assertTrue(IsPalindrome.isPalindrome("aaa"));
    }

    /**
     * * Test case for string with four characters
     */
    @Test
    void testIsPalindromeStringWithFourCharacters() {
        assertTrue(IsPalindrome.isPalindrome("aaaa"));
    }

    /**
     * * Test case for string with five characters
     */
    @Test
    void testIsPalindromeStringWithFiveCharacters() {
        assertTrue(IsPalindrome.isPalindrome("aaaaa"));
    }

    /**
     * * Test case for string with six characters
     */
    @Test
    void testIsPalindromeStringWithSixCharacters() {
        assertTrue(IsPalindrome.isPalindrome("aaaaaa"));
    }

    /**
     * * Test case for string with seven characters
     */
    @Test
    void testIsPalindromeStringWithSevenCharacters() {
        assertTrue(IsPalindrome.isPalindrome("aaaaaaa"));
    }

    /**
     * * Test case for string with eight characters
     */
    @Test
    void testIsPalindromeStringWithEightCharacters() {
        assertTrue(IsPalindrome.isPalindrome("aaaaaaaa"));
    }

    /**
     * * Test case for string with nine characters
     */
    @Test
    void testIsPalindromeStringWithNineCharacters() {
        assertTrue(IsPalindrome.isPalindrome("aaaaaaaaa"));
    }
}
