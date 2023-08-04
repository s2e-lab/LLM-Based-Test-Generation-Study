// AnyIntTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AnyInt}.
* It contains ten unit test cases for the {@link AnyInt#anyInt(Number, Number, Number)} method.
*/
class AnyIntTest {

    /**
    * Test case number: 1
    * Inpput: 5, 2, 7
    * Output: True
    * Expected test result: True
    */
    @Test
    void test1() {
        assertTrue(AnyInt.anyInt(5, 2, 7));
    }

    /**
    * Test case number: 2
    * Inpput: 3, 2, 2
    * Output: False
    * Expected test result: False
    */
    @Test
    void test2() {
        assertFalse(AnyInt.anyInt(3, 2, 2));
    }

    /**
    * Test case number: 3
    * Inpput: 3, -2, 1
    * Output: True
    * Expected test result: True
    */
    @Test
    void test3() {
        assertTrue(AnyInt.anyInt(3, -2, 1));
    }

    /**
    * Test case number: 4
    * Inpput: 3.6, -2.2, 2
    * Output: False
    * Expected test result: False
    */
    @Test
    void test4() {
        assertFalse(AnyInt.anyInt(3.6, -2.2, 2));
    }

    /**
    * Test case number: 5
    * Inpput: 2, 3, 1
    * Output: True
    * Expected test result: True
    */
    @Test
    void test5() {
        assertTrue(AnyInt.anyInt(2, 3, 1));
    }

    /**
    * Test case number: 6
    * Inpput: 2.5, 2, 3
    * Output: False
    * Expected test result: False
    */
    @Test
    void test6() {
        assertFalse(AnyInt.anyInt(2.5, 2, 3));
    }

    /**
    * Test case number: 7
    * Inpput: 1.5, 5, 3.5
    * Output: False
    * Expected test result: False
    */
    @Test
    void test7() {
        assertFalse(AnyInt.anyInt(1.5, 5, 3.5));
    }

    /**
    * Test case number: 8
    * Inpput: 2, 6, 2
    * Output: False
    * Expected test result: False
    */
    @Test
    void test8() {
        assertFalse(AnyInt.anyInt(2, 6, 2));
    }

    /**
    * Test case number: 9
    * Inpput: 4, 2, 2
    * Output: True
    * Expected test result: True
    */
    @Test
    void test9() {
        assertTrue(AnyInt.anyInt(4, 2, 2));
    }

    /**
    * Test case number: 10
    * Inpput: 2.2, 2.2, 2.2
    * Output: False
    * Expected test result: False
    */
    @Test
    void test10() {
        assertFalse(AnyInt.anyInt(2.2, 2.2, 2.2));
    }

    /**
    * Test case number: 11
    * Inpput: -4, 6, 2
    * Output: True
    * Expected test result: True
    */
    @Test
    void test11() {
        assertTrue(AnyInt.anyInt(-4, 6, 2));
    }

    /**
    * Test case number: 12
    * Inpput: 2, 1, 1
    * Output: True
    * Expected test result: True
    */
    @Test
    void test12() {
        assertTrue(AnyInt.anyInt(2, 1, 1));
    }

    /**
    * Test case number: 13
    * Inpput: 3, 4, 7
    * Output: True
    * Expected test result: True
    */
    @Test
    void test13() {
        assertTrue(AnyInt.anyInt(3, 4, 7));
    }

    /**
    * Test case number: 14
    * Inpput: 3.0, 4, 7
    * Output: False
    * Expected test result: False
    */
    @Test
    void test14() {
        assertFalse(AnyInt.anyInt(3.0, 4, 7));
    }
}
