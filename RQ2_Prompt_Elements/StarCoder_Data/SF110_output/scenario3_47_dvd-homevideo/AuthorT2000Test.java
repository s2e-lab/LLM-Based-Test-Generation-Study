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
     * Test case for {@link Author#CreateDVDFileStructure(GUI)}.
     *
     * @param DVD_GUI This is the GUI object used to control the form
     */
    @Test
    void testCreateDVDFileStructure() {
        GUI DVD_GUI = new GUI();
        Author author = new Author();
        author.CreateDVDFileStructure(DVD_GUI);
    }
}
