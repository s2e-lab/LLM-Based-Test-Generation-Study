// LinearAxisScale_0Test.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LinearAxisScale}.
* It contains ten unit test cases for the {@link LinearAxisScale#func(double)} method.
*/
class LinearAxisScale_0Test {

	/**
	* Test method for {@link LinearAxisScale#func(double)}.
	*/
	@Test
	void testFunc() {
		LinearAxisScale linearAxisScale = new LinearAxisScale();
		assertEquals(0.0, linearAxisScale.func(0.0));
		assertEquals(1.0, linearAxisScale.func(1.0));
		assertEquals(2.0, linearAxisScale.func(2.0));
		assertEquals(3.0, linearAxisScale.func(3.0));
		assertEquals(4.0, linearAxisScale.func(4.0));
		assertEquals(5.0, linearAxisScale.func(5.0));
		assertEquals(6.0, linearAxisScale.func(6.0));
		assertEquals(7.0, linearAxisScale.func(7.0));
		assertEquals(8.0, linearAxisScale.func(8.0));
		assertEquals(9.0, linearAxisScale.func(9.0));
	}
	
}

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
		LinearAxisScale linearAxisScale = new LinearAxisScale();
		assertEquals(-1.0, linearAxisScale.lowerBounds());
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
		LinearAxisScale linearAxisScale = new LinearAxisScale();
		assertEquals(1.0, linearAxisScale.upperBounds());
	}
	
}

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
	* Test method for {@link LinearAxisScale#findGoodLimits(double, double)}.
	*/
	@Test
	void testFindGoodLimits() {
		LinearAxisScale linearAxisScale = new LinearAxisScale();
		AxisLimitData axisLimitData = linearAxisScale.findGoodLimits(0.0, 0.0);
		assertEquals(-1.0, axisLimitData.lb);
		assertEquals(1.0, axisLimitData.ub);
		assertEquals(1.0, axisLimitData.quantum);
		axisLimitData = linearAxisScale.findGoodLimits(0.0, 1.0);
		assertEquals(-1.0, axisLimitData.lb);
		assertEquals(2.0, axisLimitData.ub);
		assertEquals(1.0, axisLimitData.quantum);
		axisLimitData = linearAxisScale.findGoodLimits(0.0, 2.0);
		assertEquals(-1.0, axisLimitData.lb);
		assertEquals(3.0, axisLimitData.ub);
		assertEquals(1.0, axisLimitData.quantum);
		axisLimitData = linearAxisScale.findGoodLimits(0.0, 3.0);
		assertEquals(-1.0, axisLimitData.lb);
		assertEquals(4.0, axisLimitData.ub);
		assertEquals(1.0, axisLimitData.quantum);
		axisLimitData = linearAxisScale.findGoodLimits(0.0, 4.0);
		assertEquals(-1.0, axisLimitData.lb);
		assertEquals(5.0, axisLimitData.ub);
		assertEquals(1.0, axisLimitData.quantum);
		axisLimitData = linearAxisScale.findGoodLimits(0.0, 5.0);
		assertEquals(-1.0, axisLimitData.lb);
		assertEquals(6.0, axisLimitData.ub);
		assertEquals(1.0, axisLimitData.quantum);
		axisLimitData = linearAxisScale.findGoodLimits(0.0, 6.0);
		assertEquals(-1.0, axisLimitData.lb);
		assertEquals(7.0, axisLimitData.ub);
		assertEquals(1.0, axisLimitData.quantum);
		axisLimitData = linearAxisScale.findGoodLimits(0.0, 7.0);
		assertEquals(-1.0, axisLimitData.lb);
		assertEquals(8.0, axisLimitData.ub);
		assertEquals(1.0, axisLimitData.quantum);
		axisLimitData = linearAxisScale.findGoodLimits(0.0, 8.0);
		assertEquals(-1.0, axisLimitData.lb);
		assertEquals(9.0, axisLimitData.ub);
		assertEquals(1.0, axisLimitData.quantum);
		axisLimitData = linearAxisScale.findGoodLimits(0.0, 9.0);
		assertEquals(-1.0, axisLimitData.lb);
		assertEquals(10.0, axisLimitData.ub);
		assertEquals(1.0, axisLimitData.quantum);
	}
	
}

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
	* Test method for {@link LinearAxisScale#calcTickMarks(double, double, double, double, double)}.
	*/
	@Test
	void testCalcTickMarks() {
		LinearAxisScale linearAxisScale = new LinearAxisScale();
		TickMarkData tickMarkData = linearAxisScale.calcTickMarks(0.0, 0.0, 0.0, 0.0, 0.0);
		assertEquals(0, tickMarkData.mark.length);
		assertEquals(0, tickMarkData.lmark.length);
		assertEquals(0, tickMarkData.markValue.length);
		tickMarkData = linearAxisScale.calcTickMarks(1.0, 0.0, 1.0, 1.0, 0.0);
		assertEquals(1, tickMarkData.mark.length);
		assertEquals(1, tickMarkData.lmark.length);
		assertEqu