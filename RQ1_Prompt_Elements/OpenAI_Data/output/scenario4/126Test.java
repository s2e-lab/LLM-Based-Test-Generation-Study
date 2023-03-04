// IsSortedTest.java
package scenario3;

import java.util.HashMap;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsSorted}.
* It contains ten unit test cases for the {@link IsSorted#isSorted(List)} method.
*/
class IsSortedTest {

	@Test
	void testIsSorted() {
		HashMap<List<Object>, Boolean> testCases = new HashMap<>();
		testCases.put(List.of(5), true);
		testCases.put(List.of(1, 2, 3, 4, 5), true);
		testCases.put(List.of(1, 3, 2, 4, 5), false);
		testCases.put(List.of(1, 2, 3, 4, 5, 6), true);
		testCases.put(List.of(1, 2, 3, 4, 5, 6, 7), true);
		testCases.put(List.of(1, 3, 2, 4, 5, 6, 7), false);
		testCases.put(List.of(), true);
		testCases.put(List.of(1), true);
		testCases.put(List.of(3, 2, 1), false);
		testCases.put(List.of(1, 2, 2, 2, 3, 4), false);
		testCases.put(List.of(1, 2, 3, 3, 3, 4), false);
		testCases.put(List.of(1, 2, 2, 3, 3, 4), true);
		testCases.put(List.of(1, 2, 3, 4), true);
		
		for (List<Object> lst : testCases.keySet()) {
			assertEquals(testCases.get(lst), IsSorted.isSorted(lst));
		}
	}
}