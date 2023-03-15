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
		* It tests if the method returns a {@link ObjectChartDataModel} object.
		*/
		@Test
		void testCreateObjectChartDataModelInstance() {
				try {
						JDBCPlotter jdbcPlotter = new JDBCPlotter("org.hsqldb.jdbcDriver", "jdbc:hsqldb:mem:aname", "sa", "");
						ObjectChartDataModel objectChartDataModel = jdbcPlotter.createObjectChartDataModelInstance("SELECT * FROM test", "name", new String[]{"value"});
						assertTrue(objectChartDataModel instanceof ObjectChartDataModel);
				} catch (JDBCPlotterException e) {
						fail("Exception while creating a database connection.");
				}
		}
		
		/**
		* Test case for {@link JDBCPlotter#createObjectChartDataModelInstance(String, String, String[])} method.
		* It tests if the method returns a {@link ObjectChartDataModel} object with the correct number of rows.
		*/
		@Test
		void testCreateObjectChartDataModelInstance_2() {
				try {
						JDBCPlotter jdbcPlotter = new JDBCPlotter("org.hsqldb.jdbcDriver", "jdbc:hsqldb:mem:aname", "sa", "");
						ObjectChartDataModel objectChartDataModel = jdbcPlotter.createObjectChartDataModelInstance("SELECT * FROM test", "name", new String[]{"value"});
						assertEquals(objectChartDataModel.getRowCount(), 3);
				} catch (JDBCPlotterException e) {
						fail("Exception while creating a database connection.");
				}
		}
		
		/**
		* Test case for {@link JDBCPlotter#createObjectChartDataModelInstance(String, String, String[])} method.
		* It tests if the method returns a {@link ObjectChartDataModel} object with the correct number of columns.
		*/
		@Test
		void testCreateObjectChartDataModelInstance_3() {
				try {
						JDBCPlotter jdbcPlotter = new JDBCPlotter("org.hsqldb.jdbcDriver", "jdbc:hsqldb:mem:aname", "sa", "");
						ObjectChartDataModel objectChartDataModel = jdbcPlotter.createObjectChartDataModelInstance("SELECT * FROM test", "name", new String[]{"value"});
						assertEquals(objectChartDataModel.getColumnCount(), 1);
				} catch (JDBCPlotterException e) {
						fail("Exception while creating a database connection.");
				}
		}
		
		/**
		* Test case for {@link JDBCPlotter#createObjectChartDataModelInstance(String, String, String[])} method.
		* It tests if the method returns a {@link ObjectChartDataModel} object with the correct column values.
		*/
		@Test
		void testCreateObjectChartDataModelInstance_4() {
				try {
						JDBCPlotter jdbcPlotter = new JDBCPlotter("org.hsqldb.jdbcDriver", "jdbc:hsqldb:mem:aname", "sa", "");
						ObjectChartDataModel objectChartDataModel = jdbcPlotter.createObjectChartDataModelInstance("SELECT * FROM test", "name", new String[]{"value"});
						assertEquals(objectChartDataModel.getColumn(0), new String[]{"a", "b", "c"});
				} catch (JDBCPlotterException e) {
						fail("Exception while creating a database connection.");
				}
		}
		
		/**
		* Test case for {@link JDBCPlotter#createObjectChartDataModelInstance(String, String, String[])} method.
		* It tests if the method returns a {@link ObjectChartDataModel} object with the correct row values.
		*/
		@Test
		void testCreateObjectChartDataModelInstance_5() {
				try {
						JDBCPlotter jdbcPlotter = new JDBCPlotter("org.hsqldb.jdbcDriver", "jdbc:hsqldb:mem:aname", "sa", "");
						ObjectChartDataModel objectChartDataModel = jdbcPlotter.createObjectChartDataModelInstance("SELECT * FROM test", "name", new String[]{"value"});
						assertEquals(objectChartDataModel.getRow(0), new Double[]{1.0});
						assertEquals(objectChartDataModel.getRow(1), new Double[]{2.0});
						assertEquals(objectChartDataModel.getRow(2), new Double[]{3.0});
				} catch (JDBCPlotterException e) {
						fail("Exception while creating a database connection.");
				}
		}
		
		/**
		* Test case for {@link JDBCPlotter#createObjectChartDataModelInstance(String, String, String[])} method.
		* It tests if the method returns a {@link ObjectChartDataModel} object with the correct data set titles.
		*/
		@Test
		void testCreateObjectChartDataModelInstance_6() {
				try {
						JDBCPlotter jdbcPlotter = new JDBCPlotter("org.hsqldb.jdbcDriver", "jdbc:hsqldb:mem:aname", "sa", "");
						ObjectChartDataModel objectChartDataModel = jdbcPlotter.createObjectChartDataModelInstance("SELECT * FROM test", "name", new String[]{"value"}, new String[]{"test"});
						assertEquals(objectChartDataModel.getDataSetTitle(0), "test");
				} catch (JDBCPlotterException e) {
						fail("Exception while creating a database connection.");
				}
		}
		
		/**
		* Test case for {@link JDBCPlotter#createObjectChartDataModelInstance(String, String, String[])} method.
		* It tests if the method returns a {@link ObjectChartDataModel} object with the correct data set titles.
		*/
		@Test
		void testCreateObjectChartDataModelInstance_7() {
				try {
						JDBCPlotter jdbcPlotter = new JDBCPlotter("org.hsqldb.jdbcDriver", "jdbc:hsqldb:mem:aname", "sa", "");
						ObjectChartDataModel objectChartDataModel = jdbcPlotter.createObjectChartDataModelInstance("SELECT * FROM test", "name", new String[]{"value"}, new String[]{"test"});
						assertEquals(objectChartDataModel.getDataSetTitle(0), "test");
				} catch (JDBCPlotterException e) {
						fail("Exception while creating a database connection.");
				}
		}
		
		/**
		* Test case for {@link JDBCPlotter#createObjectChartDataModelInstance(String, String, String[])} method.
		* It tests if the method returns a {@link ObjectChartDataModel} object with the correct data set titles.
		*/
		@Test
		void testCreateObjectChartDataModelInstance_8() {