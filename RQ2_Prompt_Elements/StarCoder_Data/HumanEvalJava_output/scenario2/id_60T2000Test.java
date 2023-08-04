// SumToNTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumToN}.
* It contains ten unit test cases for the {@link SumToN#sumToN(int)} method.
*/
class SumToNTest {

    /**
     * Test case for {@link SumToN#sumToN(int)}.
     * It tests the sum of numbers from 1 to 10.
     */
    @Test
    void testSumToN() {
        assertEquals(55, SumToN.sumToN(10));
    }

    /**
     * Test case for {@link SumToN#sumToN(int)}.
     * It tests the sum of numbers from 1 to 100.
     */
    @Test
    void testSumToN2() {
        assertEquals(5050, SumToN.sumToN(100));
    }

    /**
     * Test case for {@link SumToN#sumToN(int)}.
     * It tests the sum of numbers from 1 to 1000.
     */
    @Test
    void testSumToN3() {
        assertEquals(500500, SumToN.sumToN(1000));
    }

    /**
     * Test case for {@link SumToN#sumToN(int)}.
     * It tests the sum of numbers from 1 to 10000.
     */
    @Test
    void testSumToN4() {
        assertEquals(50005000, SumToN.sumToN(10000));
    }

    /**
     * Test case for {@link SumToN#sumToN(int)}.
     * It tests the sum of numbers from 1 to 100000.
     */
    @Test
    void testSumToN5() {
        assertEquals(5000050000L, SumToN.sumToN(100000));
    }

    /**
     * Test case for {@link SumToN#sumToN(int)}.
     * It tests the sum of numbers from 1 to 1000000.
     */
    @Test
    void testSumToN6() {
        assertEquals(500000500000L, SumToN.sumToN(1000000));
    }

    /**
     * Test case for {@link SumToN#sumToN(int)}.
     * It tests the sum of numbers from 1 to 10000000.
     */
    @Test
    void testSumToN7() {
        assertEquals(50000005000000L, SumToN.sumToN(10000000));
    }

    /**
     * Test case for {@link SumToN#sumToN(int)}.
     * It tests the sum of numbers from 1 to 100000000.
     */
    @Test
    void testSumToN8() {
        assertEquals(5000000050000000L, SumToN.sumToN(100000000));
    }

    /**
     * Test case for {@link SumToN#sumToN(int)}.
     * It tests the sum of numbers from 1 to 1000000000.
     */
    @Test
    void testSumToN9() {
        assertEquals(500000000500000000L, SumToN.sumToN(1000000000));
    }

    /**
     * Test case for {@link SumToN#sumToN(int)}.
     * It tests the sum of numbers from 1 to 10000000000.
     */
    @Test
    void testSumToN10() {
        assertEquals(50000000005000000000L, SumToN.sumToN(10000000000L));
    }
}
