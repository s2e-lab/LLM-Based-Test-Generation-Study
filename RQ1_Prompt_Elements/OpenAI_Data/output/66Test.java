// DigitsumTest.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
* Unit tests of {@link Digitsum}.
* It contains ten test cases for the {@link Digitsum#digitsum()} method.
*/
class DigitsumTest {

    @Test
    void testDigitsum() {
        assertEquals(Digitsum.digitsum("ABC"), 6);
        assertEquals(Digitsum.digitsum("ABCD"), 22);
        assertEquals(Digitsum.digitsum("ABCDE"), 48);
        assertEquals(Digitsum.digitsum("ABCDEF"), 80);
        assertEquals(Digitsum.digitsum("ABCDEFG"), 118);
        assertEquals(Digitsum.digitsum("ABCDEFGH"), 162);
        assertEquals(Digitsum.digitsum("ABCDEFGHI"), 212);
        assertEquals(Digitsum.digitsum("ABCDEFGHIJ"), 268);
        assertEquals(Digitsum.digitsum("ABCDEFGHIJK"), 330);
        assertEquals(Digitsum.digitsum("ABCDEFGHIJKL"), 398);
    }
}