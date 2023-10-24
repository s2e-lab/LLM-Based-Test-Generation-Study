// ParseNestedParensTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ParseNestedParens}.
* It contains ten unit test cases for the {@link ParseNestedParens#parseNestedParens(String)} method.
*/
class ParseNestedParensTest {

    /**
    * Test case for {@link ParseNestedParens#parseNestedParens(String)} with input "(()()) ((())) () ((())()())".
    */
    @Test
    void testParseNestedParens1() {
        String parenString = "(()()) ((())) () ((())()())";
        List<Integer> expected = List.of(2, 3, 1, 3);
        assertEquals(expected, ParseNestedParens.parseNestedParens(parenString));
    }

    /**
    * Test case for {@link ParseNestedParens#parseNestedParens(String)} with input "() (()) ((())) (((())))".
    */
    @Test
    void testParseNestedParens2() {
        String parenString = "() (()) ((())) (((())))";
        List<Integer> expected = List.of(1, 2, 3, 4);
        assertEquals(expected, ParseNestedParens.parseNestedParens(parenString));
    }

    /**
    * Test case for {@link ParseNestedParens#parseNestedParens(String)} with input "(()(())((())))".
    */
    @Test
    void testParseNestedParens3() {
        String parenString = "(()(())((())))";
        List<Integer> expected = List.of(4);
        assertEquals(expected, ParseNestedParens.parseNestedParens(parenString));
    }

    /**
    * Test case for {@link ParseNestedParens#parseNestedParens(String)} with input "()".
    */
    @Test
    void testParseNestedParens4() {
        String parenString = "()";
        List<Integer> expected = List.of(1);
        assertEquals(expected, ParseNestedParens.parseNestedParens(parenString));
    }

    /**
    * Test case for {@link ParseNestedParens#parseNestedParens(String)} with input "()()".
    */
    @Test
    void testParseNestedParens5() {
        String parenString = "()()";
        List<Integer> expected = List.of(2);
        assertEquals(expected, ParseNestedParens.parseNestedParens(parenString));
    }

    /**
    * Test case for {@link ParseNestedParens#parseNestedParens(String)} with input "()()()".
    */
    @Test
    void testParseNestedParens6() {
        String parenString = "()()()";
        List<Integer> expected = List.of(3);
        assertEquals(expected, ParseNestedParens.parseNestedParens(parenString));
    }

    /**
    * Test case for {@link ParseNestedParens#parseNestedParens(String)} with input "()()()()".
    */
    @Test
    void testParseNestedParens7() {
        String parenString = "()()()()";
        List<Integer> expected = List.of(4);
        assertEquals(expected, ParseNestedParens.parseNestedParens(parenString));
    }

    /**
    * Test case for {@link ParseNestedParens#parseNestedParens(String)} with input "()()()()()".
    */
    @Test
    void testParseNestedParens8() {
        String parenString = "()()()()()";
        List<Integer> expected = List.of(5);
        assertEquals(expected, ParseNestedParens.parseNestedParens(parenString));
    }

    /**
    * Test case for {@link ParseNestedParens#parseNestedParens(String)} with input "()()()()()()".
    */
    @Test
    void testParseNestedParens9() {
        String parenString = "()()()()()()";
        List<Integer> expected = List.of(6);
        assertEquals(expected, ParseNestedParens.parseNestedParens(parenString));
    }

    /**
    * Test case for {@link ParseNestedParens#parseNestedParens(String)} with input "()()()()()()()".
    */
    @Test
    void testParseNestedParens10() {
        String parenString = "()()()()()()()";
        List<Integer> expected = List.of(7);
        assertEquals(expected, ParseNestedParens.parseNestedParens(parenString));
    }
}
