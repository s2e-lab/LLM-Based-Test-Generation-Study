// JDBCPlotter_3Test.java
package de.progra.charting.model;

import java.sql.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JDBCPlotter}.
* It contains ten unit test cases for the {@link JDBCPlotter#createChartDataModelInstance(String, String, String[], String[])} method.
*/
class JDBCPlotter_3Test {

	/**
	* Test case for the {@link JDBCPlotter#createChartDataModelInstance(String, String, String[], String[])} method.
	* It tests if the method returns a {@link DefaultChartDataModel} with the correct values.
	*/
	@Test
	void testCreateChartDataModelInstance_1() throws Exception {
		JDBCPlotter jdbcPlotter = new JDBCPlotter("org.hsqldb.jdbcDriver", "jdbc:hsqldb:mem:aname", "sa", "");
		jdbcPlotter.conn.createStatement().execute("CREATE TABLE test (col1 INTEGER, col2 INTEGER, col3 INTEGER)");
		jdbcPlotter.conn.createStatement().execute("INSERT INTO test VALUES (1, 2, 3)");
		jdbcPlotter.conn.createStatement().execute("INSERT INTO test VALUES (4, 5, 6)");
		jdbcPlotter.conn.createStatement().execute("INSERT INTO test VALUES (7, 8, 9)");
		DefaultChartDataModel result = jdbcPlotter.createChartDataModelInstance("SELECT * FROM test", "col1", new String[] { "col2", "col3" }, new String[] { "col2", "col3" });
		assertEquals(3, result.getColumnCount());
		assertEquals(2, result.getDataSetCount());
		assertEquals(1.0, result.getValueAt(0, 0).doubleValue());
		assertEquals(2.0, result.getValueAt(0, 1).doubleValue());
		assertEquals(3.0, result.getValueAt(0, 2).doubleValue());
		assertEquals(4.0, result.getValueAt(1, 0).doubleValue());
		assertEquals(5.0, result.getValueAt(1, 1).doubleValue());
		assertEquals(6.0, result.getValueAt(1, 2).doubleValue());
		assertEquals(7.0, result.getValueAt(2, 0).doubleValue());
		assertEquals(8.0, result.getValueAt(2, 1).doubleValue());
		assertEquals(9.0, result.getValueAt(2, 2).doubleValue());
		assertEquals(1.0, result.getColumnAt(0).doubleValue());
		assertEquals(4.0, result.getColumnAt(1).doubleValue());
		assertEquals(7.0, result.getColumnAt(2).doubleValue());
		assertEquals("col2", result.getDataSetTitleAt(0));
		assertEquals("col3", result.getDataSetTitleAt(1));
	}
	
	/**
	* Test case for the {@link JDBCPlotter#createChartDataModelInstance(String, String, String[], String[])} method.
	* It tests if the method returns a {@link DefaultChartDataModel} with the correct values.
	*/
	@Test
	void testCreateChartDataModelInstance_2() throws Exception {
		JDBCPlotter jdbcPlotter = new JDBCPlotter("org.hsqldb.jdbcDriver", "jdbc:hsqldb:mem:aname", "sa", "");
		jdbcPlotter.conn.createStatement().execute("CREATE TABLE test (col1 INTEGER, col2 INTEGER, col3 INTEGER)");
		jdbcPlotter.conn.createStatement().execute("INSERT INTO test VALUES (1, 2, 3)");
		jdbcPlotter.conn.createStatement().execute("INSERT INTO test VALUES (4, 5, 6)");
		jdbcPlotter.conn.createStatement().execute("INSERT INTO test VALUES (7, 8, 9)");
		DefaultChartDataModel result = jdbcPlotter.createChartDataModelInstance("SELECT * FROM test", "col1", new String[] { "col2", "col3" }, new String[] { "col2", "col3" });
		assertEquals(3, result.getColumnCount());
		assertEquals(2, result.getDataSetCount());
		assertEquals(1.0, result.getValueAt(0, 0).doubleValue());
		assertEquals(2.0, result.getValueAt(0, 1).doubleValue());
		assertEquals(3.0, result.getValueAt(0, 2).doubleValue());
		assertEquals(4.0, result.getValueAt(1, 0).doubleValue());
		assertEquals(5.0, result.getValueAt(1, 1).doubleValue());
		assertEquals(6.0, result.getValueAt(1, 2).doubleValue());
		assertEquals(7.0, result.getValueAt(2, 0).doubleValue());
		assertEquals(8.0, result.getValueAt(2, 1).doubleValue());
		assertEquals(9.0, result.getValueAt(2, 2).doubleValue());
		assertEquals(1.0, result.getColumnAt(0).doubleValue());
		assertEquals(4.0, result.getColumnAt(1).doubleValue());
		assertEquals(7.0, result.getColumnAt(2).doubleValue());
		assertEquals("col2", result.getDataSetTitleAt(0));
		assertEquals("col3", result.getDataSetTitleAt(1));
	}
	
	/**
	* Test case for the {@link JDBCPlotter#createChartDataModelInstance(String, String, String[], String[])} method.
	* It tests if the method returns a {@link DefaultChartDataModel} with the correct values.
	*/
	@Test
	void testCreateChartDataModelInstance_3() throws Exception {
		JDBCPlotter jdbcPlotter = new JDBCPlotter("org.hsqldb.jdbcDriver", "jdbc:hsqldb:mem:aname", "sa", "");
		jdbcPlotter.conn.createStatement().execute("CREATE TABLE test (col1 INTEGER, col2 INTEGER, col3 INTEGER)");
		jdbcPlotter.conn.createStatement().execute("INSERT INTO test VALUES (1, 2, 3)");
		jdbcPlotter.conn.createStatement().execute("INSERT INTO test VALUES (4, 5, 6)");
		jdbcPlotter.conn.createStatement().execute("INSERT INTO test VALUES (7, 8, 9)");
		DefaultChartDataModel result = jdbcPlotter.createChartDataModelInstance("SELECT * FROM test", "col1", new String[] { "col2", "col3" }, new String[] { "col2", "col3" });
		assertEquals(3, result.getColumnCount());
		assertEquals(2, result.getDataSetCount());
		assertEquals(1.0, result.getValueAt(0, 0).doubleValue());
		assertEquals(2.0, result.getValueAt(0, 1).doubleValue());
		assertEquals(3.0, result.getValueAt(0, 2).doubleValue());
		assertEquals(4.0, result.getValueAt(1, 0).doubleValue());
		assertEquals(5.0, result.getValueAt(1, 1).doubleValue());
		assertEquals(6.0, result.getValueAt(1, 2).doubleValue());
		assertEquals(7.0, result.getValueAt(2, 0).doubleValue());
		assertEquals(8.0, result.getValueAt(2, 1).doubleValue());
		assertEquals(9.0, result.getValueAt(2, 2).doubleValue());
		assertEquals(1.0, result.getColumnAt(0).doubleValue());
		assertEquals(4.0, result.getColumnAt(1).doubleValue());
		assertEquals(7.0, result.getColumnAt(2).doubleValue());
		assertEquals("col2", result.getData