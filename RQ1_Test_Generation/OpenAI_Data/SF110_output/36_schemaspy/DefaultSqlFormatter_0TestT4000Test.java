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
	 * Test case for the scenario where the input SQL is already formatted.
	 * </p>
	 */
	@Test
	void testFormat_0() {
		String sql = "SELECT * FROM table1";
		Database db = new Database();
		Set<Table> references = new HashSet<Table>();
		DefaultSqlFormatter defaultSqlFormatter = new DefaultSqlFormatter();
		String result = defaultSqlFormatter.format(sql, db, references);
		assertEquals("<div class='viewDefinition preFormatted'>SELECT * FROM table1</div>", result);
	}
	
	/**
	 * Test case for {@link DefaultSqlFormatter#format(String, Database, Set)}
	 * 
	 * <p>
	 * Test case for the scenario where the input SQL is not formatted.
	 * </p>
	 */
	@Test
	void testFormat_1() {
		String sql = "SELECT * FROM table1";
		Database db = new Database();
		Set<Table> references = new HashSet<Table>();
		DefaultSqlFormatter defaultSqlFormatter = new DefaultSqlFormatter();
		String result = defaultSqlFormatter.format(sql, db, references);
		assertEquals("  <div class='viewDefinition'>SELECT * FROM table1</div>", result);
	}
	
	/**
	 * Test case for {@link DefaultSqlFormatter#format(String, Database, Set)}
	 * 
	 * <p>
	 * Test case for the scenario where the input SQL is not formatted.
	 * </p>
	 */
	@Test
	void testFormat_2() {
		String sql = "SELECT * FROM table1";
		Database db = new Database();
		Set<Table> references = new HashSet<Table>();
		DefaultSqlFormatter defaultSqlFormatter = new DefaultSqlFormatter();
		String result = defaultSqlFormatter.format(sql, db, references);
		assertEquals("  <div class='viewDefinition'>SELECT * FROM table1</div>", result);
	}
	
	/**
	 * Test case for {@link DefaultSqlFormatter#format(String, Database, Set)}
	 * 
	 * <p>
	 * Test case for the scenario where the input SQL is not formatted.
	 * </p>
	 */
	@Test
	void testFormat_3() {
		String sql = "SELECT * FROM table1";
		Database db = new Database();
		Set<Table> references = new HashSet<Table>();
		DefaultSqlFormatter defaultSqlFormatter = new DefaultSqlFormatter();
		String result = defaultSqlFormatter.format(sql, db, references);
		assertEquals("  <div class='viewDefinition'>SELECT * FROM table1</div>", result);
	}
	
	/**
	 * Test case for {@link DefaultSqlFormatter#format(String, Database, Set)}
	 * 
	 * <p>
	 * Test case for the scenario where the input SQL is not formatted.
	 * </p>
	 */
	@Test
	void testFormat_4() {
		String sql = "SELECT * FROM table1";
		Database db = new Database();
		Set<Table> references = new HashSet<Table>();
		DefaultSqlFormatter defaultSqlFormatter = new DefaultSqlFormatter();
		String result = defaultSqlFormatter.format(sql, db, references);
		assertEquals("  <div class='viewDefinition'>SELECT * FROM table1</div>", result);
	}
	
	/**
	 * Test case for {@link DefaultSqlFormatter#format(String, Database, Set)}
	 * 
	 * <p>
	 * Test case for the scenario where the input SQL is not formatted.
	 * </p>
	 */
	@Test
	void testFormat_5() {
		String sql = "SELECT * FROM table1";
		Database db = new Database();
		Set<Table> references = new HashSet<Table>();
		DefaultSqlFormatter defaultSqlFormatter = new DefaultSqlFormatter();
		String result = defaultSqlFormatter.format(sql, db, references);
		assertEquals("  <div class='viewDefinition'>SELECT * FROM table1</div>", result);
	}
	
	/**
	 * Test case for {@link DefaultSqlFormatter#format(String, Database, Set)}
	 * 
	 * <p>
	 * Test case for the scenario where the input SQL is not formatted.
	 * </p>
	 */
	@Test
	void testFormat_6() {
		String sql = "SELECT * FROM table1";
		Database db = new Database();
		Set<Table> references = new HashSet<Table>();
		DefaultSqlFormatter defaultSqlFormatter = new DefaultSqlFormatter();
		String result = defaultSqlFormatter.format(sql, db, references);
		assertEquals("  <div class='viewDefinition'>SELECT * FROM table1</div>", result);
	}
	
	/**
	 * Test case for {@link DefaultSqlFormatter#format(String, Database, Set)}
	 * 
	 * <p>
	 * Test case for the scenario where the input SQL is not formatted.
	 * </p>
	 */
	@Test
	void testFormat_7() {
		String sql = "SELECT * FROM table1";
		Database db = new Database();
		Set<Table> references = new HashSet<Table>();
		DefaultSqlFormatter defaultSqlFormatter = new DefaultSqlFormatter();
		String result = defaultSqlFormatter.format(sql, db, references);
		assertEquals("  <div class='viewDefinition'>SELECT * FROM table1</div>", result);
	}
	
	/**
	 * Test case for {@link DefaultSqlFormatter#format(String, Database, Set)}
	 * 
	 * <p>
	 * Test case for the scenario where the input SQL is not formatted.
	 * </p>
	 */
	@Test
	void testFormat_8() {
		String sql = "SELECT * FROM table1";
		Database db = new Database();
		Set<Table> references = new HashSet<Table>();
		DefaultSqlFormatter defaultSqlFormatter = new DefaultSqlFormatter();
		String result = defaultSqlFormatter.format(sql, db, references);
		assertEquals("  <div class='viewDefinition'>SELECT * FROM table1</div>", result);
	}
	
	/**
	 * Test case for {@link DefaultSqlFormatter#format(String, Database, Set)}
	 * 
	 * <p>
	 * Test case for the scenario where the input SQL is not formatted.
	 * </p>
	 */
	@Test
	void testFormat_9() {
		String sql = "SELECT * FROM table1";
		Database db = new Database();
		Set<Table> references = new HashSet<Table>();
		DefaultSqlFormatter defaultSqlFormatter = new DefaultSqlFormatter();
		String result = defaultSqlFormatter.format(sql, db, references);
		assertEquals("  <div class='viewDefinition'>SELECT * FROM table1</div>", result);
	}
	
}

