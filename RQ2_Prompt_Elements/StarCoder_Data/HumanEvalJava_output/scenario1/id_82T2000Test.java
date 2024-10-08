// PrimeLengthTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PrimeLength}.
* It contains ten unit test cases for the {@link PrimeLength#primeLength(String)} method.
*/
class PrimeLengthTest {

    @Test
    void testPrimeLength() {
        assertTrue(PrimeLength.primeLength(""));
        assertTrue(PrimeLength.primeLength("a"));
        assertTrue(PrimeLength.primeLength("ab"));
        assertTrue(PrimeLength.primeLength("abc"));
        assertTrue(PrimeLength.primeLength("abcd"));
        assertTrue(PrimeLength.primeLength("abcde"));
        assertTrue(PrimeLength.primeLength("abcdef"));
        assertTrue(PrimeLength.primeLength("abcdefg"));
        assertTrue(PrimeLength.primeLength("abcdefgh"));
        assertTrue(PrimeLength.primeLength("abcdefghi"));
    }

    @Test
    void testNotPrimeLength() {
        assertFalse(PrimeLength.primeLength("abcdeff"));
        assertFalse(PrimeLength.primeLength("abcdefg"));
        assertFalse(PrimeLength.primeLength("abcdefgh"));
        assertFalse(PrimeLength.primeLength("abcdefghi"));
    }
}
