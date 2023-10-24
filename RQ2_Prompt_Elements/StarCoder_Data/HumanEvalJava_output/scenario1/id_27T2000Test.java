// FlipCaseTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FlipCase}.
* It contains ten unit test cases for the {@link FlipCase#flipCase(String)} method.
*/
class FlipCaseTest {

    @Test
    void test1() {
        String string = "Hello World";
        String expected = "hELLO wORLD";
        assertEquals(expected, FlipCase.flipCase(string));
    }

    @Test
    void test2() {
        String string = "HELLO WORLD";
        String expected = "hELLO wORLD";
        assertEquals(expected, FlipCase.flipCase(string));
    }

    @Test
    void test3() {
        String string = "hello world";
        String expected = "HELLO WORLD";
        assertEquals(expected, FlipCase.flipCase(string));
    }

    @Test
    void test4() {
        String string = "hello WORLD";
        String expected = "HELLO wORLD";
        assertEquals(expected, FlipCase.flipCase(string));
    }

    @Test
    void test5() {
        String string = "Hello World";
        String expected = "hELLO wORLD";
        assertEquals(expected, FlipCase.flipCase(string));
    }

    @Test
    void test6() {
        String string = "HELLO WORLD";
        String expected = "hELLO wORLD";
        assertEquals(expected, FlipCase.flipCase(string));
    }

    @Test
    void test7() {
        String string = "hello world";
        String expected = "HELLO WORLD";
        assertEquals(expected, FlipCase.flipCase(string));
    }

    @Test
    void test8() {
        String string = "hello WORLD";
        String expected = "HELLO wORLD";
        assertEquals(expected, FlipCase.flipCase(string));
    }

    @Test
    void test9() {
        String string = "Hello World";
        String expected = "hELLO wORLD";
        assertEquals(expected, FlipCase.flipCase(string));
    }

    @Test
    void test10() {
        String string = "HELLO WORLD";
        String expected = "hELLO wORLD";
        assertEquals(expected, FlipCase.flipCase(string));
    }
}
