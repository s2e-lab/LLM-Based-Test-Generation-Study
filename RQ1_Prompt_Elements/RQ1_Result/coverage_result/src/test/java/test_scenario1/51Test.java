// RemoveVowelsTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RemoveVowels}.
* It contains ten unit test cases for the {@link RemoveVowels#removeVowels(String)} method.
*/
class RemoveVowelsTest {

		/**
		* Test case for {@link RemoveVowels#removeVowels(String)} method.
		* This test case checks if the method returns the correct result when the input string is empty.
		*/
		@Test
		void testRemoveVowels_EmptyString() {
				String input = "";
				String expected = "";
				String actual = RemoveVowels.removeVowels(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link RemoveVowels#removeVowels(String)} method.
		* This test case checks if the method returns the correct result when the input string contains only vowels.
		*/
		@Test
		void testRemoveVowels_OnlyVowels() {
				String input = "aeiouAEIOU";
				String expected = "";
				String actual = RemoveVowels.removeVowels(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link RemoveVowels#removeVowels(String)} method.
		* This test case checks if the method returns the correct result when the input string contains only consonants.
		*/
		@Test
		void testRemoveVowels_OnlyConsonants() {
				String input = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
				String expected = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
				String actual = RemoveVowels.removeVowels(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link RemoveVowels#removeVowels(String)} method.
		* This test case checks if the method returns the correct result when the input string contains only numbers.
		*/
		@Test
		void testRemoveVowels_OnlyNumbers() {
				String input = "0123456789";
				String expected = "0123456789";
				String actual = RemoveVowels.removeVowels(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link RemoveVowels#removeVowels(String)} method.
		* This test case checks if the method returns the correct result when the input string contains only special characters.
		*/
		@Test
		void testRemoveVowels_OnlySpecialCharacters() {
				String input = "!@#$%^&*()_+-=[]{}\\|;:'\",.<>/?";
				String expected = "!@#$%^&*()_+-=[]{}\\|;:'\",.<>/?";
				String actual = RemoveVowels.removeVowels(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link RemoveVowels#removeVowels(String)} method.
		* This test case checks if the method returns the correct result when the input string contains only spaces.
		*/
		@Test
		void testRemoveVowels_OnlySpaces() {
				String input = "     ";
				String expected = "     ";
				String actual = RemoveVowels.removeVowels(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link RemoveVowels#removeVowels(String)} method.
		* This test case checks if the method returns the correct result when the input string contains only tabs.
		*/
		@Test
		void testRemoveVowels_OnlyTabs() {
				String input = "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\