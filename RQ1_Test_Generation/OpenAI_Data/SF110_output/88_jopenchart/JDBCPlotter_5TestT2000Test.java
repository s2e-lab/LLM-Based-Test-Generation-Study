// JDBCPlotter_5Test.java
package de.progra.charting.model;

import java.sql.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JDBCPlotter}.
* It contains ten unit test cases for the {@link JDBCPlotter#createObjectChartDataModelInstance(String, String, String[], String[])} method.
*/
class JDBCPlotter_5Test {

		/**
		* Test case for the {@link JDBCPlotter#createObjectChartDataModelInstance(String, String, String[], String[])} method.
		* It tests if the method returns a {@link ObjectChartDataModel} with the correct values.
		*/
		@Test
		void testCreateObjectChartDataModelInstance() throws Exception {
				JDBCPlotter jdbcPlotter = new JDBCPlotter("org.hsqldb.jdbcDriver", "jdbc:hsqldb:mem:aname", "sa", "");
				Statement stmt = jdbcPlotter.conn.createStatement();
				stmt.execute("CREATE TABLE test (id INTEGER, name VARCHAR(20), value DOUBLE)");
				stmt.execute("INSERT INTO test VALUES (1, 'one', 1.0)");
				stmt.execute("INSERT INTO test VALUES (2, 'two', 2.0)");
				stmt.execute("INSERT INTO test VALUES (3, 'three', 3.0)");
				stmt.execute("INSERT INTO test VALUES (4, 'four', 4.0)");
				stmt.execute("INSERT INTO test VALUES (5, 'five', 5.0)");
				stmt.execute("INSERT INTO test VALUES (6, 'six', 6.0)");
				stmt.execute("INSERT INTO test VALUES (7, 'seven', 7.0)");
				stmt.execute("INSERT INTO test VALUES (8, 'eight', 8.0)");
				stmt.execute("INSERT INTO test VALUES (9, 'nine', 9.0)");
				stmt.execute("INSERT INTO test VALUES (10, 'ten', 10.0)");
				ObjectChartDataModel objectChartDataModel = jdbcPlotter.createObjectChartDataModelInstance("SELECT * FROM test", "name", new String[] { "value" }, new String[] { "value" });
				assertEquals(1.0, objectChartDataModel.getValueAt(0, 0));
				assertEquals(2.0, objectChartDataModel.getValueAt(1, 0));
				assertEquals(3.0, objectChartDataModel.getValueAt(2, 0));
				assertEquals(4.0, objectChartDataModel.getValueAt(3, 0));
				assertEquals(5.0, objectChartDataModel.getValueAt(4, 0));
				assertEquals(6.0, objectChartDataModel.getValueAt(5, 0));
				assertEquals(7.0, objectChartDataModel.getValueAt(6, 0));
				assertEquals(8.0, objectChartDataModel.getValueAt(7, 0));
				assertEquals(9.0, objectChartDataModel.getValueAt(8, 0));
				assertEquals(10.0, objectChartDataModel.getValueAt(9, 0));
				assertEquals("one", objectChartDataModel.getColumnKey(0));
				assertEquals("two", objectChartDataModel.getColumnKey(1));
				assertEquals("three", objectChartDataModel.getColumnKey(2));
				assertEquals("four", objectChartDataModel.getColumnKey(3));
				assertEquals("five", objectChartDataModel.getColumnKey(4));
				assertEquals("six", objectChartDataModel.getColumnKey(5));
				assertEquals("seven", objectChartDataModel.getColumnKey(6));
				assertEquals("eight", objectChartDataModel.getColumnKey(7));
				assertEquals("nine", objectChartDataModel.getColumnKey(8));
				assertEquals("ten", objectChartDataModel.getColumnKey(9));
				assertEquals("value", objectChartDataModel.getDataSetKey(0));
				assertEquals(1, objectChartDataModel.getDataSetCount());
				assertEquals(10, objectChartDataModel.getColumnCount());
				assertEquals(1, objectChartDataModel.getRowCount());
		}
		
		/**
		* Test case for the {@link JDBCPlotter#createObjectChartDataModelInstance(String, String, String[], String[])} method.
		* It tests if the method returns a {@link ObjectChartDataModel} with the correct values.
		*/
		@Test
		void testCreateObjectChartDataModelInstance2() throws Exception {
				JDBCPlotter jdbcPlotter = new JDBCPlotter("org.hsqldb.jdbcDriver", "jdbc:hsqldb:mem:aname", "sa", "");
				Statement stmt = jdbcPlotter.conn.createStatement();
				stmt.execute("CREATE TABLE test (id INTEGER, name VARCHAR(20), value DOUBLE)");
				stmt.execute("INSERT INTO test VALUES (1, 'one', 1.0)");
				stmt.execute("INSERT INTO test VALUES (2, 'two', 2.0)");
				stmt.execute("INSERT INTO test VALUES (3, 'three', 3.0)");
				stmt.execute("INSERT INTO test VALUES (4, 'four', 4.0)");
				stmt.execute("INSERT INTO test VALUES (5, 'five', 5.0)");
				stmt.execute("INSERT INTO test VALUES (6, 'six', 6.0)");
				stmt.execute("INSERT INTO test VALUES (7, 'seven', 7.0)");
				stmt.execute("INSERT INTO test VALUES (8, 'eight', 8.0)");
				stmt.execute("INSERT INTO test VALUES (9, 'nine', 9.0)");
				stmt.execute("INSERT INTO test VALUES (10, 'ten', 10.0)");
				ObjectChartDataModel objectChartDataModel = jdbcPlotter.createObjectChartDataModelInstance("SELECT * FROM test", "name", new String[] { "value" }, new String[] { "value" });
				assertEquals(1.0, objectChartDataModel.getValueAt(0, 0));
				assertEquals(2.0, objectChartDataModel.getValueAt(1, 0));
				assertEquals(3.0, objectChartDataModel.getValueAt(2, 0));
				assertEquals(4.0, objectChartDataModel.getValueAt(3, 0));
				assertEquals(5.0, objectChartDataModel.getValueAt(4, 0));
				assertEquals(6.0, objectChartDataModel.getValueAt(5, 0));
				assertEquals(7.0, objectChartDataModel.getValueAt(6, 0));
				assertEquals(8.0, objectChartDataModel.getValueAt(7, 0));
				assertEquals(9.0, objectChartDataModel.getValueAt(8, 0));
				assertEquals(10.0, objectChartDataModel.getValueAt(9, 0));
				assertEquals("one", objectChartDataModel.getColumnKey(0));
				assertEquals("two", objectChartDataModel.getColumnKey(1));
				assertEquals("three", objectChartDataModel.getColumnKey(2));
				assertEquals("four", objectChartDataModel.getColumnKey(3));
				assertEquals("five", objectChartDataModel.getColumnKey(4));
				assertEquals("six", objectChartDataModel.getColumnKey(5));
				assert