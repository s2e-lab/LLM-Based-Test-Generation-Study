// LargestPrimeFactorTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LargestPrimeFactor}.
* It contains ten unit test cases for the {@link LargestPrimeFactor#largestPrimeFactor(int)} method.
*/
class LargestPrimeFactorTest {

    /**
     * Test case for the {@link LargestPrimeFactor#largestPrimeFactor(int)} method.
     */
    @Test
    void testLargestPrimeFactor() {
        assertEquals(2, LargestPrimeFactor.largestPrimeFactor(10));
        assertEquals(3, LargestPrimeFactor.largestPrimeFactor(15));
        assertEquals(5, LargestPrimeFactor.largestPrimeFactor(25));
        assertEquals(7, LargestPrimeFactor.largestPrimeFactor(49));
        assertEquals(11, LargestPrimeFactor.largestPrimeFactor(101));
        assertEquals(13, LargestPrimeFactor.largestPrimeFactor(121));
        assertEquals(17, LargestPrimeFactor.largestPrimeFactor(143));
        assertEquals(19, LargestPrimeFactor.largestPrimeFactor(161));
        assertEquals(23, LargestPrimeFactor.largestPrimeFactor(193));
        assertEquals(29, LargestPrimeFactor.largestPrimeFactor(225));
        assertEquals(31, LargestPrimeFactor.largestPrimeFactor(241));
    }
}
