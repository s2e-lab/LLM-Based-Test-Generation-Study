// SpecialFactorialTest.java
package original;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SpecialFactorial}.
* It contains ten unit test cases for the {@link SpecialFactorial#specialFactorial(int)} method.
*/
class SpecialFactorialTest {
    @Test
    void testSpecialFactorialWithOne() {
        assertEquals(1, SpecialFactorial.specialFactorial(1));
    }

    @Test
    void testSpecialFactorialWithTwo() {
        assertEquals(2, SpecialFactorial.specialFactorial(2));
    }

    @Test
    void testSpecialFactorialWithThree() {
        assertEquals(12, SpecialFactorial.specialFactorial(3));
    }

    @Test
    void testSpecialFactorialWithFour() {
        assertEquals(288, SpecialFactorial.specialFactorial(4));
    }

    @Test
    void testSpecialFactorialWithFive() {
        assertEquals(34560, SpecialFactorial.specialFactorial(5));
    }

    @Test
    void testSpecialFactorialWithSix() {
        assertEquals(24883200, SpecialFactorial.specialFactorial(6));
    }

    @Test
    void testSpecialFactorialWithSeven() {
        assertEquals(125411328000L, SpecialFactorial.specialFactorial(7));
    }

    @Test
    void testSpecialFactorialWithEight() {
        assertEquals(52306974720000L, SpecialFactorial.specialFactorial(8));
    }

    @Test
    void testSpecialFactorialWithNine() {
        assertEquals(2092278988800000L, SpecialFactorial.specialFactorial(9));
    }

    @Test
    void testSpecialFactorialWithTen() {
        assertEquals(884176199373824000L, SpecialFactorial.specialFactorial(10));
    }
}