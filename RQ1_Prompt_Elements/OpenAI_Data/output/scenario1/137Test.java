// CompareOneTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CompareOne}.
* It contains ten unit test cases for the {@link CompareOne#compareOne(Object, Object)} method.
*/
class CompareOneTest {
/**
		* Test case 1.
		* The method should return null if the two objects are equal.
		*/
		@Test
		void testCompareOne_1() {
				assertNull(CompareOne.compareOne(1, 1));
		}
		
		/**
		* Test case 2.
		* The method should return the first object if it is greater than the second object.
		*/
		@Test
		void testCompareOne_2() {
				assertEquals(2, CompareOne.compareOne(2, 1));
		}
		
		/**
		* Test case 3.
		* The method should return the second object if it is greater than the first object.
		*/
		@Test
		void testCompareOne_3() {
				assertEquals(2, CompareOne.compareOne(1, 2));
		}
		
		/**
		* Test case 4.
		* The method should return null if the two objects are equal.
		*/
		@Test
		void testCompareOne_4() {
				assertNull(CompareOne.compareOne(1.0, 1.0));
		}
		
		/**
		* Test case 5.
		* The method should return the first object if it is greater than the second object.
		*/
		@Test
		void testCompareOne_5() {
				assertEquals(2.0, CompareOne.compareOne(2.0, 1.0));
		}
		
		/**
		* Test case 6.
		* The method should return the second object if it is greater than the first object.
		*/
		@Test
		void testCompareOne_6() {
				assertEquals(2.0, CompareOne.compareOne(1.0, 2.0));
		}
		
		/**
		* Test case 7.
		* The method should return null if the two objects are equal.
		*/
		@Test
		void testCompareOne_7() {
				assertNull(CompareOne.compareOne("1", "1"));
		}
		
		/**
		* Test case 8.
		* The method should return the first object if it is greater than the second object.
		*/
		@Test
		void testCompareOne_8() {
				assertEquals("2", CompareOne.compareOne("2", "1"));
		}
		
		/**
		* Test case 9.
		* The method should return the second object if it is greater than the first object.
		*/
		@Test
		void testCompareOne_9() {
				assertEquals("2", CompareOne.compareOne("1", "2"));
		}
		
		/**
		* Test case 10.
		* The method should return null if the two objects are equal.
		*/
		@Test
		void testCompareOne_10() {
				assertNull(CompareOne.compareOne("1.0", "1.0"));
		}
		
		/**
		* Test case 11.
		* The method should return the first object if it is greater than the second object.
		*/
		@Test
		void testCompareOne_11() {
				assertEquals("2.0", CompareOne.compareOne("2.0", "1.0"));
		}
		
		/**
		* Test case 12.
		* The method should return the second object if it is greater than the first object.
		*/
		@Test
		void testCompareOne_12() {
				assertEquals("2.0", CompareOne.compareOne("1.0", "2.0"));
		}
		
		/**
		* Test case 13.
		* The method should return null if the two objects are equal.
		*/
		@Test
		void testCompareOne_13() {
				assertNull(CompareOne.compareOne("1,0", "1,0"));
		}
		
		/**
		* Test case 14.
		* The method should return the first object if it is greater than the second object.
		*/
		@Test
		void testCompareOne_14() {
				assertEquals("2,0", CompareOne.compareOne("2,0", "1,0"));
		}
		
		/**
		* Test case 15.
		* The method should return the second object if it is greater than the first object.
		*/
		@Test
		void testCompareOne_15() {
				assertEquals("2,0", CompareOne.compareOne("1,0", "2,0"));
		}
}