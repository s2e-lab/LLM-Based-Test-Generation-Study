// ConvertTest.java


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.StringIndexOutOfBoundsException;
import java.util.StringTokenizer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Convert}.
* It contains ten unit test cases for the {@link Convert#init()} method.
*/
class ConvertTest {

    /**
     * Test case for {@link Convert#init()}.
     *
     * @throws IOException
     */
    @Test
    void testInit() throws IOException {
        Convert convert = new Convert();
        assertTrue(convert.init());
    }
}
