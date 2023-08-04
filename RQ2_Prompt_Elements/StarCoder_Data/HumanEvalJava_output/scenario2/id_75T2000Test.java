// IsMultiplyPrimeTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsMultiplyPrime}.
* It contains ten unit test cases for the {@link IsMultiplyPrime#isMultiplyPrime(int)} method.
*/
class IsMultiplyPrimeTest {

    /**
     * Test case for the {@link IsMultiplyPrime#isMultiplyPrime(int)} method.
     * It checks if the given number is the multiplication of 3 prime numbers.
     */
    @Test
    void testIsMultiplyPrime() {
        assertTrue(IsMultiplyPrime.isMultiplyPrime(9));
    }

    /**
     * Test case for the {@link IsMultiplyPrime#isMultiplyPrime(int)} method.
     * It checks if the given number is not the multiplication of 3 prime numbers.
     */
    @Test
    void testIsMultiplyPrime2() {
        assertFalse(IsMultiplyPrime.isMultiplyPrime(10));
    }

    /**
     * Test case for the {@link IsMultiplyPrime#isMultiplyPrime(int)} method.
     * It checks if the given number is not the multiplication of 3 prime numbers.
     */
    @Test
    void testIsMultiplyPrime3() {
        assertFalse(IsMultiplyPrime.isMultiplyPrime(11));
    }

    /**
     * Test case for the {@link IsMultiplyPrime#isMultiplyPrime(int)} method.
     * It checks if the given number is not the multiplication of 3 prime numbers.
     */
    @Test
    void testIsMultiplyPrime4() {
        assertFalse(IsMultiplyPrime.isMultiplyPrime(12));
    }

    /**
     * Test case for the {@link IsMultiplyPrime#isMultiplyPrime(int)} method.
     * It checks if the given number is not the multiplication of 3 prime numbers.
     */
    @Test
    void testIsMultiplyPrime5() {
        assertFalse(IsMultiplyPrime.isMultiplyPrime(13));
    }

    /**
     * Test case for the {@link IsMultiplyPrime#isMultiplyPrime(int)} method.
     * It checks if the given number is not the multiplication of 3 prime numbers.
     */
    @Test
    void testIsMultiplyPrime6() {
        assertFalse(IsMultiplyPrime.isMultiplyPrime(14));
    }

    /**
     * Test case for the {@link IsMultiplyPrime#isMultiplyPrime(int)} method.
     * It checks if the given number is not the multiplication of 3 prime numbers.
     */
    @Test
    void testIsMultiplyPrime7() {
        assertFalse(IsMultiplyPrime.isMultiplyPrime(15));
    }

    /**
     * Test case for the {@link IsMultiplyPrime#isMultiplyPrime(int)} method.
     * It checks if the given number is not the multiplication of 3 prime numbers.
     */
    @Test
    void testIsMultiplyPrime8() {
        assertFalse(IsMultiplyPrime.isMultiplyPrime(16));
    }

    /**
     * Test case for the {@link IsMultiplyPrime#isMultiplyPrime(int)} method.
     * It checks if the given number is not the multiplication of 3 prime numbers.
     */
    @Test
    void testIsMultiplyPrime9() {
        assertFalse(IsMultiplyPrime.isMultiplyPrime(17));
    }

    /**
     * Test case for the {@link IsMultiplyPrime#isMultiplyPrime(int)} method.
     * It checks if the given number is not the multiplication of 3 prime numbers.
     */
    @Test
    void testIsMultiplyPrime10() {
        assertFalse(IsMultiplyPrime.isMultiplyPrime(18));
    }
}
