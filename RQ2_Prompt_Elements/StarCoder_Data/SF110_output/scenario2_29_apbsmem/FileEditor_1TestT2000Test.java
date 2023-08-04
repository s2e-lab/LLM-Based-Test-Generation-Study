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
        String filename = "test_files/test_getCompEnergy.txt";
        FileEditor instance = new FileEditor();
        double[] expResult = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0};
        double[] result = instance.getCompEnergy(filename);
        assertArrayEquals(expResult, result);
    }
}
