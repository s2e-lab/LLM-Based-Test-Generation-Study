// Solve1Test.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Solve1}.
* It contains ten unit test cases for the {@link Solve1#solve(int)} method.
*/
class Solve1Test {
@Test
	void testSolve1() {
		assertEquals("1010", Solve1.solve(10));
	}
	
	@Test
	void testSolve2() {
		assertEquals("1011", Solve1.solve(11));
	}
	
	@Test
	void testSolve3() {
		assertEquals("1110", Solve1.solve(14));
	}
	
	@Test
	void testSolve4() {
		assertEquals("1111", Solve1.solve(15));
	}
	
	@Test
	void testSolve5() {
		assertEquals("1101", Solve1.solve(13));
	}
	
	@Test
	void testSolve6() {
		assertEquals("1100", Solve1.solve(12));
	}
	
	@Test
	void testSolve7() {
		assertEquals("1001", Solve1.solve(9));
	}
	
	@Test
	void testSolve8() {
		assertEquals("1000", Solve1.solve(8));
	}
	
	@Test
	void testSolve9() {
		assertEquals("101", Solve1.solve(5));
	}
	
	@Test
	void testSolve10() {
		assertEquals("100", Solve1.solve(4));
	}
}