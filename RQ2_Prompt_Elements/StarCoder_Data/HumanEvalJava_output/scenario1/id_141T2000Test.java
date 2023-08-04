// FileNameCheckTest.java
package scenario1;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FileNameCheck}.
* It contains ten unit test cases for the {@link FileNameCheck#fileNameCheck(String)} method.
*/
class FileNameCheckTest {

    @Test
    void testFileNameCheck1() {
        String fileName = "a.txt";
        String expected = "Yes";
        String actual = FileNameCheck.fileNameCheck(fileName);
        assertEquals(expected, actual);
    }

    @Test
    void testFileNameCheck2() {
        String fileName = "a.exe";
        String expected = "Yes";
        String actual = FileNameCheck.fileNameCheck(fileName);
        assertEquals(expected, actual);
    }

    @Test
    void testFileNameCheck3() {
        String fileName = "a.dll";
        String expected = "Yes";
        String actual = FileNameCheck.fileNameCheck(fileName);
        assertEquals(expected, actual);
    }

    @Test
    void testFileNameCheck4() {
        String fileName = "a.txt.exe";
        String expected = "No";
        String actual = FileNameCheck.fileNameCheck(fileName);
        assertEquals(expected, actual);
    }

    @Test
    void testFileNameCheck5() {
        String fileName = "a.exe.txt";
        String expected = "No";
        String actual = FileNameCheck.fileNameCheck(fileName);
        assertEquals(expected, actual);
    }

    @Test
    void testFileNameCheck6() {
        String fileName = "a.dll.txt";
        String expected = "No";
        String actual = FileNameCheck.fileNameCheck(fileName);
        assertEquals(expected, actual);
    }

    @Test
    void testFileNameCheck7() {
        String fileName = "a.txt.dll";
        String expected = "No";
        String actual = FileNameCheck.fileNameCheck(fileName);
        assertEquals(expected, actual);
    }

    @Test
    void testFileNameCheck8() {
        String fileName = "a.exe.dll";
        String expected = "No";
        String actual = FileNameCheck.fileNameCheck(fileName);
        assertEquals(expected, actual);
    }

    @Test
    void testFileNameCheck9() {
        String fileName = "a.dll.exe";
        String expected = "No";
        String actual = FileNameCheck.fileNameCheck(fileName);
        assertEquals(expected, actual);
    }

    @Test
    void testFileNameCheck10() {
        String fileName = "a.txt.txt";
        String expected = "No";
        String actual = FileNameCheck.fileNameCheck(fileName);
        assertEquals(expected, actual);
    }
}
