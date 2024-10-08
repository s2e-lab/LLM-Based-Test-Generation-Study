// IsMultiplyPrimeTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsMultiplyPrime}.
* It contains ten unit test cases for the {@link IsMultiplyPrime#isMultiplyPrime(int)} method.
*/
class IsMultiplyPrimeTest {

    /**
     * Test case for {@link IsMultiplyPrime#isMultiplyPrime(int)}.
     */
    @Test
    void testIsMultiplyPrime() {
        assertTrue(IsMultiplyPrime.isMultiplyPrime(30));
        assertFalse(IsMultiplyPrime.isMultiplyPrime(5));
        assertTrue(IsMultiplyPrime.isMultiplyPrime(8));
        assertFalse(IsMultiplyPrime.isMultiplyPrime(10));
        assertTrue(IsMultiplyPrime.isMultiplyPrime(125));
        assertTrue(IsMultiplyPrime.isMultiplyPrime(105));
        assertFalse(IsMultiplyPrime.isMultiplyPrime(126));
        assertFalse(IsMultiplyPrime.isMultiplyPrime(729));
        assertFalse(IsMultiplyPrime.isMultiplyPrime(891));
        assertTrue(IsMultiplyPrime.isMultiplyPrime(1001));
    }
}
