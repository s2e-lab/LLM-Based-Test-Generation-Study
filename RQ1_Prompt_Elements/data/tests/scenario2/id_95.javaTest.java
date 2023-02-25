package scenario2;

import java.util.Map;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CheckDictCaseTest {

    @Test
    public void test() throws Exception{
        assertEquals(true, scenario2.CheckDictCase.checkDictCase({"p": "pineapple", "b": "banana"}));
		assertEquals(false, scenario2.CheckDictCase.checkDictCase({"p": "pineapple", "A": "banana", "B": "banana"}));
		assertEquals(false, scenario2.CheckDictCase.checkDictCase({"p": "pineapple", 5: "banana", "a": "apple"}));
		assertEquals(false, scenario2.CheckDictCase.checkDictCase({"Name": "John", "Age": "36", "City": "Houston"}));
		assertEquals(true, scenario2.CheckDictCase.checkDictCase({"STATE": "NC", "ZIP": "12345"}));
		assertEquals(true, scenario2.CheckDictCase.checkDictCase({"fruit": "Orange", "taste": "Sweet"}));
		assertEquals(false, scenario2.CheckDictCase.checkDictCase({}));
		assertEquals(public static Boolean checkDictCase(Object dict) {, scenario2.CheckDictCase.*/);
		
    }

}