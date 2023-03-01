// HistogramTest.java
package scenario2;

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
			put("a", 2);
			put("b", 2);
		}}, Histogram.histogram("a b a b"));
		assertEquals(new HashMap<String, Integer>() {{
			put("a", 2);
			put("b", 2);
			put("c", 2);
		}}, Histogram.histogram("a b a b c c"));
		assertEquals(new HashMap<String, Integer>() {{
			put("a", 2);
			put("b", 2);
			put("c", 2);
		}}, Histogram.histogram("a b a b c c a b"));
		assertEquals(new HashMap<String, Integer>() {{
			put("a", 2);
			put("b", 2);
			put("c", 2);
		}}, Histogram.histogram("a b a b c c a b c c"));
		assertEquals(new HashMap<String, Integer>() {{
			put("a", 2);
			put("b", 2);
			put("c", 2);
		}}, Histogram.histogram("a b a b c c a b c c a b"));
		assertEquals(new HashMap<String, Integer>() {{
			put("a", 2);
			put("b", 2);
			put("c", 2);
		}}, Histogram.histogram("a b a b c c a b c c a b c c"));
		assertEquals(new HashMap<String, Integer>() {{
			put("a", 2);
			put("b", 2);
			put("c", 2);
		}}, Histogram.histogram("a b a b c c a b c c a b c c a b"));
		assertEquals(new HashMap<String, Integer>() {{
			put("a", 2);
			put("b", 2);
			put("c", 2);
		}}, Histogram.histogram("a b a b c c a b c c a b c c a b c c"));
		assertEquals(new HashMap<String, Integer>() {{
			put("a", 2);
			put("b", 2);
			put("c", 2);
		}}, Histogram.histogram("a b a b c c a b c c a b c c a b c c a b"));
		assertEquals(new HashMap<String, Integer>() {{
			put("a", 2);
			put("b", 2);
			put("c", 2);
		}}, Histogram.histogram("a b a b c c a b c c a b c c a b c c a b c c"));
	}
}