// SolveTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Solve}.
* It contains ten unit test cases for the {@link Solve#solve(String)} method.
*/
class SolveTest {

		/**
		* Test case 1.
		* Input: "abc"
		* Expected output: "ABC"
		*/
		@Test
		void test1() {
				assertEquals("ABC", Solve.solve("abc"));
		}
		
		/**
		* Test case 2.
		* Input: "ABC"
		* Expected output: "abc"
		*/
		@Test
		void test2() {
				assertEquals("abc", Solve.solve("ABC"));
		}
		
		/**
		* Test case 3.
		* Input: "123"
		* Expected output: "321"
		*/
		@Test
		void test3() {
				assertEquals("321", Solve.solve("123"));
		}
		
		/**
		* Test case 4.
		* Input: "abc123"
		* Expected output: "ABC123"
		*/
		@Test
		void test4() {
				assertEquals("ABC123", Solve.solve("abc123"));
		}
		
		/**
		* Test case 5.
		* Input: "ABC123"
		* Expected output: "abc123"
		*/
		@Test
		void test5() {
				assertEquals("abc123", Solve.solve("ABC123"));
		}
		
		/**
		* Test case 6.
		* Input: "abcABC"
		* Expected output: "ABCabc"
		*/
		@Test
		void test6() {
				assertEquals("ABCabc", Solve.solve("abcABC"));
		}
		
		/**
		* Test case 7.
		* Input: "ABCabc"
		* Expected output: "abcABC"
		*/
		@Test
		void test7() {
				assertEquals("abcABC", Solve.solve("ABCabc"));
		}
		
		/**
		* Test case 8.
		* Input: "abc123ABC"
		* Expected output: "ABC123abc"
		*/
		@Test
		void test8() {
				assertEquals("ABC123abc", Solve.solve("abc123ABC"));
		}
		
		/**
		* Test case 9.
		* Input: "ABC123abc"
		* Expected output: "abc123ABC"
		*/
		@Test
		void test9() {
				assertEquals("abc123ABC", Solve.solve("ABC123abc"));
		}
		
		/**
		* Test case 10.
		* Input: "abcABC123"
		* Expected output: "ABCabc123"
		*/
		@Test
		void test10() {
				assertEquals("ABCabc123", Solve.solve("abcABC123"));
		}
}