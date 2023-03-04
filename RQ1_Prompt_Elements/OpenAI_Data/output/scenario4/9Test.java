// RollingMaxTest.java
package scenario3;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RollingMax}.
* It contains ten unit test cases for the {@link RollingMax#rollingMax(List)} method.
*/
class RollingMaxTest {

	@Test
	void testRollingMax_emptyList() {
		List<Object> numbers = new ArrayList<>();
		List<Object> expected = new ArrayList<>();
		List<Object> actual = RollingMax.rollingMax(numbers);
		assertEquals(expected, actual);
	}
	
	@Test
	void testRollingMax_oneElement() {
		List<Object> numbers = new ArrayList<>();
		numbers.add(1);
		List<Object> expected = new ArrayList<>();
		expected.add(1);
		List<Object> actual = RollingMax.rollingMax(numbers);
		assertEquals(expected, actual);
	}
	
	@Test
	void testRollingMax_twoElements() {
		List<Object> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		List<Object> expected = new ArrayList<>();
		expected.add(1);
		expected.add(2);
		List<Object> actual = RollingMax.rollingMax(numbers);
		assertEquals(expected, actual);
	}
	
	@Test
	void testRollingMax_threeElements() {
		List<Object> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		List<Object> expected = new ArrayList<>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		List<Object> actual = RollingMax.rollingMax(numbers);
		assertEquals(expected, actual);
	}
	
	@Test
	void testRollingMax_fourElements() {
		List<Object> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		List<Object> expected = new ArrayList<>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		List<Object> actual = RollingMax.rollingMax(numbers);
		assertEquals(expected, actual);
	}
	
	@Test
	void testRollingMax_fourElements_descending() {
		List<Object> numbers = new ArrayList<>();
		numbers.add(4);
		numbers.add(3);
		numbers.add(2);
		numbers.add(1);
		List<Object> expected = new ArrayList<>();
		expected.add(4);
		expected.add(4);
		expected.add(4);
		expected.add(4);
		List<Object> actual = RollingMax.rollingMax(numbers);
		assertEquals(expected, actual);
	}
	
	@Test
	void testRollingMax_fourElements_ascending() {
		List<Object> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		List<Object> expected = new ArrayList<>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		List<Object> actual = RollingMax.rollingMax(numbers);
		assertEquals(expected, actual);
	}
	
	@Test
	void testRollingMax_sevenElements() {
		List<Object> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(2);
		List<Object> expected = new ArrayList<>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(3);
		expected.add(3);
		expected.add(4);
		expected.add(4);
		List<Object> actual = RollingMax.rollingMax(numbers);
		assertEquals(expected, actual);
	}
	
	@Test
	void testRollingMax_sevenElements_descending() {
		List<Object> numbers = new ArrayList<>();
		numbers.add(4);
		numbers.add(3);
		numbers.add(2);
		numbers.add(3);
		numbers.add(2);
		numbers.add(1);
		numbers.add(2);
		List<Object> expected = new ArrayList<>();
		expected.add(4);
		expected.add(4);
		expected.add(4);
		expected.add(4);
		expected.add(4);
		expected.add(4);
		expected.add(4);
		List<Object> actual = RollingMax.rollingMax(numbers);
		assertEquals(expected, actual);
	}
	
	@Test
	void testRollingMax_sevenElements_ascending() {
		List<Object> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(2);
		List<Object> expected = new ArrayList<>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(3);
		expected.add(3);
		expected.add(4);
		expected.add(4);
		List<Object> actual = RollingMax.rollingMax(numbers);
		assertEquals(expected, actual);
	}
	
	@Test
	void testRollingMax_sevenElements_mixed() {
		List<Object> numbers = new ArrayList<>();
		numbers.add(3);
		numbers.add(2);
		numbers.add(3);
		numbers.add(100);
		numbers.add(3);
		List<Object> expected = new ArrayList<>();
		expected.add(3);
		expected.add(3);
		expected.add(3);
		expected.add(100);
		expected.add(100);
		List<Object> actual = RollingMax.rollingMax(numbers);
		assertEquals(expected, actual);
	}
}