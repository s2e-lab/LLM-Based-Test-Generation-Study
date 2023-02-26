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
		* The method {@link CompareOne#compareOne(Object, Object)} should return null when the two parameters are equal.
		*/
		@Test
		void testCompareOne_1() {
				assertEquals(null, CompareOne.compareOne(1, 1));
		}
		
		/**
		* Test case 2.
		* The method {@link CompareOne#compareOne(Object, Object)} should return the first parameter when it is greater than the second parameter.
		*/
		@Test
		void testCompareOne_2() {
				assertEquals(2, CompareOne.compareOne(2, 1));
		}
		
		/**
		* Test case 3.
		* The method {@link CompareOne#compareOne(Object, Object)} should return the second parameter when it is greater than the first parameter.
		*/
		@Test
		void testCompareOne_3() {
				assertEquals(2, CompareOne.compareOne(1, 2));
		}
		
		/**
		* Test case 4.
		* The method {@link CompareOne#compareOne(Object, Object)} should return null when the two parameters are equal.
		*/
		@Test
		void testCompareOne_4() {
				assertEquals(null, CompareOne.compareOne(1.0, 1.0));
		}
		
		/**
		* Test case 5.
		* The method {@link CompareOne#compareOne(Object, Object)} should return the first parameter when it is greater than the second parameter.
		*/
		@Test
		void testCompareOne_5() {
				assertEquals(2.0, CompareOne.compareOne(2.0, 1.0));
		}
		
		/**
		* Test case 6.
		* The method {@link CompareOne#compareOne(Object, Object)} should return the second parameter when it is greater than the first parameter.
		*/
		@Test
		void testCompareOne_6() {
				assertEquals(2.0, CompareOne.compareOne(1.0, 2.0));
		}
		
		/**
		* Test case 7.
		* The method {@link CompareOne#compareOne(Object, Object)} should return null when the two parameters are equal.
		*/
		@Test
		void testCompareOne_7() {
				assertEquals(null, CompareOne.compareOne("1", "1"));
		}
		
		/**
		* Test case 8.
		* The method {@link CompareOne#compareOne(Object, Object)} should return the first parameter when it is greater than the second parameter.
		*/
		@Test
		void testCompareOne_8() {
				assertEquals("2", CompareOne.compareOne("2", "1"));
		}
		
		/**
		* Test case 9.
		* The method {@link CompareOne#compareOne(Object, Object)} should return the second parameter when it is greater than the first parameter.
		*/
		@Test
		void testCompareOne_9() {
				assertEquals("2", CompareOne.compareOne("1", "2"));
		}
		
		/**
		* Test case 10.
		* The method {@link CompareOne#compareOne(Object, Object)} should return null when the two parameters are equal.
		*/
		@Test
		void testCompareOne_10() {
				assertEquals(null, CompareOne.compareOne("1.0", "1.0"));
		}
		
		/**
		* Test case 11.
		* The method {@link CompareOne#compareOne(Object, Object)} should return the first parameter when it is greater than the second parameter.
		*/
		@Test
		void testCompareOne_11() {
				assertEquals("2.0", CompareOne.compareOne("2.0", "1.0"));
		}
		
		/**
		* Test case 12.
		* The method {@link CompareOne#compareOne(Object, Object)} should return the second parameter when it is greater than the first parameter.
		*/
		@Test
		void testCompareOne_12() {
				assertEquals("2.0", CompareOne.compareOne("1.0", "2.0"));
		}
		
		/**
		* Test case 13.
		* The method {@link CompareOne#compareOne(Object, Object)} should return null when the two parameters are equal.
		*/
		@Test
		void testCompareOne_13() {
				assertEquals(null, CompareOne.compareOne("1,0", "1,0"));
		}
		
		/**
		* Test case 14.
		* The method {@link CompareOne#compareOne(Object, Object)} should return the first parameter when it is greater than the second parameter.
		*/
		@Test
		void testCompareOne_14() {
				assertEquals("2,0", CompareOne.compareOne("2,0", "1,0"));
		}
		
		/**
		* Test case 15.
		* The method {@link CompareOne#compareOne(Object, Object)} should return the second parameter when it is greater than the first parameter.
		*/
		@Test
		void testCompareOne_15() {
				assertEquals("2,0", CompareOne.compareOne("1,0", "2,0"));
		}
		
		/**
		* Test case 16.
		* The method {@link CompareOne#compareOne(Object, Object)} should return null when the two parameters are equal.
		*/
		@Test
		void testCompareOne_16() {
				assertEquals(null, CompareOne.compareOne("1.0", "1,0"));
		}
		
		/**
		* Test case 17.
		* The method {@link CompareOne#compareOne(Object, Object)} should return the first parameter when it is greater than the second parameter.
		*/
		@Test
		void testCompareOne_17() {
				assertEquals("2.0", CompareOne.compareOne("2.0", "1,0"));
		}
		
		/**
		* Test case 18.
		* The method {@link CompareOne#compareOne(Object, Object)} should return the second parameter when it is greater than the first parameter.
		*/
		@Test
		void testCompareOne_18() {
				assertEquals("2,0", CompareOne.compareOne("1.0", "2,0"));
		}
		
		/**
		* Test case 19.
		* The method {@link CompareOne#compareOne(Object, Object)} should return null when the two parameters are equal.
		*/
		@Test
		void testCompareOne_19() {
				assertEquals(null, CompareOne.compareOne("1,0", "1.0"));
		}
		
		/**
		* Test case 20.
		* The method {@link CompareOne#compareOne(Object, Object)} should return the first parameter when it is greater than the second parameter.
		*/
		@Test
		void testCompareOne_20() {
				assertEquals("2,0", CompareOne.compareOne("2,0", "1.0"));
		}
		
		/**
		* Test case 21.
		* The method {@link CompareOne#compareOne(Object, Object)} should return the second parameter when it is greater than the first parameter.
		*/
		@Test
		void testCompareOne_21() {
				assertEquals