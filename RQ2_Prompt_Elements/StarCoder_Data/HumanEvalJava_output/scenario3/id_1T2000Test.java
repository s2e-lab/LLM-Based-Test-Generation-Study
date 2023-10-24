// SeparateParenGroupsTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SeparateParenGroups}.
* It contains ten unit test cases for the {@link SeparateParenGroups#separateParenGroups(String)} method.
*/
class SeparateParenGroupsTest {

    @Test
    void testSeparateParenGroups() {
        SeparateParenGroups sep = new SeparateParenGroups();
        List<String> result;

        result = sep.separateParenGroups("(()()) ((())) () ((())()())");
        assertEquals(List.of("(()())", "((()))", "()", "((())()())"), result);

        result = sep.separateParenGroups("() (()) ((())) (((())))");
        assertEquals(List.of("()", "(())", "((()))", "(((())))"), result);

        result = sep.separateParenGroups("(()(())((())))");
        assertEquals(List.of("(()(())((())))"), result);

        result = sep.separateParenGroups("( ) (( )) (( )( ))");
        assertEquals(List.of("()", "(())", "(()())"), result);
    }
}
