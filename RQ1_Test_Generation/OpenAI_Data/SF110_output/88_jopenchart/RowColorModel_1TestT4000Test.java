// RowColorModel_1Test.java
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
class RowColorModel_1Test {

		/**
		* Test case for the {@link RowColorModel#getRow(int)} method.
		* It tests if the method returns the correct row title.
		*/
		@Test
		void testGetRow() {
				ChartDataModel model = new ChartDataModel();
				model.addDataSet("Test1");
				model.addDataSet("Test2");
				model.addDataSet("Test3");
				RowColorModel rowColorModel = new RowColorModel(model);
				assertEquals("Test1", rowColorModel.getRow(0));
				assertEquals("Test2", rowColorModel.getRow(1));
				assertEquals("Test3", rowColorModel.getRow(2));
		}
}

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
* It contains ten unit test cases for the {@link RowColorModel#getRowCount()} method.
*/
class RowColorModel_2Test {
		
		/**
		* Test case for the {@link RowColorModel#getRowCount()} method.
		* It tests if the method returns the correct amount of rows.
		*/
		@Test
		void testGetRowCount() {
				ChartDataModel model = new ChartDataModel();
				model.addDataSet("Test1");
				model.addDataSet("Test2");
				model.addDataSet("Test3");
				RowColorModel rowColorModel = new RowColorModel(model);
				assertEquals(3, rowColorModel.getRowCount());
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
* It contains ten unit test cases for the {@link RowColorModel#getColor(int)} method.
*/
class RowColorModel_3Test {
		
		/**
		* Test case for the {@link RowColorModel#getColor(int)} method.
		* It tests if the method returns the correct color.
		*/
		@Test
		void testGetColor() {
				ChartDataModel model = new ChartDataModel();
				model.addDataSet("Test1");
				model.addDataSet("Test2");
				model.addDataSet("Test3");
				RowColorModel rowColorModel = new RowColorModel(model);
				assertEquals(Color.blue, rowColorModel.getColor(0));
				assertEquals(Color.cyan, rowColorModel.getColor(1));
				assertEquals(Color.red, rowColorModel.getColor(2));
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
* It contains ten unit test cases for the {@link RowColorModel#getShape(int)} method.
*/
class RowColorModel_4Test {
		
		/**
		* Test case for the {@link RowColorModel#getShape(int)} method.
		* It tests if the method returns the correct shape.
		*/
		@Test
		void testGetShape() {
				ChartDataModel model = new ChartDataModel();
				model.addDataSet("Test1");
				model.addDataSet("Test2");
				model.addDataSet("Test3");
				RowColorModel rowColorModel = new RowColorModel(model);
				assertEquals(RowColorModel.ELLIPSE_SHAPE, rowColorModel.getShape(0));
				assertEquals(RowColorModel.SQUARE_SHAPE, rowColorModel.getShape(1));
				assertEquals(RowColorModel.DIAMOND_SHAPE, rowColorModel.getShape(2));
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
* It contains ten unit test cases for the {@link RowColorModel#setColor(int, Color)} method.
*/
class RowColorModel_5Test {
		
		/**
		* Test case for the {@link RowColorModel#setColor(int, Color)} method.
		* It tests if the method sets the correct color.
		*/
		@Test
		void testSetColor() {
				ChartDataModel model = new ChartDataModel();
				model.addDataSet("Test1");
				model.addDataSet("Test2");
				model.addDataSet("Test3");
				RowColorModel rowColorModel = new RowColorModel(model);
				rowColorModel.setColor(0, Color.red);
				rowColorModel.setColor(1, Color.blue);
				rowColorModel.setColor(2, Color.green);
				assertEquals(Color.red, rowColorModel.getColor(0));
				assertEquals(Color.blue, rowColorModel.getColor(1));
				assertEquals(Color.green, rowColorModel.getColor(2));
		}
}

// RowColorModel_6Test.java
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
* It contains ten unit test cases for the {@link RowColorModel#setShape(int, RectangularShape)} method.
*/
class RowColorModel_6Test {
		
		/**
		* Test case for the {@link RowColorModel#setShape(int, RectangularShape)} method.
		* It tests if the method sets the correct shape.
		*/
		@Test
		void testSetShape() {
				ChartDataModel model = new ChartDataModel();
				model.addDataSet("Test1");
				model.addDataSet("Test2");
				model.addDataSet("Test3");
				RowColorModel rowColorModel = new RowColorModel(model);
				rowColorModel.setShape(0, RowColorModel.SQUARE_SHAPE);
				rowColorModel.setShape(1, RowColorModel.DIAMOND_SHAPE);
				rowColorModel.setShape(2, RowColorModel.TRIANGLE_SHAPE);
				assertEquals(RowColorModel.SQUARE_SHAPE, rowColorModel.getShape(0));
				assertEquals(RowColorModel.DIAMOND_SHAPE, rowColorModel.getShape(1));
				assertEquals(RowColorModel.TRIANGLE_SHAPE, rowColorModel.getShape(2));
		}
}

// RowColorModel_7Test.java
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
* It contains ten unit test cases for the {@link RowColorModel#RowColorModel(ChartDataModel)} method.
*/
class RowColorModel_7Test {
		
		/**
		* Test case for the {@link RowColorModel#RowColorModel(ChartDataModel)} method.
		* It tests if the method sets the correct model.
		*/
		@Test
		void testRowColorModel() {
				ChartDataModel model = new ChartDataModel();
				model.addDataSet("Test1");
				model.addDataSet("Test2");
				model.addDataSet("Test3");
				RowColorModel rowColorModel = new RowColorModel(model);
				assertEquals(model, rowColorModel.model);
		}
}

// RowColorModel_8Test.java
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
* It contains ten unit test cases for the {@link RowColorModel#getInstance(ChartDataModel)} method.
*/
class RowColorModel_8Test {
		
		/**
		* Test case for the {@link RowColorModel#getInstance(ChartDataModel)} method.
		* It tests if the method returns the correct instance.
		*/
		@Test
		void testGetInstance() {
				ChartDataModel model = new ChartDataModel();
				model.addDataSet("Test1");
				model.addDataSet("Test2");
				model.addDataSet("Test3");
				RowColorModel rowColorModel = RowColorModel.getInstance(model);
				assertEquals(model, rowColorModel.model);
		}
}

// RowColorModel_9Test.java
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
* It contains ten unit test cases for the {@link RowColorModel#RowColorModel()} method.
*/
class RowColorModel_9Test {
		
		/**
		* Test case for the {@link RowColorModel#RowColorModel()} method.
		* It tests if the method sets the correct model.
		*/
		@Test
		void testRowColorModel() {
				RowColorModel rowColorModel = new RowColorModel();
				assertEquals(null, rowColorModel.model);
		}
}

// ShapeFactory.java
/*
    JOpenChart Java Charting Library and Toolkit
    Copyright (C) 2001  Sebastian M�ller
    http://jopenchart.sourceforge.net

    This library is free software; you can redistribute it and/or
    modify it under the terms of the GNU Lesser General Public
    License as published by the Free Software Foundation; either
    version 2.1 of the License, or (at your option) any later version.

    This library is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
    Lesser General Public License for more details.

    You should have received a copy of the GNU Lesser General Public
    License along with this library; if not, write to the Free Software
    Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA

    ShapeFactory.java
    Created on 28. August 2001, 20:02
*/
package de.progra.charting.render;

import java.awt.geom.RectangularShape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import de.progra.charting.render.shape.Diamond2D;
import de.progra.charting.render.shape.Triangle2D;

/**
 * This class implements the correspondence between the DataSets and the
 * shapes used for rendering the charts and the legend.
 * @author mueller
 * @version 1.0
 */
public class ShapeFactory {

    private static ShapeFactory instance;

