// MainTest2.java
// * JIPA - Java Interpreted Pseuso-Assembly *
// ***                                     ***
// * Created by: Dominic Charley-Roy         *
// ***                                     ***
// * Released under GNU General              *
// * Public License                          *
// *******************************************
package jipa;

/**
 * Class Name: Main
 * Class Use: This class is the core of the interpreter, handling
 *            the processing and interpreting of the code.
 * @author Dominic Charley-Roy
 */
import java.io.*;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Main}.
* It contains ten unit test cases for the {@link Main#removeComment(String)} method.
*/
class MainTest2 {

		/**
		* Test case for {@link Main#removeComment(String)} method.
		* This test case checks if the method removes the comment from the line.
		*/
		@Test
		void testRemoveComment() {
				String line = "set r1, 1 ; This is a comment";
				String expected = "set r1, 1";
				String actual = Main.removeComment(line);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Main#removeComment(String)} method.
		* This test case checks if the method removes the comment from the line.
		*/
		@Test
		void testRemoveComment2() {
				String line = "set r1, 1; This is a comment";
				String expected = "set r1, 1";
				String actual = Main.removeComment(line);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Main#removeComment(String)} method.
		* This test case checks if the method removes the comment from the line.
		*/
		@Test
		void testRemoveComment3() {
				String line = "set r1, 1 ;This is a comment";
				String expected = "set r1, 1";
				String actual = Main.removeComment(line);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Main#removeComment(String)} method.
		* This test case checks if the method removes the comment from the line.
		*/
		@Test
		void testRemoveComment4() {
				String line = "set r1, 1;This is a comment";
				String expected = "set r1, 1";
				String actual = Main.removeComment(line);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Main#removeComment(String)} method.
		* This test case checks if the method removes the comment from the line.
		*/
		@Test
		void testRemoveComment5() {
				String line = "set r1, 1 ; This is a comment ; This is another comment";
				String expected = "set r1, 1";
				String actual = Main.removeComment(line);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Main#removeComment(String)} method.
		* This test case checks if the method removes the comment from the line.
		*/
		@Test
		void testRemoveComment6() {
				String line = "set r1, 1; This is a comment ; This is another comment";
				String expected = "set r1, 1";
				String actual = Main.removeComment(line);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Main#removeComment(String)} method.
		* This test case checks if the method removes the comment from the line.
		*/
		@Test
		void testRemoveComment7() {
				String line = "set r1, 1 ; This is a comment ; This is another comment ; This is another comment";
				String expected = "set r1, 1";
				String actual = Main.removeComment(line);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Main#removeComment(String)} method.
		* This test case checks if the method removes the comment from the line.
		*/
		@Test
		void testRemoveComment8() {
				String line = "set r1, 1; This is a comment ; This is another comment ; This is another comment";
				String expected = "set r1, 1";
				String actual = Main.removeComment(line);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Main#removeComment(String)} method.
		* This test case checks if the method removes the comment from the line.
		*/
		@Test
		void testRemoveComment9() {
				String line = "set r1, 1 ; This is a comment ; This is another comment ; This is another comment ; This is another comment";
				String expected = "set r1, 1";
				String actual = Main.removeComment(line);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Main#removeComment(String)} method.
		* This test case checks if the method removes the comment from the line.
		*/
		@Test
		void testRemoveComment10() {
				String line = "set r1, 1; This is a comment ; This is another comment ; This is another comment ; This is another comment";
				String expected = "set r1, 1";
				String actual = Main.removeComment(line);
				assertEquals(expected, actual);
		}
}

// MainTest.java
// * JIPA - Java Interpreted Pseuso-Assembly *
// ***                                     ***
// * Created by: Dominic Charley-Roy         *
// ***                                     ***
// * Released under GNU General              *
// * Public License forbids *
// *******************************************
package jipa;

/**
 * Class Name: Main
 * Class Use: This class is the core of the interpreter, handling
 *            the processing and interpreting of the code.
 * @author Dominic Charley-Roy
 */
import java.io.*;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Main}.
* It contains ten unit test cases for the {@link Main#removeComment(String)} method.
*/
class MainTest {
		
		/**
		* Test case for {@link Main#removeComment(String)} method.
		* This test case checks if the method removes the comment from the line.
		*/
		@Test
		void testRemoveComment() {
				String line = "set r1, 1 ; This is a comment";
				String expected = "set r1, 1";
				String actual = Main.removeComment(line);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Main#removeComment(String)} method.
		* This test case checks if the method removes the comment from the line.
		*/
		@Test
		void testRemoveComment2() {
				String line = "set r1, 1; This is a comment";
				String expected = "set r1, 1";
				String actual = Main.removeComment(line);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Main#removeComment(String)} method.
		* This test case checks if the method removes the comment from the line.
		*/
		@Test
		void testRemoveComment3() {
				String line = "set r1, 1 ;This is a comment";
				String expected = "set r1, 1";
				String actual = Main.removeComment(line);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Main#removeComment(String)} method.
		* This test case checks if the method removes the comment from the line.
		*/
		@Test
		void testRemoveComment4() {
				String line = "set r1, 1;This is a comment";
				String expected = "