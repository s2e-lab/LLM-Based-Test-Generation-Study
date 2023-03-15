// DbAnalyzer_13Test.java
package net.sourceforge.schemaspy;

import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import net.sourceforge.schemaspy.model.ForeignKeyConstraint;
import net.sourceforge.schemaspy.model.ImpliedForeignKeyConstraint;
import net.sourceforge.schemaspy.model.RailsForeignKeyConstraint;
import net.sourceforge.schemaspy.model.Table;
import net.sourceforge.schemaspy.model.TableColumn;
import net.sourceforge.schemaspy.model.TableIndex;
import net.sourceforge.schemaspy.util.Inflection;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DbAnalyzer}.
* It contains ten unit test cases for the {@link DbAnalyzer#getPopulatedSchemas(DatabaseMetaData)} method.
*/
class DbAnalyzer_13Test {

		/**
		* Test case for {@link DbAnalyzer#getPopulatedSchemas(DatabaseMetaData)} method.
		* This test case checks the correctness of the method when the schemaSpec is null.
		*/
		@Test
		void testGetPopulatedSchemas_1() throws SQLException {
				DatabaseMetaData meta = null;
				String schemaSpec = null;
				boolean isCatalog = false;
				List<String> result = DbAnalyzer.getPopulatedSchemas(meta, schemaSpec, isCatalog);
				assertEquals(0, result.size());
		}
		
		/**
		* Test case for {@link DbAnalyzer#getPopulatedSchemas(DatabaseMetaData)} method.
		* This test case checks the correctness of the method when the schemaSpec is empty.
		*/
		@Test
		void testGetPopulatedSchemas_2() throws SQLException {
				DatabaseMetaData meta = null;
				String schemaSpec = "";
				boolean isCatalog = false;
				List<String> result = DbAnalyzer.getPopulatedSchemas(meta, schemaSpec, isCatalog);
				assertEquals(0, result.size());
		}
		
		/**
		* Test case for {@link DbAnalyzer#getPopulatedSchemas(DatabaseMetaData)} method.
		* This test case checks the correctness of the method when the schemaSpec is not empty.
		*/
		@Test
		void testGetPopulatedSchemas_3() throws SQLException {
				DatabaseMetaData meta = null;
				String schemaSpec = ".*";
				boolean isCatalog = false;
				List<String> result = DbAnalyzer.getPopulatedSchemas(meta, schemaSpec, isCatalog);
				assertEquals(0, result.size());
		}
		
		/**
		* Test case for {@link DbAnalyzer#getPopulatedSchemas(DatabaseMetaData)} method.
		* This test case checks the correctness of the method when the schemaSpec is not empty.
		*/
		@Test
		void testGetPopulatedSchemas_4() throws SQLException {
				DatabaseMetaData meta = null;
				String schemaSpec = ".*";
				boolean isCatalog = true;
				List<String> result = DbAnalyzer.getPopulatedSchemas(meta, schemaSpec, isCatalog);
				assertEquals(0, result.size());
		}
		
		/**
		* Test case for {@link DbAnalyzer#getPopulatedSchemas(DatabaseMetaData)} method.
		* This test case checks the correctness of the method when the schemaSpec is not empty.
		*/
		@Test
		void testGetPopulatedSchemas_5() throws SQLException {
				DatabaseMetaData meta = null;
				String schemaSpec = ".*";
				boolean isCatalog = false;
				List<String> result = DbAnalyzer.getPopulatedSchemas(meta, schemaSpec, isCatalog);
				assertEquals(0, result.size());
		}
		
		/**
		* Test case for {@link DbAnalyzer#getPopulatedSchemas(DatabaseMetaData)} method.
		* This test case checks the correctness of the method when the schemaSpec is not empty.
		*/
		@Test
		void testGetPopulatedSchemas_6() throws SQLException {
				DatabaseMetaData meta = null;
				String schemaSpec = ".*";
				boolean isCatalog = true;
				List<String> result = DbAnalyzer.getPopulatedSchemas(meta, schemaSpec, isCatalog);
				assertEquals(0, result.size());
		}
		
		/**
		* Test case for {@link DbAnalyzer#getPopulatedSchemas(DatabaseMetaData)} method.
		* This test case checks the correctness of the method when the schemaSpec is not empty.
		*/
		@Test
		void testGetPopulatedSchemas_7() throws SQLException {
				DatabaseMetaData meta = null;
				String schemaSpec = ".*";
				boolean isCatalog = false;
				List<String> result = DbAnalyzer.getPopulatedSchemas(meta, schemaSpec, isCatalog);
				assertEquals(0, result.size());
		}
		
		/**
		* Test case for {@link DbAnalyzer#getPopulatedSchemas(DatabaseMetaData)} method.
		* This test case checks the correctness of the method when the schemaSpec is not empty.
		*/
		@Test
		void testGetPopulatedSchemas_8() throws SQLException {
				DatabaseMetaData meta = null;
				String schemaSpec = ".*";
				boolean isCatalog = true;
				List<String> result = DbAnalyzer.getPopulatedSchemas(meta, schemaSpec, isCatalog);
				assertEquals(0, result.size());
		}
		
		/**
		* Test case for {@link DbAnalyzer#getPopulatedSchemas(DatabaseMetaData)} method.
		* This test case checks the correctness of the method when the schemaSpec is not empty.
		*/
		@Test
		void testGetPopulatedSchemas_9() throws SQLException {
				DatabaseMetaData meta = null;
				String schemaSpec = ".*";
				boolean isCatalog = false;
				List<String> result = DbAnalyzer.getPopulatedSchemas(meta, schemaSpec, isCatalog);
				assertEquals(0, result.size());
		}
		
		/**
		* Test case for {@link DbAnalyzer#getPopulatedSchemas(DatabaseMetaData)} method.
		* This test case checks the correctness of the method when the schemaSpec is not empty.
		*/
		@Test
		void testGetPopulatedSchemas_10() throws SQLException {
				DatabaseMetaData meta = null;
				String schemaSpec = ".*";
				boolean isCatalog = true;
				List<String> result = DbAnalyzer.getPopulatedSchemas(meta, schemaSpec, isCatalog);
				assertEquals(0, result.size());
		}
}

// DbAnalyzer_14Test.java
package net.sourceforge.schemaspy;

import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import net.sourceforge.schemaspy.model.ForeignKeyConstraint;
import net.sourceforge.schemaspy.model.ImpliedForeignKeyConstraint;
import net.sourceforge.schemaspy.model.RailsForeignKeyConstraint;
import net.sourceforge.schemaspy.model.Table;
import net.sourceforge.schemaspy.model.TableColumn;
import net.sourceforge.schemaspy.model.TableIndex;
import net.sourceforge.schemaspy.util.Inflection;
import org.junit.