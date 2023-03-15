// LinearAxisScale_4Test.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LinearAxisScale}.
* It contains ten unit test cases for the {@link LinearAxisScale#calcTickMarks(double, double, double, double, double)} method.
*/
class LinearAxisScale_4Test {

	/**
	* Test case for {@link LinearAxisScale#calcTickMarks(double, double, double, double, double)} method.
	*/
	@Test
	void testCalcTickMarks_1() {
		double quantum = 0.1;
		double aLB = 0.0;
		double aUB = 1.0;
		double xA = 1.0;
		double xB = 0.0;
		TickMarkData result = new LinearAxisScale().calcTickMarks(quantum, aLB, aUB, xA, xB);
		assertEquals(10, result.mark.length);
		assertEquals(10, result.lmark.length);
		assertEquals(10, result.markValue.length);
		assertEquals(0, result.mark[0]);
		assertEquals(PlotAxis.kTick, result.lmark[0]);
		assertEquals(0.1f, result.markValue[0]);
		assertEquals(10, result.mark[9]);
		assertEquals(3 * PlotAxis.kTick, result.lmark[9]);
		assertEquals(1.0f, result.markValue[9]);
	}
	
	/**
	* Test case for {@link LinearAxisScale#calcTickMarks(double, double, double, double, double)} method.
	*/
	@Test
	void testCalcTickMarks_2() {
		double quantum = 0.1;
		double aLB = 0.0;
		double aUB = 1.0;
		double xA = 2.0;
		double xB = 0.0;
		TickMarkData result = new LinearAxisScale().calcTickMarks(quantum, aLB, aUB, xA, xB);
		assertEquals(10, result.mark.length);
		assertEquals(10, result.lmark.length);
		assertEquals(10, result.markValue.length);
		assertEquals(0, result.mark[0]);
		assertEquals(PlotAxis.kTick, result.lmark[0]);
		assertEquals(0.1f, result.markValue[0]);
		assertEquals(20, result.mark[9]);
		assertEquals(3 * PlotAxis.kTick, result.lmark[9]);
		assertEquals(1.0f, result.markValue[9]);
	}
	
	/**
	* Test case for {@link LinearAxisScale#calcTickMarks(double, double, double, double, double)} method.
	*/
	@Test
	void testCalcTickMarks_3() {
		double quantum = 0.1;
		double aLB = 0.0;
		double aUB = 1.0;
		double xA = 1.0;
		double xB = 10.0;
		TickMarkData result = new LinearAxisScale().calcTickMarks(quantum, aLB, aUB, xA, xB);
		assertEquals(10, result.mark.length);
		assertEquals(10, result.lmark.length);
		assertEquals(10, result.markValue.length);
		assertEquals(10, result.mark[0]);
		assertEquals(PlotAxis.kTick, result.lmark[0]);
		assertEquals(0.1f, result.markValue[0]);
		assertEquals(20, result.mark[9]);
		assertEquals(3 * PlotAxis.kTick, result.lmark[9]);
		assertEquals(1.0f, result.markValue[9]);
	}
	
	/**
	* Test case for {@link LinearAxisScale#calcTickMarks(double, double, double, double, double)} method.
	*/
	@Test
	void testCalcTickMarks_4() {
		double quantum = 0.1;
		double aLB = 0.0;
		double aUB = 1.0;
		double xA = 2.0;
		double xB = 10.0;
		TickMarkData result = new LinearAxisScale().calcTickMarks(quantum, aLB, aUB, xA, xB);
		assertEquals(10, result.mark.length);
		assertEquals(10, result.lmark.length);
		assertEquals(10, result.markValue.length);
		assertEquals(20, result.mark[0]);
		assertEquals(PlotAxis.kTick, result.lmark[0]);
		assertEquals(0.1f, result.markValue[0]);
		assertEquals(40, result.mark[9]);
		assertEquals(3 * PlotAxis.kTick, result.lmark[9]);
		assertEquals(1.0f, result.markValue[9]);
	}
	
	/**
	* Test case for {@link LinearAxisScale#calcTickMarks(double, double, double, double, double)} method.
	*/
	@Test
	void testCalcTickMarks_5() {
		double quantum = 0.1;
		double aLB = 0.0;
		double aUB = 1.0;
		double xA = 1.0;
		double xB = -10.0;
		TickMarkData result = new LinearAxisScale().calcTickMarks(quantum, aLB, aUB, xA, xB);
		assertEquals(10, result.mark.length);
		assertEquals(10, result.lmark.length);
		assertEquals(10, result.markValue.length);
		assertEquals(-10, result.mark[0]);
		assertEquals(PlotAxis.kTick, result.lmark[0]);
		assertEquals(0.1f, result.markValue[0]);
		assertEquals(0, result.mark[9]);
		assertEquals(3 * PlotAxis.kTick, result.lmark[9]);
		assertEquals(1.0f, result.markValue[9]);
	}
	
	/**
	* Test case for {@link LinearAxisScale#calcTickMarks(double, double, double, double, double)} method.
	*/
	@Test
	void testCalcTickMarks_6() {
		double quantum = 0.1;
		double aLB = 0.0;
		double aUB = 1.0;
		double xA = 2.0;
		double xB = -10.0;
		TickMarkData result = new LinearAxisScale().calcTickMarks(quantum, aLB, aUB, xA, xB);
		assertEquals(10, result.mark.length);
		assertEquals(10, result.lmark.length);
		assertEquals(10, result.markValue.length);
		assertEquals(-20, result.mark[0]);
		assertEquals(PlotAxis.kTick, result.lmark[0]);
		assertEquals(0.1f, result.markValue[0]);
		assertEquals(-10, result.mark[9]);
		assertEquals(3 * PlotAxis.kTick, result.lmark[9]);
		assertEquals(1.0f, result.markValue[9]);
	}
	
	/**
	* Test case for {@link LinearAxisScale#calcTickMarks(double, double, double, double, double)} method.
	*/
	@Test
	void testCalcTickMarks_7() {
		double quantum = 0.1;
		double aLB = 0.0;
		double aUB = 1.0;
		double xA = 1.0;
		double xB = -5.0;
		TickMarkData result = new LinearAxisScale().calcTickMarks(quantum, aLB, aUB, xA, xB);
		assertEquals(10, result.mark.length);
		assertEquals(10, result.lmark.length);
		assertEquals(10, result.markValue.length);
		assertEquals(-5, result.mark[0]);
		assertEquals(PlotAxis.kTick, result.lmark[0]);
		assertEquals(0.1f, result.markValue[0]);
		assertEquals(5, result.mark[9]);
		assertEquals(3 * PlotAxis.kTick, result.lmark[9]);
		assertEquals(1.0f, result.markValue[9]);
	}
	
	/**
	* Test case for {@link LinearAxisScale#calcTickMarks(double, double, double, double, double)} method.
	*/
	@Test
	void testCalcTickMarks_8() {
		double quantum = 0.1;
		double aLB = 0.0;
		double aUB = 1.0;
		double xA = 2.0;
		double xB = -5.0;
		TickMarkData result = new LinearAxisScale().calcTickMarks(quantum, aLB, aUB, xA, xB);
		assertEquals(10, result.mark.length);
		assertEquals(10, result.lmark.length);
		assertEquals(10, result.markValue.length);
		assertEquals(-10, result.mark[0]);
		assertEquals(PlotAxis.kTick, result.lmark[0]);
		assertEquals(0.1f, result.markValue[0]);
		assertEquals(0, result.mark[9]);
		assertEquals(3 * PlotAxis.kTick, result.lmark[9]);
		assertEquals(1.0f, result.markValue[9]);
	}
	
	/**
	* Test case for {@link LinearAxisScale#calcTickMarks(double, double, double, double, double)} method.
	*/
	@Test
	void testCalcTickMarks_9() {
		double quantum = 0.1;
		double aLB = 0.0;
		double aUB = 1.0;
		double xA = 1.0;
		double xB = 5.0;
		TickMarkData result = new LinearAxisScale().calcTickMarks(quantum, aLB, aUB, xA, xB);
		assertEquals(10, result.mark.length);
		assertEquals(10, result.lmark.length);
		assertEquals(10, result.markValue.length);
		assertEquals(5, result.mark[0]);
		assertEquals(PlotAxis.kTick, result.lmark[0]);
		assertEquals(0.1f, result.markValue[0]);
		assertEquals(15, result.mark[9]);
		assertEquals(3 * PlotAxis.kTick, result.lmark[9]);
		assertEquals(1.0f, result.markValue[9]);
	}
	
	/**
	* Test case for {@link LinearAxisScale#calcTickMarks(double, double, double, double, double)} method.
	*/
	@Test
	void testCalcTickMarks_10() {
		double quantum = 0.1;
		double aLB = 0.0;
		double aUB = 1.0;
		double xA = 2.0;
		double xB = 5.0;
		TickMarkData result = new LinearAxisScale().calcTickMarks(quantum, aLB, aUB, xA, xB);
		assertEquals(10, result.mark.length);
		assertEquals(10, result.lmark.length);
		assertEquals(10, result.markValue.length);
		assertEquals(10, result.mark[0]);
		assertEquals(PlotAxis.kTick, result.lmark[0]);
		assertEquals(0.1f, result.markValue[0]);
		assertEquals(30, result.mark[9]);
		assertEquals(3 * PlotAxis.kTick, result.lmark[9]);
		assertEquals(1.0f, result.markValue[9]);
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
	* Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
	*/
	@Test
	void testFindGoodLimits_1() {
		double aLB = 0.0;
		double aUB = 1.0;
		AxisLimitData result = new LinearAxisScale().findGoodLimits(aLB, aUB);
		assertEquals(0.0, result.lb);
		assertEquals(1.0, result.ub);
		assertEquals(0.1, result.quantum);
	}
	
	/**
	* Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
	*/
	@Test
	void testFindGoodLimits_2() {
		double aLB = 0.0;
		double aUB = 0.1;
		AxisLimitData result = new LinearAxisScale().findGoodLimits(aLB, aUB);
		assertEquals(0.0, result.lb);
		assertEquals(0.1, result.ub);
		assertEquals(0.01, result.quantum);
	}
	
	/**
	* Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
	*/
	@Test
	void testFindGoodLimits_3() {
		double aLB = 0.0;
		double aUB = 0.01;
		AxisLimitData result = new LinearAxisScale().findGoodLimits(aLB, aUB);
		assertEquals(0.0, result.lb);
		assertEquals(0.01, result.ub);
		assertEquals(0.001, result.quantum);
	}
	
	/**
	* Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
	*/
	@Test
	void testFindGoodLimits_4() {
		double aLB = 0.0;
		double aUB = 0.001;
		AxisLimitData result = new LinearAxisScale().findGoodLimits(aLB, aUB);
		assertEquals(0.0, result.lb);
		assertEquals(0.001, result.ub);
		assertEquals(0.0001, result.quantum);
	}
	
	/**
	* Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
	*/
	@Test
	void testFindGoodLimits_5() {
		double aLB = 0.0;
		double aUB = 0.0001;
		AxisLimitData result = new LinearAxisScale().findGoodLimits(aLB, aUB);
		assertEquals(0.0, result.lb);
		assertEquals(0.0001, result.ub);
		assertEquals(1.0E-4, result.quantum);
	}
	
	/**
	* Test