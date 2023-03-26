// Here's the completed SolveTest.java file:

package scenario1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link Solve}.
 * It contains ten unit test cases for the {@link Solve#solve(String)} method.
 */
class SolveTest {

    @Test
    void testAllCaps() {
        String input = "HELLO WORLD";
        String expectedOutput = "hello world";
        String actualOutput = Solve.solve(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testAllLowercase() {
        String input = "hello world";
        String expectedOutput = "HELLO WORLD";
        String actualOutput = Solve.solve(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testMixedCase() {
        String input = "HeLlO wOrLd";
        String expectedOutput = "hElLo WoRlD";
        String actualOutput = Solve.solve(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testNoLetters() {
        String input = "12345";
        String expectedOutput = "54321";
        String actualOutput = Solve.solve(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testEmptyString() {
        String input = "";
        String expectedOutput = "";
        String actualOutput = Solve.solve(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testSingleLetter() {
        String input = "a";
        String expectedOutput = "A";
        String actualOutput = Solve.solve(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testSingleUppercaseLetter() {
        String input = "A";
        String expectedOutput = "a";
        String actualOutput = Solve.solve(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testSingleLowercaseLetter() {
        String input = "z";
        String expectedOutput = "Z";
        String actualOutput = Solve.solve(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testWhitespace() {
        String input = "   \t\n";
        String expectedOutput = "   \t\n";
        String actualOutput = Solve.solve(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testSpecialCharacters() {
        String input = "!@#$%^&*()_+-=[]{}|;':\",./<>?";
        String expectedOutput = "!@#$%^&*()_+-=[]{}|;':\",./<>?";
        String actualOutput = Solve.solve(input);
        assertEquals(expectedOutput, actualOutput);
    }
}