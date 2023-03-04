// SortEvenTest.java
package scenario3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortEven}.
* It contains ten unit test cases for the {@link SortEven#sortEven(List)} method.
*/
class SortEvenTest {

	@Test
	void testSortEven1() {
		List<Integer> l = new ArrayList<>();
		l.add(1);
		l.add(2);
		l.add(3);
		List<Integer> expected = new ArrayList<>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		assertEquals(expected, SortEven.sortEven(l));
	}
	
	@Test
	void testSortEven2() {
		List<Integer> l = new ArrayList<>();
		l.add(5);
		l.add(6);
		l.add(3);
		l.add(4);
		List<Integer> expected = new ArrayList<>();
		expected.add(3);
		expected.add(6);
		expected.add(5);
		expected.add(4);
		assertEquals(expected, SortEven.sortEven(l));
	}
	
	@Test
	void testSortEven3() {
		List<Integer> l = new ArrayList<>();
		l.add(1);
		l.add(2);
		l.add(3);
		List<Integer> expected = new ArrayList<>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		assertEquals(expected, SortEven.sortEven(l));
	}
	
	@Test
	void testSortEven4() {
		List<Integer> l = new ArrayList<>();
		l.add(5);
		l.add(3);
		l.add(-5);
		l.add(2);
		l.add(-3);
		l.add(3);
		l.add(9);
		l.add(0);
		l.add(123);
		l.add(1);
		l.add(-10);
		List<Integer> expected = new ArrayList<>();
		expected.add(-10);
		expected.add(3);
		expected.add(-5);
		expected.add(2);
		expected.add(-3);
		expected.add(3);
		expected.add(5);
		expected.add(0);
		expected.add(9);
		expected.add(1);
		expected.add(123);
		assertEquals(expected, SortEven.sortEven(l));
	}
	
	@Test
	void testSortEven5() {
		List<Integer> l = new ArrayList<>();
		l.add(5);
		l.add(8);
		l.add(-12);
		l.add(4);
		l.add(23);
		l.add(2);
		l.add(3);
		l.add(11);
		l.add(12);
		l.add(-10);
		List<Integer> expected = new ArrayList<>();
		expected.add(-12);
		expected.add(8);
		expected.add(3);
		expected.add(4);
		expected.add(5);
		expected.add(2);
		expected.add(12);
		expected.add(11);
		expected.add(23);
		expected.add(-10);
		assertEquals(expected, SortEven.sortEven(l));
	}
	
	@Test
	void testSortEven6() {
		List<Integer> l = new ArrayList<>();
		l.add(5);
		l.add(8);
		l.add(-12);
		l.add(4);
		l.add(23);
		l.add(2);
		l.add(3);
		l.add(11);
		l.add(12);
		l.add(-10);
		List<Integer> expected = new ArrayList<>();
		expected.add(-12);
		expected.add(8);
		expected.add(3);
		expected.add(4);
		expected.add(5);
		expected.add(2);
		expected.add(12);
		expected.add(11);
		expected.add(23);
		expected.add(-10);
		assertEquals(expected, SortEven.sortEven(l));
	}
	
	@Test
	void testSortEven7() {
		List<Integer> l = new ArrayList<>();
		l.add(5);
		l.add(8);
		l.add(-12);
		l.add(4);
		l.add(23);
		l.add(2);
		l.add(3);
		l.add(11);
		l.add(12);
		l.add(-10);
		List<Integer> expected = new ArrayList<>();
		expected.add(-12);
		expected.add(8);
		expected.add(3);
		expected.add(4);
		expected.add(5);
		expected.add(2);
		expected.add(12);
		expected.add(11);
		expected.add(23);
		expected.add(-10);
		assertEquals(expected, SortEven.sortEven(l));
	}
	
	@Test
	void testSortEven8() {
		List<Integer> l = new ArrayList<>();
		l.add(5);
		l.add(8);
		l.add(-12);
		l.add(4);
		l.add(23);
		l.add(2);
		l.add(3);
		l.add(11);
		l.add(12);
		l.add(-10);
		List<Integer> expected = new ArrayList<>();
		expected.add(-12);
		expected.add(8);
		expected.add(3);
		expected.add(4);
		expected.add(5);
		expected.add(2);
		expected.add(12);
		expected.add(11);
		expected.add(23);
		expected.add(-10);
		assertEquals(expected, SortEven.sortEven(l));
	}
	
	@Test
	void testSortEven9() {
		List<Integer> l = new ArrayList<>();
		l.add(5);
		l.add(8);
		l.add(-12);
		l.add(4);
		l.add(23);
		l.add(2);
		l.add(3);
		l.add(11);
		l.add(12);
		l.add(-10);
		List<Integer> expected = new ArrayList<>();
		expected.add(-12);
		expected.add(8);
		expected.add(3);
		expected.add(4);
		expected.add(5);
		expected.add(2);
		expected.add(12);
		expected.add(11);
		expected.add(23);
		expected.add(-10);
		assertEquals(expected, SortEven.sortEven(l));
	}
	
	@Test
	void testSortEven10() {
		List<Integer> l = new ArrayList<>();
		l.add(5);
		l.add(8);
		l.add(-12);
		l.add(4);
		l.add(23);
		l.add(2);
		l.add(3);
		l.add(11);
		l.add(12);
		l.add(-10);
		List<Integer> expected = new ArrayList<>();
		expected.add(-12);
		expected.add(8);
		expected.add(3);
		expected.add(4);
		expected.add(5);
		expected.add(2);
		expected.add(12);
		expected.add(11);
		expected.add(23);
		expected.add(-10);
		assertEquals(expected, SortEven.sortEven(l));
	}
}