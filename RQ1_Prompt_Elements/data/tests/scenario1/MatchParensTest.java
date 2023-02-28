package scenario1;

import java.util.List;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MatchParensTest {

    @Test
    public void test() throws Exception{

        assertEquals("Yes", scenario1.MatchParens.matchParens(Arrays.asList("()(", ")")));
		assertEquals("No", scenario1.MatchParens.matchParens(Arrays.asList(")", ")")));
		assertEquals("No", scenario1.MatchParens.matchParens(Arrays.asList("(()(())", "())())")));
		assertEquals("Yes", scenario1.MatchParens.matchParens(Arrays.asList(")())", "(()()(")));
		assertEquals("Yes", scenario1.MatchParens.matchParens(Arrays.asList("(())))", "(()())((")));
		assertEquals("No", scenario1.MatchParens.matchParens(Arrays.asList("()", "())")));
		assertEquals("Yes", scenario1.MatchParens.matchParens(Arrays.asList("(()(", "()))()")));
		assertEquals("No", scenario1.MatchParens.matchParens(Arrays.asList("((((", "((())")));
		assertEquals("No", scenario1.MatchParens.matchParens(Arrays.asList(")(()", "(()(")));
		assertEquals("No", scenario1.MatchParens.matchParens(Arrays.asList(")(", ")(")));
		assertEquals("Yes", scenario1.MatchParens.matchParens(Arrays.asList("(", ")")));
		assertEquals("Yes", scenario1.MatchParens.matchParens(Arrays.asList(")", "(")));
		
    }

}