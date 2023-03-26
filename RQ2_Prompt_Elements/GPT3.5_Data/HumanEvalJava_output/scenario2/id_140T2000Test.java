// FixSpacesTest.java
package scenario2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link FixSpaces}.
 * It contains ten unit test cases for the {@link FixSpaces#fixSpaces(String)} method.
 */
class FixSpacesTest {

    @Test
    void testFixSpaces_emptyString() {
        String input = "";
        String expectedOutput = "";
        String actualOutput = FixSpaces.fixSpaces(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testFixSpaces_singleSpace() {
        String input = " ";
        String expectedOutput = "_";
        String actualOutput = FixSpaces.fixSpaces(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testFixSpaces_multipleSpaces() {
        String input = "   ";
        String expectedOutput = "-";
        String actualOutput = FixSpaces.fixSpaces(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testFixSpaces_noSpaces() {
        String input = "hello";
        String expectedOutput = "hello";
        String actualOutput = FixSpaces.fixSpaces(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testFixSpaces_spacesAtBeginning() {
        String input = "   hello";
        String expectedOutput = "-hello";
        String actualOutput = FixSpaces.fixSpaces(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testFixSpaces_spacesAtEnd() {
        String input = "hello   ";
        String expectedOutput = "hello-";
        String actualOutput = FixSpaces.fixSpaces(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testFixSpaces_spacesInMiddle() {
        String input = "hello   world";
        String expectedOutput = "hello-world";
        String actualOutput = FixSpaces.fixSpaces(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testFixSpaces_multipleSpacesInMiddle() {
        String input = "hello     world";
        String expectedOutput = "hello--world";
        String actualOutput = FixSpaces.fixSpaces(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testFixSpaces_onlySpaces() {
        String input = "     ";
        String expectedOutput = "-";
        String actualOutput = FixSpaces.fixSpaces(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testFixSpaces_mixedSpacesAndCharacters() {
        String input = "h e l l o   w o r l d";
        String expectedOutput = "h_e_l_l_o-world";
        String actualOutput = FixSpaces.fixSpaces(input);
        assertEquals(expectedOutput, actualOutput);
    }
}