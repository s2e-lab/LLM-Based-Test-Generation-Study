package scenario3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
class TestSolution {
    @Test
    public void testSolution() {
        assertEquals(12, Solution.solution(Arrays.asList(5, 8, 7, 1)));
        assertEquals(9, Solution.solution(Arrays.asList(3, 3, 3, 3, 3)));
        assertEquals(0, Solution.solution(Arrays.asList(30, 13, 24, 321)));
        assertEquals(5, Solution.solution(Arrays.asList(5, 9)));
        assertEquals(0, Solution.solution(Arrays.asList(2, 4, 8)));
        assertEquals(23, Solution.solution(Arrays.asList(30, 13, 23, 32)));
        assertEquals(3, Solution.solution(Arrays.asList(3, 13, 2, 9)));
        assertEquals(0, Solution.solution(Arrays.asList(2, 4, 8)));
        assertEquals(0, Solution.solution(Arrays.asList(2, 4, 8)));
        assertEquals(0, Solution.solution(Arrays.asList(2, 4, 8)));
    }
}