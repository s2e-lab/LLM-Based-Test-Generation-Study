package scenario3;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SeparateParenGroupsTest {

    @Test
    public void test() throws Exception {

        assertEquals(Arrays.asList("(()())", "((()))", "()", "((())()())"), scenario3.SeparateParenGroups.separateParenGroups("(()()) ((())) () ((())()())"));
        assertEquals(Arrays.asList("()", "(())", "((()))", "(((())))"), scenario3.SeparateParenGroups.separateParenGroups("() (()) ((())) (((())))"));
        assertEquals(Arrays.asList("(()(())((())))"), scenario3.SeparateParenGroups.separateParenGroups("(()(())((())))"));
        assertEquals(Arrays.asList("()", "(())", "(()())"), scenario3.SeparateParenGroups.separateParenGroups("( ) (( )) (( )( ))"));

    }

}