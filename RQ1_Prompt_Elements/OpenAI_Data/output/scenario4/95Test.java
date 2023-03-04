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
		Map<String, String> dict2 = Map.of("a", "apple", "A", "banana", "B", "banana");
		Map<String, String> dict3 = Map.of("a", "apple", "8", "banana", "a", "apple");
		Map<String, String> dict4 = Map.of("Name", "John", "Age", "36", "City", "Houston");
		Map<String, String> dict5 = Map.of("STATE", "NC", "ZIP", "12345");
		Map<String, String> dict6 = Map.of("p", "pineapple", "b", "banana");
		Map<String, String> dict7 = Map.of("p", "pineapple", "A", "banana", "B", "banana");
		Map<String, String> dict8 = Map.of("p", "pineapple", "5", "banana", "a", "apple");
		Map<String, String> dict9 = Map.of("Name", "John", "Age", "36", "City", "Houston");
		Map<String, String> dict10 = Map.of("STATE", "NC", "ZIP", "12345");
		Map<String, String> dict11 = Map.of("fruit", "Orange", "taste", "Sweet");
		Map<String, String> dict12 = Map.of();
		
		assertTrue(CheckDictCase.checkDictCase(dict1));
		assertFalse(CheckDictCase.checkDictCase(dict2));
		assertFalse(CheckDictCase.checkDictCase(dict3));
		assertFalse(CheckDictCase.checkDictCase(dict4));
		assertTrue(CheckDictCase.checkDictCase(dict5));
		assertTrue(CheckDictCase.checkDictCase(dict6));
		assertFalse(CheckDictCase.checkDictCase(dict7));
		assertFalse(CheckDictCase.checkDictCase(dict8));
		assertFalse(CheckDictCase.checkDictCase(dict9));
		assertTrue(CheckDictCase.checkDictCase(dict10));
		assertTrue(CheckDictCase.checkDictCase(dict11));
		assertFalse(CheckDictCase.checkDictCase(dict12));
	}
}