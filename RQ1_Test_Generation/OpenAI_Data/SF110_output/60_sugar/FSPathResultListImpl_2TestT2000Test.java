// FSPathResultListImpl_2Test.java
/*
 * FSPathResultListImpl.java
 *
 * Created on 08 April 2008, 18:00
 *
 */
package net.sf.sugar.fspath;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FSPathResultListImpl}.
* It contains ten unit test cases for the {@link FSPathResultListImpl#copy(String)} method.
*/
class FSPathResultListImpl_2Test {

	/**
	 * Test of copy method, of class FSPathResultListImpl.
	 * It tests the case when the destination path is null.
	 * @throws java.io.IOException
	 * @throws net.sf.sugar.fspath.OperationNotPermittedException
	 */
	@Test
	void testCopy_DestinationPathIsNull() throws IOException, OperationNotPermittedException {
		System.out.println("copy");
		String destinationDirPath = null;
		FSPathResultListImpl instance = new FSPathResultListImpl();
		FSPathResultModificationList expResult = null;
		FSPathResultModificationList result = instance.copy(destinationDirPath);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of copy method, of class FSPathResultListImpl.
	 * It tests the case when the destination path is empty.
	 * @throws java.io.IOException
	 * @throws net.sf.sugar.fspath.OperationNotPermittedException
	 */
	@Test
	void testCopy_DestinationPathIsEmpty() throws IOException, OperationNotPermittedException {
		System.out.println("copy");
		String destinationDirPath = "";
		FSPathResultListImpl instance = new FSPathResultListImpl();
		FSPathResultModificationList expResult = null;
		FSPathResultModificationList result = instance.copy(destinationDirPath);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of copy method, of class FSPathResultListImpl.
	 * It tests the case when the destination path is not a directory.
	 * @throws java.io.IOException
	 * @throws net.sf.sugar.fspath.OperationNotPermittedException
	 */
	@Test
	void testCopy_DestinationPathIsNotADirectory() throws IOException, OperationNotPermittedException {
		System.out.println("copy");
		String destinationDirPath = "test/resources/test.txt";
		FSPathResultListImpl instance = new FSPathResultListImpl();
		FSPathResultModificationList expResult = null;
		FSPathResultModificationList result = instance.copy(destinationDirPath);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of copy method, of class FSPathResultListImpl.
	 * It tests the case when the destination path is not a directory.
	 * @throws java.io.IOException
	 * @throws net.sf.sugar.fspath.OperationNotPermittedException
	 */
	@Test
	void testCopy_DestinationPathIsNotADirectory2() throws IOException, OperationNotPermittedException {
		System.out.println("copy");
		String destinationDirPath = "test/resources/test.txt";
		FSPathResultListImpl instance = new FSPathResultListImpl();
		FSPathResultModificationList expResult = null;
		FSPathResultModificationList result = instance.copy(destinationDirPath);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of copy method, of class FSPathResultListImpl.
	 * It tests the case when the destination path is not a directory.
	 * @throws java.io.IOException
	 * @throws net.sf.sugar.fspath.OperationNotPermittedException
	 */
	@Test
	void testCopy_DestinationPathIsNotADirectory3() throws IOException, OperationNotPermittedException {
		System.out.println("copy");
		String destinationDirPath = "test/resources/test.txt";
		FSPathResultListImpl instance = new FSPathResultListImpl();
		FSPathResultModificationList expResult = null;
		FSPathResultModificationList result = instance.copy(destinationDirPath);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of copy method, of class FSPathResultListImpl.
	 * It tests the case when the destination path is not a directory.
	 * @throws java.io.IOException
	 * @throws net.sf.sugar.fspath.OperationNotPermittedException
	 */
	@Test
	void testCopy_DestinationPathIsNotADirectory4() throws IOException, OperationNotPermittedException {
		System.out.println("copy");
		String destinationDirPath = "test/resources/test.txt";
		FSPathResultListImpl instance = new FSPathResultListImpl();
		FSPathResultModificationList expResult = null;
		FSPathResultModificationList result = instance.copy(destinationDirPath);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of copy method, of class FSPathResultListImpl.
	 * It tests the case when the destination path is not a directory.
	 * @throws java.io.IOException
	 * @throws net.sf.sugar.fspath.OperationNotPermittedException
	 */
	@Test
	void testCopy_DestinationPathIsNotADirectory5() throws IOException, OperationNotPermittedException {
		System.out.println("copy");
		String destinationDirPath = "test/resources/test.txt";
		FSPathResultListImpl instance = new FSPathResultListImpl();
		FSPathResultModificationList expResult = null;
		FSPathResultModificationList result = instance.copy(destinationDirPath);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of copy method, of class FSPathResultListImpl.
	 * It tests the case when the destination path is not a directory.
	 * @throws java.io.IOException
	 * @throws net.sf.sugar.fspath.OperationNotPermittedException
	 */
	@Test
	void testCopy_DestinationPathIsNotADirectory6() throws IOException, OperationNotPermittedException {
		System.out.println("copy");
		String destinationDirPath = "test/resources/test.txt";
		FSPathResultListImpl instance = new FSPathResultListImpl();
		FSPathResultModificationList expResult = null;
		FSPathResultModificationList result = instance.copy(destinationDirPath);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of copy method, of class FSPathResultListImpl.
	 * It tests the case when the destination path is not a directory.
	 * @throws java.io.IOException
	 * @throws net.sf.sugar.fspath.OperationNotPermittedException
	 */
	@Test
	void testCopy_DestinationPathIsNotADirectory7() throws IOException, OperationNotPermittedException {
		System.out.println("copy");
		String destinationDirPath = "test/resources/test.txt";
		FSPathResultListImpl instance = new FSPathResultListImpl();
		FSPathResultModificationList expResult = null;
		FSPathResultModificationList result = instance.copy(destinationDirPath);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of copy method, of class FSPathResultListImpl.
	 * It tests the case when the destination path is not a directory.
	 * @throws java.io.IOException
	 * @throws net.sf.sugar.fspath.OperationNotPermittedException
	 */
	@Test
	void testCopy_DestinationPathIsNotADirectory8() throws IOException, OperationNotPermittedException {
		System.out.println("copy");
		String destinationDirPath = "test/resources/test.txt";
		FSPathResultListImpl instance = new FSPathResultListImpl();
		FSPathResultModificationList expResult = null;
		FSPathResultModificationList result = instance.copy(destinationDirPath);
		assertEquals(expResult, result);
	