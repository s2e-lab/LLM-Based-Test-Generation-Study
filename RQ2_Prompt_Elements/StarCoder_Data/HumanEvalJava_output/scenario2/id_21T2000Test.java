// RescaleToUnitTest.java
package scenario2;

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
     * It tests the method with a list of numbers of size 2.
     */
    @Test
    void testRescaleToUnitSize2() {
        List<Double> numbers = new ArrayList<Double>();
        numbers.add(1.0);
        numbers.add(2.0);
        List<Double> result = RescaleToUnit.rescaleToUnit(numbers);
        assertEquals(2, result.size());
        assertEquals(0.0, result.get(0));
        assertEquals(1.0, result.get(1));
    }

    /**
     * Test case for the {@link RescaleToUnit#rescaleToUnit(List)} method.
     * It tests the method with a list of numbers of size 3.
     */
    @Test
    void testRescaleToUnitSize3() {
        List<Double> numbers = new ArrayList<Double>();
        numbers.add(1.0);
        numbers.add(2.0);
        numbers.add(3.0);
        List<Double> result = RescaleToUnit.rescaleToUnit(numbers);
        assertEquals(3, result.size());
        assertEquals(0.0, result.get(0));
        assertEquals(0.5, result.get(1));
        assertEquals(1.0, result.get(2));
    }

    /**
     * Test case for the {@link RescaleToUnit#rescaleToUnit(List)} method.
     * It tests the method with a list of numbers of size 4.
     */
    @Test
    void testRescaleToUnitSize4() {
        List<Double> numbers = new ArrayList<Double>();
        numbers.add(1.0);
        numbers.add(2.0);
        numbers.add(3.0);
        numbers.add(4.0);
        List<Double> result = RescaleToUnit.rescaleToUnit(numbers);
        assertEquals(4, result.size());
        assertEquals(0.0, result.get(0));
        assertEquals(0.25, result.get(1));
        assertEquals(0.5, result.get(2));
        assertEquals(1.0, result.get(3));
    }

    /**
     * Test case for the {@link RescaleToUnit#rescaleToUnit(List)} method.
     * It tests the method with a list of numbers of size 5.
     */
    @Test
    void testRescaleToUnitSize5() {
        List<Double> numbers = new ArrayList<Double>();
        numbers.add(1.0);
        numbers.add(2.0);
        numbers.add(3.0);
        numbers.add(4.0);
        numbers.add(5.0);
        List<Double> result = RescaleToUnit.rescaleToUnit(numbers);
        assertEquals(5, result.size());
        assertEquals(0.0, result.get(0));
        assertEquals(0.2, result.get(1));
        assertEquals(0.4, result.get(2));
        assertEquals(0.6, result.get(3));
        assertEquals(1.0, result.get(4));
    }

    /**
     * Test case for the {@link RescaleToUnit#rescaleToUnit(List)} method.
     * It tests the method with a list of numbers of size 6.
     */
    @Test
    void testRescaleToUnitSize6() {
        List<Double> numbers = new ArrayList<Double>();
        numbers.add(1.0);
        numbers.add(2.0);
        numbers.add(3.0);
        numbers.add(4.0);
        numbers.add(5.0);
        numbers.add(6.0);
        List<Double> result = RescaleToUnit.rescaleToUnit(numbers);
        assertEquals(6, result.size());
        assertEquals(0.0, result.get(0));
        assertEquals(0.16666666666666666, result.get(1));
        assertEquals(0.3333333333333333, result.get(2));
        assertEquals(0.5, result.get(3));
        assertEquals(0.6666666666666666, result.get(4));
        assertEquals(1.0, result.get(5));
    }

    /**
     * Test case for the {@link RescaleToUnit#rescaleToUnit(List)} method.
     * It tests the method with a list of numbers of size 7.
     */
    @Test
    void testRescaleToUnitSize7() {
        List<Double> numbers = new ArrayList<Double>();
        numbers.add(1.0);
        numbers.add(2.0);
        numbers.add(3.0);
        numbers.add(4.0);
        numbers.add(5.0);
        numbers.add(6.0);
        numbers.add(7.0);
        List<Double> result = RescaleToUnit.rescaleToUnit(numbers);
        assertEquals(7, result.size());
        assertEquals(0.0, result.get(0));
        assertEquals(0.14285714285714285, result.get(1));
        assertEquals(0.2857142857142857, result.get(2));
        assertEquals(0.42857142857142855, result.get(3));
        assertEquals(0.5714285714285714, result.get(4));
        assertEquals(0.7142857142857143, result.get(5));
        assertEquals(1.0, result.get(6));
    }

    /**
     * Test case for the {@link RescaleToUnit#rescaleToUnit(List)} method.
     * It tests the method with a list of numbers of size 8.
     */
    @Test
    void testRescaleToUnitSize8() {
        List<Double> numbers = new ArrayList<Double>();
        numbers.add(1.0);
        numbers.add(2.0);
        numbers.add(3.0);
        numbers.add(4.0);
        numbers.add(5.0);
        numbers.add(6.0);
        numbers.add(7.0);
        numbers.add(8.0);
        List<Double> result = RescaleToUnit.rescaleToUnit(numbers);
        assertEquals(8, result.size());
        assertEquals(0.0, result.get(0));
        assertEquals(0.125, result.get(1));
        assertEquals(0.25, result.get(2));
        assertEquals(0.375, result.get(3));
        assertEquals(0.5, result.get(4));
        assertEquals(0.625, result.get(5));
        assertEquals(0.75, result.get(6));
        assertEquals(1.0, result.get(7));
    }

    /**
     * Test case for the {@link RescaleToUnit#rescaleToUnit(List)} method.
     * It tests the method with a list of numbers of size 9.
     */
    @Test
    void testRescaleToUnitSize9() {
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
        List<Double> result = RescaleToUnit.rescaleToUnit(numbers);
        assertEquals(9, result.size());
        assertEquals(0.0, result.get(0));
        assertEquals(0.1111111111111111, result.get(1));
        assertEquals(0.2222222222222222, result.get(2));
        assertEquals(0.3333333333333333, result.get(3));
        assertEquals(0.4444444444444444, result.get(4));
        assertEquals(0.5555555555555556, result.get(5));
        assertEquals(0.6666666666666666, result.get(6));
        assertEquals(0.7777777777777778, result.get(7));
        assertEquals(1.0, result.get(8));
    }

    /**
     * Test case for the {@link Res