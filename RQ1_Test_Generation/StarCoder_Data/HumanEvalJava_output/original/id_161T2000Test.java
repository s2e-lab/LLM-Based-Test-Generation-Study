// SolveTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Solve}.
* It contains ten unit test cases for the {@link Solve#solve(String)} method.
*/
class SolveTest {

    /**
     * Test case for the {@link Solve#solve(String)} method.
     */
    @Test
    void testSolve() {
        assertEquals("4321", Solve.solve("1234"));
        assertEquals("AB", Solve.solve("ab"));
        assertEquals("#A@c", Solve.solve("#a@C"));
        assertEquals("aSdF", Solve.solve("AsDf"));
        assertEquals("#aSDFw^45", Solve.solve("#AsdfW^45"));
        assertEquals("2@6#", Solve.solve("#6@2"));
        assertEquals("#$A^d", Solve.solve("#$a^D"));
        assertEquals("#CCC", Solve.solve("#ccc"));
    }
}
