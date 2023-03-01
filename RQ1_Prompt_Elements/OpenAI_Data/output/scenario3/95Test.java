// CheckDictCaseTest.java
package scenario3;

import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CheckDictCase}.
* It contains ten unit test cases for the {@link CheckDictCase#checkDictCase(Object)} method.
*/
class CheckDictCaseTest {

	@Test
	void testCheckDictCase() {
		Map<String, String> dict1 = Map.of("a", "apple", "b", "banana");
		assertTrue(CheckDictCase.checkDictCase(dict1));
		
		Map<String, String> dict2 = Map.of("a", "apple", "A", "banana", "B", "banana");
		assertFalse(CheckDictCase.checkDictCase(dict2));
		
		Map<String, String> dict3 = Map.of("a", "apple", "8", "banana", "a", "apple");
		assertFalse(CheckDictCase.checkDictCase(dict3));
		
		Map<String, String> dict4 = Map.of("Name", "John", "Age", "36", "City", "Houston");
		assertFalse(CheckDictCase.checkDictCase(dict4));
		
		Map<String, String> dict5 = Map.of("STATE", "NC", "ZIP", "12345");
		assertTrue(CheckDictCase.checkDictCase(dict5));
		
		Map<String, String> dict6 = Map.of("fruit", "Orange", "taste", "Sweet");
		assertTrue(CheckDictCase.checkDictCase(dict6));
		
		Map<String, String> dict7 = Map.of();
		assertFalse(CheckDictCase.checkDictCase(dict7));
		
		Map<String, String> dict8 = Map.of("p", "pineapple", "b", "banana");
		assertTrue(CheckDictCase.checkDictCase(dict8));
		
		Map<String, String> dict9 = Map.of("p", "pineapple", "A", "banana", "B", "banana");
		assertFalse(CheckDictCase.checkDictCase(dict9));
		
		Map<String, String> dict10 = Map.of("p", "pineapple", "5", "banana", "a", "apple");
		assertFalse(CheckDictCase.checkDictCase(dict10));
	}
}