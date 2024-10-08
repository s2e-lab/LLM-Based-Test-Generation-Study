// Solve1Test.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Solve1}.
* It contains ten unit test cases for the {@link Solve1#solve(int)} method.
*/
class Solve1Test {

    /**
     * Test case for {@link Solve1#solve(int)}.
     */
    @Test
    void testSolve() {
        assertEquals("1", Solve1.solve(1000));
        assertEquals("110", Solve1.solve(150));
        assertEquals("1100", Solve1.solve(147));
        assertEquals("1001", Solve1.solve(333));
        assertEquals("10010", Solve1.solve(963));
    }
}
