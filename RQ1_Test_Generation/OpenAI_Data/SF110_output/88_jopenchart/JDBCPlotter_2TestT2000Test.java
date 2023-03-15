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
		* It tests the method with a valid SQL query and valid row titles.
		* The columns are initialized with values from columnRow.
		* @throws JDBCPlotterException if an error occurs while creating a database connection or while performing task.
		*/
		@Test
		void testCreateChartDataModelInstance_1() throws JDBCPlotterException {
				JDBCPlotter jdbcPlotter = new JDBCPlotter("org.hsqldb.jdbcDriver", "jdbc:hsqldb:hsql://localhost/xdb", "SA", "");
				String sqlQuery = "SELECT * FROM test";
				String columnRow = "column";
				String[] sqlRows = {"row1", "row2", "row3"};
				DefaultChartDataModel defaultChartDataModel = jdbcPlotter.createChartDataModelInstance(sqlQuery, columnRow, sqlRows);
				assertEquals(3, defaultChartDataModel.getDataSetCount());
				assertEquals(3, defaultChartDataModel.getDataSetSize());
				assertEquals(3, defaultChartDataModel.getColumnCount());
				assertEquals(1.0, defaultChartDataModel.getValue(0, 0).doubleValue());
				assertEquals(2.0, defaultChartDataModel.getValue(0, 1).doubleValue());
				assertEquals(3.0, defaultChartDataModel.getValue(0, 2).doubleValue());
				assertEquals(4.0, defaultChartDataModel.getValue(1, 0).doubleValue());
				assertEquals(5.0, defaultChartDataModel.getValue(1, 1).doubleValue());
				assertEquals(6.0, defaultChartDataModel.getValue(1, 2).doubleValue());
				assertEquals(7.0, defaultChartDataModel.getValue(2, 0).doubleValue());
				assertEquals(8.0, defaultChartDataModel.getValue(2, 1).doubleValue());
				assertEquals(9.0, defaultChartDataModel.getValue(2, 2).doubleValue());
				assertEquals(1.0, defaultChartDataModel.getColumn(0).doubleValue());
				assertEquals(2.0, defaultChartDataModel.getColumn(1).doubleValue());
				assertEquals(3.0, defaultChartDataModel.getColumn(2).doubleValue());
				assertEquals("row1", defaultChartDataModel.getDataSetTitle(0));
				assertEquals("row2", defaultChartDataModel.getDataSetTitle(1));
				assertEquals("row3", defaultChartDataModel.getDataSetTitle(2));
		}
		
		/**
		* Test case for {@link JDBCPlotter#createChartDataModelInstance(String, String, String[])} method.
		* It tests the method with a valid SQL query and valid row titles.
		* The columns are initialized with values from columnRow.
		* @throws JDBCPlotterException if an error occurs while creating a database connection or while performing task.
		*/
		@Test
		void testCreateChartDataModelInstance_2() throws JDBCPlotterException {
				JDBCPlotter jdbcPlotter = new JDBCPlotter("org.hsqldb.jdbcDriver", "jdbc:hsqldb:hsql://localhost/xdb", "SA", "");
				String sqlQuery = "SELECT * FROM test";
				String columnRow = "column";
				String[] sqlRows = {"row1", "row2", "row3"};
				String[] dataSets = {"dataSet1", "dataSet2", "dataSet3"};
				DefaultChartDataModel defaultChartDataModel = jdbcPlotter.createChartDataModelInstance(sqlQuery, columnRow, sqlRows, dataSets);
				assertEquals(3, defaultChartDataModel.getDataSetCount());
				assertEquals(3, defaultChartDataModel.getDataSetSize());
				assertEquals(3, defaultChartDataModel.getColumnCount());
				assertEquals(1.0, defaultChartDataModel.getValue(0, 0).doubleValue());
				assertEquals(2.0, defaultChartDataModel.getValue(0, 1).doubleValue());
				assertEquals(3.0, defaultChartDataModel.getValue(0, 2).doubleValue());
				assertEquals(4.0, defaultChartDataModel.getValue(1, 0).doubleValue());
				assertEquals(5.0, defaultChartDataModel.getValue(1, 1).doubleValue());
				assertEquals(6.0, defaultChartDataModel.getValue(1, 2).doubleValue());
				assertEquals(7.0, defaultChartDataModel.getValue(2, 0).doubleValue());
				assertEquals(8.0, defaultChartDataModel.getValue(2, 1).doubleValue());
				assertEquals(9.0, defaultChartDataModel.getValue(2, 2).doubleValue());
				assertEquals(1.0, defaultChartDataModel.getColumn(0).doubleValue());
				assertEquals(2.0, defaultChartDataModel.getColumn(1).doubleValue());
				assertEquals(3.0, defaultChartDataModel.getColumn(2).doubleValue());
				assertEquals("dataSet1", defaultChartDataModel.getDataSetTitle(0));
				assertEquals("dataSet2", defaultChartDataModel.getDataSetTitle(1));
				assertEquals("dataSet3", defaultChartDataModel.getDataSetTitle(2));
		}
		
		/**
		* Test case for {@link JDBCPlotter#createChartDataModelInstance(String, String, String[])} method.
		* It tests the method with a valid SQL query and valid row titles.
		* The columns are initialized with values from columnRow.
		* @throws JDBCPlotterException if an error occurs while creating a database connection or while performing task.
		*/
		@Test
		void testCreateChartDataModelInstance_3() throws JDBCPlotterException {
				JDBCPlotter jdbcPlotter = new JDBCPlotter("org.hsqldb.jdbcDriver", "jdbc:hsqldb:hsql://localhost/xdb", "SA", "");
				String sqlQuery = "SELECT * FROM test";
				String columnRow = "column";
				String[] sqlRows = {"row1", "row2", "row3"};
				ObjectChartDataModel objectChartDataModel = jdbcPlotter.createObjectChartDataModelInstance(sqlQuery, columnRow, sqlRows);
				assertEquals(3, objectChartDataModel.getDataSetCount());
				assertEquals(3, objectChartDataModel.getDataSetSize());
				assertEquals(3, objectChartDataModel.getColumnCount());
				assertEquals(1.0, objectChartDataModel.getValue(0, 0).doubleValue());
				assertEquals(2.0, objectChartDataModel.getValue(0, 1).doubleValue());
				assertEquals(3.0, objectChartDataModel.getValue(0, 2).doubleValue());
				assertEquals(4.0, objectChartDataModel.getValue(1, 0).doubleValue());
				assertEquals(5.0, objectChartDataModel.getValue(1, 1).doubleValue());
				assertEquals(6.0, objectChartDataModel.getValue(1, 2).double