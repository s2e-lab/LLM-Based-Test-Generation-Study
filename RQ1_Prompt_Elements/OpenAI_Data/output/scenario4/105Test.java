// ByLengthTest.java
package scenario3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ByLength}.
* It contains ten unit test cases for the {@link ByLength#byLength(List)} method.
*/
class ByLengthTest {

	@Test
	void testByLength() {
		List<Object> arr = new ArrayList<>();
		arr.add(2);
		arr.add(1);
		arr.add(1);
		arr.add(4);
		arr.add(5);
		arr.add(8);
		arr.add(2);
		arr.add(3);
		List<Object> expected = new ArrayList<>();
		expected.add("Eight");
		expected.add("Five");
		expected.add("Four");
		expected.add("Three");
		expected.add("Two");
		expected.add("Two");
		expected.add("One");
		expected.add("One");
		assertEquals(expected, ByLength.byLength(arr));
	}
	
	@Test
	void testByLengthEmpty() {
		List<Object> arr = new ArrayList<>();
		List<Object> expected = new ArrayList<>();
		assertEquals(expected, ByLength.byLength(arr));
	}
	
	@Test
	void testByLengthStrangeNumber() {
		List<Object> arr = new ArrayList<>();
		arr.add(1);
		arr.add(-1);
		arr.add(55);
		List<Object> expected = new ArrayList<>();
		expected.add("One");
		assertEquals(expected, ByLength.byLength(arr));
	}
	
	@Test
	void testByLengthStrangeNumber2() {
		List<Object> arr = new ArrayList<>();
		arr.add(1);
		arr.add(-1);
		arr.add(3);
		arr.add(2);
		List<Object> expected = new ArrayList<>();
		expected.add("Three");
		expected.add("Two");
		expected.add("One");
		assertEquals(expected, ByLength.byLength(arr));
	}
	
	@Test
	void testByLengthNine() {
		List<Object> arr = new ArrayList<>();
		arr.add(9);
		arr.add(4);
		arr.add(8);
		List<Object> expected = new ArrayList<>();
		expected.add("Nine");
		expected.add("Eight");
		expected.add("Four");
		assertEquals(expected, ByLength.byLength(arr));
	}
	
	@Test
	void testByLengthNine2() {
		List<Object> arr = new ArrayList<>();
		arr.add(9);
		arr.add(4);
		arr.add(8);
		arr.add(1);
		arr.add(2);
		arr.add(3);
		List<Object> expected = new ArrayList<>();
		expected.add("Nine");
		expected.add("Eight");
		expected.add("Four");
		expected.add("Three");
		expected.add("Two");
		expected.add("One");
		assertEquals(expected, ByLength.byLength(arr));
	}
	
	@Test
	void testByLengthNine3() {
		List<Object> arr = new ArrayList<>();
		arr.add(9);
		arr.add(4);
		arr.add(8);
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(5);
		arr.add(6);
		arr.add(7);
		List<Object> expected = new ArrayList<>();
		expected.add("Nine");
		expected.add("Eight");
		expected.add("Seven");
		expected.add("Six");
		expected.add("Five");
		expected.add("Four");
		expected.add("Three");
		expected.add("Two");
		expected.add("One");
		assertEquals(expected, ByLength.byLength(arr));
	}
	
	@Test
	void testByLengthNine4() {
		List<Object> arr = new ArrayList<>();
		arr.add(9);
		arr.add(4);
		arr.add(8);
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(5);
		arr.add(6);
		arr.add(7);
		arr.add(9);
		arr.add(4);
		arr.add(8);
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(5);
		arr.add(6);
		arr.add(7);
		List<Object> expected = new ArrayList<>();
		expected.add("Nine");
		expected.add("Nine");
		expected.add("Eight");
		expected.add("Eight");
		expected.add("Seven");
		expected.add("Seven");
		expected.add("Six");
		expected.add("Six");
		expected.add("Five");
		expected.add("Five");
		expected.add("Four");
		expected.add("Four");
		expected.add("Three");
		expected.add("Three");
		expected.add("Two");
		expected.add("Two");
		expected.add("One");
		expected.add("One");
		assertEquals(expected, ByLength.byLength(arr));
	}
	
	@Test
	void testByLengthNine5() {
		List<Object> arr = new ArrayList<>();
		arr.add(9);
		arr.add(4);
		arr.add(8);
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(5);
		arr.add(6);
		arr.add(7);
		arr.add(9);
		arr.add(4);
		arr.add(8);
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(5);
		arr.add(6);
		arr.add(7);
		arr.add(9);
		arr.add(4);
		arr.add(8);
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(5);
		arr.add(6);
		arr.add(7);
		List<Object> expected = new ArrayList<>();
		expected.add("Nine");
		expected.add("Nine");
		expected.add("Nine");
		expected.add("Eight");
		expected.add("Eight");
		expected.add("Eight");
		expected.add("Seven");
		expected.add("Seven");
		expected.add("Seven");
		expected.add("Six");
		expected.add("Six");
		expected.add("Six");
		expected.add("Five");
		expected.add("Five");
		expected.add("Five");
		expected.add("Four");
		expected.add("Four");
		expected.add("Four");
		expected.add("Three");
		expected.add("Three");
		expected.add("Three");
		expected.add("Two");
		expected.add("Two");
		expected.add("Two");
		expected.add("One");
		expected.add("One");
		expected.add("One");
		assertEquals(expected, ByLength.byLength(arr));
	}
	
	@Test
	void testByLengthNine6() {
		List<Object> arr = new ArrayList<>();
		arr.add(9);
		arr.add(4);
		arr.add(8);
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(5);
		arr.add(6);
		arr.add(7);
		arr.add(9);
		arr.add(4);
		arr.add(8);
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(5);
		arr.add(6);
		arr.add(7);
		arr.add(9);
		arr.add(4);
		arr.add(8);
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(5);
		arr.add(6);
		arr.add(7);
		arr.add(9);
		arr.add(4);
		arr.add(8);
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(5);
		arr.add(6);
		arr.add(7);
		List<Object> expected = new ArrayList<>();
		expected.add("Nine");
		expected.add("Nine");
		expected.add("Nine");
		expected.add("Nine");
		expected.add("Eight");
		expected.add("Eight");
		expected.add("Eight");
		expected.add("Eight");
		expected.add("Seven");
		expected.add("Seven");
		expected.add("Seven");
		expected.add("Seven");
		expected.add("Six");
		expected.add("Six");
		expected.add("Six");
		expected.add("Six");
		expected.add("Five");
		expected.add("Five");
		expected.add("Five");
		expected.add("Five");
		expected.add("Four");
		expected.add("Four");
		expected.add("Four");
		expected.add("Four");
		expected.add("Three");
		expected.add("Three");
		expected.add("Three");
		expected.add("Three");
		expected.add("Two");
		expected.add("Two");
		expected.add("Two");
		expected.add("Two");
		expected.add("One");
		expected.add("One");
		expected.add("One");
		expected.add("One");
		assertEquals(expected, ByLength.byLength(arr));
	}
}