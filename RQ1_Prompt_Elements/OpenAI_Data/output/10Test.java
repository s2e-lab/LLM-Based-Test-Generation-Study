// MakePalindromeTest.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests of {@link MakePalindrome}.
 * It contains ten test cases for the {@link scenario1.MakePalindrome#makePalindrome()} method.
 */
class MakePalindromeTest {
		


    @Test
    void testMakePalindrome() {
        assertEquals("", MakePalindrome.makePalindrome(""));
        assertEquals("a", MakePalindrome.makePalindrome("a"));
        assertEquals("aa", MakePalindrome.makePalindrome("a"));
        assertEquals("aba", MakePalindrome.makePalindrome("a"));
        assertEquals("abba", MakePalindrome.makePalindrome("ab"));
        assertEquals("abcba", MakePalindrome.makePalindrome("abc"));
        assertEquals("abcdcba", MakePalindrome.makePalindrome("abcd"));
        assertEquals("abcddcba", MakePalindrome.makePalindrome("abcd"));
        assertEquals("abcdedcba", MakePalindrome.makePalindrome("abcde"));
        assertEquals("abcdefedcba", MakePalindrome.makePalindrome("abcdef"));
    }
}