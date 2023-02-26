// FileNameCheckTest.java
package scenario3;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FileNameCheck}.
* It contains ten unit test cases for the {@link FileNameCheck#fileNameCheck(String)} method.
*/
class FileNameCheckTest {

		/**
		* Test case for {@link FileNameCheck#fileNameCheck(String)} method.
		* The method should return "Yes" for the file name "example.txt".
		*/
		@Test
		void testFileNameCheck1() {
				assertEquals("Yes", FileNameCheck.fileNameCheck("example.txt"));
		}
		
		/**
		* Test case for {@link FileNameCheck#fileNameCheck(String)} method.
		* The method should return "No" for the file name "1example.dll".
		*/
		@Test
		void testFileNameCheck2() {
				assertEquals("No", FileNameCheck.fileNameCheck("1example.dll"));
		}
		
		/**
		* Test case for {@link FileNameCheck#fileNameCheck(String)} method.
		* The method should return "No" for the file name "s1sdf3.asd".
		*/
		@Test
		void testFileNameCheck3() {
				assertEquals("No", FileNameCheck.fileNameCheck("s1sdf3.asd"));
		}
		
		/**
		* Test case for {@link FileNameCheck#fileNameCheck(String)} method.
		* The method should return "Yes" for the file name "K.dll".
		*/
		@Test
		void testFileNameCheck4() {
				assertEquals("Yes", FileNameCheck.fileNameCheck("K.dll"));
		}
		
		/**
		* Test case for {@link FileNameCheck#fileNameCheck(String)} method.
		* The method should return "Yes" for the file name "MY16FILE3.exe".
		*/
		@Test
		void testFileNameCheck5() {
				assertEquals("Yes", FileNameCheck.fileNameCheck("MY16FILE3.exe"));
		}
		
		/**
		* Test case for {@link FileNameCheck#fileNameCheck(String)} method.
		* The method should return "No" for the file name "His12FILE94.exe".
		*/
		@Test
		void testFileNameCheck6() {
				assertEquals("No", FileNameCheck.fileNameCheck("His12FILE94.exe"));
		}
		
		/**
		* Test case for {@link FileNameCheck#fileNameCheck(String)} method.
		* The method should return "No" for the file name "_Y.txt".
		*/
		@Test
		void testFileNameCheck7() {
				assertEquals("No", FileNameCheck.fileNameCheck("_Y.txt"));
		}
		
		/**
		* Test case for {@link FileNameCheck#fileNameCheck(String)} method.
		* The method should return "No" for the file name "?aREYA.exe".
		*/
		@Test
		void testFileNameCheck8() {
				assertEquals("No", FileNameCheck.fileNameCheck("?aREYA.exe"));
		}
		
		/**
		* Test case for {@link FileNameCheck#fileNameCheck(String)} method.
		* The method should return "No" for the file name "/this_is_valid.dll".
		*/
		@Test
		void testFileNameCheck9() {
				assertEquals("No", FileNameCheck.fileNameCheck("/this_is_valid.dll"));
		}
		
		/**
		* Test case for {@link FileNameCheck#fileNameCheck(String)} method.
		* The method should return "No" for the file name "this_is_valid.wow".
		*/
		@Test
		void testFileNameCheck10() {
				assertEquals("No", FileNameCheck.fileNameCheck("this_is_valid.wow"));
		}
		
}