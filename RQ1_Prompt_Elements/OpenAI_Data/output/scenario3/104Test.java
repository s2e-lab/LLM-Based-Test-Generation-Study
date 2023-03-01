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
	* The method should return a sorted list of all elements that hasn't any even digit.
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
	* The method should return a sorted list of all elements that hasn't any even digit.
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
	* The method should return a sorted list of all elements that hasn't any even digit.
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
	* The method should return a sorted list of all elements that hasn't any even digit.
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
	* The method should return a sorted list of all elements that hasn't any even digit.
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
	* The method should return a sorted list of all elements that hasn't any even digit.
	*/
	@Test
	void testUniqueDigits6() {
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
		expected.add(1);
		expected.add(3);
		expected.add(5);
		expected.add(7);
		expected.add(9);
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
	* The method should return a sorted list of all elements that hasn't any even digit.
	*/
	@Test
	void testUniqueDigits7() {
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
		x.add(11);
		x.add(12);
		x.add(13);
		x.add(14);
		x.add(15);
		x.add(16);
		x.add(