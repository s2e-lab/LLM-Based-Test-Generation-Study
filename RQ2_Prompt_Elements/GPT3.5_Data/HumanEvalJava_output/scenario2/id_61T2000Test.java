// CorrectBracketing1Test.java
package scenario2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link CorrectBracketing1}.
 * It contains ten unit test cases for the {@link CorrectBracketing1#correctBracketing(String)} method.
 */
class CorrectBracketing1Test {

    @Test
    void testEmptyString() {
        assertTrue(CorrectBracketing1.correctBracketing(""));
    }

    @Test
    void testSingleOpeningBracket() {
        assertFalse(CorrectBracketing1.correctBracketing("("));
    }

    @Test
    void testSingleClosingBracket() {
        assertFalse(CorrectBracketing1.correctBracketing(")"));
    }

    @Test
    void testTwoOpeningBrackets() {
        assertFalse(CorrectBracketing1.correctBracketing("(("));
    }

    @Test
    void testTwoClosingBrackets() {
        assertFalse(CorrectBracketing1.correctBracketing("))"));
    }

    @Test
    void testOneOpeningOneClosingBracket() {
        assertTrue(CorrectBracketing1.correctBracketing("()"));
    }

    @Test
    void testMultipleOpeningBrackets() {
        assertFalse(CorrectBracketing1.correctBracketing("((())"));
    }

    @Test
    void testMultipleClosingBrackets() {
        assertFalse(CorrectBracketing1.correctBracketing("(()))"));
    }

    @Test
    void testNestedBrackets() {
        assertTrue(CorrectBracketing1.correctBracketing("(()())"));
    }

    @Test
    void testMixedBrackets() {
        assertFalse(CorrectBracketing1.correctBracketing("(()())("));
    }
}