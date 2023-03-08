package scenario2;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CheckIfLastCharIsALetterTest {

    @Test
    public void test() throws Exception {

        assertEquals(false, scenario2.CheckIfLastCharIsALetter.checkIfLastCharIsALetter("apple"));
        assertEquals(true, scenario2.CheckIfLastCharIsALetter.checkIfLastCharIsALetter("apple pi e"));
        assertEquals(false, scenario2.CheckIfLastCharIsALetter.checkIfLastCharIsALetter("eeeee"));
        assertEquals(true, scenario2.CheckIfLastCharIsALetter.checkIfLastCharIsALetter("A"));
        assertEquals(false, scenario2.CheckIfLastCharIsALetter.checkIfLastCharIsALetter("Pumpkin pie "));
        assertEquals(false, scenario2.CheckIfLastCharIsALetter.checkIfLastCharIsALetter("Pumpkin pie 1"));
        assertEquals(false, scenario2.CheckIfLastCharIsALetter.checkIfLastCharIsALetter(""));
        assertEquals(false, scenario2.CheckIfLastCharIsALetter.checkIfLastCharIsALetter("eeeee e "));
        assertEquals(false, scenario2.CheckIfLastCharIsALetter.checkIfLastCharIsALetter("apple pie"));
        assertEquals(false, scenario2.CheckIfLastCharIsALetter.checkIfLastCharIsALetter("apple pi e "));

    }

}