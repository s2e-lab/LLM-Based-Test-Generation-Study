// RemoveVowelsTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RemoveVowels}.
* It contains ten unit test cases for the {@link RemoveVowels#removeVowels(String)} method.
*/
class RemoveVowelsTest {

		/**
		* Test case for {@link RemoveVowels#removeVowels(String)} method.
		* This test case checks if the method returns the correct string when the input string is empty.
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
		* This test case checks if the method returns the correct string when the input string contains only vowels.
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
		* This test case checks if the method returns the correct string when the input string contains only consonants.
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
		* This test case checks if the method returns the correct string when the input string contains only special characters.
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
		* This test case checks if the method returns the correct string when the input string contains only numbers.
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
		* This test case checks if the method returns the correct string when the input string contains only whitespaces.
		*/
		@Test
		void testRemoveVowels_OnlyWhitespaces() {
				String input = " \t\n\r";
				String expected = " \t\n\r";
				String actual = RemoveVowels.removeVowels(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link RemoveVowels#removeVowels(String)} method.
		* This test case checks if the method returns the correct string when the input string contains only lowercase letters.
		*/
		@Test
		void testRemoveVowels_OnlyLowercaseLetters() {
				String input = "bcdfghjklmnpqrstvwxyz";
				String expected = "bcdfghjklmnpqrstvwxyz";
				String actual = RemoveVowels.removeVowels(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link RemoveVowels#removeVowels(String)} method.
		* This test case checks if the method returns the correct string when the input string contains only uppercase letters.
		*/
		@Test
		void testRemoveVowels_OnlyUppercaseLetters() {
				String input = "BCDFGHJKLMNPQRSTVWXYZ";
				String expected = "BCDFGHJKLMNPQRSTVWXYZ";
				String actual = RemoveVowels.removeVowels(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link RemoveVowels#removeVowels(String)} method.
		* This test case checks if the method returns the correct string when the input string contains a mix of all characters.
		*/
		@Test
		void testRemoveVowels_AllCharacters() {
				String input = "!@#$%^&*()_+-=[]{}\\|;:'\",.<>/?0123456789 \t\n\rbcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZaeiouAEIOU";
				String expected = "!@#$%^&*()_+-=[]{}\\|;:'\",.<>/?0123456789 \t\n\rbcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
				String actual = RemoveVowels.removeVowels(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link RemoveVowels#removeVowels(String)} method.
		* This test case checks if the method returns the correct string when the input string contains a mix of all characters and the string is very long.
		*/
		@Test
		void testRemoveVowels_AllCharactersLongString() {
				String input = "!@#$%^&*()_+-=[]{}\\|;:'\",.<>/?0123456789 \t\n\rbcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZaeiouAEIOU!@#$%^&*()_+-=[]{}\\|;:'\",.<>/?0123456789 \t\n\rbcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZaeiouAEIOU!@#$%^&*()_+-=[]{}\\|;:'\",.<>/?0123456789 \t\n\rbcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZaeiouAEIOU!@#$%^&*()_+-=[]{}\\|;:'\",.<>/?0123456789 \t\n\rbcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZaeiouAEIOU!@#$%^&*()_+-=[]{}\\|;:'\",.<>/?0123456789 \t\n\rbcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZaeiouAEIOU!@#$%^&*()_+-=[]{}\\|;:'\",.<>/?0123456789 \t\n\rbcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZaeiouAEIOU!@#$%^&*()_