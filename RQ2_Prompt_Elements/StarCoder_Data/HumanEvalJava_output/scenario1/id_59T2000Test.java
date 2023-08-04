// LargestPrimeFactorTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LargestPrimeFactor}.
* It contains ten unit test cases for the {@link LargestPrimeFactor#largestPrimeFactor(int)} method.
*/
class LargestPrimeFactorTest {

    @Test
    void testLargestPrimeFactor() {
        assertEquals(2, LargestPrimeFactor.largestPrimeFactor(10));
        assertEquals(3, LargestPrimeFactor.largestPrimeFactor(15));
        assertEquals(5, LargestPrimeFactor.largestPrimeFactor(25));
        assertEquals(7, LargestPrimeFactor.largestPrimeFactor(49));
        assertEquals(11, LargestPrimeFactor.largestPrimeFactor(101));
        assertEquals(13, LargestPrimeFactor.largestPrimeFactor(133));
        assertEquals(17, LargestPrimeFactor.largestPrimeFactor(199));
        assertEquals(19, LargestPrimeFactor.largestPrimeFactor(221));
        assertEquals(23, LargestPrimeFactor.largestPrimeFactor(253));
        assertEquals(29, LargestPrimeFactor.largestPrimeFactor(313));
        assertEquals(31, LargestPrimeFactor.largestPrimeFactor(331));
    }
}
