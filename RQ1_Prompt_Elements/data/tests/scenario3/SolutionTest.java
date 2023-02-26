package scenario3;

import java.util.List;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void test() throws Exception{

        assertEquals(9, scenario3.Solution.solution(Arrays.asList(3, 3, 3, 3, 3)));
		assertEquals(0, scenario3.Solution.solution(Arrays.asList(30, 13, 24, 321)));
		assertEquals(5, scenario3.Solution.solution(Arrays.asList(5, 9)));
		assertEquals(0, scenario3.Solution.solution(Arrays.asList(2, 4, 8)));
		assertEquals(23, scenario3.Solution.solution(Arrays.asList(30, 13, 23, 32)));
		assertEquals(3, scenario3.Solution.solution(Arrays.asList(3, 13, 2, 9)));
		
    }

}