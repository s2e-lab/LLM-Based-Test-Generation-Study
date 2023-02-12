package Part3;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
class ParseNestedParensTest {
    @Test
    void testParseNestedParens() {
        assertEquals(ParseNestedParens.parseNestedParens("(()()) ((())) () ((())()())"), Arrays.asList(2, 3, 1, 3));
        assertEquals(ParseNestedParens.parseNestedParens("() (()) ((())) (((())))"), Arrays.asList(1, 2, 3, 4));
        assertEquals(ParseNestedParens.parseNestedParens("(()(())((())))"), Arrays.asList(4));
        assertEquals(ParseNestedParens.parseNestedParens("(()()) ((())) () ((())()())"), Arrays.asList(2, 3, 1, 3));
        assertEquals(ParseNestedParens.parseNestedParens("() (()) ((())) (((())))"), Arrays.asList(1, 2, 3, 4));
        assertEquals(ParseNestedParens.parseNestedParens("(()(())((())))"), Arrays.asList(4));
        assertEquals(ParseNestedParens.parseNestedParens("(()()) ((())) () ((())()())"), Arrays.asList(2, 3, 1, 3));
        assertEquals(ParseNestedParens.parseNestedParens("() (()) ((())) (((())))"), Arrays.asList(1, 2, 3, 4));
        assertEquals(ParseNestedParens.parseNestedParens("(()(())((())))"), Arrays.asList(4));
        assertEquals(ParseNestedParens.parseNestedParens("(()()) ((())) () ((())()())"), Arrays.asList(2, 3, 1, 3));
    }
}