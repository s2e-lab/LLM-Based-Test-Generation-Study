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
        String fileName = "test.log";
        GUI instance = new GUI();
        boolean expResult = false;
        boolean result = instance.ErrorCheck(fileName);
        assertEquals(expResult, result);
    }

    /**
     * Test of ErrorCheck method, of class GUI.
     */
    @Test
    void testErrorCheck_1() {
        System.out.println("ErrorCheck");
        String fileName = "test2.log";
        GUI instance = new GUI();
        boolean expResult = true;
        boolean result = instance.ErrorCheck(fileName);
        assertEquals(expResult, result);
    }

    /**
     * Test of ErrorCheck method, of class GUI.
     */
    @Test
    void testErrorCheck_2() {
        System.out.println("ErrorCheck");
        String fileName = "test3.log";
        GUI instance = new GUI();
        boolean expResult = true;
        boolean result = instance.ErrorCheck(fileName);
        assertEquals(expResult, result);
    }

    /**
     * Test of ErrorCheck method, of class GUI.
     */
    @Test
    void testErrorCheck_3() {
        System.out.println("ErrorCheck");
        String fileName = "test4.log";
        GUI instance = new GUI();
        boolean expResult = true;
        boolean result = instance.ErrorCheck(fileName);
        assertEquals(expResult, result);
    }

    /**
     * Test of ErrorCheck method, of class GUI.
     */
    @Test
    void testErrorCheck_4() {
        System.out.println("ErrorCheck");
        String fileName = "test5.log";
        GUI instance = new GUI();
        boolean expResult = true;
        boolean result = instance.ErrorCheck(fileName);
        assertEquals(expResult, result);
    }

    /**
     * Test of ErrorCheck method, of class GUI.
     */
    @Test
    void testErrorCheck_5() {
        System.out.println("ErrorCheck");
        String fileName = "test6.log";
        GUI instance = new GUI();
        boolean expResult = true;
        boolean result = instance.ErrorCheck(fileName);
        assertEquals(expResult, result);
    }

    /**
     * Test of ErrorCheck method, of class GUI.
     */
    @Test
    void testErrorCheck_6() {
        System.out.println("ErrorCheck");
        String fileName = "test7.log";
        GUI instance = new GUI();
        boolean expResult = true;
        boolean result = instance.ErrorCheck(fileName);
        assertEquals(expResult, result);
    }

    /**
     * Test of ErrorCheck method, of class GUI.
     */
    @Test
    void testErrorCheck_7() {
        System.out.println("ErrorCheck");
        String fileName = "test8.log";
        GUI instance = new GUI();
        boolean expResult = true;
        boolean result = instance.ErrorCheck(fileName);
        assertEquals(expResult, result);
    }

    /**
     * Test of ErrorCheck method, of class GUI.
     */
    @Test
    void testErrorCheck_8() {
        System.out.println("ErrorCheck");
        String fileName = "test9.log";
        GUI instance = new GUI();
        boolean expResult = true;
        boolean result = instance.ErrorCheck(fileName);
        assertEquals(expResult, result);
    }

    /**
     * Test of ErrorCheck method, of class GUI.
     */
    @Test
    void testErrorCheck_9() {
        System.out.println("ErrorCheck");
        String fileName = "test10.log";
        GUI instance = new GUI();
        boolean expResult = true;
        boolean result = instance.ErrorCheck(fileName);
        assertEquals(expResult, result);
    }
}
