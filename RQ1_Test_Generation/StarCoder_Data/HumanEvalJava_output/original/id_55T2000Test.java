// FibTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Fib}.
* It contains ten unit test cases for the {@link Fib#fib(int)} method.
*/
class FibTest {

    /**
     * Test case for {@link Fib#fib(int)}.
     */
    @Test
    void testFib() {
        assertEquals(55, Fib.fib(10));
        assertEquals(1, Fib.fib(1));
        assertEquals(21, Fib.fib(8));
        assertEquals(89, Fib.fib(11));
        assertEquals(144, Fib.fib(12));
    }
}
