// RescaleToUnitTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RescaleToUnit}.
* It contains ten unit test cases for the {@link RescaleToUnit#rescaleToUnit(List)} method.
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
        numbers.add(6.0);
        numbers.add(7.0);
        numbers.add(8.0);
        numbers.add(9.0);
        numbers.add(10.0);
        List<Double> result = RescaleToUnit.rescaleToUnit(numbers);
        assertEquals(1.0, result.get(0));
        assertEquals(0.5, result.get(1));
        assertEquals(0.0, result.get(2));
        assertEquals(0.5, result.get(3));
        assertEquals(1.0, result.get(4));
        assertEquals(1.0, result.get(5));
        assertEquals(0.5, result.get(6));
        assertEquals(0.0, result.get(7));
        assertEquals(0.0, result.get(8));
        assertEquals(0.5, result.get(9));
    }
}
