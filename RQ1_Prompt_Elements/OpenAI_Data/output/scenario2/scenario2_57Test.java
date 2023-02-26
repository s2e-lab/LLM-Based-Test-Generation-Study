// MonotonicTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Monotonic}.
* It contains ten unit test cases for the {@link Monotonic#monotonic(List)} method.
*/
class MonotonicTest {

	/**
	* Test case 1:
	* Input: [1, 2, 3, 4, 5]
	* Expected output: true
	*/
	@Test
	void test1() {
		List<Integer> l = List.of(1, 2, 3, 4, 5);
		assertTrue(Monotonic.monotonic(l));
	}
	
	/**
	* Test case 2:
	* Input: [1, 2, 3, 4, 5, 4, 3, 2, 1]
	* Expected output: true
	*/
	@Test
	void test2() {
		List<Integer> l = List.of(1, 2, 3, 4, 5, 4, 3, 2, 1);
		assertTrue(Monotonic.monotonic(l));
	}
	
	/**
	* Test case 3:
	* Input: [1, 2, 3, 4, 5, 5, 5, 5, 5]
	* Expected output: true
	*/
	@Test
	void test3() {
		List<Integer> l = List.of(1, 2, 3, 4, 5, 5, 5, 5, 5);
		assertTrue(Monotonic.monotonic(l));
	}
	
	/**
	* Test case 4:
	* Input: [1, 2, 3, 4, 5, 5, 5, 5, 5, 4, 3, 2, 1]
	* Expected output: true
	*/
	@Test
	void test4() {
		List<Integer> l = List.of(1, 2, 3, 4, 5, 5, 5, 5, 5, 4, 3, 2, 1);
		assertTrue(Monotonic.monotonic(l));
	}
	
	/**
	* Test case 5:
	* Input: [1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5]
	* Expected output: true
	*/
	@Test
	void test5() {
		List<Integer> l = List.of(1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5);
		assertTrue(Monotonic.monotonic(l));
	}
	
	/**
	* Test case 6:
	* Input: [1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 4, 3, 2, 1]
	* Expected output: true
	*/
	@Test
	void test6() {
		List<Integer> l = List.of(1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 4, 3, 2, 1);
		assertTrue(Monotonic.monotonic(l));
	}
	
	/**
	* Test case 7:
	* Input: [1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5]
	* Expected output: true
	*/
	@Test
	void test7() {
		List<Integer> l = List.of(1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5);
		assertTrue(Monotonic.monotonic(l));
	}
	
	/**
	* Test case 8:
	* Input: [1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 4, 3, 2, 1]
	* Expected output: true
	*/
	@Test
	void test8() {
		List<Integer> l = List.of(1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 4, 3, 2, 1);
		assertTrue(Monotonic.monotonic(l));
	}
	
	/**
	* Test case 9:
	* Input: [1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5]
	* Expected output: true
	*/
	@Test
	void test9() {
		List<Integer> l = List.of(1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5);
		assertTrue(Monotonic.monotonic(l));
	}
	
	/**
	* Test case 10:
	* Input: [1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 4, 3, 2, 1]
	* Expected output: true
	*/
	@Test
	void test10() {
		List<Integer> l = List.of(1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 4, 3, 2, 1);
		assertTrue(Monotonic.monotonic(l));
	}
}