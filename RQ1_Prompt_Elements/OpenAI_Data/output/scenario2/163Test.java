// GenerateIntegersTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GenerateIntegers}.
* It contains ten unit test cases for the {@link GenerateIntegers#generateIntegers(int, int)} method.
*/
class GenerateIntegersTest {

	/**
	* Test case 1.
	* The method should return an empty list when the lower bound is greater than the upper bound.
	*/
	@Test
	void test1() {
		List<Object> expected = new ArrayList<>();
		List<Object> actual = GenerateIntegers.generateIntegers(5, 2);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 2.
	* The method should return an empty list when the lower bound is greater than the upper bound.
	*/
	@Test
	void test2() {
		List<Object> expected = new ArrayList<>();
		List<Object> actual = GenerateIntegers.generateIntegers(5, 4);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 3.
	* The method should return an empty list when the lower bound is greater than the upper bound.
	*/
	@Test
	void test3() {
		List<Object> expected = new ArrayList<>();
		List<Object> actual = GenerateIntegers.generateIntegers(5, 5);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 4.
	* The method should return an empty list when the lower bound is greater than the upper bound.
	*/
	@Test
	void test4() {
		List<Object> expected = new ArrayList<>();
		List<Object> actual = GenerateIntegers.generateIntegers(5, 6);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 5.
	* The method should return an empty list when the lower bound is greater than the upper bound.
	*/
	@Test
	void test5() {
		List<Object> expected = new ArrayList<>();
		List<Object> actual = GenerateIntegers.generateIntegers(5, 7);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 6.
	* The method should return an empty list when the lower bound is greater than the upper bound.
	*/
	@Test
	void test6() {
		List<Object> expected = new ArrayList<>();
		List<Object> actual = GenerateIntegers.generateIntegers(5, 8);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 7.
	* The method should return an empty list when the lower bound is greater than the upper bound.
	*/
	@Test
	void test7() {
		List<Object> expected = new ArrayList<>();
		List<Object> actual = GenerateIntegers.generateIntegers(5, 9);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 8.
	* The method should return an empty list when the lower bound is greater than the upper bound.
	*/
	@Test
	void test8() {
		List<Object> expected = new ArrayList<>();
		List<Object> actual = GenerateIntegers.generateIntegers(5, 10);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 9.
	* The method should return an empty list when the lower bound is greater than the upper bound.
	*/
	@Test
	void test9() {
		List<Object> expected = new ArrayList<>();
		List<Object> actual = GenerateIntegers.generateIntegers(5, 11);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 10.
	* The method should return an empty list when the lower bound is greater than the upper bound.
	*/
	@Test
	void test10() {
		List<Object> expected = new ArrayList<>();
		List<Object> actual = GenerateIntegers.generateIntegers(5, 12);
		assertEquals(expected, actual);
	}
}