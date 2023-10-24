// IsNestedTest.java
package scenario1;

import java.util.ArrayList;
import java.util.Collections;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsNested}.
* It contains ten unit test cases for the {@link IsNested#isNested(String)} method.
*/
class IsNestedTest {

    @Test
    void test1() {
        String string = "[]";
        assertTrue(IsNested.isNested(string));
    }

    @Test
    void test2() {
        String string = "[[]]";
        assertTrue(IsNested.isNested(string));
    }

    @Test
    void test3() {
        String string = "[[][[]]]";
        assertTrue(IsNested.isNested(string));
    }

    @Test
    void test4() {
        String string = "[[][[]]][[]]";
        assertTrue(IsNested.isNested(string));
    }

    @Test
    void test5() {
        String string = "[[][[]]][[][[]]]";
        assertTrue(IsNested.isNested(string));
    }

    @Test
    void test6() {
        String string = "[[][[]]][[][[]]][[]]";
        assertTrue(IsNested.isNested(string));
    }

    @Test
    void test7() {
        String string = "[[][[]]][[][[]]][[][[]]]";
        assertTrue(IsNested.isNested(string));
    }

    @Test
    void test8() {
        String string = "[[][[]]][[][[]]][[][[]]][[]]";
        assertTrue(IsNested.isNested(string));
    }

    @Test
    void test9() {
        String string = "[[][[]]][[][[]]][[][[]]][[][[]]]";
        assertTrue(IsNested.isNested(string));
    }

    @Test
    void test10() {
        String string = "[[][[]]][[][[]]][[][[]]][[][[]]][[]]";
        assertTrue(IsNested.isNested(string));
    }
}
