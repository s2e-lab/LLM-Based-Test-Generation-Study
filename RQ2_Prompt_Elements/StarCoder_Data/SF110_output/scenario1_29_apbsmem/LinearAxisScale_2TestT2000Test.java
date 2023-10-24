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
        //	Test case 1.
        double aLB = 0., aUB = 100.;
        AxisLimitData limData = new LinearAxisScale().findGoodLimits(aLB, aUB);
        assertEquals(limData.lb, 0.);
        assertEquals(limData.ub, 100.);
        assertEquals(limData.quantum, 10.);
        //	Test case 2.
        aLB = -100.;
        aUB = 0.;
        limData = new LinearAxisScale().findGoodLimits(aLB, aUB);
        assertEquals(limData.lb, -100.);
        assertEquals(limData.ub, 0.);
        assertEquals(limData.quantum, 10.);
        //	Test case 3.
        aLB = -100.;
        aUB = 100.;
        limData = new LinearAxisScale().findGoodLimits(aLB, aUB);
        assertEquals(limData.lb, -100.);
        assertEquals(limData.ub, 100.);
        assertEquals(limData.quantum, 10.);
        //	Test case 4.
        aLB = -100.;
        aUB = -100.;
        limData = new LinearAxisScale().findGoodLimits(aLB, aUB);
        assertEquals(limData.lb, -100.);
        assertEquals(limData.ub, -100.);
        assertEquals(limData.quantum, 10.);
        //	Test case 5.
        aLB = 0.;
        aUB = 0.;
        limData = new LinearAxisScale().findGoodLimits(aLB, aUB);
        assertEquals(limData.lb, 0.);
        assertEquals(limData.ub, 0.);
        assertEquals(limData.quantum, 10.);
        //	Test case 6.
        aLB = 100.;
        aUB = 100.;
        limData = new LinearAxisScale().findGoodLimits(aLB, aUB);
        assertEquals(limData.lb, 100.);
        assertEquals(limData.ub, 100.);
        assertEquals(limData.quantum, 10.);
        //	Test case 7.
        aLB = 100.;
        aUB = 200.;
        limData = new LinearAxisScale().findGoodLimits(aLB, aUB);
        assertEquals(limData.lb, 100.);
        assertEquals(limData.ub, 200.);
        assertEquals(limData.quantum, 10.);
        //	Test case 8.
        aLB = 100.;
        aUB = 300.;
        limData = new LinearAxisScale().findGoodLimits(aLB, aUB);
        assertEquals(limData.lb, 100.);
        assertEquals(limData.ub, 300.);
        assertEquals(limData.quantum, 10.);
        //	Test case 9.
        aLB = 100.;
        aUB = 400.;
        limData = new LinearAxisScale().findGoodLimits(aLB, aUB);
        assertEquals(limData.lb, 100.);
        assertEquals(limData.ub, 400.);
        assertEquals(limData.quantum, 10.);
        //	Test case 10.
        aLB = 100.;
        aUB = 500.;
        limData = new LinearAxisScale().findGoodLimits(aLB, aUB);
        assertEquals(limData.lb, 100.);
        assertEquals(limData.ub, 500.);
        assertEquals(limData.quantum, 10.);
    }
}
