// IntelSaveDialogTest0.java
/*
 * IntelSaveDialog.java
 *
 * Created on 31.03.2010, 13:51:12
 */
package httpanalyzer;

import javax.swing.JFileChooser;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IntelSaveDialog}.
* It contains ten unit test cases for the {@link IntelSaveDialog#getStatus()} method.
*/
class IntelSaveDialogTest0 {

	/**
	 * Test case for {@link IntelSaveDialog#getStatus()} method.
	 * <p>
	 * Test case for checking the status of the dialog.
	 * <p>
	 * Expected result: status is 0.
	 */
	@Test
	void testGetStatus0() {
		IntelSaveDialog dialog = new IntelSaveDialog(new javax.swing.JFrame(), true);
		dialog.addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent e) {
				System.exit(0);
			}
		});
		dialog.setVisible(true);
		assertEquals(0, dialog.getStatus());
	}
	
	/**
	 * Test case for {@link IntelSaveDialog#getStatus()} method.
	 * <p>
	 * Test case for checking the status of the dialog.
	 * <p>
	 * Expected result: status is 1.
	 */
	@Test
	void testGetStatus1() {
		IntelSaveDialog dialog = new IntelSaveDialog(new javax.swing.JFrame(), true);
		dialog.addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent e) {
				System.exit(0);
			}
		});
		dialog.setVisible(true);
		assertEquals(1, dialog.getStatus());
	}
	
	/**
	 * Test case for {@link IntelSaveDialog#getStatus()} method.
	 * <p>
	 * Test case for checking the status of the dialog.
	 * <p>
	 * Expected result: status is 2.
	 */
	@Test
	void testGetStatus2() {
		IntelSaveDialog dialog = new IntelSaveDialog(new javax.swing.JFrame(), true);
		dialog.addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent e) {
				System.exit(0);
			}
		});
		dialog.setVisible(true);
		assertEquals(2, dialog.getStatus());
	}
	
	/**
	 * Test case for {@link IntelSaveDialog#getStatus()} method.
	 * <p>
	 * Test case for checking the status of the dialog.
	 * <p>
	 * Expected result: status is 0.
	 */
	@Test
	void testGetStatus3() {
		IntelSaveDialog dialog = new IntelSaveDialog(new javax.swing.JFrame(), true);
		dialog.addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent e) {
				System.exit(0);
			}
		});
		dialog.setVisible(true);
		assertEquals(0, dialog.getStatus());
	}
	
	/**
	 * Test case for {@link IntelSaveDialog#getStatus()} method.
	 * <p>
	 * Test case for checking the status of the dialog.
	 * <p>
	 * Expected result: status is 1.
	 */
	@Test
	void testGetStatus4() {
		IntelSaveDialog dialog = new IntelSaveDialog(new javax.swing.JFrame(), true);
		dialog.addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent e) {
				System.exit(0);
			}
		});
		dialog.setVisible(true);
		assertEquals(1, dialog.getStatus());
	}
	
	/**
	 * Test case for {@link IntelSaveDialog#getStatus()} method.
	 * <p>
	 * Test case for checking the status of the dialog.
	 * <p>
	 * Expected result: status is 2.
	 */
	@Test
	void testGetStatus5() {
		IntelSaveDialog dialog = new IntelSaveDialog(new javax.swing.JFrame(), true);
		dialog.addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent e) {
				System.exit(0);
			}
		});
		dialog.setVisible(true);
		assertEquals(2, dialog.getStatus());
	}
	
	/**
	 * Test case for {@link IntelSaveDialog#getStatus()} method.
	 * <p>
	 * Test case for checking the status of the dialog.
	 * <p>
	 * Expected result: status is 0.
	 */
	@Test
	void testGetStatus6() {
		IntelSaveDialog dialog = new IntelSaveDialog(new javax.swing.JFrame(), true);
		dialog.addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent e) {
				System.exit(0);
			}
		});
		dialog.setVisible(true);
		assertEquals(0, dialog.getStatus());
	}
	
	/**
	 * Test case for {@link IntelSaveDialog#getStatus()} method.
	 * <p>
	 * Test case for checking the status of the dialog.
	 * <p>
	 * Expected result: status is 1.
	 */
	@Test
	void testGetStatus7() {
		IntelSaveDialog dialog = new IntelSaveDialog(new javax.swing.JFrame(), true);
		dialog.addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent e) {
				System.exit(0);
			}
		});
		dialog.setVisible(true);
		assertEquals(1, dialog.getStatus());
	}
	
	/**
	 * Test case for {@link IntelSaveDialog#getStatus()} method.
	 * <p>
	 * Test case for checking the status of the dialog.
	 * <p>
	 * Expected result: status is 2.
	 */
	@Test
	void testGetStatus8() {
		IntelSaveDialog dialog = new IntelSaveDialog(new javax.swing.JFrame(), true);
		dialog.addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent e) {
				System.exit(0);
			}
		});
		dialog.setVisible(true);
		assertEquals(2, dialog.getStatus());
	}
	
	/**
	 * Test case for {@link IntelSaveDialog#getStatus()} method.
	 * <p>
	 * Test case for checking the status of the dialog.
	 * <p>
	 * Expected result: status is 0.
	 */
	@Test
	void testGetStatus9() {
		IntelSaveDialog dialog = new IntelSaveDialog(new javax.swing.JFrame(), true);
		dialog.addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent e) {
				System.exit(0);
			}
		});
		dialog.setVisible(true);
		assertEquals(0, dialog.getStatus());
	}
}