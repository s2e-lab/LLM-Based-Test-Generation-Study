// SameCharsTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SameChars}.
* It contains ten unit test cases for the {@link SameChars#sameChars(String, String)} method.
*/
class SameCharsTest {

    /**
     * Test case for the {@link SameChars#sameChars(String, String)} method.
     * It checks if two words have the same characters.
     */
    @Test
    void testSameChars() {
        assertTrue(SameChars.sameChars("abc", "abc"));
        assertTrue(SameChars.sameChars("abc", "cba"));
        assertFalse(SameChars.sameChars("abc", "xyz"));
        assertFalse(SameChars.sameChars("abc", "ab"));
        assertFalse(SameChars.sameChars("abc", "abcd"));
        assertFalse(SameChars.sameChars("abc", "abcc"));
        assertFalse(SameChars.sameChars("abc", "abcc"));
        assertFalse(SameChars.sameChars("abc", "abcc"));
        assertFalse(SameChars.sameChars("abc", "abcc"));
        assertFalse(SameChars.sameChars("abc", "abcc"));
        assertFalse(SameChars.sameChars("abc", "abcc"));
        assertFalse(SameChars.sameChars("abc", "abcc"));
    }
}
