package Part3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
class CheckIfLastCharIsALetterTest {
    @Test
    void testCheckIfLastCharIsALetter() {
        assertEquals(false, CheckIfLastCharIsALetter.checkIfLastCharIsALetter("apple"));
        assertEquals(true, CheckIfLastCharIsALetter.checkIfLastCharIsALetter("apple pi e"));
        assertEquals(false, CheckIfLastCharIsALetter.checkIfLastCharIsALetter("eeeee"));
        assertEquals(true, CheckIfLastCharIsALetter.checkIfLastCharIsALetter("A"));
        assertEquals(false, CheckIfLastCharIsALetter.checkIfLastCharIsALetter("Pumpkin pie "));
        assertEquals(false, CheckIfLastCharIsALetter.checkIfLastCharIsALetter("Pumpkin pie 1"));
        assertEquals(false, CheckIfLastCharIsALetter.checkIfLastCharIsALetter(""));
        assertEquals(false, CheckIfLastCharIsALetter.checkIfLastCharIsALetter("eeeee e "));
        assertEquals(false, CheckIfLastCharIsALetter.checkIfLastCharIsALetter("apple pie"));
        assertEquals(false, CheckIfLastCharIsALetter.checkIfLastCharIsALetter("apple pi e "));
    }
}