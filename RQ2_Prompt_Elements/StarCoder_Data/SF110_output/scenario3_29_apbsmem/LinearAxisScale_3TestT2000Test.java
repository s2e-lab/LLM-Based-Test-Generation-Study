// LinearAxisScale_3Test.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LinearAxisScale}.
* It contains ten unit test cases for the {@link LinearAxisScale#calcTickMarks(double, double, double, double, double)} method.
*/
class LinearAxisScale_3Test {

    /**
     * Test case for {@link LinearAxisScale#calcTickMarks(double, double, double, double, double)}
     * when the lower bound is equal to the upper bound.
     */
    @Test
    void test_calcTickMarks_1() {
        LinearAxisScale scale = new LinearAxisScale();
        TickMarkData tickData = scale.calcTickMarks(1.0, 1.0, 1.0, 1.0, 1.0);
        assertEquals(0, tickData.getTickMarkCount());
    }

    /**
     * Test case for {@link LinearAxisScale#calcTickMarks(double, double, double, double, double)}
     * when the lower bound is greater than the upper bound.
     */
    @Test
    void test_calcTickMarks_2() {
        LinearAxisScale scale = new LinearAxisScale();
        TickMarkData tickData = scale.calcTickMarks(1.0, 2.0, 1.0, 1.0, 1.0);
        assertEquals(0, tickData.getTickMarkCount());
    }

    /**
     * Test case for {@link LinearAxisScale#calcTickMarks(double, double, double, double, double)}
     * when the lower bound is equal to the upper bound and the quantum is zero.
     */
    @Test
    void test_calcTickMarks_3() {
        LinearAxisScale scale = new LinearAxisScale();
        TickMarkData tickData = scale.calcTickMarks(0.0, 1.0, 1.0, 1.0, 1.0);
        assertEquals(0, tickData.getTickMarkCount());
    }

    /**
     * Test case for {@link LinearAxisScale#calcTickMarks(double, double, double, double, double)}
     * when the lower bound is equal to the upper bound and the quantum is negative.
     */
    @Test
    void test_calcTickMarks_4() {
        LinearAxisScale scale = new LinearAxisScale();
        TickMarkData tickData = scale.calcTickMarks(-1.0, 1.0, 1.0, 1.0, 1.0);
        assertEquals(0, tickData.getTickMarkCount());
    }

    /**
     * Test case for {@link LinearAxisScale#calcTickMarks(double, double, double, double, double)}
     * when the lower bound is equal to the upper bound and the quantum is positive.
     */
    @Test
    void test_calcTickMarks_5() {
        LinearAxisScale scale = new LinearAxisScale();
        TickMarkData tickData = scale.calcTickMarks(1.0, 1.0, 1.0, 1.0, 1.0);
        assertEquals(0, tickData.getTickMarkCount());
    }

    /**
     * Test case for {@link LinearAxisScale#calcTickMarks(double, double, double, double, double)}
     * when the lower bound is equal to the upper bound and the quantum is positive.
     */
    @Test
    void test_calcTickMarks_6() {
        LinearAxisScale scale = new LinearAxisScale();
        TickMarkData tickData = scale.calcTickMarks(1.0, 1.0, 1.0, 1.0, 1.0);
        assertEquals(0, tickData.getTickMarkCount());
    }

    /**
     * Test case for {@link LinearAxisScale#calcTickMarks(double, double, double, double, double)}
     * when the lower bound is equal to the upper bound and the quantum is positive.
     */
    @Test
    void test_calcTickMarks_7() {
        LinearAxisScale scale = new LinearAxisScale();
        TickMarkData tickData = scale.calcTickMarks(1.0, 1.0, 1.0, 1.0, 1.0);
        assertEquals(0, tickData.getTickMarkCount());
    }

    /**
     * Test case for {@link LinearAxisScale#calcTickMarks(double, double, double, double, double)}
     * when the lower bound is equal to the upper bound and the quantum is positive.
     */
    @Test
    void test_calcTickMarks_8() {
        LinearAxisScale scale = new LinearAxisScale();
        TickMarkData tickData = scale.calcTickMarks(1.0, 1.0, 1.0, 1.0, 1.0);
        assertEquals(0, tickData.getTickMarkCount());
    }

    /**
     * Test case for {@link LinearAxisScale#calcTickMarks(double, double, double, double, double)}
     * when the lower bound is equal to the upper bound and the quantum is positive.
     */
    @Test
    void test_calcTickMarks_9() {
        LinearAxisScale scale = new LinearAxisScale();
        TickMarkData tickData = scale.calcTickMarks(1.0, 1.0, 1.0, 1.0, 1.0);
        assertEquals(0, tickData.getTickMarkCount());
    }

    /**
     * Test case for {@link LinearAxisScale#calcTickMarks(double, double, double, double, double)}
     * when the lower bound is equal to the upper bound and the quantum is positive.
     */
    @Test
    void test_calcTickMarks_10() {
        LinearAxisScale scale = new LinearAxisScale();
        TickMarkData tickData = scale.calcTickMarks(1.0, 1.0, 1.0, 1.0, 1.0);
        assertEquals(0, tickData.getTickMarkCount());
    }
}

// LinearAxisScale_2Test.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LinearAxisScale}.
* It contains ten unit test cases for the {@link LinearAxisScale#calcTickMarks(double, double, double, double, double)} method.
*/
class LinearAxisScale_2Test {
		
    /**
     * Test case for {@link LinearAxisScale#calcTickMarks(double, double, double, double, double)}
     * when the lower bound is equal to the upper bound.
     */
    @Test
    void test_calcTickMarks_1() {
        LinearAxisScale scale = new LinearAxisScale();
        TickMarkData tickData = scale.calcTickMarks(1.0, 1.0, 1.0, 1.0, 1.0);
        assertEquals(0, tickData.getTickMarkCount());
    }

    /**
     * Test case for {@link LinearAxisScale#calcTickMarks(double, double, double, double, double)}
     * when the lower bound is greater than the upper bound.
     */
    @Test
    void test_calcTickMarks_2() {
        LinearAxisScale scale = new LinearAxisScale();
        TickMarkData tickData = scale.calcTickMarks(1.0, 2.0, 1.0, 1.0, 1.0);
        assertEquals(0, tickData.getTickMarkCount());
    }

    /**
     * Test case for {@link LinearAxisScale#calcTickMarks(double, double, double, double, double)}
     * when the lower bound is equal to the upper bound and the quantum is zero.
     */
    @Test
    void test_calcTickMarks_3() {
        LinearAxisScale scale = new LinearAxisScale();
        TickMarkData tickData = scale.calcTickMarks(0.0, 1.0, 1.0, 1.0, 1.0);
        assertEquals(0, tickData.getTickMarkCount());
    }

    /**
     * Test case for {@link LinearAxisScale#calcTickMarks(double, double, double, double, double)}
     * when the lower bound is equal to the upper bound and the quantum is negative.
     */
    @Test
    void test_calcTickMarks_4() {
        LinearAxisScale scale = new LinearAxisScale();
        TickMarkData tickData = scale.calcTickMarks(-1.0, 1.0, 1.0, 1.0, 1.0);
        assertEquals(0, tickData.getTickMarkCount());
    }

    /**
     * Test case for {@link LinearAxisScale#calcTickMarks(double, double, double, double, double)}
     * when the lower bound is equal to the upper bound and the quantum is positive.
     */
    @Test
    void test_calcTickMarks_5() {
        LinearAxisScale scale = new LinearAxisScale();
        TickMarkData tickData = scale.calcTickMarks(1.0, 1.0, 1.0, 1.0, 1.0);
        assertEquals(0, tickData.getTickMarkCount());
    }

    /**
     * Test case for {@link LinearAxisScale#calcTickMarks(double, double, double, double, double)}
     * when the lower bound is equal to the upper bound and the quantum is positive.
     */
    @Test
    void