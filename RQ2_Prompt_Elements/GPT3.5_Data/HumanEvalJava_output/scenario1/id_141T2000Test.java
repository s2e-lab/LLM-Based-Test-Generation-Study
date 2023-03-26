// Here's the source code for the FileNameCheckTest class:

package scenario1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FileNameCheckTest {

    @Test
    void testValidFileName() {
        String fileName = "file1.txt";
        String result = FileNameCheck.fileNameCheck(fileName);
        assertEquals("Yes", result);
    }

    @Test
    void testInvalidFileExtension() {
        String fileName = "file1.pdf";
        String result = FileNameCheck.fileNameCheck(fileName);
        assertEquals("No", result);
    }

    @Test
    void testInvalidFileNameFormat() {
        String fileName = "file1txt";
        String result = FileNameCheck.fileNameCheck(fileName);
        assertEquals("No", result);
    }

    @Test
    void testEmptyFileName() {
        String fileName = "";
        String result = FileNameCheck.fileNameCheck(fileName);
        assertEquals("No", result);
    }

    @Test
    void testFileNameStartsWithNumber() {
        String fileName = "1file.txt";
        String result = FileNameCheck.fileNameCheck(fileName);
        assertEquals("No", result);
    }

    @Test
    void testFileNameWithMoreThanThreeDigits() {
        String fileName = "file1234.txt";
        String result = FileNameCheck.fileNameCheck(fileName);
        assertEquals("No", result);
    }

    @Test
    void testFileNameWithThreeDigits() {
        String fileName = "file123.txt";
        String result = FileNameCheck.fileNameCheck(fileName);
        assertEquals("Yes", result);
    }

    @Test
    void testFileNameWithTwoDigits() {
        String fileName = "file12.txt";
        String result = FileNameCheck.fileNameCheck(fileName);
        assertEquals("Yes", result);
    }

    @Test
    void testFileNameWithOneDigit() {
        String fileName = "file1.txt";
        String result = FileNameCheck.fileNameCheck(fileName);
        assertEquals("Yes", result);
    }

    @Test
    void testFileNameWithUpperCaseExtension() {
        String fileName = "file1.TXT";
        String result = FileNameCheck.fileNameCheck(fileName);
        assertEquals("No", result);
    }
}