package Part3;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
class FindClosestElementsTest {
    @Test
    void testFindClosestElements() {
        List<Double> numbers = new ArrayList<Double>();
        numbers.add(1.0);
        numbers.add(2.0);
        numbers.add(3.9);
        numbers.add(4.0);
        numbers.add(5.0);
        numbers.add(2.2);
        List<Double> result = FindClosestElements.findClosestElements(numbers);
        assertEquals(3.9, result.get(0));
        assertEquals(4.0, result.get(1));

        numbers.clear();
        numbers.add(1.0);
        numbers.add(2.0);
        numbers.add(5.9);
        numbers.add(4.0);
        numbers.add(5.0);
        result = FindClosestElements.findClosestElements(numbers);
        assertEquals(5.0, result.get(0));
        assertEquals(5.9, result.get(1));

        numbers.clear();
        numbers.add(1.0);
        numbers.add(2.0);
        numbers.add(3.0);
        numbers.add(4.0);
        numbers.add(5.0);
        numbers.add(2.2);
        result = FindClosestElements.findClosestElements(numbers);
        assertEquals(2.0, result.get(0));
        assertEquals(2.2, result.get(1));

        numbers.clear();
        numbers.add(1.0);
        numbers.add(2.0);
        numbers.add(3.0);
        numbers.add(4.0);
        numbers.add(5.0);
        numbers.add(2.0);
        result = FindClosestElements.findClosestElements(numbers);
        assertEquals(2.0, result.get(0));
        assertEquals(2.0, result.get(1));

        numbers.clear();
        numbers.add(1.1);
        numbers.add(2.2);
        numbers.add(3.1);
        numbers.add(4.1);
        numbers.add(5.1);
        result = FindClosestElements.findClosestElements(numbers);
        assertEquals(2.2, result.get(0));
        assertEquals(3.1, result.get(1));
    }
}