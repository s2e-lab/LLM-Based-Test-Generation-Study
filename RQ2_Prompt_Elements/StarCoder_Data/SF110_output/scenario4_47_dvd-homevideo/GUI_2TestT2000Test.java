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

    /**
     * Test of ErrorCheck method, of class GUI.
     */
    @Test
    void testErrorCheck_1() {
        System.out.println("ErrorCheck");
        String fileName = "src/dvd-homevideo/GUI.java";
        GUI instance = new GUI();
        boolean expResult = false;
        boolean result = instance.ErrorCheck(fileName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ErrorCheck method, of class GUI.
     */
    @Test
    void testErrorCheck_2() {
        System.out.println("ErrorCheck");
        String fileName = "src/dvd-homevideo/GUI.java";
        GUI instance = new GUI();
        boolean expResult = false;
        boolean result = instance.ErrorCheck(fileName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ErrorCheck method, of class GUI.
     */
    @Test
    void testErrorCheck_3() {
        System.out.println("ErrorCheck");
        String fileName = "src/dvd-homevideo/GUI.java";
        GUI instance = new GUI();
        boolean expResult = false;
        boolean result = instance.ErrorCheck(fileName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ErrorCheck method, of class GUI.
     */
    @Test
    void testErrorCheck_4() {
        System.out.println("ErrorCheck");
        String fileName = "src/dvd-homevideo/GUI.java";
        GUI instance = new GUI();
        boolean expResult = false;
        boolean result = instance.ErrorCheck(fileName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ErrorCheck method, of class GUI.
     */
    @Test
    void testErrorCheck_5() {
        System.out.println("ErrorCheck");
        String fileName = "src/dvd-homevideo/GUI.java";
        GUI instance = new GUI();
        boolean expResult = false;
        boolean result = instance.ErrorCheck(fileName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ErrorCheck method, of class GUI.
     */
    @Test
    void testErrorCheck_6() {
        System.out.println("ErrorCheck");
        String fileName = "src/dvd-homevideo/GUI.java";
        GUI instance = new GUI();
        boolean expResult = false;
        boolean result = instance.ErrorCheck(fileName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ErrorCheck method, of class GUI.
     */
    @Test
    void testErrorCheck_7() {
        System.out.println("ErrorCheck");
        String fileName = "src/dvd-homevideo/GUI.java";
        GUI instance = new GUI();
        boolean expResult = false;
        boolean result = instance.ErrorCheck(fileName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ErrorCheck method, of class GUI.
     */
    @Test
    void testErrorCheck_8() {
        System.out.println("ErrorCheck");
        String fileName = "src/dvd-homevideo/GUI.java";
        GUI instance = new GUI();
        boolean expResult = false;
        boolean result = instance.ErrorCheck(fileName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ErrorCheck method, of class GUI.
     */
    @Test
    void testErrorCheck_9() {
        System.out.println("ErrorCheck");
        String fileName = "src/dvd-homevideo/GUI.java";
        GUI instance = new GUI();
        boolean expResult = false;
        boolean result = instance.ErrorCheck(fileName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ErrorCheck method, of class GUI.
     */
    @Test
    void testErrorCheck_10() {
        System.out.println("ErrorCheck");
        String fileName = "src/dvd-homevideo/GUI.java";
        GUI instance = new GUI();
        boolean expResult = false;
        boolean result = instance.ErrorCheck(fileName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}

// GUI_3Test.java


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
* It contains ten unit test cases for the {@link GUI#MessageBox(String)} method.
*/
class GUI_3Test {
		
    /**
     * Test of MessageBox method, of class GUI.
     */
    @Test
    void testMessageBox() {
        System.out.println("MessageBox");
        String message = "";
        GUI instance = new GUI();
        int expResult = 0;
        int result = instance.MessageBox(message);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of MessageBox method, of class GUI.
     */
    @Test
    void testMessageBox_1() {
        System.out.println("MessageBox");
        String message = "This is a test";
        GUI instance = new GUI();
        int expResult = 0;
        int result = instance.MessageBox(message);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of MessageBox method, of class GUI.
     */
    @Test
    void testMessageBox_2() {
        System.out.println("MessageBox");
        String message = "This is a test";
        GUI instance = new GUI();
        int expResult = 0;
        int result = instance.MessageBox(message);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of MessageBox method, of class GUI.
     */
    @Test
    void testMessageBox_3() {
        System.out.println("MessageBox");
        String message = "This is a test";
        GUI instance = new GUI();
        int expResult = 0;
        int result = instance.MessageBox(message);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of MessageBox method, of class GUI.
     */
    @Test
    void testMessageBox_4() {
        System.out.println("MessageBox");
        String message = "This is a test";
        GUI instance = new GUI();
        int expResult = 0;
        int result = instance.MessageBox(message);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of MessageBox method, of class GUI.