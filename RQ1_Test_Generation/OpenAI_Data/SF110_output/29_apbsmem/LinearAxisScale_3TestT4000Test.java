// LinearAxisScale_3Test.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LinearAxisScale}.
* It contains ten unit test cases for the {@link LinearAxisScale#findGoodLimits(double, double)} method.
*/
class LinearAxisScale_3Test {

	/**
	* Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
	* Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
	* Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
	* Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
	* Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
	* Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
	* Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
	* Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
	* Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
	* Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
	*/
	@Test
	void testFindGoodLimits() {
		LinearAxisScale axisScale = new LinearAxisScale();
		AxisLimitData result = axisScale.findGoodLimits(0.0, 0.0);
		assertEquals(-1.0, result.lb, 1e-6);
		assertEquals(1.0, result.ub, 1e-6);
		assertEquals(1.0, result.quantum, 1e-6);
		result = axisScale.findGoodLimits(0.0, 1.0);
		assertEquals(0.0, result.lb, 1e-6);
		assertEquals(1.0, result.ub, 1e-6);
		assertEquals(0.2, result.quantum, 1e-6);
		result = axisScale.findGoodLimits(0.0, 2.0);
		assertEquals(0.0, result.lb, 1e-6);
		assertEquals(2.0, result.ub, 1e-6);
		assertEquals(0.2, result.quantum, 1e-6);
		result = axisScale.findGoodLimits(0.0, 3.0);
		assertEquals(0.0, result.lb, 1e-6);
		assertEquals(3.0, result.ub, 1e-6);
		assertEquals(0.5, result.quantum, 1e-6);
		result = axisScale.findGoodLimits(0.0, 4.0);
		assertEquals(0.0, result.lb, 1e-6);
		assertEquals(4.0, result.ub, 1e-6);
		assertEquals(1.0, result.quantum, 1e-6);
		result = axisScale.findGoodLimits(0.0, 5.0);
		assertEquals(0.0, result.lb, 1e-6);
		assertEquals(5.0, result.ub, 1e-6);
		assertEquals(1.0, result.quantum, 1e-6);
		result = axisScale.findGoodLimits(0.0, 6.0);
		assertEquals(0.0, result.lb, 1e-6);
		assertEquals(6.0, result.ub, 1e-6);
		assertEquals(1.0, result.quantum, 1e-6);
		result = axisScale.findGoodLimits(0.0, 7.0);
		assertEquals(0.0, result.lb, 1e-6);
		assertEquals(7.0, result.ub, 1e-6);
		assertEquals(1.0, result.quantum, 1e-6);
		result = axisScale.findGoodLimits(0.0, 8.0);
		assertEquals(0.0, result.lb, 1e-6);
		assertEquals(8.0, result.ub, 1e-6);
		assertEquals(2.0, result.quantum, 1e-6);
		result = axisScale.findGoodLimits(0.0, 9.0);
		assertEquals(0.0, result.lb, 1e-6);
		assertEquals(9.0, result.ub, 1e-6);
		assertEquals(2.0, result.quantum, 1e-6);
	}
	
}