// FTest.java
package scenario3;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link F}.
* It contains ten unit test cases for the {@link F#f(int)} method.
*/
class FTest {

	@Test
	void testF() {
		List<Integer> expected = new ArrayList<>();
		expected.add(1);
		expected.add(2);
		expected.add(6);
		expected.add(24);
		expected.add(15);
		assertEquals(expected, F.f(5));
		
		expected = new ArrayList<>();
		expected.add(1);
		expected.add(2);
		expected.add(6);
		expected.add(24);
		expected.add(15);
		expected.add(720);
		expected.add(28);
		assertEquals(expected, F.f(7));
		
		expected = new ArrayList<>();
		expected.add(1);
		assertEquals(expected, F.f(1));
		
		expected = new ArrayList<>();
		expected.add(1);
		expected.add(2);
		expected.add(6);
		assertEquals(expected, F.f(3));
	}
}