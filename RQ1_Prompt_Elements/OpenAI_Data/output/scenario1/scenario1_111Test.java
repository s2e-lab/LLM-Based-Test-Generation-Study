// HistogramTest.java
package scenario1;

import java.util.HashMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Histogram}.
* It contains ten unit test cases for the {@link Histogram#histogram(String)} method.
*/
class HistogramTest {

	/**
	* Test case 1.
	* The input string is empty.
	* The expected result is an empty hash map.
	*/
	@Test
	void test1() {
		String test = "";
		HashMap<String, Integer> expected = new HashMap<>();
		assertEquals(expected, Histogram.histogram(test));
	}
	
	/**
	* Test case 2.
	* The input string contains only one word.
	* The expected result is a hash map with one entry.
	*/
	@Test
	void test2() {
		String test = "test";
		HashMap<String, Integer> expected = new HashMap<>();
		expected.put("test", 1);
		assertEquals(expected, Histogram.histogram(test));
	}
	
	/**
	* Test case 3.
	* The input string contains only one word, which is repeated.
	* The expected result is a hash map with one entry.
	*/
	@Test
	void test3() {
		String test = "test test";
		HashMap<String, Integer> expected = new HashMap<>();
		expected.put("test", 2);
		assertEquals(expected, Histogram.histogram(test));
	}
	
	/**
	* Test case 4.
	* The input string contains only one word, which is repeated more than once.
	* The expected result is a hash map with one entry.
	*/
	@Test
	void test4() {
		String test = "test test test";
		HashMap<String, Integer> expected = new HashMap<>();
		expected.put("test", 3);
		assertEquals(expected, Histogram.histogram(test));
	}
	
	/**
	* Test case 5.
	* The input string contains two words, which are not repeated.
	* The expected result is a hash map with two entries.
	*/
	@Test
	void test5() {
		String test = "test test1";
		HashMap<String, Integer> expected = new HashMap<>();
		expected.put("test", 1);
		expected.put("test1", 1);
		assertEquals(expected, Histogram.histogram(test));
	}
	
	/**
	* Test case 6.
	* The input string contains two words, one of which is repeated.
	* The expected result is a hash map with two entries.
	*/
	@Test
	void test6() {
		String test = "test test test1";
		HashMap<String, Integer> expected = new HashMap<>();
		expected.put("test", 2);
		expected.put("test1", 1);
		assertEquals(expected, Histogram.histogram(test));
	}
	
	/**
	* Test case 7.
	* The input string contains two words, both of which are repeated.
	* The expected result is a hash map with two entries.
	*/
	@Test
	void test7() {
		String test = "test test test1 test1";
		HashMap<String, Integer> expected = new HashMap<>();
		expected.put("test", 2);
		expected.put("test1", 2);
		assertEquals(expected, Histogram.histogram(test));
	}
	
	/**
	* Test case 8.
	* The input string contains two words, both of which are repeated more than once.
	* The expected result is a hash map with two entries.
	*/
	@Test
	void test8() {
		String test = "test test test1 test1 test test test1 test1";
		HashMap<String, Integer> expected = new HashMap<>();
		expected.put("test", 4);
		expected.put("test1", 4);
		assertEquals(expected, Histogram.histogram(test));
	}
	
	/**
	* Test case 9.
	* The input string contains two words, one of which is repeated more than once.
	* The expected result is a hash map with two entries.
	*/
	@Test
	void test9() {
		String test = "test test test1 test test test";
		HashMap<String, Integer> expected = new HashMap<>();
		expected.put("test", 5);
		expected.put("test1", 1);
		assertEquals(expected, Histogram.histogram(test));
	}
	
	/**
	* Test case 10.
	* The input string contains two words, one of which is repeated more than once.
	* The expected result is a hash map with two entries.
	*/
	@Test
	void test10() {
		String test = "test test test1 test test test test1";
		HashMap<String, Integer> expected = new HashMap<>();
		expected.put("test", 6);
		expected.put("test1", 2);
		assertEquals(expected, Histogram.histogram(test));
	}
}