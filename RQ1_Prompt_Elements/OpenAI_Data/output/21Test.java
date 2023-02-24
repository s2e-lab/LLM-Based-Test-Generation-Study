// RescaleToUnitTest.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
* Unit tests of {@link RescaleToUnit}.
* It contains ten test cases for the {@link RescaleToUnit#rescaleToUnit()} method.
*/
class RescaleToUnitTest {


    @Test
    void testRescaleToUnit() {
        List<Double> numbers = new ArrayList<Double>();
        numbers.add(1.0);
        numbers.add(2.0);
        numbers.add(3.0);
        numbers.add(4.0);
        numbers.add(5.0);
        List<Double> result = RescaleToUnit.rescaleToUnit(numbers);
        assertEquals(0.0, result.get(0));
        assertEquals(0.25, result.get(1));
        assertEquals(0.5, result.get(2));
        assertEquals(0.75, result.get(3));
        assertEquals(1.0, result.get(4));
    }

    @Test
    void testRescaleToUnit2() {
        List<Double> numbers = new ArrayList<Double>();
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
        List<Double> result = RescaleToUnit.rescaleToUnit(numbers);
        assertEquals(0.0, result.get(0));
        assertEquals(0.1, result.get(1));
        assertEquals(0.2, result.get(2));
        assertEquals(0.3, result.get(3));
        assertEquals(0.4, result.get(4));
        assertEquals(0.5, result.get(5));
        assertEquals(0.6, result.get(6));
        assertEquals(0.7, result.get(7));
        assertEquals(0.8, result.get(8));
        assertEquals(0.9, result.get(9));
    }

    @Test
    void testRescaleToUnit3() {
        List<Double> numbers = new ArrayList<Double>();
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
        numbers.add(12.0);
        numbers.add(13.0);
        numbers.add(14.0);
        numbers.add(15.0);
        numbers.add(16.0);
        numbers.add(17.0);
        numbers.add(18.0);
        numbers.add(19.0);
        numbers.add(20.0);
        List<Double> result = RescaleToUnit.rescaleToUnit(numbers);
        assertEquals(0.0, result.get(0));
        assertEquals(0.05, result.get(1));
        assertEquals(0.1, result.get(2));
        assertEquals(0.15, result.get(3));
        assertEquals(0.2, result.get(4));
        assertEquals(0.25, result.get(5));
        assertEquals(0.3, result.get(6));
        assertEquals(0.35, result.get(7));
        assertEquals(0.4, result.get(8));
        assertEquals(0.45, result.get(9));
        assertEquals(0.5, result.get(10));
        assertEquals(0.55, result.get(11));
        assertEquals(0.6, result.get(12));
        assertEquals(0.65, result.get(13));
        assertEquals(0.7, result.get(14));
        assertEquals(0.75, result.get(15));
        assertEquals(0.8, result.get(16));