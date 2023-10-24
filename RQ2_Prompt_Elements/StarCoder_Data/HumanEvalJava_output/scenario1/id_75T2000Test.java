// IsMultiplyPrimeTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsMultiplyPrime}.
* It contains ten unit test cases for the {@link IsMultiplyPrime#isMultiplyPrime(int)} method.
*/
class IsMultiplyPrimeTest {

    @Test
    void testIsMultiplyPrime1() {
        assertEquals(true, IsMultiplyPrime.isMultiplyPrime(12));
    }

    @Test
    void testIsMultiplyPrime2() {
        assertEquals(false, IsMultiplyPrime.isMultiplyPrime(13));
    }

    @Test
    void testIsMultiplyPrime3() {
        assertEquals(true, IsMultiplyPrime.isMultiplyPrime(14));
    }

    @Test
    void testIsMultiplyPrime4() {
        assertEquals(false, IsMultiplyPrime.isMultiplyPrime(15));
    }

    @Test
    void testIsMultiplyPrime5() {
        assertEquals(true, IsMultiplyPrime.isMultiplyPrime(16));
    }

    @Test
    void testIsMultiplyPrime6() {
        assertEquals(false, IsMultiplyPrime.isMultiplyPrime(17));
    }

    @Test
    void testIsMultiplyPrime7() {
        assertEquals(true, IsMultiplyPrime.isMultiplyPrime(18));
    }

    @Test
    void testIsMultiplyPrime8() {
        assertEquals(false, IsMultiplyPrime.isMultiplyPrime(19));
    }

    @Test
    void testIsMultiplyPrime9() {
        assertEquals(true, IsMultiplyPrime.isMultiplyPrime(20));
    }

    @Test
    void testIsMultiplyPrime10() {
        assertEquals(false, IsMultiplyPrime.isMultiplyPrime(21));
    }
}
