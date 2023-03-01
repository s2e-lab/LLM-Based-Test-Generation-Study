// CycpatternCheckTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CycpatternCheck}.
* It contains ten unit test cases for the {@link CycpatternCheck#cycpatternCheck(String, String)} method.
*/
class CycpatternCheckTest {

		/**
		* Test case 1.
		* <p>
		* Test if the method returns false when the second word is not a substring of the first word.
		*/
		@Test
		void test1() {
				assertFalse(CycpatternCheck.cycpatternCheck("abcd","abd"));
		}
		
		/**
		* Test case 2.
		* <p>
		* Test if the method returns true when the second word is a substring of the first word.
		*/
		@Test
		void test2() {
				assertTrue(CycpatternCheck.cycpatternCheck("hello","ell"));
		}
		
		/**
		* Test case 3.
		* <p>
		* Test if the method returns false when the second word is not a substring of the first word.
		*/
		@Test
		void test3() {
				assertFalse(CycpatternCheck.cycpatternCheck("whassup","psus"));
		}
		
		/**
		* Test case 4.
		* <p>
		* Test if the method returns true when the second word is a substring of the first word.
		*/
		@Test
		void test4() {
				assertTrue(CycpatternCheck.cycpatternCheck("abab","baa"));
		}
		
		/**
		* Test case 5.
		* <p>
		* Test if the method returns false when the second word is not a substring of the first word.
		*/
		@Test
		void test5() {
				assertFalse(CycpatternCheck.cycpatternCheck("efef","eeff"));
		}
		
		/**
		* Test case 6.
		* <p>
		* Test if the method returns true when the second word is a substring of the first word.
		*/
		@Test
		void test6() {
				assertTrue(CycpatternCheck.cycpatternCheck("himenss","simen"));
		}
		
		/**
		* Test case 7.
		* <p>
		* Test if the method returns false when the second word is not a substring of the first word.
		*/
		@Test
		void test7() {
				assertFalse(CycpatternCheck.cycpatternCheck("xyzw", "xyw"));
		}
		
		/**
		* Test case 8.
		* <p>
		* Test if the method returns true when the second word is a substring of the first word.
		*/
		@Test
		void test8() {
				assertTrue(CycpatternCheck.cycpatternCheck("yello", "ell"));
		}
		
		/**
		* Test case 9.
		* <p>
		* Test if the method returns false when the second word is not a substring of the first word.
		*/
		@Test
		void test9() {
				assertFalse(CycpatternCheck.cycpatternCheck("whattup", "ptut"));
		}
		
		/**
		* Test case 10.
		* <p>
		* Test if the method returns true when the second word is a substring of the first word.
		*/
		@Test
		void test10() {
				assertTrue(CycpatternCheck.cycpatternCheck("efef", "fee"));
		}
		
		/**
		* Test case 11.
		* <p>
		* Test if the method returns false when the second word is not a substring of the first word.
		*/
		@Test
		void test11() {
				assertFalse(CycpatternCheck.cycpatternCheck("abab", "aabb"));
		}
		
		/**
		* Test case 12.
		* <p>
		* Test if the method returns true when the second word is a substring of the first word.
		*/
		@Test
		void test12() {
				assertTrue(CycpatternCheck.cycpatternCheck("winemtt", "tinem"));
		}
}