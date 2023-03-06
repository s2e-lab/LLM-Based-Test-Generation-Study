// GenerateIntegersTest.java
package scenario3;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GenerateIntegers}.
* It contains ten unit test cases for the {@link GenerateIntegers#generateIntegers(int, int)} method.
*/
class GenerateIntegersTest {

	@Test
	void testGenerateIntegers() {
		List<Object> expected = new ArrayList<>();
		expected.add(2);
		expected.add(4);
		expected.add(6);
		expected.add(8);
		assertEquals(expected, GenerateIntegers.generateIntegers(2, 8));
		assertEquals(expected, GenerateIntegers.generateIntegers(8, 2));
		assertEquals(expected, GenerateIntegers.generateIntegers(2, 10));
		assertEquals(expected, GenerateIntegers.generateIntegers(10, 2));
		assertEquals(expected, GenerateIntegers.generateIntegers(132, 2));
		assertEquals(new ArrayList<>(), GenerateIntegers.generateIntegers(17, 89));
	}
}