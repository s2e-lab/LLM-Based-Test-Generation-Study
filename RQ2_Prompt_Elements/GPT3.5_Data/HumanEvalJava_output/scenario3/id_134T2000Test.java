// CheckIfLastCharIsALetter.java
package scenario3;

class CheckIfLastCharIsALetter {

    /**
     * * Create a function that returns True if the last character
     * of a given string is an alphabetical character and is not
     * a part of a word, and False otherwise.
     * Note: "word" is a group of characters separated by space.
     *
     * Examples:
     * checkIfLastCharIsALetter("apple pie") ➞ False
     * checkIfLastCharIsALetter("apple pi e") ➞ True
     * checkIfLastCharIsALetter("apple pi e ") ➞ False
     * checkIfLastCharIsALetter("") ➞ False
     *
     * > checkIfLastCharIsALetter("apple")
     * false
     * > checkIfLastCharIsALetter("apple pi e")
     * true
     * > checkIfLastCharIsALetter("eeeee")
     * false
     * > checkIfLastCharIsALetter("A")
     * true
     * > checkIfLastCharIsALetter("Pumpkin pie ")
     * false
     * > checkIfLastCharIsALetter("Pumpkin pie 1")
     * false
     * > checkIfLastCharIsALetter("")
     * false
     * > checkIfLastCharIsALetter("eeeee e ")
     * false
     * > checkIfLastCharIsALetter("apple pie")
     * false
     * > checkIfLastCharIsALetter("apple pi e ")
     * false
     */
    public static Boolean checkIfLastCharIsALetter(String txt) {
        if (txt == null || txt.isEmpty()) {
            return false;
        }
        String[] words = txt.split(" ");
        String lastWord = words[words.length - 1];
        if (lastWord.isEmpty()) {
            lastWord = words[words.length - 2];
        }
        char lastChar = lastWord.charAt(lastWord.length() - 1);
        return Character.isLetter(lastChar) && !lastWord.substring(0, lastWord.length() - 1).matches(".*[a-zA-Z]+.*");
    }
}

// CheckIfLastCharIsALetterTest.java
package scenario3;


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
    void testSingleWord() {
        assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("apple"));
    }

    @Test
    void testSingleWordWithSpace() {
        assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("apple "));
    }

    @Test
    void testSingleWordWithNumber() {
        assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("apple1"));
    }

    @Test
    void testSingleWordWithSpecialCharacter() {
        assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("apple!"));
    }

    @Test
    void testMultipleWordsWithSpace() {
        assertTrue(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("apple pi e"));
    }

    @Test
    void testMultipleWordsWithSpaceAndNumber() {
        assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("Pumpkin pie 1"));
    }

    @Test
    void testMultipleWordsWithSpaceAndSpecialCharacter() {
        assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("Pumpkin pie!"));
    }

    @Test
    void testMultipleWordsWithSpaceAndTrailingSpace() {
        assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("apple pi e "));
    }
}