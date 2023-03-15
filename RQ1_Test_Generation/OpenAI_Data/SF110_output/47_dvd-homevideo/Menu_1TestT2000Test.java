// Menu_1Test.java


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.File;
import java.io.FileWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FilenameFilter;
import java.util.StringTokenizer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Menu}.
* It contains ten unit test cases for the {@link Menu#createXML()} method.
*/
class Menu_1Test {

		/**
		* Test case for {@link Menu#createXML()} method.
		* This test case checks if the method creates the xml file correctly.
		*/
		@Test
		void testCreateXML() {
				
				// Create a new Menu object
				Menu menu = new Menu();
				
				// Create a new GUI object
				GUI gui = new GUI();
				
				// Set the output directory
				gui.strOutputDir = "test/test_output";
				
				// Create a new File object
				File xmlFile = new File(gui.strOutputDir + "/vmgm.xml");
				
				// Create a new File object
				File ListDir = new File(gui.strOutputDir);
				
				// Create a new FilenameFilter object
				FilenameFilter filter = new FilenameFilter() {
						
						boolean ret_val = true;
						
						public boolean accept(File dir, String name) {
								if (name.endsWith("vob")) {
										if (!name.equals("menu.vob"))
												ret_val = true;
										else
												ret_val = false;
								} else
										ret_val = false;
								return ret_val;
						}
				};
				
				// Store the vob files in the video_files array
				String[] video_files = ListDir.list(filter);
				
				// Call the createXML method
				menu.createXML();
				
				// Check if the xml file exists
				assertTrue(xmlFile.exists());
				
				// Check if the xml file is a file
				assertTrue(xmlFile.isFile());
				
				// Check if the xml file is readable
				assertTrue(xmlFile.canRead());
				
				// Check if the xml file is writable
				assertTrue(xmlFile.canWrite());
				
				// Create a new BufferedReader object
				BufferedReader reader = null;
				
				// Create a new String object
				String line = null;
				
				// Create a new String object
				String xml = null;
				
				// Create a new String object
				String expected = null;
				
				// Create a new String object
				String expected_1 = null;
				
				// Create a new String object
				String expected_2 = null;
				
				// Create a new String object
				String expected_3 = null;
				
				// Create a new String object
				String expected_4 = null;
				
				// Create a new String object
				String expected_5 = null;
				
				// Create a new String object
				String expected_6 = null;
				
				// Create a new String object
				String expected_7 = null;
				
				// Create a new String object
				String expected_8 = null;
				
				// Create a new String object
				String expected_9 = null;
				
				// Create a new String object
				String expected_10 = null;
				
				// Create a new String object
				String expected_11 = null;
				
				// Create a new String object
				String expected_12 = null;
				
				// Create a new String object
				String expected_13 = null;
				
				// Create a new String object
				String expected_14 = null;
				
				// Create a new String object
				String expected_15 = null;
				
				// Create a new String object
				String expected_16 = null;
				
				// Create a new String object
				String expected_17 = null;
				
				// Create a new String object
				String expected_18 = null;
				
				// Create a new String object
				String expected_19 = null;
				
				// Create a new String object
				String expected_20 = null;
				
				// Create a new String object
				String expected_21 = null;
				
				// Create a new String object
				String expected_22 = null;
				
				// Create a new String object
				String expected_23 = null;
				
				// Create a new String object
				String expected_24 = null;
				
				// Create a new String object
				String expected_25 = null;
				
				// Create a new String object
				String expected_26 = null;
				
				// Create a new String object
				String expected_27 = null;
				
				// Create a new String object
				String expected_28 = null;
				
				// Create a new String object
				String expected_29 = null;
				
				// Create a new String object
				String expected_30 = null;
				
				// Create a new String object
				String expected_31 = null;
				
				// Create a new String object
				String expected_32 = null;
				
				// Create a new String object
				String expected_33 = null;
				
				// Create a new String object
				String expected_34 = null;
				
				// Create a new String object
				String expected_35 = null;
				
				// Create a new String object
				String expected_36 = null;
				
				// Create a new String object
				String expected_37 = null;
				
				// Create a new String object
				String expected_38 = null;
				
				// Create a new String object
				String expected_39 = null;
				
				// Create a new String object
				String expected_40 = null;
				
				// Create a new String object
				String expected_41 = null;
				
				// Create a new String object
				String expected_42 = null;
				
				// Create a new String object
				String expected_43 = null;
				
				// Create a new String object
				String expected_44 = null;
				
				// Create a