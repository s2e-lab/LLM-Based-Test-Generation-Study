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
	 * @throws java.io.FileNotFoundException
	 */
	@Test
	void testGetCompEnergy() throws FileNotFoundException {
		System.out.println("getCompEnergy");
		FileEditor instance = new FileEditor();
		double[] expResult = new double[6];
		double[] result = new double[6];
		
		// Test case 1
		expResult[0] = -0.0012;
		expResult[1] = -0.0012;
		expResult[2] = -0.0012;
		expResult[3] = -0.0012;
		expResult[4] = -0.0012;
		expResult[5] = -0.0012;
		result = instance.getCompEnergy("test/test_files/test_1.txt");
		assertArrayEquals(expResult, result, 0.0001);
		
		// Test case 2
		expResult[0] = -0.0012;
		expResult[1] = -0.0012;
		expResult[2] = -0.0012;
		expResult[3] = -0.0012;
		expResult[4] = -0.0012;
		expResult[5] = -0.0012;
		result = instance.getCompEnergy("test/test_files/test_2.txt");
		assertArrayEquals(expResult, result, 0.0001);
		
		// Test case 3
		expResult[0] = -0.0012;
		expResult[1] = -0.0012;
		expResult[2] = -0.0012;
		expResult[3] = -0.0012;
		expResult[4] = -0.0012;
		expResult[5] = -0.0012;
		result = instance.getCompEnergy("test/test_files/test_3.txt");
		assertArrayEquals(expResult, result, 0.0001);
		
		// Test case 4
		expResult[0] = -0.0012;
		expResult[1] = -0.0012;
		expResult[2] = -0.0012;
		expResult[3] = -0.0012;
		expResult[4] = -0.0012;
		expResult[5] = -0.0012;
		result = instance.getCompEnergy("test/test_files/test_4.txt");
		assertArrayEquals(expResult, result, 0.0001);
		
		// Test case 5
		expResult[0] = -0.0012;
		expResult[1] = -0.0012;
		expResult[2] = -0.0012;
		expResult[3] = -0.0012;
		expResult[4] = -0.0012;
		expResult[5] = -0.0012;
		result = instance.getCompEnergy("test/test_files/test_5.txt");
		assertArrayEquals(expResult, result, 0.0001);
		
		// Test case 6
		expResult[0] = -0.0012;
		expResult[1] = -0.0012;
		expResult[2] = -0.0012;
		expResult[3] = -0.0012;
		expResult[4] = -0.0012;
		expResult[5] = -0.0012;
		result = instance.getCompEnergy("test/test_files/test_6.txt");
		assertArrayEquals(expResult, result, 0.0001);
		
		// Test case 7
		expResult[0] = -0.0012;
		expResult[1] = -0.0012;
		expResult[2] = -0.0012;
		expResult[3] = -0.0012;
		expResult[4] = -0.0012;
		expResult[5] = -0.0012;
		result = instance.getCompEnergy("test/test_files/test_7.txt");
		assertArrayEquals(expResult, result, 0.0001);
		
		// Test case 8
		expResult[0] = -0.0012;
		expResult[1] = -0.0012;
		expResult[2] = -0.0012;
		expResult[3] = -0.0012;
		expResult[4] = -0.0012;
		expResult[5] = -0.0012;
		result = instance.getCompEnergy("test/test_files/test_8.txt");
		assertArrayEquals(expResult, result, 0.0001);
		
		// Test case 9
		expResult[0] = -0.0012;
		expResult[1] = -0.0012;
		expResult[2] = -0.0012;
		expResult[3] = -0.0012;
		expResult[4] = -0.0012;
		expResult[5] = -0.0012;
		result = instance.getCompEnergy("test/test_files/test_9.txt");
		assertArrayEquals(expResult, result, 0.0001);
		
		// Test case 10
		expResult[0] = -0.0012;
		expResult[1] = -0.0012;
		expResult[2] = -0.0012;
		expResult[3] = -0.0012;
		expResult[4] = -0.0012;
		expResult[5] = -0.0012;
		result = instance.getCompEnergy("test/test_files/test_10.txt");
		assertArrayEquals(expResult, result, 0.0001);
	}
}