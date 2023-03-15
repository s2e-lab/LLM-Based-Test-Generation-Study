// JDBCPlotter_2Test.java
package de.progra.charting.model;

import java.sql.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JDBCPlotter}.
* It contains ten unit test cases for the {@link JDBCPlotter#createChartDataModelInstance(String, String, String[])} method.
*/
class JDBCPlotter_2Test {

		/**
		* Test case for {@link JDBCPlotter#createChartDataModelInstance(String, String, String[])} method.
		* It tests the case when the SQL query is null.
		*/
		@Test
		void testCreateChartDataModelInstance_1() throws Exception {
				JDBCPlotter jdbcPlotter = new JDBCPlotter("org.hsqldb.jdbcDriver", "jdbc:hsqldb:mem:aname", "sa", "");
				String sqlQuery = null;
				String columnRow = "";
				String[] sqlRows = new String[] {};
				String[] dataSets = new String[] {};
				try {
						jdbcPlotter.createChartDataModelInstance(sqlQuery, columnRow, sqlRows, dataSets);
						fail("Expected an IllegalArgumentException to be thrown.");
				} catch (IllegalArgumentException e) {
						assertEquals("sqlQuery cannot be null.", e.getMessage());
				}
		}
		
		/**
		* Test case for {@link JDBCPlotter#createChartDataModelInstance(String, String, String[])} method.
		* It tests the case when the SQL query is empty.
		*/
		@Test
		void testCreateChartDataModelInstance_2() throws Exception {
				JDBCPlotter jdbcPlotter = new JDBCPlotter("org.hsqldb.jdbcDriver", "jdbc:hsqldb:mem:aname", "sa", "");
				String sqlQuery = "";
				String columnRow = "";
				String[] sqlRows = new String[] {};
				String[] dataSets = new String[] {};
				try {
						jdbcPlotter.createChartDataModelInstance(sqlQuery, columnRow, sqlRows, dataSets);
						fail("Expected an IllegalArgumentException to be thrown.");
				} catch (IllegalArgumentException e) {
						assertEquals("sqlQuery cannot be empty.", e.getMessage());
				}
		}
		
		/**
		* Test case for {@link JDBCPlotter#createChartDataModelInstance(String, String, String[])} method.
		* It tests the case when the columnRow is null.
		*/
		@Test
		void testCreateChartDataModelInstance_3() throws Exception {
				JDBCPlotter jdbcPlotter = new JDBCPlotter("org.hsqldb.jdbcDriver", "jdbc:hsqldb:mem:aname", "sa", "");
				String sqlQuery = "";
				String columnRow = null;
				String[] sqlRows = new String[] {};
				String[] dataSets = new String[] {};
				try {
						jdbcPlotter.createChartDataModelInstance(sqlQuery, columnRow, sqlRows, dataSets);
						fail("Expected an IllegalArgumentException to be thrown.");
				} catch (IllegalArgumentException e) {
						assertEquals("columnRow cannot be null.", e.getMessage());
				}
		}
		
		/**
		* Test case for {@link JDBCPlotter#createChartDataModelInstance(String, String, String[])} method.
		* It tests the case when the columnRow is empty.
		*/
		@Test
		void testCreateChartDataModelInstance_4() throws Exception {
				JDBCPlotter jdbcPlotter = new JDBCPlotter("org.hsqldb.jdbcDriver", "jdbc:hsqldb:mem:aname", "sa", "");
				String sqlQuery = "";
				String columnRow = "";
				String[] sqlRows = new String[] {};
				String[] dataSets = new String[] {};
				try {
						jdbcPlotter.createChartDataModelInstance(sqlQuery, columnRow, sqlRows, dataSets);
						fail("Expected an IllegalArgumentException to be thrown.");
				} catch (IllegalArgumentException e) {
						assertEquals("columnRow cannot be empty.", e.getMessage());
				}
		}
		
		/**
		* Test case for {@link JDBCPlotter#createChartDataModelInstance(String, String, String[])} method.
		* It tests the case when the sqlRows is null.
		*/
		@Test
		void testCreateChartDataModelInstance_5() throws Exception {
				JDBCPlotter jdbcPlotter = new JDBCPlotter("org.hsqldb.jdbcDriver", "jdbc:hsqldb:mem:aname", "sa", "");
				String sqlQuery = "";
				String columnRow = "";
				String[] sqlRows = null;
				String[] dataSets = new String[] {};
				try {
						jdbcPlotter.createChartDataModelInstance(sqlQuery, columnRow, sqlRows, dataSets);
						fail("Expected an IllegalArgumentException to be thrown.");
				} catch (IllegalArgumentException e) {
						assertEquals("sqlRows cannot be null.", e.getMessage());
				}
		}
		
		/**
		* Test case for {@link JDBCPlotter#createChartDataModelInstance(String, String, String[])} method.
		* It tests the case when the sqlRows is empty.
		*/
		@Test
		void testCreateChartDataModelInstance_6() throws Exception {
				JDBCPlotter jdbcPlotter = new JDBCPlotter("org.hsqldb.jdbcDriver", "jdbc:hsqldb:mem:aname", "sa", "");
				String sqlQuery = "";
				String columnRow = "";
				String[] sqlRows = new String[] {};
				String[] dataSets = new String[] {};
				try {
						jdbcPlotter.createChartDataModelInstance(sqlQuery, columnRow, sqlRows, dataSets);
						fail("Expected an IllegalArgumentException to be thrown.");
				} catch (IllegalArgumentException e) {
						assertEquals("sqlRows cannot be empty.", e.getMessage());
				}
		}
		
		/**
		* Test case for {@link JDBCPlotter#createChartDataModelInstance(String, String, String[])} method.
		* It tests the case when the dataSets is null.
		*/
		@Test
		void testCreateChartDataModelInstance_7() throws Exception {
				JDBCPlotter jdbcPlotter = new JDBCPlotter("org.hsqldb.jdbcDriver", "jdbc:hsqldb:mem:aname", "sa", "");
				String sqlQuery = "";
				String columnRow = "";
				String[] sqlRows = new String[] {};
				String[] dataSets = null;
				try {
						jdbcPlotter.createChartDataModelInstance(sqlQuery, columnRow, sqlRows, dataSets);
						fail("Expected an IllegalArgumentException to be thrown.");
				} catch (IllegalArgumentException e) {
						assertEquals("dataSets cannot be null.", e.getMessage());
				}
		}
		
		/**
		* Test case for {@link JDBCPlotter#createChartDataModelInstance(String, String, String[])} method.
		* It tests the case when the dataSets is empty.
		*/
		@Test
		void testCreateChartDataModelInstance_8() throws Exception {
				JDBCPlotter jdbcPlotter = new JDBCPlotter("org.hsqldb.jdbcDriver", "jdbc:hsqldb:mem:aname", "sa", "");
				String sqlQuery = "";
				String columnRow = "";
				String[] sqlRows = new String[] {};
				String[] dataSets = new String[] {};
				try {
						jdbcPlotter.createChartDataModelInstance(sqlQuery, columnRow, sqlRows, dataSets);
						fail("Expected an IllegalArgumentException to be thrown.");
				} catch (IllegalArgumentException e) {
						assertEquals("dataSets cannot be empty.", e.getMessage());
				}
		}
		
		/**
		* Test case for {@link JDBCPlotter#createChartDataModelInstance(String, String, String[])} method.
		* It tests the case when the dataSets and sqlRows have different lengths.
		*/
		@Test
		void testCreateChartDataModelInstance_9() throws Exception {
				JDBCPlotter jdbcPlotter = new JDBCPlotter("org.hsqldb.jdbcDriver", "jdbc:hsqldb:mem:aname", "sa", "");
				String sqlQuery = "";
				String columnRow = "";
				String[] sqlRows = new String[] {};
				String[] dataSets = new String[] {};
				try {
						jdbcPlotter.createChartDataModelInstance(sqlQuery, columnRow, sqlRows, dataSets);
						fail("Expected an IllegalArgumentException to be thrown.");
				} catch (IllegalArgumentException e) {
						assertEquals("dataSets and sqlRows must have the same length.", e.getMessage());
				}
		}
		
		/**
		* Test case for {@link JDBCPlotter#createChartDataModelInstance(String, String, String[])} method.
		* It tests the case when the dataSets and sqlRows have different lengths.
		*/
		@Test
		void testCreateChartDataModelInstance_10() throws Exception {
				JDBCPlotter jdbcPlotter = new JDBCPlotter("org.hsqldb.jdbcDriver", "jdbc:hsqldb:mem:aname", "sa", "");
				String sqlQuery = "";
				String columnRow = "";
				String[] sqlRows = new String[] {};
				String[] dataSets = new String[] {};
				try {
						jdbcPlotter.createChartDataModelInstance(sqlQuery, columnRow, sqlRows, dataSets);
						fail("Expected an IllegalArgumentException to be thrown.");
				} catch (IllegalArgumentException e) {
						assertEquals("dataSets and sqlRows must have the same length.", e.getMessage());
				}
		}
}