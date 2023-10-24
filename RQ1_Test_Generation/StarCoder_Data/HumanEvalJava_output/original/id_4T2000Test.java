// MeanAbsoluteDeviationTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MeanAbsoluteDeviation}.
* It contains ten unit test cases for the {@link MeanAbsoluteDeviation#meanAbsoluteDeviation(List)} method.
*/
class MeanAbsoluteDeviationTest {

    /**
     * Test case for the {@link MeanAbsoluteDeviation#meanAbsoluteDeviation(List)} method.
     * It tests the method with an empty list.
     */
    @Test
    void testMeanAbsoluteDeviationWithEmptyList() {
        List<Double> numbers = List.of();
        assertEquals(0.0, MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers));
    }

    /**
     * Test case for the {@link MeanAbsoluteDeviation#meanAbsoluteDeviation(List)} method.
     * It tests the method with a list of one element.
     */
    @Test
    void testMeanAbsoluteDeviationWithOneElement() {
        List<Double> numbers = List.of(1.0);
        assertEquals(0.0, MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers));
    }

    /**
     * Test case for the {@link MeanAbsoluteDeviation#meanAbsoluteDeviation(List)} method.
     * It tests the method with a list of two elements.
     */
    @Test
    void testMeanAbsoluteDeviationWithTwoElements() {
        List<Double> numbers = List.of(1.0, 2.0);
        assertEquals(0.5, MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers));
    }

    /**
     * Test case for the {@link MeanAbsoluteDeviation#meanAbsoluteDeviation(List)} method.
     * It tests the method with a list of three elements.
     */
    @Test
    void testMeanAbsoluteDeviationWithThreeElements() {
        List<Double> numbers = List.of(1.0, 2.0, 3.0);
        assertEquals(0.6666666666666666, MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers));
    }

    /**
     * Test case for the {@link MeanAbsoluteDeviation#meanAbsoluteDeviation(List)} method.
     * It tests the method with a list of four elements.
     */
    @Test
    void testMeanAbsoluteDeviationWithFourElements() {
        List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0);
        assertEquals(1.0, MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers));
    }

    /**
     * Test case for the {@link MeanAbsoluteDeviation#meanAbsoluteDeviation(List)} method.
     * It tests the method with a list of five elements.
     */
    @Test
    void testMeanAbsoluteDeviationWithFiveElements() {
        List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
        assertEquals(1.2, MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers));
    }
}
