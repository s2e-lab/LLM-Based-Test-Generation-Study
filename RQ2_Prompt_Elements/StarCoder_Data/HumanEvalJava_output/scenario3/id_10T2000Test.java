// MakePalindromeTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MakePalindrome}.
* It contains ten unit test cases for the {@link MakePalindrome#makePalindrome(String)} method.
*/
class MakePalindromeTest {

    /**
     * Test case for the {@link MakePalindrome#makePalindrome(String)} method.
     * It tests the case when the supplied string is empty.
     */
    @Test
    void testMakePalindromeEmptyString() {
        assertEquals("", MakePalindrome.makePalindrome(""));
    }

    /**
     * Test case for the {@link MakePalindrome#makePalindrome(String)} method.
     * It tests the case when the supplied string is a palindrome.
     */
    @Test
    void testMakePalindromePalindrome() {
        assertEquals("catac", MakePalindrome.makePalindrome("cat"));
    }

    /**
     * Test case for the {@link MakePalindrome#makePalindrome(String)} method.
     * It tests the case when the supplied string is a palindrome.
     */
    @Test
    void testMakePalindromePalindrome2() {
        assertEquals("catac", MakePalindrome.makePalindrome("cata"));
    }

    /**
     * Test case for the {@link MakePalindrome#makePalindrome(String)} method.
     * It tests the case when the supplied string is a palindrome.
     */
    @Test
    void testMakePalindromePalindrome3() {
        assertEquals("x", MakePalindrome.makePalindrome("x"));
    }

    /**
     * Test case for the {@link MakePalindrome#makePalindrome(String)} method.
     * It tests the case when the supplied string is a palindrome.
     */
    @Test
    void testMakePalindromePalindrome4() {
        assertEquals("xyzyx", MakePalindrome.makePalindrome("xyz"));
    }

    /**
     * Test case for the {@link MakePalindrome#makePalindrome(String)} method.
     * It tests the case when the supplied string is a palindrome.
     */
    @Test
    void testMakePalindromePalindrome5() {
        assertEquals("xyx", MakePalindrome.makePalindrome("xyx"));
    }

    /**
     * Test case for the {@link MakePalindrome#makePalindrome(String)} method.
     * It tests the case when the supplied string is a palindrome.
     */
    @Test
    void testMakePalindromePalindrome6() {
        assertEquals("jerryrrej", MakePalindrome.makePalindrome("jerry"));
    }

    /**
     * Test case for the {@link MakePalindrome#makePalindrome(String)} method.
     * It tests the case when the supplied string is a palindrome.
     */
    @Test
    void testMakePalindromePalindrome7() {
        assertEquals("jerryrrej", MakePalindrome.makePalindrome("jerry"));
    }

    /**
     * Test case for the {@link MakePalindrome#makePalindrome(String)} method.
     * It tests the case when the supplied string is a palindrome.
     */
    @Test
    void testMakePalindromePalindrome8() {
        assertEquals("jerryrrej", MakePalindrome.makePalindrome("jerry"));
    }

    /**
     * Test case for the {@link MakePalindrome#makePalindrome(String)} method.
     * It tests the case when the supplied string is a palindrome.
     */
    @Test
    void testMakePalindromePalindrome9() {
        assertEquals("jerryrrej", MakePalindrome.makePalindrome("jerry"));
    }

    /**
     * Test case for the {@link MakePalindrome#makePalindrome(String)} method.
     * It tests the case when the supplied string is a palindrome.
     */
    @Test
    void testMakePalindromePalindrome10() {
        assertEquals("jerryrrej", MakePalindrome.makePalindrome("jerry"));
    }
}
