// SpecialFactorialTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SpecialFactorial}.
* It contains ten unit test cases for the {@link SpecialFactorial#specialFactorial(int)} method.
*/
class SpecialFactorialTest {

    /**
     * Test case for specialFactorial(1).
     */
    @Test
    void test1() {
        assertEquals(1, SpecialFactorial.specialFactorial(1));
    }

    /**
     * Test case for specialFactorial(2).
     */
    @Test
    void test2() {
        assertEquals(2, SpecialFactorial.specialFactorial(2));
    }

    /**
     * Test case for specialFactorial(3).
     */
    @Test
    void test3() {
        assertEquals(6, SpecialFactorial.specialFactorial(3));
    }

    /**
     * Test case for specialFactorial(4).
     */
    @Test
    void test4() {
        assertEquals(24, SpecialFactorial.specialFactorial(4));
    }

    /**
     * Test case for specialFactorial(5).
     */
    @Test
    void test5() {
        assertEquals(120, SpecialFactorial.specialFactorial(5));
    }

    /**
     * Test case for specialFactorial(6).
     */
    @Test
    void test6() {
        assertEquals(720, SpecialFactorial.specialFactorial(6));
    }

    /**
     * Test case for specialFactorial(7).
     */
    @Test
    void test7() {
        assertEquals(5040, SpecialFactorial.specialFactorial(7));
    }

    /**
     * Test case for specialFactorial(8).
     */
    @Test
    void test8() {
        assertEquals(40320, SpecialFactorial.specialFactorial(8));
    }

    /**
     * Test case for specialFactorial(9).
     */
    @Test
    void test9() {
        assertEquals(362880, SpecialFactorial.specialFactorial(9));
    }

    /**
     * Test case for specialFactorial(10).
     */
    @Test
    void test10() {
        assertEquals(3628800, SpecialFactorial.specialFactorial(10));
    }
}
