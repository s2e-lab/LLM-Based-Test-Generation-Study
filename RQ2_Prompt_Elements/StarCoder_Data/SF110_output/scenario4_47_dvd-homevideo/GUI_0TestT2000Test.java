// GUI_0Test.java


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
* It contains ten unit test cases for the {@link GUI#checkForModules()} method.
*/
class GUI_0Test {

    /**
    * Test of checkForModules method, of class GUI.
    */
    @Test
    void testCheckForModules() {
        System.out.println("checkForModules");
        GUI instance = new GUI();
        boolean expResult = true;
        boolean result = instance.checkForModules();
        assertEquals(expResult, result);
    }
}

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
* It contains ten unit test cases for the {@link GUI#checkForProg(String[])} method.
*/
class GUI_1Test {
		
    /**
    * Test of checkForProg method, of class GUI.
    */
    @Test
    void testCheckForProg() {
        System.out.println("checkForProg");
        String[] Prog = null;
        GUI instance = new GUI();
        boolean expResult = true;
        boolean result = instance.checkForProg(Prog);
        assertEquals(expResult, result);
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
* It contains ten unit test cases for the {@link GUI#MessageBox(String, int)} method.
*/
class GUI_3Test {
		
    /**
    * Test of MessageBox method, of class GUI.
    */
    @Test
    void testMessageBox_String_int() {
        System.out.println("MessageBox");
        String message = "";
        int type = 0;
        GUI instance = new GUI();
        instance.MessageBox(message, type);
    }
}

// GUI_4Test.java


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
* It contains ten unit test cases for the {@link GUI#MessageBox(String, int, String)} method.
*/
class GUI_4Test {
		
    /**
    * Test of MessageBox method, of class GUI.
    */
    @Test
    void testMessageBox_String_int_String() {
        System.out.println("MessageBox");
        String message = "";
        int type = 0;
        String picture = "";
        GUI instance = new GUI();
        instance.MessageBox(message, type, picture);
    }
}

// GUI_5Test.java


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
class GUI_5Test {
		
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
    }
}

// GUI_6Test.java


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
* It contains ten unit test cases for the {@link GUI#UpdateStatus(Color, String)} method.
*/
class GUI_6Test {
		
    /**
    * Test of UpdateStatus method, of class GUI.
    */
    @Test
    void testUpdateStatus() {
        System.out.println("UpdateStatus");
        Color typeColor = null;
        String typeUpdate = "";
        GUI instance = new GUI();
        instance.UpdateStatus(typeColor, typeUpdate);
    }
}

// GUI_7Test.java


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
* It contains ten unit test cases for the {@link GUI#ExitDVDHomevideo()} method.