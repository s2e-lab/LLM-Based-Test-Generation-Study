// CheckIfLastCharIsALetterTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CheckIfLastCharIsALetter}.
* It contains ten unit test cases for the {@link CheckIfLastCharIsALetter#checkIfLastCharIsALetter(String)} method.
*/
class CheckIfLastCharIsALetterTest {

    /**
    * Test case for {@link CheckIfLastCharIsALetter#checkIfLastCharIsALetter(String)}.
    */
    @Test
    void testCheckIfLastCharIsALetter() {
        assertTrue(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("apple pie"));
        assertTrue(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("apple pi e"));
        assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("apple pi e "));
        assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter(""));
        assertTrue(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("eeeee"));
        assertTrue(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("A"));
        assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("Pumpkin pie "));
        assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("Pumpkin pie 1"));
        assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter(""));
        assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("eeeee e "));
        assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("apple pie"));
        assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("apple pi e "));
    }
}
