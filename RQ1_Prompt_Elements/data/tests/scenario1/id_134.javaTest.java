package scenario1;


import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CheckIfLastCharIsALetterTest {

    @Test
    public void test() throws Exception{
        assertEquals(false, scenario1.CheckIfLastCharIsALetter.checkIfLastCharIsALetter("apple"));
		assertEquals(true, scenario1.CheckIfLastCharIsALetter.checkIfLastCharIsALetter("apple pi e"));
		assertEquals(false, scenario1.CheckIfLastCharIsALetter.checkIfLastCharIsALetter("eeeee"));
		assertEquals(true, scenario1.CheckIfLastCharIsALetter.checkIfLastCharIsALetter("A"));
		assertEquals(false, scenario1.CheckIfLastCharIsALetter.checkIfLastCharIsALetter("Pumpkin pie "));
		assertEquals(false, scenario1.CheckIfLastCharIsALetter.checkIfLastCharIsALetter("Pumpkin pie 1"));
		assertEquals(false, scenario1.CheckIfLastCharIsALetter.checkIfLastCharIsALetter(""));
		assertEquals(false, scenario1.CheckIfLastCharIsALetter.checkIfLastCharIsALetter("eeeee e "));
		assertEquals(false, scenario1.CheckIfLastCharIsALetter.checkIfLastCharIsALetter("apple pie"));
		assertEquals(false, scenario1.CheckIfLastCharIsALetter.checkIfLastCharIsALetter("apple pi e "));
		assertEquals(public static Boolean checkIfLastCharIsALetter(String txt) {, scenario1.CheckIfLastCharIsALetter.*/);
		
    }

}