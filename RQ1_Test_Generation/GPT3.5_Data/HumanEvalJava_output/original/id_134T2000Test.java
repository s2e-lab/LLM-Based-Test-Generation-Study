// CheckIfLastCharIsALetterTest.java
package updated;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link CheckIfLastCharIsALetter}.
 * It contains ten unit test cases for the {@link CheckIfLastCharIsALetter#checkIfLastCharIsALetter(String)} method.
 */
class CheckIfLastCharIsALetterTest {

    @Test
    void testEmptyString() {
        assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter(""));
    }

    @Test
    void testSingleLetter() {
        assertTrue(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("A"));
    }

    @Test
    void testSingleNonLetter() {
        assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("1"));
    }

    @Test
    void testSingleLetterInWord() {
        assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("apple"));
    }

    @Test
    void testSingleNonLetterInWord() {
        assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("apple1"));
    }

    @Test
    void testLetterWithSpace() {
        assertTrue(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("A "));
    }

    @Test
    void testNonLetterWithSpace() {
        assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("1 "));
    }

    @Test
    void testLetterWithMultipleSpaces() {
        assertTrue(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("A  "));
    }

    @Test
    void testNonLetterWithMultipleSpaces() {
        assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("1  "));
    }

    @Test
    void testLetterNotPartOfWord() {
        assertTrue(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("apple pi e "));
    }
}