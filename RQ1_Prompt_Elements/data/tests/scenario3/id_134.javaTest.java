package scenario3;


import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CheckIfLastCharIsALetterTest {

    @Test
    public void test() throws Exception{

        assertEquals(false, scenario3.CheckIfLastCharIsALetter.checkIfLastCharIsALetter("apple"));
		assertEquals(true, scenario3.CheckIfLastCharIsALetter.checkIfLastCharIsALetter("apple pi e"));
		assertEquals(false, scenario3.CheckIfLastCharIsALetter.checkIfLastCharIsALetter("eeeee"));
		assertEquals(true, scenario3.CheckIfLastCharIsALetter.checkIfLastCharIsALetter("A"));
		assertEquals(false, scenario3.CheckIfLastCharIsALetter.checkIfLastCharIsALetter("Pumpkin pie "));
		assertEquals(false, scenario3.CheckIfLastCharIsALetter.checkIfLastCharIsALetter("Pumpkin pie 1"));
		assertEquals(false, scenario3.CheckIfLastCharIsALetter.checkIfLastCharIsALetter(""));
		assertEquals(false, scenario3.CheckIfLastCharIsALetter.checkIfLastCharIsALetter("eeeee e "));
		assertEquals(false, scenario3.CheckIfLastCharIsALetter.checkIfLastCharIsALetter("apple pie"));
		assertEquals(false, scenario3.CheckIfLastCharIsALetter.checkIfLastCharIsALetter("apple pi e "));
		
    }

}