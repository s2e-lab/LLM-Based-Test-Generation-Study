// MatchParensTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MatchParens}.
* It contains ten unit test cases for the {@link MatchParens#matchParens(List)} method.
*/
class MatchParensTest {

    /**
    * Test case for {@link MatchParens#matchParens(List)}.
    * The expected result is 'Yes'.
    */
    @Test
    void testMatchParens1() {
        List<String> lst = List.of("()(", ")");
        String expected = "Yes";
        String actual = MatchParens.matchParens(lst);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link MatchParens#matchParens(List)}.
    * The expected result is 'No'.
    */
    @Test
    void testMatchParens2() {
        List<String> lst = List.of(")", ")");
        String expected = "No";
        String actual = MatchParens.matchParens(lst);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link MatchParens#matchParens(List)}.
    * The expected result is 'No'.
    */
    @Test
    void testMatchParens3() {
        List<String> lst = List.of("(()(())", "())())");
        String expected = "No";
        String actual = MatchParens.matchParens(lst);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link MatchParens#matchParens(List)}.
    * The expected result is 'Yes'.
    */
    @Test
    void testMatchParens4() {
        List<String> lst = List.of(")())", "(()()(");
        String expected = "Yes";
        String actual = MatchParens.matchParens(lst);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link MatchParens#matchParens(List)}.
    * The expected result is 'Yes'.
    */
    @Test
    void testMatchParens5() {
        List<String> lst = List.of("(())))", "(()())((");
        String expected = "Yes";
        String actual = MatchParens.matchParens(lst);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link MatchParens#matchParens(List)}.
    * The expected result is 'No'.
    */
    @Test
    void testMatchParens6() {
        List<String> lst = List.of("()", "())");
        String expected = "No";
        String actual = MatchParens.matchParens(lst);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link MatchParens#matchParens(List)}.
    * The expected result is 'Yes'.
    */
    @Test
    void testMatchParens7() {
        List<String> lst = List.of("(()(", "()))()");
        String expected = "Yes";
        String actual = MatchParens.matchParens(lst);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link MatchParens#matchParens(List)}.
    * The expected result is 'No'.
    */
    @Test
    void testMatchParens8() {
        List<String> lst = List.of("((((", "((())");
        String expected = "No";
        String actual = MatchParens.matchParens(lst);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link MatchParens#matchParens(List)}.
    * The expected result is 'No'.
    */
    @Test
    void testMatchParens9() {
        List<String> lst = List.of(")(()", "(()(");
        String expected = "No";
        String actual = MatchParens.matchParens(lst);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link MatchParens#matchParens(List)}.
    * The expected result is 'No'.
    */
    @Test
    void testMatchParens10() {
        List<String> lst = List.of(")(", ")(");
        String expected = "No";
        String actual = MatchParens.matchParens(lst);
        assertEquals(expected, actual);
    }
}
