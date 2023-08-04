// SimplifyTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Simplify}.
* It contains ten unit test cases for the {@link Simplify#simplify(String, String)} method.
*/
class SimplifyTest {

    /**
     * Test case for {@link Simplify#simplify(String, String)} where x = 1/2 and n = 1/2.
     */
    @Test
    void test1() {
        assertTrue(Simplify.simplify("1/2", "1/2"));
    }

    /**
     * Test case for {@link Simplify#simplify(String, String)} where x = 1/2 and n = 1/3.
     */
    @Test
    void test2() {
        assertFalse(Simplify.simplify("1/2", "1/3"));
    }

    /**
     * Test case for {@link Simplify#simplify(String, String)} where x = 1/2 and n = 1/4.
     */
    @Test
    void test3() {
        assertFalse(Simplify.simplify("1/2", "1/4"));
    }

    /**
     * Test case for {@link Simplify#simplify(String, String)} where x = 1/2 and n = 1/5.
     */
    @Test
    void test4() {
        assertFalse(Simplify.simplify("1/2", "1/5"));
    }

    /**
     * Test case for {@link Simplify#simplify(String, String)} where x = 1/2 and n = 1/6.
     */
    @Test
    void test5() {
        assertFalse(Simplify.simplify("1/2", "1/6"));
    }

    /**
     * Test case for {@link Simplify#simplify(String, String)} where x = 1/2 and n = 1/7.
     */
    @Test
    void test6() {
        assertFalse(Simplify.simplify("1/2", "1/7"));
    }

    /**
     * Test case for {@link Simplify#simplify(String, String)} where x = 1/2 and n = 1/8.
     */
    @Test
    void test7() {
        assertFalse(Simplify.simplify("1/2", "1/8"));
    }

    /**
     * Test case for {@link Simplify#simplify(String, String)} where x = 1/2 and n = 1/9.
     */
    @Test
    void test8() {
        assertFalse(Simplify.simplify("1/2", "1/9"));
    }

    /**
     * Test case for {@link Simplify#simplify(String, String)} where x = 1/2 and n = 1/10.
     */
    @Test
    void test9() {
        assertFalse(Simplify.simplify("1/2", "1/10"));
    }

    /**
     * Test case for {@link Simplify#simplify(String, String)} where x = 1/2 and n = 1/11.
     */
    @Test
    void test10() {
        assertFalse(Simplify.simplify("1/2", "1/11"));
    }
}
