// ObjectChartDataModel_3Test.java
package de.progra.charting.model;

import de.progra.charting.CoordSystem;
import de.progra.charting.ChartUtilities;
import java.util.TreeSet;
import java.util.Set;
import java.util.HashMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ObjectChartDataModel}.
* It contains ten unit test cases for the {@link ObjectChartDataModel#getValueAt(int, int)} method.
*/
class ObjectChartDataModel_3Test {

		/**
		* Test case for {@link ObjectChartDataModel#getValueAt(int, int)} method.
		* Test case for the scenario when the index is out of bounds.
		*/
		@Test
		void testGetValueAt_1() {
				ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
				Number[][] data = new Number[][] { { 1.0, 2.0, 3.0 }, { 4.0, 5.0, 6.0 } };
				Object[] columns = new Object[] { "a", "b", "c" };
				String[] rows = new String[] { "row1", "row2" };
				objectChartDataModel = new ObjectChartDataModel(data, columns, rows);
				Number actual = objectChartDataModel.getValueAt(0, 3);
				Number expected = null;
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link ObjectChartDataModel#getValueAt(int, int)} method.
		* Test case for the scenario when the index is out of bounds.
		*/
		@Test
		void testGetValueAt_2() {
				ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
				Number[][] data = new Number[][] { { 1.0, 2.0, 3.0 }, { 4.0, 5.0, 6.0 } };
				Object[] columns = new Object[] { "a", "b", "c" };
				String[] rows = new String[] { "row1", "row2" };
				objectChartDataModel = new ObjectChartDataModel(data, columns, rows);
				Number actual = objectChartDataModel.getValueAt(0, -1);
				Number expected = null;
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link ObjectChartDataModel#getValueAt(int, int)} method.
		* Test case for the scenario when the index is out of bounds.
		*/
		@Test
		void testGetValueAt_3() {
				ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
				Number[][] data = new Number[][] { { 1.0, 2.0, 3.0 }, { 4.0, 5.0, 6.0 } };
				Object[] columns = new Object[] { "a", "b", "c" };
				String[] rows = new String[] { "row1", "row2" };
				objectChartDataModel = new ObjectChartDataModel(data, columns, rows);
				Number actual = objectChartDataModel.getValueAt(2, 0);
				Number expected = null;
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link ObjectChartDataModel#getValueAt(int, int)} method.
		* Test case for the scenario when the index is out of bounds.
		*/
		@Test
		void testGetValueAt_4() {
				ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
				Number[][] data = new Number[][] { { 1.0, 2.0, 3.0 }, { 4.0, 5.0, 6.0 } };
				Object[] columns = new Object[] { "a", "b", "c" };
				String[] rows = new String[] { "row1", "row2" };
				objectChartDataModel = new ObjectChartDataModel(data, columns, rows);
				Number actual = objectChartDataModel.getValueAt(-1, 0);
				Number expected = null;
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link ObjectChartDataModel#getValueAt(int, int)} method.
		* Test case for the scenario when the index is out of bounds.
		*/
		@Test
		void testGetValueAt_5() {
				ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
				Number[][] data = new Number[][] { { 1.0, 2.0, 3.0 }, { 4.0, 5.0, 6.0 } };
				Object[] columns = new Object[] { "a", "b", "c" };
				String[] rows = new String[] { "row1", "row2" };
				objectChartDataModel = new ObjectChartDataModel(data, columns, rows);
				Number actual = objectChartDataModel.getValueAt(0, 0);
				Number expected = 1.0;
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link ObjectChartDataModel#getValueAt(int, int)} method.
		* Test case for the scenario when the index is out of bounds.
		*/
		@Test
		void testGetValueAt_6() {
				ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
				Number[][] data = new Number[][] { { 1.0, 2.0, 3.0 }, { 4.0, 5.0, 6.0 } };
				Object[] columns = new Object[] { "a", "b", "c" };
				String[] rows = new String[] { "row1", "row2" };
				objectChartDataModel = new ObjectChartDataModel(data, columns, rows);
				Number actual = objectChartDataModel.getValueAt(0, 1);
				Number expected = 2.0;
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link ObjectChartDataModel#getValueAt(int, int)} method.
		* Test case for the scenario when the index is out of bounds.
		*/
		@Test
		void testGetValueAt_7() {
				ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
				Number[][] data = new Number[][] { { 1.0, 2.0, 3.0 }, { 4.0, 5.0, 6.0 } };
				Object[] columns = new Object[] { "a", "b", "c" };
				String[] rows = new String[] { "row1", "row2" };
				objectChartDataModel = new ObjectChartDataModel(data, columns, rows);
				Number actual = objectChartDataModel.getValueAt(0, 2);
				Number expected = 3.0;
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link ObjectChartDataModel#getValueAt(int, int)} method.
		* Test case for the scenario when the index is out of bounds.
		*/
		@Test
		void testGetValueAt_8() {
				ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
				Number[][] data = new Number[][] { { 1.0, 2.0, 3.0 }, { 4.0, 5.0, 6.0 } };
				Object[] columns = new Object[] { "a", "b", "c" };
				String[] rows = new String[] { "row1", "row2" };
				objectChartDataModel = new ObjectChartDataModel(data, columns, rows);
				Number actual = objectChartDataModel.getValueAt(1, 0);
				Number expected = 4.0;
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link ObjectChartDataModel#getValueAt(int, int)} method.
		* Test case for the scenario when the index is out of bounds.
		*/
		@Test
		void testGetValueAt_9() {
				ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
				Number[][] data = new Number[][] { { 1.0, 2.0, 3.0 }, { 4.0, 5.0, 6.0 } };
				Object[] columns = new Object[] { "a", "b", "c" };
				String[] rows = new String[] { "row1", "row2" };
				objectChartDataModel = new ObjectChartDataModel(data, columns, rows);
				Number actual = objectChartDataModel.getValueAt(1, 1);
				Number expected = 5.0;
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link ObjectChartDataModel#getValueAt(int, int)} method.
		* Test case for the scenario when the index is out of bounds.
		*/
		@Test
		void testGetValueAt_10() {
				ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
				Number[][] data = new Number[][] { { 1.0, 2.0, 3.0 }, { 4.0, 5.0, 6.0 } };
				Object[] columns = new Object[] { "a", "b", "c" };
				String[] rows = new String[] { "row1", "row2" };
				objectChartDataModel = new ObjectChartDataModel(data, columns, rows);
				Number actual = objectChartDataModel.getValueAt(1, 2);
				Number expected = 6.0;
				assertEquals(expected, actual);
		}
}

// ObjectChartDataModel_4Test.java
package de.progra.charting.model;

import de.progra.charting.CoordSystem;
import de.progra.charting.ChartUtilities;
import java.util.TreeSet;
import java.util.Set;
import java.util.HashMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ObjectChartDataModel}.
* It contains ten unit test cases for the {@link ObjectChartDataModel#getColumnValueAt(int)} method.
*/
class ObjectChartDataModel_4Test {
		
		/**
		* Test case for {@link ObjectChartDataModel#getColumnValueAt(int)} method.
		* Test case for the scenario when the index is out of bounds.
		*/
		@Test
		void testGetColumnValueAt_1() {
				ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
				Number[][] data = new Number[][] { { 1.0, 2.0, 3.0 }, { 4.0, 5.0, 6.0 } };
				Object[] columns = new Object[] { "a", "b", "c" };
				String[] rows = new String[] { "row1", "row2" };
				objectChartDataModel = new ObjectChartDataModel(data, columns, rows);
				Object actual = objectChartDataModel.getColumnValueAt(3);
				Object expected = null;
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link ObjectChartDataModel#getColumnValueAt(int)} method.
		* Test case for the scenario when the index is out of bounds.
		*/
		@Test
		void testGetColumnValueAt_2() {
				ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
				Number[][] data = new Number[][] { { 1.0, 2.0, 3.0 }, { 4.0, 5.0, 6.0 } };
				Object[] columns = new Object[] { "a", "b", "c" };
				String[] rows = new String[] { "row1", "row2" };
				objectChartDataModel = new ObjectChartDataModel(data, columns, rows);
				Object actual = objectChartDataModel.getColumnValueAt(-1);
				Object expected = null;
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link ObjectChartDataModel#getColumnValueAt(int)} method.
		* Test case for the scenario when the index is out of bounds.
		*/
		@Test
		void testGetColumnValueAt_3() {
				ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
				Number[][] data = new Number[][] { { 1.0, 2.0, 3.0 }, { 4.0, 5.0, 6.0 } };
				Object[] columns = new Object[] { "a", "b", "c" };
				String[] rows = new String[] { "row1", "row2" };
				objectChartDataModel = new ObjectChartDataModel(data, columns, rows);
				Object actual = objectChartDataModel.getColumnValueAt(0);
				Object expected = "a";
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link ObjectChartDataModel#getColumnValueAt(int)} method.
		* Test case for the scenario when the index is out of bounds.
		*/
		@Test
		void testGetColumnValueAt_4() {
				ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
				Number[][] data = new Number[][] { { 1.0, 2.0, 3.0 }, { 4.0, 5.0, 6.0 } };
				Object[] columns = new Object[] { "a", "b", "c" };
				String[] rows = new String[] { "row1", "row2" };
				objectChartDataModel = new ObjectChartDataModel(data, columns, rows);
				Object actual = objectChartDataModel.getColumnValueAt(1);
				Object expected = "b";
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link ObjectChartDataModel#getColumnValueAt(int)} method.
		* Test case for the scenario when the index is out of bounds.
		*/
		@Test
		void testGetColumnValueAt_5() {
				ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
				Number[][] data = new Number[][] { { 1.0, 2.0, 3.0 }, { 4.0, 5.0, 6.0 } };
				Object[] columns = new Object[] { "a", "b", "c" };
				String[] rows = new String[] { "row1", "row2" };
				objectChartDataModel = new ObjectChartDataModel(data, columns, rows);
				Object actual = objectChartDataModel.getColumnValueAt(2);
				Object expected = "c";
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link ObjectChartDataModel#getColumnValueAt(int)} method.
		* Test case for the scenario when the index is out of bounds.
		*/
		@Test
		void testGetColumnValueAt_6() {
				ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel