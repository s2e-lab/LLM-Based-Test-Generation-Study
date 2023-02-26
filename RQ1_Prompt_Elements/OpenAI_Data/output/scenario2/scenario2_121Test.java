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

	@Test
	void testSolution() {
		assertEquals(0, Solution.solution(List.of()));
		assertEquals(0, Solution.solution(List.of(1)));
		assertEquals(1, Solution.solution(List.of(1, 2)));
		assertEquals(1, Solution.solution(List.of(2, 1)));
		assertEquals(1, Solution.solution(List.of(1, 2, 3)));
		assertEquals(1, Solution.solution(List.of(2, 1, 3)));
		assertEquals(1, Solution.solution(List.of(1, 2, 3, 4)));
		assertEquals(1, Solution.solution(List.of(2, 1, 3, 4)));
		assertEquals(1, Solution.solution(List.of(1, 2, 3, 4, 5)));
		assertEquals(1, Solution.solution(List.of(2, 1, 3, 4, 5)));
	}
}