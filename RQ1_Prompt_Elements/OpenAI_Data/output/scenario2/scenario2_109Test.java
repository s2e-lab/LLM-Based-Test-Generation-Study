// MoveOneBallTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MoveOneBall}.
* It contains ten unit test cases for the {@link MoveOneBall#moveOneBall(List)} method.
*/
class MoveOneBallTest {

	@Test
	void testMoveOneBall() {
		List<Object> arr = List.of(1, 2, 3, 4, 5);
		assertTrue(MoveOneBall.moveOneBall(arr));
	}
	
	@Test
	void testMoveOneBall2() {
		List<Object> arr = List.of(5, 4, 3, 2, 1);
		assertTrue(MoveOneBall.moveOneBall(arr));
	}
	
	@Test
	void testMoveOneBall3() {
		List<Object> arr = List.of(1, 2, 3, 4, 5, 6);
		assertTrue(MoveOneBall.moveOneBall(arr));
	}
	
	@Test
	void testMoveOneBall4() {
		List<Object> arr = List.of(6, 5, 4, 3, 2, 1);
		assertTrue(MoveOneBall.moveOneBall(arr));
	}
	
	@Test
	void testMoveOneBall5() {
		List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7);
		assertTrue(MoveOneBall.moveOneBall(arr));
	}
	
	@Test
	void testMoveOneBall6() {
		List<Object> arr = List.of(7, 6, 5, 4, 3, 2, 1);
		assertTrue(MoveOneBall.moveOneBall(arr));
	}
	
	@Test
	void testMoveOneBall7() {
		List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8);
		assertTrue(MoveOneBall.moveOneBall(arr));
	}
	
	@Test
	void testMoveOneBall8() {
		List<Object> arr = List.of(8, 7, 6, 5, 4, 3, 2, 1);
		assertTrue(MoveOneBall.moveOneBall(arr));
	}
	
	@Test
	void testMoveOneBall9() {
		List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		assertTrue(MoveOneBall.moveOneBall(arr));
	}
	
	@Test
	void testMoveOneBall10() {
		List<Object> arr = List.of(9, 8, 7, 6, 5, 4, 3, 2, 1);
		assertTrue(MoveOneBall.moveOneBall(arr));
	}
}