// LinearAxisScale_2Test.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LinearAxisScale}.
* It contains ten unit test cases for the {@link LinearAxisScale#upperBounds()} method.
*/
class LinearAxisScale_2Test {

    /**
    * Test method for {@link LinearAxisScale#upperBounds()}.
    */
    @Test
    void testUpperBounds() {
        LinearAxisScale instance = new LinearAxisScale();
        double expResult = 1.0;
        double result = instance.upperBounds();
        assertEquals(expResult, result, 0.0);
    }
}

// LinearAxisScale_3Test.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LinearAxisScale}.
* It contains ten unit test cases for the {@link LinearAxisScale#lowerBounds()} method.
*/
class LinearAxisScale_3Test {
		
    /**
    * Test method for {@link LinearAxisScale#lowerBounds()}.
    */
    @Test
    void testLowerBounds() {
        LinearAxisScale instance = new LinearAxisScale();
        double expResult = -1.0;
        double result = instance.lowerBounds();
        assertEquals(expResult, result, 0.0);
    }
}

// LinearAxisScale_4Test.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LinearAxisScale}.
* It contains ten unit test cases for the {@link LinearAxisScale#func(double)} method.
*/
class LinearAxisScale_4Test {
		
    /**
    * Test method for {@link LinearAxisScale#func(double)}.
    */
    @Test
    void testFunc() {
        LinearAxisScale instance = new LinearAxisScale();
        double a = 0.0;
        double expResult = 0.0;
        double result = instance.func(a);
        assertEquals(expResult, result, 0.0);
    }
}

// LinearAxisScale_5Test.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LinearAxisScale}.
* It contains ten unit test cases for the {@link LinearAxisScale#findGoodLimits(double, double)} method.
*/
class LinearAxisScale_5Test {
		
    /**
    * Test method for {@link LinearAxisScale#findGoodLimits(double, double)}.
    */
    @Test
    void testFindGoodLimits() {
        LinearAxisScale instance = new LinearAxisScale();
        double aLB = 0.0;
        double aUB = 0.0;
        AxisLimitData expResult = null;
        AxisLimitData result = instance.findGoodLimits(aLB, aUB);
        assertEquals(expResult, result);
    }
}

// LinearAxisScale_6Test.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LinearAxisScale}.
* It contains ten unit test cases for the {@link LinearAxisScale#calcTickMarks(double, double, double, double, double)} method.
*/
class LinearAxisScale_6Test {
		
    /**
    * Test method for {@link LinearAxisScale#calcTickMarks(double, double, double, double, double)}.
    */
    @Test
    void testCalcTickMarks() {
        LinearAxisScale instance = new LinearAxisScale();
        double quantum = 0.0;
        double aLB = 0.0;
        double aUB = 0.0;
        double xA = 0.0;
        double xB = 0.0;
        TickMarkData expResult = null;
        TickMarkData result = instance.calcTickMarks(quantum, aLB, aUB, xA, xB);
        assertEquals(expResult, result);
    }
}

// LinearAxisScale_7Test.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LinearAxisScale}.
* It contains ten unit test cases for the {@link LinearAxisScale#adjustForErrorBars(PlotDatum, double, double, AxisLimitData)} method.
*/
class LinearAxisScale_7Test {
		
    /**
    * Test method for {@link LinearAxisScale#adjustForErrorBars(PlotDatum, double, double, AxisLimitData)}.
    */
    @Test
    void testAdjustForErrorBars() {
        LinearAxisScale instance = new LinearAxisScale();
        PlotDatum datum = null;
        double aUB = 0.0;
        double aLB = 0.0;
        AxisLimitData output = null;
        instance.adjustForErrorBars(datum, aUB, aLB, output);
    }
}

// LinearAxisScale_8Test.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LinearAxisScale}.
* It contains ten unit test cases for the {@link LinearAxisScale#modceil(double, double)} method.
*/
class LinearAxisScale_8Test {
		
    /**
    * Test method for {@link LinearAxisScale#modceil(double, double)}.
    */
    @Test
    void testModceil() {
        LinearAxisScale instance = new LinearAxisScale();
        double f = 0.0;
        double t = 0.0;
        double expResult = 0.0;
        double result = instance.modceil(f, t);
        assertEquals(expResult, result, 0.0);
    }
}

// LinearAxisScale_9Test.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LinearAxisScale}.
* It contains ten unit test cases for the {@link LinearAxisScale#modfloor(double, double)} method.
*/
class LinearAxisScale_9Test {
		
    /**
    * Test method for {@link LinearAxisScale#modfloor(double, double)}.
    */
    @Test
    void testModfloor() {
        LinearAxisScale instance = new LinearAxisScale();
        double f = 0.0;
        double t = 0.0;
        double expResult = 0.0;
        double result = instance.modfloor(f, t);
        assertEquals(expResult, result, 0.0);
    }
}

// LinearAxisScaleTest.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LinearAxisScale}.
* It contains ten unit test cases for the {@link LinearAxisScale} class.
*/
class LinearAxisScaleTest {
		
    /**
    * Test method for {@link LinearAxisScale#LinearAxisScale()}.
    */
    @Test
    void testLinearAxisScale() {
        LinearAxisScale instance = new LinearAxisScale();
    }
}

// PlotAxis.java
/*
*   PlotAxis  --  Provides a base class for plot axes.
*
*   Copyright (C) 2000-2002 by <NAME> <jhuwaldt@knology.net>.
*   All rights reserved.
*   
*   This library is free software; you can redistribute it and/or
*   modify it under the terms of the GNU Library General Public
*   License as published by the Free Software Foundation; either
*   version 2 of the License, or (at your option) any later version.
*   
*   This library is distributed in the hope that it will be useful,
*   but WITHOUT ANY WARRANTY; without even the implied warranty of
*   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
*   Library General Public License for more details.
**/
package jahuwaldt.plot;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.awt.image.*;
import java.util.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *  <p> This class provides a base class for plot axes.
 *  </p>
 *
 *  <p>  Modified by:  <NAME>  </p>
 *
 *  @author  <NAME>   Date:  September 13, 2000
 *  @version January 10, 2001
 */
public class PlotAxis extends JComponent implements MouseListener, MouseMotionListener {

    //	Debug flag.
    private static final boolean DEBUG = false;

   