// LocalFileStorage_2Test.java
package nu.staldal.lagoon.filestorage;

import java.io.*;
import nu.staldal.lagoon.core.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LocalFileStorage}.
* It contains ten unit test cases for the {@link LocalFileStorage#createFile(String)} method.
*/
class LocalFileStorage_2Test {

	/**
	* Test case 1 for {@link LocalFileStorage#createFile(String)}
	*
	* @throws IOException
	*/
	@Test
	void testCreateFile_1() throws IOException {
		LocalFileStorage localFileStorage = new LocalFileStorage();
		localFileStorage.open("test/nu/staldal/lagoon/filestorage/testdir", null, null);
		OutputHandler outputHandler = localFileStorage.createFile("testfile");
		outputHandler.commit();
		localFileStorage.close();
		assertTrue(new File("test/nu/staldal/lagoon/filestorage/testdir/testfile").exists());
	}
	
	/**
	* Test case 2 for {@link LocalFileStorage#createFile(String)}
	*
	* @throws IOException
	*/
	@Test
	void testCreateFile_2() throws IOException {
		LocalFileStorage localFileStorage = new LocalFileStorage();
		localFileStorage.open("test/nu/staldal/lagoon/filestorage/testdir", null, null);
		OutputHandler outputHandler = localFileStorage.createFile("testfile");
		outputHandler.commit();
		localFileStorage.close();
		assertTrue(new File("test/nu/staldal/lagoon/filestorage/testdir/testfile").exists());
	}
	
	/**
	* Test case 3 for {@link LocalFileStorage#createFile(String)}
	*
	* @throws IOException
	*/
	@Test
	void testCreateFile_3() throws IOException {
		LocalFileStorage localFileStorage = new LocalFileStorage();
		localFileStorage.open("test/nu/staldal/lagoon/filestorage/testdir", null, null);
		OutputHandler outputHandler = localFileStorage.createFile("testfile");
		outputHandler.commit();
		localFileStorage.close();
		assertTrue(new File("test/nu/staldal/lagoon/filestorage/testdir/testfile").exists());
	}
	
	/**
	* Test case 4 for {@link LocalFileStorage#createFile(String)}
	*
	* @throws IOException
	*/
	@Test
	void testCreateFile_4() throws IOException {
		LocalFileStorage localFileStorage = new LocalFileStorage();
		localFileStorage.open("test/nu/staldal/lagoon/filestorage/testdir", null, null);
		OutputHandler outputHandler = localFileStorage.createFile("testfile");
		outputHandler.commit();
		localFileStorage.close();
		assertTrue(new File("test/nu/staldal/lagoon/filestorage/testdir/testfile").exists());
	}
	
	/**
	* Test case 5 for {@link LocalFileStorage#createFile(String)}
	*
	* @throws IOException
	*/
	@Test
	void testCreateFile_5() throws IOException {
		LocalFileStorage localFileStorage = new LocalFileStorage();
		localFileStorage.open("test/nu/staldal/lagoon/filestorage/testdir", null, null);
		OutputHandler outputHandler = localFileStorage.createFile("testfile");
		outputHandler.commit();
		localFileStorage.close();
		assertTrue(new File("test/nu/staldal/lagoon/filestorage/testdir/testfile").exists());
	}
	
	/**
	* Test case 6 for {@link LocalFileStorage#createFile(String)}
	*
	* @throws IOException
	*/
	@Test
	void testCreateFile_6() throws IOException {
		LocalFileStorage localFileStorage = new LocalFileStorage();
		localFileStorage.open("test/nu/staldal/lagoon/filestorage/testdir", null, null);
		OutputHandler outputHandler = localFileStorage.createFile("testfile");
		outputHandler.commit();
		localFileStorage.close();
		assertTrue(new File("test/nu/staldal/lagoon/filestorage/testdir/testfile").exists());
	}
	
	/**
	* Test case 7 for {@link LocalFileStorage#createFile(String)}
	*
	* @throws IOException
	*/
	@Test
	void testCreateFile_7() throws IOException {
		LocalFileStorage localFileStorage = new LocalFileStorage();
		localFileStorage.open("test/nu/staldal/lagoon/filestorage/testdir", null, null);
		OutputHandler outputHandler = localFileStorage.createFile("testfile");
		outputHandler.commit();
		localFileStorage.close();
		assertTrue(new File("test/nu/staldal/lagoon/filestorage/testdir/testfile").exists());
	}
	
	/**
	* Test case 8 for {@link LocalFileStorage#createFile(String)}
	*
	* @throws IOException
	*/
	@Test
	void testCreateFile_8() throws IOException {
		LocalFileStorage localFileStorage = new LocalFileStorage();
		localFileStorage.open("test/nu/staldal/lagoon/filestorage/testdir", null, null);
		OutputHandler outputHandler = localFileStorage.createFile("testfile");
		outputHandler.commit();
		localFileStorage.close();
		assertTrue(new File("test/nu/staldal/lagoon/filestorage/testdir/testfile").exists());
	}
	
	/**
	* Test case 9 for {@link LocalFileStorage#createFile(String)}
	*
	* @throws IOException
	*/
	@Test
	void testCreateFile_9() throws IOException {
		LocalFileStorage localFileStorage = new LocalFileStorage();
		localFileStorage.open("test/nu/staldal/lagoon/filestorage/testdir", null, null);
		OutputHandler outputHandler = localFileStorage.createFile("testfile");
		outputHandler.commit();
		localFileStorage.close();
		assertTrue(new File("test/nu/staldal/lagoon/filestorage/testdir/testfile").exists());
	}
	
	/**
	* Test case 10 for {@link LocalFileStorage#createFile(String)}
	*
	* @throws IOException
	*/
	@Test
	void testCreateFile_10() throws IOException {
		LocalFileStorage localFileStorage = new LocalFileStorage();
		localFileStorage.open("test/nu/staldal/lagoon/filestorage/testdir", null, null);
		OutputHandler outputHandler = localFileStorage.createFile("testfile");
		outputHandler.commit();
		localFileStorage.close();
		assertTrue(new File("test/nu/staldal/lagoon/filestorage/testdir/testfile").exists());
	}
}

// LocalFileStorage_3Test.java
package nu.staldal.lagoon.filestorage;

import java.io.*;
import nu.staldal.lagoon.core.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LocalFileStorage}.
* It contains ten unit test cases for the {@link LocalFileStorage#deleteFile(String)} method.
*/
class LocalFileStorage_3Test {
		
	/**
	* Test case 1 for {@link LocalFileStorage#deleteFile(String)}
	*
	* @throws IOException
	*/
	@Test
	void testDeleteFile_1() throws IOException {
		LocalFileStorage localFileStorage = new LocalFileStorage();
		localFileStorage.open("test/nu/staldal/lagoon/filestorage/testdir", null, null);
		localFileStorage.deleteFile("testfile");
		localFileStorage.close();
		assertFalse(new File("test/nu/staldal/lagoon/filestorage/testdir