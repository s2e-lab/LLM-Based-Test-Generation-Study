// SolutionTest.java
package original;


import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Solution}.
* It contains ten unit test cases for the {@link Solution#solution(List)} method.
*/
class SolutionTest {
    
    @Test
    void testSolution() {
        List<Integer> lst1 = Arrays.asList(5, 8, 7, 1);
        List<Integer> lst2 = Arrays.asList(3, 3, 3, 3, 3);
        List<Integer> lst3 = Arrays.asList(30, 13, 24, 321);
        List<Integer> lst4 = Arrays.asList(5, 9);
        List<Integer> lst5 = Arrays.asList(2, 4, 8);
        List<Integer> lst6 = Arrays.asList(30, 13, 23, 32);
        List<Integer> lst7 = Arrays.asList(3, 13, 2, 9);
        List<Integer> lst8 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> lst9 = Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16, 18, 20);
        List<Integer> lst10 = Arrays.asList(1, 3, 5, 7, 9, 11, 13, 15, 17, 19);
        
        assertEquals(12, Solution.solution(lst1));
        assertEquals(9, Solution.solution(lst2));
        assertEquals(0, Solution.solution(lst3));
        assertEquals(5, Solution.solution(lst4));
        assertEquals(0, Solution.solution(lst5));
        assertEquals(23, Solution.solution(lst6));
        assertEquals(3, Solution.solution(lst7));
        assertEquals(25, Solution.solution(lst8));
        assertEquals(0, Solution.solution(lst9));
        assertEquals(50, Solution.solution(lst10));
    }
}