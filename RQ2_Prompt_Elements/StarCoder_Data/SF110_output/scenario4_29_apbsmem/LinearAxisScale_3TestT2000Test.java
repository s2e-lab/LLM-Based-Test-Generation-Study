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
    * Test method for {@link LinearAxisScale#calcTickMarks(double, double, double, double, double)}.
    */
    @Test
    void testCalcTickMarks() {
        double quantum = 0.5;
        double aLB = 0.0;
        double aUB = 10.0;
        double xA = 1.0;
        double xB = 1.0;
        LinearAxisScale scale = new LinearAxisScale();
        TickMarkData tickMarks = scale.calcTickMarks(quantum, aLB, aUB, xA, xB);
        assertEquals(11, tickMarks.numTicks());
        assertEquals(0.0, tickMarks.getTick(0).position);
        assertEquals(0.5, tickMarks.getTick(1).position);
        assertEquals(1.0, tickMarks.getTick(2).position);
        assertEquals(1.5, tickMarks.getTick(3).position);
        assertEquals(2.0, tickMarks.getTick(4).position);
        assertEquals(2.5, tickMarks.getTick(5).position);
        assertEquals(3.0, tickMarks.getTick(6).position);
        assertEquals(3.5, tickMarks.getTick(7).position);
        assertEquals(4.0, tickMarks.getTick(8).position);
        assertEquals(4.5, tickMarks.getTick(9).position);
        assertEquals(5.0, tickMarks.getTick(10).position);
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
        double quantum = 0.5;
        double aLB = 0.0;
        double aUB = 10.0;
        double xA = 1.0;
        double xB = 1.0;
        LinearAxisScale scale = new LinearAxisScale();
        TickMarkData tickMarks = scale.calcTickMarks(quantum, aLB, aUB, xA, xB);
        assertEquals(11, tickMarks.numTicks());
        assertEquals(0.0, tickMarks.getTick(0).position);
        assertEquals(0.5, tickMarks.getTick(1).position);
        assertEquals(1.0, tickMarks.getTick(2).position);
        assertEquals(1.5, tickMarks.getTick(3).position);
        assertEquals(2.0, tickMarks.getTick(4).position);
        assertEquals(2.5, tickMarks.getTick(5).position);
        assertEquals(3.0, tickMarks.getTick(6).position);
        assertEquals(3.5, tickMarks.getTick(7).position);
        assertEquals(4.0, tickMarks.getTick(8).position);
        assertEquals(4.5, tickMarks.getTick(9).position);
        assertEquals(5.0, tickMarks.getTick(10).position);
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
        double quantum = 0.5;
        double aLB = 0.0;
        double aUB = 10.0;
        double xA = 1.0;
        double xB = 1.0;
        LinearAxisScale scale = new LinearAxisScale();
        TickMarkData tickMarks = scale.calcTickMarks(quantum, aLB, aUB, xA, xB);
        assertEquals(11, tickMarks.numTicks());
        assertEquals(0.0, tickMarks.getTick(0).position);
        assertEquals(0.5, tickMarks.getTick(1).position);
        assertEquals(1.0, tickMarks.getTick(2).position);
        assertEquals(1.5, tickMarks.getTick(3).position);
        assertEquals(2.0, tickMarks.getTick(4).position);
        assertEquals(2.5, tickMarks.getTick(5).position);
        assertEquals(3.0, tickMarks.getTick(6).position);
        assertEquals(3.5, tickMarks.getTick(7).position);
        assertEquals(4.0, tickMarks.getTick(8).position);
        assertEquals(4.5, tickMarks.getTick(9).position);
        assertEquals(5.0, tickMarks.getTick(10).position);
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
        double quantum = 0.5;
        double aLB = 0.0;
        double aUB = 10.0;
        double xA = 1.0;
        double xB = 1.0;
        LinearAxisScale scale = new LinearAxisScale();
        TickMarkData tickMarks = scale.calcTickMarks(quantum, aLB, aUB, xA, xB);
        assertEquals(11, tickMarks.numTicks());
        assertEquals(0.0, tickMarks.getTick(0).position);
        assertEquals(0.5, tickMarks.getTick(1).position);
        assertEquals(1.0, tickMarks.getTick(2).position);
        assertEquals(1.5, tickMarks.getTick(3).position);
        assertEquals(2.0, tickMarks.getTick(4).position);
        assertEquals(2.5, tickMarks.getTick(5).position);
        assertEquals(3.0, tickMarks.getTick(6).position);
        assertEquals(3.5, tickMarks.getTick(7).position);
        assertEquals(4.0, tickMarks.getTick(8).position);
        assertEquals(4.5, tickMarks.getTick(9).position);
        assertEquals(5.0, tickMarks.getTick(10).position);
    }
}

// LinearAxisScale_7Test.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LinearAxisScale}.
* It contains ten unit test cases for the {@link LinearAxisScale#calcTickMarks(double, double, double, double, double)} method.
*/
class LinearAxisScale_7Test {
		
    /**
    * Test method for {@link LinearAxisScale#calcTickMarks(double, double, double, double, double)}.
    */
    @Test
    void testCalcTickMarks() {
        double quantum = 0.5;
        double aLB = 0.0;
        double aUB = 10.0;
        double xA = 1.0;
        double xB = 1.0;
        LinearAxisScale scale = new LinearAxisScale();
        TickMarkData tickMarks = scale.calcTickMarks(quantum, aLB, aUB, xA, xB);
        assertEquals(11, tickMarks.numTicks());
        assertEquals(0.0, tickMarks.getTick(0).position);
        assertEquals(0.5, tickMarks.getTick(1).position);
        assertEquals(1.0, tickMarks.getTick(2).position);
        assertEquals(1.5, tickMarks.getTick(3).position);
        assertEquals(2.0, tickMarks.getTick(4).position);
        assertEquals(2.5, tickMarks.getTick(5).position);
        assertEquals(3.0, tickMarks.