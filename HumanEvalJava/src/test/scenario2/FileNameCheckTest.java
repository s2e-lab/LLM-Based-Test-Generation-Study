package scenario2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FileNameCheckTest {

    @Test
    public void test() throws Exception {

        assertEquals("Yes", scenario2.FileNameCheck.fileNameCheck("example.txt"));
        assertEquals("No", scenario2.FileNameCheck.fileNameCheck("1example.dll"));
        assertEquals("No", scenario2.FileNameCheck.fileNameCheck("s1sdf3.asd"));
        assertEquals("Yes", scenario2.FileNameCheck.fileNameCheck("K.dll"));
        assertEquals("Yes", scenario2.FileNameCheck.fileNameCheck("MY16FILE3.exe"));
        assertEquals("No", scenario2.FileNameCheck.fileNameCheck("His12FILE94.exe"));
        assertEquals("No", scenario2.FileNameCheck.fileNameCheck("_Y.txt"));
        assertEquals("No", scenario2.FileNameCheck.fileNameCheck("?aREYA.exe"));
        assertEquals("No", scenario2.FileNameCheck.fileNameCheck("/this_is_valid.dll"));
        assertEquals("No", scenario2.FileNameCheck.fileNameCheck("this_is_valid.wow"));
        assertEquals("Yes", scenario2.FileNameCheck.fileNameCheck("this_is_valid.txt"));
        assertEquals("No", scenario2.FileNameCheck.fileNameCheck("this_is_valid.txtexe"));
        assertEquals("No", scenario2.FileNameCheck.fileNameCheck("#this2_i4s_5valid.ten"));
        assertEquals("No", scenario2.FileNameCheck.fileNameCheck("@this1_is6_valid.exe"));
        assertEquals("No", scenario2.FileNameCheck.fileNameCheck("this_is_12valid.6exe4.txt"));
        assertEquals("No", scenario2.FileNameCheck.fileNameCheck("all.exe.txt"));
        assertEquals("Yes", scenario2.FileNameCheck.fileNameCheck("I563_No.exe"));
        assertEquals("Yes", scenario2.FileNameCheck.fileNameCheck("Is3youfault.txt"));
        assertEquals("Yes", scenario2.FileNameCheck.fileNameCheck("no_one#knows.dll"));
        assertEquals("No", scenario2.FileNameCheck.fileNameCheck("1I563_Yes3.exe"));
        assertEquals("No", scenario2.FileNameCheck.fileNameCheck("I563_Yes3.txtt"));
        assertEquals("No", scenario2.FileNameCheck.fileNameCheck("final..txt"));
        assertEquals("No", scenario2.FileNameCheck.fileNameCheck("final132"));
        assertEquals("No", scenario2.FileNameCheck.fileNameCheck("_f4indsartal132."));
        assertEquals("No", scenario2.FileNameCheck.fileNameCheck(".txt"));
        assertEquals("No", scenario2.FileNameCheck.fileNameCheck("s."));

    }

}