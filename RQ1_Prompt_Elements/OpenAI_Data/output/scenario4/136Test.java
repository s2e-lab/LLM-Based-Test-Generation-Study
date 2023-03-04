// LargestSmallestIntegersTest.java
package scenario3;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LargestSmallestIntegers}.
* It contains ten unit test cases for the {@link LargestSmallestIntegers#largestSmallestIntegers(List)} method.
*/
class LargestSmallestIntegersTest {

	@Test
	void testLargestSmallestIntegers() {
		List<Object> lst = new ArrayList<>();
		lst.add(2);
		lst.add(4);
		lst.add(1);
		lst.add(3);
		lst.add(5);
		lst.add(7);
		List<Integer> expected = new ArrayList<>();
		expected.add(null);
		expected.add(1);
		assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
	}
	
	@Test
	void testLargestSmallestIntegers2() {
		List<Object> lst = new ArrayList<>();
		lst.add(2);
		lst.add(4);
		lst.add(1);
		lst.add(3);
		lst.add(5);
		lst.add(7);
		lst.add(0);
		List<Integer> expected = new ArrayList<>();
		expected.add(null);
		expected.add(1);
		assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
	}
	
	@Test
	void testLargestSmallestIntegers3() {
		List<Object> lst = new ArrayList<>();
		lst.add(1);
		lst.add(3);
		lst.add(2);
		lst.add(4);
		lst.add(5);
		lst.add(6);
		lst.add(-2);
		List<Integer> expected = new ArrayList<>();
		expected.add(-2);
		expected.add(1);
		assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
	}
	
	@Test
	void testLargestSmallestIntegers4() {
		List<Object> lst = new ArrayList<>();
		lst.add(4);
		lst.add(5);
		lst.add(3);
		lst.add(6);
		lst.add(2);
		lst.add(7);
		lst.add(-7);
		List<Integer> expected = new ArrayList<>();
		expected.add(-7);
		expected.add(2);
		assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
	}
	
	@Test
	void testLargestSmallestIntegers5() {
		List<Object> lst = new ArrayList<>();
		lst.add(7);
		lst.add(3);
		lst.add(8);
		lst.add(4);
		lst.add(9);
		lst.add(2);
		lst.add(5);
		lst.add(-9);
		List<Integer> expected = new ArrayList<>();
		expected.add(-9);
		expected.add(2);
		assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
	}
	
	@Test
	void testLargestSmallestIntegers6() {
		List<Object> lst = new ArrayList<>();
		List<Integer> expected = new ArrayList<>();
		expected.add(null);
		expected.add(null);
		assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
	}
	
	@Test
	void testLargestSmallestIntegers7() {
		List<Object> lst = new ArrayList<>();
		lst.add(0);
		List<Integer> expected = new ArrayList<>();
		expected.add(null);
		expected.add(null);
		assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
	}
	
	@Test
	void testLargestSmallestIntegers8() {
		List<Object> lst = new ArrayList<>();
		lst.add(-1);
		lst.add(-3);
		lst.add(-5);
		lst.add(-6);
		List<Integer> expected = new ArrayList<>();
		expected.add(-1);
		expected.add(null);
		assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
	}
	
	@Test
	void testLargestSmallestIntegers9() {
		List<Object> lst = new ArrayList<>();
		lst.add(-1);
		lst.add(-3);
		lst.add(-5);
		lst.add(-6);
		lst.add(0);
		List<Integer> expected = new ArrayList<>();
		expected.add(-1);
		expected.add(null);
		assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
	}
	
	@Test
	void testLargestSmallestIntegers10() {
		List<Object> lst = new ArrayList<>();
		lst.add(-6);
		lst.add(-4);
		lst.add(-4);
		lst.add(-3);
		lst.add(1);
		List<Integer> expected = new ArrayList<>();
		expected.add(-3);
		expected.add(1);
		assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
	}
}