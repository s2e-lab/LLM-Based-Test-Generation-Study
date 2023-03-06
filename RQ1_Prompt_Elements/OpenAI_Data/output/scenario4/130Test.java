// TriTest.java
package scenario3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Tri}.
* It contains ten unit test cases for the {@link Tri#tri(int)} method.
*/
class TriTest {

	@Test
	void testTri() {
		List<Number> expected = new ArrayList<>(Arrays.asList(1, 3, 2, 8));
		assertEquals(expected, Tri.tri(3));
		expected = new ArrayList<>(Arrays.asList(1, 3, 2, 8, 3));
		assertEquals(expected, Tri.tri(4));
		expected = new ArrayList<>(Arrays.asList(1, 3, 2, 8, 3, 15));
		assertEquals(expected, Tri.tri(5));
		expected = new ArrayList<>(Arrays.asList(1, 3, 2, 8, 3, 15, 4));
		assertEquals(expected, Tri.tri(6));
		expected = new ArrayList<>(Arrays.asList(1, 3, 2, 8, 3, 15, 4, 24));
		assertEquals(expected, Tri.tri(7));
		expected = new ArrayList<>(Arrays.asList(1, 3, 2, 8, 3, 15, 4, 24, 5));
		assertEquals(expected, Tri.tri(8));
		expected = new ArrayList<>(Arrays.asList(1, 3, 2, 8, 3, 15, 4, 24, 5, 35));
		assertEquals(expected, Tri.tri(9));
		expected = new ArrayList<>(Arrays.asList(1, 3, 2, 8, 3, 15, 4, 24, 5, 35, 6, 48, 7, 63, 8, 80, 9, 99, 10, 120, 11));
		assertEquals(expected, Tri.tri(20));
		expected = new ArrayList<>(Arrays.asList(1));
		assertEquals(expected, Tri.tri(0));
		expected = new ArrayList<>(Arrays.asList(1, 3));
		assertEquals(expected, Tri.tri(1));
	}
}