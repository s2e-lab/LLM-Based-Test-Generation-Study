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

    /**
    * Test case for {@link ParseNestedParens#parseNestedParens(String)} where the input string is "(()()) ((())) () ((())()())".
    */
    @Test
    void testParseNestedParens1() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(2);
        expected.add(3);
        expected.add(1);
        expected.add(3);
        assertEquals(expected, ParseNestedParens.parseNestedParens("(()()) ((())) () ((())()())"));
    }

    /**
    * Test case for {@link ParseNestedParens#parseNestedParens(String)} where the input string is "() (()) ((())) (((())))".
    */
    @Test
    void testParseNestedParens2() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        assertEquals(expected, ParseNestedParens.parseNestedParens("() (()) ((())) (((())))"));
    }

    /**
    * Test case for {@link ParseNestedParens#parseNestedParens(String)} where the input string is "(()(())((())))".
    */
    @Test
    void testParseNestedParens3() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(4);
        assertEquals(expected, ParseNestedParens.parseNestedParens("(()(())((())))"));
    }

    /**
    * Test case for {@link ParseNestedParens#parseNestedParens(String)} where the input string is "()".
    */
    @Test
    void testParseNestedParens4() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        assertEquals(expected, ParseNestedParens.parseNestedParens("()"));
    }

    /**
    * Test case for {@link ParseNestedParens#parseNestedParens(String)} where the input string is "()()".
    */
    @Test
    void testParseNestedParens5() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(2);
        assertEquals(expected, ParseNestedParens.parseNestedParens("()()"));
    }

    /**
    * Test case for {@link ParseNestedParens#parseNestedParens(String)} where the input string is "()()()".
    */
    @Test
    void testParseNestedParens6() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(3);
        assertEquals(expected, ParseNestedParens.parseNestedParens("()()()"));
    }

    /**
    * Test case for {@link ParseNestedParens#parseNestedParens(String)} where the input string is "()()()()".
    */
    @Test
    void testParseNestedParens7() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(4);
        assertEquals(expected, ParseNestedParens.parseNestedParens("()()()()"));
    }

    /**
    * Test case for {@link ParseNestedParens#parseNestedParens(String)} where the input string is "()()()()()".
    */
    @Test
    void testParseNestedParens8() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(5);
        assertEquals(expected, ParseNestedParens.parseNestedParens("()()()()()"));
    }

    /**
    * Test case for {@link ParseNestedParens#parseNestedParens(String)} where the input string is "()()()()()()".
    */
    @Test
    void testParseNestedParens9() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(6);
        assertEquals(expected, ParseNestedParens.parseNestedParens("()()()()()()"));
    }

    /**
    * Test case for {@link ParseNestedParens#parseNestedParens(String)} where the input string is "()()()()()()()".
    */
    @Test
    void testParseNestedParens10() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(7);
        assertEquals(expected, ParseNestedParens.parseNestedParens("()()()()()()()"));
    }
}
