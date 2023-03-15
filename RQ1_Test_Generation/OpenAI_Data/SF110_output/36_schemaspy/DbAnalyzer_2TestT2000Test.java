// DbAnalyzer_2Test.java
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
* It contains ten unit test cases for the {@link DbAnalyzer#getForeignKeyConstraints(Collection)} method.
*/
class DbAnalyzer_2Test {

		/**
		* Test case for {@link DbAnalyzer#getForeignKeyConstraints(Collection)} method.
		* This test case checks the correctness of the method when the input collection is empty.
		*/
		@Test
		void testGetForeignKeyConstraints_1() {
				Collection<Table> tables = new ArrayList<Table>();
				List<ForeignKeyConstraint> constraints = DbAnalyzer.getForeignKeyConstraints(tables);
				assertEquals(0, constraints.size());
		}
		
		/**
		* Test case for {@link DbAnalyzer#getForeignKeyConstraints(Collection)} method.
		* This test case checks the correctness of the method when the input collection contains one table.
		*/
		@Test
		void testGetForeignKeyConstraints_2() {
				Collection<Table> tables = new ArrayList<Table>();
				Table table = new Table("table1");
				tables.add(table);
				List<ForeignKeyConstraint> constraints = DbAnalyzer.getForeignKeyConstraints(tables);
				assertEquals(0, constraints.size());
		}
		
		/**
		* Test case for {@link DbAnalyzer#getForeignKeyConstraints(Collection)} method.
		* This test case checks the correctness of the method when the input collection contains two tables.
		*/
		@Test
		void testGetForeignKeyConstraints_3() {
				Collection<Table> tables = new ArrayList<Table>();
				Table table1 = new Table("table1");
				Table table2 = new Table("table2");
				tables.add(table1);
				tables.add(table2);
				List<ForeignKeyConstraint> constraints = DbAnalyzer.getForeignKeyConstraints(tables);
				assertEquals(0, constraints.size());
		}
		
		/**
		* Test case for {@link DbAnalyzer#getForeignKeyConstraints(Collection)} method.
		* This test case checks the correctness of the method when the input collection contains two tables.
		* The first table has one foreign key constraint.
		*/
		@Test
		void testGetForeignKeyConstraints_4() {
				Collection<Table> tables = new ArrayList<Table>();
				Table table1 = new Table("table1");
				Table table2 = new Table("table2");
				tables.add(table1);
				tables.add(table2);
				TableColumn column1 = new TableColumn("column1");
				TableColumn column2 = new TableColumn("column2");
				table1.addColumn(column1);
				table2.addColumn(column2);
				ForeignKeyConstraint constraint = new ForeignKeyConstraint(column1, column2);
				table1.addForeignKey(constraint);
				List<ForeignKeyConstraint> constraints = DbAnalyzer.getForeignKeyConstraints(tables);
				assertEquals(1, constraints.size());
				assertEquals(constraint, constraints.get(0));
		}
		
		/**
		* Test case for {@link DbAnalyzer#getForeignKeyConstraints(Collection)} method.
		* This test case checks the correctness of the method when the input collection contains two tables.
		* The first table has two foreign key constraints.
		*/
		@Test
		void testGetForeignKeyConstraints_5() {
				Collection<Table> tables = new ArrayList<Table>();
				Table table1 = new Table("table1");
				Table table2 = new Table("table2");
				tables.add(table1);
				tables.add(table2);
				TableColumn column1 = new TableColumn("column1");
				TableColumn column2 = new TableColumn("column2");
				TableColumn column3 = new TableColumn("column3");
				table1.addColumn(column1);
				table1.addColumn(column2);
				table2.addColumn(column3);
				ForeignKeyConstraint constraint1 = new ForeignKeyConstraint(column1, column2);
				ForeignKeyConstraint constraint2 = new ForeignKeyConstraint(column2, column3);
				table1.addForeignKey(constraint1);
				table1.addForeignKey(constraint2);
				List<ForeignKeyConstraint> constraints = DbAnalyzer.getForeignKeyConstraints(tables);
				assertEquals(2, constraints.size());
				assertEquals(constraint1, constraints.get(0));
				assertEquals(constraint2, constraints.get(1));
		}
		
		/**
		* Test case for {@link DbAnalyzer#getForeignKeyConstraints(Collection)} method.
		* This test case checks the correctness of the method when the input collection contains two tables.
		* The first table has two foreign key constraints.
		* The second table has one foreign key constraint.
		*/
		@Test
		void testGetForeignKeyConstraints_6() {
				Collection<Table> tables = new ArrayList<Table>();
				Table table1 = new Table("table1");
				Table table2 = new Table("table2");
				tables.add(table1);
				tables.add(table2);
				TableColumn column1 = new TableColumn("column1");
				TableColumn column2 = new TableColumn("column2");
				TableColumn column3 = new TableColumn("column3");
				table1.addColumn(column1);
				table1.addColumn(column2);
				table2.addColumn(column3);
				ForeignKeyConstraint constraint1 = new ForeignKeyConstraint(column1, column2);
				ForeignKeyConstraint constraint2 = new ForeignKeyConstraint(column2, column3);
				table1.addForeignKey(constraint1);
				table1.addForeignKey(constraint2);
				List<ForeignKeyConstraint> constraints = DbAnalyzer.getForeignKeyConstraints(tables);
				assertEquals(2, constraints.size());
				assertEquals(constraint1, constraints.get(0));
				assertEquals(constraint2, constraints.get(1));
		}
		
		/**
		* Test case for {@link DbAnalyzer#getForeignKeyConstraints(Collection)} method.
		* This test case checks the correctness of the method when the input collection contains two tables.
		* The first table has two foreign key constraints.
		* The second table has two foreign key constraints.
		*/
		@Test
		void testGetForeignKeyConstraints_7() {
				Collection<Table> tables = new ArrayList<Table>();
				Table table1 = new Table("table1");
				Table table2 = new Table("table2");
				tables.add(table1);
				tables.add(table2);
				TableColumn column1 = new TableColumn("column1");
				TableColumn column2 = new TableColumn("column2");
				TableColumn column3 = new TableColumn("column3");
				TableColumn column4 = new TableColumn("column4");
				table1.addColumn(column1);
				table1.addColumn(column