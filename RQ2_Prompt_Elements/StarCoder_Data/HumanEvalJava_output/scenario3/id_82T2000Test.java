// PrimeLengthTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PrimeLength}.
* It contains ten unit test cases for the {@link PrimeLength#primeLength(String)} method.
*/
class PrimeLengthTest {

    /**
     * Test case for the {@link PrimeLength#primeLength(String)} method.
     * It tests the length of the string "Hello".
     */
    @Test
    void testPrimeLengthHello() {
        assertTrue(PrimeLength.primeLength("Hello"));
    }

    /**
     * Test case for the {@link PrimeLength#primeLength(String)} method.
     * It tests the length of the string "abcdcba".
     */
    @Test
    void testPrimeLengthAbcdcba() {
        assertTrue(PrimeLength.primeLength("abcdcba"));
    }

    /**
     * Test case for the {@link PrimeLength#primeLength(String)} method.
     * It tests the length of the string "kittens".
     */
    @Test
    void testPrimeLengthKittens() {
        assertTrue(PrimeLength.primeLength("kittens"));
    }

    /**
     * Test case for the {@link PrimeLength#primeLength(String)} method.
     * It tests the length of the string "orange".
     */
    @Test
    void testPrimeLengthOrange() {
        assertFalse(PrimeLength.primeLength("orange"));
    }

    /**
     * Test case for the {@link PrimeLength#primeLength(String)} method.
     * It tests the length of the string "wow".
     */
    @Test
    void testPrimeLengthWow() {
        assertTrue(PrimeLength.primeLength("wow"));
    }

    /**
     * Test case for the {@link PrimeLength#primeLength(String)} method.
     * It tests the length of the string "world".
     */
    @Test
    void testPrimeLengthWorld() {
        assertTrue(PrimeLength.primeLength("world"));
    }

    /**
     * Test case for the {@link PrimeLength#primeLength(String)} method.
     * It tests the length of the string "MadaM".
     */
    @Test
    void testPrimeLengthMadaM() {
        assertTrue(PrimeLength.primeLength("MadaM"));
    }

    /**
     * Test case for the {@link PrimeLength#primeLength(String)} method.
     * It tests the length of the string "Wow".
     */
    @Test
    void testPrimeLengthWow2() {
        assertTrue(PrimeLength.primeLength("Wow"));
    }

    /**
     * Test case for the {@link PrimeLength#primeLength(String)} method.
     * It tests the length of the string "".
     */
    @Test
    void testPrimeLengthEmpty() {
        assertFalse(PrimeLength.primeLength(""));
    }

    /**
     * Test case for the {@link PrimeLength#primeLength(String)} method.
     * It tests the length of the string "HI".
     */
    @Test
    void testPrimeLengthHI() {
        assertTrue(PrimeLength.primeLength("HI"));
    }

    /**
     * Test case for the {@link PrimeLength#primeLength(String)} method.
     * It tests the length of the string "go".
     */
    @Test
    void testPrimeLengthGo() {
        assertTrue(PrimeLength.primeLength("go"));
    }

    /**
     * Test case for the {@link PrimeLength#primeLength(String)} method.
     * It tests the length of the string "gogo".
     */
    @Test
    void testPrimeLengthGogo() {
        assertFalse(PrimeLength.primeLength("gogo"));
    }

    /**
     * Test case for the {@link PrimeLength#primeLength(String)} method.
     * It tests the length of the string "aaaaaaaaaaaaaaa".
     */
    @Test
    void testPrimeLengthAaaaaaaaaaaaaaa() {
        assertFalse(PrimeLength.primeLength("aaaaaaaaaaaaaaa"));
    }

    /**
     * Test case for the {@link PrimeLength#primeLength(String)} method.
     * It tests the length of the string "Madam".
     */
    @Test
    void testPrimeLengthMadam() {
        assertTrue(PrimeLength.primeLength("Madam"));
    }

    /**
     * Test case for the {@link PrimeLength#primeLength(String)} method.
     * It tests the length of the string "M".
     */
    @Test
    void testPrimeLengthM() {
        assertFalse(PrimeLength.primeLength("M"));
    }

    /**
     * Test case for the {@link PrimeLength#primeLength(String)} method.
     * It tests the length of the string "0".
     */
    @Test
    void testPrimeLength0() {
        assertFalse(PrimeLength.primeLength("0"));
    }
}
