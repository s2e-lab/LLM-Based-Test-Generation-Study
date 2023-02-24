// FizzBuzzTest.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests of {@link FizzBuzz}.
 * It contains ten test cases for the {@link scenario1.FizzBuzz#fizzBuzz()} method.
 */
class FizzBuzzTest {
		


    @Test
    void testFizzBuzz() {
        assertEquals(0, FizzBuzz.fizzBuzz(1));
        assertEquals(0, FizzBuzz.fizzBuzz(2));
        assertEquals(0, FizzBuzz.fizzBuzz(3));
        assertEquals(0, FizzBuzz.fizzBuzz(4));
        assertEquals(0, FizzBuzz.fizzBuzz(5));
        assertEquals(0, FizzBuzz.fizzBuzz(6));
        assertEquals(0, FizzBuzz.fizzBuzz(7));
        assertEquals(0, FizzBuzz.fizzBuzz(8));
        assertEquals(0, FizzBuzz.fizzBuzz(9));
        assertEquals(0, FizzBuzz.fizzBuzz(10));
    }
}