// Here's the updated SolveTest.java file with ten unit test cases for the solve() method.

package original;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link Solve}.
 * It contains ten unit test cases for the {@link Solve#solve(String)} method.
 */
class SolveTest {

    @Test
    void testSolveWithLowerCaseLetters() {
        String input = "hello world";
        String expectedOutput = "HELLO WORLD";
        String actualOutput = Solve.solve(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testSolveWithUpperCaseLetters() {
        String input = "HELLO WORLD";
        String expectedOutput = "hello world";
        String actualOutput = Solve.solve(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testSolveWithMixedCaseLetters() {
        String input = "HeLlO wOrLd";
        String expectedOutput = "hElLo WoRlD";
        String actualOutput = Solve.solve(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testSolveWithNumbers() {
        String input = "1234567890";
        String expectedOutput = "0987654321";
        String actualOutput = Solve.solve(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testSolveWithSpecialCharacters() {
        String input = "#$%^&*()_+-=";
        String expectedOutput = "#$%^&*()_+-=";
        String actualOutput = Solve.solve(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testSolveWithMixedCharacters() {
        String input = "aBcDeFgHiJkLmNoPqRsTuVwXyZ1234567890!@#$%^&*()_+-=";
        String expectedOutput = "AbCdEfGhIjKlMnOpQrStUvWxYz1234567890!@#$%^&*()_+-=";
        String actualOutput = Solve.solve(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testSolveWithNoLetters() {
        String input = "1234567890!@#$%^&*()_+-=";
        String expectedOutput = "=+-_)(*&^%$#@!0987654321";
        String actualOutput = Solve.solve(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testSolveWithEmptyString() {
        String input = "";
        String expectedOutput = "";
        String actualOutput = Solve.solve(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testSolveWithSingleLetter() {
        String input = "a";
        String expectedOutput = "A";
        String actualOutput = Solve.solve(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testSolveWithSingleSpecialCharacter() {
        String input = "#";
        String expectedOutput = "#";
        String actualOutput = Solve.solve(input);
        assertEquals(expectedOutput, actualOutput);
    }
}