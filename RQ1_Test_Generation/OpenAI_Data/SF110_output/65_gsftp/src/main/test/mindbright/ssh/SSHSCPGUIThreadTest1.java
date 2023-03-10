// SSHSCPGUIThreadTest1.java
package mindbright.ssh;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import com.gotoservers.ftp.RemoteFileBrowser;
import com.isnetworks.ssh.FileDisplay;
import mindbright.gui.ProgressBar;
import mindbright.util.AWTConvenience;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SSHSCPGUIThread}.
* It contains ten unit test cases for the {@link SSHSCPGUIThread#starExpand(String[], String)} method.
*/
class SSHSCPGUIThreadTest1 {

		/**
		* Test case 1 for {@link SSHSCPGUIThread#starExpand(String[], String)}.
		* This test case tests the method with a null file list.
		*/
		@Test
		void testStarExpand1() {
				String[] fileList = null;
				String curDir = "";
				String[] result = SSHSCPGUIThread.starExpand(fileList, curDir);
				assertNull(result);
		}
		
		/**
		* Test case 2 for {@link SSHSCPGUIThread#starExpand(String[], String)}.
		* This test case tests the method with an empty file list.
		*/
		@Test
		void testStarExpand2() {
				String[] fileList = new String[0];
				String curDir = "";
				String[] result = SSHSCPGUIThread.starExpand(fileList, curDir);
				assertEquals(0, result.length);
		}
		
		/**
		* Test case 3 for {@link SSHSCPGUIThread#starExpand(String[], String)}.
		* This test case tests the method with a file list containing a single file.
		*/
		@Test
		void testStarExpand3() {
				String[] fileList = new String[1];
				fileList[0] = "test.txt";
				String curDir = "";
				String[] result = SSHSCPGUIThread.starExpand(fileList, curDir);
				assertEquals(1, result.length);
				assertEquals("test.txt", result[0]);
		}
		
		/**
		* Test case 4 for {@link SSHSCPGUIThread#starExpand(String[], String)}.
		* This test case tests the method with a file list containing a single file with a star.
		*/
		@Test
		void testStarExpand4() {
				String[] fileList = new String[1];
				fileList[0] = "test*.txt";
				String curDir = "";
				String[] result = SSHSCPGUIThread.starExpand(fileList, curDir);
				assertEquals(1, result.length);
				assertEquals("test*.txt", result[0]);
		}
		
		/**
		* Test case 5 for {@link SSHSCPGUIThread#starExpand(String[], String)}.
		* This test case tests the method with a file list containing a single file with a star.
		*/
		@Test
		void testStarExpand5() {
				String[] fileList = new String[1];
				fileList[0] = "test*";
				String curDir = "";
				String[] result = SSHSCPGUIThread.starExpand(fileList, curDir);
				assertEquals(1, result.length);
				assertEquals("test*", result[0]);
		}
		
		/**
		* Test case 6 for {@link SSHSCPGUIThread#starExpand(String[], String)}.
		* This test case tests the method with a file list containing a single file with a star.
		*/
		@Test
		void testStarExpand6() {
				String[] fileList = new String[1];
				fileList[0] = "test*txt";
				String curDir = "";
				String[] result = SSHSCPGUIThread.starExpand(fileList, curDir);
				assertEquals(1, result.length);
				assertEquals("test*txt", result[0]);
		}
		
		/**
		* Test case 7 for {@link SSHSCPGUIThread#starExpand(String[], String)}.
		* This test case tests the method with a file list containing a single file with a star.
		*/
		@Test
		void testStarExpand7() {
				String[] fileList = new String[1];
				fileList[0] = "test*txt";
				String curDir = "";
				String[] result = SSHSCPGUIThread.starExpand(fileList, curDir);
				assertEquals(1, result.length);
				assertEquals("test*txt", result[0]);
		}
		
		/**
		* Test case 8 for {@link SSHSCPGUIThread#starExpand(String[], String)}.
		* This test case tests the method with a file list containing a single file with a star.
		*/
		@Test
		void testStarExpand8() {
				String[] fileList = new String[1];
				fileList[0] = "test*txt";
				String curDir = "";
				String[] result = SSHSCPGUIThread.starExpand(fileList, curDir);
				assertEquals(1, result.length);
				assertEquals("test*txt", result[0]);
		}
		
		/**
		* Test case 9 for {@link SSHSCPGUIThread#starExpand(String[], String)}.
		* This test case tests the method with a file list containing a single file with a star.
		*/
		@Test
		void testStarExpand9() {
				String[] fileList = new String[1];
				fileList[0] = "test*txt";
				String curDir = "";
				String[] result = SSHSCPGUIThread.starExpand(fileList, curDir);
				assertEquals(1, result.length);
				assertEquals("test*txt", result[0]);
		}
		
		/**
		* Test case 10 for {@link SSHSCPGUIThread#starExpand(String[], String)}.
		* This test case tests the method with a file list containing a single file with a star.
		*/
		@Test
		void testStarExpand10() {
				String[] fileList = new String[1];
				fileList[0] = "test*txt";
				String curDir = "";
				String[] result = SSHSCPGUIThread.starExpand(fileList, curDir);
				assertEquals(1, result.length);
				assertEquals("test*txt", result[0]);
		}
}

// SSHSCPGUIThreadTest2.java
package mindbright.ssh;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import com.gotoservers.ftp.RemoteFileBrowser;
import com.isnetworks.ssh.FileDisplay;
import mindbright.gui.ProgressBar;
import mindbright.util.AWTConvenience;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SSHSCPGUIThread}.
* It contains ten unit test cases for the {@link SSHSCPGUIThread#spaceSplit(String)} method.
*/
class SSHSCPGUIThreadTest2 {
		
		/**
		* Test case 1 for {@link SSHSCPGUIThread#spaceSplit(String)}.
		* This test case tests the method with a null string.
		*/
		@Test
		void testSpaceSplit1() {
				String str = null;
				String[] result = SSHSCPGUIThread.spaceSplit(str);
				assertNull(result);
		}
		
		/**
		* Test case 2 for {@link SSHSCPGUIThread#spaceSplit(String)}.
		* This test case tests the method with an empty string.
		*/
		@Test
		void