// GUI_2Test.java


//import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileFilter;
import java.awt.Color;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.util.StringTokenizer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GUI}.
* It contains ten unit test cases for the {@link GUI#ErrorCheck(String)} method.
*/
class GUI_2Test {

    /**
     * Test of ErrorCheck method, of class GUI.
     */
    @Test
    void testErrorCheck() {
        System.out.println("ErrorCheck");
        String fileName = "";
        GUI instance = new GUI();
        boolean expResult = false;
        boolean result = instance.ErrorCheck(fileName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
