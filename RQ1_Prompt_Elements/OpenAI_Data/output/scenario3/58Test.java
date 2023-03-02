// CommonTest.java
package scenario3;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Common}.
* It contains ten unit test cases for the {@link Common#common(List, List)} method.
*/
class CommonTest {
/**
		* Test case for {@link Common#common(List, List)} method.
		* It tests the case when the first list is empty.
		*/
		@Test
		void testCommon_EmptyFirstList() {
				List<Integer> l1 = new ArrayList<Integer>();
				List<Object> l2 = new ArrayList<Object>();
				l2.add(1);
				l2.add(2);
				l2.add(3);
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = Common.common(l1, l2);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Common#common(List, List)} method.
		* It tests the case when the second list is empty.
		*/
		@Test
		void testCommon_EmptySecondList() {
				List<Integer> l1 = new ArrayList<Integer>();
				l1.add(1);
				l1.add(2);
				l1.add(3);
				List<Object> l2 = new ArrayList<Object>();
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = Common.common(l1, l2);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Common#common(List, List)} method.
		* It tests the case when both lists are empty.
		*/
		@Test
		void testCommon_EmptyLists() {
				List<Integer> l1 = new ArrayList<Integer>();
				List<Object> l2 = new ArrayList<Object>();
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = Common.common(l1, l2);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Common#common(List, List)} method.
		* It tests the case when the first list contains only one element.
		*/
		@Test
		void testCommon_OneElementFirstList() {
				List<Integer> l1 = new ArrayList<Integer>();
				l1.add(1);
				List<Object> l2 = new ArrayList<Object>();
				l2.add(1);
				l2.add(2);
				l2.add(3);
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				List<Object> actual = Common.common(l1, l2);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Common#common(List, List)} method.
		* It tests the case when the second list contains only one element.
		*/
		@Test
		void testCommon_OneElementSecondList() {
				List<Integer> l1 = new ArrayList<Integer>();
				l1.add(1);
				l1.add(2);
				l1.add(3);
				List<Object> l2 = new ArrayList<Object>();
				l2.add(1);
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				List<Object> actual = Common.common(l1, l2);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Common#common(List, List)} method.
		* It tests the case when both lists contain only one element.
		*/
		@Test
		void testCommon_OneElementLists() {
				List<Integer> l1 = new ArrayList<Integer>();
				l1.add(1);
				List<Object> l2 = new ArrayList<Object>();
				l2.add(1);
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				List<Object> actual = Common.common(l1, l2);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Common#common(List, List)} method.
		* It tests the case when the first list contains only one element and the second list contains only one element.
		*/
		@Test
		void testCommon_OneElementFirstListOneElementSecondList() {
				List<Integer> l1 = new ArrayList<Integer>();
				l1.add(1);
				List<Object> l2 = new ArrayList<Object>();
				l2.add(2);
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = Common.common(l1, l2);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Common#common(List, List)} method.
		* It tests the case when the first list contains only one element and the second list contains only one element.
		*/
		@Test
		void testCommon_OneElementFirstListOneElementSecondList2() {
				List<Integer> l1 = new ArrayList<Integer>();
				l1.add(1);
				List<Object> l2 = new ArrayList<Object>();
				l2.add(1);
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				List<Object> actual = Common.common(l1, l2);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Common#common(List, List)} method.
		* It tests the case when the first list contains only one element and the second list contains only one element.
		*/
		@Test
		void testCommon_OneElementFirstListOneElementSecondList3() {
				List<Integer> l1 = new ArrayList<Integer>();
				l1.add(1);
				List<Object> l2 = new ArrayList<Object>();
				l2.add(1);
				l2.add(2);
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				List<Object> actual = Common.common(l1, l2);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Common#common(List, List)} method.
		* It tests the case when the first list contains only one element and the second list contains only one element.
		*/
		@Test
		void testCommon_OneElementFirstListOneElementSecondList4() {
				List<Integer> l1 = new ArrayList<Integer>();
				l1.add(1);
				l1.add(2);
				List<Object> l2 = new ArrayList<Object>();
				l2.add(1);
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				List<Object> actual = Common.common(l1, l2);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Common#common(List, List)} method.
		* It tests