// CycpatternCheckTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CycpatternCheck}.
* It contains ten unit test cases for the {@link CycpatternCheck#cycpatternCheck(String, String)} method.
*/
class CycpatternCheckTest {
/**
		* Test case 1.
		* The method should return true if the second word or any of its rotations is a substring in the first word.
		*/
		@Test
		void testCase1() {
				assertTrue(CycpatternCheck.cycpatternCheck("abcdef", "defabc"));
		}
		
		/**
		* Test case 2.
		* The method should return true if the second word or any of its rotations is a substring in the first word.
		*/
		@Test
		void testCase2() {
				assertTrue(CycpatternCheck.cycpatternCheck("abcdef", "cdefab"));
		}
		
		/**
		* Test case 3.
		* The method should return true if the second word or any of its rotations is a substring in the first word.
		*/
		@Test
		void testCase3() {
				assertTrue(CycpatternCheck.cycpatternCheck("abcdef", "efabcd"));
		}
		
		/**
		* Test case 4.
		* The method should return false if the second word or any of its rotations is not a substring in the first word.
		*/
		@Test
		void testCase4() {
				assertFalse(CycpatternCheck.cycpatternCheck("abcdef", "abcdefg"));
		}
		
		/**
		* Test case 5.
		* The method should return false if the second word or any of its rotations is not a substring in the first word.
		*/
		@Test
		void testCase5() {
				assertFalse(CycpatternCheck.cycpatternCheck("abcdef", "abcdefgh"));
		}
		
		/**
		* Test case 6.
		* The method should return false if the second word or any of its rotations is not a substring in the first word.
		*/
		@Test
		void testCase6() {
				assertFalse(CycpatternCheck.cycpatternCheck("abcdef", "abcdefghi"));
		}
		
		/**
		* Test case 7.
		* The method should return false if the second word or any of its rotations is not a substring in the first word.
		*/
		@Test
		void testCase7() {
				assertFalse(CycpatternCheck.cycpatternCheck("abcdef", "abcdefghij"));
		}
		
		/**
		* Test case 8.
		* The method should return false if the second word or any of its rotations is not a substring in the first word.
		*/
		@Test
		void testCase8() {
				assertFalse(CycpatternCheck.cycpatternCheck("abcdef", "abcdefghijk"));
		}
		
		/**
		* Test case 9.
		* The method should return false if the second word or any of its rotations is not a substring in the first word.
		*/
		@Test
		void testCase9() {
				assertFalse(CycpatternCheck.cycpatternCheck("abcdef", "abcdefghijkl"));
		}
		
		/**
		* Test case 10.
		* The method should return false if the second word or any of its rotations is not a substring in the first word.
		*/
		@Test
		void testCase10() {
				assertFalse(CycpatternCheck.cycpatternCheck("abcdef", "abcdefghijklm"));
		}
}