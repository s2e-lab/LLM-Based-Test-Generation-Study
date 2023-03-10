// MainTest3.java
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
* It contains ten unit test cases for the {@link Main#splitArguments(String)} method.
*/
class MainTest3 {

		/**
		* Test case for {@link Main#splitArguments(String)} method.
		* It tests if the method returns the correct array of arguments.
		*/
		@Test
		void testSplitArguments1() {
				String[] expected = {"1", "2", "3"};
				String[] actual = Main.splitArguments("1, 2, 3");
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Main#splitArguments(String)} method.
		* It tests if the method returns the correct array of arguments.
		*/
		@Test
		void testSplitArguments2() {
				String[] expected = {"1", "2", "3"};
				String[] actual = Main.splitArguments("1,2,3");
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Main#splitArguments(String)} method.
		* It tests if the method returns the correct array of arguments.
		*/
		@Test
		void testSplitArguments3() {
				String[] expected = {"1", "2", "3"};
				String[] actual = Main.splitArguments("1, 2,3");
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Main#splitArguments(String)} method.
		* It tests if the method returns the correct array of arguments.
		*/
		@Test
		void testSplitArguments4() {
				String[] expected = {"1", "2", "3"};
				String[] actual = Main.splitArguments("1,2, 3");
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Main#splitArguments(String)} method.
		* It tests if the method returns the correct array of arguments.
		*/
		@Test
		void testSplitArguments5() {
				String[] expected = {"1", "2", "3"};
				String[] actual = Main.splitArguments("1, 2,3");
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Main#splitArguments(String)} method.
		* It tests if the method returns the correct array of arguments.
		*/
		@Test
		void testSplitArguments6() {
				String[] expected = {"1", "2", "3"};
				String[] actual = Main.splitArguments("1,2, 3");
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Main#splitArguments(String)} method.
		* It tests if the method returns the correct array of arguments.
		*/
		@Test
		void testSplitArguments7() {
				String[] expected = {"1", "2", "3"};
				String[] actual = Main.splitArguments("1, 2,3");
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Main#splitArguments(String)} method.
		* It tests if the method returns the correct array of arguments.
		*/
		@Test
		void testSplitArguments8() {
				String[] expected = {"1", "2", "3"};
				String[] actual = Main.splitArguments("1,2, 3");
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Main#splitArguments(String)} method.
		* It tests if the method returns the correct array of arguments.
		*/
		@Test
		void testSplitArguments9() {
				String[] expected = {"1", "2", "3"};
				String[] actual = Main.splitArguments("1, 2,3");
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Main#splitArguments(String)} method.
		* It tests if the method returns the correct array of arguments.
		*/
		@Test
		void testSplitArguments10() {
				String[] expected = {"1", "2", "3"};
				String[] actual = Main.splitArguments("1,2, 3");
				assertArrayEquals(expected, actual);
		}
}

// MainTest4.java
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
* It contains ten unit test cases for the {@link Main#getStringValue(String)} method.
*/
class MainTest4 {
		
		/**
		* Test case for {@link Main#getStringValue(String)} method.
		* It tests if the method returns the correct string value.
		*/
		@Test
		void testGetStringValue1() {
				String expected = "1";
				String actual = Main.getStringValue("1");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Main#getStringValue(String)} method.
		* It tests if the method returns the correct string value.
		*/
		@Test
		void testGetStringValue2() {
				String expected = "1";
				String actual = Main.getStringValue("\"1\"");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Main#getStringValue(String)} method.
		* It tests if the method returns the correct string value.
		*/
		@Test
		void testGetStringValue3() {
				String expected = "1";
				String actual = Main.getStringValue("\"1\"");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Main#getStringValue(String)} method.
		* It tests if the method returns the correct string value.
		*/
		@Test
		void testGetStringValue4() {
				String expected = "1";
				String actual = Main.getStringValue("\"1\"");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Main#getStringValue(String)} method.
		* It tests if the method returns the correct string value.
		*/
		@Test
		void testGetStringValue5() {
				String expected = "1";
				String actual = Main.getStringValue("\"1\"");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Main#getStringValue(String)} method.
		* It tests if the method returns the correct string value.
		*/
		@Test
		void testGetStringValue6() {
				String expected = "1";
				String actual = Main.getStringValue("\"1