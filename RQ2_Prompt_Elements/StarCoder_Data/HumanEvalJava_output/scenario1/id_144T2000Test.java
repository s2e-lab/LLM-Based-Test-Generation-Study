// SimplifyTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Simplify}.
* It contains ten unit test cases for the {@link Simplify#simplify(String, String)} method.
*/
class SimplifyTest {

    @Test
    void test1() {
        String x = "1/2";
        String n = "1/2";
        assertTrue(Simplify.simplify(x, n));
    }

    @Test
    void test2() {
        String x = "1/2";
        String n = "1/3";
        assertFalse(Simplify.simplify(x, n));
    }

    @Test
    void test3() {
        String x = "1/2";
        String n = "2/3";
        assertFalse(Simplify.simplify(x, n));
    }

    @Test
    void test4() {
        String x = "1/2";
        String n = "1/4";
        assertFalse(Simplify.simplify(x, n));
    }

    @Test
    void test5() {
        String x = "1/2";
        String n = "2/4";
        assertFalse(Simplify.simplify(x, n));
    }

    @Test
    void test6() {
        String x = "1/2";
        String n = "3/4";
        assertFalse(Simplify.simplify(x, n));
    }

    @Test
    void test7() {
        String x = "1/2";
        String n = "1/5";
        assertFalse(Simplify.simplify(x, n));
    }

    @Test
    void test8() {
        String x = "1/2";
        String n = "2/5";
        assertFalse(Simplify.simplify(x, n));
    }

    @Test
    void test9() {
        String x = "1/2";
        String n = "3/5";
        assertFalse(Simplify.simplify(x, n));
    }

    @Test
    void test10() {
        String x = "1/2";
        String n = "4/5";
        assertFalse(Simplify.simplify(x, n));
    }
}
