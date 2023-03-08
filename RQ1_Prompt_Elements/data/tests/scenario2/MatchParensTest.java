package scenario2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MatchParensTest {

    @Test
    public void test() throws Exception {

        assertEquals("Yes", scenario2.MatchParens.matchParens(Arrays.asList("()(", ")")));
        assertEquals("No", scenario2.MatchParens.matchParens(Arrays.asList(")", ")")));
        assertEquals("No", scenario2.MatchParens.matchParens(Arrays.asList("(()(())", "())())")));
        assertEquals("Yes", scenario2.MatchParens.matchParens(Arrays.asList(")())", "(()()(")));
        assertEquals("Yes", scenario2.MatchParens.matchParens(Arrays.asList("(())))", "(()())((")));
        assertEquals("No", scenario2.MatchParens.matchParens(Arrays.asList("()", "())")));
        assertEquals("Yes", scenario2.MatchParens.matchParens(Arrays.asList("(()(", "()))()")));
        assertEquals("No", scenario2.MatchParens.matchParens(Arrays.asList("((((", "((())")));
        assertEquals("No", scenario2.MatchParens.matchParens(Arrays.asList(")(()", "(()(")));
        assertEquals("No", scenario2.MatchParens.matchParens(Arrays.asList(")(", ")(")));
        assertEquals("Yes", scenario2.MatchParens.matchParens(Arrays.asList("(", ")")));
        assertEquals("Yes", scenario2.MatchParens.matchParens(Arrays.asList(")", "(")));

    }

}