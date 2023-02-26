// AllPrefixesTest.java
package scenario3;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AllPrefixes}.
* It contains ten unit test cases for the {@link AllPrefixes#allPrefixes(String)} method.
*/
class AllPrefixesTest {

	/**
	* Test case for {@link AllPrefixes#allPrefixes(String)} method.
	* It tests the method with a string of length 3.
	*/
	@Test
	void testAllPrefixesWithStringOfLength3() {
		List<Object> expected = new ArrayList<Object>();
		expected.add("a");
		expected.add("ab");
		expected.add("abc");
		assertEquals(expected, AllPrefixes.allPrefixes("abc"));
	}
	
	/**
	* Test case for {@link AllPrefixes#allPrefixes(String)} method.
	* It tests the method with an empty string.
	*/
	@Test
	void testAllPrefixesWithEmptyString() {
		List<Object> expected = new ArrayList<Object>();
		assertEquals(expected, AllPrefixes.allPrefixes(""));
	}
	
	/**
	* Test case for {@link AllPrefixes#allPrefixes(String)} method.
	* It tests the method with a string of length 6.
	*/
	@Test
	void testAllPrefixesWithStringOfLength6() {
		List<Object> expected = new ArrayList<Object>();
		expected.add("a");
		expected.add("as");
		expected.add("asd");
		expected.add("asdf");
		expected.add("asdfg");
		expected.add("asdfgh");
		assertEquals(expected, AllPrefixes.allPrefixes("asdfgh"));
	}
	
	/**
	* Test case for {@link AllPrefixes#allPrefixes(String)} method.
	* It tests the method with a string of length 3.
	*/
	@Test
	void testAllPrefixesWithStringOfLength3WithCapitalLetters() {
		List<Object> expected = new ArrayList<Object>();
		expected.add("W");
		expected.add("WW");
		expected.add("WWW");
		assertEquals(expected, AllPrefixes.allPrefixes("WWW"));
	}
	
	/**
	* Test case for {@link AllPrefixes#allPrefixes(String)} method.
	* It tests the method with a string of length 3.
	*/
	@Test
	void testAllPrefixesWithStringOfLength3WithSpecialCharacters() {
		List<Object> expected = new ArrayList<Object>();
		expected.add("!");
		expected.add("!@");
		expected.add("!@$");
		assertEquals(expected, AllPrefixes.allPrefixes("!@$"));
	}
	
	/**
	* Test case for {@link AllPrefixes#allPrefixes(String)} method.
	* It tests the method with a string of length 3.
	*/
	@Test
	void testAllPrefixesWithStringOfLength3WithNumbers() {
		List<Object> expected = new ArrayList<Object>();
		expected.add("1");
		expected.add("12");
		expected.add("123");
		assertEquals(expected, AllPrefixes.allPrefixes("123"));
	}
	
	/**
	* Test case for {@link AllPrefixes#allPrefixes(String)} method.
	* It tests the method with a string of length 3.
	*/
	@Test
	void testAllPrefixesWithStringOfLength3WithCapitalLettersAndNumbers() {
		List<Object> expected = new ArrayList<Object>();
		expected.add("A");
		expected.add("AB");
		expected.add("ABC");
		assertEquals(expected, AllPrefixes.allPrefixes("ABC"));
	}
	
	/**
	* Test case for {@link AllPrefixes#allPrefixes(String)} method.
	* It tests the method with a string of length 3.
	*/
	@Test
	void testAllPrefixesWithStringOfLength3WithSpecialCharactersAndNumbers() {
		List<Object> expected = new ArrayList<Object>();
		expected.add("!");
		expected.add("!@");
		expected.add("!@$");
		assertEquals(expected, AllPrefixes.allPrefixes("!@$"));
	}
	
	/**
	* Test case for {@link AllPrefixes#allPrefixes(String)} method.
	* It tests the method with a string of length 3.
	*/
	@Test
	void testAllPrefixesWithStringOfLength3WithCapitalLettersAndSpecialCharacters() {
		List<Object> expected = new ArrayList<Object>();
		expected.add("W");
		expected.add("WW");
		expected.add("WWW");
		assertEquals(expected, AllPrefixes.allPrefixes("WWW"));
	}
	
	/**
	* Test case for {@link AllPrefixes#allPrefixes(String)} method.
	* It tests the method with a string of length 3.
	*/
	@Test
	void testAllPrefixesWithStringOfLength3WithCapitalLettersAndSpecialCharactersAndNumbers() {
		List<Object> expected = new ArrayList<Object>();
		expected.add("A");
		expected.add("AB");
		expected.add("ABC");
		assertEquals(expected, AllPrefixes.allPrefixes("ABC"));
	}
}