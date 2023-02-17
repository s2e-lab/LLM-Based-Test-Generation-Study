package Part3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
class MakePalindromeTest {
    @Test
    void testMakePalindrome() {
        assertEquals("", MakePalindrome.makePalindrome(""));
        assertEquals("x", MakePalindrome.makePalindrome("x"));
        assertEquals("xyzyx", MakePalindrome.makePalindrome("xyz"));
        assertEquals("xyx", MakePalindrome.makePalindrome("xyx"));
        assertEquals("jerryrrej", MakePalindrome.makePalindrome("jerry"));
        assertEquals("catac", MakePalindrome.makePalindrome("cat"));
        assertEquals("catac", MakePalindrome.makePalindrome("cata"));
        assertEquals("catac", MakePalindrome.makePalindrome("cata"));
        assertEquals("catac", MakePalindrome.makePalindrome("cata"));
        assertEquals("catac", MakePalindrome.makePalindrome("cata"));
    }
}