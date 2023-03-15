// FSPathResultListImpl_4Test.java
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
* It contains ten unit test cases for the {@link FSPathResultListImpl#move(String)} method.
*/
class FSPathResultListImpl_4Test {

		/**
		 * Test of move method, of class FSPathResultListImpl.
		 * It tests the case when the destination path is null.
		 * It expects an IllegalArgumentException.
		 */
		@Test
		public void testMove_DestinationPathIsNull() throws Exception {
				System.out.println("move");
				String destinationPath = null;
				FSPathResultListImpl instance = new FSPathResultListImpl();
				assertThrows(IllegalArgumentException.class, () -> {
						instance.move(destinationPath);
				});
		}
		
		/**
		 * Test of move method, of class FSPathResultListImpl.
		 * It tests the case when the destination path is empty.
		 * It expects an IllegalArgumentException.
		 */
		@Test
		public void testMove_DestinationPathIsEmpty() throws Exception {
				System.out.println("move");
				String destinationPath = "";
				FSPathResultListImpl instance = new FSPathResultListImpl();
				assertThrows(IllegalArgumentException.class, () -> {
						instance.move(destinationPath);
				});
		}
		
		/**
		 * Test of move method, of class FSPathResultListImpl.
		 * It tests the case when the destination path is not a directory.
		 * It expects an OperationNotPermittedException.
		 */
		@Test
		public void testMove_DestinationPathIsNotADirectory() throws Exception {
				System.out.println("move");
				String destinationPath = "test/resources/test.txt";
				FSPathResultListImpl instance = new FSPathResultListImpl();
				assertThrows(OperationNotPermittedException.class, () -> {
						instance.move(destinationPath);
				});
		}
		
		/**
		 * Test of move method, of class FSPathResultListImpl.
		 * It tests the case when the destination path is not writable.
		 * It expects an OperationNotPermittedException.
		 */
		@Test
		public void testMove_DestinationPathIsNotWritable() throws Exception {
				System.out.println("move");
				String destinationPath = "test/resources/test";
				FSPathResultListImpl instance = new FSPathResultListImpl();
				assertThrows(OperationNotPermittedException.class, () -> {
						instance.move(destinationPath);
				});
		}
		
		/**
		 * Test of move method, of class FSPathResultListImpl.
		 * It tests the case when the destination path is not accessible.
		 * It expects an OperationNotPermittedException.
		 */
		@Test
		public void testMove_DestinationPathIsNotAccessible() throws Exception {
				System.out.println("move");
				String destinationPath = "test/resources/test";
				FSPathResultListImpl instance = new FSPathResultListImpl();
				assertThrows(OperationNotPermittedException.class, () -> {
						instance.move(destinationPath);
				});
		}
		
		/**
		 * Test of move method, of class FSPathResultListImpl.
		 * It tests the case when the destination path is not a directory.
		 * It expects an OperationNotPermittedException.
		 */
		@Test
		public void testMove_DestinationPathIsNotADirectory2() throws Exception {
				System.out.println("move");
				String destinationPath = "test/resources/test.txt";
				FSPathResultListImpl instance = new FSPathResultListImpl();
				assertThrows(OperationNotPermittedException.class, () -> {
						instance.move(destinationPath);
				});
		}
		
		/**
		 * Test of move method, of class FSPathResultListImpl.
		 * It tests the case when the destination path is not writable.
		 * It expects an OperationNotPermittedException.
		 */
		@Test
		public void testMove_DestinationPathIsNotWritable2() throws Exception {
				System.out.println("move");
				String destinationPath = "test/resources/test";
				FSPathResultListImpl instance = new FSPathResultListImpl();
				assertThrows(OperationNotPermittedException.class, () -> {
						instance.move(destinationPath);
				});
		}
		
		/**
		 * Test of move method, of class FSPathResultListImpl.
		 * It tests the case when the destination path is not accessible.
		 * It expects an OperationNotPermittedException.
		 */
		@Test
		public void testMove_DestinationPathIsNotAccessible2() throws Exception {
				System.out.println("move");
				String destinationPath = "test/resources/test";
				FSPathResultListImpl instance = new FSPathResultListImpl();
				assertThrows(OperationNotPermittedException.class, () -> {
						instance.move(destinationPath);
				});
		}
		
		/**
		 * Test of move method, of class FSPathResultListImpl.
		 * It tests the case when the destination path is not a directory.
		 * It expects an OperationNotPermittedException.
		 */
		@Test
		public void testMove_DestinationPathIsNotADirectory3() throws Exception {
				System.out.println("move");
				String destinationPath = "test/resources/test.txt";
				FSPathResultListImpl instance = new FSPathResultListImpl();
				assertThrows(OperationNotPermittedException.class, () -> {
						instance.move(destinationPath);
				});
		}
		
		/**
		 * Test of move method, of class FSPathResultListImpl.
		 * It tests the case when the destination path is not writable.
		 * It expects an OperationNotPermittedException.
		 */
		@Test
		public void testMove_DestinationPathIsNotWritable3() throws Exception {
				System.out.println("move");
				String destinationPath = "test/resources/test";
				FSPathResultListImpl instance = new FSPathResultListImpl();
				assertThrows(OperationNotPermittedException.class, () -> {
						instance.move(destinationPath);
				});
		}
		
		/**
		 * Test of move method, of class FSPathResultListImpl.
		 * It tests the case when the destination path is not accessible.
		 * It expects an OperationNotPermittedException.
		 */
		@Test
		public void testMove_DestinationPathIsNotAccessible3() throws Exception {
				System.out.println("move");
				String destinationPath = "test/resources/test";
				FSPathResultListImpl instance = new FSPathResultListImpl();
				assertThrows(OperationNotPermittedException.class, () -> {
						instance.move(destinationPath);
				});
		}
		
}

// FSPathResultModificationListImpl.java
/**
 * Copyright 2008 (C) Keith Bishop (bishi@users.sourceforge.net)
 *
 * All rights reserved.
 *
 * This