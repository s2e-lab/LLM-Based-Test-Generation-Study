package scenario2;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SeparateParenGroupsTest {

    @Test
    public void test() throws Exception{
        assertEquals(Arrays.asList("(()())", "((()))", "()", "((())()())"), scenario2.SeparateParenGroups.separateParenGroups("(()()) ((())) () ((())()())"));
		assertEquals(Arrays.asList("()", "(())", "((()))", "(((())))"), scenario2.SeparateParenGroups.separateParenGroups("() (()) ((())) (((())))"));
		assertEquals(Arrays.asList("(()(())((())))"), scenario2.SeparateParenGroups.separateParenGroups("(()(())((())))"));
		assertEquals(Arrays.asList("()", "(())", "(()())"), scenario2.SeparateParenGroups.separateParenGroups("( ) (( )) (( )( ))"));
		assertEquals(public static List<String> separateParenGroups(String parenString) {, scenario2.SeparateParenGroups.*/);
		
    }

}