// RescaleToUnitTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RescaleToUnit}.
* It contains ten unit test cases for the {@link RescaleToUnit#rescaleToUnit(List)} method.
*/
class RescaleToUnitTest {

    /**
     * Test case for the {@link RescaleToUnit#rescaleToUnit(List)} method.
     * It tests the case where the list contains two elements.
     */
    @Test
    void testRescaleToUnitWithTwoElements() {
        List<Double> numbers = List.of(1.0, 2.0);
        List<Double> expected = List.of(0.0, 1.0);
        assertEquals(expected, RescaleToUnit.rescaleToUnit(numbers));
    }

    /**
     * Test case for the {@link RescaleToUnit#rescaleToUnit(List)} method.
     * It tests the case where the list contains five elements.
     */
    @Test
    void testRescaleToUnitWithFiveElements() {
        List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
        List<Double> expected = List.of(0.0, 0.25, 0.5, 0.75, 1.0);
        assertEquals(expected, RescaleToUnit.rescaleToUnit(numbers));
    }

    /**
     * Test case for the {@link RescaleToUnit#rescaleToUnit(List)} method.
     * It tests the case where the list contains two elements.
     */
    @Test
    void testRescaleToUnitWithTwoElements2() {
        List<Double> numbers = List.of(2.0, 49.9);
        List<Double> expected = List.of(0.0, 1.0);
        assertEquals(expected, RescaleToUnit.rescaleToUnit(numbers));
    }

    /**
     * Test case for the {@link RescaleToUnit#rescaleToUnit(List)} method.
     * It tests the case where the list contains two elements.
     */
    @Test
    void testRescaleToUnitWithTwoElements3() {
        List<Double> numbers = List.of(100.0, 49.9);
        List<Double> expected = List.of(1.0, 0.0);
        assertEquals(expected, RescaleToUnit.rescaleToUnit(numbers));
    }

    /**
     * Test case for the {@link RescaleToUnit#rescaleToUnit(List)} method.
     * It tests the case where the list contains five elements.
     */
    @Test
    void testRescaleToUnitWithFiveElements2() {
        List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
        List<Double> expected = List.of(0.0, 0.25, 0.5, 0.75, 1.0);
        assertEquals(expected, RescaleToUnit.rescaleToUnit(numbers));
    }

    /**
     * Test case for the {@link RescaleToUnit#rescaleToUnit(List)} method.
     * It tests the case where the list contains five elements.
     */
    @Test
    void testRescaleToUnitWithFiveElements3() {
        List<Double> numbers = List.of(2.0, 1.0, 5.0, 3.0, 4.0);
        List<Double> expected = List.of(0.25, 0.0, 1.0, 0.5, 0.75);
        assertEquals(expected, RescaleToUnit.rescaleToUnit(numbers));
    }

    /**
     * Test case for the {@link RescaleToUnit#rescaleToUnit(List)} method.
     * It tests the case where the list contains five elements.
     */
    @Test
    void testRescaleToUnitWithFiveElements4() {
        List<Double> numbers = List.of(12.0, 11.0, 15.0, 13.0, 14.0);
        List<Double> expected = List.of(0.25, 0.0, 1.0, 0.5, 0.75);
        assertEquals(expected, RescaleToUnit.rescaleToUnit(numbers));
    }
}
