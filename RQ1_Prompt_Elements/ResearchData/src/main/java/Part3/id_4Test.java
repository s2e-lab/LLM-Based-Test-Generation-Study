package Part3;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
class MeanAbsoluteDeviationTest {
    @Test
    void testMeanAbsoluteDeviation() {
        List<Double> numbers = new ArrayList<>();
        numbers.add(1.0);
        numbers.add(2.0);
        numbers.add(3.0);
        assertEquals(0.6666666666666666, MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers));
        numbers.add(4.0);
        assertEquals(1.0, MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers));
        numbers.add(5.0);
        assertEquals(1.2, MeanAbsoluteDeviation.meanAbsoluteDeviation(numbers));
    }
}