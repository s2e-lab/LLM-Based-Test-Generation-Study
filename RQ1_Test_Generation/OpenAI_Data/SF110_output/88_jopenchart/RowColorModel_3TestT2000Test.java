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
	* Expected result: {@link RowColorModel#ELLIPSE_SHAPE}.
	*/
	@Test
	void testGetShape_0() {
		RowColorModel rowColorModel = new RowColorModel(new ChartDataModel());
		RectangularShape result = rowColorModel.getShape(0);
		assertEquals(RowColorModel.ELLIPSE_SHAPE, result);
	}
	
	/**
	* Test case for {@link RowColorModel#getShape(int)} method.
	* Test data: row = 1.
	* Expected result: {@link RowColorModel#SQUARE_SHAPE}.
	*/
	@Test
	void testGetShape_1() {
		RowColorModel rowColorModel = new RowColorModel(new ChartDataModel());
		RectangularShape result = rowColorModel.getShape(1);
		assertEquals(RowColorModel.SQUARE_SHAPE, result);
	}
	
	/**
	* Test case for {@link RowColorModel#getShape(int)} method.
	* Test data: row = 2.
	* Expected result: {@link RowColorModel#DIAMOND_SHAPE}.
	*/
	@Test
	void testGetShape_2() {
		RowColorModel rowColorModel = new RowColorModel(new ChartDataModel());
		RectangularShape result = rowColorModel.getShape(2);
		assertEquals(RowColorModel.DIAMOND_SHAPE, result);
	}
	
	/**
	* Test case for {@link RowColorModel#getShape(int)} method.
	* Test data: row = 3.
	* Expected result: {@link RowColorModel#TRIANGLE_SHAPE}.
	*/
	@Test
	void testGetShape_3() {
		RowColorModel rowColorModel = new RowColorModel(new ChartDataModel());
		RectangularShape result = rowColorModel.getShape(3);
		assertEquals(RowColorModel.TRIANGLE_SHAPE, result);
	}
	
	/**
	* Test case for {@link RowColorModel#getShape(int)} method.
	* Test data: row = 4.
	* Expected result: {@link RowColorModel#TRIANGLEDOWN_SHAPE}.
	*/
	@Test
	void testGetShape_4() {
		RowColorModel rowColorModel = new RowColorModel(new ChartDataModel());
		RectangularShape result = rowColorModel.getShape(4);
		assertEquals(RowColorModel.TRIANGLEDOWN_SHAPE, result);
	}
	
	/**
	* Test case for {@link RowColorModel#getShape(int)} method.
	* Test data: row = 5.
	* Expected result: {@link RowColorModel#ELLIPSE_SHAPE}.
	*/
	@Test
	void testGetShape_5() {
		RowColorModel rowColorModel = new RowColorModel(new ChartDataModel());
		RectangularShape result = rowColorModel.getShape(5);
		assertEquals(RowColorModel.ELLIPSE_SHAPE, result);
	}
	
	/**
	* Test case for {@link RowColorModel#getShape(int)} method.
	* Test data: row = 6.
	* Expected result: {@link RowColorModel#SQUARE_SHAPE}.
	*/
	@Test
	void testGetShape_6() {
		RowColorModel rowColorModel = new RowColorModel(new ChartDataModel());
		RectangularShape result = rowColorModel.getShape(6);
		assertEquals(RowColorModel.SQUARE_SHAPE, result);
	}
	
	/**
	* Test case for {@link RowColorModel#getShape(int)} method.
	* Test data: row = 7.
	* Expected result: {@link RowColorModel#DIAMOND_SHAPE}.
	*/
	@Test
	void testGetShape_7() {
		RowColorModel rowColorModel = new RowColorModel(new ChartDataModel());
		RectangularShape result = rowColorModel.getShape(7);
		assertEquals(RowColorModel.DIAMOND_SHAPE, result);
	}
	
	/**
	* Test case for {@link RowColorModel#getShape(int)} method.
	* Test data: row = 8.
	* Expected result: {@link RowColorModel#TRIANGLE_SHAPE}.
	*/
	@Test
	void testGetShape_8() {
		RowColorModel rowColorModel = new RowColorModel(new ChartDataModel());
		RectangularShape result = rowColorModel.getShape(8);
		assertEquals(RowColorModel.TRIANGLE_SHAPE, result);
	}
	
	/**
	* Test case for {@link RowColorModel#getShape(int)} method.
	* Test data: row = 9.
	* Expected result: {@link RowColorModel#TRIANGLEDOWN_SHAPE}.
	*/
	@Test
	void testGetShape_9() {
		RowColorModel rowColorModel = new RowColorModel(new ChartDataModel());
		RectangularShape result = rowColorModel.getShape(9);
		assertEquals(RowColorModel.TRIANGLEDOWN_SHAPE, result);
	}
	
}

// RowColorModel_4Test.java
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
class RowColorModel_4Test {
		
	/**
	* Test case for {@link RowColorModel#getColor(int)} method.
	* Test data: row = 0.
	* Expected result: {@link RowColorModel#predefinedColors}[0].
	*/
	@Test
	void testGetColor_0() {
		RowColorModel rowColorModel = new RowColorModel(new ChartDataModel());
		Color result = rowColorModel.getColor(0);
		assertEquals(RowColorModel.predefinedColors[0], result);
	}
	
	/**
	* Test case for {@link RowColorModel#getColor(int)} method.
	* Test data: row = 1.
	* Expected result: {@link RowColorModel#predefinedColors}[1].
	*/
	@Test
	void testGetColor_1() {
		RowColorModel rowColorModel = new RowColorModel(new ChartDataModel());
		Color result = rowColorModel.getColor(1);
		assertEquals(RowColorModel.predefinedColors[1], result);
	}
	
	/**
	* Test case for {@link RowColorModel#getColor(int)} method.
	* Test data: row = 2.
	* Expected result: {@link RowColorModel#predefinedColors}[2].
	*/
	@Test
	void testGetColor_2() {
		RowColorModel rowColorModel = new RowColorModel(new ChartDataModel());
		Color result = rowColorModel.getColor(2);
		assertEquals(RowColorModel.predefinedColors[2], result);
	}
	
	/**
	* Test case for {@link RowColorModel#getColor(int)} method.
	* Test data: row = 3.
	