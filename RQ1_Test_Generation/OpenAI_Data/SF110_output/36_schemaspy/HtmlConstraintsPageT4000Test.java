// HtmlConstraintsPageTest.java
package net.sourceforge.schemaspy.view;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import net.sourceforge.schemaspy.DbAnalyzer;
import net.sourceforge.schemaspy.model.Database;
import net.sourceforge.schemaspy.model.ForeignKeyConstraint;
import net.sourceforge.schemaspy.model.Table;
import net.sourceforge.schemaspy.model.TableColumn;
import net.sourceforge.schemaspy.util.HtmlEncoder;
import net.sourceforge.schemaspy.util.LineWriter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HtmlConstraintsPage}.
* It contains ten unit test cases for the {@link HtmlConstraintsPage#getInstance()} method.
*/
class HtmlConstraintsPageTest {

	/**
	* Test case for {@link HtmlConstraintsPage#getInstance()} method.
	* This test case checks if the method returns the same instance of the class.
	*/
	@Test
	void testGetInstance() {
		HtmlConstraintsPage instance1 = HtmlConstraintsPage.getInstance();
		HtmlConstraintsPage instance2 = HtmlConstraintsPage.getInstance();
		assertSame(instance1, instance2);
	}
	
	/**
	* Test case for {@link HtmlConstraintsPage#write(Database, List, Collection, LineWriter)} method.
	* This test case checks if the method writes the header of the page.
	*/
	@Test
	void testWriteHeader() throws IOException {
		Database database = new Database("database", "url", "driver", "user", "password", "catalog", "schema");
		List<ForeignKeyConstraint> constraints = new ArrayList<ForeignKeyConstraint>();
		Collection<Table> tables = new ArrayList<Table>();
		LineWriter html = new LineWriter();
		HtmlConstraintsPage.getInstance().write(database, constraints, tables, html);
		assertTrue(html.toString().contains("<html>"));
	}
	
	/**
	* Test case for {@link HtmlConstraintsPage#write(Database, List, Collection, LineWriter)} method.
	* This test case checks if the method writes the footer of the page.
	*/
	@Test
	void testWriteFooter() throws IOException {
		Database database = new Database("database", "url", "driver", "user", "password", "catalog", "schema");
		List<ForeignKeyConstraint> constraints = new ArrayList<ForeignKeyConstraint>();
		Collection<Table> tables = new ArrayList<Table>();
		LineWriter html = new LineWriter();
		HtmlConstraintsPage.getInstance().write(database, constraints, tables, html);
		assertTrue(html.toString().contains("</html>"));
	}
	
	/**
	* Test case for {@link HtmlConstraintsPage#write(Database, List, Collection, LineWriter)} method.
	* This test case checks if the method writes the foreign key constraints.
	*/
	@Test
	void testWriteForeignKeyConstraints() throws IOException {
		Database database = new Database("database", "url", "driver", "user", "password", "catalog", "schema");
		List<ForeignKeyConstraint> constraints = new ArrayList<ForeignKeyConstraint>();
		Collection<Table> tables = new ArrayList<Table>();
		LineWriter html = new LineWriter();
		HtmlConstraintsPage.getInstance().write(database, constraints, tables, html);
		assertTrue(html.toString().contains("Foreign Key Constraints:"));
	}
	
	/**
	* Test case for {@link HtmlConstraintsPage#write(Database, List, Collection, LineWriter)} method.
	* This test case checks if the method writes the check constraints.
	*/
	@Test
	void testWriteCheckConstraints() throws IOException {
		Database database = new Database("database", "url", "driver", "user", "password", "catalog", "schema");
		List<ForeignKeyConstraint> constraints = new ArrayList<ForeignKeyConstraint>();
		Collection<Table> tables = new ArrayList<Table>();
		LineWriter html = new LineWriter();
		HtmlConstraintsPage.getInstance().write(database, constraints, tables, html);
		assertTrue(html.toString().contains("Check Constraints:"));
	}
	
	/**
	* Test case for {@link HtmlConstraintsPage#writeForeignKeyConstraint(ForeignKeyConstraint, LineWriter)} method.
	* This test case checks if the method writes the foreign key constraint.
	*/
	@Test
	void testWriteForeignKeyConstraint() throws IOException {
		Database database = new Database("database", "url", "driver", "user", "password", "catalog", "schema");
		List<ForeignKeyConstraint> constraints = new ArrayList<ForeignKeyConstraint>();
		Collection<Table> tables = new ArrayList<Table>();
		LineWriter html = new LineWriter();
		HtmlConstraintsPage.getInstance().write(database, constraints, tables, html);
		assertTrue(html.toString().contains("Foreign Key Constraints:"));
	}
	
	/**
	* Test case for {@link HtmlConstraintsPage#writeCheckConstraints(Collection, LineWriter)} method.
	* This test case checks if the method writes the check constraints.
	*/
	@Test
	void testWriteCheckConstraints2() throws IOException {
		Database database = new Database("database", "url", "driver", "user", "password", "catalog", "schema");
		List<ForeignKeyConstraint> constraints = new ArrayList<ForeignKeyConstraint>();
		Collection<Table> tables = new ArrayList<Table>();
		LineWriter html = new LineWriter();
		HtmlConstraintsPage.getInstance().write(database, constraints, tables, html);
		assertTrue(html.toString().contains("Check Constraints:"));
	}
	
	/**
	* Test case for {@link HtmlConstraintsPage#writeCheckConstraints(Table, LineWriter)} method.
	* This test case checks if the method writes the check constraints.
	*/
	@Test
	void testWriteCheckConstraints3() throws IOException {
		Database database = new Database("database", "url", "driver", "user", "password", "catalog", "schema");
		List<ForeignKeyConstraint> constraints = new ArrayList<ForeignKeyConstraint>();
		Collection<Table> tables = new ArrayList<Table>();
		LineWriter html = new LineWriter();
		HtmlConstraintsPage.getInstance().write(database, constraints, tables, html);
		assertTrue(html.toString().contains("Check Constraints:"));
	}
	
	/**
	* Test case for {@link HtmlConstraintsPage#isConstraintsPage()} method.
	* This test case checks if the method returns true.
	*/
	@Test
	void testIsConstraintsPage() {
		assertTrue(HtmlConstraintsPage.getInstance().isConstraintsPage());
	}
	
}