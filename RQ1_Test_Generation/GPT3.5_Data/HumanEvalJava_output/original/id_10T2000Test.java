// MakePalindromeTest.java
package original;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link MakePalindrome}.
 * It contains ten unit test cases for the {@link MakePalindrome#makePalindrome(String)} method.
 */
class MakePalindromeTest {

    @Test
    void testEmptyString() {
        assertEquals("", MakePalindrome.makePalindrome(""));
    }

    @Test
    void testSingleCharacterString() {
        assertEquals("x", MakePalindrome.makePalindrome("x"));
    }

    @Test
    void testTwoCharacterString() {
        assertEquals("xyx", MakePalindrome.makePalindrome("xy"));
    }

    @Test
    void testThreeCharacterString() {
        assertEquals("xyzyx", MakePalindrome.makePalindrome("xyz"));
    }

    @Test
    void testPalindromeString() {
        assertEquals("racecar", MakePalindrome.makePalindrome("racecar"));
    }

    @Test
    void testNonPalindromeString() {
        assertEquals("jerryrrej", MakePalindrome.makePalindrome("jerry"));
    }

    @Test
    void testPalindromeSubstring() {
        assertEquals("catac", MakePalindrome.makePalindrome("cata"));
    }

    @Test
    void testPalindromeSubstring2() {
        assertEquals("catac", MakePalindrome.makePalindrome("cat"));
    }

    @Test
    void testLongString() {
        String longString = "abcdefghijklmnopqrstuvwxyz";
        assertEquals("abcdefghijklmnopqrstuvwxyzzyxwvutsrqponmlkjihgfedcba", MakePalindrome.makePalindrome(longString));
    }

    @Test
    void testNullString() {
        assertNull(MakePalindrome.makePalindrome(null));
    }
}