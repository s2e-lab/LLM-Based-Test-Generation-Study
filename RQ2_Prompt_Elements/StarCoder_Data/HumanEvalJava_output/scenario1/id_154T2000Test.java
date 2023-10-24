// CycpatternCheckTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CycpatternCheck}.
* It contains ten unit test cases for the {@link CycpatternCheck#cycpatternCheck(String, String)} method.
*/
class CycpatternCheckTest {

    /**
    * Test case for the {@link CycpatternCheck#cycpatternCheck(String, String)} method.
    * It checks if the method returns true if the input string is a cyclic pattern.
    */
    @Test
    void testCycpatternCheck1() {
        String a = "abcabcabcabc";
        String b = "abc";
        assertTrue(CycpatternCheck.cycpatternCheck(a, b));
    }

    /**
    * Test case for the {@link CycpatternCheck#cycpatternCheck(String, String)} method.
    * It checks if the method returns true if the input string is a cyclic pattern.
    */
    @Test
    void testCycpatternCheck2() {
        String a = "abcabcabcabc";
        String b = "abcabc";
        assertTrue(CycpatternCheck.cycpatternCheck(a, b));
    }

    /**
    * Test case for the {@link CycpatternCheck#cycpatternCheck(String, String)} method.
    * It checks if the method returns true if the input string is a cyclic pattern.
    */
    @Test
    void testCycpatternCheck3() {
        String a = "abcabcabcabc";
        String b = "abcabcabc";
        assertTrue(CycpatternCheck.cycpatternCheck(a, b));
    }

    /**
    * Test case for the {@link CycpatternCheck#cycpatternCheck(String, String)} method.
    * It checks if the method returns true if the input string is a cyclic pattern.
    */
    @Test
    void testCycpatternCheck4() {
        String a = "abcabcabcabc";
        String b = "abcabcabcabc";
        assertTrue(CycpatternCheck.cycpatternCheck(a, b));
    }

    /**
    * Test case for the {@link CycpatternCheck#cycpatternCheck(String, String)} method.
    * It checks if the method returns false if the input string is not a cyclic pattern.
    */
    @Test
    void testCycpatternCheck5() {
        String a = "abcabcabcabc";
        String b = "abcd";
        assertFalse(CycpatternCheck.cycpatternCheck(a, b));
    }

    /**
    * Test case for the {@link CycpatternCheck#cycpatternCheck(String, String)} method.
    * It checks if the method returns false if the input string is not a cyclic pattern.
    */
    @Test
    void testCycpatternCheck6() {
        String a = "abcabcabcabc";
        String b = "abcabcd";
        assertFalse(CycpatternCheck.cycpatternCheck(a, b));
    }

    /**
    * Test case for the {@link CycpatternCheck#cycpatternCheck(String, String)} method.
    * It checks if the method returns false if the input string is not a cyclic pattern.
    */
    @Test
    void testCycpatternCheck7() {
        String a = "abcabcabcabc";
        String b = "abcabcabcd";
        assertFalse(CycpatternCheck.cycpatternCheck(a, b));
    }

    /**
    * Test case for the {@link CycpatternCheck#cycpatternCheck(String, String)} method.
    * It checks if the method returns false if the input string is not a cyclic pattern.
    */
    @Test
    void testCycpatternCheck8() {
        String a = "abcabcabcabc";
        String b = "abcabcabcabcd";
        assertFalse(CycpatternCheck.cycpatternCheck(a, b));
    }

    /**
    * Test case for the {@link CycpatternCheck#cycpatternCheck(String, String)} method.
    * It checks if the method returns false if the input string is not a cyclic pattern.
    */
    @Test
    void testCycpatternCheck9() {
        String a = "abcabcabcabc";
        String b = "abcabcabcabcde";
        assertFalse(CycpatternCheck.cycpatternCheck(a, b));
    }

    /**
    * Test case for the {@link CycpatternCheck#cycpatternCheck(String, String)} method.
    * It checks if the method returns false if the input string is not a cyclic pattern.
    */
    @Test
    void testCycpatternCheck10() {
        String a = "abcabcabcabc";
        String b = "abcabcabcabcde";
        assertFalse(CycpatternCheck.cycpatternCheck(a, b));
    }
}
