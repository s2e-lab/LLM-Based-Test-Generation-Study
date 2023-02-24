// IsPalindromeTest.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests of {@link IsPalindrome}.
 * It contains ten test cases for the {@link scenario1.IsPalindrome#isPalindrome()} method.
 */
class IsPalindromeTest {
		


    @Test
    void testIsPalindrome() {
        assertTrue(IsPalindrome.isPalindrome(""));
        assertTrue(IsPalindrome.isPalindrome("a"));
        assertTrue(IsPalindrome.isPalindrome("aa"));
        assertTrue(IsPalindrome.isPalindrome("aba"));
        assertTrue(IsPalindrome.isPalindrome("abba"));
        assertTrue(IsPalindrome.isPalindrome("abcba"));
        assertFalse(IsPalindrome.isPalindrome("ab"));
        assertFalse(IsPalindrome.isPalindrome("abc"));
        assertFalse(IsPalindrome.isPalindrome("abca"));
        assertFalse(IsPalindrome.isPalindrome("abcdba"));
    }
}