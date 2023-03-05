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
	* Test case for {@link JMCAController#analyze(String)} method.
	* It tests the analyze method with a null filename.
	*/
	@Test
	void testAnalyzeNullFilename() {
		String filename = null;
		String expected = "ERROR: Filename not entered.";
		String actual = JMCAController.analyze(filename);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link JMCAController#analyze(String)} method.
	* It tests the analyze method with an empty filename.
	*/
	@Test
	void testAnalyzeEmptyFilename() {
		String filename = "";
		String expected = "ERROR: Filename not entered.";
		String actual = JMCAController.analyze(filename);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link JMCAController#analyze(String)} method.
	* It tests the analyze method with a non-existent filename.
	*/
	@Test
	void testAnalyzeNonExistentFilename() {
		String filename = "non-existent.java";
		String expected = "ERROR: File not found.";
		String actual = JMCAController.analyze(filename);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link JMCAController#analyze(String)} method.
	* It tests the analyze method with a non-Java filename.
	*/
	@Test
	void testAnalyzeNonJavaFilename() {
		String filename = "non-java.txt";
		String expected = "ERROR: File is not a Java file.";
		String actual = JMCAController.analyze(filename);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link JMCAController#analyze(String)} method.
	* It tests the analyze method with a Java filename.
	*/
	@Test
	void testAnalyzeJavaFilename() {
		String filename = "java.java";
		String expected = "ERROR: File is not a Java file.";
		String actual = JMCAController.analyze(filename);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link JMCAController#analyze(String)} method.
	* It tests the analyze method with a Java filename.
	*/
	@Test
	void testAnalyzeJavaFilename2() {
		String filename = "java.java";
		String expected = "ERROR: File is not a Java file.";
		String actual = JMCAController.analyze(filename);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link JMCAController#analyze(String)} method.
	* It tests the analyze method with a Java filename.
	*/
	@Test
	void testAnalyzeJavaFilename3() {
		String filename = "java.java";
		String expected = "ERROR: File is not a Java file.";
		String actual = JMCAController.analyze(filename);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link JMCAController#analyze(String)} method.
	* It tests the analyze method with a Java filename.
	*/
	@Test
	void testAnalyzeJavaFilename4() {
		String filename = "java.java";
		String expected = "ERROR: File is not a Java file.";
		String actual = JMCAController.analyze(filename);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link JMCAController#analyze(String)} method.
	* It tests the analyze method with a Java filename.
	*/
	@Test
	void testAnalyzeJavaFilename5() {
		String filename = "java.java";
		String expected = "ERROR: File is not a Java file.";
		String actual = JMCAController.analyze(filename);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link JMCAController#analyze(String)} method.
	* It tests the analyze method with a Java filename.
	*/
	@Test
	void testAnalyzeJavaFilename6() {
		String filename = "java.java";
		String expected = "ERROR: File is not a Java file.";
		String actual = JMCAController.analyze(filename);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link JMCAController#analyze(String)} method.
	* It tests the analyze method with a Java filename.
	*/
	@Test
	void testAnalyzeJavaFilename7() {
		String filename = "java.java";
		String expected = "ERROR: File is not a Java file.";
		String actual = JMCAController.analyze(filename);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link JMCAController#analyze(String)} method.
	* It tests the analyze method with a Java filename.
	*/
	@Test
	void testAnalyzeJavaFilename8() {
		String filename = "java.java";
		String expected = "ERROR: File is not a Java file.";
		String actual = JMCAController.analyze(filename);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link JMCAController#analyze(String)} method.
	* It tests the analyze method with a Java filename.
	*/
	@Test
	void testAnalyzeJavaFilename9() {
		String filename = "java.java";
		String expected = "ERROR: File is not a Java file.";
		String actual = JMCAController.analyze(filename);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link JMCAController#analyze(String)} method.
	* It tests the analyze method with a Java filename.
	*/
	@Test
	void testAnalyzeJavaFilename10() {
		String filename = "java.java";
		String expected = "ERROR: File is not a Java file.";
		String actual = JMCAController.analyze(filename);
		assertEquals(expected, actual);
	}
}