// JMCAControllerTest.java
package com.soops.CEN4010.JMCA;

import java.io.Reader;
import java.io.IOException;
import java.io.FileReader;
import java.io.File;
import java.awt.event.*;
import java.awt.Toolkit;
import com.soops.CEN4010.JMCA.JParser.parseTest.JMCAParserTestFrame;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.Dimension;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JMCAController}.
* It contains ten unit test cases for the {@link JMCAController#analyze(String)} method.
*/
class JMCAControllerTest {

	/**
	* Test case for the {@link JMCAController#analyze(String)} method.
	* It tests the case when the input file is null.
	*/
	@Test
	void testAnalyzeNull() {
		assertEquals("ERROR: Filename not entered.", JMCAController.analyze(null));
	}
	
	/**
	* Test case for the {@link JMCAController#analyze(String)} method.
	* It tests the case when the input file is empty.
	*/
	@Test
	void testAnalyzeEmpty() {
		assertEquals("ERROR: Filename not entered.", JMCAController.analyze(""));
	}
	
	/**
	* Test case for the {@link JMCAController#analyze(String)} method.
	* It tests the case when the input file is not found.
	*/
	@Test
	void testAnalyzeNotFound() {
		assertEquals("ERROR: File not found.", JMCAController.analyze("notfound.java"));
	}
	
	/**
	* Test case for the {@link JMCAController#analyze(String)} method.
	* It tests the case when the input file is a Java file.
	*/
	@Test
	void testAnalyzeJava() {
		assertEquals("ERROR: File is not a Java file.", JMCAController.analyze("test.java"));
	}
	
	/**
	* Test case for the {@link JMCAController#analyze(String)} method.
	* It tests the case when the input file is a JSP file.
	*/
	@Test
	void testAnalyzeJsp() {
		assertEquals("ERROR: File is not a Java file.", JMCAController.analyze("test.jsp"));
	}
	
	/**
	* Test case for the {@link JMCAController#analyze(String)} method.
	* It tests the case when the input file is a HTML file.
	*/
	@Test
	void testAnalyzeHtml() {
		assertEquals("ERROR: File is not a Java file.", JMCAController.analyze("test.html"));
	}
	
	/**
	* Test case for the {@link JMCAController#analyze(String)} method.
	* It tests the case when the input file is a CSS file.
	*/
	@Test
	void testAnalyzeCss() {
		assertEquals("ERROR: File is not a Java file.", JMCAController.analyze("test.css"));
	}
	
	/**
	* Test case for the {@link JMCAController#analyze(String)} method.
	* It tests the case when the input file is a JavaScript file.
	*/
	@Test
	void testAnalyzeJs() {
		assertEquals("ERROR: File is not a Java file.", JMCAController.analyze("test.js"));
	}
	
	/**
	* Test case for the {@link JMCAController#analyze(String)} method.
	* It tests the case when the input file is a JSP file with Java code.
	*/
	@Test
	void testAnalyzeJspWithJava() {
		assertEquals("ERROR: File is not a Java file.", JMCAController.analyze("test.jsp"));
	}
	
	/**
	* Test case for the {@link JMCAController#analyze(String)} method.
	* It tests the case when the input file is a Java file with JSP code.
	*/
	@Test
	void testAnalyzeJavaWithJsp() {
		assertEquals("ERROR: File is not a Java file.", JMCAController.analyze("test.java"));
	}
}

// JMCAView.java
/*
 JMCAView.java

 Contains class JMCAView
 JMCAView is the View for the JMCA MVC pattern
 JMCAView is a JFrame that contains the GUI elements for the JMCA application


 CEN4010
 FALL 2005
 GROUP2

 Curt Hayashida, Scott Springer, Ian Cole


 Revision History:
 10/15/2005 - IC - Quick & Dirty Class Creation for prototype
 10/24/2005 - IC - First Integration pass with GUI code
           1) Added to package
           2) Added comments to the analyze() method
             based on Scott's early design
 10/30/2005 - IC - Convert to true MVC (Model-View-Controller) per the grading notes
      1) Changing from JMCAFrame has a JMCAController to
       JMCAController (Controller) has a JMCAFrame (View)
      2) Removed constructor that took filename - unneeded with MVC
      3) Removed get / set filename - unneeded
      4) Removed getOutput - unneeded
      5) Main function now target for application execution
      6) Main function updated to MVC pattern
      7) Converted to use JMCAView

 11/13/2005 - SS - Change parser to JMCAParser, analyzer to JMCAAnalyzer

 Compilation (from project directory)
 javac -d . *.java

 Execution (from top-level project directory)
 java com.soops.CEN4010.JMCA.JMCAController


 */
package com.soops.CEN4010.JMCA;

import java.awt.event.*;
import java.awt.Toolkit;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.Dimension;
import javax.swing.*;
import java.awt.*;
import java.io.*;

/**
 * <p>Title: Group 2 Project </p>
 *
 * <p>Class: CEN4010 Fall 2005</p>
 *
 * <p>Description: JMCAView is the View for the JMCA MVC pattern </p>
 *
 * <p>Instructor Dr. Stoeklin</p>
 *
 * @author Group 2
 */
public class JMCAView extends JFrame {

    private JTextField filenameField;

    private JTextArea outputArea;

    private JButton analyzeButton;

    private JButton selectFileButton;

    private JFileChooser fileChooser;

    /**
     * default constructor
     */
    public JMCAView() {
        super("JMCA");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout());
        filenameField = new JTextField(30);
        topPanel.add(filenameField);
        selectFileButton = new JButton("Select File");
        topPanel.add(selectFileButton);
        analyzeButton = new JButton("Analyze");
        topPanel.add(analyzeButton);
        add(topPanel, BorderLayout.NORTH);
        outputArea = new JTextArea();
        outputArea.setEditable(false);
        add(new JScrollPane(outputArea), BorderLayout.CENTER);
        fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new javax.swing.filechooser.FileFilter() {

            public boolean accept(File f) {
                return f.getName().toLowerCase().endsWith(".java") || f.isDirectory();
            }

            public String getDescription() {
                return "Java Source Files";
            }
        });
        setVisible(true);
    }

    /**
     *   sets the action listener for the analyze button
     * @param listener ActionListener
     */
    public void setAnalyzeListener(ActionListener listener) {
        analyzeButton.addActionListener(listener);
    }

    /**
     *   sets the action listener for the select file button
     * @param listener ActionListener
     */
    public void setSelectFileListener(ActionListener listener) {
        selectFileButton.addActionListener(listener);
    }

    /**
     *   returns the filename from the filename field
     * @return String
     */
    public String getFilename() {
        return filenameField.getText();
    }

    /**
     *   updates the output area with the given text
     * @param text String
     */
   