// RescaleToUnitTest.java
package original;

import java.util.ArrayList;
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
     * It tests the case where the list contains only two elements.
     */
    @Test
    void testRescaleToUnitWithTwoElements() {
        List<Double> numbers = new ArrayList<Double>();
        numbers.add(1.0);
        numbers.add(2.0);
        List<Double> expected = new ArrayList<Double>();
        expected.add(0.0);
        expected.add(1.0);
        assertEquals(expected, RescaleToUnit.rescaleToUnit(numbers));
    }

    /**
     * Test case for the {@link RescaleToUnit#rescaleToUnit(List)} method.
     * It tests the case where the list contains five elements.
     */
    @Test
    void testRescaleToUnitWithFiveElements() {
        List<Double> numbers = new ArrayList<Double>();
        numbers.add(1.0);
        numbers.add(2.0);
        numbers.add(3.0);
        numbers.add(4.0);
        numbers.add(5.0);
        List<Double> expected = new ArrayList<Double>();
        expected.add(0.0);
        expected.add(0.25);
        expected.add(0.5);
        expected.add(0.75);
        expected.add(1.0);
        assertEquals(expected, RescaleToUnit.rescaleToUnit(numbers));
    }

    /**
     * Test case for the {@link RescaleToUnit#rescaleToUnit(List)} method.
     * It tests the case where the list contains two elements.
     */
    @Test
    void testRescaleToUnitWithTwoElements2() {
        List<Double> numbers = new ArrayList<Double>();
        numbers.add(2.0);
        numbers.add(49.9);
        List<Double> expected = new ArrayList<Double>();
        expected.add(0.0);
        expected.add(1.0);
        assertEquals(expected, RescaleToUnit.rescaleToUnit(numbers));
    }

    /**
     * Test case for the {@link RescaleToUnit#rescaleToUnit(List)} method.
     * It tests the case where the list contains two elements.
     */
    @Test
    void testRescaleToUnitWithTwoElements3() {
        List<Double> numbers = new ArrayList<Double>();
        numbers.add(100.0);
        numbers.add(49.9);
        List<Double> expected = new ArrayList<Double>();
        expected.add(1.0);
        expected.add(0.0);
        assertEquals(expected, RescaleToUnit.rescaleToUnit(numbers));
    }

    /**
     * Test case for the {@link RescaleToUnit#rescaleToUnit(List)} method.
     * It tests the case where the list contains five elements.
     */
    @Test
    void testRescaleToUnitWithFiveElements2() {
        List<Double> numbers = new ArrayList<Double>();
        numbers.add(1.0);
        numbers.add(2.0);
        numbers.add(3.0);
        numbers.add(4.0);
        numbers.add(5.0);
        List<Double> expected = new ArrayList<Double>();
        expected.add(0.0);
        expected.add(0.25);
        expected.add(0.5);
        expected.add(0.75);
        expected.add(1.0);
        assertEquals(expected, RescaleToUnit.rescaleToUnit(numbers));
    }

    /**
     * Test case for the {@link RescaleToUnit#rescaleToUnit(List)} method.
     * It tests the case where the list contains five elements.
     */
    @Test
    void testRescaleToUnitWithFiveElements3() {
        List<Double> numbers = new ArrayList<Double>();
        numbers.add(2.0);
        numbers.add(1.0);
        numbers.add(5.0);
        numbers.add(3.0);
        numbers.add(4.0);
        List<Double> expected = new ArrayList<Double>();
        expected.add(0.25);
        expected.add(0.0);
        expected.add(1.0);
        expected.add(0.5);
        expected.add(0.75);
        assertEquals(expected, RescaleToUnit.rescaleToUnit(numbers));
    }

    /**
     * Test case for the {@link RescaleToUnit#rescaleToUnit(List)} method.
     * It tests the case where the list contains five elements.
     */
    @Test
    void testRescaleToUnitWithFiveElements4() {
        List<Double> numbers = new ArrayList<Double>();
        numbers.add(12.0);
        numbers.add(11.0);
        numbers.add(15.0);
        numbers.add(13.0);
        numbers.add(14.0);
        List<Double> expected = new ArrayList<Double>();
        expected.add(0.25);
        expected.add(0.0);
        expected.add(1.0);
        expected.add(0.5);
        expected.add(0.75);
        assertEquals(expected, RescaleToUnit.rescaleToUnit(numbers));
    }
}
