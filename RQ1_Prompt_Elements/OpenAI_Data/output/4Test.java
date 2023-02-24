// MeanAbsoluteDeviationTest.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests of {@link MeanAbsoluteDeviation}.
 * It contains ten test cases for the {@link scenario1.MeanAbsoluteDeviation#meanAbsoluteDeviation()} method.
 */
class MeanAbsoluteDeviationTest {
		


    @Test
    void testMeanAbsoluteDeviation() {
        List<Double> numbers = new ArrayList<>();
        numbers.add(1.0);
        numbers.add(2.0);
        numbers.add(3.0);
        numbers.add(4.0);
        numbers.add(5.0);
        assertEquals(1.0, MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers));
    }

    @Test
    void testMeanAbsoluteDeviation2() {
        List<Double> numbers = new ArrayList<>();
        numbers.add(1.0);
        numbers.add(2.0);
        numbers.add(3.0);
        numbers.add(4.0);
        numbers.add(5.0);
        numbers.add(6.0);
        assertEquals(1.1666666666666667, MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers));
    }

    @Test
    void testMeanAbsoluteDeviation3() {
        List<Double> numbers = new ArrayList<>();
        numbers.add(1.0);
        numbers.add(2.0);
        numbers.add(3.0);
        numbers.add(4.0);
        numbers.add(5.0);
        numbers.add(6.0);
        numbers.add(7.0);
        assertEquals(1.2857142857142858, MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers));
    }

    @Test
    void testMeanAbsoluteDeviation4() {
        List<Double> numbers = new ArrayList<>();
        numbers.add(1.0);
        numbers.add(2.0);
        numbers.add(3.0);
        numbers.add(4.0);
        numbers.add(5.0);
        numbers.add(6.0);
        numbers.add(7.0);
        numbers.add(8.0);
        assertEquals(1.375, MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers));
    }

    @Test
    void testMeanAbsoluteDeviation5() {
        List<Double> numbers = new ArrayList<>();
        numbers.add(1.0);
        numbers.add(2.0);
        numbers.add(3.0);
        numbers.add(4.0);
        numbers.add(5.0);
        numbers.add(6.0);
        numbers.add(7.0);
        numbers.add(8.0);
        numbers.add(9.0);
        assertEquals(1.4444444444444444, MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers));
    }

    @Test
    void testMeanAbsoluteDeviation6() {
        List<Double> numbers = new ArrayList<>();
        numbers.add(1.0);
        numbers.add(2.0);
        numbers.add(3.0);
        numbers.add(4.0);
        numbers.add(5.0);
        numbers.add(6.0);
        numbers.add(7.0);
        numbers.add(8.0);
        numbers.add(9.0);
        numbers.add(10.0);
        assertEquals(1.5, MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers));
    }

    @Test
    void testMeanAbsoluteDeviation7() {
        List<Double> numbers = new ArrayList<>();
        numbers.add(1.0);
        numbers.add(2.0);
        numbers.add(3.0);
        numbers.add(4.0);
        numbers.add(5.0);
        numbers.add(6.0);
        numbers.add(7.0);
        numbers.add(8.0);
        numbers.add(9.0);
        numbers.add(10.0);
        numbers.add(11.0);
        assertEquals(1.5454545454545454, MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers));
    }

    @Test
    void testMeanAbsoluteDeviation8() {
        List<Double> numbers = new ArrayList