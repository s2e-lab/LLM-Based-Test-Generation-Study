// ParseNestedParensTest.java
package scenario1;

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
    void testParseNestedParens1() {
        String parenString = "(()())";
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(2);
        expected.add(1);
        assertEquals(expected, ParseNestedParens.parseNestedParens(parenString));
    }

    @Test
    void testParseNestedParens2() {
        String parenString = "()(())";
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(1);
        assertEquals(expected, ParseNestedParens.parseNestedParens(parenString));
    }

    @Test
    void testParseNestedParens3() {
        String parenString = "()()";
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        assertEquals(expected, ParseNestedParens.parseNestedParens(parenString));
    }

    @Test
    void testParseNestedParens4() {
        String parenString = "(()";
        List<Integer> expected = new ArrayList<Integer>();
        assertEquals(expected, ParseNestedParens.parseNestedParens(parenString));
    }

    @Test
    void testParseNestedParens5() {
        String parenString = "()";
        List<Integer> expected = new ArrayList<Integer>();
        assertEquals(expected, ParseNestedParens.parseNestedParens(parenString));
    }

    @Test
    void testParseNestedParens6() {
        String parenString = "(()))";
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(2);
        assertEquals(expected, ParseNestedParens.parseNestedParens(parenString));
    }

    @Test
    void testParseNestedParens7() {
        String parenString = "()(()";
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        assertEquals(expected, ParseNestedParens.parseNestedParens(parenString));
    }

    @Test
    void testParseNestedParens8() {
        String parenString = "()()(";
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        assertEquals(expected, ParseNestedParens.parseNestedParens(parenString));
    }

    @Test
    void testParseNestedParens9() {
        String parenString = "()(()))";
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(2);
        assertEquals(expected, ParseNestedParens.parseNestedParens(parenString));
    }

    @Test
    void testParseNestedParens10() {
        String parenString = "()()()";
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        assertEquals(expected, ParseNestedParens.parseNestedParens(parenString));
    }
}
