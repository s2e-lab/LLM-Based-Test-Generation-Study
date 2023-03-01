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
		* The method should return 'Yes' if the file's name is valid, and returns 'No' otherwise.
		* A file's name is considered to be valid if and only if all the following conditions
		* are met:
		* - There should not be more than three digits ('0'-'9') in the file's name.
		* - The file's name contains exactly one dot '.'
		* - The substring before the dot should not be empty, and it starts with a letter from
		* the latin alphabet ('a'-'z' and 'A'-'Z').
		* - The substring after the dot should be one of these: ['txt', 'exe', 'dll']
		* Examples:
		* fileNameCheck("example.txt") # => 'Yes'
		* fileNameCheck("1example.dll") # => 'No' (the name should start with a latin alphabet letter)
		*/
		@Test
		void testFileNameCheck() {
				assertEquals("Yes", FileNameCheck.fileNameCheck("example.txt"));
				assertEquals("No", FileNameCheck.fileNameCheck("1example.dll"));
				assertEquals("No", FileNameCheck.fileNameCheck("s1sdf3.asd"));
				assertEquals("Yes", FileNameCheck.fileNameCheck("K.dll"));
				assertEquals("Yes", FileNameCheck.fileNameCheck("MY16FILE3.exe"));
				assertEquals("No", FileNameCheck.fileNameCheck("His12FILE94.exe"));
				assertEquals("No", FileNameCheck.fileNameCheck("_Y.txt"));
				assertEquals("No", FileNameCheck.fileNameCheck("?aREYA.exe"));
				assertEquals("No", FileNameCheck.fileNameCheck("/this_is_valid.dll"));
				assertEquals("No", FileNameCheck.fileNameCheck("this_is_valid.wow"));
				assertEquals("Yes", FileNameCheck.fileNameCheck("this_is_valid.txt"));
				assertEquals("No", FileNameCheck.fileNameCheck("this_is_valid.txtexe"));
				assertEquals("No", FileNameCheck.fileNameCheck("#this2_i4s_5valid.ten"));
				assertEquals("No", FileNameCheck.fileNameCheck("@this1_is6_valid.exe"));
				assertEquals("No", FileNameCheck.fileNameCheck("this_is_12valid.6exe4.txt"));
				assertEquals("No", FileNameCheck.fileNameCheck("all.exe.txt"));
				assertEquals("Yes", FileNameCheck.fileNameCheck("I563_No.exe"));
				assertEquals("Yes", FileNameCheck.fileNameCheck("Is3youfault.txt"));
				assertEquals("Yes", FileNameCheck.fileNameCheck("no_one#knows.dll"));
				assertEquals("No", FileNameCheck.fileNameCheck("1I563_Yes3.exe"));
				assertEquals("No", FileNameCheck.fileNameCheck("I563_Yes3.txtt"));
				assertEquals("No", FileNameCheck.fileNameCheck("final..txt"));
				assertEquals("No", FileNameCheck.fileNameCheck("final132"));
				assertEquals("No", FileNameCheck.fileNameCheck("_f4indsartal132."));
				assertEquals("No", FileNameCheck.fileNameCheck(".txt"));
				assertEquals("No", FileNameCheck.fileNameCheck("s."));
		}
}