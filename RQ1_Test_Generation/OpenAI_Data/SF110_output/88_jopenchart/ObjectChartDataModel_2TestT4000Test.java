// ObjectChartDataModel_2Test.java
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
* It contains ten unit test cases for the {@link ObjectChartDataModel#getAxisBinding(int)} method.
*/
class ObjectChartDataModel_2Test {

		/**
		* Test case for the {@link ObjectChartDataModel#getAxisBinding(int)} method.
		* The test case tests the method with the following parameter:
		* <ul>
		* <li>set = 0</li>
		* </ul>
		* The expected result is that the method returns the following value:
		* <ul>
		* <li>CoordSystem.FIRST_YAXIS</li>
		* </ul>
		*/
		@Test
		void testGetAxisBinding_1() {
				ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
				int set = 0;
				int result = objectChartDataModel.getAxisBinding(set);
				assertEquals(CoordSystem.FIRST_YAXIS, result);
		}
		
		/**
		* Test case for the {@link ObjectChartDataModel#getAxisBinding(int)} method.
		* The test case tests the method with the following parameter:
		* <ul>
		* <li>set = 1</li>
		* </ul>
		* The expected result is that the method returns the following value:
		* <ul>
		* <li>CoordSystem.FIRST_YAXIS</li>
		* </ul>
		*/
		@Test
		void testGetAxisBinding_2() {
				ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
				int set = 1;
				int result = objectChartDataModel.getAxisBinding(set);
				assertEquals(CoordSystem.FIRST_YAXIS, result);
		}
		
		/**
		* Test case for the {@link ObjectChartDataModel#getAxisBinding(int)} method.
		* The test case tests the method with the following parameter:
		* <ul>
		* <li>set = 2</li>
		* </ul>
		* The expected result is that the method returns the following value:
		* <ul>
		* <li>CoordSystem.FIRST_YAXIS</li>
		* </ul>
		*/
		@Test
		void testGetAxisBinding_3() {
				ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
				int set = 2;
				int result = objectChartDataModel.getAxisBinding(set);
				assertEquals(CoordSystem.FIRST_YAXIS, result);
		}
		
		/**
		* Test case for the {@link ObjectChartDataModel#getAxisBinding(int)} method.
		* The test case tests the method with the following parameter:
		* <ul>
		* <li>set = 3</li>
		* </ul>
		* The expected result is that the method returns the following value:
		* <ul>
		* <li>CoordSystem.FIRST_YAXIS</li>
		* </ul>
		*/
		@Test
		void testGetAxisBinding_4() {
				ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
				int set = 3;
				int result = objectChartDataModel.getAxisBinding(set);
				assertEquals(CoordSystem.FIRST_YAXIS, result);
		}
		
		/**
		* Test case for the {@link ObjectChartDataModel#getAxisBinding(int)} method.
		* The test case tests the method with the following parameter:
		* <ul>
		* <li>set = 4</li>
		* </ul>
		* The expected result is that the method returns the following value:
		* <ul>
		* <li>CoordSystem.FIRST_YAXIS</li>
		* </ul>
		*/
		@Test
		void testGetAxisBinding_5() {
				ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
				int set = 4;
				int result = objectChartDataModel.getAxisBinding(set);
				assertEquals(CoordSystem.FIRST_YAXIS, result);
		}
		
		/**
		* Test case for the {@link ObjectChartDataModel#getAxisBinding(int)} method.
		* The test case tests the method with the following parameter:
		* <ul>
		* <li>set = 5</li>
		* </ul>
		* The expected result is that the method returns the following value:
		* <ul>
		* <li>CoordSystem.FIRST_YAXIS</li>
		* </ul>
		*/
		@Test
		void testGetAxisBinding_6() {
				ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
				int set = 5;
				int result = objectChartDataModel.getAxisBinding(set);
				assertEquals(CoordSystem.FIRST_YAXIS, result);
		}
		
		/**
		* Test case for the {@link ObjectChartDataModel#getAxisBinding(int)} method.
		* The test case tests the method with the following parameter:
		* <ul>
		* <li>set = 6</li>
		* </ul>
		* The expected result is that the method returns the following value:
		* <ul>
		* <li>CoordSystem.FIRST_YAXIS</li>
		* </ul>
		*/
		@Test
		void testGetAxisBinding_7() {
				ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
				int set = 6;
				int result = objectChartDataModel.getAxisBinding(set);
				assertEquals(CoordSystem.FIRST_YAXIS, result);
		}
		
		/**
		* Test case for the {@link ObjectChartDataModel#getAxisBinding(int)} method.
		* The test case tests the method with the following parameter:
		* <ul>
		* <li>set = 7</li>
		* </ul>
		* The expected result is that the method returns the following value:
		* <ul>
		* <li>CoordSystem.FIRST_YAXIS</li>
		* </ul>
		*/
		@Test
		void testGetAxisBinding_8() {
				ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
				int set = 7;
				int result = objectChartDataModel.getAxisBinding(set);
				assertEquals(CoordSystem.FIRST_YAXIS, result);
		}
		
		/**
		* Test case for the {@link ObjectChartDataModel#getAxisBinding(int)} method.
		* The test case tests the method with the following parameter:
		* <ul>
		* <li>set = 8</li>
		* </ul>
		* The expected result is that the method returns the following value:
		* <ul>
		* <li>CoordSystem.FIRST_YAXIS</li>
		* </ul>
		*/
		@Test
		void testGetAxisBinding_9() {
				ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
				int set = 8;
				int result = objectChartDataModel.getAxisBinding(set);
				assertEquals(CoordSystem.FIRST_YAXIS, result);
		}
		
		/**
		* Test case for the {@link ObjectChartDataModel#getAxisBinding(int)} method.
		* The test case tests the method with the following parameter:
		* <ul>
		* <li>set = 9</li>
		* </ul>
		* The expected result is that the method returns the following value:
		* <ul>
		* <li>CoordSystem.FIRST_YAXIS</li>
		* </ul>
		*/
		@Test
		void testGetAxisBinding_10() {
				ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
				int set = 9;
				int result = objectChartDataModel.getAxisBinding(set);
				assertEquals(CoordSystem.FIRST_YAXIS, result);
		}
}

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
* It contains ten unit test cases for the {@link ObjectChartDataModel#getDataSetLength(int)} method.
*/
class ObjectChartDataModel_3Test {
		
		/**
		* Test case for the {@link ObjectChartDataModel#getDataSetLength(int)} method.
		* The test case tests the method with the following parameter:
		* <ul>
		* <li>set = 0</li>
		* </ul>
		* The expected result is that the method returns the following value:
		* <ul>
		* <li>0</li>
		* </ul>
		*/
		@Test
		void testGetDataSetLength_1() {
				ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
				int set = 0;
				int result = objectChartDataModel.getDataSetLength(set);
				assertEquals(0, result);
		}
		
		/**
		* Test case for the {@link ObjectChartDataModel#getDataSetLength(int)} method.
		* The test case tests the method with the following parameter:
		* <ul>
		* <li>set = 1</li>
		* </ul>
		* The expected result is that the method returns the following value:
		* <ul>
		* <li>0</li>
		* </ul>
		*/
		@Test
		void testGetDataSetLength_2() {
				ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
				int set = 1;
				int result = objectChartDataModel.getDataSetLength(set);
				assertEquals(0, result);
		}
		
		/**
		* Test case for the {@link ObjectChartDataModel#getDataSetLength(int)} method.
		* The test case tests the method with the following parameter:
		* <ul>
		* <li>set = 2</li>
		* </ul>
		* The expected result is that the method returns the following value:
		* <ul>
		* <li>0</li>
		* </ul>
		*/
		@Test
		void testGetDataSetLength_3() {
				ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
				int set = 2;
				int result = objectChartDataModel.getDataSetLength(set);
				assertEquals(0, result);
		}
		
		/**
		* Test case for the {@link ObjectChartDataModel#getDataSetLength(int)} method.
		* The test case tests the method with the following parameter:
		* <ul>
		* <li>set = 3</li>
		* </ul>
		* The expected result is that the method returns the following value:
		* <ul>
		* <li>0</li>
		* </ul>
		*/
		@Test
		void testGetDataSetLength_4() {
				ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
				int set = 3;
				int result = objectChartDataModel.getDataSetLength(set);
				assertEquals(0, result);
		}
		
		/**
		* Test case for the {@link ObjectChartDataModel#getDataSetLength(int)} method.
		* The test case tests the method with the following parameter:
		* <ul>
		* <li>set = 4</li>
		* </ul>
		* The expected result is that the method returns the following value:
		* <ul>
		* <li>0</li>
		* </ul>
		*/
		@Test
		void testGetDataSetLength_5() {
				ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
				int set = 4;
				int result = objectChartDataModel.getDataSetLength(set);
				assertEquals(0, result);
		}
		
		/**
		* Test case for the {@link ObjectChartDataModel#getDataSetLength(int)} method.
		* The test case tests the method with the following parameter:
		* <ul>
		* <li>set = 5</li>
		* </ul>
		* The expected result is that the method returns the following value:
		* <ul>
		* <li>0</li>
		* </ul>
		*/
		@Test
		void testGetDataSetLength_6() {
				ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
				int set = 5;
				int result = objectChartDataModel.getDataSetLength(set);
				assertEquals(0, result);
		}
		
		/**
		* Test case for the {@link ObjectChartDataModel#getDataSetLength(int)} method.
		* The test case tests the method with the following parameter:
		* <ul>
		* <li>set = 6</li>
		* </ul>
		* The expected result is that the method returns the following value:
		* <ul>
		* <li>0</li>
		* </ul>
		*/
		@Test
		void testGetDataSetLength_7() {
				ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
				int set = 6;
				int result = objectChartDataModel.getDataSetLength(set);
				assertEquals(0, result);
		}
		
		/**
		* Test case for the {@link ObjectChartDataModel#getDataSetLength(int)} method.
		* The test case tests the method with the following parameter:
		* <ul>
		* <li>set = 7</li>
		* </ul>
		* The expected result is that the method returns the following value:
		* <ul>
		* <li>0</li>
		* </ul>
		*/
		@Test
		void testGetDataSetLength_8() {
				ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();