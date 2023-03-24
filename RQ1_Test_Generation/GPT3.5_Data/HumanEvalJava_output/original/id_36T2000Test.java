// FizzBuzzTest.java
package original;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link FizzBuzz}.
 * It contains ten unit test cases for the {@link FizzBuzz#fizzBuzz(int)} method.
 */
class FizzBuzzTest {

    @Test
    void testFizzBuzzWith50() {
        int result = FizzBuzz.fizzBuzz(50);
        assertEquals(0, result);
    }

    @Test
    void testFizzBuzzWith78() {
        int result = FizzBuzz.fizzBuzz(78);
        assertEquals(2, result);
    }

    @Test
    void testFizzBuzzWith79() {
        int result = FizzBuzz.fizzBuzz(79);
        assertEquals(3, result);
    }

    @Test
    void testFizzBuzzWith100() {
        int result = FizzBuzz.fizzBuzz(100);
        assertEquals(3, result);
    }

    @Test
    void testFizzBuzzWith200() {
        int result = FizzBuzz.fizzBuzz(200);
        assertEquals(6, result);
    }

    @Test
    void testFizzBuzzWith4000() {
        int result = FizzBuzz.fizzBuzz(4000);
        assertEquals(192, result);
    }

    @Test
    void testFizzBuzzWith10000() {
        int result = FizzBuzz.fizzBuzz(10000);
        assertEquals(639, result);
    }

    @Test
    void testFizzBuzzWith100000() {
        int result = FizzBuzz.fizzBuzz(100000);
        assertEquals(8026, result);
    }

    @Test
    void testFizzBuzzWithNegativeNumber() {
        int result = FizzBuzz.fizzBuzz(-10);
        assertEquals(0, result);
    }

    @Test
    void testFizzBuzzWithZero() {
        int result = FizzBuzz.fizzBuzz(0);
        assertEquals(0, result);
    }
}