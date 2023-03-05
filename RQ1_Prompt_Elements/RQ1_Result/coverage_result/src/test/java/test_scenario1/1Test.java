// SeparateParenGroupsTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SeparateParenGroups}.
* It contains ten unit test cases for the {@link SeparateParenGroups#separateParenGroups(String)} method.
*/
class SeparateParenGroupsTest {

	/**
	* Test case 1.
	* The input string is null.
	* The expected result is an empty list.
	*/
	@Test
	void testCase1() {
		String input = null;
		List<String> expected = new ArrayList<String>();
		List<String> actual = SeparateParenGroups.separateParenGroups(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 2.
	* The input string is empty.
	* The expected result is an empty list.
	*/
	@Test
	void testCase2() {
		String input = "";
		List<String> expected = new ArrayList<String>();
		List<String> actual = SeparateParenGroups.separateParenGroups(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 3.
	* The input string is "()".
	* The expected result is a list containing "()".
	*/
	@Test
	void testCase3() {
		String input = "()";
		List<String> expected = new ArrayList<String>();
		expected.add("()");
		List<String> actual = SeparateParenGroups.separateParenGroups(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 4.
	* The input string is "()()".
	* The expected result is a list containing "()" and "()".
	*/
	@Test
	void testCase4() {
		String input = "()()";
		List<String> expected = new ArrayList<String>();
		expected.add("()");
		expected.add("()");
		List<String> actual = SeparateParenGroups.separateParenGroups(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 5.
	* The input string is "()()()".
	* The expected result is a list containing "()", "()" and "()".
	*/
	@Test
	void testCase5() {
		String input = "()()()";
		List<String> expected = new ArrayList<String>();
		expected.add("()");
		expected.add("()");
		expected.add("()");
		List<String> actual = SeparateParenGroups.separateParenGroups(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 6.
	* The input string is "(())".
	* The expected result is a list containing "(())".
	*/
	@Test
	void testCase6() {
		String input = "(())";
		List<String> expected = new ArrayList<String>();
		expected.add("(())");
		List<String> actual = SeparateParenGroups.separateParenGroups(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 7.
	* The input string is "(()())".
	* The expected result is a list containing "(())", "()".
	*/
	@Test
	void testCase7() {
		String input = "(()())";
		List<String> expected = new ArrayList<String>();
		expected.add("(())");
		expected.add("()");
		List<String> actual = SeparateParenGroups.separateParenGroups(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 8.
	* The input string is "()(())".
	* The expected result is a list containing "()", "(())".
	*/
	@Test
	void testCase8() {
		String input = "()(())";
		List<String> expected = new ArrayList<String>();
		expected.add("()");
		expected.add("(())");
		List<String> actual = SeparateParenGroups.separateParenGroups(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 9.
	* The input string is "((()))".
	* The expected result is a list containing "((()))".
	*/
	@Test
	void testCase9() {
		String input = "((()))";
		List<String> expected = new ArrayList<String>();
		expected.add("((()))");
		List<String> actual = SeparateParenGroups.separateParenGroups(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 10.
	* The input string is "((()()))".
	* The expected result is a list containing "((()))", "()".
	*/
	@Test
	void testCase10() {
		String input = "((()()))";
		List<String> expected = new ArrayList<String>();
		expected.add("((()))");
		expected.add("()");
		List<String> actual = SeparateParenGroups.separateParenGroups(input);
		assertEquals(expected, actual);
	}
}