// MedianTest.java
package scenario3;

import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Median}.
* It contains ten unit test cases for the {@link Median#median(List)} method.
*/
class MedianTest {

	@Test
	void testMedian() {
		List<Integer> l = List.of(3, 1, 2, 4, 5);
		assertEquals(3, Median.median(l));
		
		l = List.of(-10, 4, 6, 1000, 10, 20);
		assertEquals(8.0, Median.median(l));
		
		l = List.of(5);
		assertEquals(5, Median.median(l));
		
		l = List.of(6, 5);
		assertEquals(5.5, Median.median(l));
		
		l = List.of(8, 1, 3, 9, 9, 2, 7);
		assertEquals(7, Median.median(l));
		
		l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		assertEquals(5.5, Median.median(l));
		
		l = List.of(10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
		assertEquals(5.5, Median.median(l));
		
		l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
		assertEquals(6, Median.median(l));
		
		l = List.of(11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
		assertEquals(6, Median.median(l));
		
		l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
		assertEquals(6.5, Median.median(l));
	}
}