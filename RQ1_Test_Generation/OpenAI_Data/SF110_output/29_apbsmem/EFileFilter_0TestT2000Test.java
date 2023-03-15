// EFileFilter_0Test.java
/*
 * ===========================================================================
 (C) Copyright Sun Microsystems Inc, 1992, 2004. All rights reserved.
 * ===========================================================================
 */
package apbs_mem_gui;

import java.io.File;
import java.util.Hashtable;
import java.util.Enumeration;
import javax.swing.*;
import javax.swing.filechooser.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EFileFilter}.
* It contains ten unit test cases for the {@link EFileFilter#accept(File)} method.
*/
class EFileFilter_0Test {

	/**
	 * Test case for {@link EFileFilter#accept(File)}.
	 * It tests the case that the given file is null.
	 */
	@Test
	void testAccept_0() {
		EFileFilter eFileFilter = new EFileFilter();
		File file = null;
		assertFalse(eFileFilter.accept(file));
	}
	
	/**
	 * Test case for {@link EFileFilter#accept(File)}.
	 * It tests the case that the given file is a directory.
	 */
	@Test
	void testAccept_1() {
		EFileFilter eFileFilter = new EFileFilter();
		File file = new File(".");
		assertTrue(eFileFilter.accept(file));
	}
	
	/**
	 * Test case for {@link EFileFilter#accept(File)}.
	 * It tests the case that the given file is not a directory and its extension is null.
	 */
	@Test
	void testAccept_2() {
		EFileFilter eFileFilter = new EFileFilter();
		File file = new File("test.txt");
		assertFalse(eFileFilter.accept(file));
	}
	
	/**
	 * Test case for {@link EFileFilter#accept(File)}.
	 * It tests the case that the given file is not a directory and its extension is not null.
	 */
	@Test
	void testAccept_3() {
		EFileFilter eFileFilter = new EFileFilter();
		File file = new File("test.txt");
		assertFalse(eFileFilter.accept(file));
	}
	
	/**
	 * Test case for {@link EFileFilter#accept(File)}.
	 * It tests the case that the given file is not a directory and its extension is not null.
	 */
	@Test
	void testAccept_4() {
		EFileFilter eFileFilter = new EFileFilter();
		File file = new File("test.txt");
		assertFalse(eFileFilter.accept(file));
	}
	
	/**
	 * Test case for {@link EFileFilter#accept(File)}.
	 * It tests the case that the given file is not a directory and its extension is not null.
	 */
	@Test
	void testAccept_5() {
		EFileFilter eFileFilter = new EFileFilter();
		File file = new File("test.txt");
		assertFalse(eFileFilter.accept(file));
	}
	
	/**
	 * Test case for {@link EFileFilter#accept(File)}.
	 * It tests the case that the given file is not a directory and its extension is not null.
	 */
	@Test
	void testAccept_6() {
		EFileFilter eFileFilter = new EFileFilter();
		File file = new File("test.txt");
		assertFalse(eFileFilter.accept(file));
	}
	
	/**
	 * Test case for {@link EFileFilter#accept(File)}.
	 * It tests the case that the given file is not a directory and its extension is not null.
	 */
	@Test
	void testAccept_7() {
		EFileFilter eFileFilter = new EFileFilter();
		File file = new File("test.txt");
		assertFalse(eFileFilter.accept(file));
	}
	
	/**
	 * Test case for {@link EFileFilter#accept(File)}.
	 * It tests the case that the given file is not a directory and its extension is not null.
	 */
	@Test
	void testAccept_8() {
		EFileFilter eFileFilter = new EFileFilter();
		File file = new File("test.txt");
		assertFalse(eFileFilter.accept(file));
	}
	
	/**
	 * Test case for {@link EFileFilter#accept(File)}.
	 * It tests the case that the given file is not a directory and its extension is not null.
	 */
	@Test
	void testAccept_9() {
		EFileFilter eFileFilter = new EFileFilter();
		File file = new File("test.txt");
		assertFalse(eFileFilter.accept(file));
	}
	
}

// EFileFilter_1Test.java
/*
 * ===========================================================================
 (C) Copyright Sun Microsystems Inc, 1992, 2004. All rights reserved.
 * ===========================================================================
 */
package apbs_mem_gui;

import java.io.File;
import java.util.Hashtable;
import java.util.Enumeration;
import javax.swing.*;
import javax.swing.filechooser.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EFileFilter}.
* It contains ten unit test cases for the {@link EFileFilter#getExtension(File)} method.
*/
class EFileFilter_1Test {
		
	/**
	 * Test case for {@link EFileFilter#getExtension(File)}.
	 * It tests the case that the given file is null.
	 */
	@Test
	void testGetExtension_0() {
		EFileFilter eFileFilter = new EFileFilter();
		File file = null;
		assertNull(eFileFilter.getExtension(file));
	}
	
	/**
	 * Test case for {@link EFileFilter#getExtension(File)}.
	 * It tests the case that the given file is not null and its extension is null.
	 */
	@Test
	void testGetExtension_1() {
		EFileFilter eFileFilter = new EFileFilter();
		File file = new File("test.txt");
		assertNull(eFileFilter.getExtension(file));
	}
	
	/**
	 * Test case for {@link EFileFilter#getExtension(File)}.
	 * It tests the case that the given file is not null and its extension is not null.
	 */
	@Test
	void testGetExtension_2() {
		EFileFilter eFileFilter = new EFileFilter();
		File file = new File("test.txt");
		assertNull(eFileFilter.getExtension(file));
	}
	
	/**
	 * Test case for {@link EFileFilter#getExtension(File)}.
	 * It tests the case that the given file is not null and its extension is not null.
	 */
	@Test
	void testGetExtension_3() {
		EFileFilter eFileFilter = new EFileFilter();
		File file = new File("test.txt");
		assertNull(eFileFilter.getExtension(file));
	}
	
	/**
	 * Test case for {@link EFileFilter#getExtension(File)}.
	 * It tests the case that the given file is not null and its extension is not null.
	 */
	@Test
	void testGetExtension_4() {
		EFileFilter eFileFilter = new EFileFilter();
		File file = new File("test.txt");
		assertNull(eFileFilter.getExtension(file));
	}
	
	/**
	 * Test case for {@link EFileFilter#getExtension(File)}.
	 * It tests the case that the given file is not null and its extension is not null.
	 */
	@Test
	void testGetExtension_5() {
		EFileFilter eFileFilter = new EFileFilter();
		File file = new File("test.txt");
		assertNull(eFileFilter.getExtension(file));
	}
	
	/**
	 * Test case for {@link EFileFilter#getExtension(File)}.
	 * It tests the case that the given file is not null and its extension is not null.
	 */
	@Test
	void testGetExtension_6() {
		EFileFilter eFileFilter = new EFileFilter();
		File file = new File("test.txt");
		assertNull(eFileFilter.getExtension(file));
	}
	
	/**
	 * Test case