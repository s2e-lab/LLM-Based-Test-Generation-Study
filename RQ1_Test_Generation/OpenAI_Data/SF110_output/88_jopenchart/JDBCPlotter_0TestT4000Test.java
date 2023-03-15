// JDBCPlotter_0Test.java
package de.progra.charting.model;

import java.sql.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JDBCPlotter}.
* It contains ten unit test cases for the {@link JDBCPlotter#createChartDataModelInstance(String, String[])} method.
*/
class JDBCPlotter_0Test {

		/**
		* Test case for the method {@link JDBCPlotter#createChartDataModelInstance(String, String[])}.
		* It tests if the method returns a {@link DefaultChartDataModel} with the correct values.
		*/
		@Test
		void testCreateChartDataModelInstance_0() throws Exception {
				JDBCPlotter jdbcPlotter = new JDBCPlotter("org.hsqldb.jdbcDriver", "jdbc:hsqldb:mem:aname", "sa", "");
				jdbcPlotter.conn.createStatement().execute("CREATE TABLE test (a INTEGER, b INTEGER, c INTEGER)");
				jdbcPlotter.conn.createStatement().execute("INSERT INTO test VALUES (1, 2, 3)");
				jdbcPlotter.conn.createStatement().execute("INSERT INTO test VALUES (4, 5, 6)");
				jdbcPlotter.conn.createStatement().execute("INSERT INTO test VALUES (7, 8, 9)");
				DefaultChartDataModel chartDataModel = jdbcPlotter.createChartDataModelInstance("SELECT * FROM test", new String[] { "a", "b", "c" });
				assertEquals(3, chartDataModel.getDataSets().length);
				assertEquals(3, chartDataModel.getDataSets()[0].length);
				assertEquals(3, chartDataModel.getDataSets()[1].length);
				assertEquals(3, chartDataModel.getDataSets()[2].length);
				assertEquals(3, chartDataModel.getColumnCount());
				assertEquals(1.0, chartDataModel.getColumn(0));
				assertEquals(2.0, chartDataModel.getColumn(1));
				assertEquals(3.0, chartDataModel.getColumn(2));
				assertEquals(1.0, chartDataModel.getValue(0, 0));
				assertEquals(2.0, chartDataModel.getValue(0, 1));
				assertEquals(3.0, chartDataModel.getValue(0, 2));
				assertEquals(4.0, chartDataModel.getValue(1, 0));
				assertEquals(5.0, chartDataModel.getValue(1, 1));
				assertEquals(6.0, chartDataModel.getValue(1, 2));
				assertEquals(7.0, chartDataModel.getValue(2, 0));
				assertEquals(8.0, chartDataModel.getValue(2, 1));
				assertEquals(9.0, chartDataModel.getValue(2, 2));
		}
		
		/**
		* Test case for the method {@link JDBCPlotter#createChartDataModelInstance(String, String[])}.
		* It tests if the method returns a {@link DefaultChartDataModel} with the correct values.
		*/
		@Test
		void testCreateChartDataModelInstance_1() throws Exception {
				JDBCPlotter jdbcPlotter = new JDBCPlotter("org.hsqldb.jdbcDriver", "jdbc:hsqldb:mem:aname", "sa", "");
				jdbcPlotter.conn.createStatement().execute("CREATE TABLE test (a INTEGER, b INTEGER, c INTEGER)");
				jdbcPlotter.conn.createStatement().execute("INSERT INTO test VALUES (1, 2, 3)");
				jdbcPlotter.conn.createStatement().execute("INSERT INTO test VALUES (4, 5, 6)");
				jdbcPlotter.conn.createStatement().execute("INSERT INTO test VALUES (7, 8, 9)");
				DefaultChartDataModel chartDataModel = jdbcPlotter.createChartDataModelInstance("SELECT * FROM test", new String[] { "a", "b", "c" }, new String[] { "A", "B", "C" });
				assertEquals(3, chartDataModel.getDataSets().length);
				assertEquals(3, chartDataModel.getDataSets()[0].length);
				assertEquals(3, chartDataModel.getDataSets()[1].length);
				assertEquals(3, chartDataModel.getDataSets()[2].length);
				assertEquals(3, chartDataModel.getColumnCount());
				assertEquals(1.0, chartDataModel.getColumn(0));
				assertEquals(2.0, chartDataModel.getColumn(1));
				assertEquals(3.0, chartDataModel.getColumn(2));
				assertEquals(1.0, chartDataModel.getValue(0, 0));
				assertEquals(2.0, chartDataModel.getValue(0, 1));
				assertEquals(3.0, chartDataModel.getValue(0, 2));
				assertEquals(4.0, chartDataModel.getValue(1, 0));
				assertEquals(5.0, chartDataModel.getValue(1, 1));
				assertEquals(6.0, chartDataModel.getValue(1, 2));
				assertEquals(7.0, chartDataModel.getValue(2, 0));
				assertEquals(8.0, chartDataModel.getValue(2, 1));
				assertEquals(9.0, chartDataModel.getValue(2, 2));
		}
		
		/**
		* Test case for the method {@link JDBCPlotter#createChartDataModelInstance(String, String, String[])}.
		* It tests if the method returns a {@link DefaultChartDataModel} with the correct values.
		*/
		@Test
		void testCreateChartDataModelInstance_2() throws Exception {
				JDBCPlotter jdbcPlotter = new JDBCPlotter("org.hsqldb.jdbcDriver", "jdbc:hsqldb:mem:aname", "sa", "");
				jdbcPlotter.conn.createStatement().execute("CREATE TABLE test (a INTEGER, b INTEGER, c INTEGER)");
				jdbcPlotter.conn.createStatement().execute("INSERT INTO test VALUES (1, 2, 3)");
				jdbcPlotter.conn.createStatement().execute("INSERT INTO test VALUES (4, 5, 6)");
				jdbcPlotter.conn.createStatement().execute("INSERT INTO test VALUES (7, 8, 9)");
				DefaultChartDataModel chartDataModel = jdbcPlotter.createChartDataModelInstance("SELECT * FROM test", "a", new String[] { "b", "c" });
				assertEquals(2, chartDataModel.getDataSets().length);
				assertEquals(3, chartDataModel.getDataSets()[0].length);
				assertEquals(3, chartDataModel.getDataSets()[1].length);
				assertEquals(3, chartDataModel.getColumnCount());
				assertEquals(1.0, chartDataModel.getColumn(0));
				assertEquals(4.0, chartDataModel.getColumn(1));
				assertEquals(7.0, chartDataModel.getColumn(2));
				assertEquals(2.0, chartDataModel.getValue(0, 0));
				assertEquals(5.0, chartDataModel.getValue(0, 1));
				assertEquals(8.0, chartDataModel.getValue(0, 2));
				assertEquals(3.0, chartDataModel.getValue(1, 0));
				assertEquals(6.0, chartDataModel.getValue(1, 1));
				assertEquals(9.0, chartDataModel.getValue(1, 2));
		}
		
		/**
		* Test case for the method {@link JDBCPlotter#createChartDataModelInstance(String, String, String[])}.
		* It tests if the method returns a {@link DefaultChartDataModel} with the correct values.
		*/
		@Test
		void testCreateChartDataModelInstance_3() throws Exception {
				JDBCPlotter jdbcPlotter = new JDBCPlotter("org.hsqldb.jdbcDriver", "jdbc:hsqldb:mem:aname", "sa", "");
				jdbcPlotter.conn.createStatement().execute("CREATE TABLE test (a INTEGER, b INTEGER, c INTEGER)");
				jdbcPlotter.conn.createStatement().execute("INSERT INTO test VALUES (1, 2, 3)");
				jdbcPlotter.conn.createStatement().execute("INSERT INTO test VALUES (4, 5, 6)");
				jdbcPlotter.conn.createStatement().execute("INSERT INTO test VALUES (7, 8, 9)");
				DefaultChartDataModel chartDataModel = jdbcPlotter.createChartDataModelInstance("SELECT * FROM test", "a", new String[] { "b", "c" }, new String[] { "B", "C" });
				assertEquals(2, chartDataModel.getDataSets().length);
				assertEquals(3, chartDataModel.getDataSets()[0].length);
				assertEquals(3, chartDataModel.getDataSets()[1].length);
				assertEquals(3, chartDataModel.getColumnCount());
				assertEquals(1.0, chartDataModel.getColumn(0));
				assertEquals(4.0, chartDataModel.getColumn(1));
				assertEquals(7.0, chartDataModel.getColumn(2));
				assertEquals(2.0, chartDataModel.getValue(0, 0));
				assertEquals(5.0, chartDataModel.getValue(0, 1));
				assertEquals(8.0, chartDataModel.getValue(0, 2));
				assertEquals(3.0, chartDataModel.getValue(1, 0));
				assertEquals(6.0, chartDataModel.getValue(1, 1));
				assertEquals(9.0, chartDataModel.getValue(1, 2));
		}
		
		/**
		* Test case for the method {@link JDBCPlotter#createObjectChartDataModelInstance(String, String, String[])}.
		* It tests if the method returns a {@link ObjectChartDataModel} with the correct values.
		*/
		@Test
		void testCreateObjectChartDataModelInstance_0() throws Exception {
				JDBCPlotter jdbcPlotter = new JDBCPlotter("org.hsqldb.jdbcDriver", "jdbc:hsqldb:mem:aname", "sa", "");
				jdbcPlotter.conn.createStatement().execute("CREATE TABLE test (a INTEGER, b INTEGER, c INTEGER)");
				jdbcPlotter.conn.createStatement().execute("INSERT INTO test VALUES (1, 2, 3)");
				jdbcPlotter.conn.createStatement().execute("INSERT INTO test VALUES (4, 5, 6)");
				jdbcPlotter.conn.createStatement().execute("INSERT INTO test VALUES (7, 8, 9)");
				ObjectChartDataModel chartDataModel = jdbcPlotter.createObjectChartDataModelInstance("SELECT * FROM test", "a", new String[] { "b", "c" });
				assertEquals(2, chartDataModel.getDataSets().length);
				assertEquals(3, chartDataModel.getDataSets()[0].length);
				assertEquals(3, chartDataModel.getDataSets()[1].length);
				assertEquals(3, chartDataModel.getColumnCount());
				assertEquals("1", chartDataModel.getColumn(0));
				assertEquals("4", chartDataModel.getColumn(1));
				assertEquals("7", chartDataModel.getColumn(2));
				assertEquals(2.0, chartDataModel.getValue(0, 0));
				assertEquals(5.0, chartDataModel.getValue(0, 1));
				assertEquals(8.0, chartDataModel.getValue(0, 2));
				assertEquals(3.0, chartDataModel.getValue(1, 0));
				assertEquals(6.0, chartDataModel.getValue(1, 1));
				assertEquals(9.0, chartDataModel.getValue(1, 2));
		}
		
		/**
		* Test case for the method {@link JDBCPlotter#createObjectChartDataModelInstance(String, String, String[])}.
		* It tests if the method returns a {@link ObjectChartDataModel} with the correct values.
		*/
		@Test
		void testCreateObjectChartDataModelInstance_1() throws Exception {
				JDBCPlotter jdbcPlotter = new JDBCPlotter("org.hsqldb.jdbcDriver", "jdbc:hsqldb:mem:aname", "sa", "");
				jdbcPlotter.conn.createStatement().execute("CREATE TABLE test (a INTEGER, b INTEGER, c INTEGER)");
				jdbcPlotter.conn.createStatement().execute("INSERT INTO test VALUES (1, 2, 3)");
				jdbcPlotter.conn.createStatement().execute("INSERT INTO test VALUES (4, 5, 6)");
				jdbcPlotter.conn.createStatement().execute("INSERT INTO test VALUES (7, 8, 9)");
				ObjectChartDataModel chartDataModel = jdbcPlotter.createObjectChartDataModelInstance("SELECT * FROM test", "a", new String[] { "b", "c" }, new String[] { "B", "C" });
				assertEquals(2, chartDataModel.getDataSets().length);
				assertEquals(3, chartDataModel.getDataSets()[0].length);
				assertEquals(3, chartDataModel.getDataSets()[1].length);
				assertEquals(3, chartDataModel.getColumnCount());
				assertEquals("1", chartDataModel.getColumn(0));
				assertEquals("4", chartDataModel.getColumn(1));
				assertEquals("7", chartDataModel.getColumn(2));
				assertEquals(2.0, chartDataModel.getValue(0, 0));
				assertEquals(5.0, chartDataModel.getValue(0, 1));
				assertEquals(8.0, chartDataModel.getValue(0, 2));
				assertEquals(3.0, chartDataModel.getValue(1, 0));
				assertEquals(6.0, chartDataModel.getValue(1, 1));
				assertEquals(9.0, chartDataModel.getValue(1, 2));
		}
		
}