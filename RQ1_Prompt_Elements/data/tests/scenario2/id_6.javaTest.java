package scenario2;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ParseNestedParensTest {

    @Test
    public void test() throws Exception{

        assertEquals(Arrays.asList(2, 3, 1, 3), scenario2.ParseNestedParens.parseNestedParens("(()()) ((())) () ((())()())"));
		assertEquals(Arrays.asList(1, 2, 3, 4), scenario2.ParseNestedParens.parseNestedParens("() (()) ((())) (((())))"));
		assertEquals(Arrays.asList(4), scenario2.ParseNestedParens.parseNestedParens("(()(())((())))"));
		
    }

}