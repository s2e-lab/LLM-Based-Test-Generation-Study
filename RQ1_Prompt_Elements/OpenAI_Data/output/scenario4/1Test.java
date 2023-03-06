// SeparateParenGroupsTest.java
package scenario3;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SeparateParenGroups}.
* It contains ten unit test cases for the {@link SeparateParenGroups#separateParenGroups(String)} method.
*/
class SeparateParenGroupsTest {

	@Test
	void testSeparateParenGroups() {
		List<String> expected = new ArrayList<>();
		expected.add("(()())");
		expected.add("((()))");
		expected.add("()");
		expected.add("((())()())");
		assertEquals(expected, SeparateParenGroups.separateParenGroups("(()()) ((())) () ((())()())"));
		
		expected = new ArrayList<>();
		expected.add("()");
		expected.add("(())");
		expected.add("((()))");
		expected.add("(((())))");
		assertEquals(expected, SeparateParenGroups.separateParenGroups("() (()) ((())) (((())))"));
		
		expected = new ArrayList<>();
		expected.add("(()(())((())))");
		assertEquals(expected, SeparateParenGroups.separateParenGroups("(()(())((())))"));
		
		expected = new ArrayList<>();
		expected.add("()");
		expected.add("(())");
		expected.add("(()())");
		assertEquals(expected, SeparateParenGroups.separateParenGroups("( ) (( )) (( )( ))"));
		
		expected = new ArrayList<>();
		expected.add("()");
		expected.add("(())");
		expected.add("(()())");
		assertEquals(expected, SeparateParenGroups.separateParenGroups("( ) (( )) (( )( ))"));
		
		expected = new ArrayList<>();
		expected.add("()");
		expected.add("(())");
		expected.add("(()())");
		assertEquals(expected, SeparateParenGroups.separateParenGroups("( ) (( )) (( )( ))"));
		
		expected = new ArrayList<>();
		expected.add("()");
		expected.add("(())");
		expected.add("(()())");
		assertEquals(expected, SeparateParenGroups.separateParenGroups("( ) (( )) (( )( ))"));
		
		expected = new ArrayList<>();
		expected.add("()");
		expected.add("(())");
		expected.add("(()())");
		assertEquals(expected, SeparateParenGroups.separateParenGroups("( ) (( )) (( )( ))"));
		
		expected = new ArrayList<>();
		expected.add("()");
		expected.add("(())");
		expected.add("(()())");
		assertEquals(expected, SeparateParenGroups.separateParenGroups("( ) (( )) (( )( ))"));
		
		expected = new ArrayList<>();
		expected.add("()");
		expected.add("(())");
		expected.add("(()())");
		assertEquals(expected, SeparateParenGroups.separateParenGroups("( ) (( )) (( )( ))"));
	}
}