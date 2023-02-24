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
 * It contains ten test cases for the {@link scenario1.FileNameCheck#fileNameCheck()} method.
 */
class FileNameCheckTest {
		


    @Test
    void testFileNameCheck() {
        assertEquals("Yes", FileNameCheck.fileNameCheck("abc.txt"));
        assertEquals("Yes", FileNameCheck.fileNameCheck("abc.exe"));
        assertEquals("Yes", FileNameCheck.fileNameCheck("abc.dll"));
        assertEquals("Yes", FileNameCheck.fileNameCheck("abc1.txt"));
        assertEquals("Yes", FileNameCheck.fileNameCheck("abc1.exe"));
        assertEquals("Yes", FileNameCheck.fileNameCheck("abc1.dll"));
        assertEquals("Yes", FileNameCheck.fileNameCheck("abc12.txt"));
        assertEquals("Yes", FileNameCheck.fileNameCheck("abc12.exe"));
        assertEquals("Yes", FileNameCheck.fileNameCheck("abc12.dll"));
        assertEquals("Yes", FileNameCheck.fileNameCheck("abc123.txt"));
        assertEquals("Yes", FileNameCheck.fileNameCheck("abc123.exe"));
        assertEquals("Yes", FileNameCheck.fileNameCheck("abc123.dll"));
        assertEquals("No", FileNameCheck.fileNameCheck("abc.txt1"));
        assertEquals("No", FileNameCheck.fileNameCheck("abc.exe1"));
        assertEquals("No", FileNameCheck.fileNameCheck("abc.dll1"));
        assertEquals("No", FileNameCheck.fileNameCheck("abc1.txt1"));
        assertEquals("No", FileNameCheck.fileNameCheck("abc1.exe1"));
        assertEquals("No", FileNameCheck.fileNameCheck("abc1.dll1"));
        assertEquals("No", FileNameCheck.fileNameCheck("abc12.txt1"));
        assertEquals("No", FileNameCheck.fileNameCheck("abc12.exe1"));
        assertEquals("No", FileNameCheck.fileNameCheck("abc12.dll1"));
        assertEquals("No", FileNameCheck.fileNameCheck("abc123.txt1"));
        assertEquals("No", FileNameCheck.fileNameCheck("abc123.exe1"));
        assertEquals("No", FileNameCheck.fileNameCheck("abc123.dll1"));
        assertEquals("No", FileNameCheck.fileNameCheck("abc.txt12"));
        assertEquals("No", FileNameCheck.fileNameCheck("abc.exe12"));
        assertEquals("No", FileNameCheck.fileNameCheck("abc.dll12"));
        assertEquals("No", FileNameCheck.fileNameCheck("abc1.txt12"));
        assertEquals("No", FileNameCheck.fileNameCheck("abc1.exe12"));
        assertEquals("No", FileNameCheck.fileNameCheck("abc1.dll12"));
        assertEquals("No", FileNameCheck.fileNameCheck("abc12.txt12"));
        assertEquals("No", FileNameCheck.fileNameCheck("abc12.exe12"));
        assertEquals("No", FileNameCheck.fileNameCheck("abc12.dll12"));
        assertEquals("No", FileNameCheck.fileNameCheck("abc123.txt12"));
        assertEquals("No", FileNameCheck.fileNameCheck("abc123.exe12"));
        assertEquals("No", FileNameCheck.fileNameCheck("abc123.dll12"));
        assertEquals("No", FileNameCheck.fileNameCheck("abc.txt123"));
        assertEquals("No", FileNameCheck.fileNameCheck("abc.exe123"));
        assertEquals("No", FileNameCheck.fileNameCheck("abc.dll123"));
        assertEquals("No", FileNameCheck.fileNameCheck("abc1.txt123"));
        assertEquals("No", FileNameCheck.fileNameCheck("abc1.exe123"));
        assertEquals("No", FileNameCheck.fileNameCheck("abc1.dll123"));
        assertEquals("No", FileNameCheck.fileNameCheck("abc12.txt123"));
        assertEquals("No", FileNameCheck.fileNameCheck("abc12.exe123"));
        assertEquals("No", FileNameCheck.fileNameCheck("abc12.dll123")