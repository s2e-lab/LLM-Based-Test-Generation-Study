// SimplifyTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Simplify}.
* It contains ten unit test cases for the {@link Simplify#simplify(String, String)} method.
*/
class SimplifyTest {

    /**
    * Test case for {@link Simplify#simplify(String, String)} where x = "1/5" and n = "5/1".
    */
    @Test
    void test1() {
        assertTrue(Simplify.simplify("1/5", "5/1"));
    }

    /**
    * Test case for {@link Simplify#simplify(String, String)} where x = "1/6" and n = "2/1".
    */
    @Test
    void test2() {
        assertFalse(Simplify.simplify("1/6", "2/1"));
    }

    /**
    * Test case for {@link Simplify#simplify(String, String)} where x = "7/10" and n = "10/2".
    */
    @Test
    void test3() {
        assertFalse(Simplify.simplify("7/10", "10/2"));
    }

    /**
    * Test case for {@link Simplify#simplify(String, String)} where x = "2/10" and n = "50/10".
    */
    @Test
    void test4() {
        assertTrue(Simplify.simplify("2/10", "50/10"));
    }

    /**
    * Test case for {@link Simplify#simplify(String, String)} where x = "7/2" and n = "4/2".
    */
    @Test
    void test5() {
        assertTrue(Simplify.simplify("7/2", "4/2"));
    }

    /**
    * Test case for {@link Simplify#simplify(String, String)} where x = "11/6" and n = "6/1".
    */
    @Test
    void test6() {
        assertTrue(Simplify.simplify("11/6", "6/1"));
    }

    /**
    * Test case for {@link Simplify#simplify(String, String)} where x = "2/3" and n = "5/2".
    */
    @Test
    void test7() {
        assertFalse(Simplify.simplify("2/3", "5/2"));
    }

    /**
    * Test case for {@link Simplify#simplify(String, String)} where x = "5/2" and n = "3/5".
    */
    @Test
    void test8() {
        assertFalse(Simplify.simplify("5/2", "3/5"));
    }

    /**
    * Test case for {@link Simplify#simplify(String, String)} where x = "2/4" and n = "8/4".
    */
    @Test
    void test9() {
        assertTrue(Simplify.simplify("2/4", "8/4"));
    }

    /**
    * Test case for {@link Simplify#simplify(String, String)} where x = "2/4" and n = "4/2".
    */
    @Test
    void test10() {
        assertTrue(Simplify.simplify("2/4", "4/2"));
    }

    /**
    * Test case for {@link Simplify#simplify(String, String)} where x = "1/5" and n = "5/1".
    */
    @Test
    void test11() {
        assertTrue(Simplify.simplify("1/5", "5/1"));
    }

    /**
    * Test case for {@link Simplify#simplify(String, String)} where x = "1/5" and n = "1/5".
    */
    @Test
    void test12() {
        assertFalse(Simplify.simplify("1/5", "1/5"));
    }
}
