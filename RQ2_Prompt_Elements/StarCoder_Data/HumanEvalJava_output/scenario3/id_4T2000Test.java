// MeanAbsoluteDeviationTest.java
package scenario3;

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
     * It tests the case when the input list is empty.
     */
    @Test
    void testMeanAbsoluteDeviationEmptyList() {
        List<Double> numbers = List.of();
        assertEquals(0.0, MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers));
    }

    /**
     * Test case for the {@link MeanAbsoluteDeviation#meanAbsoluteDeviation(List)} method.
     * It tests the case when the input list contains only one element.
     */
    @Test
    void testMeanAbsoluteDeviationSingleElementList() {
        List<Double> numbers = List.of(1.0);
        assertEquals(0.0, MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers));
    }

    /**
     * Test case for the {@link MeanAbsoluteDeviation#meanAbsoluteDeviation(List)} method.
     * It tests the case when the input list contains two elements.
     */
    @Test
    void testMeanAbsoluteDeviationTwoElementList() {
        List<Double> numbers = List.of(1.0, 2.0);
        assertEquals(0.5, MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers));
    }

    /**
     * Test case for the {@link MeanAbsoluteDeviation#meanAbsoluteDeviation(List)} method.
     * It tests the case when the input list contains three elements.
     */
    @Test
    void testMeanAbsoluteDeviationThreeElementList() {
        List<Double> numbers = List.of(1.0, 2.0, 3.0);
        assertEquals(0.6666666666666666, MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers));
    }

    /**
     * Test case for the {@link MeanAbsoluteDeviation#meanAbsoluteDeviation(List)} method.
     * It tests the case when the input list contains four elements.
     */
    @Test
    void testMeanAbsoluteDeviationFourElementList() {
        List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0);
        assertEquals(1.0, MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers));
    }

    /**
     * Test case for the {@link MeanAbsoluteDeviation#meanAbsoluteDeviation(List)} method.
     * It tests the case when the input list contains five elements.
     */
    @Test
    void testMeanAbsoluteDeviationFiveElementList() {
        List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
        assertEquals(1.2, MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers));
    }
}
