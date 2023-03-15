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
* It contains ten unit test cases for the {@link ObjectChartDataModel#getChartDataModelConstraints(int)} method.
*/
class ObjectChartDataModel_4Test {

		/**
		* Test case for {@link ObjectChartDataModel#getChartDataModelConstraints(int)} method.
		* Test case for the first y-axis.
		*/
		@Test
		void testGetChartDataModelConstraints_1() {
				ObjectChartDataModel ocdm = new ObjectChartDataModel();
				ChartDataModelConstraints cdmc = ocdm.getChartDataModelConstraints(CoordSystem.FIRST_YAXIS);
				assertEquals(cdmc.getMaxValue(), 1.0);
				assertEquals(cdmc.getMinValue(), 0.0);
		}
		
		/**
		* Test case for {@link ObjectChartDataModel#getChartDataModelConstraints(int)} method.
		* Test case for the second y-axis.
		*/
		@Test
		void testGetChartDataModelConstraints_2() {
				ObjectChartDataModel ocdm = new ObjectChartDataModel();
				ChartDataModelConstraints cdmc = ocdm.getChartDataModelConstraints(CoordSystem.SECOND_YAXIS);
				assertEquals(cdmc.getMaxValue(), 1.0);
				assertEquals(cdmc.getMinValue(), 0.0);
		}
		
		/**
		* Test case for {@link ObjectChartDataModel#getChartDataModelConstraints(int)} method.
		* Test case for the first y-axis.
		*/
		@Test
		void testGetChartDataModelConstraints_3() {
				ObjectChartDataModel ocdm = new ObjectChartDataModel(new Number[][]{{1, 2, 3}, {4, 5, 6}}, new Object[]{"a", "b", "c"}, new String[]{"d", "e"});
				ChartDataModelConstraints cdmc = ocdm.getChartDataModelConstraints(CoordSystem.FIRST_YAXIS);
				assertEquals(cdmc.getMaxValue(), 6.0);
				assertEquals(cdmc.getMinValue(), 1.0);
		}
		
		/**
		* Test case for {@link ObjectChartDataModel#getChartDataModelConstraints(int)} method.
		* Test case for the second y-axis.
		*/
		@Test
		void testGetChartDataModelConstraints_4() {
				ObjectChartDataModel ocdm = new ObjectChartDataModel(new Number[][]{{1, 2, 3}, {4, 5, 6}}, new Object[]{"a", "b", "c"}, new String[]{"d", "e"});
				ChartDataModelConstraints cdmc = ocdm.getChartDataModelConstraints(CoordSystem.SECOND_YAXIS);
				assertEquals(cdmc.getMaxValue(), 1.0);
				assertEquals(cdmc.getMinValue(), 0.0);
		}
		
		/**
		* Test case for {@link ObjectChartDataModel#getChartDataModelConstraints(int)} method.
		* Test case for the first y-axis.
		*/
		@Test
		void testGetChartDataModelConstraints_5() {
				ObjectChartDataModel ocdm = new ObjectChartDataModel(new int[][]{{1, 2, 3}, {4, 5, 6}}, new Object[]{"a", "b", "c"}, new String[]{"d", "e"});
				ChartDataModelConstraints cdmc = ocdm.getChartDataModelConstraints(CoordSystem.FIRST_YAXIS);
				assertEquals(cdmc.getMaxValue(), 6.0);
				assertEquals(cdmc.getMinValue(), 1.0);
		}
		
		/**
		* Test case for {@link ObjectChartDataModel#getChartDataModelConstraints(int)} method.
		* Test case for the second y-axis.
		*/
		@Test
		void testGetChartDataModelConstraints_6() {
				ObjectChartDataModel ocdm = new ObjectChartDataModel(new int[][]{{1, 2, 3}, {4, 5, 6}}, new Object[]{"a", "b", "c"}, new String[]{"d", "e"});
				ChartDataModelConstraints cdmc = ocdm.getChartDataModelConstraints(CoordSystem.SECOND_YAXIS);
				assertEquals(cdmc.getMaxValue(), 1.0);
				assertEquals(cdmc.getMinValue(), 0.0);
		}
		
		/**
		* Test case for {@link ObjectChartDataModel#getChartDataModelConstraints(int)} method.
		* Test case for the first y-axis.
		*/
		@Test
		void testGetChartDataModelConstraints_7() {
				ObjectChartDataModel ocdm = new ObjectChartDataModel(new double[][]{{1, 2, 3}, {4, 5, 6}}, new Object[]{"a", "b", "c"}, new String[]{"d", "e"});
				ChartDataModelConstraints cdmc = ocdm.getChartDataModelConstraints(CoordSystem.FIRST_YAXIS);
				assertEquals(cdmc.getMaxValue(), 6.0);
				assertEquals(cdmc.getMinValue(), 1.0);
		}
		
		/**
		* Test case for {@link ObjectChartDataModel#getChartDataModelConstraints(int)} method.
		* Test case for the second y-axis.
		*/
		@Test
		void testGetChartDataModelConstraints_8() {
				ObjectChartDataModel ocdm = new ObjectChartDataModel(new double[][]{{1, 2, 3}, {4, 5, 6}}, new Object[]{"a", "b", "c"}, new String[]{"d", "e"});
				ChartDataModelConstraints cdmc = ocdm.getChartDataModelConstraints(CoordSystem.SECOND_YAXIS);
				assertEquals(cdmc.getMaxValue(), 1.0);
				assertEquals(cdmc.getMinValue(), 0.0);
		}
		
		/**
		* Test case for {@link ObjectChartDataModel#getChartDataModelConstraints(int)} method.
		* Test case for the first y-axis.
		*/
		@Test
		void testGetChartDataModelConstraints_9() {
				ObjectChartDataModel ocdm = new ObjectChartDataModel(new DataSet[]{new DefaultDataSet(new Number[]{1, 2, 3}, new Object[]{"a", "b", "c"}, CoordSystem.FIRST_YAXIS, "d"), new DefaultDataSet(new Number[]{4, 5, 6}, new Object[]{"a", "b", "c"}, CoordSystem.FIRST_YAXIS, "e")}, new Object[]{"a", "b", "c"});
				ChartDataModelConstraints cdmc = ocdm.getChartDataModelConstraints(CoordSystem.FIRST_YAXIS);
				assertEquals(cdmc.getMaxValue(), 6.0);
				assertEquals(cdmc.getMinValue(), 1.0);
		}
		
		/**
		* Test case for {@link ObjectChartDataModel#getChartDataModelConstraints(int)} method.
		* Test case for the second y-axis.
		*/
		@Test
		void testGetChartDataModelConstraints_10() {
				ObjectChartDataModel ocdm = new ObjectChartDataModel(new DataSet[]{new DefaultDataSet(new Number[]