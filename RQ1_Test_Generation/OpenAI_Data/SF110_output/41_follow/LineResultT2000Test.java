// LineResultTest.java
package ghm.follow.search;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LineResult}.
* It contains ten unit test cases for the {@link LineResult#getWordResult(int)} method.
*/
class LineResultTest {

		/**
		* Test case for {@link LineResult#getWordResult(int)} method.
		* It tests the case when the index is negative.
		*/
		@Test
		public void testGetWordResult_NegativeIndex() {
				LineResult lineResult = new LineResult(1, 1, 1);
				WordResult wordResult = new WordResult(1, 1, 1);
				lineResult.addWord(wordResult);
				assertNull(lineResult.getWordResult(-1));
		}
		
		/**
		* Test case for {@link LineResult#getWordResult(int)} method.
		* It tests the case when the index is zero.
		*/
		@Test
		public void testGetWordResult_ZeroIndex() {
				LineResult lineResult = new LineResult(1, 1, 1);
				WordResult wordResult = new WordResult(1, 1, 1);
				lineResult.addWord(wordResult);
				assertEquals(wordResult, lineResult.getWordResult(0));
		}
		
		/**
		* Test case for {@link LineResult#getWordResult(int)} method.
		* It tests the case when the index is positive.
		*/
		@Test
		public void testGetWordResult_PositiveIndex() {
				LineResult lineResult = new LineResult(1, 1, 1);
				WordResult wordResult = new WordResult(1, 1, 1);
				lineResult.addWord(wordResult);
				assertNull(lineResult.getWordResult(1));
		}
		
		/**
		* Test case for {@link LineResult#getWordResult(int)} method.
		* It tests the case when the index is equal to the size of the list.
		*/
		@Test
		public void testGetWordResult_IndexEqualToSize() {
				LineResult lineResult = new LineResult(1, 1, 1);
				WordResult wordResult = new WordResult(1, 1, 1);
				lineResult.addWord(wordResult);
				assertNull(lineResult.getWordResult(1));
		}
		
		/**
		* Test case for {@link LineResult#getWordResult(int)} method.
		* It tests the case when the index is greater than the size of the list.
		*/
		@Test
		public void testGetWordResult_IndexGreaterThanSize() {
				LineResult lineResult = new LineResult(1, 1, 1);
				WordResult wordResult = new WordResult(1, 1, 1);
				lineResult.addWord(wordResult);
				assertNull(lineResult.getWordResult(2));
		}
		
		/**
		* Test case for {@link LineResult#getWordResult(int)} method.
		* It tests the case when the index is negative and the list is empty.
		*/
		@Test
		public void testGetWordResult_NegativeIndexEmptyList() {
				LineResult lineResult = new LineResult(1, 1, 1);
				assertNull(lineResult.getWordResult(-1));
		}
		
		/**
		* Test case for {@link LineResult#getWordResult(int)} method.
		* It tests the case when the index is zero and the list is empty.
		*/
		@Test
		public void testGetWordResult_ZeroIndexEmptyList() {
				LineResult lineResult = new LineResult(1, 1, 1);
				assertNull(lineResult.getWordResult(0));
		}
		
		/**
		* Test case for {@link LineResult#getWordResult(int)} method.
		* It tests the case when the index is positive and the list is empty.
		*/
		@Test
		public void testGetWordResult_PositiveIndexEmptyList() {
				LineResult lineResult = new LineResult(1, 1, 1);
				assertNull(lineResult.getWordResult(1));
		}
		
		/**
		* Test case for {@link LineResult#getWordResult(int)} method.
		* It tests the case when the index is equal to the size of the list and the list is empty.
		*/
		@Test
		public void testGetWordResult_IndexEqualToSizeEmptyList() {
				LineResult lineResult = new LineResult(1, 1, 1);
				assertNull(lineResult.getWordResult(0));
		}
		
		/**
		* Test case for {@link LineResult#getWordResult(int)} method.
		* It tests the case when the index is greater than the size of the list and the list is empty.
		*/
		@Test
		public void testGetWordResult_IndexGreaterThanSizeEmptyList() {
				LineResult lineResult = new LineResult(1, 1, 1);
				assertNull(lineResult.getWordResult(1));
		}
}

// WordResult.java
package ghm.follow.search;

/**
 * Keeps results information about a word in the searchable text.
 *
 * @author Carl Hall (carl.hall@gmail.com)
 */
public class WordResult {

    // word position of the found term
    public int start;

    // ending caret position
    public int end;

    // parent line result
    public LineResult parent;

    /**
     * Constructor
     *
     * @author Carl Hall (carl.hall@gmail.com)
     * @param start
     * @param end
     */
    public WordResult(int start, int end) {
        this.start = start;
        this.end = end;
    }

    /**
     * Builds a string that is conducive for showing as a result list entry
     *
     * @author Carl Hall (carl.hall@gmail.com)
     */
    public String toString() {
        return "(" + start + "," + end + ")";
    }
}

// WordResultTest.java
package ghm.follow.search;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link WordResult}.
* It contains two unit test cases for the {@link WordResult#toString()} method.
*/
class WordResultTest {
		
		/**
		* Test case for {@link WordResult#toString()} method.
		* It tests the case when the start and end are positive.
		*/
		@Test
		public void testToString_PositiveStartAndEnd() {
				WordResult wordResult = new WordResult(1, 1);
				assertEquals("(1,1)", wordResult.toString());
		}
		
		/**
		* Test case for {@link WordResult#toString()} method.
		* It tests the case when the start and end are negative.
		*/
		@Test
		public void testToString_NegativeStartAndEnd() {
				WordResult wordResult = new WordResult(-1, -1);
				assertEquals("(-1,-1)", wordResult.toString());
		}
}

// Searchable.java
package ghm.follow.search;

import java.util.List;

/**
 * Interface for searchable objects.
 *
 * @author Carl Hall (carl.hall@gmail.com)
 */
public interface Searchable {

    /**
     * Get the text to search.
     *
     * @author Carl Hall (carl.hall@gmail.com)
     * @return
     */
    public String getText();

    /**
     * Get the line results for the search.
     *
