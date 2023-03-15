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
				assertEquals(3, chartDataModel.getDataSetCount());
				assertEquals(0, chartDataModel.getValue(0, 0));
				assertEquals(1, chartDataModel.getValue(0, 1));
				assertEquals(2, chartDataModel.getValue(0, 2));
				assertEquals(3, chartDataModel.getValue(0, 3));
				assertEquals(4, chartDataModel.getValue(0, 4));
				assertEquals(5, chartDataModel.getValue(0, 5));
				assertEquals(6, chartDataModel.getValue(0, 6));
				assertEquals(7, chartDataModel.getValue(0, 7));
				assertEquals(8, chartDataModel.getValue(0, 8));
				assertEquals(9, chartDataModel.getValue(0, 9));
				assertEquals(10, chartDataModel.getValue(0, 10));
				assertEquals(11, chartDataModel.getValue(0, 11));
				assertEquals(12, chartDataModel.getValue(0, 12));
				assertEquals(13, chartDataModel.getValue(0, 13));
				assertEquals(14, chartDataModel.getValue(0, 14));
				assertEquals(15, chartDataModel.getValue(0, 15));
				assertEquals(16, chartDataModel.getValue(0, 16));
				assertEquals(17, chartDataModel.getValue(0, 17));
				assertEquals(18, chartDataModel.getValue(0, 18));
				assertEquals(19, chartDataModel.getValue(0, 19));
				assertEquals(20, chartDataModel.getValue(0, 20));
				assertEquals(21, chartDataModel.getValue(0, 21));
				assertEquals(22, chartDataModel.getValue(0, 22));
				assertEquals(23, chartDataModel.getValue(0, 23));
				assertEquals(24, chartDataModel.getValue(0, 24));
				assertEquals(25, chartDataModel.getValue(0, 25));
				assertEquals(26, chartDataModel.getValue(0, 26));
				assertEquals(27, chartDataModel.getValue(0, 27));
				assertEquals(28, chartDataModel.getValue(0, 28));
				assertEquals(29, chartDataModel.getValue(0, 29));
				assertEquals(30, chartDataModel.getValue(0, 30));
				assertEquals(31, chartDataModel.getValue(0, 31));
				assertEquals(32, chartDataModel.getValue(0, 32));
				assertEquals(33, chartDataModel.getValue(0, 33));
				assertEquals(34, chartDataModel.getValue(0, 34));
				assertEquals(35, chartDataModel.getValue(0, 35));
				assertEquals(36, chartDataModel.getValue(0, 36));
				assertEquals(37, chartDataModel.getValue(0, 37));
				assertEquals(38, chartDataModel.getValue(0, 38));
				assertEquals(39, chartDataModel.getValue(0, 39));
				assertEquals(40, chartDataModel.getValue(0, 40));
				assertEquals(41, chartDataModel.getValue(0, 41));
				assertEquals(42, chartDataModel.getValue(0, 42));
				assertEquals(43, chartDataModel.getValue(0, 43));
				assertEquals(44, chartDataModel.getValue(0, 44));
				assertEquals(45, chartDataModel.getValue(0, 45));
				assertEquals(46, chartDataModel.getValue(0, 46));
				assertEquals(47, chartDataModel.getValue(0, 47));
				assertEquals(48, chartDataModel.getValue(0, 48));
				assertEquals(49, chartDataModel.getValue(0, 49));
				assertEquals(50, chartDataModel.getValue(0, 50));
				assertEquals(51, chartDataModel.getValue(0, 51));
				assertEquals(52, chartDataModel.getValue(0, 52));
				assertEquals(53, chartDataModel.getValue(0, 53));
				assertEquals(54, chartDataModel.getValue(0, 54));
				assertEquals(55, chartDataModel.getValue(0, 55));
				assertEquals(56, chartDataModel.getValue(0, 56));
				assertEquals(57, chartDataModel.getValue(0, 57));
				assertEquals(58, chartDataModel.getValue(0, 58));
				assertEquals(59, chartDataModel.getValue(0, 59));
				assertEquals(60, chartDataModel.getValue(0, 60));
				assertEquals(61, chartDataModel.getValue(0, 61));
				assertEquals(62, chartDataModel.getValue(0, 62));
				assertEquals(63, chartDataModel.getValue(0, 63));
				assertEquals(64, chartDataModel.getValue(0, 64));
				assertEquals(65, chartDataModel.getValue(0, 65));
				assertEquals(66, chartDataModel.getValue(0, 66));
				assertEquals(67, chartDataModel.getValue(0, 67));
				assertEquals(68, chartDataModel.getValue(0, 68));
				assertEquals(69, chartDataModel.getValue(0, 69));
				assertEquals(70, chartDataModel.getValue(0, 70));
				assertEquals(71, chartDataModel.getValue(0, 71));
				assertEquals(72, chartDataModel.getValue(0, 72));
				assertEquals(73, chartDataModel.getValue(0, 73));
				assertEquals(74, chartDataModel.getValue(0, 74));
				assertEquals(75, chartDataModel.getValue(0, 75));
				assertEquals(76, chartDataModel.getValue(0, 76));
				assertEquals(77, chartDataModel.getValue(0, 77));
				assertEquals(78, chartDataModel.getValue(0, 78));
				assertEquals