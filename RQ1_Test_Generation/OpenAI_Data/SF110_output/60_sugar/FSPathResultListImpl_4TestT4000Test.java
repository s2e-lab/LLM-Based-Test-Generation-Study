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
		 * It tests the case when the destination path is not a directory.
		 * It expects an OperationNotPermittedException.
		 */
		@Test
		public void testMove_DestinationPathIsNotADirectory2() throws Exception {
				System.out.println("move");
				String destinationPath = "test/resources/test.txt/";
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
				String destinationPath = "test/resources/test.txt/test.txt";
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
		public void testMove_DestinationPathIsNotADirectory4() throws Exception {
				System.out.println("move");
				String destinationPath = "test/resources/test.txt/test.txt/";
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
		public void testMove_DestinationPathIsNotADirectory5() throws Exception {
				System.out.println("move");
				String destinationPath = "test/resources/test.txt/test.txt/test.txt";
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
		public void testMove_DestinationPathIsNotADirectory6() throws Exception {
				System.out.println("move");
				String destinationPath = "test/resources/test.txt/test.txt/test.txt/";
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
		public void testMove_DestinationPathIsNotADirectory7() throws Exception {
				System.out.println("move");
				String destinationPath = "test/resources/test.txt/test.txt/test.txt/test.txt";
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
		public void testMove_DestinationPathIsNotADirectory8() throws Exception {
				System.out.println("move");
				String destinationPath = "test/resources/test.txt/test.txt/test.txt/test.txt/";
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
		public void testMove_DestinationPathIsNotADirectory9() throws Exception {
				System.out.println("move");
				String destinationPath = "test/resources/test.txt/test.txt/test.txt/test.txt/test.txt";
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
		public void testMove_DestinationPathIsNotADirectory10() throws Exception {
				System.out.println("move");
				String destinationPath = "test/resources/test.txt/test.txt/test.txt/test.txt/test.txt/";
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
 * This file is part of FSPath.
 *
 * FSPath is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * FSPath is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with FSPath.  If not, see <http://www.gnu.org/licenses/>.
 */
/*
 * FSPathResultModificationListImpl.java
 *
 * Created on 08 April 2008, 18:00
 *
 */
package net.sf.sugar.fspath;

import java.util.ArrayList;

/**
 * @author kbishop
 * @version $Id$
 */
public class FSPathResultModificationListImpl extends ArrayList<FSPathResult> implements FSPathResultModificationList {

    /**
     * Creates a new instance of FSPathResultModificationListImpl
     */
    public FSPathResultModificationListImpl() {
    }

    /**
     *  A convenience method for defining custom filesystem interaction
     *  across the whole list of results.
     *
     *  This method loops through the results and calls the call(Result result)
     *  method of the Callback class passed to it for each individual result.
     *
     *  @param Callback - a custom implementation of the Callback interface.
     *  @throws IOException
     */
    public FSPathResultModificationList each(Callback callback) throws IOException {
        for (FSPathResult result : this) {
            callback.call(result);
        }
        return this;
    }

    /**
     *  Deletes each file contained in this FSPathResultList.
     *  <br/>
     *  <pre>
     *  ************************************************************************
     *  *               IMPORTANT !!!!!    Use with caution                    *
     *  *   This method makes it extremely easy to trash your filesystem       *
     *  *   Its advised that FSPath queries are tested thouroughly before use  *
     *  *   in order to verify which files would be deleted                    *
     *  *                                                                      *
     *  ************************************************************************
     *  </pre>
     *  @returns FSPathResultModificationListImpl - all successfully deleted files<br/>
     *  will be added as a success, and the failures will be added as failures.
     *
     *  @throws IOException - NOTE this method does not currently thrown an IOException
     *  @throws OperationNotPermittedException - this exception will be thrown if<br/>
     *  The FSPathResult objects contained in this FSPathResultList don't contain<br/>
     *  java.io.File objects<br/>
     *  (i.e the FSPath query was written to return Boolean, String nor numerical results).
     */
    public FSPathResultModificationList delete() throws IOException, OperationNotPermittedException {
        if (!isListOfFiles()) {
            throw new OperationNotPermittedException("Delete is only permitted on FSPathResult objects containing a File object");
        }
        FSPathResultModificationList deletionList = new FSPathResultModificationListImpl();
        for (FSPathResult result : this) {
            try {
                File file = result.getFile();
                boolean success = file.delete();
                if (success) {
                    deletionList.addSuccess(result);
                } else {
                    deletionList.addFailure(result);
                }
            } catch (Exception e) {
                //todo: log this ?
                deletionList.addFailure(result);
            }
        }
        return deletionList;
    }

    /**
     *  This method will copy each file contained in this FSPathResultList to the
     *  destination path supplied.
     *
     *  @param String - the destination path which you would like to copy files to.
     *
     *  @returns FSPathResultModificationListImpl - all successfully copied files
     *  will be added as a success, and the failures will be added as failures.
     *
     *  @param String the absolute or realtive path of the destination Directory
     *  @throws IOException - NOTE this is currently not thrown by this method.
     *  @throws OperationNotPermittedException - this exception is thrown upon
     *  the following conditions :<br/>
     *  <br/>
     *  1)  The FSPathResult objects contained in this FSPathResultList don't contain<br/>
     *      java.io.File objects<br/>
     *      (i.e the FSPath query was written to return Boolean, String nor numerical results).<br/>
     *  2)  The directory denoted by the destination path doesn't exist.<br/>
     *  3)  The destination path doesn't resolve to a directory.<br/>
     *  4)  The destination path isn't writeable.<br/>
     *  5)  The current java process doesn't have sufficient priveledges to<br/>
     *      access the destination path.<br/>
     */
    public FSPathResultModificationList copy(String destinationDirPath) throws IOException, OperationNotPermittedException {
        if (!isListOfFiles()) {
            throw new OperationNotPermittedException("Copy is only permitted on FSPathResult objects containing a java.io.File object");
        }
        File destinationDir = new File(destinationDirPath);
        try {
            if (!destinationDir.exists()) {
                throw new OperationNotPermittedException("Unable to copy to a directory that doesn't exist");
            }
            if (!destinationDir.isDirectory()) {
                throw new OperationNotPermittedException("Destination path " + destinationDir.getAbsolutePath() + " does not resolve to a directory");
            }
            if (!destinationDir.canWrite()) {
                throw new OperationNotPermittedException("Desination path " + destinationDir.getAbsolutePath() + " is not writable");
            }
        } catch (SecurityException se) {
            throw new OperationNotPermittedException("The current process does not have sufficent priveledges to access " + destinationDir.getAbsolutePath(), se);
        }
        FSPathResultModificationList results = new FSPathResultModificationListImpl();
        for (FSPathResult result : this) {
            File destinationFile = new File(destinationDir + result.getFile().getName());
            try {
                FileReader inputReader = new FileReader(result.getFile());
                FileWriter outputReader = new FileWriter(destinationFile);
                int charsRead = 0;
                while ((charsRead = inputReader.read()) != -1) {
                    outputReader.write(charsRead);
                }
                inputReader.close();
                outputReader.close();
                results.addSuccess(new FSPathResult