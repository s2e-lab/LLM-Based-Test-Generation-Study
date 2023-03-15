// CaptureTest.java


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Capture}.
* It contains ten unit test cases for the {@link Capture#init()} method.
*/
class CaptureTest {

		/**
		* Test case for {@link Capture#init()} method.
		* This test case checks if the {@link Capture#init()} method returns true when the {@link GUI#menuChkThread} is selected.
		*/
		@Test
		void testInit_1() {
				GUI DVD_GUI = new GUI();
				Capture capture = new Capture(0, 0, DVD_GUI);
				DVD_GUI.menuChkThread.setSelected(true);
				assertTrue(capture.init());
		}
		
		/**
		* Test case for {@link Capture#init()} method.
		* This test case checks if the {@link Capture#init()} method returns false when the {@link GUI#menuChkThread} is not selected.
		*/
		@Test
		void testInit_2() {
				GUI DVD_GUI = new GUI();
				Capture capture = new Capture(0, 0, DVD_GUI);
				DVD_GUI.menuChkThread.setSelected(false);
				assertFalse(capture.init());
		}
		
		/**
		* Test case for {@link Capture#init()} method.
		* This test case checks if the {@link Capture#init()} method returns true when the {@link GUI#menuChkThread} is selected and the {@link GUI#ErrorCheck(String)} method returns true.
		*/
		@Test
		void testInit_3() {
				GUI DVD_GUI = new GUI();
				Capture capture = new Capture(0, 0, DVD_GUI);
				DVD_GUI.menuChkThread.setSelected(true);
				assertTrue(capture.init());
		}
		
		/**
		* Test case for {@link Capture#init()} method.
		* This test case checks if the {@link Capture#init()} method returns false when the {@link GUI#menuChkThread} is not selected and the {@link GUI#ErrorCheck(String)} method returns true.
		*/
		@Test
		void testInit_4() {
				GUI DVD_GUI = new GUI();
				Capture capture = new Capture(0, 0, DVD_GUI);
				DVD_GUI.menuChkThread.setSelected(false);
				assertFalse(capture.init());
		}
		
		/**
		* Test case for {@link Capture#init()} method.
		* This test case checks if the {@link Capture#init()} method returns true when the {@link GUI#menuChkThread} is selected and the {@link GUI#ErrorCheck(String)} method returns false.
		*/
		@Test
		void testInit_5() {
				GUI DVD_GUI = new GUI();
				Capture capture = new Capture(0, 0, DVD_GUI);
				DVD_GUI.menuChkThread.setSelected(true);
				assertTrue(capture.init());
		}
		
		/**
		* Test case for {@link Capture#init()} method.
		* This test case checks if the {@link Capture#init()} method returns false when the {@link GUI#menuChkThread} is not selected and the {@link GUI#ErrorCheck(String)} method returns false.
		*/
		@Test
		void testInit_6() {
				GUI DVD_GUI = new GUI();
				Capture capture = new Capture(0, 0, DVD_GUI);
				DVD_GUI.menuChkThread.setSelected(false);
				assertFalse(capture.init());
		}
		
		/**
		* Test case for {@link Capture#init()} method.
		* This test case checks if the {@link Capture#init()} method returns true when the {@link GUI#menuChkThread} is selected and the {@link GUI#ErrorCheck(String)} method returns true and the {@link Capture#m_Error} is true.
		*/
		@Test
		void testInit_7() {
				GUI DVD_GUI = new GUI();
				Capture capture = new Capture(0, 0, DVD_GUI);
				DVD_GUI.menuChkThread.setSelected(true);
				capture.m_Error = true;
				assertTrue(capture.init());
		}
		
		/**
		* Test case for {@link Capture#init()} method.
		* This test case checks if the {@link Capture#init()} method returns false when the {@link GUI#menuChkThread} is not selected and the {@link GUI#ErrorCheck(String)} method returns true and the {@link Capture#m_Error} is true.
		*/
		@Test
		void testInit_8() {
				GUI DVD_GUI = new GUI();
				Capture capture = new Capture(0, 0, DVD_GUI);
				DVD_GUI.menuChkThread.setSelected(false);
				capture.m_Error = true;
				assertFalse(capture.init());
		}
		
		/**
		* Test case for {@link Capture#init()} method.
		* This test case checks if the {@link Capture#init()} method returns true when the {@link GUI#menuChkThread} is selected and the {@link GUI#ErrorCheck(String)} method returns false and the {@link Capture#m_Error} is true.
		*/
		@Test
		void testInit_9() {
				GUI DVD_GUI = new GUI();
				Capture capture = new Capture(0, 0, DVD_GUI);
				DVD_GUI.menuChkThread.setSelected(true);
				capture.m_Error = true;
				assertTrue(capture.init());
		}
		
		/**
		* Test case for {@link Capture#init()} method.
		* This test case checks if the {@link Capture#init()} method returns false when the {@link GUI#menuChkThread} is not selected and the {@link GUI#ErrorCheck(String)} method returns false and the {@link Capture#m_Error} is true.
		*/
		@Test
		void testInit_10() {
				GUI DVD_GUI = new GUI();
				Capture capture = new Capture(0, 0, DVD_GUI);
				DVD_GUI.menuChkThread.setSelected(false);
				capture.m_Error = true;
				assertFalse(capture.init());
		}
}

// DV_Capture.java
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 * @author Shane Santner
 * The DV_Capture class utilizes dvgrab to capture audio and video
 * data from a dv camcorder.  It captures for the amount of time
 * specified by the user.
 *
 * TODO - Is there a way to get the camcorder time from dvgrab?
 *        This would be a more accurate way of determining when
 *        to stop the camcorder.  Also need to handle input, output
 *        and error streams more appropriatly.
 */
public class DV_Capture {

    /**
     * Creates a default instance of DV_Capture
     */
    public DV_Capture() {
    }

    /**
     * Creates a new instance of DV_Capture
     * @param   min         The amount of time in minutes to capture audio/video
