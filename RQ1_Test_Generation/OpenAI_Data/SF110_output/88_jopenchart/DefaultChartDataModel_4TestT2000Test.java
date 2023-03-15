// DefaultChartDataModel_4Test.java
package de.progra.charting.model;

import de.progra.charting.CoordSystem;
import de.progra.charting.ChartUtilities;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;
import java.util.Set;
import java.util.HashMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultChartDataModel}.
* It contains ten unit test cases for the {@link DefaultChartDataModel#getColumnValueAt(int)} method.
*/
class DefaultChartDataModel_4Test {

		/**
		* Test case for {@link DefaultChartDataModel#getColumnValueAt(int)} method.
		* Test case for the scenario when the column value is not null.
		*/
		@Test
		void testGetColumnValueAt_1() {
				double[][] data = new double[][] { { 1.0, 2.0, 3.0, 4.0, 5.0 }, { 6.0, 7.0, 8.0, 9.0, 10.0 } };
				double[] columns = new double[] { 1.0, 2.0, 3.0, 4.0, 5.0 };
				String[] rows = new String[] { "row1", "row2" };
				DefaultChartDataModel defaultChartDataModel = new DefaultChartDataModel(data, columns, rows);
				assertEquals(new Double(1.0), defaultChartDataModel.getColumnValueAt(0, 0));
		}
		
		/**
		* Test case for {@link DefaultChartDataModel#getColumnValueAt(int)} method.
		* Test case for the scenario when the column value is null.
		*/
		@Test
		void testGetColumnValueAt_2() {
				double[][] data = new double[][] { { 1.0, 2.0, 3.0, 4.0, 5.0 }, { 6.0, 7.0, 8.0, 9.0, 10.0 } };
				double[] columns = new double[] { 1.0, 2.0, 3.0, 4.0, 5.0 };
				String[] rows = new String[] { "row1", "row2" };
				DefaultChartDataModel defaultChartDataModel = new DefaultChartDataModel(data, columns, rows);
				assertEquals(null, defaultChartDataModel.getColumnValueAt(0, 5));
		}
		
		/**
		* Test case for {@link DefaultChartDataModel#getColumnValueAt(int)} method.
		* Test case for the scenario when the column value is not null.
		*/
		@Test
		void testGetColumnValueAt_3() {
				double[][] data = new double[][] { { 1.0, 2.0, 3.0, 4.0, 5.0 }, { 6.0, 7.0, 8.0, 9.0, 10.0 } };
				double[] columns = new double[] { 1.0, 2.0, 3.0, 4.0, 5.0 };
				String[] rows = new String[] { "row1", "row2" };
				DefaultChartDataModel defaultChartDataModel = new DefaultChartDataModel(data, columns, rows);
				assertEquals(new Double(1.0), defaultChartDataModel.getColumnValueAt(1, 0));
		}
		
		/**
		* Test case for {@link DefaultChartDataModel#getColumnValueAt(int)} method.
		* Test case for the scenario when the column value is null.
		*/
		@Test
		void testGetColumnValueAt_4() {
				double[][] data = new double[][] { { 1.0, 2.0, 3.0, 4.0, 5.0 }, { 6.0, 7.0, 8.0, 9.0, 10.0 } };
				double[] columns = new double[] { 1.0, 2.0, 3.0, 4.0, 5.0 };
				String[] rows = new String[] { "row1", "row2" };
				DefaultChartDataModel defaultChartDataModel = new DefaultChartDataModel(data, columns, rows);
				assertEquals(null, defaultChartDataModel.getColumnValueAt(1, 5));
		}
		
		/**
		* Test case for {@link DefaultChartDataModel#getColumnValueAt(int)} method.
		* Test case for the scenario when the column value is not null.
		*/
		@Test
		void testGetColumnValueAt_5() {
				double[][] data = new double[][] { { 1.0, 2.0, 3.0, 4.0, 5.0 }, { 6.0, 7.0, 8.0, 9.0, 10.0 } };
				double[] columns = new double[] { 1.0, 2.0, 3.0, 4.0, 5.0 };
				String[] rows = new String[] { "row1", "row2" };
				DefaultChartDataModel defaultChartDataModel = new DefaultChartDataModel(data, columns, rows);
				assertEquals(new Double(1.0), defaultChartDataModel.getColumnValueAt(0, 0));
		}
		
		/**
		* Test case for {@link DefaultChartDataModel#getColumnValueAt(int)} method.
		* Test case for the scenario when the column value is null.
		*/
		@Test
		void testGetColumnValueAt_6() {
				double[][] data = new double[][] { { 1.0, 2.0, 3.0, 4.0, 5.0 }, { 6.0, 7.0, 8.0, 9.0, 10.0 } };
				double[] columns = new double[] { 1.0, 2.0, 3.0, 4.0, 5.0 };
				String[] rows = new String[] { "row1", "row2" };
				DefaultChartDataModel defaultChartDataModel = new DefaultChartDataModel(data, columns, rows);
				assertEquals(null, defaultChartDataModel.getColumnValueAt(0, 5));
		}
		
		/**
		* Test case for {@link DefaultChartDataModel#getColumnValueAt(int)} method.
		* Test case for the scenario when the column value is not null.
		*/
		@Test
		void testGetColumnValueAt_7() {
				double[][] data = new double[][] { { 1.0, 2.0, 3.0, 4.0, 5.0 }, { 6.0, 7.0, 8.0, 9.0, 10.0 } };
				double[] columns = new double[] { 1.0, 2.0, 3.0, 4.0, 5.0 };
				String[] rows = new String[] { "row1", "row2" };
				DefaultChartDataModel defaultChartDataModel = new DefaultChartDataModel(data, columns, rows);
				assertEquals(new Double(1.0), defaultChartDataModel.getColumnValueAt(1, 0));
		}
		
		/**
		* Test case for {@link DefaultChartDataModel#getColumnValueAt(int)} method.
		* Test case for the scenario when the column value is null.
		*/
		@Test
		void testGetColumnValueAt_8() {
				double[][] data = new double[][] { { 1.0, 2.0, 3.0, 4.0, 5.0 }, { 6.0, 7.0, 8.0, 9.0, 10.0 } };
				double[] columns = new double[] { 1.0, 2.0, 3.0, 4.0, 5.0 };
				String[] rows = new String[] { "row1", "row2" };
				DefaultChartDataModel defaultChartDataModel = new DefaultChartDataModel(data, columns, rows);
				assertEquals(null, defaultChartDataModel.getColumnValueAt(1, 5));
		}
		
		/**
		* Test case for {@link DefaultChartDataModel#getColumnValueAt(int)} method.
		* Test case for the scenario when the column value is not null.
		*/
		@Test
		void testGetColumnValueAt_