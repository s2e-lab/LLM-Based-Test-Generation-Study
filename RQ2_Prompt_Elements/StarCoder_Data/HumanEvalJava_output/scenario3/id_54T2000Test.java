// SameCharsTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SameChars}.
* It contains ten unit test cases for the {@link SameChars#sameChars(String, String)} method.
*/
class SameCharsTest {

    /**
     * Test case for {@link SameChars#sameChars(String, String)}
     * when the first word has the same characters as the second word.
     */
    @Test
    void testSameChars1() {
        String s0 = "abcd";
        String s1 = "dddddddabce";
        Boolean expected = false;
        assertEquals(expected, SameChars.sameChars(s0, s1));
    }

    /**
     * Test case for {@link SameChars#sameChars(String, String)}
     * when the first word has the same characters as the second word.
     */
    @Test
    void testSameChars2() {
        String s0 = "eabcdzzzz";
        String s1 = "dddzzzzzzzddeddabc";
        Boolean expected = true;
        assertEquals(expected, SameChars.sameChars(s0, s1));
    }

    /**
     * Test case for {@link SameChars#sameChars(String, String)}
     * when the first word has the same characters as the second word.
     */
    @Test
    void testSameChars3() {
        String s0 = "abcd";
        String s1 = "dddddddabc";
        Boolean expected = true;
        assertEquals(expected, SameChars.sameChars(s0, s1));
    }

    /**
     * Test case for {@link SameChars#sameChars(String, String)}
     * when the first word has the same characters as the second word.
     */
    @Test
    void testSameChars4() {
        String s0 = "dddddddabc";
        String s1 = "abcd";
        Boolean expected = true;
        assertEquals(expected, SameChars.sameChars(s0, s1));
    }

    /**
     * Test case for {@link SameChars#sameChars(String, String)}
     * when the first word has the same characters as the second word.
     */
    @Test
    void testSameChars5() {
        String s0 = "eabcd";
        String s1 = "dddddddabc";
        Boolean expected = false;
        assertEquals(expected, SameChars.sameChars(s0, s1));
    }

    /**
     * Test case for {@link SameChars#sameChars(String, String)}
     * when the first word has the same characters as the second word.
     */
    @Test
    void testSameChars6() {
        String s0 = "abcd";
        String s1 = "dddddddabcf";
        Boolean expected = false;
        assertEquals(expected, SameChars.sameChars(s0, s1));
    }

    /**
     * Test case for {@link SameChars#sameChars(String, String)}
     * when the first word has the same characters as the second word.
     */
    @Test
    void testSameChars7() {
        String s0 = "eabcdzzzz";
        String s1 = "dddzzzzzzzddddabc";
        Boolean expected = false;
        assertEquals(expected, SameChars.sameChars(s0, s1));
    }

    /**
     * Test case for {@link SameChars#sameChars(String, String)}
     * when the first word has the same characters as the second word.
     */
    @Test
    void testSameChars8() {
        String s0 = "aabb";
        String s1 = "aaccc";
        Boolean expected = false;
        assertEquals(expected, SameChars.sameChars(s0, s1));
    }
}
