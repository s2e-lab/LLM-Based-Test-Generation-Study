// CoordSystemUtilities_5Test.java
package de.progra.charting;

import java.awt.font.FontRenderContext;
import java.text.DecimalFormat;
import java.awt.geom.AffineTransform;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.font.TextLayout;
import de.progra.charting.model.ChartDataModelConstraints;
import de.progra.charting.model.ChartDataModel;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CoordSystemUtilities}.
* It contains ten unit test cases for the {@link CoordSystemUtilities#computeYAxisLabelWidth()} method.
*/
class CoordSystemUtilities_5Test {

		/**
		* Test case 1 for {@link CoordSystemUtilities#computeYAxisLabelWidth()}.
		*/
		@Test
		void testComputeYAxisLabelWidth_1() {
				CoordSystemUtilities csu = new CoordSystemUtilities(new CoordSystem(new Rectangle2D.Double(0, 0, 100, 100)), new ChartDataModelConstraints(new ChartDataModel(new double[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 } }, new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K" })), new ChartDataModelConstraints(new ChartDataModel(new double[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 } }, new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K" })), new ChartDataModel(new double[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 } }, new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K" }));
				csu.c.setFont(new Font("Arial", Font.PLAIN, 10));
				csu.c.setFontRenderContext(new FontRenderContext(new AffineTransform(), true, true));
				csu.c.setYDecimalFormat(new DecimalFormat("0.00"));
				csu.constraints.setMinimumValue(new Double(-10));
				csu.constraints.setMaximumValue(new Double(10));
				csu.constraints.setMinimumColumnValue(0);
				csu.constraints.setMaximumColumnValue(10);
				assertEquals(csu.computeYAxisLabelWidth(), 6);
		}
		
		/**
		* Test case 2 for {@link CoordSystemUtilities#computeYAxisLabelWidth()}.
		*/
		@Test
		void testComputeYAxisLabelWidth_2() {
				CoordSystemUtilities csu = new CoordSystemUtilities(new CoordSystem(new Rectangle2D.Double(0, 0, 100, 100)), new ChartDataModelConstraints(new ChartDataModel(new double[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 } }, new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K" })), new ChartDataModelConstraints(new ChartDataModel(new double[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 } }, new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K" })), new ChartDataModel(new double[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 } }, new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K" }));
				csu.c.setFont(new Font("Arial", Font.PLAIN, 10));
				csu.c.setFontRenderContext(new FontRenderContext(new AffineTransform(), true, true));
				csu.c.setYDecimalFormat(new DecimalFormat("0.00"));
				csu.constraints.setMinimumValue(new Double(-10));
				csu.constraints.setMaximumValue(new Double(10));
				csu.constraints.setMinimumColumnValue(0);
				csu.constraints.setMaximumColumnValue(10);
				assertEquals(csu.computeYAxisLabelWidth(), 6);
		}
		
		/**
		* Test case 3 for {@link CoordSystemUtilities#computeYAxisLabelWidth()}.
		*/
		@Test
		void testComputeYAxisLabelWidth_3() {
				CoordSystemUtilities csu = new CoordSystemUtilities(new CoordSystem(new Rectangle2D.Double(0, 0, 100, 100)), new ChartDataModelConstraints(new ChartDataModel(new double[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 } }, new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K" })), new ChartDataModelConstraints(new ChartDataModel(new double[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 } }, new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K" })), new ChartDataModel(new double[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 } }, new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K" }));
				csu.c.setFont(new Font("Arial", Font.PLAIN, 10));
				csu.c.setFontRenderContext(new FontRenderContext(new AffineTransform(), true, true));
				csu.c.setYDecimalFormat(new DecimalFormat("0.00"));
				csu.constraints.setMinimumValue(new Double(-10));
				csu.constraints.setMaximumValue(new Double(10));
				csu.constraints.setMinimumColumnValue(0);
				csu.constraints.setMaximumColumnValue(10);
				assertEquals(csu.computeYAxisLabelWidth(), 6);
		}
		
		/**
		* Test case 4 for {@link CoordSystemUtilities#computeYAxisLabelWidth()}.
		*/
		@Test
		void testComputeYAxisLabelWidth_4() {
				CoordSystemUtilities csu = new CoordSystemUtilities(new CoordSystem(new Rectangle2D.Double(0, 0, 100, 100)), new ChartDataModelConstraints(new ChartDataModel(new double[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 } }, new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K" })), new ChartDataModelConstraints(new ChartDataModel(new double[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 } }, new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K" })), new ChartDataModel(new double[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 } }, new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K" }));
				csu.c.setFont(new Font("Arial", Font.PLAIN, 10));
				csu.c.setFontRenderContext(new FontRenderContext(new AffineTransform(), true, true));
				csu.c.setYDecimalFormat(new DecimalFormat("0.00"));
				csu.constraints.setMinimumValue(new Double(-10));
			