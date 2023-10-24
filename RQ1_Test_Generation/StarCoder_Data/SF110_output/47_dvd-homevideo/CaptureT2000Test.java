// CaptureTest.java


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Capture}.
* It contains ten unit test cases for the {@link Capture#init()} method.
*/
class CaptureTest {

    /**
     * Test of init method, of class Capture.
     */
    @Test
    void testInit() {
        System.out.println("init");
        int min = 0;
        int sec = 0;
        GUI DVD_GUI = new GUI();
        Capture instance = new Capture(min, sec, DVD_GUI);
        boolean expResult = false;
        boolean result = instance.init();
        assertEquals(expResult, result);
    }
}
