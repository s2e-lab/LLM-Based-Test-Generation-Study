// CycpatternCheckTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CycpatternCheck}.
* It contains ten unit test cases for the {@link CycpatternCheck#cycpatternCheck(String, String)} method.
*/
class CycpatternCheckTest {

    /**
    * Test case number: 1
    * Test case values: a = "abcd", b = "abd"
    * Expected output (Post-state): false
    */
    @Test
    public void testCycpatternCheck01() {
        String a = "abcd";
        String b = "abd";
        Boolean expected = false;
        assertEquals(expected, CycpatternCheck.cycpatternCheck(a, b));
    }

    /**
    * Test case number: 2
    * Test case values: a = "hello", b = "ell"
    * Expected output (Post-state): true
    */
    @Test
    public void testCycpatternCheck02() {
        String a = "hello";
        String b = "ell";
        Boolean expected = true;
        assertEquals(expected, CycpatternCheck.cycpatternCheck(a, b));
    }

    /**
    * Test case number: 3
    * Test case values: a = "whassup", b = "psus"
    * Expected output (Post-state): false
    */
    @Test
    public void testCycpatternCheck03() {
        String a = "whassup";
        String b = "psus";
        Boolean expected = false;
        assertEquals(expected, CycpatternCheck.cycpatternCheck(a, b));
    }

    /**
    * Test case number: 4
    * Test case values: a = "abab", b = "baa"
    * Expected output (Post-state): true
    */
    @Test
    public void testCycpatternCheck04() {
        String a = "abab";
        String b = "baa";
        Boolean expected = true;
        assertEquals(expected, CycpatternCheck.cycpatternCheck(a, b));
    }

    /**
    * Test case number: 5
    * Test case values: a = "efef", b = "eeff"
    * Expected output (Post-state): false
    */
    @Test
    public void testCycpatternCheck05() {
        String a = "efef";
        String b = "eeff";
        Boolean expected = false;
        assertEquals(expected, CycpatternCheck.cycpatternCheck(a, b));
    }

    /**
    * Test case number: 6
    * Test case values: a = "himenss", b = "simen"
    * Expected output (Post-state): true
    */
    @Test
    public void testCycpatternCheck06() {
        String a = "himenss";
        String b = "simen";
        Boolean expected = true;
        assertEquals(expected, CycpatternCheck.cycpatternCheck(a, b));
    }

    /**
    * Test case number: 7
    * Test case values: a = "xyzw", b = "xyw"
    * Expected output (Post-state): false
    */
    @Test
    public void testCycpatternCheck07() {
        String a = "xyzw";
        String b = "xyw";
        Boolean expected = false;
        assertEquals(expected, CycpatternCheck.cycpatternCheck(a, b));
    }

    /**
    * Test case number: 8
    * Test case values: a = "yello", b = "ell"
    * Expected output (Post-state): true
    */
    @Test
    public void testCycpatternCheck08() {
        String a = "yello";
        String b = "ell";
        Boolean expected = true;
        assertEquals(expected, CycpatternCheck.cycpatternCheck(a, b));
    }

    /**
    * Test case number: 9
    * Test case values: a = "whattup", b = "ptut"
    * Expected output (Post-state): false
    */
    @Test
    public void testCycpatternCheck09() {
        String a = "whattup";
        String b = "ptut";
        Boolean expected = false;
        assertEquals(expected, CycpatternCheck.cycpatternCheck(a, b));
    }

    /**
    * Test case number: 10
    * Test case values: a = "efef", b = "fee"
    * Expected output (Post-state): true
    */
    @Test
    public void testCycpatternCheck10() {
        String a = "efef";
        String b = "fee";
        Boolean expected = true;
        assertEquals(expected, CycpatternCheck.cycpatternCheck(a, b));
    }
}
