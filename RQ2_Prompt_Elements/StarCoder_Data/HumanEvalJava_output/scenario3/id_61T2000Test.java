// CorrectBracketing1Test.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CorrectBracketing1}.
* It contains ten unit test cases for the {@link CorrectBracketing1#correctBracketing(String)} method.
*/
class CorrectBracketing1Test {

    /**
    * Test case for {@link CorrectBracketing1#correctBracketing(String)}.
    */
    @Test
    void testCorrectBracketing1() {
        assertTrue(CorrectBracketing1.correctBracketing("()"));
        assertTrue(CorrectBracketing1.correctBracketing("(()())"));
        assertTrue(CorrectBracketing1.correctBracketing("()()(()())()"));
        assertTrue(CorrectBracketing1.correctBracketing("()()((()()())())(()()(()))"));
        assertFalse(CorrectBracketing1.correctBracketing("((()())))"));
        assertFalse(CorrectBracketing1.correctBracketing(")(()"));
        assertFalse(CorrectBracketing1.correctBracketing("("));
        assertFalse(CorrectBracketing1.correctBracketing("(((("));
        assertFalse(CorrectBracketing1.correctBracketing(")"));
        assertFalse(CorrectBracketing1.correctBracketing("(()"));
        assertFalse(CorrectBracketing1.correctBracketing("()()(()())())(()"));
        assertFalse(CorrectBracketing1.correctBracketing("()()(()())()))()"));
    }
}
