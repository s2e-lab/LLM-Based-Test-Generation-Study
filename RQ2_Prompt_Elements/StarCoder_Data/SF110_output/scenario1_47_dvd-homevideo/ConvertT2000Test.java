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
    * Test of {@link Convert#init()} method, of class Convert.
    */
    @Test
    void testInit() {
        System.out.println("init");
        Convert instance = new Convert();
        boolean expResult = false;
        boolean result = instance.init();
        assertEquals(expResult, result);
    }
}
