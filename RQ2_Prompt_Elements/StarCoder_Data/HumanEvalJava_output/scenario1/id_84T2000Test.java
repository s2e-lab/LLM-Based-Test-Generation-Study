// Solve1Test.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Solve1}.
* It contains ten unit test cases for the {@link Solve1#solve(int)} method.
*/
class Solve1Test {

    @Test
    void test1() {
        assertEquals("1", Solve1.solve(1));
    }

    @Test
    void test2() {
        assertEquals("10", Solve1.solve(2));
    }

    @Test
    void test3() {
        assertEquals("11", Solve1.solve(3));
    }

    @Test
    void test4() {
        assertEquals("100", Solve1.solve(4));
    }

    @Test
    void test5() {
        assertEquals("101", Solve1.solve(5));
    }

    @Test
    void test6() {
        assertEquals("110", Solve1.solve(6));
    }

    @Test
    void test7() {
        assertEquals("111", Solve1.solve(7));
    }

    @Test
    void test8() {
        assertEquals("1000", Solve1.solve(8));
    }

    @Test
    void test9() {
        assertEquals("1001", Solve1.solve(9));
    }

    @Test
    void test10() {
        assertEquals("1010", Solve1.solve(10));
    }
}
