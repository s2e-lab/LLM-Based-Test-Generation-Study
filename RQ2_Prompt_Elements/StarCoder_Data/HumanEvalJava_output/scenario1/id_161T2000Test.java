// SolveTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Solve}.
* It contains ten unit test cases for the {@link Solve#solve(String)} method.
*/
class SolveTest {

    @Test
    void test1() {
        assertEquals("HELLO WORLD", Solve.solve("Hello World"));
    }

    @Test
    void test2() {
        assertEquals("HELLO WORLD", Solve.solve("hello world"));
    }

    @Test
    void test3() {
        assertEquals("HELLO WORLD", Solve.solve("HELLO WORLD"));
    }

    @Test
    void test4() {
        assertEquals("HELLO WORLD", Solve.solve("hELLO wORLD"));
    }

    @Test
    void test5() {
        assertEquals("HELLO WORLD", Solve.solve("HeLLo WoRLD"));
    }

    @Test
    void test6() {
        assertEquals("HELLO WORLD", Solve.solve("hello world."));
    }

    @Test
    void test7() {
        assertEquals("HELLO WORLD", Solve.solve("hello world!"));
    }

    @Test
    void test8() {
        assertEquals("HELLO WORLD", Solve.solve("hello world?"));
    }

    @Test
    void test9() {
        assertEquals("HELLO WORLD", Solve.solve("hello world."));
    }

    @Test
    void test10() {
        assertEquals("HELLO WORLD", Solve.solve("hello world!"));
    }
}
