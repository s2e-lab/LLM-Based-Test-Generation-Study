// Fib4Test.java
package scenario1;


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
        assertEquals(2, Fib4.fib4(2));
        assertEquals(3, Fib4.fib4(3));
        assertEquals(5, Fib4.fib4(4));
        assertEquals(8, Fib4.fib4(5));
        assertEquals(13, Fib4.fib4(6));
        assertEquals(21, Fib4.fib4(7));
        assertEquals(34, Fib4.fib4(8));
        assertEquals(55, Fib4.fib4(9));
        assertEquals(89, Fib4.fib4(10));
    }
}
