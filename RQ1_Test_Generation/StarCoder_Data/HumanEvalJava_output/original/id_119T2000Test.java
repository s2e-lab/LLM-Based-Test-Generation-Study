// MatchParensTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MatchParens}.
* It contains ten unit test cases for the {@link MatchParens#matchParens(List)} method.
*/
class MatchParensTest {

    /**
    * Test case number: 1
    * Test case values: [['(', ')']]
    * Expected output (Post-state): "Yes"
    */
    @Test
    void test1() {
        List<String> lst = List.of("(", ")");
        String expected = "Yes";
        String actual = MatchParens.matchParens(lst);
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 2
    * Test case values: [['(', ')'], ['(', ')']]
    * Expected output (Post-state): "No"
    */
    @Test
    void test2() {
        List<String> lst = List.of("(", ")", "(", ")");
        String expected = "No";
        String actual = MatchParens.matchParens(lst);
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 3
    * Test case values: [['(', ')'], ['(', ')']]
    * Expected output (Post-state): "No"
    */
    @Test
    void test3() {
        List<String> lst = List.of("(", ")", "(", ")");
        String expected = "No";
        String actual = MatchParens.matchParens(lst);
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 4
    * Test case values: [['(', ')'], ['(', ')']]
    * Expected output (Post-state): "No"
    */
    @Test
    void test4() {
        List<String> lst = List.of("(", ")", "(", ")");
        String expected = "No";
        String actual = MatchParens.matchParens(lst);
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 5
    * Test case values: [['(', ')'], ['(', ')']]
    * Expected output (Post-state): "No"
    */
    @Test
    void test5() {
        List<String> lst = List.of("(", ")", "(", ")");
        String expected = "No";
        String actual = MatchParens.matchParens(lst);
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 6
    * Test case values: [['(', ')'], ['(', ')']]
    * Expected output (Post-state): "No"
    */
    @Test
    void test6() {
        List<String> lst = List.of("(", ")", "(", ")");
        String expected = "No";
        String actual = MatchParens.matchParens(lst);
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 7
    * Test case values: [['(', ')'], ['(', ')']]
    * Expected output (Post-state): "No"
    */
    @Test
    void test7() {
        List<String> lst = List.of("(", ")", "(", ")");
        String expected = "No";
        String actual = MatchParens.matchParens(lst);
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 8
    * Test case values: [['(', ')'], ['(', ')']]
    * Expected output (Post-state): "No"
    */
    @Test
    void test8() {
        List<String> lst = List.of("(", ")", "(", ")");
        String expected = "No";
        String actual = MatchParens.matchParens(lst);
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 9
    * Test case values: [['(', ')'], ['(', ')']]
    * Expected output (Post-state): "No"
    */
    @Test
    void test9() {
        List<String> lst = List.of("(", ")", "(", ")");
        String expected = "No";
        String actual = MatchParens.matchParens(lst);
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 10
    * Test case values: [['(', ')'], ['(', ')']]
    * Expected output (Post-state): "No"
    */
    @Test
    void test10() {
        List<String> lst = List.of("(", ")", "(", ")");
        String expected = "No";
        String actual = MatchParens.matchParens(lst);
        assertEquals(expected, actual);
    }
}
