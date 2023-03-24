// Here's the generated source code for the FixSpacesTest class:

package generated;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link original.FixSpaces}.
 * It contains ten unit test cases for the {@link original.FixSpaces#fixSpaces(String)} method.
 */
class FixSpacesTest {

    @Test
    void testFixSpaces_noSpaces() {
        String input = "Example";
        String expectedOutput = "Example";
        String actualOutput = original.FixSpaces.fixSpaces(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testFixSpaces_oneSpace() {
        String input = "Example 1";
        String expectedOutput = "Example_1";
        String actualOutput = original.FixSpaces.fixSpaces(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testFixSpaces_leadingSpace() {
        String input = " Example 2";
        String expectedOutput = "_Example_2";
        String actualOutput = original.FixSpaces.fixSpaces(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testFixSpaces_multipleSpaces() {
        String input = " Example   3";
        String expectedOutput = "_Example-3";
        String actualOutput = original.FixSpaces.fixSpaces(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testFixSpaces_trailingSpaces() {
        String input = "Mudasir Hanif ";
        String expectedOutput = "Mudasir_Hanif_";
        String actualOutput = original.FixSpaces.fixSpaces(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testFixSpaces_multipleWords() {
        String input = "Yellow Yellow  Dirty  Fellow";
        String expectedOutput = "Yellow_Yellow__Dirty__Fellow";
        String actualOutput = original.FixSpaces.fixSpaces(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testFixSpaces_multipleSpacesBetweenWords() {
        String input = "Exa   mple";
        String expectedOutput = "Exa-mple";
        String actualOutput = original.FixSpaces.fixSpaces(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testFixSpaces_spacesBeforeAndAfterWords() {
        String input = "   Exa 1 2 2 mple";
        String expectedOutput = "-Exa_1_2_2_mple";
        String actualOutput = original.FixSpaces.fixSpaces(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testFixSpaces_allSpaces() {
        String input = "   ";
        String expectedOutput = "-";
        String actualOutput = original.FixSpaces.fixSpaces(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testFixSpaces_emptyString() {
        String input = "";
        String expectedOutput = "";
        String actualOutput = original.FixSpaces.fixSpaces(input);
        assertEquals(expectedOutput, actualOutput);
    }
}