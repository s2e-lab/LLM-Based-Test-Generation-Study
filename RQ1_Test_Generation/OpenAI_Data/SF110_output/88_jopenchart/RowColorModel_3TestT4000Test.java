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
	* Expected result: {@link RowColorModel#predefinedColors}[3].
	*/
	@Test
	void testGetColor_3() {
		RowColorModel rowColorModel = new RowColorModel(new ChartDataModel());
		Color result = rowColorModel.getColor(3);
		assertEquals(RowColorModel.predefinedColors[3], result);
	}
	
	/**
	* Test case for {@link RowColorModel#getColor(int)} method.
	* Test data: row = 4.
	* Expected result: {@link RowColorModel#predefinedColors}[4].
	*/
	@Test
	void testGetColor_4() {
		RowColorModel rowColorModel = new RowColorModel(new ChartDataModel());
		Color result = rowColorModel.getColor(4);
		assertEquals(RowColorModel.predefinedColors[4], result);
	}
	
	/**
	* Test case for {@link RowColorModel#getColor(int)} method.
	* Test data: row = 5.
	* Expected result: {@link RowColorModel#predefinedColors}[5].
	*/
	@Test
	void testGetColor_5() {
		RowColorModel rowColorModel = new RowColorModel(new ChartDataModel());
		Color result = rowColorModel.getColor(5);
		assertEquals(RowColorModel.predefinedColors[5], result);
	}
	
	/**
	* Test case for {@link RowColorModel#getColor(int)} method.
	* Test data: row = 6.
	* Expected result: {@link RowColorModel#predefinedColors}[6].
	*/
	@Test
	void testGetColor_6() {
		RowColorModel rowColorModel = new RowColorModel(new ChartDataModel());
		Color result = rowColorModel.getColor(6);
		assertEquals(RowColorModel.predefinedColors[6], result);
	}
	
	/**
	* Test case for {@link RowColorModel#getColor(int)} method.
	* Test data: row = 7.
	* Expected result: {@link RowColorModel#predefinedColors}[7].
	*/
	@Test
	void testGetColor_7() {
		RowColorModel rowColorModel = new RowColorModel(new ChartDataModel());
		Color result = rowColorModel.getColor(7);
		assertEquals(RowColorModel.predefinedColors[7], result);
	}
	
	/**
	* Test case for {@link RowColorModel#getColor(int)} method.
	* Test data: row = 8.
	* Expected result: {@link RowColorModel#predefinedColors}[8].
	*/
	@Test
	void testGetColor_8() {
		RowColorModel rowColorModel = new RowColorModel(new ChartDataModel());
		Color result = rowColorModel.getColor(8);
		assertEquals(RowColorModel.predefinedColors[8], result);
	}
	
	/**
	* Test case for {@link RowColorModel#getColor(int)} method.
	* Test data: row = 9.
	* Expected result: {@link RowColorModel#predefinedColors}[9].
	*/
	@Test
	void testGetColor_9() {
		RowColorModel rowColorModel = new RowColorModel(new ChartDataModel());
		Color result = rowColorModel.getColor(9);
		assertEquals(RowColorModel.predefinedColors[9], result);
	}
	
}

// RowColorModel_5Test.java
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
* It contains ten unit test cases for the {@link RowColorModel#getRow(int)} method.
*/
class RowColorModel_5Test {
		
	/**
	* Test case for {@link RowColorModel#getRow(int)} method.
	* Test data: row = 0.
	* Expected result: "0".
	*/
	@Test
	void testGetRow_0() {
		RowColorModel rowColorModel = new RowColorModel(new ChartDataModel());
		String result = rowColorModel.getRow(0);
		assertEquals("0", result);
	}
	
	/**
	* Test case for {@link RowColorModel#getRow(int)} method.
	* Test data: row = 1.
	* Expected result: "1".
	*/
	@Test
	void testGetRow_1() {
		RowColorModel rowColorModel = new RowColorModel(new ChartDataModel());
		String result = rowColorModel.getRow(1);
		assertEquals("1", result);
	}
	
	/**
	* Test case for {@link RowColorModel#getRow(int)} method.
	* Test data: row = 2.
	* Expected result: "2".
	*/
	@Test
	void testGetRow_2() {
		RowColorModel rowColorModel = new RowColorModel(new ChartDataModel());
		String result = rowColorModel.getRow(2);
		assertEquals("2", result);
	}
	
	/**
	* Test case for {@link RowColorModel#getRow(int)} method.
	* Test data: row = 3.
	* Expected result: "3".
	*/
	@Test
	void testGetRow_3() {
		RowColorModel rowColorModel = new RowColorModel(new ChartDataModel());
		String result = rowColorModel.getRow(3);
		assertEquals("3", result);
	}
	
	/**
	* Test case for {@link RowColorModel#getRow(int)} method.
	* Test data: row = 4.
	* Expected result: "4".
	*/
	@Test
	void testGetRow_4() {
		RowColorModel rowColorModel = new RowColorModel(new ChartDataModel());
		String result = rowColorModel.getRow(4);
		assertEquals("4", result);
	}
	
	/**
	* Test case for {@link RowColorModel#getRow(int)} method.
	* Test data: row = 5.
	* Expected result: "5".
	*/
	@Test
	void testGetRow_5() {
		RowColorModel rowColorModel = new RowColorModel(new ChartDataModel());
		String result = rowColorModel.getRow(5);
		assertEquals("5", result);
	}
	
	/**
	* Test case for {@link RowColorModel#getRow(int)} method.
	* Test data: row = 6.
	* Expected result: "6".
	*/
	@Test
	void testGetRow_6() {
		RowColorModel rowColorModel = new RowColorModel(new ChartDataModel());
		String result = rowColorModel.getRow(6);
		assertEquals("6", result);
	}
	
	/**
	* Test case for {@link RowColorModel#getRow(int)} method.
	* Test data: row = 7.
	* Expected result: "7".
	*/
	@Test
	void testGetRow_7() {
		RowColorModel rowColorModel = new RowColorModel(new ChartDataModel());
		String result = rowColorModel.getRow(7);
		assertEquals("7", result);
