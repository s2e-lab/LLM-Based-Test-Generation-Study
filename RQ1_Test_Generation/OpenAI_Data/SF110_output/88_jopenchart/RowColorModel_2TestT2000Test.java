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
				RowColorModel fixture = new RowColorModel(new ChartDataModel());
				int row = 0;
				Color result = fixture.getColor(row);
				assertEquals(Color.blue, result);
		}
		
		/**
		* Test case for {@link RowColorModel#getColor(int)} method.
		* Test data: row = 1.
		* Expected result: Color.cyan.
		*/
		@Test
		public void testGetColor_1() {
				RowColorModel fixture = new RowColorModel(new ChartDataModel());
				int row = 1;
				Color result = fixture.getColor(row);
				assertEquals(Color.cyan, result);
		}
		
		/**
		* Test case for {@link RowColorModel#getColor(int)} method.
		* Test data: row = 2.
		* Expected result: Color.red.
		*/
		@Test
		public void testGetColor_2() {
				RowColorModel fixture = new RowColorModel(new ChartDataModel());
				int row = 2;
				Color result = fixture.getColor(row);
				assertEquals(Color.red, result);
		}
		
		/**
		* Test case for {@link RowColorModel#getColor(int)} method.
		* Test data: row = 3.
		* Expected result: Color.pink.
		*/
		@Test
		public void testGetColor_3() {
				RowColorModel fixture = new RowColorModel(new ChartDataModel());
				int row = 3;
				Color result = fixture.getColor(row);
				assertEquals(Color.pink, result);
		}
		
		/**
		* Test case for {@link RowColorModel#getColor(int)} method.
		* Test data: row = 4.
		* Expected result: Color.yellow.
		*/
		@Test
		public void testGetColor_4() {
				RowColorModel fixture = new RowColorModel(new ChartDataModel());
				int row = 4;
				Color result = fixture.getColor(row);
				assertEquals(Color.yellow, result);
		}
		
		/**
		* Test case for {@link RowColorModel#getColor(int)} method.
		* Test data: row = 5.
		* Expected result: Color.green.
		*/
		@Test
		public void testGetColor_5() {
				RowColorModel fixture = new RowColorModel(new ChartDataModel());
				int row = 5;
				Color result = fixture.getColor(row);
				assertEquals(Color.green, result);
		}
		
		/**
		* Test case for {@link RowColorModel#getColor(int)} method.
		* Test data: row = 6.
		* Expected result: Color.magenta.
		*/
		@Test
		public void testGetColor_6() {
				RowColorModel fixture = new RowColorModel(new ChartDataModel());
				int row = 6;
				Color result = fixture.getColor(row);
				assertEquals(Color.magenta, result);
		}
		
		/**
		* Test case for {@link RowColorModel#getColor(int)} method.
		* Test data: row = 7.
		* Expected result: Color.orange.
		*/
		@Test
		public void testGetColor_7() {
				RowColorModel fixture = new RowColorModel(new ChartDataModel());
				int row = 7;
				Color result = fixture.getColor(row);
				assertEquals(Color.orange, result);
		}
		
		/**
		* Test case for {@link RowColorModel#getColor(int)} method.
		* Test data: row = 8.
		* Expected result: Color.darkGray.
		*/
		@Test
		public void testGetColor_8() {
				RowColorModel fixture = new RowColorModel(new ChartDataModel());
				int row = 8;
				Color result = fixture.getColor(row);
				assertEquals(Color.darkGray, result);
		}
		
		/**
		* Test case for {@link RowColorModel#getColor(int)} method.
		* Test data: row = 9.
		* Expected result: Color.gray.
		*/
		@Test
		public void testGetColor_9() {
				RowColorModel fixture = new RowColorModel(new ChartDataModel());
				int row = 9;
				Color result = fixture.getColor(row);
				assertEquals(Color.gray, result);
		}
		
		/**
		* Test case for {@link RowColorModel#getColor(int)} method.
		* Test data: row = 10.
		* Expected result: Color.lightGray.
		*/
		@Test
		public void testGetColor_10() {
				RowColorModel fixture = new RowColorModel(new ChartDataModel());
				int row = 10;
				Color result = fixture.getColor(row);
				assertEquals(Color.lightGray, result);
		}
		
		/**
		* Test case for {@link RowColorModel#getColor(int)} method.
		* Test data: row = 11.
		* Expected result: Color.lightGray.
		*/
		@Test
		public void testGetColor_11() {
				RowColorModel fixture = new RowColorModel(new ChartDataModel());
				int row = 11;
				Color result = fixture.getColor(row);
				assertEquals(Color.lightGray, result);
		}
		
		/**
		* Test case for {@link RowColorModel#getColor(int)} method.
		* Test data: row = 12.
		* Expected result: Color.lightGray.
		*/
		@Test
		public void testGetColor_12() {
				RowColorModel fixture = new RowColorModel(new ChartDataModel());
				int row = 12;
				Color result = fixture.getColor(row);
				assertEquals(Color.lightGray, result);
		}
		
		/**
		* Test case for {@link RowColorModel#getColor(int)} method.
		* Test data: row = 13.
		* Expected result: Color.lightGray.
		*/
		@Test
		public void testGetColor_13() {
				RowColorModel fixture = new RowColorModel(new ChartDataModel());
				int row = 13;
				Color result = fixture.getColor(row);
				assertEquals(Color.lightGray, result);
		}
		
		/**
		* Test case for {@link RowColorModel#getColor(int)} method.
		* Test data: row = 14.
		* Expected result: Color.lightGray.
		*/
		@Test
		public void testGetColor_14() {
				RowColorModel fixture =