// Fib4Test.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Fib4}.
* It contains ten unit test cases for the {@link Fib4#fib4(int)} method.
*/
class Fib4Test {

    /**
    * Test case for {@link Fib4#fib4(int)}.
    */
    @Test
    void testFib4() {
        assertEquals(4, Fib4.fib4(5));
        assertEquals(8, Fib4.fib4(6));
        assertEquals(14, Fib4.fib4(7));
        assertEquals(4, Fib4.fib4(5));
        assertEquals(28, Fib4.fib4(8));
        assertEquals(104, Fib4.fib4(10));
        assertEquals(386, Fib4.fib4(12));
    }
}
