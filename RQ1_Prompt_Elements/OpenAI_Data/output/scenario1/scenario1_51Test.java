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
	* Test case 1.
	* The input string is null.
	* The expected result is an empty string.
	*/
	@Test
	void test1() {
		String input = null;
		String expected = "";
		String actual = RemoveVowels.removeVowels(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 2.
	* The input string is empty.
	* The expected result is an empty string.
	*/
	@Test
	void test2() {
		String input = "";
		String expected = "";
		String actual = RemoveVowels.removeVowels(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 3.
	* The input string contains only vowels.
	* The expected result is an empty string.
	*/
	@Test
	void test3() {
		String input = "aeiouAEIOU";
		String expected = "";
		String actual = RemoveVowels.removeVowels(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 4.
	* The input string contains only consonants.
	* The expected result is the same string.
	*/
	@Test
	void test4() {
		String input = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
		String expected = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
		String actual = RemoveVowels.removeVowels(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 5.
	* The input string contains only numbers.
	* The expected result is the same string.
	*/
	@Test
	void test5() {
		String input = "0123456789";
		String expected = "0123456789";
		String actual = RemoveVowels.removeVowels(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 6.
	* The input string contains only special characters.
	* The expected result is the same string.
	*/
	@Test
	void test6() {
		String input = "!@#$%^&*()_+-=[]{}\\|;:'\",.<>/?";
		String expected = "!@#$%^&*()_+-=[]{}\\|;:'\",.<>/?";
		String actual = RemoveVowels.removeVowels(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 7.
	* The input string contains only spaces.
	* The expected result is the same string.
	*/
	@Test
	void test7() {
		String input = " ";
		String expected = " ";
		String actual = RemoveVowels.removeVowels(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 8.
	* The input string contains a mix of vowels, consonants, numbers, special characters, and spaces.
	* The expected result is the same string without vowels.
	*/
	@Test
	void test8() {
		String input = "a1b2c3d4e5f6g7h8i9j0k!l@m#n$o%p^q&r*s(t)u_v+w-x=y[z]{A}\\B|C;D:'E,F.G<H>I?J";
		String expected = "1b2c3d4f6g7h8j0k!l@m#n$p^q&r*s(t)u_v+w-x=y[z]{}\\|;:'.,<>?J";
		String actual = RemoveVowels.removeVowels(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 9.
	* The input string contains a mix of vowels, consonants, numbers, special characters, and spaces.
	* The expected result is the same string without vowels.
	*/
	@Test
	void test9() {
		String input = "a1b2c3d4e5f6g7h8i9j0k!l@m#n$o%p^q&r*s(t)u_v+w-x=y[z]{A}\\B|C;D:'E,F.G<H>I?J";
		String expected = "1b2c3d4f6g7h8j0k!l@m#n$p^q&r*s(t)u_v+w-x=y[z]{}\\|;:'.,<>?J";
		String actual = RemoveVowels.removeVowels(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 10.
	* The input string contains a mix of vowels, consonants, numbers, special characters, and spaces.
	* The expected result is the same string without vowels.
	*/
	@Test
	void test10() {
		String input = "a1b2c3d4e5f6g7h8i9j0k!l@m#n$o%p^q&r*s(t)u_v+w-x=y[z]{A}\\B|C;D:'E,F.G<H>I?J";
		String expected = "1b2c3d4f6g7h8j0k!l@m#n$p^q&r*s(t)u_v+w-x=y[z]{}\\|;:'.,<>?J";
		String actual = RemoveVowels.removeVowels(input);
		assertEquals(expected, actual);
	}
}