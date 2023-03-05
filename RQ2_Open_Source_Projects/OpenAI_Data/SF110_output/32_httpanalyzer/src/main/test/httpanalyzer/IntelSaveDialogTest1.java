// IntelSaveDialogTest1.java
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
* It contains ten unit test cases for the {@link IntelSaveDialog#getFilename()} method.
*/
class IntelSaveDialogTest1 {

	/**
	 * Test case 1 for {@link IntelSaveDialog#getFilename()} method.
	 * <p>
	 * Test case 1 checks the {@link IntelSaveDialog#getFilename()} method
	 * for the following condition:
	 * <p>
	 * {@link IntelSaveDialog#getFilename()} method returns null
	 * if the user clicks the "Cancel" button.
	 */
	@Test
	void testGetFilename1() {
		IntelSaveDialog dialog = new IntelSaveDialog(new javax.swing.JFrame(), true);
		dialog.addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent e) {
				System.exit(0);
			}
		});
		dialog.setVisible(true);
		assertNull(IntelSaveDialog.getFilename());
	}
	
	/**
	 * Test case 2 for {@link IntelSaveDialog#getFilename()} method.
	 * <p>
	 * Test case 2 checks the {@link IntelSaveDialog#getFilename()} method
	 * for the following condition:
	 * <p>
	 * {@link IntelSaveDialog#getFilename()} method returns null
	 * if the user clicks the "Display" button.
	 */
	@Test
	void testGetFilename2() {
		IntelSaveDialog dialog = new IntelSaveDialog(new javax.swing.JFrame(), true);
		dialog.addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent e) {
				System.exit(0);
			}
		});
		dialog.setVisible(true);
		assertNull(IntelSaveDialog.getFilename());
	}
	
	/**
	 * Test case 3 for {@link IntelSaveDialog#getFilename()} method.
	 * <p>
	 * Test case 3 checks the {@link IntelSaveDialog#getFilename()} method
	 * for the following condition:
	 * <p>
	 * {@link IntelSaveDialog#getFilename()} method returns null
	 * if the user clicks the "Save to" button and then clicks the "Cancel" button.
	 */
	@Test
	void testGetFilename3() {
		IntelSaveDialog dialog = new IntelSaveDialog(new javax.swing.JFrame(), true);
		dialog.addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent e) {
				System.exit(0);
			}
		});
		dialog.setVisible(true);
		assertNull(IntelSaveDialog.getFilename());
	}
	
	/**
	 * Test case 4 for {@link IntelSaveDialog#getFilename()} method.
	 * <p>
	 * Test case 4 checks the {@link IntelSaveDialog#getFilename()} method
	 * for the following condition:
	 * <p>
	 * {@link IntelSaveDialog#getFilename()} method returns null
	 * if the user clicks the "Save to" button and then clicks the "Display" button.
	 */
	@Test
	void testGetFilename4() {
		IntelSaveDialog dialog = new IntelSaveDialog(new javax.swing.JFrame(), true);
		dialog.addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent e) {
				System.exit(0);
			}
		});
		dialog.setVisible(true);
		assertNull(IntelSaveDialog.getFilename());
	}
	
	/**
	 * Test case 5 for {@link IntelSaveDialog#getFilename()} method.
	 * <p>
	 * Test case 5 checks the {@link IntelSaveDialog#getFilename()} method
	 * for the following condition:
	 * <p>
	 * {@link IntelSaveDialog#getFilename()} method returns null
	 * if the user clicks the "Save to" button and then clicks the "Save to" button.
	 */
	@Test
	void testGetFilename5() {
		IntelSaveDialog dialog = new IntelSaveDialog(new javax.swing.JFrame(), true);
		dialog.addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent e) {
				System.exit(0);
			}
		});
		dialog.setVisible(true);
		assertNull(IntelSaveDialog.getFilename());
	}
	
	/**
	 * Test case 6 for {@link IntelSaveDialog#getFilename()} method.
	 * <p>
	 * Test case 6 checks the {@link IntelSaveDialog#getFilename()} method
	 * for the following condition:
	 * <p>
	 * {@link IntelSaveDialog#getFilename()} method returns null
	 * if the user clicks the "Save to" button and then clicks the "Cancel" button.
	 */
	@Test
	void testGetFilename6() {
		IntelSaveDialog dialog = new IntelSaveDialog(new javax.swing.JFrame(), true);
		dialog.addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent e) {
				System.exit(0);
			}
		});
		dialog.setVisible(true);
		assertNull(IntelSaveDialog.getFilename());
	}
	
	/**
	 * Test case 7 for {@link IntelSaveDialog#getFilename()} method.
	 * <p>
	 * Test case 7 checks the {@link IntelSaveDialog#getFilename()} method
	 * for the following condition:
	 * <p>
	 * {@link IntelSaveDialog#getFilename()} method returns null
	 * if the user clicks the "Save to" button and then clicks the "Display" button.
	 */
	@Test
	void testGetFilename7() {
		IntelSaveDialog dialog = new IntelSaveDialog(new javax.swing.JFrame(), true);
		dialog.addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent e) {
				System.exit(0);
			}
		});
		dialog.setVisible(true);
		assertNull(IntelSaveDialog.getFilename());
	}
	
	/**
	 * Test case 8 for {@link IntelSaveDialog#getFilename()} method.
	 * <p>
	 * Test case 8 checks the {@link IntelSaveDialog#getFilename()} method
	 * for the following condition:
	 * <p>
	 * {@link IntelSaveDialog#getFilename()} method returns null
	 * if the user clicks the "Save to" button and then clicks the "Save to" button.
	 */
	@Test
	void testGetFilename8() {
		IntelSaveDialog dialog = new IntelSaveDialog(new javax.swing.JFrame(), true);
		dialog.addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent e) {
				System.exit(0);
			}
		});
		dialog.setVisible(true);
		assertNull(IntelSaveDialog.getFilename());
	}
	
	/**
	 * Test case 9 for {@link IntelSaveDialog#getFilename()} method.
	 * <p>
	 * Test case 9 checks the {@link IntelSaveDialog#getFilename()} method
	 * for the following condition:
	 * <p>
	 * {@link IntelSaveDialog#getFilename()} method returns null
	 * if the user clicks the "Save to" button and then clicks the "Cancel" button.
	 */
	@Test
	void testGetFilename9() {
		IntelSaveDialog dialog = new IntelSaveDialog(new javax.swing.JFrame(), true);
		dialog.addWindowListener(new java.awt.event.WindowAdapter()