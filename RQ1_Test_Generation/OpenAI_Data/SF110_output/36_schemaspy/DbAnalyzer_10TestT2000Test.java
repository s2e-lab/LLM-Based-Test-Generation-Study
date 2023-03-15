// DbAnalyzer_10Test.java
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
* It contains ten unit test cases for the {@link DbAnalyzer#getDefaultNullStringColumns(Collection)} method.
*/
class DbAnalyzer_10Test {

		/**
		* Test case for {@link DbAnalyzer#getDefaultNullStringColumns(Collection)} method.
		* Test data: empty collection.
		* Expected result: empty list.
		*/
		@Test
		void testGetDefaultNullStringColumns_1() {
				Collection<Table> tables = new ArrayList<Table>();
				List<TableColumn> result = DbAnalyzer.getDefaultNullStringColumns(tables);
				assertEquals(0, result.size());
		}
		
		/**
		* Test case for {@link DbAnalyzer#getDefaultNullStringColumns(Collection)} method.
		* Test data: collection with one table with one column with default value null.
		* Expected result: empty list.
		*/
		@Test
		void testGetDefaultNullStringColumns_2() {
				Collection<Table> tables = new ArrayList<Table>();
				Table table = new Table("table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table", "table",