// SolutionTest.java
package scenario3;

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
        List<Integer> lst1 = List.of(5, 8, 7, 1);
        assertEquals(12, Solution.solution(lst1));

        List<Integer> lst2 = List.of(3, 3, 3, 3, 3);
        assertEquals(9, Solution.solution(lst2));

        List<Integer> lst3 = List.of(30, 13, 24, 321);
        assertEquals(0, Solution.solution(lst3));

        List<Integer> lst4 = List.of(3, 3, 3, 3, 3);
        assertEquals(9, Solution.solution(lst4));

        List<Integer> lst5 = List.of(5, 9);
        assertEquals(5, Solution.solution(lst5));

        List<Integer> lst6 = List.of(2, 4, 8);
        assertEquals(0, Solution.solution(lst6));

        List<Integer> lst7 = List.of(30, 13, 23, 32);
        assertEquals(23, Solution.solution(lst7));

        List<Integer> lst8 = List.of(3, 13, 2, 9);
        assertEquals(3, Solution.solution(lst8));
    }
}
