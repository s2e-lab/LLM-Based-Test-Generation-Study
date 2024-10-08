// LargestPrimeFactorTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LargestPrimeFactor}.
* It contains ten unit test cases for the {@link LargestPrimeFactor#largestPrimeFactor(int)} method.
*/
class LargestPrimeFactorTest {

    /** Test case for {@link LargestPrimeFactor#largestPrimeFactor(int)}. */
    @Test
    void testLargestPrimeFactor() {
        assertEquals(2, LargestPrimeFactor.largestPrimeFactor(2048));
        assertEquals(5, LargestPrimeFactor.largestPrimeFactor(15));
        assertEquals(3, LargestPrimeFactor.largestPrimeFactor(27));
        assertEquals(7, LargestPrimeFactor.largestPrimeFactor(63));
        assertEquals(11, LargestPrimeFactor.largestPrimeFactor(330));
        assertEquals(29, LargestPrimeFactor.largestPrimeFactor(13195));
    }
}
