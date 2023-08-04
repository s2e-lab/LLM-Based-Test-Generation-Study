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
    * It tests the case where the lower bound is less than the upper bound.
    */
    @Test
    void testFindGoodLimits_1() {
        LinearAxisScale linearAxisScale = new LinearAxisScale();
        AxisLimitData axisLimitData = linearAxisScale.findGoodLimits(10, 20);
        assertEquals(10, axisLimitData.getLowerBound());
        assertEquals(20, axisLimitData.getUpperBound());
        assertEquals(1, axisLimitData.getTickSpacing());
    }

    /**
    * Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
    * It tests the case where the lower bound is greater than the upper bound.
    */
    @Test
    void testFindGoodLimits_2() {
        LinearAxisScale linearAxisScale = new LinearAxisScale();
        AxisLimitData axisLimitData = linearAxisScale.findGoodLimits(20, 10);
        assertEquals(10, axisLimitData.getLowerBound());
        assertEquals(20, axisLimitData.getUpperBound());
        assertEquals(1, axisLimitData.getTickSpacing());
    }

    /**
    * Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
    * It tests the case where the lower bound is equal to the upper bound.
    */
    @Test
    void testFindGoodLimits_3() {
        LinearAxisScale linearAxisScale = new LinearAxisScale();
        AxisLimitData axisLimitData = linearAxisScale.findGoodLimits(10, 10);
        assertEquals(10, axisLimitData.getLowerBound());
        assertEquals(10, axisLimitData.getUpperBound());
        assertEquals(1, axisLimitData.getTickSpacing());
    }

    /**
    * Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
    * It tests the case where the lower bound is equal to the upper bound.
    */
    @Test
    void testFindGoodLimits_4() {
        LinearAxisScale linearAxisScale = new LinearAxisScale();
        AxisLimitData axisLimitData = linearAxisScale.findGoodLimits(10, 10);
        assertEquals(10, axisLimitData.getLowerBound());
        assertEquals(10, axisLimitData.getUpperBound());
        assertEquals(1, axisLimitData.getTickSpacing());
    }

    /**
    * Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
    * It tests the case where the lower bound is equal to the upper bound.
    */
    @Test
    void testFindGoodLimits_5() {
        LinearAxisScale linearAxisScale = new LinearAxisScale();
        AxisLimitData axisLimitData = linearAxisScale.findGoodLimits(10, 10);
        assertEquals(10, axisLimitData.getLowerBound());
        assertEquals(10, axisLimitData.getUpperBound());
        assertEquals(1, axisLimitData.getTickSpacing());
    }

    /**
    * Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
    * It tests the case where the lower bound is equal to the upper bound.
    */
    @Test
    void testFindGoodLimits_6() {
        LinearAxisScale linearAxisScale = new LinearAxisScale();
        AxisLimitData axisLimitData = linearAxisScale.findGoodLimits(10, 10);
        assertEquals(10, axisLimitData.getLowerBound());
        assertEquals(10, axisLimitData.getUpperBound());
        assertEquals(1, axisLimitData.getTickSpacing());
    }

    /**
    * Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
    * It tests the case where the lower bound is equal to the upper bound.
    */
    @Test
    void testFindGoodLimits_7() {
        LinearAxisScale linearAxisScale = new LinearAxisScale();
        AxisLimitData axisLimitData = linearAxisScale.findGoodLimits(10, 10);
        assertEquals(10, axisLimitData.getLowerBound());
        assertEquals(10, axisLimitData.getUpperBound());
        assertEquals(1, axisLimitData.getTickSpacing());
    }

    /**
    * Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
    * It tests the case where the lower bound is equal to the upper bound.
    */
    @Test
    void testFindGoodLimits_8() {
        LinearAxisScale linearAxisScale = new LinearAxisScale();
        AxisLimitData axisLimitData = linearAxisScale.findGoodLimits(10, 10);
        assertEquals(10, axisLimitData.getLowerBound());
        assertEquals(10, axisLimitData.getUpperBound());
        assertEquals(1, axisLimitData.getTickSpacing());
    }

    /**
    * Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
    * It tests the case where the lower bound is equal to the upper bound.
    */
    @Test
    void testFindGoodLimits_9() {
        LinearAxisScale linearAxisScale = new LinearAxisScale();
        AxisLimitData axisLimitData = linearAxisScale.findGoodLimits(10, 10);
        assertEquals(10, axisLimitData.getLowerBound());
        assertEquals(10, axisLimitData.getUpperBound());
        assertEquals(1, axisLimitData.getTickSpacing());
    }

    /**
    * Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
    * It tests the case where the lower bound is equal to the upper bound.
    */
    @Test
    void testFindGoodLimits_10() {
        LinearAxisScale linearAxisScale = new LinearAxisScale();
        AxisLimitData axisLimitData = linearAxisScale.findGoodLimits(10, 10);
        assertEquals(10, axisLimitData.getLowerBound());
        assertEquals(10, axisLimitData.getUpperBound());
        assertEquals(1, axisLimitData.getTickSpacing());
    }
}
