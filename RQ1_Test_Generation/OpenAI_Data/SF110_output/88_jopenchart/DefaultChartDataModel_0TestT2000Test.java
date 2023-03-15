// DefaultChartDataModel_0Test.java
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
* It contains ten unit test cases for the {@link DefaultChartDataModel#getDataSetLength(int)} method.
*/
class DefaultChartDataModel_0Test {

		/**
		* Test case for the {@link DefaultChartDataModel#getDataSetLength(int)} method.
		*/
		@Test
		void testGetDataSetLength_0() {
				// Test values
				int set = 0;
				
				// Constructor arguments
				Number[][] data = new Number[][] {
						new Number[] { new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0), new Double(0.0