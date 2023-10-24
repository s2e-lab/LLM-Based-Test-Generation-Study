// SpecialFactorialTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SpecialFactorial}.
* It contains ten unit test cases for the {@link SpecialFactorial#specialFactorial(int)} method.
*/
class SpecialFactorialTest {

    /**
     * Test case for specialFactorial(4).
     */
    @Test
    void testSpecialFactorial4() {
        assertEquals(288, SpecialFactorial.specialFactorial(4));
    }

    /**
     * Test case for specialFactorial(5).
     */
    @Test
    void testSpecialFactorial5() {
        assertEquals(34560, SpecialFactorial.specialFactorial(5));
    }

    /**
     * Test case for specialFactorial(7).
     */
    @Test
    void testSpecialFactorial7() {
        assertEquals(125411328000L, SpecialFactorial.specialFactorial(7));
    }

    /**
     * Test case for specialFactorial(1).
     */
    @Test
    void testSpecialFactorial1() {
        assertEquals(1, SpecialFactorial.specialFactorial(1));
    }

    /**
     * Test case for specialFactorial(0).
     */
    @Test
    void testSpecialFactorial0() {
        assertEquals(1, SpecialFactorial.specialFactorial(0));
    }

    /**
     * Test case for specialFactorial(-1).
     */
    @Test
    void testSpecialFactorialMinus1() {
        assertEquals(1, SpecialFactorial.specialFactorial(-1));
    }

    /**
     * Test case for specialFactorial(-2).
     */
    @Test
    void testSpecialFactorialMinus2() {
        assertEquals(1, SpecialFactorial.specialFactorial(-2));
    }

    /**
     * Test case for specialFactorial(-3).
     */
    @Test
    void testSpecialFactorialMinus3() {
        assertEquals(1, SpecialFactorial.specialFactorial(-3));
    }

    /**
     * Test case for specialFactorial(-4).
     */
    @Test
    void testSpecialFactorialMinus4() {
        assertEquals(1, SpecialFactorial.specialFactorial(-4));
    }

    /**
     * Test case for specialFactorial(-5).
     */
    @Test
    void testSpecialFactorialMinus5() {
        assertEquals(1, SpecialFactorial.specialFactorial(-5));
    }

    /**
     * Test case for specialFactorial(-6).
     */
    @Test
    void testSpecialFactorialMinus6() {
        assertEquals(1, SpecialFactorial.specialFactorial(-6));
    }

    /**
     * Test case for specialFactorial(-7).
     */
    @Test
    void testSpecialFactorialMinus7() {
        assertEquals(1, SpecialFactorial.specialFactorial(-7));
    }
}
