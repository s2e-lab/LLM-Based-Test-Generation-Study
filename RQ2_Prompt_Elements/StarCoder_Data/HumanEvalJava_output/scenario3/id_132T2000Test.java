// IsNestedTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsNested}.
* It contains ten unit test cases for the {@link IsNested#isNested(String)} method.
*/
class IsNestedTest {

    /**
    * Test case for {@link IsNested#isNested(String)} where the input string contains only square brackets.
    * The function should return True if and only if there is a valid subsequence of brackets
    * where at least one bracket in the subsequence is nested.
    */
    @Test
    void test1() {
        assertTrue(IsNested.isNested("[[]]"));
    }

    /**
    * Test case for {@link IsNested#isNested(String)} where the input string contains only square brackets.
    * The function should return True if and only if there is a valid subsequence of brackets
    * where at least one bracket in the subsequence is nested.
    */
    @Test
    void test2() {
        assertFalse(IsNested.isNested("[]]]]]]][[[[[]"));
    }

    /**
    * Test case for {@link IsNested#isNested(String)} where the input string contains only square brackets.
    * The function should return True if and only if there is a valid subsequence of brackets
    * where at least one bracket in the subsequence is nested.
    */
    @Test
    void test3() {
        assertFalse(IsNested.isNested("[][]"));
    }

    /**
    * Test case for {@link IsNested#isNested(String)} where the input string contains only square brackets.
    * The function should return True if and only if there is a valid subsequence of brackets
    * where at least one bracket in the subsequence is nested.
    */
    @Test
    void test4() {
        assertFalse(IsNested.isNested("[]"));
    }

    /**
    * Test case for {@link IsNested#isNested(String)} where the input string contains only square brackets.
    * The function should return True if and only if there is a valid subsequence of brackets
    * where at least one bracket in the subsequence is nested.
    */
    @Test
    void test5() {
        assertTrue(IsNested.isNested("[[[[]]]]"));
    }

    /**
    * Test case for {@link IsNested#isNested(String)} where the input string contains only square brackets.
    * The function should return True if and only if there is a valid subsequence of brackets
    * where at least one bracket in the subsequence is nested.
    */
    @Test
    void test6() {
        assertFalse(IsNested.isNested("[]]]]]]]]]]"));
    }

    /**
    * Test case for {@link IsNested#isNested(String)} where the input string contains only square brackets.
    * The function should return True if and only if there is a valid subsequence of brackets
    * where at least one bracket in the subsequence is nested.
    */
    @Test
    void test7() {
        assertTrue(IsNested.isNested("[][][[]]"));
    }

    /**
    * Test case for {@link IsNested#isNested(String)} where the input string contains only square brackets.
    * The function should return True if and only if there is a valid subsequence of brackets
    * where at least one bracket in the subsequence is nested.
    */
    @Test
    void test8() {
        assertFalse(IsNested.isNested("[[]"));
    }

    /**
    * Test case for {@link IsNested#isNested(String)} where the input string contains only square brackets.
    * The function should return True if and only if there is a valid subsequence of brackets
    * where at least one bracket in the subsequence is nested.
    */
    @Test
    void test9() {
        assertFalse(IsNested.isNested("[]]"));
    }

    /**
    * Test case for {@link IsNested#isNested(String)} where the input string contains only square brackets.
    * The function should return True if and only if there is a valid subsequence of brackets
    * where at least one bracket in the subsequence is nested.
    */
    @Test
    void test10() {
        assertTrue(IsNested.isNested("[[]][["));
    }

    /**
    * Test case for {@link IsNested#isNested(String)} where the input string contains only square brackets.
    * The function should return True if and only if there is a valid subsequence of brackets
    * where at least one bracket in the subsequence is nested.
    */
    @Test
    void test11() {
        assertTrue(IsNested.isNested("[[][]]"));
    }

    /**
    * Test case for {@link IsNested#isNested(String)} where the input string contains only square brackets.
    * The function should return True if and only if there is a valid subsequence of brackets
    * where at least one bracket in the subsequence is nested.
    */
    @Test
    void test12() {
        assertFalse(IsNested.isNested(""));
    }

    /**
    * Test case for {@link IsNested#isNested(String)} where the input string contains only square brackets.
    * The function should return True if and only if there is a valid subsequence of brackets
    * where at least one bracket in the subsequence is nested.
    */
    @Test
    void test13() {
        assertFalse(IsNested.isNested("[[[[[[[["));
    }

    /**
    * Test case for {@link IsNested#isNested(String)} where the input string contains only square brackets.
    * The function should return True if and only if there is a valid subsequence of brackets
    * where at least one bracket in the subsequence is nested.
    */
    @Test
    void test14() {
        assertFalse(IsNested.isNested("]]]]]]]]"));
    }
}
