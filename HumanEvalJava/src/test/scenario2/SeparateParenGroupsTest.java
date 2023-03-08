package scenario2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SeparateParenGroupsTest {

    @Test
    public void test() throws Exception {

        assertEquals(Arrays.asList("(()())", "((()))", "()", "((())()())"), scenario2.SeparateParenGroups.separateParenGroups("(()()) ((())) () ((())()())"));
        assertEquals(Arrays.asList("()", "(())", "((()))", "(((())))"), scenario2.SeparateParenGroups.separateParenGroups("() (()) ((())) (((())))"));
        assertEquals(Arrays.asList("(()(())((())))"), scenario2.SeparateParenGroups.separateParenGroups("(()(())((())))"));
        assertEquals(Arrays.asList("()", "(())", "(()())"), scenario2.SeparateParenGroups.separateParenGroups("( ) (( )) (( )( ))"));

    }

}