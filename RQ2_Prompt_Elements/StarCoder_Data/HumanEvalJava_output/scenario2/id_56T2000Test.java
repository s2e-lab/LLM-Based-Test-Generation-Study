// CorrectBracketingTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CorrectBracketing}.
* It contains ten unit test cases for the {@link CorrectBracketing#correctBracketing(String)} method.
*/
class CorrectBracketingTest {

    /**
    * Test case for the {@link CorrectBracketing#correctBracketing(String)} method.
    */
    @Test
    void testCorrectBracketing() {
        assertTrue(CorrectBracketing.correctBracketing(""));
        assertTrue(CorrectBracketing.correctBracketing("<>"));
        assertTrue(CorrectBracketing.correctBracketing("<><>"));
        assertTrue(CorrectBracketing.correctBracketing("<><><>"));
        assertTrue(CorrectBracketing.correctBracketing("<><><><>"));
        assertTrue(CorrectBracketing.correctBracketing("<><><><><>"));
        assertTrue(CorrectBracketing.correctBracketing("<><><><><><>"));
        assertTrue(CorrectBracketing.correctBracketing("<><><><><><><>"));
        assertTrue(CorrectBracketing.correctBracketing("<><><><><><><><>"));
        assertTrue(CorrectBracketing.correctBracketing("<><><><><><><><><>"));
        assertFalse(CorrectBracketing.correctBracketing("<><><><><><><><><><>"));
        assertFalse(CorrectBracketing.correctBracketing("<><><><><><><><><><><>"));
        assertFalse(CorrectBracketing.correctBracketing("<><><><><><><><><><><><>"));
        assertFalse(CorrectBracketing.correctBracketing("<><><><><><><><><><><><><>"));
        assertFalse(CorrectBracketing.correctBracketing("<><><><><><><><><><><><><><>"));
        assertFalse(CorrectBracketing.correctBracketing("<><><><><><><><><><><><><><><>"));
        assertFalse(CorrectBracketing.correctBracketing("<><><><><><><><><><><><><><><><>"));
        assertFalse(CorrectBracketing.correctBracketing("<><><><><><><><><><><><><><><><><>"));
        assertFalse(CorrectBracketing.correctBracketing("<><><><><><><><><><><><><><><><><><>"));
        assertFalse(CorrectBracketing.correctBracketing("<><><><><><><><><><><><><><><><><><><>"));
        assertFalse(CorrectBracketing.correctBracketing("<><><><><><><><><><><><><><><><><><><><>"));
        assertFalse(CorrectBracketing.correctBracketing("<><><><><><><><><><><><><><><><><><><><><>"));
        assertFalse(CorrectBracketing.correctBracketing("<><><><><><><><><><><><><><><><><><><><><><>"));
        assertFalse(CorrectBracketing.correctBracketing("<><><><><><><><><><><><><><><><><><><><><><><>"));
        assertFalse(CorrectBracketing.correctBracketing("<><><><><><><><><><><><><><><><><><><><><><><><>"));
        assertFalse(CorrectBracketing.correctBracketing("<><><><><><><><><><><><><><><><><><><><><><><><><>"));
        assertFalse(CorrectBracketing.correctBracketing("<><><><><><><><><><><><><><><><><><><><><><><><><><>"));
        assertFalse(CorrectBracketing.correctBracketing("<><><><><><><><><><><><><><><><><><><><><><><><><><><>"));
        assertFalse(CorrectBracketing.correctBracketing("<><><><><><><><><><><><><><><><><><><><><><><><><><><><>"));
        assertFalse(CorrectBracketing.correctBracketing("<><><><><><><><><><><><><><><><><><><><><><><><><><><><><>"));
        assertFalse(CorrectBracketing.correctBracketing("<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>"));
        assertFalse(CorrectBracketing.correctBracketing("<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>"));
        assertFalse(CorrectBracketing.correctBracketing("<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>"));
        assertFalse(CorrectBracketing.correctBracketing("<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>"));
        assertFalse(CorrectBracketing.correctBracketing("<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>"));
        assertFalse(CorrectBracketing.correctBracketing("<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>"));
        assertFalse(CorrectBracketing.correctBracketing("<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>"));
        assertFalse(CorrectBracketing.correctBracketing("<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>"));
        assertFalse(CorrectBracketing.correctBracketing("<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>"));
        assertFalse(CorrectBracketing.correctBracketing("<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>"));
        assertFalse(CorrectBracketing.correctBracketing("<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>"));
        assertFalse(CorrectBracketing.correctBracketing("<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>"));
        assertFalse(CorrectBracketing.correctBracketing("<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>"));
        assertFalse(CorrectBracketing.correctBracketing("<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>"));
        assertFalse(CorrectBracketing.correctBracketing("<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>"));
        assertFalse(CorrectBracketing.correctBracketing("<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>"));
        assertFalse(CorrectBracketing.correctBracketing("<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>"));
        assertFalse(CorrectBracketing.correctBracketing("<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>"));
        assertFalse(CorrectBracketing.correctBracketing("<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>"));
        assertFalse(CorrectBracketing.correctBracketing("<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>"));
        assertFalse(CorrectBracketing.correctBracketing("<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>"));
        assertFalse(CorrectBracketing.correctBracketing("<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>"));
        assertFalse(CorrectBracketing.correctBracketing("<><><><><><><><><><><><><><><><><><><><><