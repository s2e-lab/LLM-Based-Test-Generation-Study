// ParseNestedParensTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ParseNestedParens}.
* It contains ten unit test cases for the {@link ParseNestedParens#parseNestedParens(String)} method.
*/
class ParseNestedParensTest {
    
    @Test
    void testEmptyString() {
        List<Integer> expected = new ArrayList<Integer>();
        List<Integer> result = ParseNestedParens.parseNestedParens("");
        assertEquals(expected, result);
    }
    
    @Test
    void testSingleGroup() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        List<Integer> result = ParseNestedParens.parseNestedParens("()");
        assertEquals(expected, result);
    }
    
    @Test
    void testMultipleGroups() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(2);
        expected.add(3);
        expected.add(1);
        expected.add(3);
        List<Integer> result = ParseNestedParens.parseNestedParens("(()()) ((())) () ((())()())");
        assertEquals(expected, result);
    }
    
    @Test
    void testNestedGroups() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        List<Integer> result = ParseNestedParens.parseNestedParens("() (()) ((())) (((())))");
        assertEquals(expected, result);
    }
    
    @Test
    void testSingleGroupWithNestedGroups() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(4);
        List<Integer> result = ParseNestedParens.parseNestedParens("(()(())((())))");
        assertEquals(expected, result);
    }
    
    @Test
    void testNoGroups() {
        List<Integer> expected = new ArrayList<Integer>();
        List<Integer> result = ParseNestedParens.parseNestedParens("abcde");
        assertEquals(expected, result);
    }
    
    @Test
    void testOnlyOpeningParentheses() {
        List<Integer> expected = new ArrayList<Integer>();
        List<Integer> result = ParseNestedParens.parseNestedParens("(((((");
        assertEquals(expected, result);
    }
    
    @Test
    void testOnlyClosingParentheses() {
        List<Integer> expected = new ArrayList<Integer>();
        List<Integer> result = ParseNestedParens.parseNestedParens(")))))");
        assertEquals(expected, result);
    }
    
    @Test
    void testMixedParentheses() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        expected.add(1);
        expected.add(2);
        List<Integer> result = ParseNestedParens.parseNestedParens("() (()) ) ((())(");
        assertEquals(expected, result);
    }
    
    @Test
    void testOnlySpaces() {
        List<Integer> expected = new ArrayList<Integer>();
        List<Integer> result = ParseNestedParens.parseNestedParens("   ");
        assertEquals(expected, result);
    }
}