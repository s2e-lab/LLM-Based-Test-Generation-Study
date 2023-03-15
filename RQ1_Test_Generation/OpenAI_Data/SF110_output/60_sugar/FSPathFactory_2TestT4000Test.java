// FSPathFactory_2Test.java
/*
 * FSPathFactory.java
 *
 * Created on 06 April 2008, 17:04
 *
 *
 */
package net.sf.sugar.fspath;

import java.io.File;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FSPathFactory}.
* It contains ten unit test cases for the {@link FSPathFactory#newFSPath(String)} method.
*/
class FSPathFactory_2Test {

	/**
	 * Test of newFSPath method, of class FSPathFactory.
	 */
	@Test
	void testNewFSPath_String() {
		System.out.println("newFSPath");
		String path = "";
		FSPath result = FSPathFactory.newFSPath(path);
		assertEquals(new File(System.getProperty("user.dir")), result.getFile());
	}

	/**
	 * Test of newFSPath method, of class FSPathFactory.
	 */
	@Test
	void testNewFSPath_String_2() {
		System.out.println("newFSPath");
		String path = ".";
		FSPath result = FSPathFactory.newFSPath(path);
		assertEquals(new File(System.getProperty("user.dir")), result.getFile());
	}

	/**
	 * Test of newFSPath method, of class FSPathFactory.
	 */
	@Test
	void testNewFSPath_String_3() {
		System.out.println("newFSPath");
		String path = "./";
		FSPath result = FSPathFactory.newFSPath(path);
		assertEquals(new File(System.getProperty("user.dir")), result.getFile());
	}

	/**
	 * Test of newFSPath method, of class FSPathFactory.
	 */
	@Test
	void testNewFSPath_String_4() {
		System.out.println("newFSPath");
		String path = "./.";
		FSPath result = FSPathFactory.newFSPath(path);
		assertEquals(new File(System.getProperty("user.dir")), result.getFile());
	}

	/**
	 * Test of newFSPath method, of class FSPathFactory.
	 */
	@Test
	void testNewFSPath_String_5() {
		System.out.println("newFSPath");
		String path = "./..";
		FSPath result = FSPathFactory.newFSPath(path);
		assertEquals(new File(System.getProperty("user.dir")).getParentFile(), result.getFile());
	}

	/**
	 * Test of newFSPath method, of class FSPathFactory.
	 */
	@Test
	void testNewFSPath_String_6() {
		System.out.println("newFSPath");
		String path = "./../";
		FSPath result = FSPathFactory.newFSPath(path);
		assertEquals(new File(System.getProperty("user.dir")).getParentFile(), result.getFile());
	}

	/**
	 * Test of newFSPath method, of class FSPathFactory.
	 */
	@Test
	void testNewFSPath_String_7() {
		System.out.println("newFSPath");
		String path = "./../.";
		FSPath result = FSPathFactory.newFSPath(path);
		assertEquals(new File(System.getProperty("user.dir")).getParentFile(), result.getFile());
	}

	/**
	 * Test of newFSPath method, of class FSPathFactory.
	 */
	@Test
	void testNewFSPath_String_8() {
		System.out.println("newFSPath");
		String path = "./../..";
		FSPath result = FSPathFactory.newFSPath(path);
		assertEquals(new File(System.getProperty("user.dir")).getParentFile().getParentFile(), result.getFile());
	}

	/**
	 * Test of newFSPath method, of class FSPathFactory.
	 */
	@Test
	void testNewFSPath_String_9() {
		System.out.println("newFSPath");
		String path = "./../../";
		FSPath result = FSPathFactory.newFSPath(path);
		assertEquals(new File(System.getProperty("user.dir")).getParentFile().getParentFile(), result.getFile());
	}

	/**
	 * Test of newFSPath method, of class FSPathFactory.
	 */
	@Test
	void testNewFSPath_String_10() {
		System.out.println("newFSPath");
		String path = "./../../.";
		FSPath result = FSPathFactory.newFSPath(path);
		assertEquals(new File(System.getProperty("user.dir")).getParentFile().getParentFile(), result.getFile());
	}
}

// FSPathFactory_3Test.java
/*
 * FSPathFactory.java
 *
 * Created on 06 April 2008, 17:04
 *
 *
 */
package net.sf.sugar.fspath;

import java.io.File;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FSPathFactory}.
* It contains ten unit test cases for the {@link FSPathFactory#newFSPath(File)} method.
*/
class FSPathFactory_3Test {
		
	/**
	 * Test of newFSPath method, of class FSPathFactory.
	 */
	@Test
	void testNewFSPath_File() {
		System.out.println("newFSPath");
		File file = new File("");
		FSPath result = FSPathFactory.newFSPath(file);
		assertEquals(new File(System.getProperty("user.dir")), result.getFile());
	}

	/**
	 * Test of newFSPath method, of class FSPathFactory.
	 */
	@Test
	void testNewFSPath_File_2() {
		System.out.println("newFSPath");
		File file = new File(".");
		FSPath result = FSPathFactory.newFSPath(file);
		assertEquals(new File(System.getProperty("user.dir")), result.getFile());
	}

	/**
	 * Test of newFSPath method, of class FSPathFactory.
	 */
	@Test
	void testNewFSPath_File_3() {
		System.out.println("newFSPath");
		File file = new File("./");
		FSPath result = FSPathFactory.newFSPath(file);
		assertEquals(new File(System.getProperty("user.dir")), result.getFile());
	}

	/**
	 * Test of newFSPath method, of class FSPathFactory.
	 */
	@Test
	void testNewFSPath_File_4() {
		System.out.println("newFSPath");
		File file = new File("./.");
		FSPath result = FSPathFactory.newFSPath(file);
		assertEquals(new File(System.getProperty("user.dir")), result.getFile());
	}

	/**
	 * Test of newFSPath method, of class FSPathFactory.
	 */
	@Test
	void testNewFSPath_File_5() {
		System.out.println("newFSPath");
		File file = new File("./..");
		FSPath result = FSPathFactory.newFSPath(file);
		assertEquals(new File(System.getProperty("user.dir")).getParentFile(), result.getFile());
	}

	/**
	 * Test of newFSPath method, of class FSPathFactory.
	 */
	@Test
	void testNewFSPath_File_6() {
		System.out.println("newFSPath");
		File file = new File("./../");
		FSPath result = FSPathFactory.newFSPath(file);
		assertEquals(new File(System.getProperty("user.dir")).getParentFile(), result.getFile());
	}

	/**
	 * Test of newFSPath method, of class FSPathFactory.
	 */
	@Test
	void testNewFSPath_File_7() {
		System.out.println("newFSPath");
		File file = new File("./../.");
		FSPath result = FSPathFactory.newFSPath(file);
		assertEquals(new File(System.getProperty("user.dir")).getParentFile(), result.getFile());
	}

	/**
	 * Test of newFSPath method, of class FSPathFactory.
	 */
	@Test
	void testNewFSPath_File_8() {
		System.out.println("newFSPath");
		File file = new File("./../..");
		FSPath result = FSPathFactory.newFSPath(file);
		assertEquals(new File(System.getProperty("user.dir")).getParentFile().getParentFile(), result.getFile());
	}

	/**
	 * Test of newFSPath method, of class FSPathFactory.
	 */
	@Test
	void testNewFSPath_File_9() {
		System.out.println("newFSPath");
		File file = new File("./../../");
		FSPath result = FSPathFactory.newFSPath(file);
		assertEquals(new File(System.getProperty("user.dir")).getParentFile().getParentFile(), result.getFile());
	}

	/**
	 * Test of newFSPath method, of class FSPathFactory.
	 */
	@Test
	void testNewFSPath_File_10() {
		System.out.println("newFSPath");
		File file = new File("./../../.");
		FSPath result = FSPathFactory.newFSPath(file);
		assertEquals(new File(System.getProperty("user.dir")).getParentFile().getParentFile(), result.getFile());
	}
}

// FSPathFactory_4Test.java
/*
 * FSPathFactory.java
 *
 * Created on 06 April 2008, 17:04
 *
 *
 */
package net.sf.sugar.fspath;

import java.io.File;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FSPathFactory}.
* It contains ten unit test cases for the {@link FSPathFactory#newFSPath()} method.
*/
class FSPathFactory_4Test {
		
	/**
	 * Test of newFSPath method, of class FSPathFactory.
	 */
	@Test
	void testNewFSPath() {
		System.out.println("newFSPath");
		FSPath result = FSPathFactory.newFSPath();
		assertEquals(new File(System.getProperty("user.dir")), result.getFile());
	}

	/**
	 * Test of newFSPath method, of class FSPathFactory.
	 */
	@Test
	void testNewFSPath_2() {
		System.out.println("newFSPath");
		FSPath result = FSPathFactory.newFSPath();
		assertEquals(new File(System.getProperty("user.dir")), result.getFile());
	}

	/**
	 * Test of newFSPath method, of class FSPathFactory.
	 */
	@Test
	void testNewFSPath_3() {
		System.out.println("newFSPath");
		FSPath result = FSPathFactory.newFSPath();
		assertEquals(new File(System.getProperty("user.dir")), result.getFile());
	}

	/**
	 * Test of newFSPath method, of class FSPathFactory.
	 */
	@Test
	void testNewFSPath_4() {
		System.out.println("newFSPath");
		FSPath result = FSPathFactory.newFSPath();
		assertEquals(new File(System.getProperty("user.dir")), result.getFile());
	}

	/**
	 * Test of newFSPath method, of class FSPathFactory.
	 */
	@Test
	void testNewFSPath_5() {
		System.out.println("newFSPath");
		FSPath result = FSPathFactory.newFSPath();
		assertEquals(new File(System.getProperty("user.dir")), result.getFile());
	}

	/**
	 * Test of newFSPath method, of class FSPathFactory.
	 */
	@Test
	void testNewFSPath_6() {
		System.out.println("newFSPath");
		FSPath result = FSPathFactory.newFSPath();
		assertEquals(new File(System.getProperty("user.dir")), result.getFile());
	}

	/**
	 * Test of newFSPath method, of class FSPathFactory.
	 */
	@Test
	void testNewFSPath_7() {
		System.out.println("newFSPath");
		FSPath result = FSPathFactory.newFSPath();
		assertEquals(new File(System.getProperty("user.dir")), result.getFile());
	}

	/**
	 * Test of newFSPath method, of class FSPathFactory.
	 */
	@Test
	void testNewFSPath_8() {
		System.out.println("newFSPath");
		FSPath result = FSPathFactory.newFSPath();
		assertEquals(new File(System.getProperty("user.dir")), result.getFile());
	}

	/**
	 * Test of newFSPath method, of class FSPathFactory.
	 */
	@Test
	void testNewFSPath_9() {
		System.out.println("newFSPath");
		FSPath result = FSPathFactory.newFSPath();
		assertEquals(new File(System.getProperty("user.dir")), result.getFile());
	}

	/**
	 * Test of newFSPath method, of class FSPathFactory.
	 */
	@Test
	void testNewFSPath_10() {
		System.out.println("newFSPath");
		FSPath result = FSPathFactory.newFSPath();
		assertEquals(new File(System.getProperty("user.dir")), result.getFile());
	}
}

// FSPathFactoryTest.java
/*
 * FSPathFactory.java
 *
 * Created on 06 April 2008, 17:04
 *
 *
 */
package net.sf.sugar.fspath;

import java.io.File;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FSPathFactory}.
* It contains ten unit test cases for the {@link FSPathFactory#newFSPath(String)} method.
*/
class FSPathFactoryTest {
		
	/**
	 * Test of newFSPath method, of class FSPathFactory.
	 */
	@Test
	void testNewFSPath_String() {
		System.out.println("newFSPath");
		String path = "";
		FSPath result = FSPathFactory.newFSPath(path);
		assertEquals(new File(System.getProperty("user.dir")), result.getFile());
	}

	/**
	 * Test of newFSPath method, of class FSPathFactory.
	 */
	@Test
	void testNewFSPath_String_2() {
		System.out.println("newFSP