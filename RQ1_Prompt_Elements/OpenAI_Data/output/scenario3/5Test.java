// IntersperseTest.java
package scenario3;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Intersperse}.
* It contains ten unit test cases for the {@link Intersperse#intersperse(List, int)} method.
*/
class IntersperseTest {

	@Test
	void testIntersperse_emptyList_delimiter4() {
		List<Object> numbers = new ArrayList<Object>();
		int delimiter = 4;
		List<Object> expected = new ArrayList<Object>();
		List<Object> actual = Intersperse.intersperse(numbers, delimiter);
		assertEquals(expected, actual);
	}
	
	@Test
	void testIntersperse_list1234_delimiter4() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		int delimiter = 4;
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(4);
		expected.add(2);
		expected.add(4);
		expected.add(3);
		expected.add(4);
		expected.add(4);
		List<Object> actual = Intersperse.intersperse(numbers, delimiter);
		assertEquals(expected, actual);
	}
	
	@Test
	void testIntersperse_emptyList_delimiter7() {
		List<Object> numbers = new ArrayList<Object>();
		int delimiter = 7;
		List<Object> expected = new ArrayList<Object>();
		List<Object> actual = Intersperse.intersperse(numbers, delimiter);
		assertEquals(expected, actual);
	}
	
	@Test
	void testIntersperse_list5632_delimiter8() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add(5);
		numbers.add(6);
		numbers.add(3);
		numbers.add(2);
		int delimiter = 8;
		List<Object> expected = new ArrayList<Object>();
		expected.add(5);
		expected.add(8);
		expected.add(6);
		expected.add(8);
		expected.add(3);
		expected.add(8);
		expected.add(2);
		List<Object> actual = Intersperse.intersperse(numbers, delimiter);
		assertEquals(expected, actual);
	}
	
	@Test
	void testIntersperse_list2222_delimiter2() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add(2);
		numbers.add(2);
		numbers.add(2);
		numbers.add(2);
		int delimiter = 2;
		List<Object> expected = new ArrayList<Object>();
		expected.add(2);
		expected.add(2);
		expected.add(2);
		expected.add(2);
		expected.add(2);
		expected.add(2);
		List<Object> actual = Intersperse.intersperse(numbers, delimiter);
		assertEquals(expected, actual);
	}
	
	@Test
	void testIntersperse_list1234_delimiter0() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		int delimiter = 0;
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(0);
		expected.add(2);
		expected.add(0);
		expected.add(3);
		expected.add(0);
		expected.add(4);
		List<Object> actual = Intersperse.intersperse(numbers, delimiter);
		assertEquals(expected, actual);
	}
	
	@Test
	void testIntersperse_list1234_delimiter1() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		int delimiter = 1;
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(1);
		expected.add(2);
		expected.add(1);
		expected.add(3);
		expected.add(1);
		expected.add(4);
		List<Object> actual = Intersperse.intersperse(numbers, delimiter);
		assertEquals(expected, actual);
	}
	
	@Test
	void testIntersperse_list1234_delimiter2() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		int delimiter = 2;
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(2);
		expected.add(2);
		expected.add(3);
		expected.add(2);
		expected.add(4);
		List<Object> actual = Intersperse.intersperse(numbers, delimiter);
		assertEquals(expected, actual);
	}
	
	@Test
	void testIntersperse_list1234_delimiter3() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		int delimiter = 3;
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(3);
		expected.add(2);
		expected.add(3);
		expected.add(3);
		expected.add(4);
		List<Object> actual = Intersperse.intersperse(numbers, delimiter);
		assertEquals(expected, actual);
	}
	
	@Test
	void testIntersperse_list1234_delimiter4() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		int delimiter = 4;
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(4);
		expected.add(2);
		expected.add(4);
		expected.add(3);
		expected.add(4);
		expected.add(4);
		List<Object> actual = Intersperse.intersperse(numbers, delimiter);
		assertEquals(expected, actual);
	}
	
	@Test
	void testIntersperse_list1234_delimiter5() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		int delimiter = 5;
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(5);
		expected.add(2);
		expected.add(5);
		expected.add(3);
		expected.add(5);
		expected.add(4);
		List<Object> actual = Intersperse.intersperse(numbers, delimiter);
		assertEquals(expected, actual);
	}
	
	@Test
	void testIntersperse_list1234_delimiter6() {
		List<Object> numbers = new ArrayList<Object>();
