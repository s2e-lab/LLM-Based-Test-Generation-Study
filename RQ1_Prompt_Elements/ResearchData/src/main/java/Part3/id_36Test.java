package Part3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
class FizzBuzzTest {
    @Test
    void testFizzBuzz() {
        assertEquals(0, FizzBuzz.fizzBuzz(50));
        assertEquals(2, FizzBuzz.fizzBuzz(78));
        assertEquals(3, FizzBuzz.fizzBuzz(79));
        assertEquals(3, FizzBuzz.fizzBuzz(100));
        assertEquals(6, FizzBuzz.fizzBuzz(200));
        assertEquals(192, FizzBuzz.fizzBuzz(4000));
        assertEquals(639, FizzBuzz.fizzBuzz(10000));
        assertEquals(8026, FizzBuzz.fizzBuzz(100000));
        assertEquals(0, FizzBuzz.fizzBuzz(0));
        assertEquals(0, FizzBuzz.fizzBuzz(1));
    }
}