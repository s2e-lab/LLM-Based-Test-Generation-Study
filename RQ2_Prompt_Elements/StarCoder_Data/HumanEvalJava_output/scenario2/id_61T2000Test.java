// CorrectBracketing1Test.java
package scenario2;


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
        String brackets1 = "()";
        assertTrue(CorrectBracketing1.correctBracketing(brackets1));

        String brackets2 = "()()";
        assertTrue(CorrectBracketing1.correctBracketing(brackets2));

        String brackets3 = "()()()";
        assertTrue(CorrectBracketing1.correctBracketing(brackets3));

        String brackets4 = "()()()()";
        assertTrue(CorrectBracketing1.correctBracketing(brackets4));

        String brackets5 = "()()()()()";
        assertTrue(CorrectBracketing1.correctBracketing(brackets5));

        String brackets6 = "()()()()()()";
        assertTrue(CorrectBracketing1.correctBracketing(brackets6));

        String brackets7 = "()()()()()()()";
        assertTrue(CorrectBracketing1.correctBracketing(brackets7));

        String brackets8 = "()()()()()()()()";
        assertTrue(CorrectBracketing1.correctBracketing(brackets8));

        String brackets9 = "()()()()()()()()()";
        assertTrue(CorrectBracketing1.correctBracketing(brackets9));

        String brackets10 = "()()()()()()()()()()";
        assertTrue(CorrectBracketing1.correctBracketing(brackets10));
    }

    /**
    * Test case for {@link CorrectBracketing1#correctBracketing(String)}.
    */
    @Test
    void testCorrectBracketing2() {
        String brackets1 = "()(";
        assertFalse(CorrectBracketing1.correctBracketing(brackets1));

        String brackets2 = "()()(";
        assertFalse(CorrectBracketing1.correctBracketing(brackets2));

        String brackets3 = "()()()(";
        assertFalse(CorrectBracketing1.correctBracketing(brackets3));

        String brackets4 = "()()()()(";
        assertFalse(CorrectBracketing1.correctBracketing(brackets4));

        String brackets5 = "()()()()()(";
        assertFalse(CorrectBracketing1.correctBracketing(brackets5));

        String brackets6 = "()()()()()()(";
        assertFalse(CorrectBracketing1.correctBracketing(brackets6));

        String brackets7 = "()()()()()()()(";
        assertFalse(CorrectBracketing1.correctBracketing(brackets7));

        String brackets8 = "()()()()()()()()(";
        assertFalse(CorrectBracketing1.correctBracketing(brackets8));

        String brackets9 = "()()()()()()()()()(";
        assertFalse(CorrectBracketing1.correctBracketing(brackets9));

        String brackets10 = "()()()()()()()()()()(";
        assertFalse(CorrectBracketing1.correctBracketing(brackets10));
    }

    /**
    * Test case for {@link CorrectBracketing1#correctBracketing(String)}.
    */
    @Test
    void testCorrectBracketing3() {
        String brackets1 = "()";
        assertTrue(CorrectBracketing1.correctBracketing(brackets1));

        String brackets2 = "()()";
        assertTrue(CorrectBracketing1.correctBracketing(brackets2));

        String brackets3 = "()()()";
        assertTrue(CorrectBracketing1.correctBracketing(brackets3));

        String brackets4 = "()()()()";
        assertTrue(CorrectBracketing1.correctBracketing(brackets4));

        String brackets5 = "()()()()()";
        assertTrue(CorrectBracketing1.correctBracketing(brackets5));

        String brackets6 = "()()()()()()";
        assertTrue(CorrectBracketing1.correctBracketing(brackets6));

        String brackets7 = "()()()()()()()";
        assertTrue(CorrectBracketing1.correctBracketing(brackets7));

        String brackets8 = "()()()()()()()()";
        assertTrue(CorrectBracketing1.correctBracketing(brackets8));

        String brackets9 = "()()()()()()()()()";
        assertTrue(CorrectBracketing1.correctBracketing(brackets9));

        String brackets10 = "()()()()()()()()()()";
        assertTrue(CorrectBracketing1.correctBracketing(brackets10));
    }

    /**
    * Test case for {@link CorrectBracketing1#correctBracketing(String)}.
    */
    @Test
    void testCorrectBracketing4() {
        String brackets1 = "()(";
        assertFalse(CorrectBracketing1.correctBracketing(brackets1));

        String brackets2 = "()()(";
        assertFalse(CorrectBracketing1.correctBracketing(brackets2));

        String brackets3 = "()()()(";
        assertFalse(CorrectBracketing1.correctBracketing(brackets3));

        String brackets4 = "()()()()(";
        assertFalse(CorrectBracketing1.correctBracketing(brackets4));

        String brackets5 = "()()()()()(";
        assertFalse(CorrectBracketing1.correctBracketing(brackets5));

        String brackets6 = "()()()()()()(";
        assertFalse(CorrectBracketing1.correctBracketing(brackets6));

        String brackets7 = "()()()()()()()(";
        assertFalse(CorrectBracketing1.correctBracketing(brackets7));

        String brackets8 = "()()()()()()()()(";
        assertFalse(CorrectBracketing1.correctBracketing(brackets8));

        String brackets9 = "()()()()()()()()()(";
        assertFalse(CorrectBracketing1.correctBracketing(brackets9));

        String brackets10 = "()()()()()()()()()()(";
        assertFalse(CorrectBracketing1.correctBracketing(brackets10));
    }

    /**
    * Test case for {@link CorrectBracketing1#correctBracketing(String)}.
    */
    @Test
    void testCorrectBracketing5() {
        String brackets1 = "()";
        assertTrue(CorrectBracketing1.correctBracketing(brackets1));

        String brackets2 = "()()";
        assertTrue(CorrectBracketing1.correctBracketing(brackets2));

        String brackets3 = "()()()";
        assertTrue(CorrectBracketing1.correctBracketing(brackets3));

        String brackets4 = "()()()()";
        assertTrue(CorrectBracketing1.correctBracketing(brackets4));

        String brackets5 = "()()()()()";
        assertTrue(CorrectBracketing1.correctBracketing(brackets5));

        String brackets6 = "()()()()()()";
        assertTrue(CorrectBracketing1.correctBracketing(brackets6));

        String brackets7 = "()()()()()()()";
        assertTrue(CorrectBracketing1.correctBracketing(brackets7));

        String brackets8 = "()()()()()()()()";
        assertTrue(CorrectBracketing1.correctBracketing(brackets8));

        String brackets9 = "()()()()()()()()()";
        assertTrue(CorrectBracketing1.correctBracketing(brackets9));

        String brackets10 = "()()()()()()()()()()";
        assertTrue(CorrectBracketing1.correctBracketing(brackets10));
    }

    /**
    * Test case for {@link CorrectBracketing1#correctBracketing(String)}.
    */
    @Test
    void testCorrectBracketing6() {
        String brackets1 = "()(";
        assertFalse(CorrectBracketing1.correctBracketing(brackets1));

        String brackets2 = "()()(";
        assertFalse(CorrectBracketing1.correctBracketing(brackets2));

        String brackets3 = "()()()(";
        assertFalse(CorrectBracketing1.correctBracketing(brackets3));

        String brackets4 = "()()()()(";
        assertFalse(CorrectBracketing1.correctBracketing(brackets4));

        String brackets5 = "()()()()()(";
        assertFalse(CorrectBracketing1.correctBracketing(brackets5));

        String brackets6 = "()()()()()()(";
        assertFalse(CorrectBracketing1.correctBracketing(brackets6));

        String brackets7 = "()()()()()()()(";
        assertFalse(CorrectBracketing1.correctBracketing(brackets7));

        String brackets8 = "()()()()()()()()(";
        assertFalse(CorrectBracketing1.correctBracketing(brackets8));

        String brackets9 = "()()()()()()()()()(";
        assertFalse(CorrectBracketing1.correctBracketing(brackets9));

        String brackets10 = "()()()()()()()()()()(";
        assertFalse(CorrectBracketing1.correctBracketing(brackets10));
    }

    /**
    * Test case for {@link CorrectBracketing1#correctBracketing(String)}.
    */
    @Test
    void testCorrectBracketing7() {
        String brackets1 = "()";
        assertTrue(CorrectBracketing1.correctBracketing(brackets1));

        String brackets2