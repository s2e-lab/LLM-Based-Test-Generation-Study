package scenario3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
class FibTest {
    @Test
    void testFib() {
        assertEquals(55, Fib.fib(10));
        assertEquals(1, Fib.fib(1));
        assertEquals(21, Fib.fib(8));
        assertEquals(89, Fib.fib(11));
        assertEquals(144, Fib.fib(12));
        assertEquals(233, Fib.fib(13));
        assertEquals(377, Fib.fib(14));
        assertEquals(610, Fib.fib(15));
        assertEquals(987, Fib.fib(16));
        assertEquals(1597, Fib.fib(17));
    }
}