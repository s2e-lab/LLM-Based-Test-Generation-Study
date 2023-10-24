// Fib4Test.java
package scenario2;


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
        assertEquals(0, Fib4.fib4(0));
        assertEquals(0, Fib4.fib4(1));
        assertEquals(2, Fib4.fib4(2));
        assertEquals(0, Fib4.fib4(3));
        assertEquals(3, Fib4.fib4(4));
        assertEquals(1, Fib4.fib4(5));
        assertEquals(0, Fib4.fib4(6));
        assertEquals(5, Fib4.fib4(7));
        assertEquals(3, Fib4.fib4(8));
        assertEquals(1, Fib4.fib4(9));
        assertEquals(8, Fib4.fib4(10));
    }
}
