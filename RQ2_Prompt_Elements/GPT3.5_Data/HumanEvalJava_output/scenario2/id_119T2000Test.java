// Here's the generated source code for the MatchParensTest class:

package scenario2;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MatchParensTest {

    @Test
    void testMatchParens1() {
        List<String> lst = Arrays.asList("()", "()");
        String expected = "Yes";
        String actual = MatchParens.matchParens(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testMatchParens2() {
        List<String> lst = Arrays.asList("(", ")");
        String expected = "No";
        String actual = MatchParens.matchParens(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testMatchParens3() {
        List<String> lst = Arrays.asList("()", "(()");
        String expected = "No";
        String actual = MatchParens.matchParens(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testMatchParens4() {
        List<String> lst = Arrays.asList("()", "())");
        String expected = "No";
        String actual = MatchParens.matchParens(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testMatchParens5() {
        List<String> lst = Arrays.asList("()", "(()))");
        String expected = "Yes";
        String actual = MatchParens.matchParens(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testMatchParens6() {
        List<String> lst = Arrays.asList("((()))", "()");
        String expected = "Yes";
        String actual = MatchParens.matchParens(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testMatchParens7() {
        List<String> lst = Arrays.asList("()", "(()())");
        String expected = "Yes";
        String actual = MatchParens.matchParens(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testMatchParens8() {
        List<String> lst = Arrays.asList("(()())", "()");
        String expected = "Yes";
        String actual = MatchParens.matchParens(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testMatchParens9() {
        List<String> lst = Arrays.asList("(()())", "(()())");
        String expected = "Yes";
        String actual = MatchParens.matchParens(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testMatchParens10() {
        List<String> lst = Arrays.asList("(()())", "((()))");
        String expected = "Yes";
        String actual = MatchParens.matchParens(lst);
        assertEquals(expected, actual);
    }
}