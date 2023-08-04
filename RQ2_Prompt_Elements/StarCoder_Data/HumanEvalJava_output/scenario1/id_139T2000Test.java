// SpecialFactorialTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SpecialFactorial}.
* It contains ten unit test cases for the {@link SpecialFactorial#specialFactorial(int)} method.
*/
class SpecialFactorialTest {

    @Test
    void specialFactorialTest1() {
        assertEquals(1, SpecialFactorial.specialFactorial(0));
    }

    @Test
    void specialFactorialTest2() {
        assertEquals(1, SpecialFactorial.specialFactorial(1));
    }

    @Test
    void specialFactorialTest3() {
        assertEquals(24, SpecialFactorial.specialFactorial(4));
    }

    @Test
    void specialFactorialTest4() {
        assertEquals(120, SpecialFactorial.specialFactorial(5));
    }

    @Test
    void specialFactorialTest5() {
        assertEquals(720, SpecialFactorial.specialFactorial(6));
    }

    @Test
    void specialFactorialTest6() {
        assertEquals(5040, SpecialFactorial.specialFactorial(7));
    }

    @Test
    void specialFactorialTest7() {
        assertEquals(40320, SpecialFactorial.specialFactorial(8));
    }

    @Test
    void specialFactorialTest8() {
        assertEquals(362880, SpecialFactorial.specialFactorial(9));
    }

    @Test
    void specialFactorialTest9() {
        assertEquals(3628800, SpecialFactorial.specialFactorial(10));
    }

    @Test
    void specialFactorialTest10() {
        assertEquals(39916800, SpecialFactorial.specialFactorial(11));
    }
}
