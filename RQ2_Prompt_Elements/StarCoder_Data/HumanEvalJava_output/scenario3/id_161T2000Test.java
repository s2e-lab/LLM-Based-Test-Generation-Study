// SolveTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Solve}.
* It contains ten unit test cases for the {@link Solve#solve(String)} method.
*/
class SolveTest {

    /**
     * Test case for the {@link Solve#solve(String)} method.
     * It tests the case when the string contains no letters.
     */
    @Test
    void testSolve0() {
        assertEquals("1234", Solve.solve("1234"));
    }

    /**
     * Test case for the {@link Solve#solve(String)} method.
     * It tests the case when the string contains only letters.
     */
    @Test
    void testSolve1() {
        assertEquals("AB", Solve.solve("ab"));
    }

    /**
     * Test case for the {@link Solve#solve(String)} method.
     * It tests the case when the string contains letters and special characters.
     */
    @Test
    void testSolve2() {
        assertEquals("#A@c", Solve.solve("#a@C"));
    }

    /**
     * Test case for the {@link Solve#solve(String)} method.
     * It tests the case when the string contains letters and special characters.
     */
    @Test
    void testSolve3() {
        assertEquals("#aSDFw^45", Solve.solve("#AsdfW^45"));
    }

    /**
     * Test case for the {@link Solve#solve(String)} method.
     * It tests the case when the string contains letters and special characters.
     */
    @Test
    void testSolve4() {
        assertEquals("2@6#", Solve.solve("#6@2"));
    }

    /**
     * Test case for the {@link Solve#solve(String)} method.
     * It tests the case when the string contains letters and special characters.
     */
    @Test
    void testSolve5() {
        assertEquals("#$A^d", Solve.solve("#$a^D"));
    }

    /**
     * Test case for the {@link Solve#solve(String)} method.
     * It tests the case when the string contains letters and special characters.
     */
    @Test
    void testSolve6() {
        assertEquals("#CCC", Solve.solve("#ccc"));
    }
}
