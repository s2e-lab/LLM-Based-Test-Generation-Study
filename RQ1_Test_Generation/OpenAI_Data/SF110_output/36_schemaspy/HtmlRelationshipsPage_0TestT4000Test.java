// HtmlRelationshipsPage_0Test.java
package net.sourceforge.schemaspy.view;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sourceforge.schemaspy.model.Database;
import net.sourceforge.schemaspy.model.TableColumn;
import net.sourceforge.schemaspy.util.Dot;
import net.sourceforge.schemaspy.util.LineWriter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HtmlRelationshipsPage}.
* It contains ten unit test cases for the {@link HtmlRelationshipsPage#getInstance()} method.
*/
class HtmlRelationshipsPage_0Test {

	/**
	* Test case for {@link HtmlRelationshipsPage#getInstance()} method.
	* Test data: {@link HtmlRelationshipsPage#getInstance()} method.
	* Expected result: {@link HtmlRelationshipsPage#getInstance()} method returns an instance of {@link HtmlRelationshipsPage}.
	*/
	@Test
	void testGetInstance() {
		HtmlRelationshipsPage result = HtmlRelationshipsPage.getInstance();
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link HtmlRelationshipsPage#write(Database, File, String, boolean, boolean, Set, LineWriter)} method.
	* Test data: {@link HtmlRelationshipsPage#write(Database, File, String, boolean, boolean, Set, LineWriter)} method.
	* Expected result: {@link HtmlRelationshipsPage#write(Database, File, String, boolean, boolean, Set, LineWriter)} method returns true.
	*/
	@Test
	void testWrite() {
		Database db = null;
		File diagramDir = null;
		String dotBaseFilespec = null;
		boolean hasRealRelationships = false;
		boolean hasImpliedRelationships = false;
		Set<TableColumn> excludedColumns = null;
		LineWriter html = null;
		HtmlRelationshipsPage instance = HtmlRelationshipsPage.getInstance();
		boolean result = false;
		try {
			result = instance.write(db, diagramDir, dotBaseFilespec, hasRealRelationships, hasImpliedRelationships, excludedColumns, html);
		} catch (IOException e) {
			Logger.getLogger(HtmlRelationshipsPage_0Test.class.getName()).log(Level.SEVERE, null, e);
		}
		assertTrue(result);
	}
	
	/**
	* Test case for {@link HtmlRelationshipsPage#writeHeader(Database, String, boolean, boolean, LineWriter)} method.
	* Test data: {@link HtmlRelationshipsPage#writeHeader(Database, String, boolean, boolean, LineWriter)} method.
	* Expected result: {@link HtmlRelationshipsPage#writeHeader(Database, String, boolean, boolean, LineWriter)} method returns true.
	*/
	@Test
	void testWriteHeader() {
		Database db = null;
		String title = null;
		boolean hasRealRelationships = false;
		boolean hasImpliedRelationships = false;
		LineWriter html = null;
		HtmlRelationshipsPage instance = HtmlRelationshipsPage.getInstance();
		boolean result = false;
		try {
			result = instance.writeHeader(db, title, hasRealRelationships, hasImpliedRelationships, html);
		} catch (IOException e) {
			Logger.getLogger(HtmlRelationshipsPage_0Test.class.getName()).log(Level.SEVERE, null, e);
		}
		assertTrue(result);
	}
	
	/**
	* Test case for {@link HtmlRelationshipsPage#isRelationshipsPage()} method.
	* Test data: {@link HtmlRelationshipsPage#isRelationshipsPage()} method.
	* Expected result: {@link HtmlRelationshipsPage#isRelationshipsPage()} method returns true.
	*/
	@Test
	void testIsRelationshipsPage() {
		HtmlRelationshipsPage instance = HtmlRelationshipsPage.getInstance();
		boolean result = instance.isRelationshipsPage();
		assertTrue(result);
	}
	
}

// HtmlRelationshipsPage_1Test.java
package net.sourceforge.schemaspy.view;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sourceforge.schemaspy.model.Database;
import net.sourceforge.schemaspy.model.TableColumn;
import net.sourceforge.schemaspy.util.Dot;
import net.sourceforge.schemaspy.util.LineWriter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HtmlRelationshipsPage}.
* It contains ten unit test cases for the {@link HtmlRelationshipsPage#getInstance()} method.
*/
class HtmlRelationshipsPage_1Test {
		
	/**
	* Test case for {@link HtmlRelationshipsPage#getInstance()} method.
	* Test data: {@link HtmlRelationshipsPage#getInstance()} method.
	* Expected result: {@link HtmlRelationshipsPage#getInstance()} method returns an instance of {@link HtmlRelationshipsPage}.
	*/
	@Test
	void testGetInstance() {
		HtmlRelationshipsPage result = HtmlRelationshipsPage.getInstance();
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link HtmlRelationshipsPage#write(Database, File, String, boolean, boolean, Set, LineWriter)} method.
	* Test data: {@link HtmlRelationshipsPage#write(Database, File, String, boolean, boolean, Set, LineWriter)} method.
	* Expected result: {@link HtmlRelationshipsPage#write(Database, File, String, boolean, boolean, Set, LineWriter)} method returns true.
	*/
	@Test
	void testWrite() {
		Database db = null;
		File diagramDir = null;
		String dotBaseFilespec = null;
		boolean hasRealRelationships = false;
		boolean hasImpliedRelationships = false;
		Set<TableColumn> excludedColumns = null;
		LineWriter html = null;
		HtmlRelationshipsPage instance = HtmlRelationshipsPage.getInstance();
		boolean result = false;
		try {
			result = instance.write(db, diagramDir, dotBaseFilespec, hasRealRelationships, hasImpliedRelationships, excludedColumns, html);
		} catch (IOException e) {
			Logger.getLogger(HtmlRelationshipsPage_1Test.class.getName()).log(Level.SEVERE, null, e);
		}
		assertTrue(result);
	}
	
	/**
	* Test case for {@link HtmlRelationshipsPage#writeHeader(Database, String, boolean, boolean, LineWriter)} method.
	* Test data: {@link HtmlRelationshipsPage#writeHeader(Database, String, boolean, boolean, LineWriter)} method.
	* Expected result: {@link HtmlRelationshipsPage#writeHeader(Database, String, boolean, boolean, LineWriter)} method returns true.
	*/
	@Test
	void testWriteHeader() {
		Database db = null;
		String title = null;
		boolean hasRealRelationships = false;
		boolean hasImpliedRelationships = false;
		LineWriter html = null;
		HtmlRelationshipsPage instance = HtmlRelationshipsPage.getInstance();
		boolean result = false;
		try {
			result = instance.writeHeader(db, title, hasRealRelationships, hasImpliedRelationships, html);
		} catch (IOException e) {
			Logger.getLogger(HtmlRelationshipsPage_1Test.class.getName()).log(Level.SEVERE, null, e);
		}
		assertTrue(result);
	}
	
	/**
	* Test case for {@link HtmlRelationshipsPage#isRelationshipsPage()} method.
	* Test data: {@link HtmlRelationshipsPage#isRelationshipsPage()} method.
	* Expected result: {@link HtmlRelationshipsPage#isRelationshipsPage()} method returns true.
	*/
	@Test
	void testIsRelationshipsPage() {
		HtmlRelationshipsPage instance = HtmlRelationshipsPage.getInstance();
		boolean result = instance.isRelationshipsPage();
		assertTrue(result);
	}
	
}

// HtmlRelationshipsPage_2Test.java
package net.sourceforge.schemaspy.view;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sourceforge.schemaspy.model.Database;
import net.sourceforge.schemaspy.model.TableColumn;
import net.sourceforge.schemaspy.util.Dot;
import net.sourceforge.schemaspy.util.LineWriter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HtmlRelationshipsPage}.
* It contains ten unit test cases for the {@link HtmlRelationshipsPage#getInstance()} method.
*/
class HtmlRelationshipsPage_2Test {
		
	/**
	* Test case for {@link HtmlRelationshipsPage#getInstance()} method.
	* Test data: {@link HtmlRelationshipsPage#getInstance()} method.
	* Expected result: {@link HtmlRelationshipsPage#getInstance()} method returns an instance of {@link HtmlRelationshipsPage}.
	*/
	@Test
	void testGetInstance() {
		HtmlRelationshipsPage result = HtmlRelationshipsPage.getInstance();
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link HtmlRelationshipsPage#write(Database, File, String, boolean, boolean, Set, LineWriter)} method.
	* Test data: {@link HtmlRelationshipsPage#write(Database, File, String, boolean, boolean, Set, LineWriter)} method.
	* Expected result: {@link HtmlRelationshipsPage#write(Database, File, String, boolean, boolean, Set, LineWriter)} method returns true.
	*/
	@Test
	void testWrite() {
		Database db = null;
		File diagramDir = null;
		String dotBaseFilespec = null;
		boolean hasRealRelationships = false;
		boolean hasImpliedRelationships = false;
		Set<TableColumn> excludedColumns = null;
		LineWriter html = null;
		HtmlRelationshipsPage instance = HtmlRelationshipsPage.getInstance();
		boolean result = false;
		try {
			result = instance.write(db, diagramDir, dotBaseFilespec, hasRealRelationships, hasImpliedRelationships, excludedColumns, html);
		} catch (IOException e) {
			Logger.getLogger(HtmlRelationshipsPage_2Test.class.getName()).log(Level.SEVERE, null, e);
		}
		assertTrue(result);
	}
	
	/**
	* Test case for {@link HtmlRelationshipsPage#writeHeader(Database, String, boolean, boolean, LineWriter)} method.
	* Test data: {@link HtmlRelationshipsPage#writeHeader(Database, String, boolean, boolean, LineWriter)} method.
	* Expected result: {@link HtmlRelationshipsPage#writeHeader(Database, String, boolean, boolean, LineWriter)} method returns true.
	*/
	@Test
	void testWriteHeader() {
		Database db = null;
		String title = null;
		boolean hasRealRelationships = false;
		boolean hasImpliedRelationships = false;
		LineWriter html = null;
		HtmlRelationshipsPage instance = HtmlRelationshipsPage.getInstance();
		boolean result = false;
		try {
			result = instance.writeHeader(db, title, hasRealRelationships, hasImpliedRelationships, html);
		} catch (IOException e) {
			Logger.getLogger(HtmlRelationshipsPage_2Test.class.getName()).log(Level.SEVERE, null, e);
		}
		assertTrue(result);
	}
	
	/**
	* Test case for {@link HtmlRelationshipsPage#isRelationshipsPage()} method.
	* Test data: {@link HtmlRelationshipsPage#isRelationshipsPage()} method.
	* Expected result: {@link HtmlRelationshipsPage#isRelationshipsPage()} method returns true.
	*/
	@Test
	void testIsRelationshipsPage() {
		HtmlRelationshipsPage instance = HtmlRelationshipsPage.getInstance();
		boolean result = instance.isRelationshipsPage();
		assertTrue(result);
	}
	
}

// HtmlRelationshipsPage_3Test.java
package net.sourceforge.schemaspy.view;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sourceforge.schemaspy.model.Database;
import net.sourceforge.schemaspy.model.TableColumn;
import net.sourceforge.schemaspy.util.Dot;
import net.sourceforge.schemaspy.util.LineWriter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HtmlRelationshipsPage}.
* It contains ten unit test cases for the {@link HtmlRelationshipsPage#getInstance()} method.
*/
class HtmlRelationshipsPage_3Test {
		
	/**
	* Test case for {@link HtmlRelationshipsPage#getInstance()} method.
	* Test data: {@link HtmlRelationshipsPage#getInstance()} method.
	* Expected result: {@link HtmlRelationshipsPage#getInstance()} method returns an instance of {@link HtmlRelationshipsPage}.
	*/
	@Test
	void testGetInstance() {
		HtmlRelationshipsPage result = HtmlRelationshipsPage.getInstance();
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link HtmlRelationshipsPage#write(Database, File, String, boolean, boolean, Set, LineWriter)} method.
	* Test data: {@link HtmlRelationshipsPage#write(Database, File, String, boolean, boolean, Set, LineWriter)} method.
	* Expected result: {@link HtmlRelationshipsPage#write(Database, File, String, boolean, boolean, Set, LineWriter)} method returns true.
	*/
	@Test
	void testWrite() {
		Database db = null;
		File diagramDir = null;
		String dotBaseFilespec = null;
		boolean hasRealRelationships = false;
		boolean hasImpliedRelationships = false;
		Set<TableColumn> excludedColumns = null;
		LineWriter html = null;
		HtmlRelationshipsPage instance = HtmlRelationshipsPage.getInstance();
		boolean result = false;
		try {
			result = instance.write(db, diagramDir, dotBaseFilespec, hasRealRelationships, hasImpliedRelationships, excludedColumns, html);
		} catch (IOException e) {
			Logger.getLogger(HtmlRelationshipsPage_3Test.class.getName()).log(Level.SEVERE, null, e);
		}
		assertTrue(result);
	}
	
	/**
	* Test case for {@link HtmlRelationshipsPage#writeHeader(Database, String, boolean, boolean, LineWriter)} method.
	* Test data: {@link HtmlRelationshipsPage#writeHeader(Database, String, boolean, boolean, LineWriter)} method.
	* Expected result: {@link HtmlRelationshipsPage#writeHeader(Database, String, boolean, boolean, LineWriter)} method returns true.
	*/
	@Test
	void testWriteHeader() {
		Database db = null;
		String title = null;
		boolean hasRealRelationships = false;
		boolean hasImpliedRelationships = false;
		LineWriter html = null;