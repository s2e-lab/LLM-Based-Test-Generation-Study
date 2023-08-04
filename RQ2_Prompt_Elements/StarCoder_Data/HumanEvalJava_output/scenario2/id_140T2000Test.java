// FixSpacesTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FixSpaces}.
* It contains ten unit test cases for the {@link FixSpaces#fixSpaces(String)} method.
*/
class FixSpacesTest {

    /**
     * Test case for the {@link FixSpaces#fixSpaces(String)} method.
     * It tests the case when the input string is empty.
     */
    @Test
    void testFixSpaces_Empty() {
        String text = "";
        String expected = "";
        String actual = FixSpaces.fixSpaces(text);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link FixSpaces#fixSpaces(String)} method.
     * It tests the case when the input string has only one character.
     */
    @Test
    void testFixSpaces_OneChar() {
        String text = "a";
        String expected = "a";
        String actual = FixSpaces.fixSpaces(text);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link FixSpaces#fixSpaces(String)} method.
     * It tests the case when the input string has only one space.
     */
    @Test
    void testFixSpaces_OneSpace() {
        String text = " ";
        String expected = "_";
        String actual = FixSpaces.fixSpaces(text);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link FixSpaces#fixSpaces(String)} method.
     * It tests the case when the input string has only two spaces.
     */
    @Test
    void testFixSpaces_TwoSpaces() {
        String text = "  ";
        String expected = "__";
        String actual = FixSpaces.fixSpaces(text);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link FixSpaces#fixSpaces(String)} method.
     * It tests the case when the input string has only three spaces.
     */
    @Test
    void testFixSpaces_ThreeSpaces() {
        String text = "   ";
        String expected = "___";
        String actual = FixSpaces.fixSpaces(text);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link FixSpaces#fixSpaces(String)} method.
     * It tests the case when the input string has only four spaces.
     */
    @Test
    void testFixSpaces_FourSpaces() {
        String text = "    ";
        String expected = "____";
        String actual = FixSpaces.fixSpaces(text);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link FixSpaces#fixSpaces(String)} method.
     * It tests the case when the input string has only five spaces.
     */
    @Test
    void testFixSpaces_FiveSpaces() {
        String text = "     ";
        String expected = "_____";
        String actual = FixSpaces.fixSpaces(text);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link FixSpaces#fixSpaces(String)} method.
     * It tests the case when the input string has only six spaces.
     */
    @Test
    void testFixSpaces_SixSpaces() {
        String text = "      ";
        String expected = "______";
        String actual = FixSpaces.fixSpaces(text);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link FixSpaces#fixSpaces(String)} method.
     * It tests the case when the input string has only seven spaces.
     */
    @Test
    void testFixSpaces_SevenSpaces() {
        String text = "       ";
        String expected = "_______";
        String actual = FixSpaces.fixSpaces(text);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link FixSpaces#fixSpaces(String)} method.
     * It tests the case when the input string has only eight spaces.
     */
    @Test
    void testFixSpaces_EightSpaces() {
        String text = "        ";
        String expected = "________";
        String actual = FixSpaces.fixSpaces(text);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link FixSpaces#fixSpaces(String)} method.
     * It tests the case when the input string has only nine spaces.
     */
    @Test
    void testFixSpaces_NineSpaces() {
        String text = "         ";
        String expected = "_________";
        String actual = FixSpaces.fixSpaces(text);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link FixSpaces#fixSpaces(String)} method.
     * It tests the case when the input string has only ten spaces.
     */
    @Test
    void testFixSpaces_TenSpaces() {
        String text = "          ";
        String expected = "__________";
        String actual = FixSpaces.fixSpaces(text);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link FixSpaces#fixSpaces(String)} method.
     * It tests the case when the input string has only eleven spaces.
     */
    @Test
    void testFixSpaces_ElevenSpaces() {
        String text = "           ";
        String expected = "___________";
        String actual = FixSpaces.fixSpaces(text);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link FixSpaces#fixSpaces(String)} method.
     * It tests the case when the input string has only twelve spaces.
     */
    @Test
    void testFixSpaces_TwelveSpaces() {
        String text = "            ";
        String expected = "____________";
        String actual = FixSpaces.fixSpaces(text);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link FixSpaces#fixSpaces(String)} method.
     * It tests the case when the input string has only thirteen spaces.
     */
    @Test
    void testFixSpaces_ThirteenSpaces() {
        String text = "             ";
        String expected = "_____________";
        String actual = FixSpaces.fixSpaces(text);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link FixSpaces#fixSpaces(String)} method.
     * It tests the case when the input string has only fourteen spaces.
     */
    @Test
    void testFixSpaces_FourteenSpaces() {
        String text = "              ";
        String expected = "______________";
        String actual = FixSpaces.fixSpaces(text);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link FixSpaces#fixSpaces(String)} method.
     * It tests the case when the input string has only fifteen spaces.
     */
    @Test
    void testFixSpaces_FifteenSpaces() {
        String text = "               ";
        String expected = "_______________";
        String actual = FixSpaces.fixSpaces(text);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link FixSpaces#fixSpaces(String)} method.
     * It tests the case when the input string has only sixteen spaces.
     */
    @Test
    void testFixSpaces_SixteenSpaces() {
        String text = "                ";
        String expected = "________________";
        String actual = FixSpaces.fixSpaces(text);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link FixSpaces#fixSpaces(String)} method.
     * It tests the case when the input string has only seventeen spaces.
     */
    @Test
    void testFixSpaces_SeventeenSpaces() {
        String text = "                 ";
        String expected = "_________________";
        String actual = FixSpaces.fixSpaces(text);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link FixSpaces#fixSpaces(String)} method.
     * It tests the case when the input string has only eighteen spaces.
     */
    @Test
    void testFixSpaces_EighteenSpaces() {
        String text = "                  ";
        String expected = "__________________";
        String actual = FixSpaces.fixSpaces(text);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link FixSpaces#fixSpaces(String)} method.
     * It tests the case when the input string has only nineteen spaces.
     */
    @Test
    void testFixSpaces_NineteenSpaces() {
        String text = "                   ";
        String expected = "___________________";
        String actual = FixSpaces.fixSpaces(text);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link FixSpaces#fixSpaces(String)} method.
     * It tests the case when the input string has only twenty spaces.
     */
    @Test
    void testFixSpaces_TwentySpaces() {
        String text = "                    ";
        String expected = "____________________";
        String actual = FixSpaces.fixSpaces(text);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link FixSpaces#fixSpaces(String)} method.
     * It tests the case when the input string has only twenty-one spaces.
     */
    @Test
    void testFixSpaces_TwentyOneSpaces() {
        String text = "                     ";
        String expected = "_____________________";
        String actual = FixSpaces.fixSpaces(text);
        assertEquals(expected, actual);
    }

   