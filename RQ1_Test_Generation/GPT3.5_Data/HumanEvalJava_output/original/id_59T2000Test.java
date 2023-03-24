// LargestPrimeFactorTest.java
package original;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link LargestPrimeFactor}.
 * It contains ten unit test cases for the {@link LargestPrimeFactor#largestPrimeFactor(int)} method.
 */
class LargestPrimeFactorTest {

    @Test
    void testLargestPrimeFactor2048() {
        assertEquals(2, LargestPrimeFactor.largestPrimeFactor(2048));
    }

    @Test
    void testLargestPrimeFactor15() {
        assertEquals(5, LargestPrimeFactor.largestPrimeFactor(15));
    }

    @Test
    void testLargestPrimeFactor27() {
        assertEquals(3, LargestPrimeFactor.largestPrimeFactor(27));
    }

    @Test
    void testLargestPrimeFactor63() {
        assertEquals(7, LargestPrimeFactor.largestPrimeFactor(63));
    }

    @Test
    void testLargestPrimeFactor330() {
        assertEquals(11, LargestPrimeFactor.largestPrimeFactor(330));
    }

    @Test
    void testLargestPrimeFactor13195() {
        assertEquals(29, LargestPrimeFactor.largestPrimeFactor(13195));
    }

    @Test
    void testLargestPrimeFactor1() {
        assertThrows(IllegalArgumentException.class, () -> LargestPrimeFactor.largestPrimeFactor(1));
    }

    @Test
    void testLargestPrimeFactorNegative() {
        assertThrows(IllegalArgumentException.class, () -> LargestPrimeFactor.largestPrimeFactor(-10));
    }

    @Test
    void testLargestPrimeFactorPrime() {
        assertThrows(IllegalArgumentException.class, () -> LargestPrimeFactor.largestPrimeFactor(7));
    }

    @Test
    void testLargestPrimeFactorZero() {
        assertThrows(IllegalArgumentException.class, () -> LargestPrimeFactor.largestPrimeFactor(0));
    }
}