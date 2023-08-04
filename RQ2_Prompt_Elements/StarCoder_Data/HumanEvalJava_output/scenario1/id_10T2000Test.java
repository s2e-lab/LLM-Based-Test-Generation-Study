// MakePalindromeTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MakePalindrome}.
* It contains ten unit test cases for the {@link MakePalindrome#makePalindrome(String)} method.
*/
class MakePalindromeTest {

    @Test
    void testMakePalindrome() {
        assertEquals("abccba", MakePalindrome.makePalindrome("abccba"));
        assertEquals("abccba", MakePalindrome.makePalindrome("abccba"));
        assertEquals("abccba", MakePalindrome.makePalindrome("abccba"));
        assertEquals("abccba", MakePalindrome.makePalindrome("abccba"));
        assertEquals("abccba", MakePalindrome.makePalindrome("abccba"));
        assertEquals("abccba", MakePalindrome.makePalindrome("abccba"));
        assertEquals("abccba", MakePalindrome.makePalindrome("abccba"));
        assertEquals("abccba", MakePalindrome.makePalindrome("abccba"));
        assertEquals("abccba", MakePalindrome.makePalindrome("abccba"));
        assertEquals("abccba", MakePalindrome.makePalindrome("abccba"));
        assertEquals("abccba", MakePalindrome.makePalindrome("abccba"));
    }
}
