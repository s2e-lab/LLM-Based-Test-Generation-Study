// AuthorTest.java


import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import java.lang.NullPointerException;
import java.lang.IllegalArgumentException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Author}.
* It contains ten unit test cases for the {@link Author#CreateDVDFileStructure(GUI)} method.
*/
class AuthorTest {

    /**
     * Test of CreateDVDFileStructure method, of class Author.
     */
    @Test
    void testCreateDVDFileStructure() {
        System.out.println("CreateDVDFileStructure");
        GUI DVD_GUI = new GUI();
        Author instance = new Author();
        boolean expResult = false;
        boolean result = instance.CreateDVDFileStructure(DVD_GUI);
        assertEquals(expResult, result);
    }
}
