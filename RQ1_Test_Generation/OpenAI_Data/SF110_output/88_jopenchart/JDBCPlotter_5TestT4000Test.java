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
	* Test case for the method {@link JDBCPlotter#createObjectChartDataModelInstance(String, String, String[], String[])}.
	* It tests if the method returns a {@link ObjectChartDataModel} with the correct values.
	*/
	@Test
	void testCreateObjectChartDataModelInstance() {
		try {
			Class.forName("org.hsqldb.jdbcDriver");
			Connection conn = DriverManager.getConnection("jdbc:hsqldb:mem:test", "sa", "");
			Statement stmt = conn.createStatement();
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
			stmt.close();
			JDBCPlotter plotter = new JDBCPlotter("org.hsqldb.jdbcDriver", "jdbc:hsqldb:mem:test", "sa", "");
			ObjectChartDataModel model = plotter.createObjectChartDataModelInstance("SELECT * FROM test", "name", new String[] { "value" }, new String[] { "value" });
			assertEquals(1, model.getDataSetCount());
			assertEquals(10, model.getDataSetSize(0));
			assertEquals("one", model.getColumn(0));
			assertEquals("two", model.getColumn(1));
			assertEquals("three", model.getColumn(2));
			assertEquals("four", model.getColumn(3));
			assertEquals("five", model.getColumn(4));
			assertEquals("six", model.getColumn(5));
			assertEquals("seven", model.getColumn(6));
			assertEquals("eight", model.getColumn(7));
			assertEquals("nine", model.getColumn(8));
			assertEquals("ten", model.getColumn(9));
			assertEquals(1.0, model.getValue(0, 0));
			assertEquals(2.0, model.getValue(0, 1));
			assertEquals(3.0, model.getValue(0, 2));
			assertEquals(4.0, model.getValue(0, 3));
			assertEquals(5.0, model.getValue(0, 4));
			assertEquals(6.0, model.getValue(0, 5));
			assertEquals(7.0, model.getValue(0, 6));
			assertEquals(8.0, model.getValue(0, 7));
			assertEquals(9.0, model.getValue(0, 8));
			assertEquals(10.0, model.getValue(0, 9));
			conn.close();
		} catch (Exception e) {
			fail("Exception while performing task.");
		}
	}
}