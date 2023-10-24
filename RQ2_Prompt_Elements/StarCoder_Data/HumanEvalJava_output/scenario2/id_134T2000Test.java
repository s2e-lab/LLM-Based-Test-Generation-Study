// CheckIfLastCharIsALetterTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CheckIfLastCharIsALetter}.
* It contains ten unit test cases for the {@link CheckIfLastCharIsALetter#checkIfLastCharIsALetter(String)} method.
*/
class CheckIfLastCharIsALetterTest {

    /**
     * Test case for the {@link CheckIfLastCharIsALetter#checkIfLastCharIsALetter(String)} method.
     * It checks if the last character of a given string is an alphabetical character and is not
     * a part of a word, and returns True.
     */
    @Test
    void testCheckIfLastCharIsALetter1() {
        String txt = "a";
        assertTrue(CheckIfLastCharIsALetter.checkIfLastCharIsALetter(txt));
    }

    /**
     * Test case for the {@link CheckIfLastCharIsALetter#checkIfLastCharIsALetter(String)} method.
     * It checks if the last character of a given string is an alphabetical character and is not
     * a part of a word, and returns True.
     */
    @Test
    void testCheckIfLastCharIsALetter2() {
        String txt = "a ";
        assertTrue(CheckIfLastCharIsALetter.checkIfLastCharIsALetter(txt));
    }

    /**
     * Test case for the {@link CheckIfLastCharIsALetter#checkIfLastCharIsALetter(String)} method.
     * It checks if the last character of a given string is an alphabetical character and is not
     * a part of a word, and returns True.
     */
    @Test
    void testCheckIfLastCharIsALetter3() {
        String txt = "a b";
        assertTrue(CheckIfLastCharIsALetter.checkIfLastCharIsALetter(txt));
    }

    /**
     * Test case for the {@link CheckIfLastCharIsALetter#checkIfLastCharIsALetter(String)} method.
     * It checks if the last character of a given string is an alphabetical character and is not
     * a part of a word, and returns True.
     */
    @Test
    void testCheckIfLastCharIsALetter4() {
        String txt = "a b ";
        assertTrue(CheckIfLastCharIsALetter.checkIfLastCharIsALetter(txt));
    }

    /**
     * Test case for the {@link CheckIfLastCharIsALetter#checkIfLastCharIsALetter(String)} method.
     * It checks if the last character of a given string is an alphabetical character and is not
     * a part of a word, and returns True.
     */
    @Test
    void testCheckIfLastCharIsALetter5() {
        String txt = "a b c";
        assertTrue(CheckIfLastCharIsALetter.checkIfLastCharIsALetter(txt));
    }

    /**
     * Test case for the {@link CheckIfLastCharIsALetter#checkIfLastCharIsALetter(String)} method.
     * It checks if the last character of a given string is an alphabetical character and is not
     * a part of a word, and returns True.
     */
    @Test
    void testCheckIfLastCharIsALetter6() {
        String txt = "a b c ";
        assertTrue(CheckIfLastCharIsALetter.checkIfLastCharIsALetter(txt));
    }

    /**
     * Test case for the {@link CheckIfLastCharIsALetter#checkIfLastCharIsALetter(String)} method.
     * It checks if the last character of a given string is an alphabetical character and is not
     * a part of a word, and returns True.
     */
    @Test
    void testCheckIfLastCharIsALetter7() {
        String txt = "a b c d";
        assertTrue(CheckIfLastCharIsALetter.checkIfLastCharIsALetter(txt));
    }

    /**
     * Test case for the {@link CheckIfLastCharIsALetter#checkIfLastCharIsALetter(String)} method.
     * It checks if the last character of a given string is an alphabetical character and is not
     * a part of a word, and returns True.
     */
    @Test
    void testCheckIfLastCharIsALetter8() {
        String txt = "a b c d ";
        assertTrue(CheckIfLastCharIsALetter.checkIfLastCharIsALetter(txt));
    }

    /**
     * Test case for the {@link CheckIfLastCharIsALetter#checkIfLastCharIsALetter(String)} method.
     * It checks if the last character of a given string is an alphabetical character and is not
     * a part of a word, and returns True.
     */
    @Test
    void testCheckIfLastCharIsALetter9() {
        String txt = "a b c d e";
        assertTrue(CheckIfLastCharIsALetter.checkIfLastCharIsALetter(txt));
    }

    /**
     * Test case for the {@link CheckIfLastCharIsALetter#checkIfLastCharIsALetter(String)} method.
     * It checks if the last character of a given string is an alphabetical character and is not
     * a part of a word, and returns True.
     */
    @Test
    void testCheckIfLastCharIsALetter10() {
        String txt = "a b c d e ";
        assertTrue(CheckIfLastCharIsALetter.checkIfLastCharIsALetter(txt));
    }

    /**
     * Test case for the {@link CheckIfLastCharIsALetter#checkIfLastCharIsALetter(String)} method.
     * It checks if the last character of a given string is an alphabetical character and is not
     * a part of a word, and returns False.
     */
    @Test
    void testCheckIfLastCharIsALetter11() {
        String txt = "a b c d e f";
        assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter(txt));
    }

    /**
     * Test case for the {@link CheckIfLastCharIsALetter#checkIfLastCharIsALetter(String)} method.
     * It checks if the last character of a given string is an alphabetical character and is not
     * a part of a word, and returns False.
     */
    @Test
    void testCheckIfLastCharIsALetter12() {
        String txt = "a b c d e f ";
        assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter(txt));
    }

    /**
     * Test case for the {@link CheckIfLastCharIsALetter#checkIfLastCharIsALetter(String)} method.
     * It checks if the last character of a given string is an alphabetical character and is not
     * a part of a word, and returns False.
     */
    @Test
    void testCheckIfLastCharIsALetter13() {
        String txt = "a b c d e f g";
        assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter(txt));
    }

    /**
     * Test case for the {@link CheckIfLastCharIsALetter#checkIfLastCharIsALetter(String)} method.
     * It checks if the last character of a given string is an alphabetical character and is not
     * a part of a word, and returns False.
     */
    @Test
    void testCheckIfLastCharIsALetter14() {
        String txt = "a b c d e f g ";
        assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter(txt));
    }

    /**
     * Test case for the {@link CheckIfLastCharIsALetter#checkIfLastCharIsALetter(String)} method.
     * It checks if the last character of a given string is an alphabetical character and is not
     * a part of a word, and returns False.
     */
    @Test
    void testCheckIfLastCharIsALetter15() {
        String txt = "a b c d e f g h";
        assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter(txt));
    }

    /**
     * Test case for the {@link CheckIfLastCharIsALetter#checkIfLastCharIsALetter(String)} method.
     * It checks if the last character of a given string is an alphabetical character and is not
     * a part of a word, and returns False.
     */
    @Test
    void testCheckIfLastCharIsALetter16() {
        String txt = "a b c d e f g h ";
        assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter(txt));
    }

    /**
     * Test case for the {@link CheckIfLastCharIsALetter#checkIfLastCharIsALetter(String)} method.
     * It checks if the last character of a given string is an alphabetical character and is not
     * a part of a word, and returns False.
     */
    @Test
    void testCheckIfLastCharIsALetter17() {
        String txt = "a b c d e f g h