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
	void testCopy_NullDestinationPath() throws IOException, OperationNotPermittedException {
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
	void testCopy_EmptyDestinationPath() throws IOException, OperationNotPermittedException {
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
	void testCopy_DestinationPathNotDirectory() throws IOException, OperationNotPermittedException {
		System.out.println("copy");
		String destinationDirPath = "C:\\Users\\User\\Desktop\\test.txt";
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
	void testCopy_DestinationPathNotDirectory2() throws IOException, OperationNotPermittedException {
		System.out.println("copy");
		String destinationDirPath = "C:\\Users\\User\\Desktop\\test.txt";
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
	void testCopy_DestinationPathNotDirectory3() throws IOException, OperationNotPermittedException {
		System.out.println("copy");
		String destinationDirPath = "C:\\Users\\User\\Desktop\\test.txt";
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
	void testCopy_DestinationPathNotDirectory4() throws IOException, OperationNotPermittedException {
		System.out.println("copy");
		String destinationDirPath = "C:\\Users\\User\\Desktop\\test.txt";
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
	void testCopy_DestinationPathNotDirectory5() throws IOException, OperationNotPermittedException {
		System.out.println("copy");
		String destinationDirPath = "C:\\Users\\User\\Desktop\\test.txt";
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
	void testCopy_DestinationPathNotDirectory6() throws IOException, OperationNotPermittedException {
		System.out.println("copy");
		String destinationDirPath = "C:\\Users\\User\\Desktop\\test.txt";
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
	void testCopy_DestinationPathNotDirectory7() throws IOException, OperationNotPermittedException {
		System.out.println("copy");
		String destinationDirPath = "C:\\Users\\User\\Desktop\\test.txt";
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
	void testCopy_DestinationPathNotDirectory8() throws IOException, OperationNotPermittedException {
		System.out.println("copy");
		String destinationDirPath = "C:\\Users\\User\\Desktop\\test.txt";
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
	void testCopy_DestinationPathNotDirectory9() throws IOException, OperationNotPermittedException {
		System.out.println("copy");
		String destinationDirPath = "C:\\Users\\User\\Desktop\\test.txt";
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
	void testCopy_DestinationPathNotDirectory10() throws IOException, OperationNotPermittedException {
		System.out.println("copy");
		String destinationDirPath = "C:\\Users\\User\\Desktop\\test.txt";
		FSPathResultListImpl instance = new FSPathResultListImpl();
		FSPathResultModificationList expResult = null;
		FSPathResultModificationList result = instance.copy(destinationDirPath);
		assertEquals(expResult, result);
	}
}

// FSPathResultListImpl_3Test.java
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
class FSPathResultListImpl_3Test {
		
	/**
	 * Test of copy method, of class FSPathResultListImpl.
	 * It tests the case when the destination path is null.
	 * @throws java.io.IOException
	 * @throws net.sf.sugar.fspath.OperationNotPermittedException
	 */
	@Test
	void testCopy_NullDestinationPath() throws IOException, OperationNotPermittedException {
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
	void testCopy_EmptyDestinationPath() throws IOException, OperationNotPermittedException {
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
	void testCopy_DestinationPathNotDirectory() throws IOException, OperationNotPermittedException {
		System.out.println("copy");
		String destinationDirPath = "C:\\Users\\User\\Desktop\\test.txt";
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
	void testCopy_DestinationPathNotDirectory2() throws IOException, OperationNotPermittedException {
		System.out.println("copy");
		String destinationDirPath = "C:\\Users\\User\\Desktop\\test.txt";
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
	void testCopy_DestinationPathNotDirectory3() throws IOException, OperationNotPermittedException {
		System.out.println("copy");
		String destinationDirPath = "C:\\Users\\User\\Desktop\\test.txt";
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
	void testCopy_DestinationPathNotDirectory4() throws IOException, OperationNotPermittedException {
		System.out.println("copy");
		String destinationDirPath = "C:\\Users\\User\\Desktop\\test.txt";
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
	void testCopy_DestinationPathNotDirectory5() throws IOException, OperationNotPermittedException {
		System.out.println("copy");
		String destinationDirPath = "C:\\Users\\User\\Desktop\\test.txt";
		FSPathResultListImpl instance = new FSPathResultListImpl();
		FSPathResult