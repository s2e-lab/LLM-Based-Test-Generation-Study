// DefaultChartDataModel_3Test.java
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
* It contains ten unit test cases for the {@link DefaultChartDataModel#getValueAt(int, int)} method.
*/
class DefaultChartDataModel_3Test {

		/**
		* Test case 1 for {@link DefaultChartDataModel#getValueAt(int, int)}
		*/
		@Test
		void testGetValueAt_1() {
				double[][] data = new double[][] { { 1.0, 2.0, 3.0, 4.0, 5.0 }, { 1.0, 2.0, 3.0, 4.0, 5.0 } };
				double[] columns = new double[] { 1.0, 2.0, 3.0, 4.0, 5.0 };
				String[] rows = new String[] { "1", "2" };
				DefaultChartDataModel model = new DefaultChartDataModel(data, columns, rows);
				assertEquals(1.0, model.getValueAt(0, 0).doubleValue());
				assertEquals(2.0, model.getValueAt(0, 1).doubleValue());
				assertEquals(3.0, model.getValueAt(0, 2).doubleValue());
				assertEquals(4.0, model.getValueAt(0, 3).doubleValue());
				assertEquals(5.0, model.getValueAt(0, 4).doubleValue());
				assertEquals(1.0, model.getValueAt(1, 0).doubleValue());
				assertEquals(2.0, model.getValueAt(1, 1).doubleValue());
				assertEquals(3.0, model.getValueAt(1, 2).doubleValue());
				assertEquals(4.0, model.getValueAt(1, 3).doubleValue());
				assertEquals(5.0, model.getValueAt(1, 4).doubleValue());
		}
		
		/**
		* Test case 2 for {@link DefaultChartDataModel#getValueAt(int, int)}
		*/
		@Test
		void testGetValueAt_2() {
				double[][] data = new double[][] { { 1.0, 2.0, 3.0, 4.0, 5.0 }, { 1.0, 2.0, 3.0, 4.0, 5.0 } };
				double[] columns = new double[] { 1.0, 2.0, 3.0, 4.0, 5.0 };
				String[] rows = new String[] { "1", "2" };
				DefaultChartDataModel model = new DefaultChartDataModel(data, columns, rows);
				assertEquals(1.0, model.getValueAt(0, 0).doubleValue());
				assertEquals(2.0, model.getValueAt(0, 1).doubleValue());
				assertEquals(3.0, model.getValueAt(0, 2).doubleValue());
				assertEquals(4.0, model.getValueAt(0, 3).doubleValue());
				assertEquals(5.0, model.getValueAt(0, 4).doubleValue());
				assertEquals(1.0, model.getValueAt(1, 0).doubleValue());
				assertEquals(2.0, model.getValueAt(1, 1).doubleValue());
				assertEquals(3.0, model.getValueAt(1, 2).doubleValue());
				assertEquals(4.0, model.getValueAt(1, 3).doubleValue());
				assertEquals(5.0, model.getValueAt(1, 4).doubleValue());
		}
		
		/**
		* Test case 3 for {@link DefaultChartDataModel#getValueAt(int, int)}
		*/
		@Test
		void testGetValueAt_3() {
				double[][] data = new double[][] { { 1.0, 2.0, 3.0, 4.0, 5.0 }, { 1.0, 2.0, 3.0, 4.0, 5.0 } };
				double[] columns = new double[] { 1.0, 2.0, 3.0, 4.0, 5.0 };
				String[] rows = new String[] { "1", "2" };
				DefaultChartDataModel model = new DefaultChartDataModel(data, columns, rows);
				assertEquals(1.0, model.getValueAt(0, 0).doubleValue());
				assertEquals(2.0, model.getValueAt(0, 1).doubleValue());
				assertEquals(3.0, model.getValueAt(0, 2).doubleValue());
				assertEquals(4.0, model.getValueAt(0, 3).doubleValue());
				assertEquals(5.0, model.getValueAt(0, 4).doubleValue());
				assertEquals(1.0, model.getValueAt(1, 0).doubleValue());
				assertEquals(2.0, model.getValueAt(1, 1).doubleValue());
				assertEquals(3.0, model.getValueAt(1, 2).doubleValue());
				assertEquals(4.0, model.getValueAt(1, 3).doubleValue());
				assertEquals(5.0, model.getValueAt(1, 4).doubleValue());
		}
		
		/**
		* Test case 4 for {@link DefaultChartDataModel#getValueAt(int, int)}
		*/
		@Test
		void testGetValueAt_4() {
				double[][] data = new double[][] { { 1.0, 2.0, 3.0, 4.0, 5.0 }, { 1.0, 2.0, 3.0, 4.0, 5.0 } };
				double[] columns = new double[] { 1.0, 2.0, 3.0, 4.0, 5.0 };
				String[] rows = new String[] { "1", "2" };
				DefaultChartDataModel model = new DefaultChartDataModel(data, columns, rows);
				assertEquals(1.0, model.getValueAt(0, 0).doubleValue());
				assertEquals(2.0, model.getValueAt(0, 1).doubleValue());
				assertEquals(3.0, model.getValueAt(0, 2).doubleValue());
				assertEquals(4.0, model.getValueAt(0, 3).doubleValue());
				assertEquals(5.0, model.getValueAt(0, 4).doubleValue());
				assertEquals(1.0, model.getValueAt(1, 0).doubleValue());
				assertEquals(2.0, model.getValueAt(1, 1).doubleValue());
				assertEquals(3.0, model.getValueAt(1, 2).doubleValue());
				assertEquals(4.0, model.getValueAt(1, 3).doubleValue());
				assertEquals(5.0, model.getValueAt(1, 4).doubleValue());
		}
		
		/**
		* Test case 5 for {@link DefaultChartDataModel#getValueAt(int, int)}
		*/
		@Test
		void testGetValueAt_5() {
				double[][] data = new double[][] { { 1.0, 2.0, 3.0, 4.0, 5.0 }, { 1.0, 2.0, 3.0, 4.0, 5.0 } };
				double[] columns = new double[] { 1.0, 2.0, 3.0, 4.0, 5.0 };
				String[] rows = new String[] { "1", "2" };
				DefaultChartDataModel model = new DefaultChartDataModel(data, columns, rows);
				assertEquals(1.0, model.getValueAt(0, 0).doubleValue());
				assertEquals(2.0, model.getValueAt(0, 1).doubleValue());
				assertEquals(3.0, model.getValueAt(0, 2).doubleValue());
				assertEquals(4.0, model.getValueAt(0, 3).doubleValue());
				assertEquals(5.0, model.getValueAt(0, 4).doubleValue());
				assertEquals(1.0, model.getValueAt(1, 0).doubleValue());
				assertEquals(2.0, model.getValueAt(1, 1).doubleValue());
				assertEquals(3.0, model.getValueAt(1, 2).doubleValue());
				assertEquals(4.0, model.getValueAt(1, 3).doubleValue());
				assertEquals(5.0, model.getValueAt(1, 4).doubleValue());
		}
		
		/**
		* Test case 6 for {@link DefaultChartDataModel#getValueAt(int, int)}
		*/
		@Test
		void testGetValueAt_6() {
				double[][] data = new double[][] { { 1.0, 2.0, 3.0, 4.0, 5.0 }, { 1.0, 2.0, 3.0, 4.0, 5.0 } };
				double[] columns = new double[] { 1.0, 2.0, 3.0, 4.0, 5.0 };
				String[] rows = new String[] { "1", "2" };
				DefaultChartDataModel model = new DefaultChartDataModel(data, columns, rows);
				assertEquals(1.0, model.getValueAt(0, 0).doubleValue());
				assertEquals(2.0, model.getValueAt(0, 1).doubleValue());
				assertEquals(3.0, model.getValueAt(0, 2).doubleValue());
				assertEquals(4.0, model.getValueAt(0, 3).doubleValue());
				assertEquals(5.0, model.getValueAt(0, 4).doubleValue());
				assertEquals(1.0, model.getValueAt(1, 0).doubleValue());
				assertEquals(2.0, model.getValueAt(1, 1).doubleValue());
				assertEquals(3.0, model.getValueAt(1, 2).doubleValue());
				assertEquals(4.0, model.getValueAt(1, 3).doubleValue());
				assertEquals(5.0, model.getValueAt(1, 4).doubleValue());
		}
		
		/**
		* Test case 7 for {@link DefaultChartDataModel#getValueAt(int, int)}
		*/
		@Test
		void testGetValueAt_7() {
				double[][] data = new double[][] { { 1.0, 2.0, 3.0, 4.0, 5.0 }, { 1.0, 2.0, 3.0, 4.0, 5.0 } };
				double[] columns = new double[] { 1.0, 2.0, 3.0, 4.0, 5.0 };
				String[] rows = new String[] { "1", "2" };
				DefaultChartDataModel model = new DefaultChartDataModel(data, columns, rows);
				assertEquals(1.0, model.getValueAt(0, 0).doubleValue());
				assertEquals(2.0, model.getValueAt(0, 1).doubleValue());
				assertEquals(3.0, model.getValueAt(0, 2).doubleValue());
				assertEquals(4.0, model.getValueAt(0, 3).doubleValue());
				assertEquals(5.0, model.getValueAt(0, 4).doubleValue());
				assertEquals(1.0, model.getValueAt(1, 0).doubleValue());
				assertEquals(2.0, model.getValueAt(1, 1).doubleValue());
				assertEquals(3.0, model.getValueAt(1, 2).doubleValue());
				assertEquals(4.0, model.getValueAt(1, 3).doubleValue());
				assertEquals(5.0, model.getValueAt(1, 4).doubleValue());
		}
		
		/**
		* Test case 8 for {@link DefaultChartDataModel#getValueAt(int, int)}
		*/
		@Test
		void testGetValueAt_8() {
				double[][] data = new double[][] { { 1.0, 2.0, 3.0, 4.0, 5.0 }, { 1.0, 2.0, 3.0, 4.0, 5.0 } };
				double[] columns = new double[] { 1.0, 2.0, 3.0, 4.0, 5.0 };
				String[] rows = new String[] { "1", "2" };
				DefaultChartDataModel model = new DefaultChartDataModel(data, columns, rows);
				assertEquals(1.0, model.getValueAt(0, 0).doubleValue());
				assertEquals(2.0, model.getValueAt(0, 1).doubleValue());
				assertEquals(3.0, model.getValueAt(0, 2).doubleValue());
				assertEquals(4.0, model.getValueAt(0, 3).doubleValue());
				assertEquals(5.0, model.getValueAt(0, 4).doubleValue());
				assertEquals(1.0, model.getValueAt(1, 0).doubleValue());
				assertEquals(2.0, model.getValueAt(1, 1).doubleValue());
				assertEquals(3.0, model.getValueAt(1, 2).doubleValue());
				assertEquals(4.0, model.getValueAt(1, 3).doubleValue());
				assertEquals(5.0, model.getValueAt(1, 4).doubleValue());
		}
		
		/**
		* Test case 9 for {@link DefaultChartDataModel#getValueAt(int, int)}
		*/
		@Test
		void testGetValueAt_9() {
				double[][] data = new double[][] { { 1.0, 2.0, 3.0, 4.0, 5.0 }, { 1.0, 2.0, 3.0, 4.0, 5.0 } };
				double[] columns = new double[] { 1.0, 2.0, 3.0, 4.0, 5.0 };
				String[] rows = new String[] { "1", "2" };
				DefaultChartDataModel model = new DefaultChartDataModel(data, columns, rows);
				assertEquals(1.0, model.getValueAt(0, 0).doubleValue());
				assertEquals(2.0, model.getValueAt(0, 1).doubleValue());
				assertEquals(3.0, model.getValueAt(0, 2).doubleValue());
				assertEquals(4.0, model.getValueAt(0, 3).doubleValue());
				assertEquals(5.0, model.getValueAt(0, 4).doubleValue());
				assertEquals(1.0, model.getValueAt(1, 0).doubleValue());
				assertEquals(2.0, model.getValueAt(1, 1).doubleValue());
				assertEquals(3.0, model.getValue