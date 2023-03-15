// CoordSystemUtilities_3Test.java
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
* It contains ten unit test cases for the {@link CoordSystemUtilities#computeBottomMargin()} method.
*/
class CoordSystemUtilities_3Test {

		/**
		* Test case 1 for {@link CoordSystemUtilities#computeBottomMargin()}.
		*/
		@Test
		void testComputeBottomMargin1() {
				CoordSystem c = new CoordSystem(new Rectangle2D.Double(0, 0, 100, 100));
				ChartDataModelConstraints constraints = new ChartDataModelConstraints(0, 0, 0, 0);
				ChartDataModelConstraints constraints2 = new ChartDataModelConstraints(0, 0, 0, 0);
				ChartDataModel model = new ChartDataModel();
				CoordSystemUtilities csu = new CoordSystemUtilities(c, constraints, constraints2, model);
				assertEquals(csu.computeBottomMargin(), c.MINIMALMARGIN);
		}
		
		/**
		* Test case 2 for {@link CoordSystemUtilities#computeBottomMargin()}.
		*/
		@Test
		void testComputeBottomMargin2() {
				CoordSystem c = new CoordSystem(new Rectangle2D.Double(0, 0, 100, 100));
				ChartDataModelConstraints constraints = new ChartDataModelConstraints(0, 0, 0, 0);
				ChartDataModelConstraints constraints2 = new ChartDataModelConstraints(0, 0, 0, 0);
				ChartDataModel model = new ChartDataModel();
				CoordSystemUtilities csu = new CoordSystemUtilities(c, constraints, constraints2, model);
				c.setFont(new Font("Arial", Font.PLAIN, 10));
				c.setFontRenderContext(new FontRenderContext(new AffineTransform(), true, true));
				c.setXAxisUnit("X");
				assertEquals(csu.computeBottomMargin(), c.MINIMALMARGIN);
		}
		
		/**
		* Test case 3 for {@link CoordSystemUtilities#computeBottomMargin()}.
		*/
		@Test
		void testComputeBottomMargin3() {
				CoordSystem c = new CoordSystem(new Rectangle2D.Double(0, 0, 100, 100));
				ChartDataModelConstraints constraints = new ChartDataModelConstraints(0, 0, 0, 0);
				ChartDataModelConstraints constraints2 = new ChartDataModelConstraints(0, 0, 0, 0);
				ChartDataModel model = new ChartDataModel();
				CoordSystemUtilities csu = new CoordSystemUtilities(c, constraints, constraints2, model);
				c.setFont(new Font("Arial", Font.PLAIN, 10));
				c.setFontRenderContext(new FontRenderContext(new AffineTransform(), true, true));
				c.setXAxisUnit("X");
				c.setPaintLabels(true);
				assertEquals(csu.computeBottomMargin(), c.MINIMALMARGIN);
		}
		
		/**
		* Test case 4 for {@link CoordSystemUtilities#computeBottomMargin()}.
		*/
		@Test
		void testComputeBottomMargin4() {
				CoordSystem c = new CoordSystem(new Rectangle2D.Double(0, 0, 100, 100));
				ChartDataModelConstraints constraints = new ChartDataModelConstraints(0, 0, 0, 0);
				ChartDataModelConstraints constraints2 = new ChartDataModelConstraints(0, 0, 0, 0);
				ChartDataModel model = new ChartDataModel();
				CoordSystemUtilities csu = new CoordSystemUtilities(c, constraints, constraints2, model);
				c.setFont(new Font("Arial", Font.PLAIN, 10));
				c.setFontRenderContext(new FontRenderContext(new AffineTransform(), true, true));
				c.setXAxisUnit("X");
				c.setPaintLabels(true);
				c.setPaintOnlyTick(true);
				assertEquals(csu.computeBottomMargin(), c.MINIMALMARGIN);
		}
		
		/**
		* Test case 5 for {@link CoordSystemUtilities#computeBottomMargin()}.
		*/
		@Test
		void testComputeBottomMargin5() {
				CoordSystem c = new CoordSystem(new Rectangle2D.Double(0, 0, 100, 100));
				ChartDataModelConstraints constraints = new ChartDataModelConstraints(0, 0, 0, 0);
				ChartDataModelConstraints constraints2 = new ChartDataModelConstraints(0, 0, 0, 0);
				ChartDataModel model = new ChartDataModel();
				CoordSystemUtilities csu = new CoordSystemUtilities(c, constraints, constraints2, model);
				c.setFont(new Font("Arial", Font.PLAIN, 10));
				c.setFontRenderContext(new FontRenderContext(new AffineTransform(), true, true));
				c.setXAxisUnit("X");
				c.setPaintLabels(true);
				c.setPaintOnlyTick(true);
				c.setPaintAltTick(true);
				assertEquals(csu.computeBottomMargin(), c.MINIMALMARGIN);
		}
		
		/**
		* Test case 6 for {@link CoordSystemUtilities#computeBottomMargin()}.
		*/
		@Test
		void testComputeBottomMargin6() {
				CoordSystem c = new CoordSystem(new Rectangle2D.Double(0, 0, 100, 100));
				ChartDataModelConstraints constraints = new ChartDataModelConstraints(0, 0, 0, 0);
				ChartDataModelConstraints constraints2 = new ChartDataModelConstraints(0, 0, 0, 0);
				ChartDataModel model = new ChartDataModel();
				CoordSystemUtilities csu = new CoordSystemUtilities(c, constraints, constraints2, model);
				c.setFont(new Font("Arial", Font.PLAIN, 10));
				c.setFontRenderContext(new FontRenderContext(new AffineTransform(), true, true));
				c.setXAxisUnit("X");
				c.setPaintLabels(true);
				c.setPaintOnlyTick(true);
				c.setPaintAltTick(true);
				c.setXDecimalFormat(new DecimalFormat("0.00"));
				assertEquals(csu.computeBottomMargin(), c.MINIMALMARGIN);
		}
		
		/**
		* Test case 7 for {@link CoordSystemUtilities#computeBottomMargin()}.
		*/
		@Test
		void testComputeBottomMargin7() {
				CoordSystem c = new CoordSystem(new Rectangle2D.Double(0, 0, 100, 100));
				ChartDataModelConstraints constraints = new ChartDataModelConstraints(0, 0, 0, 0);
				ChartDataModelConstraints constraints2 = new ChartDataModelConstraints(0, 0, 0, 0);
				ChartDataModel model = new ChartDataModel();
				CoordSystemUtilities csu = new CoordSystemUtilities(c, constraints, constraints2, model);
				c.setFont(new Font("Arial", Font.PLAIN, 10));
				c.setFontRenderContext(new FontRenderContext(new AffineTransform(), true