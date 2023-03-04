// SpecialfilterTest.java
package scenario3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Specialfilter}.
* It contains ten unit test cases for the {@link Specialfilter#specialfilter(List)} method.
*/
class SpecialfilterTest {

	@Test
	void testSpecialfilter() {
		List<Object> nums = Arrays.asList(5, -2, 1, -5);
		assertEquals(0, Specialfilter.specialfilter(nums));
		nums = Arrays.asList(15, -73, 14, -15);
		assertEquals(1, Specialfilter.specialfilter(nums));
		nums = Arrays.asList(33, -2, -3, 45, 21, 109);
		assertEquals(2, Specialfilter.specialfilter(nums));
		nums = Arrays.asList(43, -12, 93, 125, 121, 109);
		assertEquals(4, Specialfilter.specialfilter(nums));
		nums = Arrays.asList(71, -2, -33, 75, 21, 19);
		assertEquals(3, Specialfilter.specialfilter(nums));
		nums = Arrays.asList(1);
		assertEquals(0, Specialfilter.specialfilter(nums));
		nums = Arrays.asList();
		assertEquals(0, Specialfilter.specialfilter(nums));
	}
}