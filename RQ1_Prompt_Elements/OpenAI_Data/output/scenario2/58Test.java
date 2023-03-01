// CommonTest.java
package scenario2;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Common}.
* It contains ten unit test cases for the {@link Common#common(List, List)} method.
*/
class CommonTest {

		/**
		* Test case 1:
		* Input:
		* l1 = [1, 2, 3, 4, 5]
		* l2 = [1, 2, 3, 4, 5]
		* Expected output:
		* [1, 2, 3, 4, 5]
		*/
		@Test
		void test1() {
				List<Integer> l1 = new ArrayList<Integer>();
				l1.add(1);
				l1.add(2);
				l1.add(3);
				l1.add(4);
				l1.add(5);
				List<Object> l2 = new ArrayList<Object>();
				l2.add(1);
				l2.add(2);
				l2.add(3);
				l2.add(4);
				l2.add(5);
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				expected.add(2);
				expected.add(3);
				expected.add(4);
				expected.add(5);
				List<Object> actual = Common.common(l1, l2);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 2:
		* Input:
		* l1 = [1, 2, 3, 4, 5]
		* l2 = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		* Expected output:
		* [1, 2, 3, 4, 5]
		*/
		@Test
		void test2() {
				List<Integer> l1 = new ArrayList<Integer>();
				l1.add(1);
				l1.add(2);
				l1.add(3);
				l1.add(4);
				l1.add(5);
				List<Object> l2 = new ArrayList<Object>();
				l2.add(1);
				l2.add(2);
				l2.add(3);
				l2.add(4);
				l2.add(5);
				l2.add(6);
				l2.add(7);
				l2.add(8);
				l2.add(9);
				l2.add(10);
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				expected.add(2);
				expected.add(3);
				expected.add(4);
				expected.add(5);
				List<Object> actual = Common.common(l1, l2);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 3:
		* Input:
		* l1 = [1, 2, 3, 4, 5]
		* l2 = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]
		* Expected output:
		* [1, 2, 3, 4, 5]
		*/
		@Test
		void test3() {
				List<Integer> l1 = new ArrayList<Integer>();
				l1.add(1);
				l1.add(2);
				l1.add(3);
				l1.add(4);
				l1.add(5);
				List<Object> l2 = new ArrayList<Object>();
				l2.add(1);
				l2.add(2);
				l2.add(3);
				l2.add(4);
				l2.add(5);
				l2.add(6);
				l2.add(7);
				l2.add(8);
				l2.add(9);
				l2.add(10);
				l2.add(11);
				l2.add(12);
				l2.add(13);
				l2.add(14);
				l2.add(15);
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				expected.add(2);
				expected.add(3);
				expected.add(4);
				expected.add(5);
				List<Object> actual = Common.common(l1, l2);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 4:
		* Input:
		* l1 = [1, 2, 3, 4, 5]
		* l2 = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]
		* Expected output:
		* [1, 2, 3, 4, 5]
		*/
		@Test
		void test4() {
				List<Integer> l1 = new ArrayList<Integer>();
				l1.add(1);
				l1.add(2);
				l1.add(3);
				l1.add(4);
				l1.add(5);
				List<Object> l2 = new ArrayList<Object>();
				l2.add(1);
				l2.add(2);
				l2.add(3);
				l2.add(4);
				l2.add(5);
				l2.add(6);
				l2.add(7);
				l2.add(8);
				l2.add(9);
				l2.add(10);
				l2.add(11);
				l2.add(12);
				l2.add(13);
				l2.add(14);
				l2.add(15);
				l2.add(16);
				l2.add(17);
				l2.add(18);
				l2.add(19);
				l2.add(20);
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				expected.add(2);
				expected.add(3);
				expected.add(4);
				expected.add(5);
				List<Object> actual = Common.common(l1, l2);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 5:
		* Input:
		* l1 = [1, 2, 3, 4, 5]
		* l2 = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25]
		* Expected output:
		* [1, 2, 3, 4, 5]
		*/
		@Test
		void test5() {
				List<Integer> l1 = new ArrayList<Integer>();
				l1.add(1);
				l1.add(2);
				l1.add(3);
				l1.add(4);
				l1.add(5);
				List<Object> l2 = new ArrayList<Object>();
				l2.add(1);
				l2.add(2);
				l2.add(3);
				l2.add(4);
				l2.add(5);
				l2.add(6);
				l2.add(7);
				l2.add(8);
				l2.add(9);
				l2.add(10);
				l2.add(11);
				l2.add(12);
				l2.add(13);
				l2.add(14);
				l2.add(15);
				l2.add(16);
				l2.add(17);
				l2.add(18);
				l2.add(19);
				l2.add(20);
				l2.add(21);
				l2.add(22);
				l2.add(23);
				l2.add(24);
				l2.add(25);
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				expected.add(2);
				expected.add(3);
				expected.add(4);
				expected.add(5);
				List<Object> actual = Common.common(l1, l2);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 6:
		* Input:
		* l1 = [1, 2, 3, 4, 5]
		* l2 = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30]
		* Expected output:
		* [1, 2, 3, 4, 5]
		*/
		@Test
		void test6() {
				List<Integer> l1 = new ArrayList<Integer>();
				l1.add(1);
				l1.add(2);
				l1.add(3);
				l1.add(4);
				l1.add(5);
				List<Object> l2 = new ArrayList<Object>();
				l2.add(1);
				l2.add(2);
				l2.add(3);
				l2.add(4);
				l2.add(5);
				l2.add(6);
				l2.add(7);
				l2.add(8);
				l2.add(9);
				l2.add(10);
				l2.add(11);
				l2.add(12);
				l2.add(13);
				l2.add(14);
				l2.add(15);
				l2.add(16);
				l2.add(17);
				l2.add(18);
				l2.add(19);
				l2.add(20);
				l2.add(21);
				l2.add(22);
				l2.add(23);
				l2.add(24);
				l2.add(25);
				l2.add(26);
				l2.add(27);
				l2.add(28);
				l2.add(29);
				l2.add(30);
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				expected.add(2);
				expected.add(3);
				expected.add(4);
				expected.add(5);
				List<Object> actual = Common.common(l1, l2);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 7:
		* Input:
		* l1 = [1, 2, 3, 4, 5]
		* l2 = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35]
		* Expected output:
		* [1, 2, 3, 4, 5]
		*/
		@Test
		void test7() {
				List<Integer> l1 = new ArrayList<Integer>();
				l1.add(1);
				l1.add(2);
				l1.add(3);
				l1.add(4);
				l1.add(5);
				List<Object> l2 = new ArrayList<Object>();
				l2.add(1);
				l2.add(2);
				l2.add(3);
				l2.add(4);
				l2.add(5);
				l2.add(6);
				l2.add(7);
				l2.add(8);
				l2.add(9);
				l2.add(10);
				l2.add(11);
				l2.add(12);
				l2.add(13);
				l2.add(14);
				l2.add(15);
				l2.add(16);
				l2.add(17);
				l2.add(18);
				l2.add(19);
				l2.add(20);
				l2.add(21);
				l2.add(22);
				l2.add(23);
				l2.add(24);
				l2.add(25);
				l2.add(26);
				l2.add(27);
				l2.add(28);
				l2.add(29);
				l2.add(30);
				l2.add(31);
				l2.add(32);
				l2.add(33);
				l2.add(34);
				l2.add(35);
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				expected.add(2);
				expected.add(3);
				expected.add(4);
				expected.add(5);
				List<Object>