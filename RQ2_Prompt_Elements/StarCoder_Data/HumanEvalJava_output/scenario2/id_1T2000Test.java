// SeparateParenGroupsTest.java
package scenario2;

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
     * Test case for the {@link SeparateParenGroups#separateParenGroups(String)} method.
     * It tests the case where the input string is empty.
     */
    @Test
    void testSeparateParenGroups_Empty() {
        String parenString = "";
        List<String> expected = new ArrayList<String>();
        assertEquals(expected, SeparateParenGroups.separateParenGroups(parenString));
    }

    /**
     * Test case for the {@link SeparateParenGroups#separateParenGroups(String)} method.
     * It tests the case where the input string contains only one group of parentheses.
     */
    @Test
    void testSeparateParenGroups_OneGroup() {
        String parenString = "()";
        List<String> expected = new ArrayList<String>();
        expected.add("()");
        assertEquals(expected, SeparateParenGroups.separateParenGroups(parenString));
    }

    /**
     * Test case for the {@link SeparateParenGroups#separateParenGroups(String)} method.
     * It tests the case where the input string contains multiple groups of parentheses.
     */
    @Test
    void testSeparateParenGroups_MultipleGroups() {
        String parenString = "()()()";
        List<String> expected = new ArrayList<String>();
        expected.add("()");
        expected.add("()");
        expected.add("()");
        assertEquals(expected, SeparateParenGroups.separateParenGroups(parenString));
    }

    /**
     * Test case for the {@link SeparateParenGroups#separateParenGroups(String)} method.
     * It tests the case where the input string contains multiple groups of parentheses.
     */
    @Test
    void testSeparateParenGroups_MultipleGroups_WithSpaces() {
        String parenString = " ( ) ( ) ( ) ";
        List<String> expected = new ArrayList<String>();
        expected.add("()");
        expected.add("()");
        expected.add("()");
        assertEquals(expected, SeparateParenGroups.separateParenGroups(parenString));
    }

    /**
     * Test case for the {@link SeparateParenGroups#separateParenGroups(String)} method.
     * It tests the case where the input string contains multiple groups of parentheses.
     */
    @Test
    void testSeparateParenGroups_MultipleGroups_WithSpaces_WithNewLines() {
        String parenString = " ( ) \n ( ) \n ( ) ";
        List<String> expected = new ArrayList<String>();
        expected.add("()");
        expected.add("()");
        expected.add("()");
        assertEquals(expected, SeparateParenGroups.separateParenGroups(parenString));
    }

    /**
     * Test case for the {@link SeparateParenGroups#separateParenGroups(String)} method.
     * It tests the case where the input string contains multiple groups of parentheses.
     */
    @Test
    void testSeparateParenGroups_MultipleGroups_WithSpaces_WithNewLines_WithTabs() {
        String parenString = " ( ) \n\t ( ) \n\t ( ) ";
        List<String> expected = new ArrayList<String>();
        expected.add("()");
        expected.add("()");
        expected.add("()");
        assertEquals(expected, SeparateParenGroups.separateParenGroups(parenString));
    }

    /**
     * Test case for the {@link SeparateParenGroups#separateParenGroups(String)} method.
     * It tests the case where the input string contains multiple groups of parentheses.
     */
    @Test
    void testSeparateParenGroups_MultipleGroups_WithSpaces_WithNewLines_WithTabs_WithMultipleSpaces() {
        String parenString = " ( ) \n\t ( ) \n\t ( ) \n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\