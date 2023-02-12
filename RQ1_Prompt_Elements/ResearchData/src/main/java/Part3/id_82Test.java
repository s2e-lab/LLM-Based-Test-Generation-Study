package Part3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
class PrimeLengthTest {
    @Test
    void testPrimeLength() {
        assertEquals(true, PrimeLength.primeLength("Hello"));
        assertEquals(true, PrimeLength.primeLength("abcdcba"));
        assertEquals(true, PrimeLength.primeLength("kittens"));
        assertEquals(false, PrimeLength.primeLength("orange"));
        assertEquals(true, PrimeLength.primeLength("wow"));
        assertEquals(true, PrimeLength.primeLength("world"));
        assertEquals(true, PrimeLength.primeLength("MadaM"));
        assertEquals(true, PrimeLength.primeLength("Wow"));
        assertEquals(false, PrimeLength.primeLength(""));
        assertEquals(true, PrimeLength.primeLength("HI"));
        assertEquals(true, PrimeLength.primeLength("go"));
        assertEquals(false, PrimeLength.primeLength("gogo"));
        assertEquals(false, PrimeLength.primeLength("aaaaaaaaaaaaaaa"));
        assertEquals(true, PrimeLength.primeLength("Madam"));
        assertEquals(false, PrimeLength.primeLength("M"));
        assertEquals(false, PrimeLength.primeLength("0"));
    }
}