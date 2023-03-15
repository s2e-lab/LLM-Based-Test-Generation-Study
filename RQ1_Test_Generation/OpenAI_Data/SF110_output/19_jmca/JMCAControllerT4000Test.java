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
 JMCAView is the View for the JMCA application
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
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.io.File;

/**
 * <p>Title: Group 2 Project </p>
 *
 * <p>Class: CEN4010 Fall 2005</p>
 *
 * <p>Description: JMCAView is the View for the JMCA application </p>
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
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocation(100, 100);
        setLayout(new BorderLayout());
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout());
        JLabel filenameLabel = new JLabel("Filename:");
        topPanel.add(filenameLabel);
        filenameField = new JTextField(30);
        topPanel.add(filenameField);
        selectFileButton = new JButton("Select File");
        topPanel.add(selectFileButton);
        analyzeButton = new JButton("Analyze");
        topPanel.add(analyzeButton);
        add(topPanel, BorderLayout.NORTH);
        outputArea = new JTextArea(20, 50);
        outputArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputArea);
        add(scrollPane, BorderLayout.CENTER);
        fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fileChooser.setCurrentDirectory(new File("."));
        setVisible(true);
    }

    /**
     *   sets the filename
     * @param filename String
     */
    public void setFilename(String filename) {
        filenameField.setText(filename);
    }

    /**
     *   gets the filename
     * @return String
     */
    public String getFilename() {
        return filenameField.getText();
    }

    /**
     *   sets the output
     * @param output String
     */
    public void setOutput(String output) {
        outputArea.setText(output);
    }

    /**
     *   gets the output
     * @return String
     */
    public String getOutput() {
        return outputArea.getText();
    }

    /**
     *   sets the analyze button listener
     * @param listener ActionListener
     */
    public void setAnalyzeListener(ActionListener listener) {
        analyzeButton.addActionListener(listener);
    }

    /**
     *   sets the select file button listener
     * @param listener ActionListener
     */
    public void setSelectFileListener(ActionListener listener) {
        selectFileButton.addActionListener(listener);
    }

    /**
     *   updates the display
     * @param output String
     */
    public void updateDisplay(String output) {
        setOutput(output);
    }

    /**
     *   chooses a file
     */
    public void chooseFile() {
        int returnVal = fileChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            setFilename(file.getAbsolutePath());
        }
    }

    //end chooseFile()
    //main function for JMCA Application
    public static void main(String[] args) {
        JMCAView view = new JMCAView();
        // in this case our model is the Parser / Analyzer
        //set action listeners here....
        view.setAnalyzeListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                view.updateDisplay(JMCAController.analyze(view.getFilename()));
            }
        });
        //end setAnalyzeListener
        view.setSelectFileListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                view.chooseFile();
            }
        });
        //end setSelectFileListener
    }
    //end main
}
//end class

// JMCAAnalyzer.java
/*
 JMCAAnalyzer.java

 Contains class JMCAAnalyzer
 JMCAAnalyzer is the Analyzer for the JMCA application
 JMCAAnalyzer is a subclass of Analyzer
 JMCAAnalyzer accepts an ASTNode as input, then traverses the tree
 to determine the cohesion of the Java file


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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * <p>Title: Group 2 Project </p>
 *
 * <p>Class: CEN4010 Fall 2005</p>
 *
 * <p>Description: JMCAAnalyzer is the Analyzer for the JMCA application </p>
 *
 * <p>Instructor Dr. Stoeklin</p>
 *
 * @author Group 2
 */
public class JMCAAnalyzer extends Analyzer {

    private String filename;

    private ArrayList<String> classNames;

    private ArrayList<String> methodNames;

    private ArrayList<String> variableNames;

    private HashMap<String, ArrayList<String>> classMethodMap;

    private HashMap<String, ArrayList<String>> classVariableMap;

    private HashMap<String, ArrayList<String>> methodVariableMap;

    private HashMap<String, ArrayList<String>> methodClassMap;

    private HashMap<String, ArrayList<String>> variableClassMap;

    private HashMap<String, ArrayList<String>> variableMethodMap;

    private HashMap<String, ArrayList<String>> classClassMap;

    private HashMap<String, ArrayList<String>> methodMethodMap;

    private HashMap<String, ArrayList<String>> variableVariableMap;

    private HashMap<String, ArrayList<String>> classMethodVariableMap;

    private HashMap<String, ArrayList<String>> methodVariableClassMap;

    private HashMap<String, ArrayList<String>> variableClassMethodMap;

    private HashMap<String, ArrayList<String>> classVariableMethodMap;

    private HashMap<String, ArrayList<String>> methodClassVariableMap;

    private HashMap<String, ArrayList<String>> variableMethodClassMap;

    private HashMap<String, ArrayList<String>> classMethodClassMap;

    private HashMap<String, ArrayList<String>> methodClassMethodMap;

    private HashMap<String, ArrayList<String>> variableMethodVariableMap;

    private HashMap<String, ArrayList<String>> classVariableVariableMap;

    private HashMap<String, ArrayList<String>> methodVariableMethodMap;

    private HashMap<String, ArrayList<String>> variableClassClassMap;

    private HashMap<String, ArrayList<String>> classMethodMethodMap;

    private HashMap<String, ArrayList<String>> methodClassClassMap;

    private HashMap<String, ArrayList<String>> variableMethodMethodMap;

    private HashMap<String, ArrayList<String>> classVariableMethodMap;

    private HashMap<String, ArrayList<String>> methodVariableVariableMap;

    private HashMap<String, ArrayList<String>> variableClassMethodMap;

    private HashMap<String, ArrayList<String>> classMethodVariableMap;

    private HashMap<String, ArrayList<String>> methodVariableMethodMap;

    private HashMap<String, ArrayList<String>> variableClassVariableMap;

    private HashMap<String, ArrayList<String>> classVariableVariableMap;

    private HashMap<String, ArrayList<String>> methodClassMethodMap;

    private HashMap<String, ArrayList<String>> variableMethodClassMap;

    private HashMap<String, ArrayList<String>> classMethodClassMap;

    private HashMap<String, ArrayList<String>> methodClassVariableMap;

    private HashMap<String, ArrayList<String>> variableMethodVariableMap;

    private HashMap<String, ArrayList<String>> classVariableClassMap;

    private HashMap<String, ArrayList<String>> methodVariableClassMap;

    private HashMap<String, ArrayList<String>> variableClassVariableMap;

    private HashMap<String, ArrayList<String>> classMethodMethodMap;

    private HashMap<String, ArrayList<String>> methodClassVariableMap;

    private HashMap<String, ArrayList<String>> variableMethodClassMap;

    private HashMap<String, ArrayList<String>> classVariableMethodMap;

    private HashMap<String, ArrayList<String>> methodVariableVariableMap;

    private HashMap<String, ArrayList<String>> variableClassMethodMap;

    private HashMap<String, ArrayList<String>> classMethodVariableMap;

    private HashMap<String, ArrayList<String>> methodVariableMethodMap;

    private HashMap<String, ArrayList<String>> variableClassClassMap;

    private HashMap<String, ArrayList<String>> classVariableClassMap;

    private HashMap<String, ArrayList<String>> methodClassMethodMap;

    private HashMap<String, ArrayList<String>> variableMethodClassMap;

    private HashMap<String, ArrayList<String>> classMethodClassMap;

    private HashMap<String, ArrayList