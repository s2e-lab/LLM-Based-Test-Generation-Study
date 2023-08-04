// CorrectBracketing1Test.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CorrectBracketing1}.
* It contains ten unit test cases for the {@link CorrectBracketing1#correctBracketing(String)} method.
*/
class CorrectBracketing1Test {

    @Test
    void test1() {
        String brackets = "()";
        assertTrue(CorrectBracketing1.correctBracketing(brackets));
    }

    @Test
    void test2() {
        String brackets = "()[]{}";
        assertTrue(CorrectBracketing1.correctBracketing(brackets));
    }

    @Test
    void test3() {
        String brackets = "(]";
        assertFalse(CorrectBracketing1.correctBracketing(brackets));
    }

    @Test
    void test4() {
        String brackets = "([)]";
        assertFalse(CorrectBracketing1.correctBracketing(brackets));
    }

    @Test
    void test5() {
        String brackets = "{[]}";
        assertTrue(CorrectBracketing1.correctBracketing(brackets));
    }

    @Test
    void test6() {
        String brackets = "([)]";
        assertFalse(CorrectBracketing1.correctBracketing(brackets));
    }

    @Test
    void test7() {
        String brackets = "([)]";
        assertFalse(CorrectBracketing1.correctBracketing(brackets));
    }

    @Test
    void test8() {
        String brackets = "([)]";
        assertFalse(CorrectBracketing1.correctBracketing(brackets));
    }

    @Test
    void test9() {
        String brackets = "([)]";
        assertFalse(CorrectBracketing1.correctBracketing(brackets));
    }

    @Test
    void test10() {
        String brackets = "([)]";
        assertFalse(CorrectBracketing1.correctBracketing(brackets));
    }
}
