// JDBCPlotter_4Test.java
package de.progra.charting.model;

import java.sql.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JDBCPlotter}.
* It contains ten unit test cases for the {@link JDBCPlotter#createObjectChartDataModelInstance(String, String, String[])} method.
*/
class JDBCPlotter_4Test {

		/**
		* Test case for {@link JDBCPlotter#createObjectChartDataModelInstance(String, String, String[])} method.
		* It tests the method with a valid SQL query and valid row titles.
		* The columns are initialized with values from row columnRow.
		* @throws JDBCPlotterException if an exception occurs while performing task.
		*/
		@Test
		void testCreateObjectChartDataModelInstance_1() throws JDBCPlotterException {
				JDBCPlotter jdbcPlotter = new JDBCPlotter("org.hsqldb.jdbcDriver", "jdbc:hsqldb:hsql://localhost/xdb", "SA", "");
				String sqlQuery = "SELECT * FROM test";
				String columnRow = "column1";
				String[] sqlRows = {"column2", "column3"};
				ObjectChartDataModel objectChartDataModel = jdbcPlotter.createObjectChartDataModelInstance(sqlQuery, columnRow, sqlRows);
				assertEquals(2, objectChartDataModel.getDataSets().length);
				assertEquals(2, objectChartDataModel.getDataSets()[0].length);
				assertEquals(2, objectChartDataModel.getDataSets()[1].length);
				assertEquals(2, objectChartDataModel.getColumns().length);
				assertEquals("column1", objectChartDataModel.getColumns()[0]);
				assertEquals("column1", objectChartDataModel.getColumns()[1]);
				assertEquals(2.0, objectChartDataModel.getDataSets()[0][0]);
				assertEquals(3.0, objectChartDataModel.getDataSets()[0][1]);
				assertEquals(4.0, objectChartDataModel.getDataSets()[1][0]);
				assertEquals(5.0, objectChartDataModel.getDataSets()[1][1]);
		}
		
		/**
		* Test case for {@link JDBCPlotter#createObjectChartDataModelInstance(String, String, String[])} method.
		* It tests the method with a valid SQL query and valid row titles.
		* The columns are initialized with values from row columnRow.
		* @throws JDBCPlotterException if an exception occurs while performing task.
		*/
		@Test
		void testCreateObjectChartDataModelInstance_2() throws JDBCPlotterException {
				JDBCPlotter jdbcPlotter = new JDBCPlotter("org.hsqldb.jdbcDriver", "jdbc:hsqldb:hsql://localhost/xdb", "SA", "");
				String sqlQuery = "SELECT * FROM test";
				String columnRow = "column1";
				String[] sqlRows = {"column2", "column3"};
				String[] dataSets = {"column2", "column3"};
				ObjectChartDataModel objectChartDataModel = jdbcPlotter.createObjectChartDataModelInstance(sqlQuery, columnRow, sqlRows, dataSets);
				assertEquals(2, objectChartDataModel.getDataSets().length);
				assertEquals(2, objectChartDataModel.getDataSets()[0].length);
				assertEquals(2, objectChartDataModel.getDataSets()[1].length);
				assertEquals(2, objectChartDataModel.getColumns().length);
				assertEquals("column1", objectChartDataModel.getColumns()[0]);
				assertEquals("column1", objectChartDataModel.getColumns()[1]);
				assertEquals(2.0, objectChartDataModel.getDataSets()[0][0]);
				assertEquals(3.0, objectChartDataModel.getDataSets()[0][1]);
				assertEquals(4.0, objectChartDataModel.getDataSets()[1][0]);
				assertEquals(5.0, objectChartDataModel.getDataSets()[1][1]);
		}
		
		/**
		* Test case for {@link JDBCPlotter#createObjectChartDataModelInstance(String, String, String[])} method.
		* It tests the method with a valid SQL query and valid row titles.
		* The columns are initialized with values from row columnRow.
		* @throws JDBCPlotterException if an exception occurs while performing task.
		*/
		@Test
		void testCreateObjectChartDataModelInstance_3() throws JDBCPlotterException {
				JDBCPlotter jdbcPlotter = new JDBCPlotter("org.hsqldb.jdbcDriver", "jdbc:hsqldb:hsql://localhost/xdb", "SA", "");
				String sqlQuery = "SELECT * FROM test";
				String columnRow = "column1";
				String[] sqlRows = {"column2", "column3"};
				String[] dataSets = {"column2", "column3"};
				ObjectChartDataModel objectChartDataModel = jdbcPlotter.createObjectChartDataModelInstance(sqlQuery, columnRow, sqlRows, dataSets);
				assertEquals(2, objectChartDataModel.getDataSets().length);
				assertEquals(2, objectChartDataModel.getDataSets()[0].length);
				assertEquals(2, objectChartDataModel.getDataSets()[1].length);
				assertEquals(2, objectChartDataModel.getColumns().length);
				assertEquals("column1", objectChartDataModel.getColumns()[0]);
				assertEquals("column1", objectChartDataModel.getColumns()[1]);
				assertEquals(2.0, objectChartDataModel.getDataSets()[0][0]);
				assertEquals(3.0, objectChartDataModel.getDataSets()[0][1]);
				assertEquals(4.0, objectChartDataModel.getDataSets()[1][0]);
				assertEquals(5.0, objectChartDataModel.getDataSets()[1][1]);
		}
		
		/**
		* Test case for {@link JDBCPlotter#createObjectChartDataModelInstance(String, String, String[])} method.
		* It tests the method with a valid SQL query and valid row titles.
		* The columns are initialized with values from row columnRow.
		* @throws JDBCPlotterException if an exception occurs while performing task.
		*/
		@Test
		void testCreateObjectChartDataModelInstance_4() throws JDBCPlotterException {
				JDBCPlotter jdbcPlotter = new JDBCPlotter("org.hsqldb.jdbcDriver", "jdbc:hsqldb:hsql://localhost/xdb", "SA", "");
				String sqlQuery = "SELECT * FROM test";
				String columnRow = "column1";
				String[] sqlRows = {"column2", "column3"};
				String[] dataSets = {"column2", "column3"};
				ObjectChartDataModel objectChartDataModel = jdbcPlotter.createObjectChartDataModelInstance(sqlQuery, columnRow, sqlRows, dataSets);
				assertEquals(2, objectChartDataModel.getDataSets().length);
				assertEquals(2, objectChartDataModel.getDataSets()[0].length);
				assertEquals(2, objectChartDataModel.getDataSets()[1].length);
				assertEquals(2, objectChartDataModel.getColumns().length);
				assertEquals("column1", objectChartDataModel.getColumns()[0]);
				assertEquals("column1", objectChartDataModel.getColumns()[1]);
				assertEquals(2.0, objectChartDataModel.getDataSets()[0][0]);
				assertEquals(3.0, objectChartDataModel.getDataSets()[0][1]);
				assertEquals(4.0, objectChartDataModel.getDataSets()[1][0]);
				assertEquals(5.0, objectChartDataModel.getDataSets()[1][1]);
		}
		
		/**
		* Test case for {@link JDBCPlotter#createObjectChartDataModelInstance(String, String, String[])} method.
		* It tests the method with a valid SQL query and valid row titles.
		* The columns are initialized with values from row columnRow.
		* @throws JDBCPlotterException if an exception occurs while performing task.
		*/
		@Test
		void testCreateObjectChartDataModelInstance_5() throws JDBCPlotterException {
				JDBCPlotter jdbcPlotter = new JDBCPlotter("org.hsqldb.jdbcDriver", "jdbc:hsqldb:hsql://localhost/xdb", "SA", "");
				String sqlQuery = "SELECT * FROM test";
				String columnRow = "column1";
				String[] sqlRows = {"column2", "column3"};
				String[] dataSets = {"column2", "column3"};
				ObjectChartDataModel objectChartDataModel = jdbcPlotter.createObjectChartDataModelInstance(sqlQuery, columnRow, sqlRows, dataSets);
				assertEquals(2, objectChartDataModel.getDataSets().length);
				assertEquals(2, objectChartDataModel.getDataSets()[0].length);
				assertEquals(2, objectChartDataModel.getDataSets()[1].length);
				assertEquals(2, objectChartDataModel.getColumns().length);
				assertEquals("column1", objectChartDataModel.getColumns()[0]);
				assertEquals("column1", objectChartDataModel.getColumns()[1]);
				assertEquals(2.0, objectChartDataModel.getDataSets()[0][0]);
				assertEquals(3.0, objectChartDataModel.getDataSets()[0][1]);
				assertEquals(4.0, objectChartDataModel.getDataSets()[1][0]);
				assertEquals(5.0, objectChartDataModel.getDataSets()[1][1]);
		}
		
		/**
		* Test case for {@link JDBCPlotter#createObjectChartDataModelInstance(String, String, String[])} method.
		* It tests the method with a valid SQL query and valid row titles.
		* The columns are initialized with values from row columnRow.
		* @throws JDBCPlotterException if an exception occurs while performing task.
		*/
		@Test
		void testCreateObjectChartDataModelInstance_6() throws JDBCPlotterException {
				JDBCPlotter jdbcPlotter = new JDBCPlotter("org.hsqldb.jdbcDriver", "jdbc:hsqldb:hsql://localhost/xdb", "SA", "");
				String sqlQuery = "SELECT * FROM test";
				String columnRow = "column1";
				String[] sqlRows = {"column2", "column3"};
				String[] dataSets = {"column2", "column3"};
				ObjectChartDataModel objectChartDataModel = jdbcPlotter.createObjectChartDataModelInstance(sqlQuery, columnRow, sqlRows, dataSets);
				assertEquals(2, objectChartDataModel.getDataSets().length);
				assertEquals(2, objectChartDataModel.getDataSets()[0].length);
				assertEquals(2, objectChartDataModel.getDataSets()[1].length);
				assertEquals(2, objectChartDataModel.getColumns().length);
				assertEquals("column1", objectChartDataModel.getColumns()[0]);
				assertEquals("column1", objectChartDataModel.getColumns()[1]);
				assertEquals(2.0, objectChartDataModel.getDataSets()[0][0]);
				assertEquals(3.0, objectChartDataModel.getDataSets()[0][1]);
				assertEquals(4.0, objectChartDataModel.getDataSets()[1][0]);
				assertEquals(5.0, objectChartDataModel.getDataSets()[1][1]);
		}
		
		/**
		* Test case for {@link JDBCPlotter#createObjectChartDataModelInstance(String, String, String[])} method.
		* It tests the method with a valid SQL query and valid row titles.
		* The columns are initialized with values from row columnRow.
		* @throws JDBCPlotterException if an exception occurs while performing task.
		*/
		@Test
		void testCreateObjectChartDataModelInstance_7() throws JDBCPlotterException {
				JDBCPlotter jdbcPlotter = new JDBCPlotter("org.hsqldb.jdbcDriver", "jdbc:hsqldb:hsql://localhost/xdb", "SA", "");
				String sqlQuery = "SELECT * FROM test";
				String columnRow = "column1";
				String[] sqlRows = {"column2", "column3"};
				String[] dataSets = {"column2", "column3"};
				ObjectChartDataModel objectChartDataModel = jdbcPlotter.createObjectChartDataModelInstance(sqlQuery, columnRow, sqlRows, dataSets);
				assertEquals(2, objectChartDataModel.getDataSets().length);
				assertEquals(2, objectChartDataModel.getDataSets()[0].length);
				assertEquals(2, objectChartDataModel.getDataSets()[1].length);
				assertEquals(2, objectChartDataModel.getColumns().length);
				assertEquals("column1", objectChartDataModel.getColumns()[0]);
				assertEquals("column1", objectChartDataModel.getColumns()[1]);
				assertEquals(2.0, objectChartDataModel.getDataSets()[0][0]);
				assertEquals(3.0, objectChartDataModel.getDataSets()[0][1]);
				assertEquals(4.0, objectChartDataModel.getDataSets()[1][0]);
				assertEquals(5.0, objectChartDataModel.getDataSets()[1][1]);
		}
		
		/**
		* Test case for {@link JDBCPlotter#createObjectChartDataModelInstance(String, String, String[])} method.
		* It tests the method with a valid SQL query and valid row titles.
		* The columns are initialized with values from row columnRow.
		* @throws JDBCPlotterException if an exception occurs while performing task.
		*/
		@Test
		void testCreateObjectChartDataModelInstance_8() throws JDBCPlotterException {
				JDBCPlotter jdbcPlotter = new JDBCPlotter("org.hsqldb.jdbcDriver", "jdbc:hsqldb:hsql://localhost/xdb", "SA", "");
				String sqlQuery = "SELECT * FROM