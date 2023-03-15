// ObjectChartDataModel_5Test.java
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
class ObjectChartDataModel_5Test {

		/**
		* Test case for the {@link ObjectChartDataModel#getColumnValueAt(int)} method.
		* The test case tests the method with a negative column index.
		*/
		@Test
		void testGetColumnValueAt_1() {
				ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
				Object result = objectChartDataModel.getColumnValueAt(-1);
				assertNull(result);
		}
		
		/**
		* Test case for the {@link ObjectChartDataModel#getColumnValueAt(int)} method.
		* The test case tests the method with a column index of 0.
		*/
		@Test
		void testGetColumnValueAt_2() {
				ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
				Object result = objectChartDataModel.getColumnValueAt(0);
				assertNull(result);
		}
		
		/**
		* Test case for the {@link ObjectChartDataModel#getColumnValueAt(int)} method.
		* The test case tests the method with a column index of 1.
		*/
		@Test
		void testGetColumnValueAt_3() {
				ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
				Object result = objectChartDataModel.getColumnValueAt(1);
				assertNull(result);
		}
		
		/**
		* Test case for the {@link ObjectChartDataModel#getColumnValueAt(int)} method.
		* The test case tests the method with a column index of 2.
		*/
		@Test
		void testGetColumnValueAt_4() {
				ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
				Object result = objectChartDataModel.getColumnValueAt(2);
				assertNull(result);
		}
		
		/**
		* Test case for the {@link ObjectChartDataModel#getColumnValueAt(int)} method.
		* The test case tests the method with a column index of 3.
		*/
		@Test
		void testGetColumnValueAt_5() {
				ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
				Object result = objectChartDataModel.getColumnValueAt(3);
				assertNull(result);
		}
		
		/**
		* Test case for the {@link ObjectChartDataModel#getColumnValueAt(int)} method.
		* The test case tests the method with a column index of 4.
		*/
		@Test
		void testGetColumnValueAt_6() {
				ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
				Object result = objectChartDataModel.getColumnValueAt(4);
				assertNull(result);
		}
		
		/**
		* Test case for the {@link ObjectChartDataModel#getColumnValueAt(int)} method.
		* The test case tests the method with a column index of 5.
		*/
		@Test
		void testGetColumnValueAt_7() {
				ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
				Object result = objectChartDataModel.getColumnValueAt(5);
				assertNull(result);
		}
		
		/**
		* Test case for the {@link ObjectChartDataModel#getColumnValueAt(int)} method.
		* The test case tests the method with a column index of 6.
		*/
		@Test
		void testGetColumnValueAt_8() {
				ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
				Object result = objectChartDataModel.getColumnValueAt(6);
				assertNull(result);
		}
		
		/**
		* Test case for the {@link ObjectChartDataModel#getColumnValueAt(int)} method.
		* The test case tests the method with a column index of 7.
		*/
		@Test
		void testGetColumnValueAt_9() {
				ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
				Object result = objectChartDataModel.getColumnValueAt(7);
				assertNull(result);
		}
		
		/**
		* Test case for the {@link ObjectChartDataModel#getColumnValueAt(int)} method.
		* The test case tests the method with a column index of 8.
		*/
		@Test
		void testGetColumnValueAt_10() {
				ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
				Object result = objectChartDataModel.getColumnValueAt(8);
				assertNull(result);
		}
}

// ObjectChartDataModel_6Test.java
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
* It contains ten unit test cases for the {@link ObjectChartDataModel#getColumnValueAt(int, int)} method.
*/
class ObjectChartDataModel_6Test {
		
		/**
		* Test case for the {@link ObjectChartDataModel#getColumnValueAt(int, int)} method.
		* The test case tests the method with a negative column index.
		*/
		@Test
		void testGetColumnValueAt_1() {
				ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
				Object result = objectChartDataModel.getColumnValueAt(0, -1);
				assertNull(result);
		}
		
		/**
		* Test case for the {@link ObjectChartDataModel#getColumnValueAt(int, int)} method.
		* The test case tests the method with a column index of 0.
		*/
		@Test
		void testGetColumnValueAt_2() {
				ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
				Object result = objectChartDataModel.getColumnValueAt(0, 0);
				assertNull(result);
		}
		
		/**
		* Test case for the {@link ObjectChartDataModel#getColumnValueAt(int, int)} method.
		* The test case tests the method with a column index of 1.
		*/
		@Test
		void testGetColumnValueAt_3() {
				ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
				Object result = objectChartDataModel.getColumnValueAt(0, 1);
				assertNull(result);
		}
		
		/**
		* Test case for the {@link ObjectChartDataModel#getColumnValueAt(int, int)} method.
		* The test case tests the method with a column index of 2.
		*/
		@Test
		void testGetColumnValueAt_4() {
				ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
				Object result = objectChartDataModel.getColumnValueAt(0, 2);
				assertNull(result);
		}
		
		/**
		* Test case for the {@link ObjectChartDataModel#getColumnValueAt(int, int)} method.
		* The test case tests the method with a column index of 3.
		*/
		@Test
		void testGetColumnValue