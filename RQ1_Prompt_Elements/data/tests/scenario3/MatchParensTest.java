package scenario3;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MatchParensTest {

    @Test
    public void test() throws Exception {

        assertEquals("Yes", scenario3.MatchParens.matchParens(Arrays.asList("()(", ")")));
        assertEquals("No", scenario3.MatchParens.matchParens(Arrays.asList(")", ")")));
        assertEquals("No", scenario3.MatchParens.matchParens(Arrays.asList("(()(())", "())())")));
        assertEquals("Yes", scenario3.MatchParens.matchParens(Arrays.asList(")())", "(()()(")));
        assertEquals("Yes", scenario3.MatchParens.matchParens(Arrays.asList("(())))", "(()())((")));
        assertEquals("No", scenario3.MatchParens.matchParens(Arrays.asList("()", "())")));
        assertEquals("Yes", scenario3.MatchParens.matchParens(Arrays.asList("(()(", "()))()")));
        assertEquals("No", scenario3.MatchParens.matchParens(Arrays.asList("((((", "((())")));
        assertEquals("No", scenario3.MatchParens.matchParens(Arrays.asList(")(()", "(()(")));
        assertEquals("No", scenario3.MatchParens.matchParens(Arrays.asList(")(", ")(")));
        assertEquals("Yes", scenario3.MatchParens.matchParens(Arrays.asList("(", ")")));
        assertEquals("Yes", scenario3.MatchParens.matchParens(Arrays.asList(")", "(")));

    }

}