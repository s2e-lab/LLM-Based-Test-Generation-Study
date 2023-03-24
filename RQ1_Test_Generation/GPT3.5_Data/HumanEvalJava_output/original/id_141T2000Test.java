// Here's the source code for the test class

package original;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FileNameCheckTest {

    @Test
    void testValidFileName() {
        String fileName = "example.txt";
        String expected = "Yes";
        String actual = FileNameCheck.fileNameCheck(fileName);
        assertEquals(expected, actual);
    }

    @Test
    void testFileNameWithNumberAtBeginning() {
        String fileName = "1example.dll";
        String expected = "No";
        String actual = FileNameCheck.fileNameCheck(fileName);
        assertEquals(expected, actual);
    }

    @Test
    void testFileNameWithNumbersInName() {
        String fileName = "s1sdf3.asd";
        String expected = "No";
        String actual = FileNameCheck.fileNameCheck(fileName);
        assertEquals(expected, actual);
    }

    @Test
    void testFileNameWithSingleLetter() {
        String fileName = "K.dll";
        String expected = "Yes";
        String actual = FileNameCheck.fileNameCheck(fileName);
        assertEquals(expected, actual);
    }

    @Test
    void testFileNameWithMultipleDigits() {
        String fileName = "MY16FILE3.exe";
        String expected = "Yes";
        String actual = FileNameCheck.fileNameCheck(fileName);
        assertEquals(expected, actual);
    }

    @Test
    void testFileNameWithMultipleDigitsInName() {
        String fileName = "His12FILE94.exe";
        String expected = "No";
        String actual = FileNameCheck.fileNameCheck(fileName);
        assertEquals(expected, actual);
    }

    @Test
    void testFileNameWithUnderscoreAtBeginning() {
        String fileName = "_Y.txt";
        String expected = "No";
        String actual = FileNameCheck.fileNameCheck(fileName);
        assertEquals(expected, actual);
    }

    @Test
    void testFileNameWithSpecialCharacterAtBeginning() {
        String fileName = "?aREYA.exe";
        String expected = "No";
        String actual = FileNameCheck.fileNameCheck(fileName);
        assertEquals(expected, actual);
    }

    @Test
    void testFileNameWithSlashAtBeginning() {
        String fileName = "/this_is_valid.dll";
        String expected = "No";
        String actual = FileNameCheck.fileNameCheck(fileName);
        assertEquals(expected, actual);
    }

    @Test
    void testFileNameWithInvalidExtension() {
        String fileName = "this_is_valid.wow";
        String expected = "No";
        String actual = FileNameCheck.fileNameCheck(fileName);
        assertEquals(expected, actual);
    }

    @Test
    void testFileNameWithInvalidExtensionInName() {
        String fileName = "this_is_valid.txtexe";
        String expected = "No";
        String actual = FileNameCheck.fileNameCheck(fileName);
        assertEquals(expected, actual);
    }

    @Test
    void testFileNameWithNumbersInExtension() {
        String fileName = "#this2_i4s_5valid.ten";
        String expected = "No";
        String actual = FileNameCheck.fileNameCheck(fileName);
        assertEquals(expected, actual);
    }

    @Test
    void testFileNameWithSpecialCharacterInExtension() {
        String fileName = "@this1_is6_valid.exe";
        String expected = "No";
        String actual = FileNameCheck.fileNameCheck(fileName);
        assertEquals(expected, actual);
    }

    @Test
    void testFileNameWithNumbersAndInvalidExtension() {
        String fileName = "this_is_12valid.6exe4.txt";
        String expected = "No";
        String actual = FileNameCheck.fileNameCheck(fileName);
        assertEquals(expected, actual);
    }

    @Test
    void testFileNameWithMultipleExtensions() {
        String fileName = "all.exe.txt";
        String expected = "No";
        String actual = FileNameCheck.fileNameCheck(fileName);
        assertEquals(expected, actual);
    }

    @Test
    void testFileNameWithNumberAndLetter() {
        String fileName = "I563_No.exe";
        String expected = "Yes";
        String actual = FileNameCheck.fileNameCheck(fileName);
        assertEquals(expected, actual);
    }

    @Test
    void testFileNameWithNumbersAndLetters() {
        String fileName = "Is3youfault.txt";
        String expected = "Yes";
        String actual = FileNameCheck.fileNameCheck(fileName);
        assertEquals(expected, actual);
    }

    @Test
    void testFileNameWithSpecialCharacter() {
        String fileName = "no_one#knows.dll";
        String expected = "Yes";
        String actual = FileNameCheck.fileNameCheck(fileName);
        assertEquals(expected, actual);
    }

    @Test
    void testFileNameWithNumberAndInvalidExtension() {
        String fileName = "1I563_Yes3.exe";
        String expected = "No";
        String actual = FileNameCheck.fileNameCheck(fileName);
        assertEquals(expected, actual);
    }

    @Test
    void testFileNameWithInvalidExtensionInNameAndValidExtension() {
        String fileName = "I563_Yes3.txtt";
        String expected = "No";
        String actual = FileNameCheck.fileNameCheck(fileName);
        assertEquals(expected, actual);
    }

    @Test
    void testFileNameWithDoubleDot() {
        String fileName = "final..txt";
        String expected = "No";
        String actual = FileNameCheck.fileNameCheck(fileName);
        assertEquals(expected, actual);
    }

    @Test
    void testFileNameWithoutExtension() {
        String fileName = "final132";
        String expected = "No";
        String actual = FileNameCheck.fileNameCheck(fileName);
        assertEquals(expected, actual);
    }

    @Test
    void testFileNameWithInvalidExtensionAtEnd() {
        String fileName = "_f4indsartal132.";
        String expected = "No";
        String actual = FileNameCheck.fileNameCheck(fileName);
        assertEquals(expected, actual);
    }

    @Test
    void testFileNameWithOnlyExtension() {
        String fileName = ".txt";
        String expected = "No";
        String actual = FileNameCheck.fileNameCheck(fileName);
        assertEquals(expected, actual);
    }

    @Test
    void testFileNameWithSingleLetterAndDot() {
        String fileName = "s.";
        String expected = "No";
        String actual = FileNameCheck.fileNameCheck(fileName);
        assertEquals(expected, actual);
    }
}