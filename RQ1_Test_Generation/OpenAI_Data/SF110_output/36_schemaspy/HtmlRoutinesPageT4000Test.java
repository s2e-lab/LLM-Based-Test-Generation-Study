// HtmlRoutinesPageTest.java
package net.sourceforge.schemaspy.view;

import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import net.sourceforge.schemaspy.model.Database;
import net.sourceforge.schemaspy.model.Routine;
import net.sourceforge.schemaspy.model.RoutineParameter;
import net.sourceforge.schemaspy.util.LineWriter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HtmlRoutinesPage}.
* It contains ten unit test cases for the {@link HtmlRoutinesPage#getInstance()} method.
*/
class HtmlRoutinesPageTest {

	/**
	* Test case for {@link HtmlRoutinesPage#getInstance()} method.
	* It tests the case when the instance is null.
	*/
	@Test
	void testGetInstance_1() {
		HtmlRoutinesPage result = HtmlRoutinesPage.getInstance();
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link HtmlRoutinesPage#getInstance()} method.
	* It tests the case when the instance is not null.
	*/
	@Test
	void testGetInstance_2() {
		HtmlRoutinesPage result = HtmlRoutinesPage.getInstance();
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link HtmlRoutinesPage#getInstance()} method.
	* It tests the case when the instance is not null.
	*/
	@Test
	void testGetInstance_3() {
		HtmlRoutinesPage result = HtmlRoutinesPage.getInstance();
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link HtmlRoutinesPage#getInstance()} method.
	* It tests the case when the instance is not null.
	*/
	@Test
	void testGetInstance_4() {
		HtmlRoutinesPage result = HtmlRoutinesPage.getInstance();
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link HtmlRoutinesPage#getInstance()} method.
	* It tests the case when the instance is not null.
	*/
	@Test
	void testGetInstance_5() {
		HtmlRoutinesPage result = HtmlRoutinesPage.getInstance();
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link HtmlRoutinesPage#getInstance()} method.
	* It tests the case when the instance is not null.
	*/
	@Test
	void testGetInstance_6() {
		HtmlRoutinesPage result = HtmlRoutinesPage.getInstance();
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link HtmlRoutinesPage#getInstance()} method.
	* It tests the case when the instance is not null.
	*/
	@Test
	void testGetInstance_7() {
		HtmlRoutinesPage result = HtmlRoutinesPage.getInstance();
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link HtmlRoutinesPage#getInstance()} method.
	* It tests the case when the instance is not null.
	*/
	@Test
	void testGetInstance_8() {
		HtmlRoutinesPage result = HtmlRoutinesPage.getInstance();
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link HtmlRoutinesPage#getInstance()} method.
	* It tests the case when the instance is not null.
	*/
	@Test
	void testGetInstance_9() {
		HtmlRoutinesPage result = HtmlRoutinesPage.getInstance();
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link HtmlRoutinesPage#getInstance()} method.
	* It tests the case when the instance is not null.
	*/
	@Test
	void testGetInstance_10() {
		HtmlRoutinesPage result = HtmlRoutinesPage.getInstance();
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link HtmlRoutinesPage#write(Database, LineWriter)} method.
	* It tests the case when the db is null.
	*/
	@Test
	void testWrite_1() throws IOException {
		HtmlRoutinesPage fixture = HtmlRoutinesPage.getInstance();
		Database db = null;
		LineWriter html = null;
		fixture.write(db, html);
	}
	
	/**
	* Test case for {@link HtmlRoutinesPage#write(Database, LineWriter)} method.
	* It tests the case when the html is null.
	*/
	@Test
	void testWrite_2() throws IOException {
		HtmlRoutinesPage fixture = HtmlRoutinesPage.getInstance();
		Database db = new Database();
		LineWriter html = null;
		fixture.write(db, html);
	}
	
	/**
	* Test case for {@link HtmlRoutinesPage#write(Database, LineWriter)} method.
	* It tests the case when the db is not null and html is not null.
	*/
	@Test
	void testWrite_3() throws IOException {
		HtmlRoutinesPage fixture = HtmlRoutinesPage.getInstance();
		Database db = new Database();
		LineWriter html = new LineWriter();
		fixture.write(db, html);
	}
	
	/**
	* Test case for {@link HtmlRoutinesPage#write(Database, LineWriter)} method.
	* It tests the case when the db is not null and html is not null.
	*/
	@Test
	void testWrite_4() throws IOException {
		HtmlRoutinesPage fixture = HtmlRoutinesPage.getInstance();
		Database db = new Database();
		LineWriter html = new LineWriter();
		fixture.write(db, html);
	}
	
	/**
	* Test case for {@link HtmlRoutinesPage#write(Database, LineWriter)} method.
	* It tests the case when the db is not null and html is not null.
	*/
	@Test
	void testWrite_5() throws IOException {
		HtmlRoutinesPage fixture = HtmlRoutinesPage.getInstance();
		Database db = new Database();
		LineWriter html = new LineWriter();
		fixture.write(db, html);
	}
	
	/**
	* Test case for {@link HtmlRoutinesPage#write(Database, LineWriter)} method.
	* It tests the case when the db is not null and html is not null.
	*/
	@Test
	void testWrite_6() throws IOException {
		HtmlRoutinesPage fixture = HtmlRoutinesPage.getInstance();
		Database db = new Database();
		LineWriter html = new LineWriter();
		fixture.write(db, html);
	}
	
	/**
	* Test case for {@link HtmlRoutinesPage#write(Database, LineWriter)} method.
	* It tests the case when the db is not null and html is not null.
	*/
	@Test
	void testWrite_7() throws IOException {
		HtmlRoutinesPage fixture = HtmlRoutinesPage.getInstance();
		Database db = new Database();
		LineWriter html = new LineWriter();
		fixture.write(db, html);
	}
	
	/**
	* Test case for {@link HtmlRoutinesPage#write(Database, LineWriter)} method.
	* It tests the case when the db is not null and html is not null.
	*/
	@Test
	void testWrite_8() throws IOException {
		HtmlRoutinesPage fixture = HtmlRoutinesPage.getInstance();
		Database db = new Database();
		LineWriter html = new LineWriter();
		fixture.write(db, html);
	}
	
	/**
	* Test case for {@link HtmlRoutinesPage#write(Database, LineWriter)} method.
	* It tests the case when the db is not null and html is not null.
	*/
	@Test
	void testWrite_9() throws IOException {
		HtmlRoutinesPage fixture = HtmlRoutinesPage.getInstance();
		Database db = new Database();
		LineWriter html = new LineWriter();
		fixture.write(db, html);
	}
	
	/**
	* Test case for {@link HtmlRoutinesPage#write(Database, LineWriter)} method.
	* It tests the case when the db is not null and html is not null.
	*/
	@Test
	void testWrite_10() throws IOException {
		HtmlRoutinesPage fixture = HtmlRoutinesPage.getInstance();
		Database db = new Database();
		LineWriter html = new LineWriter();
		fixture.write(db, html);
	}
	
	/**
	* Test case for {@link HtmlRoutinesPage#writeHeader(Database, Collection, LineWriter)} method.
	* It tests the case when the db is null.
	*/
	@Test
	void testWriteHeader_1() throws IOException {
		HtmlRoutinesPage fixture = HtmlRoutinesPage.getInstance();
		Database db = null;
		Collection<Routine> routines = new TreeSet<Routine>();
		LineWriter html = null;
		fixture.writeHeader(db, routines, html);
	}
	
	/**
	* Test case for {@link HtmlRoutinesPage#writeHeader(Database, Collection, LineWriter)} method.
	* It tests the case when the routines is null.
	*/
	@Test
	void testWriteHeader_2() throws IOException {
		HtmlRoutinesPage fixture = HtmlRoutinesPage.getInstance();
		Database db = new Database();
		Collection<Routine> routines = null;
		LineWriter html = null;
		fixture.writeHeader(db, routines, html);
	}
	
	/**
	* Test case for {@link HtmlRoutinesPage#writeHeader(Database, Collection, LineWriter)} method.
	* It tests the case when the html is null.
	*/
	@Test
	void testWriteHeader_3() throws IOException {
		HtmlRoutinesPage fixture = HtmlRoutinesPage.getInstance();
		Database db = new Database();
		Collection<Routine> routines = new TreeSet<Routine>();
		LineWriter html = null;
		fixture.writeHeader(db, routines, html);
	}
	
	/**
	* Test case for {@link HtmlRoutinesPage#writeHeader(Database, Collection, LineWriter)} method.
	* It tests the case when the db is not null and routines is not null and html is not null.
	*/
	@Test
	void testWriteHeader_4() throws IOException {
		HtmlRoutinesPage fixture = HtmlRoutinesPage.getInstance();
		Database db = new Database();
		Collection<Routine> routines = new TreeSet<Routine>();
		LineWriter html = new LineWriter();
		fixture.writeHeader(db, routines, html);
	}
	
	/**
	* Test case for {@link HtmlRoutinesPage#writeHeader(Database, Collection, LineWriter)} method.
	* It tests the case when the db is not null and routines is not null and html is not null.
	*/
	@Test
	void testWriteHeader_5() throws IOException {
		HtmlRoutinesPage fixture = HtmlRoutinesPage.getInstance();
		Database db = new Database();
		Collection<Routine> routines = new TreeSet<Routine>();
		LineWriter html = new LineWriter();
		fixture.writeHeader(db, routines, html);
	}
	
	/**
	* Test case for {@link HtmlRoutinesPage#writeHeader(Database, Collection, LineWriter)} method.
	* It tests the case when the db is not null and routines is not null and html is not null.
	*/
	@Test
	void testWriteHeader_6() throws IOException {
		HtmlRoutinesPage fixture = HtmlRoutinesPage.getInstance();
		Database db = new Database();
		Collection<Routine> routines = new TreeSet<Routine>();
		LineWriter html = new LineWriter();
		fixture.writeHeader(db, routines, html);
	}
	
	/**
	* Test case for {@link HtmlRoutinesPage#writeHeader(Database, Collection, LineWriter)} method.
	* It tests the case when the db is not null and routines is not null and html is not null.
	*/
	@Test
	void testWriteHeader_7() throws IOException {
		HtmlRoutinesPage fixture = HtmlRoutinesPage.getInstance();
		Database db = new Database();
		Collection<Routine> routines = new TreeSet<Routine>();
		LineWriter html = new LineWriter();
		fixture.writeHeader(db, routines, html);
	}
	
	/**
	* Test case for {@link HtmlRoutinesPage#writeHeader(Database, Collection, LineWriter)} method.
	* It tests the case when the db is not null and routines is not null and html is not null.
	*/
	@Test
	void testWriteHeader_8() throws IOException {
		HtmlRoutinesPage fixture = HtmlRoutinesPage.getInstance();
		Database db = new Database();
		Collection<Routine> routines = new TreeSet<Routine>();
		LineWriter html = new LineWriter();
		fixture.writeHeader(db, routines, html);
	}
	
	/**
	* Test case for {@link HtmlRoutinesPage#writeHeader(Database, Collection, LineWriter)} method.
	* It tests the case when the db is not null and routines is not null and html is not null.
	*/
	@Test
	void testWriteHeader_9() throws IOException {
		HtmlRoutinesPage fixture = HtmlRoutinesPage.getInstance();
		Database db = new Database();
		Collection<Routine> routines = new TreeSet<Routine>();
		LineWriter html = new LineWriter();
		fixture.writeHeader(db, routines, html);
	}
	
	/**
	* Test case for {@link HtmlRoutinesPage#writeHeader(Database, Collection, LineWriter)} method.
	* It tests the case when the db is not null and routines is not null and html is not null.
	*/
	@Test
	void testWriteHeader_10() throws IOException {
		HtmlRoutinesPage fixture = HtmlRoutinesPage.getInstance();
		Database db = new Database();
		Collection<Routine> routines = new TreeSet<Routine>();
		LineWriter html = new LineWriter();
		fixture.writeHeader(db, routines, html);
	}
	
	/**
	* Test case for {@link HtmlRoutinesPage#write(Routine, LineWriter)} method.
	* It tests the case when the routine is null.
	*/
	@Test
	void testWrite_11() throws IOException {
		HtmlRoutinesPage fixture = HtmlRoutinesPage.getInstance();
		Routine routine = null;
		LineWriter html = null;
		fixture.write(routine, html);
	}
	
	/**
	* Test case for {@link HtmlRoutinesPage#write(Routine, LineWriter)} method.
	* It tests the case when the html is null.
	*/
	@Test
	void testWrite_12() throws IOException {
		HtmlRoutinesPage fixture = HtmlRoutinesPage.getInstance();
		Routine routine = new Routine();
		LineWriter html = null;
		fixture.write(routine, html);
	}
	
	/**
	* Test case for {@link HtmlRoutinesPage#write(Routine, LineWriter)} method.
	* It tests the case when the routine is not null and html is not null.
	*/
	@Test
	void testWrite_13() throws IOException {
		HtmlRoutinesPage fixture = HtmlRoutinesPage.getInstance();
		Routine routine = new Routine();
		LineWriter html = new LineWriter();
		fixture.write(routine, html);
	}
	
	/**
	* Test case