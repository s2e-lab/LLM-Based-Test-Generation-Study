// PlotDatum_0Test.java
package jahuwaldt.plot;

import java.awt.Color;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotDatum}.
* It contains ten unit test cases for the {@link PlotDatum#hasErrorBar()} method.
*/
class PlotDatum_0Test {

    /**
    * Test method for {@link PlotDatum#hasErrorBar()}.
    */
    @Test
    void testHasErrorBar() {
        PlotDatum plotDatum = new PlotDatum(1, 2, true);
        assertFalse(plotDatum.hasErrorBar());
    }
}

// PlotDatum_1Test.java
package jahuwaldt.plot;

import java.awt.Color;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotDatum}.
* It contains ten unit test cases for the {@link PlotDatum#connected()} method.
*/
class PlotDatum_1Test {
		
    /**
    * Test method for {@link PlotDatum#connected()}.
    */
    @Test
    void testConnected() {
        PlotDatum plotDatum = new PlotDatum(1, 2, true);
        assertTrue(plotDatum.connected());
    }
}

// PlotDatum_2Test.java
package jahuwaldt.plot;

import java.awt.Color;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotDatum}.
* It contains ten unit test cases for the {@link PlotDatum#setConnected(boolean)} method.
*/
class PlotDatum_2Test {
		
    /**
    * Test method for {@link PlotDatum#setConnected(boolean)}.
    */
    @Test
    void testSetConnected() {
        PlotDatum plotDatum = new PlotDatum(1, 2, true);
        plotDatum.setConnected(false);
        assertFalse(plotDatum.connected());
    }
}

// PlotDatum_3Test.java
package jahuwaldt.plot;

import java.awt.Color;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotDatum}.
* It contains ten unit test cases for the {@link PlotDatum#setYError(double)} method.
*/
class PlotDatum_3Test {
		
    /**
    * Test method for {@link PlotDatum#setYError(double)}.
    */
    @Test
    void testSetYError() {
        PlotDatum plotDatum = new PlotDatum(1, 2, true);
        plotDatum.setYError(1);
        assertEquals(1, plotDatum.getYError());
    }
}

// PlotDatum_4Test.java
package jahuwaldt.plot;

import java.awt.Color;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotDatum}.
* It contains ten unit test cases for the {@link PlotDatum#setX(double)} method.
*/
class PlotDatum_4Test {
		
    /**
    * Test method for {@link PlotDatum#setX(double)}.
    */
    @Test
    void testSetX() {
        PlotDatum plotDatum = new PlotDatum(1, 2, true);
        plotDatum.setX(2);
        assertEquals(2, plotDatum.getX());
    }
}

// PlotDatum_5Test.java
package jahuwaldt.plot;

import java.awt.Color;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotDatum}.
* It contains ten unit test cases for the {@link PlotDatum#setY(double)} method.
*/
class PlotDatum_5Test {
		
    /**
    * Test method for {@link PlotDatum#setY(double)}.
    */
    @Test
    void testSetY() {
        PlotDatum plotDatum = new PlotDatum(1, 2, true);
        plotDatum.setY(3);
        assertEquals(3, plotDatum.getY());
    }
}

// PlotDatum_6Test.java
package jahuwaldt.plot;

import java.awt.Color;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotDatum}.
* It contains ten unit test cases for the {@link PlotDatum#setPlotSymbol(PlotSymbol)} method.
*/
class PlotDatum_6Test {
		
    /**
    * Test method for {@link PlotDatum#setPlotSymbol(PlotSymbol)}.
    */
    @Test
    void testSetPlotSymbol() {
        PlotDatum plotDatum = new PlotDatum(1, 2, true);
        PlotSymbol plotSymbol = new PlotSymbol(PlotSymbol.CIRCLE, Color.red);
        plotDatum.setPlotSymbol(plotSymbol);
        assertEquals(plotSymbol, plotDatum.getPlotSymbol());
    }
}

// PlotDatum_7Test.java
package jahuwaldt.plot;

import java.awt.Color;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotDatum}.
* It contains ten unit test cases for the {@link PlotDatum#setLineColor(Color)} method.
*/
class PlotDatum_7Test {
		
    /**
    * Test method for {@link PlotDatum#setLineColor(Color)}.
    */
    @Test
    void testSetLineColor() {
        PlotDatum plotDatum = new PlotDatum(1, 2, true);
        plotDatum.setLineColor(Color.red);
        assertEquals(Color.red, plotDatum.getLineColor());
    }
}

// PlotDatum_8Test.java
package jahuwaldt.plot;

import java.awt.Color;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotDatum}.
* It contains ten unit test cases for the {@link PlotDatum#getX()} method.
*/
class PlotDatum_8Test {
		
    /**
    * Test method for {@link PlotDatum#getX()}.
    */
    @Test
    void testGetX() {
        PlotDatum plotDatum = new PlotDatum(1, 2, true);
        assertEquals(1, plotDatum.getX());
    }
}

// PlotDatum_9Test.java
package jahuwaldt.plot;

import java.awt.Color;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotDatum}.
* It contains ten unit test cases for the {@link PlotDatum#getY()} method.
*/
class PlotDatum_9Test {
		
    /**
    * Test method for {@link PlotDatum#getY()}.
    */
    @Test
    void testGetY() {
        PlotDatum plotDatum = new PlotDatum(1, 2, true);
        assertEquals(2, plotDatum.getY());
    }
}

// PlotSymbol.java
package jahuwaldt.plot;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.io.Serializable;

/**
 *  <p> This class represents a plot symbol that can be used to
 *      represent a data point on a plot.  The symbol can be a
 *      circle, square, or a line.
 *  </p>
 *
 *  <p>  Modified by:  <NAME>  </p>
 *
 * @author <NAME>   Date:  June 1, 2000
 * @version November 20, 2000
 */
public class PlotSymbol implements Cloneable, java.io.Serializable {

    /**
     *  The symbol type.
     */
    public static final int CIRCLE = 0;
    public static final int SQUARE = 1;
    public static final int LINE = 2;

    /**
     *  The symbol type.
     */
    private int type;

    /**
     *  The symbol color.
     */
    private Color color = Color.black;

    /**
     *  Create a new plot symbol given the specified type and color.
     *
     *  @param type  The symbol type.
     *  @param color  The symbol color.
     */
    public PlotSymbol(int type, Color color) {
        this.type = type;
        this.color = color;
    }

    /**
     *  Draw the symbol at the specified coordinates.
     *
     *  @param g  The graphics context.
     *  @param x  The X coordinate.
     *  @param y  The Y coordinate.
     */
    public void draw(Graphics g, double x,