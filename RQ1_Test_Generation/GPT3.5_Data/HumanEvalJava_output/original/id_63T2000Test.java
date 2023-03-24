Here's the source code for the `FibfibTest` class:

```
package original;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link Fibfib}.
 * It contains ten unit test cases for the {@link Fibfib#fibfib(int)} method.
 */
class FibfibTest {

    @Test
    void testFibfib0() {
        assertEquals(0, Fibfib.fibfib(0));
    }

    @Test
    void testFibfib1() {
        assertEquals(0, Fibfib.fibfib(1));
    }

    @Test
    void testFibfib2() {
        assertEquals(1, Fibfib.fibfib(2));
    }

    @Test
    void testFibfib3() {
        assertEquals(1, Fibfib.fibfib(3));
    }

    @Test
    void testFibfib4() {
        assertEquals(2, Fibfib.fibfib(4));
    }

    @Test
    void testFibfib5() {
        assertEquals(4, Fibfib.fibfib(5));
    }

    @Test
    void testFibfib6() {
        assertEquals(9, Fibfib.fibfib(6));
    }

    @Test
    void testFibfib7() {
        assertEquals(20, Fibfib.fibfib(7));
    }

    @Test
    void testFibfib8() {
        assertEquals(24, Fibfib.fibfib(8));
    }

    @Test
    void testFibfib9() {
        assertEquals(49, Fibfib.fibfib(9));
    }
}
```

This class contains ten test methods, each of which tests the `Fibfib.fibfib()` method with a different input value and expected output. The `assertEquals()` method is used to check that the actual output of the `Fibfib.fibfib()` method matches the expected output.