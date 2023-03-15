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
    public int wordNumber;

    // starting caret position
    public int start;

    // ending caret position
    public int end;

    // parent line result
    public LineResult parent;

    /**
     * Constructor
     *
     * @author Carl Hall (carl.hall@gmail.com)
     * @param wordNumber
     * @param start
     * @param end
     */
    public WordResult(int wordNumber, int start, int end) {
        this.wordNumber = wordNumber;
        this.start = start;
        this.end = end;
    }

    /**
     * Builds a string that is conducive for showing as a result list entry
     *
     * @author Carl Hall (carl.hall@gmail.com)
     */
    public String toString() {
        return "Word " + wordNumber;
    }
}

// WordResultTest.java
package ghm.follow.search;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link WordResult}.
* It contains ten unit test cases for the {@link WordResult#toString()} method.
*/
class WordResultTest {
		
		/**
		* Test case for {@link WordResult#toString()} method.
		* It tests the case when the word number is negative.
		*/
		@Test
		public void testToString_NegativeWordNumber() {
				WordResult wordResult = new WordResult(-1, 1, 1);
				assertEquals("Word -1", wordResult.toString());
		}
		
		/**
		* Test case for {@link WordResult#toString()} method.
		* It tests the case when the word number is zero.
		*/
		@Test
		public void testToString_ZeroWordNumber() {
				WordResult wordResult = new WordResult(0, 1, 1);
				assertEquals("Word 0", wordResult.toString());
		}
		
		/**
		* Test case for {@link WordResult#toString()} method.
		* It tests the case when the word number is positive.
		*/
		@Test
		public void testToString_PositiveWordNumber() {
				WordResult wordResult = new WordResult(1, 1, 1);
				assertEquals("Word 1", wordResult.toString());
		}
		
		/**
		* Test case for {@link WordResult#toString()} method.
		* It tests the case when the word number is negative and the start and end are negative.
		*/
		@Test
		public void testToString_NegativeWordNumberNegativeStartEnd() {
				WordResult wordResult = new WordResult(-1, -1, -1);
				assertEquals("Word -1", wordResult.toString());
		}
		
		/**
		* Test case for {@link WordResult#toString()} method.
		* It tests the case when the word number is zero and the start and end are zero.
		*/
		@Test
		public void testToString_ZeroWordNumberZeroStartEnd() {
				WordResult wordResult = new WordResult(0, 0, 0);
				assertEquals("Word 0", wordResult.toString());
		}
		
		/**
		* Test case for {@link WordResult#toString()} method.
		* It tests the case when the word number is positive and the start and end are positive.
		*/
		@Test
		public void testToString_PositiveWordNumberPositiveStartEnd() {
				WordResult wordResult = new WordResult(1, 1, 1);
				assertEquals("Word 1", wordResult.toString());
		}
		
		/**
		* Test case for {@link WordResult#toString()} method.
		* It tests the case when the word number is negative and the start and end are zero.
		*/
		@Test
		public void testToString_NegativeWordNumberZeroStartEnd() {
				WordResult wordResult = new WordResult(-1, 0, 0);
				assertEquals("Word -1", wordResult.toString());
		}
		
		/**
		* Test case for {@link WordResult#toString()} method.
		* It tests the case when the word number is zero and the start and end are negative.
		*/
		@Test
		public void testToString_ZeroWordNumberNegativeStartEnd() {
				WordResult wordResult = new WordResult(0, -1, -1);
				assertEquals("Word 0", wordResult.toString());
		}
		
		/**
		* Test case for {@link WordResult#toString()} method.
		* It tests the case when the word number is positive and the start and end are zero.
		*/
		@Test
		public void testToString_PositiveWordNumberZeroStartEnd() {
				WordResult wordResult = new WordResult(1, 0, 0);
				assertEquals("Word 1", wordResult.toString());
		}
		
		/**
		* Test case for {@link WordResult#toString()} method.
		* It tests the case when the word number is zero and the start and end are positive.
		*/
		@Test
		public void testToString_ZeroWordNumberPositiveStartEnd() {
				WordResult wordResult = new WordResult(0, 1, 1);
				assertEquals("Word 0", wordResult.toString());
		}
}

// SearchResult.java
package ghm.follow.search;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Keeps results information about a search.
 *
 * @author Carl Hall (carl.hall@gmail.com)
 */
public class SearchResult {

    // search term
    public String term;

    // line results found
    private List<LineResult> lineResults;

    // keeps track of lower caret position for display scrolling
    private int firstPosition;

    /**
     * Constructor
     *
     * @author Carl Hall (carl.hall@gmail.com)
     * @param term
     */
    public SearchResult(String term) {
        lineResults = new ArrayList<LineResult>();
        this.term = term;
        firstPosition = Integer.MAX_VALUE;
    }

    /**
     * Get the line results associated with this search.
     *
     * @author Carl Hall (carl.hall@gmail.com)
     * @return
     */
    public List<LineResult> getLineResults() {
        return lineResults;
    }

    /**
     * Get a specific line result associated with this search.
     *
     * @author Carl Hall (carl.hall@gmail.com)
     * @param index
     * @return
     */
    public LineResult getLineResult(int index) {
        return (LineResult) lineResults.get(index);
    }

    /**
     * Get the caret position of the first occurring line result in this search.
     *
     * @author Carl Hall (carl.hall@gmail.com)
     * @return
     */
    public int getFirstLinePosition() {
        return firstPosition;
    }

    /**
     * Add a <code>LineResult</code> to this search
     *
     * @author Carl Hall (carl.hall@gmail.com)
     * @param lineResult
     */
    public void addLine(LineResult lineResult) {
        if (lineResult.start < firstPosition) {
            firstPosition = lineResult.start;
        }
        lineResults.add(lineResult);
    }

    /**
     * Builds a string that is conducive for showing as a result list entry
     *
     * @author Carl Hall (carl.hall@gmail.com)
     */
    public String toString() {
        StringBuffer retval = new StringBuffer("Search for \"" + term + "\"");
        if (lineResults.size() > 0) {
            retval.append(" (");
            Iterator<LineResult> lines = lineResults.iterator();
            while (lines.hasNext()) {
                LineResult line = lines.next();
                String lineString = line.toString();
                if (lineString.length() > 0) {
                    retval.append(lineString);
                    if (lines.hasNext()) {
                        retval.append(",");
                    }
                }
            }
            retval.append(")");
        }
        return retval.toString();
    }
}

// SearchResultTest.java
package ghm.follow.search;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SearchResult}.
* It contains ten unit test cases for the {@link SearchResult#getLineResult(int)} method.
*/
class SearchResultTest {
		
		/**
		* Test case for {@link SearchResult#getLineResult(int)} method.
		* It tests the case when the index is negative.
		*/
		@Test
		public void testGetLineResult_NegativeIndex() {
				SearchResult searchResult = new SearchResult("test");
				LineResult lineResult = new LineResult(1, 1, 1);
				searchResult.addLine(lineResult);
				assertNull(searchResult.getLineResult(-1));
		}
		
		/**
		* Test case for {@link SearchResult#getLineResult(int)} method.
		* It tests the case when the index is zero.
		*/
		@Test
		public void testGetLineResult_ZeroIndex() {
				SearchResult searchResult = new SearchResult("test");
				LineResult lineResult = new LineResult(1, 1, 1);
				searchResult.addLine(lineResult);
				assertEquals(lineResult, searchResult.getLineResult(0));
		}
		
		/**
		* Test case for {@link SearchResult#getLineResult(int)} method.
	