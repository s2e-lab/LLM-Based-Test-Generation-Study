// FilterIntegersTest.java
package scenario3;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FilterIntegers}.
* It contains ten unit test cases for the {@link FilterIntegers#filterIntegers(List)} method.
*/
class FilterIntegersTest {
@Test
	void testFilterIntegers_1() {
		List<Object> values = new ArrayList<Object>();
		values.add("a");
		values.add(3.14);
		values.add(5);
		List<Object> expected = new ArrayList<Object>();
		expected.add(5);
		List<Object> actual = FilterIntegers.filterIntegers(values);
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterIntegers_2() {
		List<Object> values = new ArrayList<Object>();
		values.add(1);
		values.add(2);
		values.add(3);
		values.add("abc");
		values.add(new Object());
		values.add(new ArrayList<Object>());
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		List<Object> actual = FilterIntegers.filterIntegers(values);
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterIntegers_3() {
		List<Object> values = new ArrayList<Object>();
		List<Object> expected = new ArrayList<Object>();
		List<Object> actual = FilterIntegers.filterIntegers(values);
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterIntegers_4() {
		List<Object> values = new ArrayList<Object>();
		values.add(4);
		values.add(new Object());
		values.add(new ArrayList<Object>());
		values.add(23.2);
		values.add(9);
		values.add("adasd");
		List<Object> expected = new ArrayList<Object>();
		expected.add(4);
		expected.add(9);
		List<Object> actual = FilterIntegers.filterIntegers(values);
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterIntegers_5() {
		List<Object> values = new ArrayList<Object>();
		values.add(3);
		values.add("c");
		values.add(3);
		values.add(3);
		values.add("a");
		values.add("b");
		List<Object> expected = new ArrayList<Object>();
		expected.add(3);
		expected.add(3);
		expected.add(3);
		List<Object> actual = FilterIntegers.filterIntegers(values);
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterIntegers_6() {
		List<Object> values = new ArrayList<Object>();
		values.add(1);
		values.add(2);
		values.add(3);
		values.add(4);
		values.add(5);
		values.add(6);
		values.add(7);
		values.add(8);
		values.add(9);
		values.add(10);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		expected.add(5);
		expected.add(6);
		expected.add(7);
		expected.add(8);
		expected.add(9);
		expected.add(10);
		List<Object> actual = FilterIntegers.filterIntegers(values);
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterIntegers_7() {
		List<Object> values = new ArrayList<Object>();
		values.add(1);
		values.add(2);
		values.add(3);
		values.add(4);
		values.add(5);
		values.add(6);
		values.add(7);
		values.add(8);
		values.add(9);
		values.add(10);
		values.add(11);
		values.add(12);
		values.add(13);
		values.add(14);
		values.add(15);
		values.add(16);
		values.add(17);
		values.add(18);
		values.add(19);
		values.add(20);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		expected.add(5);
		expected.add(6);
		expected.add(7);
		expected.add(8);
		expected.add(9);
		expected.add(10);
		expected.add(11);
		expected.add(12);
		expected.add(13);
		expected.add(14);
		expected.add(15);
		expected.add(16);
		expected.add(17);
		expected.add(18);
		expected.add(19);
		expected.add(20);
		List<Object> actual = FilterIntegers.filterIntegers(values);
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterIntegers_8() {
		List<Object> values = new ArrayList<Object>();
		values.add(1);
		values.add(2);
		values.add(3);
		values.add(4);
		values.add(5);
		values.add(6);
		values.add(7);
		values.add(8);
		values.add(9);
		values.add(10);
		values.add(11);
		values.add(12);
		values.add(13);
		values.add(14);
		values.add(15);
		values.add(16);
		values.add(17);
		values.add(18);
		values.add(19);
		values.add(20);
		values.add(21);
		values.add(22);
		values.add(23);
		values.add(24);
		values.add(25);
		values.add(26);
		values.add(27);
		values.add(28);
		values.add(29);
		values.add(30);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		expected.add(5);
		expected.add(6);
		expected.add(7);
		expected.add(8);
		expected.add(9);
		expected.add(10);
		expected.add(11);
		expected.add(12);
		expected.add(13);
		expected.add(14);
		expected.add(15);
		expected.add(16);
		expected.add(17);
		expected.add(18);
		expected.add(19);
		expected.add(20);
		expected.add(21);
		expected.add(22);
		expected.add(23);
		expected.add(24);
		expected.add(25);
		expected.add(26);
		expected.add(27);
		expected.add(28);
		expected.add(29);
		expected.add(30);
		List<Object> actual = FilterIntegers.filterIntegers(values);
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterIntegers_9() {
		List<Object> values = new