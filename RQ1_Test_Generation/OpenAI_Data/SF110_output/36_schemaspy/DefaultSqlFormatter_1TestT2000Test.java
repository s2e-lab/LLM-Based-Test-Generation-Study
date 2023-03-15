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
	 * @throws Exception
	 */
	@Test
	void testGetKeywords() throws Exception {
		DefaultSqlFormatter defaultSqlFormatter = new DefaultSqlFormatter();
		DatabaseMetaData databaseMetaData = null;
		Set<String> result = defaultSqlFormatter.getKeywords(databaseMetaData);
		assertNotNull(result);
		assertEquals(result.size(), 0);
	}
	
	/**
	 * Test case for {@link DefaultSqlFormatter#getKeywords(DatabaseMetaData)}
	 * 
	 * @throws Exception
	 */
	@Test
	void testGetKeywords_1() throws Exception {
		DefaultSqlFormatter defaultSqlFormatter = new DefaultSqlFormatter();
		DatabaseMetaData databaseMetaData = null;
		Set<String> result = defaultSqlFormatter.getKeywords(databaseMetaData);
		assertNotNull(result);
		assertEquals(result.size(), 0);
	}
	
	/**
	 * Test case for {@link DefaultSqlFormatter#getKeywords(DatabaseMetaData)}
	 * 
	 * @throws Exception
	 */
	@Test
	void testGetKeywords_2() throws Exception {
		DefaultSqlFormatter defaultSqlFormatter = new DefaultSqlFormatter();
		DatabaseMetaData databaseMetaData = null;
		Set<String> result = defaultSqlFormatter.getKeywords(databaseMetaData);
		assertNotNull(result);
		assertEquals(result.size(), 0);
	}
	
	/**
	 * Test case for {@link DefaultSqlFormatter#getKeywords(DatabaseMetaData)}
	 * 
	 * @throws Exception
	 */
	@Test
	void testGetKeywords_3() throws Exception {
		DefaultSqlFormatter defaultSqlFormatter = new DefaultSqlFormatter();
		DatabaseMetaData databaseMetaData = null;
		Set<String> result = defaultSqlFormatter.getKeywords(databaseMetaData);
		assertNotNull(result);
		assertEquals(result.size(), 0);
	}
	
	/**
	 * Test case for {@link DefaultSqlFormatter#getKeywords(DatabaseMetaData)}
	 * 
	 * @throws Exception
	 */
	@Test
	void testGetKeywords_4() throws Exception {
		DefaultSqlFormatter defaultSqlFormatter = new DefaultSqlFormatter();
		DatabaseMetaData databaseMetaData = null;
		Set<String> result = defaultSqlFormatter.getKeywords(databaseMetaData);
		assertNotNull(result);
		assertEquals(result.size(), 0);
	}
	
	/**
	 * Test case for {@link DefaultSqlFormatter#getKeywords(DatabaseMetaData)}
	 * 
	 * @throws Exception
	 */
	@Test
	void testGetKeywords_5() throws Exception {
		DefaultSqlFormatter defaultSqlFormatter = new DefaultSqlFormatter();
		DatabaseMetaData databaseMetaData = null;
		Set<String> result = defaultSqlFormatter.getKeywords(databaseMetaData);
		assertNotNull(result);
		assertEquals(result.size(), 0);
	}
	
	/**
	 * Test case for {@link DefaultSqlFormatter#getKeywords(DatabaseMetaData)}
	 * 
	 * @throws Exception
	 */
	@Test
	void testGetKeywords_6() throws Exception {
		DefaultSqlFormatter defaultSqlFormatter = new DefaultSqlFormatter();
		DatabaseMetaData databaseMetaData = null;
		Set<String> result = defaultSqlFormatter.getKeywords(databaseMetaData);
		assertNotNull(result);
		assertEquals(result.size(), 0);
	}
	
	/**
	 * Test case for {@link DefaultSqlFormatter#getKeywords(DatabaseMetaData)}
	 * 
	 * @throws Exception
	 */
	@Test
	void testGetKeywords_7() throws Exception {
		DefaultSqlFormatter defaultSqlFormatter = new DefaultSqlFormatter();
		DatabaseMetaData databaseMetaData = null;
		Set<String> result = defaultSqlFormatter.getKeywords(databaseMetaData);
		assertNotNull(result);
		assertEquals(result.size(), 0);
	}
	
	/**
	 * Test case for {@link DefaultSqlFormatter#getKeywords(DatabaseMetaData)}
	 * 
	 * @throws Exception
	 */
	@Test
	void testGetKeywords_8() throws Exception {
		DefaultSqlFormatter defaultSqlFormatter = new DefaultSqlFormatter();
		DatabaseMetaData databaseMetaData = null;
		Set<String> result = defaultSqlFormatter.getKeywords(databaseMetaData);
		assertNotNull(result);
		assertEquals(result.size(), 0);
	}
	
	/**
	 * Test case for {@link DefaultSqlFormatter#getKeywords(DatabaseMetaData)}
	 * 
	 * @throws Exception
	 */
	@Test
	void testGetKeywords_9() throws Exception {
		DefaultSqlFormatter defaultSqlFormatter = new DefaultSqlFormatter();
		DatabaseMetaData databaseMetaData = null;
		Set<String> result = defaultSqlFormatter.getKeywords(databaseMetaData);
		assertNotNull(result);
		assertEquals(result.size(), 0);
	}
	
	/**
	 * Test case for {@link DefaultSqlFormatter#getKeywords(DatabaseMetaData)}
	 * 
	 * @throws Exception
	 */
	@Test
	void testGetKeywords_10() throws Exception {
		DefaultSqlFormatter defaultSqlFormatter = new DefaultSqlFormatter();
		DatabaseMetaData databaseMetaData = null;
		Set<String> result = defaultSqlFormatter.getKeywords(databaseMetaData);
		assertNotNull(result);
		assertEquals(result.size(), 0);
	}
}

// DefaultSqlFormatter_2Test.java
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
* It contains ten unit test cases for the {@link DefaultSqlFormatter#getTableMap(Database)} method.
*/
class DefaultSqlFormatter_2Test {
		
	/**
	 * Test case for {@link DefaultSqlFormatter#getTableMap(Database)}
	 * 
	 * @throws Exception
	 */
	@Test
	void testGetTableMap() throws Exception {
		DefaultSqlFormatter defaultSqlFormatter = new DefaultSqlFormatter();
		Database database = null;
		Map<String, Table> result = defaultSqlFormatter.getTableMap(database);
		assertNotNull(result);
		assertEquals(result.size(), 0);
	}
	
	/**
	 * Test case for {@link DefaultSqlFormatter#getTableMap(Database)}
	 * 
	 * @throws Exception
	 */
	@Test
	void testGetTableMap_1() throws Exception {
		DefaultSqlFormatter defaultSqlFormatter = new DefaultSqlFormatter();
	