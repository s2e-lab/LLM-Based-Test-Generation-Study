// FileNameCheckTest.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
* Unit tests of {@link FileNameCheck}.
* It contains ten test cases for the {@link FileNameCheck#fileNameCheck()} method.
*/
class FileNameCheckTest {

    @Test
    void testFileNameCheck() {
        assertEquals("Yes", FileNameCheck.fileNameCheck("abc.txt"));
        assertEquals("Yes", FileNameCheck.fileNameCheck("abc.exe"));
        assertEquals("Yes", FileNameCheck.fileNameCheck("abc.dll"));
        assertEquals("No", FileNameCheck.fileNameCheck("abc.txt.exe"));
        assertEquals("No", FileNameCheck.fileNameCheck("abc.txt.dll"));
        assertEquals("No", FileNameCheck.fileNameCheck("abc.exe.txt"));
        assertEquals("No", FileNameCheck.fileNameCheck("abc.exe.dll"));
        assertEquals("No", FileNameCheck.fileNameCheck("abc.dll.txt"));
        assertEquals("No", FileNameCheck.fileNameCheck("abc.dll.exe"));
        assertEquals("No", FileNameCheck.fileNameCheck("abc.txt.exe.dll"));
    }
}