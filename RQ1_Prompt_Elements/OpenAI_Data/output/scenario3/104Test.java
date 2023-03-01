// UniqueDigitsTest.java
package scenario3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link UniqueDigits}.
* It contains ten unit test cases for the {@link UniqueDigits#uniqueDigits(List)} method.
*/
class UniqueDigitsTest {

	/**
	* Test case for {@link UniqueDigits#uniqueDigits(List)} method.
	* It tests the method with a list of positive integers.
	* The expected result is a sorted list of all elements that hasn't any even digit.
	*/
	@Test
	void testUniqueDigits() {
		List<Integer> x = new ArrayList<Integer>();
		x.add(15);
		x.add(33);
		x.add(1422);
		x.add(1);
		List<Object> result = UniqueDigits.uniqueDigits(x);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(15);
		expected.add(33);
		Collections.sort(expected, new Comparator<Object>() {

			public int compare(Object a, Object b) {
				return (Integer) a - (Integer) b;
			}
		});
		assertEquals(expected, result);
	}
	
	/**
	* Test case for {@link UniqueDigits#uniqueDigits(List)} method.
	* It tests the method with a list of positive integers.
	* The expected result is an empty list.
	*/
	@Test
	void testUniqueDigits2() {
		List<Integer> x = new ArrayList<Integer>();
		x.add(152);
		x.add(323);
		x.add(1422);
		x.add(10);
		List<Object> result = UniqueDigits.uniqueDigits(x);
		List<Object> expected = new ArrayList<Object>();
		assertEquals(expected, result);
	}
	
	/**
	* Test case for {@link UniqueDigits#uniqueDigits(List)} method.
	* It tests the method with a list of positive integers.
	* The expected result is a sorted list of all elements that hasn't any even digit.
	*/
	@Test
	void testUniqueDigits3() {
		List<Integer> x = new ArrayList<Integer>();
		x.add(12345);
		x.add(2033);
		x.add(111);
		x.add(151);
		List<Object> result = UniqueDigits.uniqueDigits(x);
		List<Object> expected = new ArrayList<Object>();
		expected.add(111);
		expected.add(151);
		Collections.sort(expected, new Comparator<Object>() {

			public int compare(Object a, Object b) {
				return (Integer) a - (Integer) b;
			}
		});
		assertEquals(expected, result);
	}
	
	/**
	* Test case for {@link UniqueDigits#uniqueDigits(List)} method.
	* It tests the method with a list of positive integers.
	* The expected result is a sorted list of all elements that hasn't any even digit.
	*/
	@Test
	void testUniqueDigits4() {
		List<Integer> x = new ArrayList<Integer>();
		x.add(135);
		x.add(103);
		x.add(31);
		List<Object> result = UniqueDigits.uniqueDigits(x);
		List<Object> expected = new ArrayList<Object>();
		expected.add(31);
		expected.add(135);
		Collections.sort(expected, new Comparator<Object>() {

			public int compare(Object a, Object b) {
				return (Integer) a - (Integer) b;
			}
		});
		assertEquals(expected, result);
	}
	
	/**
	* Test case for {@link UniqueDigits#uniqueDigits(List)} method.
	* It tests the method with a list of positive integers.
	* The expected result is a sorted list of all elements that hasn't any even digit.
	*/
	@Test
	void testUniqueDigits5() {
		List<Integer> x = new ArrayList<Integer>();
		x.add(1);
		x.add(2);
		x.add(3);
		x.add(4);
		x.add(5);
		x.add(6);
		x.add(7);
		x.add(8);
		x.add(9);
		x.add(10);
		List<Object> result = UniqueDigits.uniqueDigits(x);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(3);
		expected.add(5);
		expected.add(7);
		expected.add(9);
		Collections.sort(expected, new Comparator<Object>() {

			public int compare(Object a, Object b) {
				return (Integer) a - (Integer) b;
			}
		});
		assertEquals(expected, result);
	}
	
	/**
	* Test case for {@link UniqueDigits#uniqueDigits(List)} method.
	* It tests the method with a list of positive integers.
	* The expected result is a sorted list of all elements that hasn't any even digit.
	*/
	@Test
	void testUniqueDigits6() {
		List<Integer> x = new ArrayList<Integer>();
		x.add(11);
		x.add(12);
		x.add(13);
		x.add(14);
		x.add(15);
		x.add(16);
		x.add(17);
		x.add(18);
		x.add(19);
		x.add(20);
		List<Object> result = UniqueDigits.uniqueDigits(x);
		List<Object> expected = new ArrayList<Object>();
		expected.add(11);
		expected.add(13);
		expected.add(15);
		expected.add(17);
		expected.add(19);
		Collections.sort(expected, new Comparator<Object>() {

			public int compare(Object a, Object b) {
				return (Integer) a - (Integer) b;
			}
		});
		assertEquals(expected, result);
	}
	
	/**
	* Test case for {@link UniqueDigits#uniqueDigits(List)} method.
	* It tests the method with a list of positive integers.
	* The expected result is a sorted list of all elements that hasn't any even digit.
	*/
	@Test
	void testUniqueDigits7() {
		List<Integer> x = new ArrayList<Integer>();
		x.add(21);
		x.add(22);
		x.add(23);
		x.add(24);
		x.add(25);
		x.add(26);
		x.add(27);
		x.add(28);
		x.add(29);
		x.add(30);
		List<Object> result = UniqueDigits.uniqueDigits(x);
		List<Object> expected = new ArrayList<Object>();
		expected.add(23);
		expected.add(25);
		expected.add(27);
		expected.add(29);
		Collections.sort(expected, new Comparator<Object>() {

			public int compare(Object a, Object b) {
				return (Integer) a - (Integer) b;
			}
		});
		assertEquals(expected, result);
	}
	
	/**
	* Test case for {@link UniqueDigits#uniqueDigits(List)} method.
	* It tests the method with a list of positive integers.
	* The expected result is a sorted list of all elements that hasn't any even digit.
	*/
	@Test
	void testUniqueDigits8() {
		List<Integer> x = new ArrayList<Integer>();
		x.add(31);
		x.add(32);
		x.add(33);
		x.add(34);
		x.add(35);
		x.add(36);
		x.add(37);
		x.add(38);
		x.add(39);
		x.add(40);
		List<Object> result = UniqueDigits.uniqueDigits(x);
		List<Object> expected = new ArrayList<Object>();
		expected.add(31);
		expected.add(33);
		expected.add(35);
		expected.add(37);
		expected.add(39);
		Collections.sort(expected, new Comparator<Object>() {

			public int compare(Object a, Object b) {
				return (Integer) a - (Integer) b;
			}
		});
		assertEquals(expected, result);
	}
	
	/**
	* Test case for {@link UniqueDigits#uniqueDigits(List)} method.
	* It tests the method with a list of positive integers.
	* The expected result is a sorted list of all elements that hasn't any even digit.
	*/
	@Test
	void testUniqueDigits9() {
		List<Integer> x = new ArrayList<Integer>();
		x.add(41);
		x.add(42);
		x.add(43);
		x.add(44);
		x.add(45);
		x.add(46);
		x.add(47);
		x.add(48);
		x.add(49);
		x.add(50);
		List<Object> result = UniqueDigits.uniqueDigits(x);
		List<Object> expected = new ArrayList<Object>();
		expected.add(43);
		expected.add(45);
		expected.add(47);
		expected.add(49);
		Collections.sort(expected, new Comparator<Object>() {

			public int compare(Object a, Object b) {
				return (Integer) a - (Integer) b;
			}
		});
		assertEquals(expected, result);
	}
	
	/**
	* Test case for {@link UniqueDigits#uniqueDigits(List)} method.
	* It tests the method with a list of positive integers.
	* The expected result is a sorted list of all elements that hasn't any even digit.
	*/
	@Test
	void testUniqueDigits10() {
		List<Integer> x = new ArrayList<Integer>();
		x.add(51);
		x.add(52);
		x.add(53);
		x.add(54);
		x.add(55);
		x.add(56);
		x.add(57);
		x.add(58);
		x.add(59);
		x.add(60);
		List<Object> result = UniqueDigits.uniqueDigits(x);
		List<Object> expected = new ArrayList<Object>();
		expected.add(53);
		expected.add(55);
		expected.add(57);
		expected.add(59);
		Collections.sort(expected, new Comparator<Object>() {

			public int compare(Object a, Object b) {
				return (Integer) a - (Integer) b;
			}
		});
		assertEquals(expected, result);
	}
}