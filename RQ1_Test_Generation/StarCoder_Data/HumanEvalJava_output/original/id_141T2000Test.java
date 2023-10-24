// FileNameCheckTest.java
package original;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FileNameCheck}.
* It contains ten unit test cases for the {@link FileNameCheck#fileNameCheck(String)} method.
*/
class FileNameCheckTest {

    /**
     * Test case for {@link FileNameCheck#fileNameCheck(String)} where the file name is valid.
     */
    @Test
    void testFileNameCheck1() {
        assertEquals("Yes", FileNameCheck.fileNameCheck("example.txt"));
    }

    /**
     * Test case for {@link FileNameCheck#fileNameCheck(String)} where the file name is invalid.
     */
    @Test
    void testFileNameCheck2() {
        assertEquals("No", FileNameCheck.fileNameCheck("1example.dll"));
    }

    /**
     * Test case for {@link FileNameCheck#fileNameCheck(String)} where the file name is invalid.
     */
    @Test
    void testFileNameCheck3() {
        assertEquals("No", FileNameCheck.fileNameCheck("s1sdf3.asd"));
    }

    /**
     * Test case for {@link FileNameCheck#fileNameCheck(String)} where the file name is valid.
     */
    @Test
    void testFileNameCheck4() {
        assertEquals("Yes", FileNameCheck.fileNameCheck("K.dll"));
    }

    /**
     * Test case for {@link FileNameCheck#fileNameCheck(String)} where the file name is valid.
     */
    @Test
    void testFileNameCheck5() {
        assertEquals("Yes", FileNameCheck.fileNameCheck("MY16FILE3.exe"));
    }

    /**
     * Test case for {@link FileNameCheck#fileNameCheck(String)} where the file name is invalid.
     */
    @Test
    void testFileNameCheck6() {
        assertEquals("No", FileNameCheck.fileNameCheck("His12FILE94.exe"));
    }

    /**
     * Test case for {@link FileNameCheck#fileNameCheck(String)} where the file name is invalid.
     */
    @Test
    void testFileNameCheck7() {
        assertEquals("No", FileNameCheck.fileNameCheck("_Y.txt"));
    }

    /**
     * Test case for {@link FileNameCheck#fileNameCheck(String)} where the file name is invalid.
     */
    @Test
    void testFileNameCheck8() {
        assertEquals("No", FileNameCheck.fileNameCheck("?aREYA.exe"));
    }

    /**
     * Test case for {@link FileNameCheck#fileNameCheck(String)} where the file name is invalid.
     */
    @Test
    void testFileNameCheck9() {
        assertEquals("No", FileNameCheck.fileNameCheck("/this_is_valid.dll"));
    }

    /**
     * Test case for {@link FileNameCheck#fileNameCheck(String)} where the file name is invalid.
     */
    @Test
    void testFileNameCheck10() {
        assertEquals("No", FileNameCheck.fileNameCheck("this_is_valid.wow"));
    }

    /**
     * Test case for {@link FileNameCheck#fileNameCheck(String)} where the file name is valid.
     */
    @Test
    void testFileNameCheck11() {
        assertEquals("Yes", FileNameCheck.fileNameCheck("this_is_valid.txt"));
    }

    /**
     * Test case for {@link FileNameCheck#fileNameCheck(String)} where the file name is invalid.
     */
    @Test
    void testFileNameCheck12() {
        assertEquals("No", FileNameCheck.fileNameCheck("this_is_valid.txtexe"));
    }

    /**
     * Test case for {@link FileNameCheck#fileNameCheck(String)} where the file name is invalid.
     */
    @Test
    void testFileNameCheck13() {
        assertEquals("No", FileNameCheck.fileNameCheck("#this2_i4s_5valid.ten"));
    }

    /**
     * Test case for {@link FileNameCheck#fileNameCheck(String)} where the file name is invalid.
     */
    @Test
    void testFileNameCheck14() {
        assertEquals("No", FileNameCheck.fileNameCheck("@this1_is6_valid.exe"));
    }

    /**
     * Test case for {@link FileNameCheck#fileNameCheck(String)} where the file name is invalid.
     */
    @Test
    void testFileNameCheck15() {
        assertEquals("No", FileNameCheck.fileNameCheck("this_is_12valid.6exe4.txt"));
    }

    /**
     * Test case for {@link FileNameCheck#fileNameCheck(String)} where the file name is invalid.
     */
    @Test
    void testFileNameCheck16() {
        assertEquals("No", FileNameCheck.fileNameCheck("all.exe.txt"));
    }

    /**
     * Test case for {@link FileNameCheck#fileNameCheck(String)} where the file name is valid.
     */
    @Test
    void testFileNameCheck17() {
        assertEquals("Yes", FileNameCheck.fileNameCheck("I563_No.exe"));
    }

    /**
     * Test case for {@link FileNameCheck#fileNameCheck(String)} where the file name is valid.
     */
    @Test
    void testFileNameCheck18() {
        assertEquals("Yes", FileNameCheck.fileNameCheck("Is3youfault.txt"));
    }

    /**
     * Test case for {@link FileNameCheck#fileNameCheck(String)} where the file name is valid.
     */
    @Test
    void testFileNameCheck19() {
        assertEquals("Yes", FileNameCheck.fileNameCheck("no_one#knows.dll"));
    }

    /**
     * Test case for {@link FileNameCheck#fileNameCheck(String)} where the file name is invalid.
     */
    @Test
    void testFileNameCheck20() {
        assertEquals("No", FileNameCheck.fileNameCheck("1I563_Yes3.exe"));
    }

    /**
     * Test case for {@link FileNameCheck#fileNameCheck(String)} where the file name is invalid.
     */
    @Test
    void testFileNameCheck21() {
        assertEquals("No", FileNameCheck.fileNameCheck("I563_Yes3.txtt"));
    }

    /**
     * Test case for {@link FileNameCheck#fileNameCheck(String)} where the file name is invalid.
     */
    @Test
    void testFileNameCheck22() {
        assertEquals("No", FileNameCheck.fileNameCheck("final..txt"));
    }

    /**
     * Test case for {@link FileNameCheck#fileNameCheck(String)} where the file name is invalid.
     */
    @Test
    void testFileNameCheck23() {
        assertEquals("No", FileNameCheck.fileNameCheck("final132"));
    }

    /**
     * Test case for {@link FileNameCheck#fileNameCheck(String)} where the file name is invalid.
     */
    @Test
    void testFileNameCheck24() {
        assertEquals("No", FileNameCheck.fileNameCheck("_f4indsartal132."));
    }

    /**
     * Test case for {@link FileNameCheck#fileNameCheck(String)} where the file name is invalid.
     */
    @Test
    void testFileNameCheck25() {
        assertEquals("No", FileNameCheck.fileNameCheck(".txt"));
    }

    /**
     * Test case for {@link FileNameCheck#fileNameCheck(String)} where the file name is invalid.
     */
    @Test
    void testFileNameCheck26() {
        assertEquals("No", FileNameCheck.fileNameCheck("s."));
    }
}
