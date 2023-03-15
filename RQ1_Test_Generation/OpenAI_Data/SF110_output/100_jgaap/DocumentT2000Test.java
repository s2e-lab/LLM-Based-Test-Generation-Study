// DocumentTest.java


import java.io.*;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Document}.
* It contains ten unit test cases for the {@link Document#stringify()} method.
*/
class DocumentTest {

		/**
		* Test case for {@link Document#stringify()} method.
		* It tests the stringify method with a document that contains only one character.
		*/
		@Test
		void testStringifyOneChar() {
				Document doc = new Document("test.txt");
				doc.procText.add('a');
				assertEquals("a", doc.stringify());
		}
		
		/**
		* Test case for {@link Document#stringify()} method.
		* It tests the stringify method with a document that contains only one word.
		*/
		@Test
		void testStringifyOneWord() {
				Document doc = new Document("test.txt");
				doc.procText.add('a');
				doc.procText.add('b');
				doc.procText.add('c');
				assertEquals("abc", doc.stringify());
		}
		
		/**
		* Test case for {@link Document#stringify()} method.
		* It tests the stringify method with a document that contains only one sentence.
		*/
		@Test
		void testStringifyOneSentence() {
				Document doc = new Document("test.txt");
				doc.procText.add('a');
				doc.procText.add('b');
				doc.procText.add('c');
				doc.procText.add('.');
				assertEquals("abc.", doc.stringify());
		}
		
		/**
		* Test case for {@link Document#stringify()} method.
		* It tests the stringify method with a document that contains only one paragraph.
		*/
		@Test
		void testStringifyOneParagraph() {
				Document doc = new Document("test.txt");
				doc.procText.add('a');
				doc.procText.add('b');
				doc.procText.add('c');
				doc.procText.add('.');
				doc.procText.add('\n');
				assertEquals("abc.\n", doc.stringify());
		}
		
		/**
		* Test case for {@link Document#stringify()} method.
		* It tests the stringify method with a document that contains only one line.
		*/
		@Test
		void testStringifyOneLine() {
				Document doc = new Document("test.txt");
				doc.procText.add('a');
				doc.procText.add('b');
				doc.procText.add('c');
				doc.procText.add('.');
				doc.procText.add('\n');
				doc.procText.add('d');
				doc.procText.add('e');
				doc.procText.add('f');
				doc.procText.add('.');
				doc.procText.add('\n');
				assertEquals("abc.\ndef.\n", doc.stringify());
		}
		
		/**
		* Test case for {@link Document#stringify()} method.
		* It tests the stringify method with a document that contains only one page.
		*/
		@Test
		void testStringifyOnePage() {
				Document doc = new Document("test.txt");
				doc.procText.add('a');
				doc.procText.add('b');
				doc.procText.add('c');
				doc.procText.add('.');
				doc.procText.add('\n');
				doc.procText.add('d');
				doc.procText.add('e');
				doc.procText.add('f');
				doc.procText.add('.');
				doc.procText.add('\n');
				doc.procText.add('\f');
				doc.procText.add('g');
				doc.procText.add('h');
				doc.procText.add('i');
				doc.procText.add('.');
				doc.procText.add('\n');
				doc.procText.add('j');
				doc.procText.add('k');
				doc.procText.add('l');
				doc.procText.add('.');
				doc.procText.add('\n');
				assertEquals("abc.\ndef.\n\fghi.\njkl.\n", doc.stringify());
		}
		
		/**
		* Test case for {@link Document#stringify()} method.
		* It tests the stringify method with a document that contains only one chapter.
		*/
		@Test
		void testStringifyOneChapter() {
				Document doc = new Document("test.txt");
				doc.procText.add('a');
				doc.procText.add('b');
				doc.procText.add('c');
				doc.procText.add('.');
				doc.procText.add('\n');
				doc.procText.add('d');
				doc.procText.add('e');
				doc.procText.add('f');
				doc.procText.add('.');
				doc.procText.add('\n');
				doc.procText.add('\f');
				doc.procText.add('g');
				doc.procText.add('h');
				doc.procText.add('i');
				doc.procText.add('.');
				doc.procText.add('\n');
				doc.procText.add('j');
				doc.procText.add('k');
				doc.procText.add('l');
				doc.procText.add('.');
				doc.procText.add('\n');
				doc.procText.add('\f');
				doc.procText.add('m');
				doc.procText.add('n');
				doc.procText.add('o');
				doc.procText.add('.');
				doc.procText.add('\n');
				doc.procText.add('p');
				doc.procText.add('q');
				doc.procText.add('r');
				doc.procText.add('.');
				doc.procText.add('\n');
				assertEquals("abc.\ndef.\n\fghi.\njkl.\n\fmno.\npqr.\n", doc.stringify());
		}
		
		/**
		* Test case for {@link Document#stringify()} method.
		* It tests the stringify method with a document that contains only one book.
		*/
		@Test
		void testStringifyOneBook() {
				Document doc = new Document("test.txt");
				doc.procText.add('a');
				doc.procText.add('b');
				doc.procText.add('c');
				doc.procText.add('.');
				doc.procText.add('\n');
				doc.procText.add('d');
				