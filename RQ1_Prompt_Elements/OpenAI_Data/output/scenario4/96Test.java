// CountUpToTest.java
package scenario3;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CountUpTo}.
* It contains ten unit test cases for the {@link CountUpTo#countUpTo(int)} method.
*/
class CountUpToTest {

	@Test
	void testCountUpTo() {
		List<Object> expected = new ArrayList<>();
		expected.add(2);
		expected.add(3);
		assertEquals(expected, CountUpTo.countUpTo(5));
		
		expected.add(5);
		assertEquals(expected, CountUpTo.countUpTo(6));
		
		expected.remove(2);
		assertEquals(expected, CountUpTo.countUpTo(7));
		
		expected.add(7);
		assertEquals(expected, CountUpTo.countUpTo(10));
		
		expected.clear();
		assertEquals(expected, CountUpTo.countUpTo(0));
		
		expected.add(2);
		expected.add(3);
		expected.add(5);
		expected.add(7);
		expected.add(11);
		expected.add(13);
		expected.add(17);
		expected.add(19);
		assertEquals(expected, CountUpTo.countUpTo(22));
		
		expected.clear();
		assertEquals(expected, CountUpTo.countUpTo(1));
		
		expected.add(2);
		expected.add(3);
		expected.add(5);
		expected.add(7);
		expected.add(11);
		expected.add(13);
		expected.add(17);
		assertEquals(expected, CountUpTo.countUpTo(18));
		
		expected.add(19);
		expected.add(23);
		expected.add(29);
		expected.add(31);
		expected.add(37);
		expected.add(41);
		expected.add(43);
		assertEquals(expected, CountUpTo.countUpTo(47));
		
		expected.add(47);
		expected.add(53);
		expected.add(59);
		expected.add(61);
		expected.add(67);
		expected.add(71);
		expected.add(73);
		expected.add(79);
		expected.add(83);
		expected.add(89);
		expected.add(97);
		assertEquals(expected, CountUpTo.countUpTo(101));
	}
}