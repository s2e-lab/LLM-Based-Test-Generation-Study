// LinearAxisScale_2Test.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LinearAxisScale}.
* It contains ten unit test cases for the {@link LinearAxisScale#findGoodLimits(double, double)} method.
*/
class LinearAxisScale_2Test {

    /**
    * Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
    */
    @Test
    void testFindGoodLimits() {
        //	Test case 1:  aLB = 0, aUB = 100
        LinearAxisScale scale = new LinearAxisScale();
        AxisLimitData limData = scale.findGoodLimits(0., 100.);
        assertEquals(0., limData.lb);
        assertEquals(100., limData.ub);
        assertEquals(10., limData.quantum);
        //	Test case 2:  aLB = 0, aUB = 1000
        limData = scale.findGoodLimits(0., 1000.);
        assertEquals(0., limData.lb);
        assertEquals(1000., limData.ub);
        assertEquals(100., limData.quantum);
        //	Test case 3:  aLB = 0, aUB = 10000
        limData = scale.findGoodLimits(0., 10000.);
        assertEquals(0., limData.lb);
        assertEquals(10000., limData.ub);
        assertEquals(1000., limData.quantum);
        //	Test case 4:  aLB = 0, aUB = 100000
        limData = scale.findGoodLimits(0., 100000.);
        assertEquals(0., limData.lb);
        assertEquals(100000., limData.ub);
        assertEquals(10000., limData.quantum);
        //	Test case 5:  aLB = 0, aUB = 1000000
        limData = scale.findGoodLimits(0., 1000000.);
        assertEquals(0., limData.lb);
        assertEquals(1000000., limData.ub);
        assertEquals(100000., limData.quantum);
        //	Test case 6:  aLB = 0, aUB = 10000000
        limData = scale.findGoodLimits(0., 10000000.);
        assertEquals(0., limData.lb);
        assertEquals(10000000., limData.ub);
        assertEquals(1000000., limData.quantum);
        //	Test case 7:  aLB = 0, aUB = 100000000
        limData = scale.findGoodLimits(0., 100000000.);
        assertEquals(0., limData.lb);
        assertEquals(100000000., limData.ub);
        assertEquals(10000000., limData.quantum);
        //	Test case 8:  aLB = 0, aUB = 1000000000
        limData = scale.findGoodLimits(0., 1000000000.);
        assertEquals(0., limData.lb);
        assertEquals(1000000000., limData.ub);
        assertEquals(100000000., limData.quantum);
        //	Test case 9:  aLB = 0, aUB = 10000000000
        limData = scale.findGoodLimits(0., 10000000000.);
        assertEquals(0., limData.lb);
        assertEquals(10000000000., limData.ub);
        assertEquals(1000000000., limData.quantum);
        //	Test case 10:  aLB = 0, aUB = 100000000000
        limData = scale.findGoodLimits(0., 100000000000.);
        assertEquals(0., limData.lb);
        assertEquals(100000000000., limData.ub);
        assertEquals(10000000000., limData.quantum);
        //	Test case 11:  aLB = 0, aUB = 1000000000000
        limData = scale.findGoodLimits(0., 1000000000000.);
        assertEquals(0., limData.lb);
        assertEquals(1000000000000., limData.ub);
        assertEquals(100000000000., limData.quantum);
        //	Test case 12:  aLB = 0, aUB = 10000000000000
        limData = scale.findGoodLimits(0., 10000000000000.);
        assertEquals(0., limData.lb);
        assertEquals(10000000000000., limData.ub);
        assertEquals(1000000000000., limData.quantum);
        //	Test case 13:  aLB = 0, aUB = 100000000000000
        limData = scale.findGoodLimits(0., 100000000000000.);
        assertEquals(0., limData.lb);
        assertEquals(100000000000000., limData.ub);
        assertEquals(10000000000000., limData.quantum);
        //	Test case 14:  aLB = 0, aUB = 1000000000000000
        limData = scale.findGoodLimits(0., 1000000000000000.);
        assertEquals(0., limData.lb);
        assertEquals(1000000000000000., limData.ub);
        assertEquals(100000000000000., limData.quantum);
        //	Test case 15:  aLB = 0, aUB = 10000000000000000
        limData = scale.findGoodLimits(0., 10000000000000000.);
        assertEquals(0., limData.lb);
        assertEquals(10000000000000000., limData.ub);
        assertEquals(1000000000000000., limData.quantum);
        //	Test case 16:  aLB = 0, aUB = 100000000000000000
        limData = scale.findGoodLimits(0., 100000000000000000.);
        assertEquals(0., limData.lb);
        assertEquals(100000000000000000., limData.ub);
        assertEquals(10000000000000000., limData.quantum);
        //	Test case 17:  aLB = 0, aUB = 1000000000000000000
        limData = scale.findGoodLimits(0., 1000000000000000000.);
        assertEquals(0., limData.lb);
        assertEquals(1000000000000000000., limData.ub);
        assertEquals(100000000000000000., limData.quantum);
        //	Test case 18:  aLB = 0, aUB = 10000000000000000000
        limData = scale.findGoodLimits(0., 10000000000000000000.);
        assertEquals(0., limData.lb);
        assertEquals(10000000000000000000., limData.ub);
        assertEquals(1000000000000000000., limData.quantum);
        //	Test case 19:  aLB = 0, aUB = 1000000000000