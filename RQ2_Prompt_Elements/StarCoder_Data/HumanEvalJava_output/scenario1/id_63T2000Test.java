// FibfibTest.java
package scenario1;


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
    void testFibfib1() {
        assertEquals(0, Fibfib.fibfib(0));
    }

    /**
    * Test case for {@link Fibfib#fibfib(int)}.
    */
    @Test
    void testFibfib2() {
        assertEquals(1, Fibfib.fibfib(1));
    }

    /**
    * Test case for {@link Fibfib#fibfib(int)}.
    */
    @Test
    void testFibfib3() {
        assertEquals(1, Fibfib.fibfib(2));
    }

    /**
    * Test case for {@link Fibfib#fibfib(int)}.
    */
    @Test
    void testFibfib4() {
        assertEquals(2, Fibfib.fibfib(3));
    }

    /**
    * Test case for {@link Fibfib#fibfib(int)}.
    */
    @Test
    void testFibfib5() {
        assertEquals(3, Fibfib.fibfib(4));
    }

    /**
    * Test case for {@link Fibfib#fibfib(int)}.
    */
    @Test
    void testFibfib6() {
        assertEquals(5, Fibfib.fibfib(5));
    }

    /**
    * Test case for {@link Fibfib#fibfib(int)}.
    */
    @Test
    void testFibfib7() {
        assertEquals(8, Fibfib.fibfib(6));
    }

    /**
    * Test case for {@link Fibfib#fibfib(int)}.
    */
    @Test
    void testFibfib8() {
        assertEquals(13, Fibfib.fibfib(7));
    }

    /**
    * Test case for {@link Fibfib#fibfib(int)}.
    */
    @Test
    void testFibfib9() {
        assertEquals(21, Fibfib.fibfib(8));
    }

    /**
    * Test case for {@link Fibfib#fibfib(int)}.
    */
    @Test
    void testFibfib10() {
        assertEquals(34, Fibfib.fibfib(9));
    }
}
