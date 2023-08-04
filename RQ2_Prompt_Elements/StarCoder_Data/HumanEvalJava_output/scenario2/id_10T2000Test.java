// MakePalindromeTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MakePalindrome}.
* It contains ten unit test cases for the {@link MakePalindrome#makePalindrome(String)} method.
*/
class MakePalindromeTest {

    /**
     * Test case for the {@link MakePalindrome#makePalindrome(String)} method.
     * It checks if the method returns the correct palindrome for a string of length 1.
     */
    @Test
    void testMakePalindrome1() {
        assertEquals("a", MakePalindrome.makePalindrome("a"));
    }

    /**
     * Test case for the {@link MakePalindrome#makePalindrome(String)} method.
     * It checks if the method returns the correct palindrome for a string of length 2.
     */
    @Test
    void testMakePalindrome2() {
        assertEquals("aba", MakePalindrome.makePalindrome("ab"));
    }

    /**
     * Test case for the {@link MakePalindrome#makePalindrome(String)} method.
     * It checks if the method returns the correct palindrome for a string of length 3.
     */
    @Test
    void testMakePalindrome3() {
        assertEquals("abcba", MakePalindrome.makePalindrome("abc"));
    }

    /**
     * Test case for the {@link MakePalindrome#makePalindrome(String)} method.
     * It checks if the method returns the correct palindrome for a string of length 4.
     */
    @Test
    void testMakePalindrome4() {
        assertEquals("abccba", MakePalindrome.makePalindrome("abcc"));
    }

    /**
     * Test case for the {@link MakePalindrome#makePalindrome(String)} method.
     * It checks if the method returns the correct palindrome for a string of length 5.
     */
    @Test
    void testMakePalindrome5() {
        assertEquals("abcccba", MakePalindrome.makePalindrome("abccc"));
    }

    /**
     * Test case for the {@link MakePalindrome#makePalindrome(String)} method.
     * It checks if the method returns the correct palindrome for a string of length 6.
     */
    @Test
    void testMakePalindrome6() {
        assertEquals("abcccbba", MakePalindrome.makePalindrome("abcccb"));
    }

    /**
     * Test case for the {@link MakePalindrome#makePalindrome(String)} method.
     * It checks if the method returns the correct palindrome for a string of length 7.
     */
    @Test
    void testMakePalindrome7() {
        assertEquals("abcccbcba", MakePalindrome.makePalindrome("abcccbc"));
    }

    /**
     * Test case for the {@link MakePalindrome#makePalindrome(String)} method.
     * It checks if the method returns the correct palindrome for a string of length 8.
     */
    @Test
    void testMakePalindrome8() {
        assertEquals("abcccbccba", MakePalindrome.makePalindrome("abcccbcc"));
    }

    /**
     * Test case for the {@link MakePalindrome#makePalindrome(String)} method.
     * It checks if the method returns the correct palindrome for a string of length 9.
     */
    @Test
    void testMakePalindrome9() {
        assertEquals("abcccbcccba", MakePalindrome.makePalindrome("abcccbccc"));
    }

    /**
     * Test case for the {@link MakePalindrome#makePalindrome(String)} method.
     * It checks if the method returns the correct palindrome for a string of length 10.
     */
    @Test
    void testMakePalindrome10() {
        assertEquals("abcccbcccbba", MakePalindrome.makePalindrome("abcccbcccb"));
    }
}
