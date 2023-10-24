// FileNameCheckTest.java
package scenario2;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FileNameCheck}.
* It contains ten unit test cases for the {@link FileNameCheck#fileNameCheck(String)} method.
*/
class FileNameCheckTest {

    /**
     * Test case for the {@link FileNameCheck#fileNameCheck(String)} method.
     * It tests the case when the file's name is valid.
     */
    @Test
    void testFileNameCheck1() {
        String fileName = "a.txt";
        String expected = "Yes";
        String actual = FileNameCheck.fileNameCheck(fileName);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link FileNameCheck#fileNameCheck(String)} method.
     * It tests the case when the file's name is valid.
     */
    @Test
    void testFileNameCheck2() {
        String fileName = "a.exe";
        String expected = "Yes";
        String actual = FileNameCheck.fileNameCheck(fileName);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link FileNameCheck#fileNameCheck(String)} method.
     * It tests the case when the file's name is valid.
     */
    @Test
    void testFileNameCheck3() {
        String fileName = "a.dll";
        String expected = "Yes";
        String actual = FileNameCheck.fileNameCheck(fileName);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link FileNameCheck#fileNameCheck(String)} method.
     * It tests the case when the file's name is valid.
     */
    @Test
    void testFileNameCheck4() {
        String fileName = "a.txt.exe";
        String expected = "Yes";
        String actual = FileNameCheck.fileNameCheck(fileName);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link FileNameCheck#fileNameCheck(String)} method.
     * It tests the case when the file's name is valid.
     */
    @Test
    void testFileNameCheck5() {
        String fileName = "a.txt.dll";
        String expected = "Yes";
        String actual = FileNameCheck.fileNameCheck(fileName);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link FileNameCheck#fileNameCheck(String)} method.
     * It tests the case when the file's name is valid.
     */
    @Test
    void testFileNameCheck6() {
        String fileName = "a.exe.txt";
        String expected = "Yes";
        String actual = FileNameCheck.fileNameCheck(fileName);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link FileNameCheck#fileNameCheck(String)} method.
     * It tests the case when the file's name is valid.
     */
    @Test
    void testFileNameCheck7() {
        String fileName = "a.exe.dll";
        String expected = "Yes";
        String actual = FileNameCheck.fileNameCheck(fileName);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link FileNameCheck#fileNameCheck(String)} method.
     * It tests the case when the file's name is valid.
     */
    @Test
    void testFileNameCheck8() {
        String fileName = "a.dll.txt";
        String expected = "Yes";
        String actual = FileNameCheck.fileNameCheck(fileName);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link FileNameCheck#fileNameCheck(String)} method.
     * It tests the case when the file's name is valid.
     */
    @Test
    void testFileNameCheck9() {
        String fileName = "a.dll.exe";
        String expected = "Yes";
        String actual = FileNameCheck.fileNameCheck(fileName);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link FileNameCheck#fileNameCheck(String)} method.
     * It tests the case when the file's name is valid.
     */
    @Test
    void testFileNameCheck10() {
        String fileName = "a.txt.txt";
        String expected = "Yes";
        String actual = FileNameCheck.fileNameCheck(fileName);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link FileNameCheck#fileNameCheck(String)} method.
     * It tests the case when the file's name is valid.
     */
    @Test
    void testFileNameCheck11() {
        String fileName = "a.txt.exe.exe";
        String expected = "Yes";
        String actual = FileNameCheck.fileNameCheck(fileName);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link FileNameCheck#fileNameCheck(String)} method.
     * It tests the case when the file's name is valid.
     */
    @Test
    void testFileNameCheck12() {
        String fileName = "a.txt.exe.dll";
        String expected = "Yes";
        String actual = FileNameCheck.fileNameCheck(fileName);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link FileNameCheck#fileNameCheck(String)} method.
     * It tests the case when the file's name is valid.
     */
    @Test
    void testFileNameCheck13() {
        String fileName = "a.txt.dll.txt";
        String expected = "Yes";
        String actual = FileNameCheck.fileNameCheck(fileName);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link FileNameCheck#fileNameCheck(String)} method.
     * It tests the case when the file's name is valid.
     */
    @Test
    void testFileNameCheck14() {
        String fileName = "a.txt.dll.exe";
        String expected = "Yes";
        String actual = FileNameCheck.fileNameCheck(fileName);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link FileNameCheck#fileNameCheck(String)} method.
     * It tests the case when the file's name is valid.
     */
    @Test
    void testFileNameCheck15() {
        String fileName = "a.txt.dll.dll";
        String expected = "Yes";
        String actual = FileNameCheck.fileNameCheck(fileName);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link FileNameCheck#fileNameCheck(String)} method.
     * It tests the case when the file's name is valid.
     */
    @Test
    void testFileNameCheck16() {
        String fileName = "a.exe.txt.txt";
        String expected = "Yes";
        String actual = FileNameCheck.fileNameCheck(fileName);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link FileNameCheck#fileNameCheck(String)} method.
     * It tests the case when the file's name is valid.
     */
    @Test
    void testFileNameCheck17() {
        String fileName = "a.exe.txt.exe";
        String expected = "Yes";
        String actual = FileNameCheck.fileNameCheck(fileName);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link FileNameCheck#fileNameCheck(String)} method.
     * It tests the case when the file's name is valid.
     */
    @Test
    void testFileNameCheck18() {
        String fileName = "a.exe.txt.dll";
        String expected = "Yes";
        String actual = FileNameCheck.fileNameCheck(fileName);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link FileNameCheck#fileNameCheck(String)} method.
     * It tests the case when the file's name is valid.
     */
    @Test
    void testFileNameCheck19() {
        String fileName = "a.exe.exe.txt";
        String expected = "Yes";
        String actual = FileNameCheck.fileNameCheck(fileName);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link FileNameCheck#fileNameCheck(String)} method.
     * It tests the case when the file's name is valid.
     */
    @Test
    void testFileNameCheck20() {
        String fileName = "a.exe.exe.exe";
        String expected = "Yes";
        String actual = FileNameCheck.fileNameCheck(fileName);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link FileNameCheck#fileNameCheck(String)} method.
     * It tests the case when the file's name is valid.
     */
    @Test
    void testFileNameCheck21() {
        String fileName = "a.exe.exe.dll";
        String expected = "Yes";
        String actual = FileNameCheck.fileNameCheck(fileName);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link FileNameCheck#fileNameCheck(String)} method.
     * It tests the case when the file's name is valid.
     */
    @Test
    void testFileNameCheck22() {
        String fileName = "a.exe.dll.txt";
        String expected = "Yes";
        String actual = FileNameCheck.fileNameCheck(fileName);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link FileNameCheck#fileNameCheck(String)} method.
     * It tests the case when the file's name is valid.
     */
    @Test
    void testFileNameCheck23() {
        String fileName = "a.exe.dll.exe";
        String expected = "Yes";
        String actual = FileNameCheck.fileNameCheck