// Solve1Test.java
package scenario2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link Solve1}.
 * It contains ten unit test cases for the {@link Solve1#solve(int)} method.
 */
class Solve1Test {

    @Test
    void testSolveWithZero() {
        assertEquals("0", Solve1.solve(0));
    }

    @Test
    void testSolveWithOne() {
        assertEquals("1", Solve1.solve(1));
    }

    @Test
    void testSolveWithTwo() {
        assertEquals("1", Solve1.solve(2));
    }

    @Test
    void testSolveWithThree() {
        assertEquals("10", Solve1.solve(3));
    }

    @Test
    void testSolveWithTen() {
        assertEquals("2", Solve1.solve(10));
    }

    @Test
    void testSolveWithEleven() {
        assertEquals("3", Solve1.solve(11));
    }

    @Test
    void testSolveWithHundred() {
        assertEquals("2", Solve1.solve(100));
    }

    @Test
    void testSolveWithThousand() {
        assertEquals("5", Solve1.solve(1000));
    }

    @Test
    void testSolveWithTenThousand() {
        assertEquals("7", Solve1.solve(10000));
    }

    @Test
    void testSolveWithMaxValue() {
        assertEquals("11", Solve1.solve(Integer.MAX_VALUE));
    }
}