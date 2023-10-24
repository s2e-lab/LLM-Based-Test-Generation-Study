// LinearAxisScale_1Test.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LinearAxisScale}.
* It contains ten unit test cases for the {@link LinearAxisScale#lowerBounds()} method.
*/
class LinearAxisScale_1Test {

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
* It contains ten unit test cases for the {@link LinearAxisScale#func(double)} method.
*/
class LinearAxisScale_3Test {
		
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

// LinearAxisScale_4Test.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LinearAxisScale}.
* It contains ten unit test cases for the {@link LinearAxisScale#findGoodLimits(double, double)} method.
*/
class LinearAxisScale_4Test {
		
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

// LinearAxisScale_5Test.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LinearAxisScale}.
* It contains ten unit test cases for the {@link LinearAxisScale#calcTickMarks(double, double, double, double, double)} method.
*/
class LinearAxisScale_5Test {
		
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

// LinearAxisScale_6Test.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LinearAxisScale}.
* It contains ten unit test cases for the {@link LinearAxisScale#adjustForErrorBars(PlotDatum, double, double, AxisLimitData)} method.
*/
class LinearAxisScale_6Test {
		
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

// LinearAxisScale_7Test.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LinearAxisScale}.
* It contains ten unit test cases for the {@link LinearAxisScale#modceil(double, double)} method.
*/
class LinearAxisScale_7Test {
		
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

// LinearAxisScale_8Test.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LinearAxisScale}.
* It contains ten unit test cases for the {@link LinearAxisScale#modfloor(double, double)} method.
*/
class LinearAxisScale_8Test {
		
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

// LinearAxisScale_9Test.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LinearAxisScale}.
* It contains ten unit test cases for the {@link LinearAxisScale#modceil(double, double)} method.
*/
class LinearAxisScale_9Test {
		
    /**
    * Test method for {@link LinearAxisScale#modceil(double, double)}.
    */
    @Test
    void testModceil_1() {
        LinearAxisScale instance = new LinearAxisScale();
        double f = 0.0;
        double t = 0.0;
        double expResult = 0.0;
        double result = instance.modceil(f, t);
        assertEquals(expResult, result, 0.0);
    }
}

// LinearAxisScale_10Test.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LinearAxisScale}.
* It contains ten unit test cases for the {@link LinearAxisScale#modfloor(double, double)} method.
*/
class LinearAxisScale_10Test {
		
    /**
    * Test method for {@link LinearAxisScale#modfloor(double, double)}.
    */
    @Test
    void testModfloor_1() {
        LinearAxisScale instance = new LinearAxisScale();
        double f = 0.0;
        double t = 0.0;
        double expResult = 0.0;
        double result = instance.modfloor(f, t);
        assertEquals(expResult, result, 0.0);
    }
}

// LinearAxisScale_11Test.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LinearAxisScale}.
* It contains ten unit test cases for the {@link LinearAxisScale#modceil(double, double)} method.
*/
class LinearAxisScale_11Test {
		
   