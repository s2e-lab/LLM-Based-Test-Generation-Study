// SearchTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Search}.
* It contains ten unit test cases for the {@link Search#search(List)} method.
*/
class SearchTest {

	@Test
	void testSearch() {
		assertEquals(2, Search.search(List.of(4, 1, 2, 2, 3, 1)));
		assertEquals(3, Search.search(List.of(1, 2, 2, 3, 3, 3, 4, 4, 4)));
		assertEquals(-1, Search.search(List.of(5, 5, 4, 4, 4)));
		assertEquals(1, Search.search(List.of(5, 5, 5, 5, 1)));
		assertEquals(4, Search.search(List.of(4, 1, 4, 1, 4, 4)));
		assertEquals(-1, Search.search(List.of(3, 3)));
		assertEquals(8, Search.search(List.of(8, 8, 8, 8, 8, 8, 8, 8)));
		assertEquals(2, Search.search(List.of(2, 3, 3, 2, 2)));
		assertEquals(1, Search.search(List.of(2, 7, 8, 8, 4, 8, 7, 3, 9, 6, 5, 10, 4, 3, 6, 7, 1, 7, 4, 10, 8, 1)));
		assertEquals(2, Search.search(List.of(3, 2, 8, 2)));
	}
}