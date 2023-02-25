package scenario2;

import java.util.Map;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CheckDictCaseTest {

    @Test
    public void test() throws Exception{

        assertEquals(true, scenario2.CheckDictCase.checkDictCase(Map.of("p", "pineapple", "b", "banana")));
		assertEquals(false, scenario2.CheckDictCase.checkDictCase(Map.of("p", "pineapple", "A", "banana", "B", "banana")));
		assertEquals(false, scenario2.CheckDictCase.checkDictCase(Map.of("p", "pineapple", 5, "banana", "a", "apple")));
		assertEquals(false, scenario2.CheckDictCase.checkDictCase(Map.of("Name", "John", "Age", "36", "City", "Houston")));
		assertEquals(true, scenario2.CheckDictCase.checkDictCase(Map.of("STATE", "NC", "ZIP", "12345")));
		assertEquals(true, scenario2.CheckDictCase.checkDictCase(Map.of("fruit", "Orange", "taste", "Sweet")));
		assertEquals(false, scenario2.CheckDictCase.checkDictCase(Map.of()));
		
    }

}