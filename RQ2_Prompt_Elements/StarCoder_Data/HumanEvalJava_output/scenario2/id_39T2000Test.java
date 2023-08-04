// PrimeFibTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PrimeFib}.
* It contains ten unit test cases for the {@link PrimeFib#primeFib(int)} method.
*/
class PrimeFibTest {

    /**
     * * Test case for n = 1.
     */
    @Test
    void test1() {
        assertEquals(2, PrimeFib.primeFib(1));
    }

    /**
     * * Test case for n = 2.
     */
    @Test
    void test2() {
        assertEquals(3, PrimeFib.primeFib(2));
    }

    /**
     * * Test case for n = 3.
     */
    @Test
    void test3() {
        assertEquals(5, PrimeFib.primeFib(3));
    }

    /**
     * * Test case for n = 4.
     */
    @Test
    void test4() {
        assertEquals(13, PrimeFib.primeFib(4));
    }

    /**
     * * Test case for n = 5.
     */
    @Test
    void test5() {
        assertEquals(89, PrimeFib.primeFib(5));
    }

    /**
     * * Test case for n = 6.
     */
    @Test
    void test6() {
        assertEquals(144, PrimeFib.primeFib(6));
    }

    /**
     * * Test case for n = 7.
     */
    @Test
    void test7() {
        assertEquals(403, PrimeFib.primeFib(7));
    }

    /**
     * * Test case for n = 8.
     */
    @Test
    void test8() {
        assertEquals(676, PrimeFib.primeFib(8));
    }

    /**
     * * Test case for n = 9.
     */
    @Test
    void test9() {
        assertEquals(1094, PrimeFib.primeFib(9));
    }

    /**
     * * Test case for n = 10.
     */
    @Test
    void test10() {
        assertEquals(1771, PrimeFib.primeFib(10));
    }
}
