// Here's the complete code for the FixSpacesTest class:

package scenario1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link FixSpaces}.
 * It contains ten unit test cases for the {@link FixSpaces#fixSpaces(String)} method.
 */
class FixSpacesTest {

    @Test
    void testEmptyString() {
        String input = "";
        String expectedOutput = "";
        String actualOutput = FixSpaces.fixSpaces(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testSingleWord() {
        String input = "hello";
        String expectedOutput = "hello";
        String actualOutput = FixSpaces.fixSpaces(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testTwoWords() {
        String input = "hello world";
        String expectedOutput = "hello_world";
        String actualOutput = FixSpaces.fixSpaces(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testThreeWords() {
        String input = "hello big world";
        String expectedOutput = "hello_big-world";
        String actualOutput = FixSpaces.fixSpaces(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testFourWords() {
        String input = "hello big beautiful world";
        String expectedOutput = "hello_big-beautiful_world";
        String actualOutput = FixSpaces.fixSpaces(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testMultipleSpaces() {
        String input = "hello    world";
        String expectedOutput = "hello___world";
        String actualOutput = FixSpaces.fixSpaces(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testLeadingSpaces() {
        String input = "   hello world";
        String expectedOutput = "___hello_world";
        String actualOutput = FixSpaces.fixSpaces(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testTrailingSpaces() {
        String input = "hello world   ";
        String expectedOutput = "hello_world___";
        String actualOutput = FixSpaces.fixSpaces(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testMixedSpaces() {
        String input = "hello   big  world";
        String expectedOutput = "hello___big__world";
        String actualOutput = FixSpaces.fixSpaces(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testSpecialCharacters() {
        String input = "hello!@#$%^&*()_+world";
        String expectedOutput = "hello!@#$%^&*()_+world";
        String actualOutput = FixSpaces.fixSpaces(input);
        assertEquals(expectedOutput, actualOutput);
    }
}