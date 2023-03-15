// RowColorModel_2Test.java
package de.progra.charting.render;

import java.awt.Color;
import de.progra.charting.model.ChartDataModel;
import java.util.HashMap;
import java.awt.geom.RectangularShape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import de.progra.charting.render.shape.Diamond2D;
import de.progra.charting.render.shape.Triangle2D;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RowColorModel}.
* It contains ten unit test cases for the {@link RowColorModel#getColor(int)} method.
*/
class RowColorModel_2Test {

		/**
		* Test case for {@link RowColorModel#getColor(int)} method.
		* Test data: row = 0.
		* Expected result: Color.blue.
		*/
		@Test
		public void testGetColor_0() {
				ChartDataModel model = new ChartDataModel();
				model.addDataSet("Test");
				RowColorModel rowColorModel = new RowColorModel(model);
				Color result = rowColorModel.getColor(0);
				assertEquals(Color.blue, result);
		}
		
		/**
		* Test case for {@link RowColorModel#getColor(int)} method.
		* Test data: row = 1.
		* Expected result: Color.cyan.
		*/
		@Test
		public void testGetColor_1() {
				ChartDataModel model = new ChartDataModel();
				model.addDataSet("Test");
				model.addDataSet("Test");
				RowColorModel rowColorModel = new RowColorModel(model);
				Color result = rowColorModel.getColor(1);
				assertEquals(Color.cyan, result);
		}
		
		/**
		* Test case for {@link RowColorModel#getColor(int)} method.
		* Test data: row = 2.
		* Expected result: Color.red.
		*/
		@Test
		public void testGetColor_2() {
				ChartDataModel model = new ChartDataModel();
				model.addDataSet("Test");
				model.addDataSet("Test");
				model.addDataSet("Test");
				RowColorModel rowColorModel = new RowColorModel(model);
				Color result = rowColorModel.getColor(2);
				assertEquals(Color.red, result);
		}
		
		/**
		* Test case for {@link RowColorModel#getColor(int)} method.
		* Test data: row = 3.
		* Expected result: Color.pink.
		*/
		@Test
		public void testGetColor_3() {
				ChartDataModel model = new ChartDataModel();
				model.addDataSet("Test");
				model.addDataSet("Test");
				model.addDataSet("Test");
				model.addDataSet("Test");
				RowColorModel rowColorModel = new RowColorModel(model);
				Color result = rowColorModel.getColor(3);
				assertEquals(Color.pink, result);
		}
		
		/**
		* Test case for {@link RowColorModel#getColor(int)} method.
		* Test data: row = 4.
		* Expected result: Color.yellow.
		*/
		@Test
		public void testGetColor_4() {
				ChartDataModel model = new ChartDataModel();
				model.addDataSet("Test");
				model.addDataSet("Test");
				model.addDataSet("Test");
				model.addDataSet("Test");
				model.addDataSet("Test");
				RowColorModel rowColorModel = new RowColorModel(model);
				Color result = rowColorModel.getColor(4);
				assertEquals(Color.yellow, result);
		}
		
		/**
		* Test case for {@link RowColorModel#getColor(int)} method.
		* Test data: row = 5.
		* Expected result: Color.green.
		*/
		@Test
		public void testGetColor_5() {
				ChartDataModel model = new ChartDataModel();
				model.addDataSet("Test");
				model.addDataSet("Test");
				model.addDataSet("Test");
				model.addDataSet("Test");
				model.addDataSet("Test");
				model.addDataSet("Test");
				RowColorModel rowColorModel = new RowColorModel(model);
				Color result = rowColorModel.getColor(5);
				assertEquals(Color.green, result);
		}
		
		/**
		* Test case for {@link RowColorModel#getColor(int)} method.
		* Test data: row = 6.
		* Expected result: Color.magenta.
		*/
		@Test
		public void testGetColor_6() {
				ChartDataModel model = new ChartDataModel();
				model.addDataSet("Test");
				model.addDataSet("Test");
				model.addDataSet("Test");
				model.addDataSet("Test");
				model.addDataSet("Test");
				model.addDataSet("Test");
				model.addDataSet("Test");
				RowColorModel rowColorModel = new RowColorModel(model);
				Color result = rowColorModel.getColor(6);
				assertEquals(Color.magenta, result);
		}
		
		/**
		* Test case for {@link RowColorModel#getColor(int)} method.
		* Test data: row = 7.
		* Expected result: Color.orange.
		*/
		@Test
		public void testGetColor_7() {
				ChartDataModel model = new ChartDataModel();
				model.addDataSet("Test");
				model.addDataSet("Test");
				model.addDataSet("Test");
				model.addDataSet("Test");
				model.addDataSet("Test");
				model.addDataSet("Test");
				model.addDataSet("Test");
				model.addDataSet("Test");
				RowColorModel rowColorModel = new RowColorModel(model);
				Color result = rowColorModel.getColor(7);
				assertEquals(Color.orange, result);
		}
		
		/**
		* Test case for {@link RowColorModel#getColor(int)} method.
		* Test data: row = 8.
		* Expected result: Color.darkGray.
		*/
		@Test
		public void testGetColor_8() {
				ChartDataModel model = new ChartDataModel();
				model.addDataSet("Test");
				model.addDataSet("Test");
				model.addDataSet("Test");
				model.addDataSet("Test");
				model.addDataSet("Test");
				model.addDataSet("Test");
				model.addDataSet("Test");
				model.addDataSet("Test");
				model.addDataSet("Test");
				RowColorModel rowColorModel = new RowColorModel(model);
				Color result = rowColorModel.getColor(8);
				assertEquals(Color.darkGray, result);
		}
		
		/**
		* Test case for {@link RowColorModel#getColor(int)} method.
		* Test data: row = 9.
		* Expected result: Color.gray.
		*/
		@Test
		public void testGetColor_9() {
				ChartDataModel model = new ChartDataModel();
				model.addDataSet("Test");
				model.addDataSet("Test");
				model.addDataSet("Test");
				model.addDataSet("Test");
				model.addDataSet("Test");
				model.addDataSet("Test");
				model.addDataSet("Test");
				model.addDataSet("Test");
				model.addDataSet("Test");
				model.addDataSet("Test");
				RowColorModel rowColorModel = new RowColorModel(model);
				Color result = rowColorModel.getColor(9);
				assertEquals(Color.gray, result);
		}
		
		/**
		* Test case for {@link RowColorModel#getColor(int)} method.
		* Test data: row = 10.
		* Expected result: Color.lightGray.
		*/
		@Test
		public void testGetColor_10() {
				ChartDataModel model = new ChartDataModel();
				model.addDataSet("Test");
				model.addDataSet("Test");
				model.addDataSet("Test");
				model.addDataSet("Test");
				model.addDataSet("Test");
				model.addDataSet("Test");
				model.addDataSet("Test");
				model.addDataSet("Test");
				model.addDataSet("Test");
				model.addDataSet("Test");
				model.addDataSet("Test");
				RowColorModel rowColorModel = new RowColorModel(model);
				Color result = rowColorModel.getColor(10);
				assertEquals(Color.lightGray, result);
		}
		
}

// RowColorModel_3Test.java
package de.progra.charting.render;

import java.awt.Color;
import de.progra.charting.model.ChartDataModel;
import java.util.HashMap;
import java.awt.geom.RectangularShape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import de.progra.charting.render.shape.Diamond2D;
import de.progra.charting.render.shape.Triangle2D;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RowColorModel}.
* It contains ten unit test cases for the {@link RowColorModel#getShape(int)} method.
*/
class RowColorModel_3Test {
		
		/**
		* Test case for {@link RowColorModel#getShape(int)} method.
		* Test data: row = 0.
		* Expected result: Ellipse2D.Float.
		*/
		@Test
		public void testGetShape_0() {
				ChartDataModel model = new ChartDataModel();
				model.addDataSet("Test");
				RowColorModel rowColorModel = new RowColorModel(model);
				RectangularShape result = rowColorModel.getShape(0);
				assertEquals(Ellipse2D.Float.class, result.getClass());
		}
		
		/**
		* Test case for {@link RowColorModel#getShape(int)} method.
		* Test data: row = 1.
		* Expected result: Rectangle2D.Float.
		*/
		@Test
		public void testGetShape_1() {
				ChartDataModel model = new ChartDataModel();
				model.addDataSet("Test");
				model.addDataSet("Test");
				RowColorModel rowColorModel = new RowColorModel(model);
				RectangularShape result = rowColorModel.getShape(1);
				assertEquals(Rectangle2D.Float.class, result.getClass());
		}
		
		/**
		* Test case for {@link RowColorModel#getShape(int)} method.
		* Test data: row = 2.
		* Expected result: Diamond2D.
		*/
		@Test
		public void testGetShape_2() {
				ChartDataModel model = new ChartDataModel();
				model.addDataSet("Test");
				model.addDataSet("Test");
				model.addDataSet("Test");
				RowColorModel rowColorModel = new RowColorModel(model);
				RectangularShape result = rowColorModel.getShape(2);
				assertEquals(Diamond2D.class, result.getClass());
		}
		
		/**
		* Test case for {@link RowColorModel#getShape(int)} method.
		* Test data: row = 3.
		* Expected result: Triangle2D.
		*/
		@Test
		public void testGetShape_3() {
				ChartDataModel model = new ChartDataModel();
				model.addDataSet("Test");
				model.addDataSet("Test");
				model.addDataSet("Test");
				model.addDataSet("Test");
				RowColorModel rowColorModel = new RowColorModel(model);
				RectangularShape result = rowColorModel.getShape(3);
				assertEquals(Triangle2D.class, result.getClass());
		}
		
		/**
		* Test case for {@link RowColorModel#getShape(int)} method.
		* Test data: row = 4.
		* Expected result: Triangle2D.
		*/
		@Test
		public void testGetShape_4() {
				ChartDataModel model = new ChartDataModel();
				model.addDataSet("Test");
				model.addDataSet("Test");
				model.addDataSet("Test");
				model.addDataSet("Test");
				model.addDataSet("Test");
				RowColorModel rowColorModel = new RowColorModel(model);
				RectangularShape result = rowColorModel.getShape(4);
				assertEquals(Triangle2D.class, result.getClass());
		}
		
		/**
		* Test case for {@link RowColorModel#getShape(int)} method.
		* Test data: row = 5.
		* Expected result: Diamond2D.
		*/
		@Test
		public void testGetShape_5() {
				ChartDataModel model = new ChartDataModel();
				model.addDataSet("Test");
				model.addDataSet("Test");
				model.addDataSet("Test");
				model.addDataSet("Test");
				model.addDataSet("Test");
				model.addDataSet("Test");
				RowColorModel rowColorModel = new RowColorModel(model);
				RectangularShape result = rowColorModel.getShape(5);
				assertEquals(Diamond2D.class, result.getClass());
		}
		
		/**
		* Test case for {@link RowColorModel#getShape(int)} method.
		* Test data: row = 6.
		* Expected result: Rectangle2D.Float.
		*/
		@Test
		public void testGetShape_6() {
				ChartDataModel model = new ChartDataModel();
				model.addDataSet("Test");
				model.addDataSet("Test");
				model.addDataSet("Test");
				model.addDataSet("Test");
				model.addDataSet("Test");
				model.add