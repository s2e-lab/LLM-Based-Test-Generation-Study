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
		* Test case for the following input values:
		* <ul>
		* <li>set = 0</li>
		* <li>index = 0</li>
		* </ul>
		*
		* @throws Exception
		* 				if an error occurred
		*/
		@Test
		void testGetValueAt_1() throws Exception {
				ObjectChartDataModel fixture = new ObjectChartDataModel();
				fixture.setChartDataModelConstraints(CoordSystem.FIRST_YAXIS, new DefaultChartDataModelConstraints(fixture, CoordSystem.FIRST_YAXIS, false));
				fixture.setChartDataModelConstraints(CoordSystem.SECOND_YAXIS, new DefaultChartDataModelConstraints(fixture, CoordSystem.SECOND_YAXIS, false));
				int set = 0;
				int index = 0;
				Number result = fixture.getValueAt(set, index);
				assertEquals(null, result);
		}
		
		/**
		* Test case for {@link ObjectChartDataModel#getValueAt(int, int)} method.
		* Test case for the following input values:
		* <ul>
		* <li>set = 0</li>
		* <li>index = 1</li>
		* </ul>
		*
		* @throws Exception
		* 				if an error occurred
		*/
		@Test
		void testGetValueAt_2() throws Exception {
				ObjectChartDataModel fixture = new ObjectChartDataModel();
				fixture.setChartDataModelConstraints(CoordSystem.FIRST_YAXIS, new DefaultChartDataModelConstraints(fixture, CoordSystem.FIRST_YAXIS, false));
				fixture.setChartDataModelConstraints(CoordSystem.SECOND_YAXIS, new DefaultChartDataModelConstraints(fixture, CoordSystem.SECOND_YAXIS, false));
				int set = 0;
				int index = 1;
				Number result = fixture.getValueAt(set, index);
				assertEquals(null, result);
		}
		
		/**
		* Test case for {@link ObjectChartDataModel#getValueAt(int, int)} method.
		* Test case for the following input values:
		* <ul>
		* <li>set = 0</li>
		* <li>index = 2</li>
		* </ul>
		*
		* @throws Exception
		* 				if an error occurred
		*/
		@Test
		void testGetValueAt_3() throws Exception {
				ObjectChartDataModel fixture = new ObjectChartDataModel();
				fixture.setChartDataModelConstraints(CoordSystem.FIRST_YAXIS, new DefaultChartDataModelConstraints(fixture, CoordSystem.FIRST_YAXIS, false));
				fixture.setChartDataModelConstraints(CoordSystem.SECOND_YAXIS, new DefaultChartDataModelConstraints(fixture, CoordSystem.SECOND_YAXIS, false));
				int set = 0;
				int index = 2;
				Number result = fixture.getValueAt(set, index);
				assertEquals(null, result);
		}
		
		/**
		* Test case for {@link ObjectChartDataModel#getValueAt(int, int)} method.
		* Test case for the following input values:
		* <ul>
		* <li>set = 0</li>
		* <li>index = 3</li>
		* </ul>
		*
		* @throws Exception
		* 				if an error occurred
		*/
		@Test
		void testGetValueAt_4() throws Exception {
				ObjectChartDataModel fixture = new ObjectChartDataModel();
				fixture.setChartDataModelConstraints(CoordSystem.FIRST_YAXIS, new DefaultChartDataModelConstraints(fixture, CoordSystem.FIRST_YAXIS, false));
				fixture.setChartDataModelConstraints(CoordSystem.SECOND_YAXIS, new DefaultChartDataModelConstraints(fixture, CoordSystem.SECOND_YAXIS, false));
				int set = 0;
				int index = 3;
				Number result = fixture.getValueAt(set, index);
				assertEquals(null, result);
		}
		
		/**
		* Test case for {@link ObjectChartDataModel#getValueAt(int, int)} method.
		* Test case for the following input values:
		* <ul>
		* <li>set = 0</li>
		* <li>index = 4</li>
		* </ul>
		*
		* @throws Exception
		* 				if an error occurred
		*/
		@Test
		void testGetValueAt_5() throws Exception {
				ObjectChartDataModel fixture = new ObjectChartDataModel();
				fixture.setChartDataModelConstraints(CoordSystem.FIRST_YAXIS, new DefaultChartDataModelConstraints(fixture, CoordSystem.FIRST_YAXIS, false));
				fixture.setChartDataModelConstraints(CoordSystem.SECOND_YAXIS, new DefaultChartDataModelConstraints(fixture, CoordSystem.SECOND_YAXIS, false));
				int set = 0;
				int index = 4;
				Number result = fixture.getValueAt(set, index);
				assertEquals(null, result);
		}
		
		/**
		* Test case for {@link ObjectChartDataModel#getValueAt(int, int)} method.
		* Test case for the following input values:
		* <ul>
		* <li>set = 0</li>
		* <li>index = 5</li>
		* </ul>
		*
		* @throws Exception
		* 				if an error occurred
		*/
		@Test
		void testGetValueAt_6() throws Exception {
				ObjectChartDataModel fixture = new ObjectChartDataModel();
				fixture.setChartDataModelConstraints(CoordSystem.FIRST_YAXIS, new DefaultChartDataModelConstraints(fixture, CoordSystem.FIRST_YAXIS, false));
				fixture.setChartDataModelConstraints(CoordSystem.SECOND_YAXIS, new DefaultChartDataModelConstraints(fixture, CoordSystem.SECOND_YAXIS, false));
				int set = 0;
				int index = 5;
				Number result = fixture.getValueAt(set, index);
				assertEquals(null, result);
		}
		
		/**
		* Test case for {@link ObjectChartDataModel#getValueAt(int, int)} method.
		* Test case for the following input values:
		* <ul>
		* <li>set = 0</li>
		* <li>index = 6</li>
		* </ul>
		*
		* @throws Exception
		* 				if an error occurred
		*/
		@Test
		void testGetValueAt_7() throws Exception {
				ObjectChartDataModel fixture = new ObjectChartDataModel();
				fixture.setChartDataModelConstraints(Coord