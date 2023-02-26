// HistogramTest.java
package scenario3;

import java.util.HashMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Histogram}.
* It contains ten unit test cases for the {@link Histogram#histogram(String)} method.
*/
class HistogramTest {

		/**
		* Test case for {@link Histogram#histogram(String)} method.
		* It checks if the method returns the correct result for the input "a b c".
		*/
		@Test
		void testHistogram1() {
				HashMap<String, Integer> expected = new HashMap<>();
				expected.put("a", 1);
				expected.put("b", 1);
				expected.put("c", 1);
				assertEquals(expected, Histogram.histogram("a b c"));
		}
		
		/**
		* Test case for {@link Histogram#histogram(String)} method.
		* It checks if the method returns the correct result for the input "a b b a".
		*/
		@Test
		void testHistogram2() {
				HashMap<String, Integer> expected = new HashMap<>();
				expected.put("a", 2);
				expected.put("b", 2);
				assertEquals(expected, Histogram.histogram("a b b a"));
		}
		
		/**
		* Test case for {@link Histogram#histogram(String)} method.
		* It checks if the method returns the correct result for the input "a b c a b".
		*/
		@Test
		void testHistogram3() {
				HashMap<String, Integer> expected = new HashMap<>();
				expected.put("a", 2);
				expected.put("b", 2);
				assertEquals(expected, Histogram.histogram("a b c a b"));
		}
		
		/**
		* Test case for {@link Histogram#histogram(String)} method.
		* It checks if the method returns the correct result for the input "b b b b a".
		*/
		@Test
		void testHistogram4() {
				HashMap<String, Integer> expected = new HashMap<>();
				expected.put("b", 4);
				assertEquals(expected, Histogram.histogram("b b b b a"));
		}
		
		/**
		* Test case for {@link Histogram#histogram(String)} method.
		* It checks if the method returns the correct result for the input "r t g".
		*/
		@Test
		void testHistogram5() {
				HashMap<String, Integer> expected = new HashMap<>();
				expected.put("r", 1);
				expected.put("t", 1);
				expected.put("g", 1);
				assertEquals(expected, Histogram.histogram("r t g"));
		}
		
		/**
		* Test case for {@link Histogram#histogram(String)} method.
		* It checks if the method returns the correct result for the input "".
		*/
		@Test
		void testHistogram6() {
				HashMap<String, Integer> expected = new HashMap<>();
				assertEquals(expected, Histogram.histogram(""));
		}
		
		/**
		* Test case for {@link Histogram#histogram(String)} method.
		* It checks if the method returns the correct result for the input "a".
		*/
		@Test
		void testHistogram7() {
				HashMap<String, Integer> expected = new HashMap<>();
				expected.put("a", 1);
				assertEquals(expected, Histogram.histogram("a"));
		}
		
		/**
		* Test case for {@link Histogram#histogram(String)} method.
		* It checks if the method returns the correct result for the input "a b c d g".
		*/
		@Test
		void testHistogram8() {
				HashMap<String, Integer> expected = new HashMap<>();
				expected.put("a", 1);
				expected.put("b", 1);
				expected.put("c", 1);
				expected.put("d", 1);
				expected.put("g", 1);
				assertEquals(expected, Histogram.histogram("a b c d g"));
		}
		
		/**
		* Test case for {@link Histogram#histogram(String)} method.
		* It checks if the method returns the correct result for the input "r t g".
		*/
		@Test
		void testHistogram9() {
				HashMap<String, Integer> expected = new HashMap<>();
				expected.put("r", 1);
				expected.put("t", 1);
				expected.put("g", 1);
				assertEquals(expected, Histogram.histogram("r t g"));
		}
		
		/**
		* Test case for {@link Histogram#histogram(String)} method.
		* It checks if the method returns the correct result for the input "".
		*/
		@Test
		void testHistogram10() {
				HashMap<String, Integer> expected = new HashMap<>();
				assertEquals(expected, Histogram.histogram(""));
		}
}