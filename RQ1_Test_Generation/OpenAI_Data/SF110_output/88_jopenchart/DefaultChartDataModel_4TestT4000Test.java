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
		* Test data:
		* <ul>
		* <li>columns: {1.0, 2.0, 3.0, 4.0, 5.0}</li>
		* <li>rows: {1.0, 2.0, 3.0, 4.0, 5.0}</li>
		* <li>data: {{1.0, 2.0, 3.0, 4.0, 5.0}}</li>
		* </ul>
		* Expected result:
		* <ul>
		* <li>column value at index 0: 1.0</li>
		* <li>column value at index 1: 2.0</li>
		* <li>column value at index 2: 3.0</li>
		* <li>column value at index 3: 4.0</li>
		* <li>column value at index 4: 5.0</li>
		* </ul>
		*/
		@Test
		void testGetColumnValueAt_1() {
				double[] columns = {1.0, 2.0, 3.0, 4.0, 5.0};
				String[] rows = {"1.0", "2.0", "3.0", "4.0", "5.0"};
				double[][] data = {{1.0, 2.0, 3.0, 4.0, 5.0}};
				DefaultChartDataModel model = new DefaultChartDataModel(data, columns, rows);
				assertEquals(1.0, model.getColumnValueAt(0, 0));
				assertEquals(2.0, model.getColumnValueAt(0, 1));
				assertEquals(3.0, model.getColumnValueAt(0, 2));
				assertEquals(4.0, model.getColumnValueAt(0, 3));
				assertEquals(5.0, model.getColumnValueAt(0, 4));
		}
		
		/**
		* Test case for {@link DefaultChartDataModel#getColumnValueAt(int)} method.
		* Test data:
		* <ul>
		* <li>columns: {1.0, 2.0, 3.0, 4.0, 5.0}</li>
		* <li>rows: {1.0, 2.0, 3.0, 4.0, 5.0}</li>
		* <li>data: {{1.0, 2.0, 3.0, 4.0, 5.0}}</li>
		* </ul>
		* Expected result:
		* <ul>
		* <li>column value at index 5: null</li>
		* </ul>
		*/
		@Test
		void testGetColumnValueAt_2() {
				double[] columns = {1.0, 2.0, 3.0, 4.0, 5.0};
				String[] rows = {"1.0", "2.0", "3.0", "4.0", "5.0"};
				double[][] data = {{1.0, 2.0, 3.0, 4.0, 5.0}};
				DefaultChartDataModel model = new DefaultChartDataModel(data, columns, rows);
				assertNull(model.getColumnValueAt(0, 5));
		}
		
		/**
		* Test case for {@link DefaultChartDataModel#getColumnValueAt(int)} method.
		* Test data:
		* <ul>
		* <li>columns: {1.0, 2.0, 3.0, 4.0, 5.0}</li>
		* <li>rows: {1.0, 2.0, 3.0, 4.0, 5.0}</li>
		* <li>data: {{1.0, 2.0, 3.0, 4.0, 5.0}}</li>
		* </ul>
		* Expected result:
		* <ul>
		* <li>column value at index -1: null</li>
		* </ul>
		*/
		@Test
		void testGetColumnValueAt_3() {
				double[] columns = {1.0, 2.0, 3.0, 4.0, 5.0};
				String[] rows = {"1.0", "2.0", "3.0", "4.0", "5.0"};
				double[][] data = {{1.0, 2.0, 3.0, 4.0, 5.0}};
				DefaultChartDataModel model = new DefaultChartDataModel(data, columns, rows);
				assertNull(model.getColumnValueAt(0, -1));
		}
		
		/**
		* Test case for {@link DefaultChartDataModel#getColumnValueAt(int)} method.
		* Test data:
		* <ul>
		* <li>columns: {1.0, 2.0, 3.0, 4.0, 5.0}</li>
		* <li>rows: {1.0, 2.0, 3.0, 4.0, 5.0}</li>
		* <li>data: {{1.0, 2.0, 3.0, 4.0, 5.0}}</li>
		* </ul>
		* Expected result:
		* <ul>
		* <li>column value at index 0: 1.0</li>
		* <li>column value at index 1: 2.0</li>
		* <li>column value at index 2: 3.0</li>
		* <li>column value at index 3: 4.0</li>
		* <li>column value at index 4: 5.0</li>
		* </ul>
		*/
		@Test
		void testGetColumnValueAt_4() {
				double[] columns = {1.0, 2.0, 3.0, 4.0, 5.0};
				String[] rows = {"1.0", "2.0", "3.0", "4.0", "5.0"};
				double[][] data = {{1.0, 2.0, 3.0, 4.0, 5.0}};
				DefaultChartDataModel model = new DefaultChartDataModel(data, columns, rows);
				assertEquals(1.0, model.getColumnValueAt(0, 0));
				assertEquals(2.0, model.getColumnValueAt(0, 1));
				assertEquals(3.0, model.getColumnValueAt(0, 2));
				assertEquals(4.0, model.getColumnValueAt(0, 3));
				assertEquals(5.0, model.getColumnValueAt(0, 4));
		}
		
		/**
		* Test case for {@link DefaultChartDataModel#getColumnValueAt(int)} method.
		* Test data:
		* <ul>
		* <li>columns: {1.0, 2.0, 3.0, 4.0, 5.0}</li>
		* <li>rows: {1.0, 2.0, 3.0, 4.0, 5.0}</li>
		* <li>data: {{1.0, 2.0, 3.0, 4.0, 5.0}}</li>
		* </ul>
		* Expected result:
		* <ul>
		* <li>column value at index 5: null</li>
		* </ul>
		*/
		@Test
		void testGetColumnValueAt_5() {
				double[] columns = {1.0, 2.0, 3.0, 4.0, 5.0};
				String[] rows = {"1.0", "2.0", "3.0", "4.0", "5.0"};
				double[][] data = {{1.0, 2.0, 3.0, 4.0, 5.0}};
				DefaultChartDataModel model = new DefaultChartDataModel(data, columns, rows);
				assertNull(model.getColumnValueAt(0, 5));
		}
		
		/**
		* Test case for {@link DefaultChartDataModel#getColumnValueAt(int)} method.
		* Test data:
		* <ul>
		* <li>columns: {1.0, 2.0, 3.0, 4.0, 5.0}</li>
		* <li>rows: {1.0, 2.0, 3.0, 4.0, 5.0}</li>
		* <li>data: {{1.0, 2.0, 3.0, 4.0, 5.0}}</li>
		* </ul>
		* Expected result:
		* <ul>
		* <li>column value at index -1: null</li>
		* </ul>
		*/
		@Test
		void testGetColumnValueAt_6() {
				double[] columns = {1.0, 2.0, 3.0, 4.0, 5.0};
				String[] rows = {"1.0", "2.0", "3.0", "4.0", "5.0"};
				double[][] data = {{1.0, 2.0, 3.0, 4.0, 5.0}};
				DefaultChartDataModel model = new DefaultChartDataModel(data, columns, rows);
				assertNull(model.getColumnValueAt(0, -1));
		}
		
		/**
		* Test case for {@link DefaultChartDataModel#getColumnValueAt(int)} method.
		* Test data:
		* <ul>
		* <li>columns: {1.0, 2.0, 3.0, 4.0, 5.0}</li>
		* <li>rows: {1.0, 2.0, 3.0, 4.0, 5.0}</li>
		* <li>data: {{1.0, 2.0, 3.0, 4.0, 5.0}}</li>
		* </ul>
		* Expected result:
		* <ul>
		* <li>column value at index 0: 1.0</li>
		* <li>column value at index 1: 2.0</li>
		* <li>column value at index 2: 3.0</li>
		* <li>column value at index 3: 4.0</li>
		* <li>column value at index 4: 5.0</li>
		* </ul>
		*/
		@Test
		void testGetColumnValueAt_7() {
				double[] columns = {1.0, 2.0, 3.0, 4.0, 5.0};
				String[] rows = {"1.0", "2.0", "3.0", "4.0", "5.0"};
				double[][] data = {{1.0, 2.0, 3.0, 4.0, 5.0}};
				DefaultChartDataModel model = new DefaultChartDataModel(data, columns, rows);
				assertEquals(1.0, model.getColumnValueAt(0, 0));
				assertEquals(2.0, model.getColumnValueAt(0, 1));
				assertEquals(3.0, model.getColumnValueAt(0, 2));
				assertEquals(4.0, model.getColumnValueAt(0, 3));
				assertEquals(5.0, model.getColumnValueAt(0, 4));
		}
		
		/**
		* Test case for {@link DefaultChartDataModel#getColumnValueAt(int)} method.
		* Test data:
		* <ul>
		* <li>columns: {1.0, 2.0, 3.0, 4.0, 5.0}</li>
		* <li>rows: {1.0, 2.0, 3.0, 4.0, 5.0}</li>
		* <li>data: {{1.0, 2.0, 3.0, 4.0, 5.0}}</li>
		* </ul>
		* Expected result:
		* <ul>
		* <li>column value at index 5: null</li>
		* </ul>
		*/
		@Test
		void testGetColumnValueAt_8() {
				double[] columns = {1.0, 2.0, 3.0, 4.0, 5.0};
				String[] rows = {"1.0", "2.0", "3.0", "4.0", "5.0"};
				double[][] data = {{1.0, 2.0, 3.0, 4.0, 5.0}};
				DefaultChartDataModel model = new DefaultChartDataModel(data, columns, rows);
				assertNull(model.getColumnValueAt(0, 5));
		}
		
		/**
		* Test case for {@link DefaultChartDataModel#getColumnValueAt(int)} method.
		* Test data:
		* <ul>
		* <li>columns: {1.0, 2.0, 3.0, 4.0, 5.0}</li>
		* <li>rows: {1.0, 2.0, 3.0, 4.0, 5.0}</li>
		* <li>data: {{1.0, 2.0, 3.0, 4.0, 5.0}}</li>
		* </ul>
		* Expected result:
		* <ul>
		* <li>column value at index -1: null</li>
		* </ul>
		*/
		@Test
		void testGetColumnValueAt_9() {
				double[] columns = {1.0, 2.0, 3.0, 4.0, 5.0};
				String[] rows = {"1.0", "2.0", "3.0", "4.0", "5.0"};
				double[][] data = {{1.0, 2.0, 3.0, 4.0, 5.0}};
				DefaultChartDataModel model = new DefaultChartDataModel(data, columns, rows);
				assertNull(model.getColumnValueAt(0, -1));
		}
		
		/**
		* Test case for {@link DefaultChartDataModel#getColumnValueAt(int)} method.
		* Test data:
		* <ul>
		* <li>columns: {1.0, 2.0, 3.0, 4.0, 5.0}</li>
		* <li>rows: {1.0, 2.0, 3.0, 4.0, 5.0}</li>
		* <li>data: {{1.0, 2.0, 3.0, 4.0, 5.0}}</li>
		* </ul>
		* Expected result:
		* <ul>
		* <li>column value at index 0: 1.0</li>
		* <li>column value at index 1: 2.0</li>
		* <li>column value at index 2: 3.0</li>
		* <li>column value at index 3: 4.0</li>
		*