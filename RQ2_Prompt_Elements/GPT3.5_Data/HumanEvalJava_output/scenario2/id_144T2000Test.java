// Here's the source code for the SimplifyTest class:

package scenario2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SimplifyTest {

    @Test
    void testSimplify1() {
        assertTrue(Simplify.simplify("1/2", "2/4"));
    }

    @Test
    void testSimplify2() {
        assertFalse(Simplify.simplify("1/2", "3/4"));
    }

    @Test
    void testSimplify3() {
        assertTrue(Simplify.simplify("2/3", "3/2"));
    }

    @Test
    void testSimplify4() {
        assertFalse(Simplify.simplify("2/3", "4/5"));
    }

    @Test
    void testSimplify5() {
        assertTrue(Simplify.simplify("1/4", "4/1"));
    }

    @Test
    void testSimplify6() {
        assertFalse(Simplify.simplify("1/4", "5/1"));
    }

    @Test
    void testSimplify7() {
        assertTrue(Simplify.simplify("3/5", "5/3"));
    }

    @Test
    void testSimplify8() {
        assertFalse(Simplify.simplify("3/5", "4/3"));
    }

    @Test
    void testSimplify9() {
        assertTrue(Simplify.simplify("1/1", "2/2"));
    }

    @Test
    void testSimplify10() {
        assertFalse(Simplify.simplify("1/1", "3/2"));
    }
}