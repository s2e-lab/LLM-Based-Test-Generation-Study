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
     * Test case 1.
     * The file's name is valid.
     */
    @Test
    void test1() {
        String fileName = "abc.txt";
        String expected = "Yes";
        String actual = FileNameCheck.fileNameCheck(fileName);
        assertEquals(expected, actual);
    }

    /**
     * Test case 2.
     * The file's name is valid.
     */
    @Test
    void test2() {
        String fileName = "abc.exe";
        String expected = "Yes";
        String actual = FileNameCheck.fileNameCheck(fileName);
        assertEquals(expected, actual);
    }

    /**
     * Test case 3.
     * The file's name is valid.
     */
    @Test
    void test3() {
        String fileName = "abc.dll";
        String expected = "Yes";
        String actual = FileNameCheck.fileNameCheck(fileName);
        assertEquals(expected, actual);
    }

    /**
     * Test case 4.
     * The file's name is invalid.
     */
    @Test
    void test4() {
        String fileName = "abc.txt.txt";
        String expected = "No";
        String actual = FileNameCheck.fileNameCheck(fileName);
        assertEquals(expected, actual);
    }

    /**
     * Test case 5.
     * The file's name is invalid.
     */
    @Test
    void test5() {
        String fileName = "abc.txt.exe";
        String expected = "No";
        String actual = FileNameCheck.fileNameCheck(fileName);
        assertEquals(expected, actual);
    }

    /**
     * Test case 6.
     * The file's name is invalid.
     */
    @Test
    void test6() {
        String fileName = "abc.txt.dll";
        String expected = "No";
        String actual = FileNameCheck.fileNameCheck(fileName);
        assertEquals(expected, actual);
    }

    /**
     * Test case 7.
     * The file's name is invalid.
     */
    @Test
    void test7() {
        String fileName = "abc.txt.txt.txt";
        String expected = "No";
        String actual = FileNameCheck.fileNameCheck(fileName);
        assertEquals(expected, actual);
    }

    /**
     * Test case 8.
     * The file's name is invalid.
     */
    @Test
    void test8() {
        String fileName = "abc.txt.exe.exe";
        String expected = "No";
        String actual = FileNameCheck.fileNameCheck(fileName);
        assertEquals(expected, actual);
    }

    /**
     * Test case 9.
     * The file's name is invalid.
     */
    @Test
    void test9() {
        String fileName = "abc.txt.dll.dll";
        String expected = "No";
        String actual = FileNameCheck.fileNameCheck(fileName);
        assertEquals(expected, actual);
    }

    /**
     * Test case 10.
     * The file's name is invalid.
     */
    @Test
    void test10() {
        String fileName = "abc.txt.txt.exe";
        String expected = "No";
        String actual = FileNameCheck.fileNameCheck(fileName);
        assertEquals(expected, actual);
    }
}
