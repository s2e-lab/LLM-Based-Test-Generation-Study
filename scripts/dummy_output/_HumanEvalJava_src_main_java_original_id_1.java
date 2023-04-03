// SeparateParenGroupsTest.java
package original;


import java.util.ArrayList;
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
        List<String> expectedOutput = new ArrayList<String>();
        expectedOutput.add("(()())");
        expectedOutput.add("((()))");
        expectedOutput.add("()");
        expectedOutput.add("((())()())");
        assertEquals(expectedOutput, SeparateParenGroups.separateParenGroups("(()()) ((())) () ((())()())"));
        
        expectedOutput.clear();
        expectedOutput.add("()");
        expectedOutput.add("(())");
        expectedOutput.add("((()))");
        expectedOutput.add("(((())))");
        assertEquals(expectedOutput, SeparateParenGroups.separateParenGroups("() (()) ((())) (((())))"));
        
        expectedOutput.clear();
        expectedOutput.add("(()(())((())))");
        assertEquals(expectedOutput, SeparateParenGroups.separateParenGroups("(()(())((())))"));
        
        expectedOutput.clear();
        expectedOutput.add("()");
        expectedOutput.add("(())");
        expectedOutput.add("(()())");
        assertEquals(expectedOutput, SeparateParenGroups.separateParenGroups("( ) (( )) (( )( ))"));
        
        expectedOutput.clear();
        expectedOutput.add("()");
        expectedOutput.add("()");
        expectedOutput.add("()");
        assertEquals(expectedOutput, SeparateParenGroups.separateParenGroups("()()()"));
        
        expectedOutput.clear();
        expectedOutput.add("()");
        expectedOutput.add("()");
        expectedOutput.add("()");
        expectedOutput.add("()");
        assertEquals(expectedOutput, SeparateParenGroups.separateParenGroups("()()()()"));
        
        expectedOutput.clear();
        expectedOutput.add("()");
        expectedOutput.add("()");
        expectedOutput.add("()");
        expectedOutput.add("()");
        expectedOutput.add("()");
        assertEquals(expectedOutput, SeparateParenGroups.separateParenGroups("()()()()()"));
        
        expectedOutput.clear();
        expectedOutput.add("()");
        expectedOutput.add("()");
        expectedOutput.add("()");
        expectedOutput.add("()");
        expectedOutput.add("()");
        expectedOutput.add("()");
        assertEquals(expectedOutput, SeparateParenGroups.separateParenGroups("()()()()()()"));
        
        expectedOutput.clear();
        expectedOutput.add("()");
        expectedOutput.add("()");
        expectedOutput.add("()");
        expectedOutput.add("()");
        expectedOutput.add("()");
        expectedOutput.add("()");
        expectedOutput.add("()");
        assertEquals(expectedOutput, SeparateParenGroups.separateParenGroups("()()()()()()()"));
        
        expectedOutput.clear();
        expectedOutput.add("()");
        expectedOutput.add("()");
        expectedOutput.add("()");
        expectedOutput.add("()");
        expectedOutput.add("()");
        expectedOutput.add("()");
        expectedOutput.add("()");
        expectedOutput.add("()");
        assertEquals(expectedOutput, SeparateParenGroups.separateParenGroups("()()()()()()()()"));
    }
}