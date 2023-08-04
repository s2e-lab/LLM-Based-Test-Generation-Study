// CycpatternCheckTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CycpatternCheck}.
* It contains ten unit test cases for the {@link CycpatternCheck#cycpatternCheck(String, String)} method.
*/
class CycpatternCheckTest {

    /**
    * Test case for {@link CycpatternCheck#cycpatternCheck(String, String)} with a=abc, b=bc.
    */
    @Test
    void testCycpatternCheck01() {
        String a = "abc";
        String b = "bc";
        assertTrue(CycpatternCheck.cycpatternCheck(a, b));
    }

    /**
    * Test case for {@link CycpatternCheck#cycpatternCheck(String, String)} with a=abc, b=ac.
    */
    @Test
    void testCycpatternCheck02() {
        String a = "abc";
        String b = "ac";
        assertFalse(CycpatternCheck.cycpatternCheck(a, b));
    }

    /**
    * Test case for {@link CycpatternCheck#cycpatternCheck(String, String)} with a=abc, b=abc.
    */
    @Test
    void testCycpatternCheck03() {
        String a = "abc";
        String b = "abc";
        assertTrue(CycpatternCheck.cycpatternCheck(a, b));
    }

    /**
    * Test case for {@link CycpatternCheck#cycpatternCheck(String, String)} with a=abc, b=ab.
    */
    @Test
    void testCycpatternCheck04() {
        String a = "abc";
        String b = "ab";
        assertFalse(CycpatternCheck.cycpatternCheck(a, b));
    }

    /**
    * Test case for {@link CycpatternCheck#cycpatternCheck(String, String)} with a=abc, b=abcd.
    */
    @Test
    void testCycpatternCheck05() {
        String a = "abc";
        String b = "abcd";
        assertFalse(CycpatternCheck.cycpatternCheck(a, b));
    }

    /**
    * Test case for {@link CycpatternCheck#cycpatternCheck(String, String)} with a=abc, b=abcde.
    */
    @Test
    void testCycpatternCheck06() {
        String a = "abc";
        String b = "abcde";
        assertFalse(CycpatternCheck.cycpatternCheck(a, b));
    }

    /**
    * Test case for {@link CycpatternCheck#cycpatternCheck(String, String)} with a=abc, b=abcdef.
    */
    @Test
    void testCycpatternCheck07() {
        String a = "abc";
        String b = "abcdef";
        assertFalse(CycpatternCheck.cycpatternCheck(a, b));
    }

    /**
    * Test case for {@link CycpatternCheck#cycpatternCheck(String, String)} with a=abc, b=abcdefg.
    */
    @Test
    void testCycpatternCheck08() {
        String a = "abc";
        String b = "abcdefg";
        assertFalse(CycpatternCheck.cycpatternCheck(a, b));
    }

    /**
    * Test case for {@link CycpatternCheck#cycpatternCheck(String, String)} with a=abc, b=abcdefgh.
    */
    @Test
    void testCycpatternCheck09() {
        String a = "abc";
        String b = "abcdefgh";
        assertFalse(CycpatternCheck.cycpatternCheck(a, b));
    }

    /**
    * Test case for {@link CycpatternCheck#cycpatternCheck(String, String)} with a=abc, b=abcdefghi.
    */
    @Test
    void testCycpatternCheck10() {
        String a = "abc";
        String b = "abcdefghi";
        assertFalse(CycpatternCheck.cycpatternCheck(a, b));
    }
}
