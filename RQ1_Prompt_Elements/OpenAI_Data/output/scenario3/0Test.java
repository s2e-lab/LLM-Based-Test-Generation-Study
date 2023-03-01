// HasCloseElementsTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HasCloseElements}.
* It contains ten unit test cases for the {@link HasCloseElements#hasCloseElements(List, Double)} method.
*/
class HasCloseElementsTest {

	@Test
	void testHasCloseElements() {
		List<Double> numbers = List.of(1.0, 2.0, 3.0);
		Double threshold = 0.5;
		assertFalse(HasCloseElements.hasCloseElements(numbers, threshold));
		
		numbers = List.of(1.0, 2.8, 3.0, 4.0, 5.0, 2.0);
		threshold = 0.3;
		assertTrue(HasCloseElements.hasCloseElements(numbers, threshold));
		
		numbers = List.of(1.0, 2.0, 3.9, 4.0, 5.0, 2.2);
		threshold = 0.3;
		assertTrue(HasCloseElements.hasCloseElements(numbers, threshold));
		
		numbers = List.of(1.0, 2.0, 3.9, 4.0, 5.0, 2.2);
		threshold = 0.05;
		assertFalse(HasCloseElements.hasCloseElements(numbers, threshold));
		
		numbers = List.of(1.0, 2.0, 5.9, 4.0, 5.0);
		threshold = 0.95;
		assertTrue(HasCloseElements.hasCloseElements(numbers, threshold));
		
		numbers = List.of(1.0, 2.0, 5.9, 4.0, 5.0);
		threshold = 0.8;
		assertFalse(HasCloseElements.hasCloseElements(numbers, threshold));
		
		numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 2.0);
		threshold = 0.1;
		assertTrue(HasCloseElements.hasCloseElements(numbers, threshold));
		
		numbers = List.of(1.1, 2.2, 3.1, 4.1, 5.1);
		threshold = 1.0;
		assertTrue(HasCloseElements.hasCloseElements(numbers, threshold));
		
		numbers = List.of(1.1, 2.2, 3.1, 4.1, 5.1);
		threshold = 0.5;
		assertFalse(HasCloseElements.hasCloseElements(numbers, threshold));
	}
}