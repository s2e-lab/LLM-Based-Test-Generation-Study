// FileEditor_1Test.java
package apbs_mem_gui;

/**
 * @author keithc
 */
import java.io.*;
import java.util.Scanner;
import java.text.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FileEditor}.
* It contains ten unit test cases for the {@link FileEditor#getCompEnergy(String)} method.
*/
class FileEditor_1Test {

    /**
     * Test of getCompEnergy method, of class FileEditor.
     */
    @Test
    void testGetCompEnergy() {
        System.out.println("getCompEnergy");
        String filename = "test/test_files/pull_comps_test.out";
        FileEditor instance = new FileEditor();
        double[] expResult = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0};
        double[] result = instance.getCompEnergy(filename);
        assertArrayEquals(expResult, result);
    }
}

// FileEditor_2Test.java
package apbs_mem_gui;

/**
 * @author keithc
 */
import java.io.*;
import java.util.Scanner;
import java.text.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FileEditor}.
* It contains ten unit test cases for the {@link FileEditor#getEnergy(String)} method.
*/
class FileEditor_2Test {
		
    /**
     * Test of getEnergy method, of class FileEditor.
     */
    @Test
    void testGetEnergy() {
        System.out.println("getEnergy");
        String filename = "test/test_files/apbs_test.out";
        FileEditor instance = new FileEditor();
        String[] expResult = {"-1.0000E+00 kJ/mol", "-2.0000E+00 kcal/mol", "-3.0000E+00 kT"};
        String[] result = instance.getEnergy(filename);
        assertArrayEquals(expResult, result);
    }
}

// FileEditor_3Test.java
package apbs_mem_gui;

/**
 * @author keithc
 */
import java.io.*;
import java.util.Scanner;
import java.text.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FileEditor}.
* It contains ten unit test cases for the {@link FileEditor#getEnergy(String)} method.
*/
class FileEditor_3Test {
		
    /**
     * Test of getEnergy method, of class FileEditor.
     */
    @Test
    void testGetEnergy() {
        System.out.println("getEnergy");
        String filename = "test/test_files/apbs_test_2.out";
        FileEditor instance = new FileEditor();
        String[] expResult = {"-1.0000E+00 kJ/mol", "-2.0000E+00 kcal/mol", "-3.0000E+00 kT"};
        String[] result = instance.getEnergy(filename);
        assertArrayEquals(expResult, result);
    }
}

// FileEditor_4Test.java
package apbs_mem_gui;

/**
 * @author keithc
 */
import java.io.*;
import java.util.Scanner;
import java.text.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FileEditor}.
* It contains ten unit test cases for the {@link FileEditor#getEnergy(String)} method.
*/
class FileEditor_4Test {
		
    /**
     * Test of getEnergy method, of class FileEditor.
     */
    @Test
    void testGetEnergy() {
        System.out.println("getEnergy");
        String filename = "test/test_files/apbs_test_3.out";
        FileEditor instance = new FileEditor();
        String[] expResult = {"-1.0000E+00 kJ/mol", "-2.0000E+00 kcal/mol", "-3.0000E+00 kT"};
        String[] result = instance.getEnergy(filename);
        assertArrayEquals(expResult, result);
    }
}

// FileEditor_5Test.java
package apbs_mem_gui;

/**
 * @author keithc
 */
import java.io.*;
import java.util.Scanner;
import java.text.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FileEditor}.
* It contains ten unit test cases for the {@link FileEditor#getEnergy(String)} method.
*/
class FileEditor_5Test {
		
    /**
     * Test of getEnergy method, of class FileEditor.
     */
    @Test
    void testGetEnergy() {
        System.out.println("getEnergy");
        String filename = "test/test_files/apbs_test_4.out";
        FileEditor instance = new FileEditor();
        String[] expResult = {"-1.0000E+00 kJ/mol", "-2.0000E+00 kcal/mol", "-3.0000E+00 kT"};
        String[] result = instance.getEnergy(filename);
        assertArrayEquals(expResult, result);
    }
}

// FileEditor_6Test.java
package apbs_mem_gui;

/**
 * @author keithc
 */
import java.io.*;
import java.util.Scanner;
import java.text.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FileEditor}.
* It contains ten unit test cases for the {@link FileEditor#getEnergy(String)} method.
*/
class FileEditor_6Test {
		
    /**
     * Test of getEnergy method, of class FileEditor.
     */
    @Test
    void testGetEnergy() {
        System.out.println("getEnergy");
        String filename = "test/test_files/apbs_test_5.out";
        FileEditor instance = new FileEditor();
        String[] expResult = {"-1.0000E+00 kJ/mol", "-2.0000E+00 kcal/mol", "-3.0000E+00 kT"};
        String[] result = instance.getEnergy(filename);
        assertArrayEquals(expResult, result);
    }
}

// FileEditor_7Test.java
package apbs_mem_gui;

/**
 * @author keithc
 */
import java.io.*;
import java.util.Scanner;
import java.text.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FileEditor}.
* It contains ten unit test cases for the {@link FileEditor#getEnergy(String)} method.
*/
class FileEditor_7Test {
		
    /**
     * Test of getEnergy method, of class FileEditor.
     */
    @Test
    void testGetEnergy() {
        System.out.println("getEnergy");
        String filename = "test/test_files/apbs_test_6.out";
        FileEditor instance = new FileEditor();
        String[] expResult = {"-1.0000E+00 kJ/mol", "-2.0000E+00 kcal/mol", "-3.0000E+00 kT"};
        String[] result = instance.getEnergy(filename);
        assertArrayEquals(expResult, result);
    }
}

// FileEditor_8Test.java
package apbs_mem_gui;

/**
 * @author keithc
 */
import java.io.*;
import java.util.Scanner;
import java.text.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FileEditor}.
* It contains ten unit test cases for the {@link FileEditor#getEnergy(String)} method.
*/
class FileEditor_8Test {
		
    /**
     * Test of getEnergy method, of class FileEditor.
     */
    @Test
    void testGetEnergy() {
        System.out.println("getEnergy");
        String filename = "test/test_files/apbs_test_7.out";
        FileEditor instance = new FileEditor();
        String[] expResult = {"-1.0000E+00 kJ/mol", "-2.0000E+00 kcal/mol", "-3.0000E+00 kT"};
        String[] result = instance.getEnergy(filename);
        assertArrayEquals(expResult, result);
    }
}

// FileEditor_9Test.java
package apbs_mem_