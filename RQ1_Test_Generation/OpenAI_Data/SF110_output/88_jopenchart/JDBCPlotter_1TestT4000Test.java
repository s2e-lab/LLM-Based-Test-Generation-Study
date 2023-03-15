// JDBCPlotter_1Test.java
package de.progra.charting.model;

import java.sql.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JDBCPlotter}.
* It contains ten unit test cases for the {@link JDBCPlotter#createChartDataModelInstance(String, String[], String[])} method.
*/
class JDBCPlotter_1Test {

		/**
		 * Test case for {@link JDBCPlotter#createChartDataModelInstance(String, String[], String[])}
		 * with a valid SQL query and valid row titles.
		 * The columns are initialized with values starting from 0.
		 * @throws JDBCPlotterException if an error occurs while creating the ChartDataModel
		 */
		@Test
		void testCreateChartDataModelInstance_1() throws JDBCPlotterException {
				JDBCPlotter jdbcPlotter = new JDBCPlotter("org.hsqldb.jdbcDriver", "jdbc:hsqldb:mem:aname", "sa", "");
				String sqlQuery = "SELECT * FROM test";
				String[] sqlRows = {"a", "b", "c"};
				DefaultChartDataModel chartDataModel = jdbcPlotter.createChartDataModelInstance(sqlQuery, sqlRows);
				assertEquals(3, chartDataModel.getDataSets().length);
				assertEquals(3, chartDataModel.getDataSets()[0].length);
				assertEquals(3, chartDataModel.getDataSets()[1].length);
				assertEquals(3, chartDataModel.getDataSets()[2].length);
				assertEquals(3, chartDataModel.getColumnCount());
				assertEquals(0.0, chartDataModel.getColumn(0));
				assertEquals(1.0, chartDataModel.getColumn(1));
				assertEquals(2.0, chartDataModel.getColumn(2));
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
		 * Test case for {@link JDBCPlotter#createChartDataModelInstance(String, String[], String[])}
		 * with a valid SQL query and valid row titles.
		 * The columns are initialized with values starting from 0.
		 * @throws JDBCPlotterException if an error occurs while creating the ChartDataModel
		 */
		@Test
		void testCreateChartDataModelInstance_2() throws JDBCPlotterException {
				JDBCPlotter jdbcPlotter = new JDBCPlotter("org.hsqldb.jdbcDriver", "jdbc:hsqldb:mem:aname", "sa", "");
				String sqlQuery = "SELECT * FROM test";
				String[] sqlRows = {"a", "b", "c"};
				String[] dataSets = {"A", "B", "C"};
				DefaultChartDataModel chartDataModel = jdbcPlotter.createChartDataModelInstance(sqlQuery, sqlRows, dataSets);
				assertEquals(3, chartDataModel.getDataSets().length);
				assertEquals(3, chartDataModel.getDataSets()[0].length);
				assertEquals(3, chartDataModel.getDataSets()[1].length);
				assertEquals(3, chartDataModel.getDataSets()[2].length);
				assertEquals(3, chartDataModel.getColumnCount());
				assertEquals(0.0, chartDataModel.getColumn(0));
				assertEquals(1.0, chartDataModel.getColumn(1));
				assertEquals(2.0, chartDataModel.getColumn(2));
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
		 * Test case for {@link JDBCPlotter#createChartDataModelInstance(String, String[], String[])}
		 * with a valid SQL query and valid row titles.
		 * The columns are initialized with values from columnRow.
		 * @throws JDBCPlotterException if an error occurs while creating the ChartDataModel
		 */
		@Test
		void testCreateChartDataModelInstance_3() throws JDBCPlotterException {
				JDBCPlotter jdbcPlotter = new JDBCPlotter("org.hsqldb.jdbcDriver", "jdbc:hsqldb:mem:aname", "sa", "");
				String sqlQuery = "SELECT * FROM test";
				String columnRow = "a";
				String[] sqlRows = {"b", "c"};
				DefaultChartDataModel chartDataModel = jdbcPlotter.createChartDataModelInstance(sqlQuery, columnRow, sqlRows);
				assertEquals(2, chartDataModel.getDataSets().length);
				assertEquals(3, chartDataModel.getDataSets()[0].length);
				assertEquals(3, chartDataModel.getDataSets()[1].length);
				assertEquals(3, chartDataModel.getColumnCount());
				assertEquals(1.0, chartDataModel.getColumn(0));
				assertEquals(2.0, chartDataModel.getColumn(1));
				assertEquals(3.0, chartDataModel.getColumn(2));
				assertEquals(2.0, chartDataModel.getValue(0, 0));
				assertEquals(3.0, chartDataModel.getValue(0, 1));
				assertEquals(4.0, chartDataModel.getValue(0, 2));
				assertEquals(5.0, chartDataModel.getValue(1, 0));
				assertEquals(6.0, chartDataModel.getValue(1, 1));
				assertEquals(7.0, chartDataModel.getValue(1, 2));
		}
		
		/**
		 * Test case for {@link JDBCPlotter#createChartDataModelInstance(String, String[], String[])}
		 * with a valid SQL query and valid row titles.
		 * The columns are initialized with values from columnRow.
		 * @throws JDBCPlotterException if an error occurs while creating the ChartDataModel
		 */
		@Test
		void testCreateChartDataModelInstance_4() throws JDBCPlotterException {
				JDBCPlotter jdbcPlotter = new JDBCPlotter("org.hsqldb.jdbcDriver", "jdbc:hsqldb:mem:aname", "sa", "");
				String sqlQuery = "SELECT * FROM test";
				String columnRow = "a";
				String[] sqlRows = {"b", "c"};
				String[] dataSets = {"B", "C"};
				DefaultChartDataModel chartDataModel = jdbcPlotter.createChartDataModelInstance(sqlQuery, columnRow, sqlRows, dataSets);
				assertEquals(2, chartDataModel.getDataSets().length);
				assertEquals(3, chartDataModel.getDataSets()[0].length);
				assertEquals(3, chartDataModel.getDataSets()[1].length);
				assertEquals(3, chartDataModel.getColumnCount());
				assertEquals(1.0, chartDataModel.getColumn(0));
				assertEquals(2.0, chartDataModel.getColumn(1));
				assertEquals(3.0, chartDataModel.getColumn(2));
				assertEquals(2.0, chartDataModel.getValue(0, 0));
				assertEquals(3.0, chartDataModel.getValue(0, 1));
				assertEquals(4.0, chartDataModel.getValue(0, 2));
				assertEquals(5.0, chartDataModel.getValue(1, 0));
				assertEquals(6.0, chartDataModel.getValue(1, 1));
				assertEquals(7.0, chartDataModel.getValue(1, 2));
		}
		
		/**
		 * Test case for {@link JDBCPlotter#createChartDataModelInstance(String, String[], String[])}
		 * with a valid SQL query and valid row titles.
		 * The columns are initialized with values from columnRow.
		 * @throws JDBCPlotterException if an error occurs while creating the ChartDataModel
		 */
		@Test
		void testCreateChartDataModelInstance_5() throws JDBCPlotterException {
				JDBCPlotter jdbcPlotter = new JDBCPlotter("org.hsqldb.jdbcDriver", "jdbc:hsqldb:mem:aname", "sa", "");
				String sqlQuery = "SELECT * FROM test";
				String columnRow = "a";
				String[] sqlRows = {"b", "c"};
				ObjectChartDataModel chartDataModel = jdbcPlotter.createObjectChartDataModelInstance(sqlQuery, columnRow, sqlRows);
				assertEquals(2, chartDataModel.getDataSets().length);
				assertEquals(3, chartDataModel.getDataSets()[0].length);
				assertEquals(3, chartDataModel.getDataSets()[1].length);
				assertEquals(3, chartDataModel.getColumnCount());
				assertEquals("1.0", chartDataModel.getColumn(0));
				assertEquals("2.0", chartDataModel.getColumn(1));
				assertEquals("3.0", chartDataModel.getColumn(2));
				assertEquals(2.0, chartDataModel.getValue(0, 0));
				assertEquals(3.0, chartDataModel.getValue(0, 1));
				assertEquals(4.0, chartDataModel.getValue(0, 2));
				assertEquals(5.0, chartDataModel.getValue(1, 0));
				assertEquals(6.0, chartDataModel.getValue(1, 1));
				assertEquals(7.0, chartDataModel.getValue(1, 2));
		}
		
		/**
		 * Test case for {@link JDBCPlotter#createChartDataModelInstance(String, String[], String[])}
		 * with a valid SQL query and valid row titles.
		 * The columns are initialized with values from columnRow.
		 * @throws JDBCPlotterException if an error occurs while creating the ChartDataModel
		 */
		@Test
		void testCreateChartDataModelInstance_6() throws JDBCPlotterException {
				JDBCPlotter jdbcPlotter = new JDBCPlotter("org.hsqldb.jdbcDriver", "jdbc:hsqldb:mem:aname", "sa", "");
				String sqlQuery = "SELECT * FROM test";
				String columnRow = "a";
				String[] sqlRows = {"b", "c"};
				String[] dataSets = {"B", "C"};
				ObjectChartDataModel chartDataModel = jdbcPlotter.createObjectChartDataModelInstance(sqlQuery, columnRow, sqlRows, dataSets);
				assertEquals(2, chartDataModel.getDataSets().length);
				assertEquals(3, chartDataModel.getDataSets()[0].length);
				assertEquals(3, chartDataModel.getDataSets()[1].length);
				assertEquals(3, chartDataModel.getColumnCount());
				assertEquals("1.0", chartDataModel.getColumn(0));
				assertEquals("2.0", chartDataModel.getColumn(1));
				assertEquals("3.0", chartDataModel.getColumn(2));
				assertEquals(2.0, chartDataModel.getValue(0, 0));
				assertEquals(3.0, chartDataModel.getValue(0, 1));
				assertEquals(4.0, chartDataModel.getValue(0, 2));
				assertEquals(5.0, chartDataModel.getValue(1, 0));
				assertEquals(6.0, chartDataModel.getValue(1, 1));
				assertEquals(7.0, chartDataModel.getValue(1, 2));
		}
		
		/**
		 * Test case for {@link JDBCPlotter#createChartDataModelInstance(String, String[], String[])}
		 * with a valid SQL query and valid row titles.
		 * The columns are initialized with values starting from 0.
		 * @throws JDBCPlotterException if an error occurs while creating the ChartDataModel
		 */
		@Test
		void testCreateChartDataModelInstance_7() throws JDBCPlotterException {
				JDBCPlotter jdbcPlotter = new JDBCPlotter("org.hsqldb.jdbcDriver", "jdbc:hsqldb:mem:aname", "sa", "");
				String sqlQuery = "SELECT * FROM test";
				String[] sqlRows = {"a", "b", "c"};
				DefaultChartDataModel chartDataModel = jdbcPlotter.createChartDataModelInstance(sqlQuery, sqlRows);
				assertEquals(3, chartDataModel.getDataSets().length);
				assertEquals(3, chartDataModel.getDataSets()[0].length);
				assertEquals(3, chartDataModel.getDataSets()[1].length);
				assertEquals(3, chartDataModel.getDataSets()[2].length);
				assertEquals(3, chartDataModel.getColumnCount());
				assertEquals(0.0, chartDataModel.getColumn(0));
				assertEquals(1.0, chartDataModel.getColumn(1));
				assertEquals(2.0, chartDataModel.getColumn(2));
				assertEquals(1.0, chartDataModel.getValue