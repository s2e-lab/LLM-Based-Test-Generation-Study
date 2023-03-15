// DefaultSqlFormatter_0Test.java
package net.sourceforge.schemaspy.view;

import java.sql.DatabaseMetaData;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import net.sourceforge.schemaspy.model.Database;
import net.sourceforge.schemaspy.model.Table;
import net.sourceforge.schemaspy.util.CaseInsensitiveMap;
import net.sourceforge.schemaspy.util.HtmlEncoder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultSqlFormatter}.
* It contains ten unit test cases for the {@link DefaultSqlFormatter#format(String, Database, Set)} method.
*/
class DefaultSqlFormatter_0Test {

	/**
	 * Test case for {@link DefaultSqlFormatter#format(String, Database, Set)}
	 * 
	 * <p>
	 * Test case for the scenario where the input SQL is a simple select statement.
	 * </p>
	 */
	@Test
	void testFormat_0() {
		String sql = "SELECT * FROM table1";
		Database db = new Database();
		Set<Table> references = new HashSet<Table>();
		String result = new DefaultSqlFormatter().format(sql, db, references);
		assertEquals("  <div class='viewDefinition'>SELECT<b> </b>*<b> </b>FROM<b> </b>table1</div>", result);
		assertEquals(0, references.size());
	}
	
	/**
	 * Test case for {@link DefaultSqlFormatter#format(String, Database, Set)}
	 * 
	 * <p>
	 * Test case for the scenario where the input SQL is a simple select statement with a table alias.
	 * </p>
	 */
	@Test
	void testFormat_1() {
		String sql = "SELECT * FROM table1 t1";
		Database db = new Database();
		Set<Table> references = new HashSet<Table>();
		String result = new DefaultSqlFormatter().format(sql, db, references);
		assertEquals("  <div class='viewDefinition'>SELECT<b> </b>*<b> </b>FROM<b> </b>table1<b> </b>t1</div>", result);
		assertEquals(0, references.size());
	}
	
	/**
	 * Test case for {@link DefaultSqlFormatter#format(String, Database, Set)}
	 * 
	 * <p>
	 * Test case for the scenario where the input SQL is a simple select statement with a table alias and a column alias.
	 * </p>
	 */
	@Test
	void testFormat_2() {
		String sql = "SELECT t1.col1 AS col1 FROM table1 t1";
		Database db = new Database();
		Set<Table> references = new HashSet<Table>();
		String result = new DefaultSqlFormatter().format(sql, db, references);
		assertEquals("  <div class='viewDefinition'>SELECT<b> </b>t1.col1<b> </b>AS<b> </b>col1<b> </b>FROM<b> </b>table1<b> </b>t1</div>", result);
		assertEquals(0, references.size());
	}
	
	/**
	 * Test case for {@link DefaultSqlFormatter#format(String, Database, Set)}
	 * 
	 * <p>
	 * Test case for the scenario where the input SQL is a simple select statement with a table alias and a column alias.
	 * </p>
	 */
	@Test
	void testFormat_3() {
		String sql = "SELECT t1.col1 AS col1 FROM table1 t1";
		Database db = new Database();
		Set<Table> references = new HashSet<Table>();
		String result = new DefaultSqlFormatter().format(sql, db, references);
		assertEquals("  <div class='viewDefinition'>SELECT<b> </b>t1.col1<b> </b>AS<b> </b>col1<b> </b>FROM<b> </b>table1<b> </b>t1</div>", result);
		assertEquals(0, references.size());
	}
	
	/**
	 * Test case for {@link DefaultSqlFormatter#format(String, Database, Set)}
	 * 
	 * <p>
	 * Test case for the scenario where the input SQL is a simple select statement with a table alias and a column alias.
	 * </p>
	 */
	@Test
	void testFormat_4() {
		String sql = "SELECT t1.col1 AS col1 FROM table1 t1";
		Database db = new Database();
		Set<Table> references = new HashSet<Table>();
		String result = new DefaultSqlFormatter().format(sql, db, references);
		assertEquals("  <div class='viewDefinition'>SELECT<b> </b>t1.col1<b> </b>AS<b> </b>col1<b> </b>FROM<b> </b>table1<b> </b>t1</div>", result);
		assertEquals(0, references.size());
	}
	
	/**
	 * Test case for {@link DefaultSqlFormatter#format(String, Database, Set)}
	 * 
	 * <p>
	 * Test case for the scenario where the input SQL is a simple select statement with a table alias and a column alias.
	 * </p>
	 */
	@Test
	void testFormat_5() {
		String sql = "SELECT t1.col1 AS col1 FROM table1 t1";
		Database db = new Database();
		Set<Table> references = new HashSet<Table>();
		String result = new DefaultSqlFormatter().format(sql, db, references);
		assertEquals("  <div class='viewDefinition'>SELECT<b> </b>t1.col1<b> </b>AS<b> </b>col1<b> </b>FROM<b> </b>table1<b> </b>t1</div>", result);
		assertEquals(0, references.size());
	}
	
	/**
	 * Test case for {@link DefaultSqlFormatter#format(String, Database, Set)}
	 * 
	 * <p>
	 * Test case for the scenario where the input SQL is a simple select statement with a table alias and a column alias.
	 * </p>
	 */
	@Test
	void testFormat_6() {
		String sql = "SELECT t1.col1 AS col1 FROM table1 t1";
		Database db = new Database();
		Set<Table> references = new HashSet<Table>();
		String result = new DefaultSqlFormatter().format(sql, db, references);
		assertEquals("  <div class='viewDefinition'>SELECT<b> </b>t1.col1<b> </b>AS<b> </b>col1<b> </b>FROM<b> </b>table1<b> </b>t1</div>", result);
		assertEquals(0, references.size());
	}
	
	/**
	 * Test case for {@link DefaultSqlFormatter#format(String, Database, Set)}
	 * 
	 * <p>
	 * Test case for the scenario where the input SQL is a simple select statement with a table alias and a column alias.
	 * </p>
	 */
	@Test
	void testFormat_7() {
		String sql = "SELECT t1.col1 AS col1 FROM table1 t1";
		Database db = new Database();
		Set<Table> references = new HashSet<Table>();
		String result = new DefaultSqlFormatter().format(sql, db, references);
		assertEquals("  <div class='viewDefinition'>SELECT<b> </b>t1.col1<b> </b>AS<b> </b>col1<b> </b>FROM<b> </b>table1<b> </b>t1</div>", result);
		assertEquals(0, references.size());
	}
	
	/**
	 * Test case for {@link DefaultSqlFormatter#format(String, Database, Set)}
	 * 
	 * <p>
	 * Test case for the scenario where the input SQL is a simple select statement with a table alias and a column alias.
	 * </p>
	 */
	@Test
	void testFormat_8() {
		String sql = "SELECT t1.col1 AS col1 FROM table1 t1";
		Database db = new Database();
		Set<Table> references = new HashSet<Table>();
		String result = new