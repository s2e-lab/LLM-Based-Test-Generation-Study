// SearchEngineTest.java
package ghm.follow.search;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SearchEngine}.
* It contains ten unit test cases for the {@link SearchEngine#search(String, String)} method.
*/
class SearchEngineTest {

		/**
		* Test case for {@link SearchEngine#search(String, String)} method.
		* It tests the case when the search term is null.
		*/
		@Test
		void testSearch_NullTerm() {
				SearchEngine searchEngine = new SearchEngine(0);
				List<WordResult> results = searchEngine.search(null, "Hello World");
				assertEquals(0, results.size());
		}
		
		/**
		* Test case for {@link SearchEngine#search(String, String)} method.
		* It tests the case when the search term is empty.
		*/
		@Test
		void testSearch_EmptyTerm() {
				SearchEngine searchEngine = new SearchEngine(0);
				List<WordResult> results = searchEngine.search("", "Hello World");
				assertEquals(0, results.size());
		}
		
		/**
		* Test case for {@link SearchEngine#search(String, String)} method.
		* It tests the case when the text is null.
		*/
		@Test
		void testSearch_NullText() {
				SearchEngine searchEngine = new SearchEngine(0);
				List<WordResult> results = searchEngine.search("Hello", null);
				assertEquals(0, results.size());
		}
		
		/**
		* Test case for {@link SearchEngine#search(String, String)} method.
		* It tests the case when the text is empty.
		*/
		@Test
		void testSearch_EmptyText() {
				SearchEngine searchEngine = new SearchEngine(0);
				List<WordResult> results = searchEngine.search("Hello", "");
				assertEquals(0, results.size());
		}
		
		/**
		* Test case for {@link SearchEngine#search(String, String)} method.
		* It tests the case when the search term is not found in the text.
		*/
		@Test
		void testSearch_TermNotFound() {
				SearchEngine searchEngine = new SearchEngine(0);
				List<WordResult> results = searchEngine.search("Hello", "World");
				assertEquals(0, results.size());
		}
		
		/**
		* Test case for {@link SearchEngine#search(String, String)} method.
		* It tests the case when the search term is found in the text.
		*/
		@Test
		void testSearch_TermFound() {
				SearchEngine searchEngine = new SearchEngine(0);
				List<WordResult> results = searchEngine.search("Hello", "Hello World");
				assertEquals(1, results.size());
				assertEquals(0, results.get(0).getStart());
				assertEquals(5, results.get(0).getEnd());
				assertEquals("Hello", results.get(0).getWord());
		}
		
		/**
		* Test case for {@link SearchEngine#search(String, String)} method.
		* It tests the case when the search term is found multiple times in the text.
		*/
		@Test
		void testSearch_TermFoundMultipleTimes() {
				SearchEngine searchEngine = new SearchEngine(0);
				List<WordResult> results = searchEngine.search("Hello", "Hello World Hello World");
				assertEquals(2, results.size());
				assertEquals(0, results.get(0).getStart());
				assertEquals(5, results.get(0).getEnd());
				assertEquals("Hello", results.get(0).getWord());
				assertEquals(11, results.get(1).getStart());
				assertEquals(16, results.get(1).getEnd());
				assertEquals("Hello", results.get(1).getWord());
		}
		
		/**
		* Test case for {@link SearchEngine#search(String, String)} method.
		* It tests the case when the search term is found multiple times in the text.
		*/
		@Test
		void testSearch_TermFoundMultipleTimesWithCaseSensitive() {
				SearchEngine searchEngine = new SearchEngine(SearchEngine.CASE_SENSITIVE);
				List<WordResult> results = searchEngine.search("Hello", "Hello World hello World");
				assertEquals(1, results.size());
				assertEquals(0, results.get(0).getStart());
				assertEquals(5, results.get(0).getEnd());
				assertEquals("Hello", results.get(0).getWord());
		}
		
		/**
		* Test case for {@link SearchEngine#search(String, String)} method.
		* It tests the case when the search term is found multiple times in the text.
		*/
		@Test
		void testSearch_TermFoundMultipleTimesWithRegex() {
				SearchEngine searchEngine = new SearchEngine(SearchEngine.REGEX);
				List<WordResult> results = searchEngine.search("Hello", "Hello World hello World");
				assertEquals(2, results.size());
				assertEquals(0, results.get(0).getStart());
				assertEquals(5, results.get(0).getEnd());
				assertEquals("Hello", results.get(0).getWord());
				assertEquals(11, results.get(1).getStart());
				assertEquals(16, results.get(1).getEnd());
				assertEquals("hello", results.get(1).getWord());
		}
		
		/**
		* Test case for {@link SearchEngine#search(String, String)} method.
		* It tests the case when the search term is found multiple times in the text.
		*/
		@Test
		void testSearch_TermFoundMultipleTimesWithRegexAndCaseSensitive() {
				SearchEngine searchEngine = new SearchEngine(SearchEngine.REGEX | SearchEngine.CASE_SENSITIVE);
				List<WordResult> results = searchEngine.search("Hello", "Hello World hello World");
				assertEquals(1, results.size());
				assertEquals(0, results.get(0).getStart());
				assertEquals(5, results.get(0).getEnd());
				assertEquals("Hello", results.get(0).getWord());
		}
		
		/**
		* Test case for {@link SearchEngine#search(String, String)} method.
		* It tests the case when the search term is found multiple times in the text.
		*/
		@Test
		void testSearch_TermFoundMultipleTimesWithRegexAndCaseSensitiveAndUnknownFlags() {
				SearchEngine searchEngine = new SearchEngine(SearchEngine.REGEX | SearchEngine.CASE_SENSITIVE | 4);
				assertThrows(IllegalArgumentException.class, () -&gt; searchEngine.search("Hello", "Hello World hello World"));
		}
}</code>



