// PrimeFibTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PrimeFib}.
* It contains ten unit test cases for the {@link PrimeFib#primeFib(int)} method.
*/
class PrimeFibTest {

    @Test
    void test1() {
        assertEquals(13, PrimeFib.primeFib(6));
    }

    @Test
    void test2() {
        assertEquals(101, PrimeFib.primeFib(10));
    }

    @Test
    void test3() {
        assertEquals(103, PrimeFib.primeFib(11));
    }

    @Test
    void test4() {
        assertEquals(109, PrimeFib.primeFib(12));
    }

    @Test
    void test5() {
        assertEquals(1213, PrimeFib.primeFib(13));
    }

    @Test
    void test6() {
        assertEquals(13811, PrimeFib.primeFib(14));
    }

    @Test
    void test7() {
        assertEquals(14930352, PrimeFib.primeFib(15));
    }

    @Test
    void test8() {
        assertEquals(1000003, PrimeFib.primeFib(16));
    }

    @Test
    void test9() {
        assertEquals(1000033, PrimeFib.primeFib(17));
    }

    @Test
    void test10() {
        assertEquals(1000037, PrimeFib.primeFib(18));
    }
}
