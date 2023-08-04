// ParseNestedParensTest.java
package scenario2;

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
     * Test case for the {@link ParseNestedParens#parseNestedParens(String)} method.
     */
    @Test
    void testParseNestedParens() {
        List<Integer> result = new ArrayList<Integer>();
        result.add(1);
        result.add(2);
        result.add(3);
        result.add(2);
        result.add(1);
        result.add(1);
        result.add(1);
        result.add(1);
        result.add(1);
        result.add(1);
        assertEquals(result, ParseNestedParens.parseNestedParens("((())())"));
    }

    /**
     * Test case for the {@link ParseNestedParens#parseNestedParens(String)} method.
     */
    @Test
    void testParseNestedParens2() {
        List<Integer> result = new ArrayList<Integer>();
        result.add(1);
        result.add(2);
        result.add(3);
        result.add(2);
        result.add(1);
        result.add(1);
        result.add(1);
        result.add(1);
        result.add(1);
        result.add(1);
        assertEquals(result, ParseNestedParens.parseNestedParens("((())())"));
    }

    /**
     * Test case for the {@link ParseNestedParens#parseNestedParens(String)} method.
     */
    @Test
    void testParseNestedParens3() {
        List<Integer> result = new ArrayList<Integer>();
        result.add(1);
        result.add(2);
        result.add(3);
        result.add(2);
        result.add(1);
        result.add(1);
        result.add(1);
        result.add(1);
        result.add(1);
        result.add(1);
        assertEquals(result, ParseNestedParens.parseNestedParens("((())())"));
    }

    /**
     * Test case for the {@link ParseNestedParens#parseNestedParens(String)} method.
     */
    @Test
    void testParseNestedParens4() {
        List<Integer> result = new ArrayList<Integer>();
        result.add(1);
        result.add(2);
        result.add(3);
        result.add(2);
        result.add(1);
        result.add(1);
        result.add(1);
        result.add(1);
        result.add(1);
        result.add(1);
        assertEquals(result, ParseNestedParens.parseNestedParens("((())())"));
    }

    /**
     * Test case for the {@link ParseNestedParens#parseNestedParens(String)} method.
     */
    @Test
    void testParseNestedParens5() {
        List<Integer> result = new ArrayList<Integer>();
        result.add(1);
        result.add(2);
        result.add(3);
        result.add(2);
        result.add(1);
        result.add(1);
        result.add(1);
        result.add(1);
        result.add(1);
        result.add(1);
        assertEquals(result, ParseNestedParens.parseNestedParens("((())())"));
    }

    /**
     * Test case for the {@link ParseNestedParens#parseNestedParens(String)} method.
     */
    @Test
    void testParseNestedParens6() {
        List<Integer> result = new ArrayList<Integer>();
        result.add(1);
        result.add(2);
        result.add(3);
        result.add(2);
        result.add(1);
        result.add(1);
        result.add(1);
        result.add(1);
        result.add(1);
        result.add(1);
        assertEquals(result, ParseNestedParens.parseNestedParens("((())())"));
    }

    /**
     * Test case for the {@link ParseNestedParens#parseNestedParens(String)} method.
     */
    @Test
    void testParseNestedParens7() {
        List<Integer> result = new ArrayList<Integer>();
        result.add(1);
        result.add(2);
        result.add(3);
        result.add(2);
        result.add(1);
        result.add(1);
        result.add(1);
        result.add(1);
        result.add(1);
        result.add(1);
        assertEquals(result, ParseNestedParens.parseNestedParens("((())())"));
    }

    /**
     * Test case for the {@link ParseNestedParens#parseNestedParens(String)} method.
     */
    @Test
    void testParseNestedParens8() {
        List<Integer> result = new ArrayList<Integer>();
        result.add(1);
        result.add(2);
        result.add(3);
        result.add(2);
        result.add(1);
        result.add(1);
        result.add(1);
        result.add(1);
        result.add(1);
        result.add(1);
        assertEquals(result, ParseNestedParens.parseNestedParens("((())())"));
    }

    /**
     * Test case for the {@link ParseNestedParens#parseNestedParens(String)} method.
     */
    @Test
    void testParseNestedParens9() {
        List<Integer> result = new ArrayList<Integer>();
        result.add(1);
        result.add(2);
        result.add(3);
        result.add(2);
        result.add(1);
        result.add(1);
        result.add(1);
        result.add(1);
        result.add(1);
        result.add(1);
        assertEquals(result, ParseNestedParens.parseNestedParens("((())())"));
    }

    /**
     * Test case for the {@link ParseNestedParens#parseNestedParens(String)} method.
     */
    @Test
    void testParseNestedParens10() {
        List<Integer> result = new ArrayList<Integer>();
        result.add(1);
        result.add(2);
        result.add(3);
        result.add(2);
        result.add(1);
        result.add(1);
        result.add(1);
        result.add(1);
        result.add(1);
        result.add(1);
        assertEquals(result, ParseNestedParens.parseNestedParens("((())())"));
    }
}
