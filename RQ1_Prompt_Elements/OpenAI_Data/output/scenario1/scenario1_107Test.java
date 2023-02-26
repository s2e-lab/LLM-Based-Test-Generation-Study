// EvenOddPalindromeTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EvenOddPalindrome}.
* It contains ten unit test cases for the {@link EvenOddPalindrome#evenOddPalindrome(int)} method.
*/
class EvenOddPalindromeTest {

	/**
	* Test case 1.
	* Input: n = 1.
	* Expected output: [0, 1].
	*/
	@Test
	void test1() {
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(0);
		expected.add(1);
		assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(1));
	}
	
	/**
	* Test case 2.
	* Input: n = 2.
	* Expected output: [1, 0].
	*/
	@Test
	void test2() {
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(0);
		assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(2));
	}
	
	/**
	* Test case 3.
	* Input: n = 3.
	* Expected output: [0, 1].
	*/
	@Test
	void test3() {
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(0);
		expected.add(1);
		assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(3));
	}
	
	/**
	* Test case 4.
	* Input: n = 4.
	* Expected output: [1, 0].
	*/
	@Test
	void test4() {
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(0);
		assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(4));
	}
	
	/**
	* Test case 5.
	* Input: n = 5.
	* Expected output: [0, 1].
	*/
	@Test
	void test5() {
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(0);
		expected.add(1);
		assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(5));
	}
	
	/**
	* Test case 6.
	* Input: n = 6.
	* Expected output: [1, 0].
	*/
	@Test
	void test6() {
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(0);
		assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(6));
	}
	
	/**
	* Test case 7.
	* Input: n = 7.
	* Expected output: [0, 1].
	*/
	@Test
	void test7() {
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(0);
		expected.add(1);
		assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(7));
	}
	
	/**
	* Test case 8.
	* Input: n = 8.
	* Expected output: [1, 0].
	*/
	@Test
	void test8() {
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(0);
		assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(8));
	}
	
	/**
	* Test case 9.
	* Input: n = 9.
	* Expected output: [0, 1].
	*/
	@Test
	void test9() {
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(0);
		expected.add(1);
		assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(9));
	}
	
	/**
	* Test case 10.
	* Input: n = 10.
	* Expected output: [1, 0].
	*/
	@Test
	void test10() {
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(0);
		assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(10));
	}
}