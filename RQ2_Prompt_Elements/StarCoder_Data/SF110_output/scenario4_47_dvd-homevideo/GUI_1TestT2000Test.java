// GUI_1Test.java


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
class GUI_1Test {

    /**
    * Test of {@link GUI#MessageBox(String)} method, of class {@link GUI}.
    */
    @Test
    void testMessageBox() {
        System.out.println("MessageBox");
        String message = "This is a test message";
        GUI instance = new GUI();
        int expResult = JOptionPane.INFORMATION_MESSAGE;
        int result = instance.MessageBox(message);
        assertEquals(expResult, result);
    }

    /**
    * Test of {@link GUI#MessageBox(String, int)} method, of class {@link GUI}.
    */
    @Test
    void testMessageBox_String_int() {
        System.out.println("MessageBox");
        String message = "This is a test message";
        int type = JOptionPane.INFORMATION_MESSAGE;
        GUI instance = new GUI();
        instance.MessageBox(message, type);
    }

    /**
    * Test of {@link GUI#MessageBox(String, int, String)} method, of class {@link GUI}.
    */
    @Test
    void testMessageBox_String_int_String() {
        System.out.println("MessageBox");
        String message = "This is a test message";
        int type = JOptionPane.INFORMATION_MESSAGE;
        String picture = "logo_32x32.png";
        GUI instance = new GUI();
        instance.MessageBox(message, type, picture);
    }

    /**
    * Test of {@link GUI#ErrorCheck(String)} method, of class {@link GUI}.
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
    * Test of {@link GUI#UpdateStatus(Color, String)} method, of class {@link GUI}.
    */
    @Test
    void testUpdateStatus() {
        System.out.println("UpdateStatus");
        Color typeColor = Color.RED;
        String typeUpdate = "PASS";
        GUI instance = new GUI();
        instance.UpdateStatus(typeColor, typeUpdate);
    }

    /**
    * Test of {@link GUI#ExitDVDHomevideo()} method, of class {@link GUI}.
    */
    @Test
    void testExitDVDHomevideo() {
        System.out.println("ExitDVDHomevideo");
        GUI instance = new GUI();
        instance.ExitDVDHomevideo();
    }

    /**
    * Test of {@link GUI#ReadProjProperties()} method, of class {@link GUI}.
    */
    @Test
    void testReadProjProperties() {
        System.out.println("ReadProjProperties");
        GUI instance = new GUI();
        instance.ReadProjProperties();
    }

    /**
    * Test of {@link GUI#WriteProjProperties()} method, of class {@link GUI}.
    */
    @Test
    void testWriteProjProperties() {
        System.out.println("WriteProjProperties");
        GUI instance = new GUI();
        instance.WriteProjProperties();
    }

    /**
    * Test of {@link GUI#ReadSession(String)} method, of class {@link GUI}.
    */
    @Test
    void testReadSession() {
        System.out.println("ReadSession");
        String xmlPath = "test.xml";
        GUI instance = new GUI();
        instance.ReadSession(xmlPath);
    }

    /**
    * Test of {@link GUI#WriteSession()} method, of class {@link GUI}.
    */
    @Test
    void testWriteSession() {
        System.out.println("WriteSession");
        GUI instance = new GUI();
        try {
            instance.WriteSession();
        } catch (IOException ex) {
            fail("IOException");
        }
    }
}

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
* It contains ten unit test cases for the {@link GUI#MessageBox(String)} method.
*/
class GUI_2Test {
		
    /**
    * Test of {@link GUI#MessageBox(String)} method, of class {@link GUI}.
    */
    @Test
    void testMessageBox() {
        System.out.println("MessageBox");
        String message = "This is a test message";
        GUI instance = new GUI();
        int expResult = JOptionPane.INFORMATION_MESSAGE;
        int result = instance.MessageBox(message);
        assertEquals(expResult, result);
    }

    /**
    * Test of {@link GUI#MessageBox(String, int)} method, of class {@link GUI}.
    */
    @Test
    void testMessageBox_String_int() {
        System.out.println("MessageBox");
        String message = "This is a test message";
        int type = JOptionPane.INFORMATION_MESSAGE;
        GUI instance = new GUI();
        instance.MessageBox(message, type);
    }

    /**
    * Test of {@link GUI#MessageBox(String, int, String)} method, of class {@link GUI}.
    */
    @Test
    void testMessageBox_String_int_String() {
        System.out.println("MessageBox");
        String message = "This is a test message";
        int type = JOptionPane.INFORMATION_MESSAGE;
        String picture = "logo_32x32.png";
        GUI instance = new GUI();
        instance.MessageBox(message, type, picture);
    }

    /**
    * Test of {@link GUI#ErrorCheck(String)} method, of class {@link GUI}.
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
    * Test of {@link GUI#UpdateStatus(Color, String)} method, of class {@link GUI}.
    */
    @Test
    void testUpdateStatus() {
        System.out.println("UpdateStatus");
        Color typeColor = Color.RED;
        String typeUpdate = "PASS";
        GUI instance = new GUI();
        instance.UpdateStatus(typeColor, typeUpdate);
    }

    /**
    * Test of {@link GUI#ExitDVDHomevideo()} method, of class {@link GUI}.
    */
    @Test
    void testExitDVDHomevideo() {
        System.out.println("ExitDVDHomevideo");
        GUI instance = new GUI();
        instance.ExitDVDHomevideo();
    }

    /**
    * Test of {@link GUI#ReadProjProperties()} method, of class {@link GUI}.
    */
    @Test
    void testReadProjProperties() {
        System.out.println("ReadProjProperties");
        GUI instance = new GUI();
        instance.ReadProjProperties();
    }

    /**
    * Test of {@link GUI#WriteProjProperties()} method, of class {@link GUI}.
    */
    @Test
    void testWriteProjProperties() {
        System.out.println("WriteProjProperties");
        GUI instance = new GUI();
        instance.WriteProjProperties();
    }

    /**
    * Test of {@link GUI#ReadSession(String)} method, of class {@link GUI}.
    */
    @Test
    void testReadSession() {
        System.out.println("ReadSession");
        String xmlPath = "test.xml";
        GUI instance = new GUI();
        instance.ReadSession(xmlPath);
    }

    /**
    * Test of {@link GUI#WriteSession()} method, of class {@link GUI}.
    */
    @Test
    void testWriteSession() {
        System.out.println("WriteSession");
        GUI instance = new GUI();
        try {
            instance.WriteSession();
        } catch (IOException ex) {
            fail("IOException");
        }
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
*