// SolutionTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Solution}.
* It contains ten unit test cases for the {@link Solution#solution(List)} method.
*/
class SolutionTest {

    /**
    * Test case for {@link Solution#solution(List)}.
    */
    @Test
    void testSolution() {
        List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertEquals(30, Solution.solution(lst));
    }
}
