// SearchableTextPane_0Test.java
package ghm.follow.search;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;
import javax.swing.plaf.ComponentUI;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.Utilities;
import javax.swing.text.DefaultHighlighter.DefaultHighlightPainter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SearchableTextPane}.
* It contains ten unit test cases for the {@link SearchableTextPane#highlight(String, int)} method.
*/
class SearchableTextPane_0Test {

		/**
		* Test case for the method {@link SearchableTextPane#highlight(String, int)}.
		* <p>
		* Tested Case:
		* <ul>
		* <li>Search for a term in a text with no matches.
		* </ul>
		* Expected Result:
		* <ul>
		* <li>The method returns an empty list.
		* </ul>
		*/
		@Test
		void testHighlight_0() {
				// Arrange
				SearchableTextPane searchableTextPane = new SearchableTextPane(new Font("Arial", Font.PLAIN, 12), 4);
				searchableTextPane.setText("This is a test text.");
				String term = "test";
				int flags = 0;
				// Act
				List<LineResult> result = searchableTextPane.highlight(term, flags);
				// Assert
				assertEquals(0, result.size());
		}
		
		/**
		* Test case for the method {@link SearchableTextPane#highlight(String, int)}.
		* <p>
		* Tested Case:
		* <ul>
		* <li>Search for a term in a text with one match.
		* </ul>
		* Expected Result:
		* <ul>
		* <li>The method returns a list with one element.
		* </ul>
		*/
		@Test
		void testHighlight_1() {
				// Arrange
				SearchableTextPane searchableTextPane = new SearchableTextPane(new Font("Arial", Font.PLAIN, 12), 4);
				searchableTextPane.setText("This is a test text.");
				String term = "test";
				int flags = 1;
				// Act
				List<LineResult> result = searchableTextPane.highlight(term, flags);
				// Assert
				assertEquals(1, result.size());
		}
		
		/**
		* Test case for the method {@link SearchableTextPane#highlight(String, int)}.
		* <p>
		* Tested Case:
		* <ul>
		* <li>Search for a term in a text with two matches.
		* </ul>
		* Expected Result:
		* <ul>
		* <li>The method returns a list with two elements.
		* </ul>
		*/
		@Test
		void testHighlight_2() {
				// Arrange
				SearchableTextPane searchableTextPane = new SearchableTextPane(new Font("Arial", Font.PLAIN, 12), 4);
				searchableTextPane.setText("This is a test text. This is a test text.");
				String term = "test";
				int flags = 2;
				// Act
				List<LineResult> result = searchableTextPane.highlight(term, flags);
				// Assert
				assertEquals(2, result.size());
		}
		
		/**
		* Test case for the method {@link SearchableTextPane#highlight(String, int)}.
		* <p>
		* Tested Case:
		* <ul>
		* <li>Search for a term in a text with three matches.
		* </ul>
		* Expected Result:
		* <ul>
		* <li>The method returns a list with three elements.
		* </ul>
		*/
		@Test
		void testHighlight_3() {
				// Arrange
				SearchableTextPane searchableTextPane = new SearchableTextPane(new Font("Arial", Font.PLAIN, 12), 4);
				searchableTextPane.setText("This is a test text. This is a test text. This is a test text.");
				String term = "test";
				int flags = 3;
				// Act
				List<LineResult> result = searchableTextPane.highlight(term, flags);
				// Assert
				assertEquals(3, result.size());
		}
		
		/**
		* Test case for the method {@link SearchableTextPane#highlight(String, int)}.
		* <p>
		* Tested Case:
		* <ul>
		* <li>Search for a term in a text with four matches.
		* </ul>
		* Expected Result:
		* <ul>
		* <li>The method returns a list with four elements.
		* </ul>
		*/
		@Test
		void testHighlight_4() {
				// Arrange
				SearchableTextPane searchableTextPane = new SearchableTextPane(new Font("Arial", Font.PLAIN, 12), 4);
				searchableTextPane.setText("This is a test text. This is a test text. This is a test text. This is a test text.");
				String term = "test";
				int flags = 4;
				// Act
				List<LineResult> result = searchableTextPane.highlight(term, flags);
				// Assert
				assertEquals(4, result.size());
		}
		
		/**
		* Test case for the method {@link SearchableTextPane#highlight(String, int)}.
		* <p>
		* Tested Case:
		* <ul>
		* <li>Search for a term in a text with five matches.
		* </ul>
		* Expected Result:
		* <ul>
		* <li>The method returns a list with five elements.
		* </ul>
		*/
		@Test
		void testHighlight_5() {
				// Arrange
				SearchableTextPane searchableTextPane = new SearchableTextPane(new Font("Arial", Font.PLAIN, 12), 4);
				searchableTextPane.setText("This is a test text. This is a test text. This is a test text. This is a test text. This is a test text.");
				String term = "test";
				int flags = 5;
				// Act
				List<LineResult> result = searchableTextPane.highlight(term, flags);
				// Assert
				assertEquals(5, result.size());
		}
		
		/**
		* Test case for the method {@link SearchableTextPane#highlight(String, int)}.
		* <p>
		* Tested Case:
		* <ul>
		* <li>Search for a term in a text with six matches.
		* </ul>
		* Expected Result:
		* <ul>
		* <li>The method returns a list with six elements.
		* </ul>
		*/
		@Test
		void testHighlight_6() {
				// Arrange
				SearchableTextPane searchableTextPane = new SearchableTextPane(new Font("Arial", Font.PLAIN, 12), 4);
				searchableTextPane.setText("This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text.");