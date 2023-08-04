// FibfibTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Fibfib}.
* It contains ten unit test cases for the {@link Fibfib#fibfib(int)} method.
*/
class FibfibTest {

    /**
    * Test case for {@link Fibfib#fibfib(int)}.
    */
    @Test
    void testFibfib() {
        assertEquals(0, Fibfib.fibfib(0));
        assertEquals(0, Fibfib.fibfib(1));
        assertEquals(1, Fibfib.fibfib(2));
        assertEquals(4, Fibfib.fibfib(5));
        assertEquals(24, Fibfib.fibfib(8));
        assertEquals(81, Fibfib.fibfib(10));
        assertEquals(274, Fibfib.fibfib(12));
        assertEquals(927, Fibfib.fibfib(14));
    }
}
