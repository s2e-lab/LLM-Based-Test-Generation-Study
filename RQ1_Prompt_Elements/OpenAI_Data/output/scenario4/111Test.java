// HistogramTest.java
package scenario3;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Histogram}.
* It contains ten unit test cases for the {@link Histogram#histogram(String)} method.
*/
class HistogramTest {

	@Test
	void testHistogram() {
		assertEquals(new HashMap<String, Integer>() {{
			put("a", 1);
			put("b", 1);
			put("c", 1);
		}}, Histogram.histogram("a b c"));
		assertEquals(new HashMap<String, Integer>() {{
			put("a", 2);
			put("b", 2);
		}}, Histogram.histogram("a b b a"));
		assertEquals(new HashMap<String, Integer>() {{
			put("a", 2);
			put("b", 2);
		}}, Histogram.histogram("a b c a b"));
		assertEquals(new HashMap<String, Integer>() {{
			put("b", 4);
		}}, Histogram.histogram("b b b b a"));
		assertEquals(new HashMap<String, Integer>() {{
			put("r", 1);
			put("t", 1);
			put("g", 1);
		}}, Histogram.histogram("r t g"));
		assertEquals(new HashMap<String, Integer>() {{
			put("r", 1);
			put("t", 1);
			put("g", 1);
		}}, Histogram.histogram("r t g"));
		assertEquals(new HashMap<String, Integer>(), Histogram.histogram(""));
		assertEquals(new HashMap<String, Integer>() {{
			put("a", 1);
		}}, Histogram.histogram("a"));
		assertEquals(new HashMap<String, Integer>() {{
			put("a", 1);
			put("b", 1);
			put("c", 1);
			put("d", 1);
			put("g", 1);
		}}, Histogram.histogram("a b c d g"));
		assertEquals(new HashMap<String, Integer>() {{
			put("a", 1);
			put("b", 1);
			put("c", 1);
			put("d", 1);
			put("g", 1);
		}}, Histogram.histogram("a b c d g"));
	}
}