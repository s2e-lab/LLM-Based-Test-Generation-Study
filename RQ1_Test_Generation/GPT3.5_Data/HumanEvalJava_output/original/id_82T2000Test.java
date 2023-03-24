// PrimeLengthTest.java
package original;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link PrimeLength}.
 * It contains ten unit test cases for the {@link PrimeLength#primeLength(String)} method.
 */
class PrimeLengthTest {

    @Test
    void testEmptyString() {
        assertFalse(PrimeLength.primeLength(""));
    }

    @Test
    void testSingleCharacterString() {
        assertFalse(PrimeLength.primeLength("M"));
    }

    @Test
    void testTwoCharacterString() {
        assertTrue(PrimeLength.primeLength("HI"));
    }

    @Test
    void testThreeCharacterString() {
        assertTrue(PrimeLength.primeLength("go"));
    }

    @Test
    void testFourCharacterString() {
        assertFalse(PrimeLength.primeLength("gogo"));
    }

    @Test
    void testFiveCharacterString() {
        assertTrue(PrimeLength.primeLength("Hello"));
    }

    @Test
    void testSixCharacterString() {
        assertTrue(PrimeLength.primeLength("abcdcba"));
    }

    @Test
    void testSevenCharacterString() {
        assertTrue(PrimeLength.primeLength("kittens"));
    }

    @Test
    void testEightCharacterString() {
        assertFalse(PrimeLength.primeLength("orange"));
    }

    @Test
    void testNineCharacterString() {
        assertTrue(PrimeLength.primeLength("wow"));
    }

    @Test
    void testTenCharacterString() {
        assertTrue(PrimeLength.primeLength("world"));
    }

    @Test
    void testElevenCharacterString() {
        assertTrue(PrimeLength.primeLength("MadaM"));
    }

    @Test
    void testTwelveCharacterString() {
        assertTrue(PrimeLength.primeLength("Wow"));
    }

    @Test
    void testLongString() {
        assertFalse(PrimeLength.primeLength("aaaaaaaaaaaaaaa"));
    }

    @Test
    void testStringWithUpperCase() {
        assertTrue(PrimeLength.primeLength("Madam"));
    }

    @Test
    void testStringWithNumber() {
        assertFalse(PrimeLength.primeLength("0"));
    }
}