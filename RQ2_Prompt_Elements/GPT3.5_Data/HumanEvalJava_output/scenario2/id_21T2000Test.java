// RescaleToUnitTest.java
package scenario2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RescaleToUnit}.
* It contains ten unit test cases for the {@link RescaleToUnit#rescaleToUnit(List)} method.
*/
class RescaleToUnitTest {
    
    @Test
    void testRescaleToUnitWithTwoElements() {
        List<Double> input = Arrays.asList(1.0, 2.0);
        List<Double> expected = Arrays.asList(0.0, 1.0);
        List<Double> actual = RescaleToUnit.rescaleToUnit(input);
        assertEquals(expected, actual);
    }
    
    @Test
    void testRescaleToUnitWithThreeElements() {
        List<Double> input = Arrays.asList(1.0, 2.0, 3.0);
        List<Double> expected = Arrays.asList(0.0, 0.5, 1.0);
        List<Double> actual = RescaleToUnit.rescaleToUnit(input);
        assertEquals(expected, actual);
    }
    
    @Test
    void testRescaleToUnitWithRepeatedElements() {
        List<Double> input = Arrays.asList(1.0, 2.0, 2.0, 3.0);
        List<Double> expected = Arrays.asList(0.0, 0.5, 0.5, 1.0);
        List<Double> actual = RescaleToUnit.rescaleToUnit(input);
        assertEquals(expected, actual);
    }
    
    @Test
    void testRescaleToUnitWithNegativeElements() {
        List<Double> input = Arrays.asList(-2.0, -1.0, 0.0, 1.0, 2.0);
        List<Double> expected = Arrays.asList(0.0, 0.25, 0.5, 0.75, 1.0);
        List<Double> actual = RescaleToUnit.rescaleToUnit(input);
        assertEquals(expected, actual);
    }
    
    @Test
    void testRescaleToUnitWithAllEqualElements() {
        List<Double> input = Arrays.asList(1.0, 1.0, 1.0, 1.0);
        List<Double> expected = Arrays.asList(0.0, 0.0, 0.0, 0.0);
        List<Double> actual = RescaleToUnit.rescaleToUnit(input);
        assertEquals(expected, actual);
    }
    
    @Test
    void testRescaleToUnitWithOneElement() {
        List<Double> input = Arrays.asList(1.0);
        List<Double> expected = Arrays.asList(0.0);
        List<Double> actual = RescaleToUnit.rescaleToUnit(input);
        assertEquals(expected, actual);
    }
    
    @Test
    void testRescaleToUnitWithEmptyList() {
        List<Double> input = new ArrayList<>();
        assertThrows(IllegalArgumentException.class, () -> RescaleToUnit.rescaleToUnit(input));
    }
    
    @Test
    void testRescaleToUnitWithNullList() {
        assertThrows(NullPointerException.class, () -> RescaleToUnit.rescaleToUnit(null));
    }
    
    @Test
    void testRescaleToUnitWithMaxValue() {
        List<Double> input = Arrays.asList(Double.MIN_VALUE, Double.MAX_VALUE);
        List<Double> expected = Arrays.asList(0.0, 1.0);
        List<Double> actual = RescaleToUnit.rescaleToUnit(input);
        assertEquals(expected, actual);
    }
    
    @Test
    void testRescaleToUnitWithMinValue() {
        List<Double> input = Arrays.asList(Double.MAX_VALUE, Double.MIN_VALUE);
        List<Double> expected = Arrays.asList(1.0, 0.0);
        List<Double> actual = RescaleToUnit.rescaleToUnit(input);
        assertEquals(expected, actual);
    }
}