// DefaultSqlFormatter_1Test.java
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
* It contains ten unit test cases for the {@link DefaultSqlFormatter#getKeywords(DatabaseMetaData)} method.
*/
class DefaultSqlFormatter_1Test {
		
	/**
	 * Test case for {@link DefaultSqlFormatter#getKeywords(DatabaseMetaData)}
	 * 
	 * <p>
	 * Test case for the scenario where the input SQL is already formatted.
	 * </p>
	 */
	@Test
	void testGetKeywords_0() {
		DatabaseMetaData meta = new DatabaseMetaData();
		DefaultSqlFormatter defaultSqlFormatter = new DefaultSqlFormatter();
		Set<String> result = defaultSqlFormatter.getKeywords(meta);
		assertEquals(new HashSet<String>(Arrays.asList(new String[] { "ABSOLUTE", "ACTION", "ADD", "ALL", "ALLOCATE", "ALTER", "AND", "ANY", "ARE", "AS", "ASC", "ASSERTION", "AT", "AUTHORIZATION", "AVG", "BEGIN", "BETWEEN", "BIT", "BIT_LENGTH", "BOTH", "BY", "CASCADE", "CASCADED", "CASE", "CAST", "CATALOG", "CHAR", "CHARACTER", "CHAR_LENGTH", "CHARACTER_LENGTH", "CHECK", "CLOSE", "COALESCE", "COLLATE", "COLLATION", "COLUMN", "COMMIT", "CONNECT", "CONNECTION", "CONSTRAINT", "CONSTRAINTS", "CONTINUE", "CONVERT", "CORRESPONDING", "COUNT", "CREATE", "CROSS", "CURRENT", "CURRENT_DATE", "CURRENT_TIME", "CURRENT_TIMESTAMP", "CURRENT_USER", "CURSOR", "DATE", "DAY", "DEALLOCATE", "DEC", "DECIMAL", "DECLARE", "DEFAULT", "DEFERRABLE", "DEFERRED", "DELETE", "DESC", "DESCRIBE", "DESCRIPTOR", "DIAGNOSTICS", "DISCONNECT", "DISTINCT", "DOMAIN", "DOUBLE", "DROP", "ELSE", "END", "END - EXEC", "ESCAPE", "EXCEPT", "EXCEPTION", "EXEC", "EXECUTE", "EXISTS", "EXTERNAL", "EXTRACT", "FALSE", "FETCH", "FIRST", "FLOAT", "FOR", "FOREIGN", "FOUND", "FROM", "FULL", "GET", "GLOBAL", "GO", "GOTO", "GRANT", "GROUP", "HAVING", "HOUR", "IDENTITY", "IMMEDIATE", "IN", "INDICATOR", "INITIALLY", "INNER", "INPUT", "INSENSITIVE", "INSERT", "INT", "INTEGER", "INTERSECT", "INTERVAL", "INTO", "IS", "ISOLATION", "JOIN", "KEY", "LANGUAGE", "LAST", "LEADING", "LEFT", "LEVEL", "LIKE", "LOCAL", "LOWER", "MATCH", "MAX", "MIN", "MINUTE", "MODULE", "MONTH", "NAMES", "NATIONAL", "NATURAL", "NCHAR", "NEXT", "NO", "NOT", "NULL", "NULLIF", "NUMERIC", "OCTET_LENGTH", "OF", "ON", "ONLY", "OPEN", "OPTION", "OR", "ORDER", "OUTER", "OUTPUT", "OVERLAPS", "PAD", "PARTIAL", "POSITION", "PRECISION", "PREPARE", "PRESERVE", "PRIMARY", "PRIOR", "PRIVILEGES", "PROCEDURE", "PUBLIC", "READ", "REAL", "REFERENCES", "RELATIVE", "RESTRICT", "REVOKE", "RIGHT", "ROLLBACK", "ROWS", "SCHEMA", "SCROLL", "SECOND", "SECTION", "SELECT", "SESSION", "SESSION_USER", "SET", "SIZE", "SMALLINT", "SOME", "SPACE", "SQL", "SQLCODE", "SQLERROR", "SQLSTATE", "SUBSTRING", "SUM", "SYSTEM_USER", "TABLE", "TEMPORARY", "THEN", "TIME", "TIMESTAMP", "TIMEZONE_HOUR", "TIMEZONE_MINUTE", "TO", "TRAILING", "TRANSACTION", "TRANSLATE", "TRANSLATION", "TRIM", "TRUE", "UNION", "UNIQUE", "UNKNOWN", "UPDATE", "UPPER", "USAGE", "USER", "USING", "VALUE", "VALUES", "VARCHAR", "VARYING", "VIEW", "WHEN", "WHENEVER", "WHERE", "WITH", "WORK", "WRITE", "YEAR", "ZONE" })), result);
	}
	
	/**
	 * Test case for {@link DefaultSqlFormatter#getKeywords(DatabaseMetaData)}
	 * 
	 * <p>
	 * Test case for the scenario where the input SQL is not formatted.
	 * </p>
	 */
	@Test
	void testGetKeywords_1() {
		DatabaseMetaData meta = new DatabaseMetaData();
		DefaultSqlFormatter defaultSqlFormatter = new DefaultSqlFormatter();
		Set<String> result = defaultSqlFormatter.getKeywords(meta);
		assertEquals(new HashSet<String>(Arrays.asList(new String[] { "ABSOLUTE", "ACTION", "ADD", "ALL", "ALLOCATE", "ALTER", "AND", "ANY", "ARE", "AS", "ASC", "ASSERTION", "AT", "AUTHORIZATION", "AVG", "BEGIN", "BETWEEN", "BIT", "BIT_LENGTH", "BOTH", "BY", "CASCADE", "CASCADED", "CASE", "CAST", "CATALOG", "CHAR", "CHARACTER", "CHAR_LENGTH", "CHARACTER_LENGTH", "CHECK", "CLOSE", "COALESCE", "COLLATE", "COLLATION", "COLUMN", "COMMIT", "CONNECT", "CONNECTION", "CONSTRAINT", "CONSTRAINTS", "CONTINUE", "CONVERT", "CORRESPONDING", "COUNT", "CREATE", "CROSS", "CURRENT", "CURRENT_DATE", "CURRENT_TIME", "CURRENT_TIMESTAMP", "CURRENT_USER", "CURSOR", "DATE", "DAY", "DEALLOCATE", "DEC", "DECIMAL", "DECLARE", "DEFAULT", "DEFERRABLE", "DEFERRED", "DELETE", "DESC", "DESCRIBE", "DESCRIPTOR", "DIAGNOSTICS", "DISCONNECT", "DISTINCT", "DOMAIN", "DOUBLE", "DROP", "ELSE", "END", "END - EXEC", "ESCAPE", "EXCEPT", "EXCEPTION", "EXEC", "EXECUTE", "EXISTS", "EXTERNAL", "EXTRACT", "FALSE", "FETCH", "FIRST", "FLOAT", "FOR", "FOREIGN", "FOUND", "FROM", "FULL", "GET", "GLOBAL", "GO", "GOTO", "GRANT", "GROUP", "HAVING", "HOUR", "IDENTITY", "IMMEDIATE", "IN", "INDICATOR", "INITIALLY", "INNER", "INPUT", "INSENSITIVE", "INSERT", "INT", "INTEGER", "INTERSECT", "INTERVAL", "INTO", "IS", "ISOLATION", "JOIN", "KEY", "LANGUAGE", "LAST", "LEADING", "LEFT", "LEVEL", "LIKE", "LOCAL", "LOWER", "M