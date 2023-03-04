// FindClosestElementsTest.java
package scenario3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FindClosestElements}.
* It contains ten unit test cases for the {@link FindClosestElements#findClosestElements(List)} method.
*/
class FindClosestElementsTest {

	@Test
	void testFindClosestElements() {
		List<Double> numbers = new ArrayList<>();
		numbers.add(1.0);
		numbers.add(2.0);
		numbers.add(3.9);
		numbers.add(4.0);
		numbers.add(5.0);
		numbers.add(2.2);
		List<Double> expected = new ArrayList<>();
		expected.add(3.9);
		expected.add(4.0);
		assertEquals(expected, FindClosestElements.findClosestElements(numbers));
		
		numbers = new ArrayList<>();
		numbers.add(1.0);
		numbers.add(2.0);
		numbers.add(5.9);
		numbers.add(4.0);
		numbers.add(5.0);
		expected = new ArrayList<>();
		expected.add(5.0);
		expected.add(5.9);
		assertEquals(expected, FindClosestElements.findClosestElements(numbers));
		
		numbers = new ArrayList<>();
		numbers.add(1.0);
		numbers.add(2.0);
		numbers.add(3.0);
		numbers.add(4.0);
		numbers.add(5.0);
		numbers.add(2.2);
		expected = new ArrayList<>();
		expected.add(2.0);
		expected.add(2.2);
		assertEquals(expected, FindClosestElements.findClosestElements(numbers));
		
		numbers = new ArrayList<>();
		numbers.add(1.0);
		numbers.add(2.0);
		numbers.add(3.0);
		numbers.add(4.0);
		numbers.add(5.0);
		numbers.add(2.0);
		expected = new ArrayList<>();
		expected.add(2.0);
		expected.add(2.0);
		assertEquals(expected, FindClosestElements.findClosestElements(numbers));
		
		numbers = new ArrayList<>();
		numbers.add(1.1);
		numbers.add(2.2);
		numbers.add(3.1);
		numbers.add(4.1);
		numbers.add(5.1);
		expected = new ArrayList<>();
		expected.add(2.2);
		expected.add(3.1);
		assertEquals(expected, FindClosestElements.findClosestElements(numbers));
		
		numbers = new ArrayList<>();
		numbers.add(1.0);
		numbers.add(2.0);
		numbers.add(3.0);
		numbers.add(4.0);
		numbers.add(5.0);
		numbers.add(6.0);
		numbers.add(7.0);
		numbers.add(8.0);
		numbers.add(9.0);
		numbers.add(10.0);
		expected = new ArrayList<>();
		expected.add(9.0);
		expected.add(10.0);
		assertEquals(expected, FindClosestElements.findClosestElements(numbers));
		
		numbers = new ArrayList<>();
		numbers.add(1.0);
		numbers.add(2.0);
		numbers.add(3.0);
		numbers.add(4.0);
		numbers.add(5.0);
		numbers.add(6.0);
		numbers.add(7.0);
		numbers.add(8.0);
		numbers.add(9.0);
		numbers.add(10.0);
		numbers.add(11.0);
		expected = new ArrayList<>();
		expected.add(10.0);
		expected.add(11.0);
		assertEquals(expected, FindClosestElements.findClosestElements(numbers));
		
		numbers = new ArrayList<>();
		numbers.add(1.0);
		numbers.add(2.0);
		numbers.add(3.0);
		numbers.add(4.0);
		numbers.add(5.0);
		numbers.add(6.0);
		numbers.add(7.0);
		numbers.add(8.0);
		numbers.add(9.0);
		numbers.add(10.0);
		numbers.add(11.0);
		numbers.add(12.0);
		expected = new ArrayList<>();
		expected.add(11.0);
		expected.add(12.0);
		assertEquals(expected, FindClosestElements.findClosestElements(numbers));
		
		numbers = new ArrayList<>();
		numbers.add(1.0);
		numbers.add(2.0);
		numbers.add(3.0);
		numbers.add(4.0);
		numbers.add(5.0);
		numbers.add(6.0);
		numbers.add(7.0);
		numbers.add(8.0);
		numbers.add(9.0);
		numbers.add(10.0);
		numbers.add(11.0);
		numbers.add(12.0);
		numbers.add(13.0);
		expected = new ArrayList<>();
		expected.add(12.0);
		expected.add(13.0);
		assertEquals(expected, FindClosestElements.findClosestElements(numbers));
		
		numbers = new ArrayList<>();
		numbers.add(1.0);
		numbers.add(2.0);
		numbers.add(3.0);
		numbers.add(4.0);
		numbers.add(5.0);
		numbers.add(6.0);
		numbers.add(7.0);
		numbers.add(8.0);
		numbers.add(9.0);
		numbers.add(10.0);
		numbers.add(11.0);
		numbers.add(12.0);
		numbers.add(13.0);
		numbers.add(14.0);
		expected = new ArrayList<>();
		expected.add(13.0);
		expected.add(14.0);
		assertEquals(expected, FindClosestElements.findClosestElements(numbers));
		
		numbers = new ArrayList<>();
		numbers.add(1.0);
		numbers.add(2.0);
		numbers.add(3.0);
		numbers.add(4.0);
		numbers.add(5.0);
		numbers.add(6.0);
		numbers.add(7.0);
		numbers.add(8.0);
		numbers.add(9.0);
		numbers.add(10.0);
		numbers.add(11.0);
		numbers.add(12.0);
		numbers.add(13.0);
		numbers.add(14.0);
		numbers.add(15.0);
		expected = new ArrayList<>();
		expected.add(14.0);
		expected.add(15.0);
		assertEquals(expected, FindClosestElements.findClosestElements(numbers));
	}
}