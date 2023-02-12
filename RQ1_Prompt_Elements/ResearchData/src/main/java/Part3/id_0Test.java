package Part3;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
class HasCloseElementsTest {
    @Test
    void testHasCloseElements() {
        List<Double> numbers = new ArrayList<>(Arrays.asList(1.0, 2.0, 3.0));
        assertEquals(false, HasCloseElements.hasCloseElements(numbers, 0.5));
        numbers = new ArrayList<>(Arrays.asList(1.0, 2.8, 3.0, 4.0, 5.0, 2.0));
        assertEquals(true, HasCloseElements.hasCloseElements(numbers, 0.3));
        numbers = new ArrayList<>(Arrays.asList(1.0, 2.0, 3.9, 4.0, 5.0, 2.2));
        assertEquals(true, HasCloseElements.hasCloseElements(numbers, 0.3));
        numbers = new ArrayList<>(Arrays.asList(1.0, 2.0, 3.9, 4.0, 5.0, 2.2));
        assertEquals(false, HasCloseElements.hasCloseElements(numbers, 0.05));
        numbers = new ArrayList<>(Arrays.asList(1.0, 2.0, 5.9, 4.0, 5.0));
        assertEquals(true, HasCloseElements.hasCloseElements(numbers, 0.95));
        numbers = new ArrayList<>(Arrays.asList(1.0, 2.0, 5.9, 4.0, 5.0));
        assertEquals(false, HasCloseElements.hasCloseElements(numbers, 0.8));
        numbers = new ArrayList<>(Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 2.0));
        assertEquals(true, HasCloseElements.hasCloseElements(numbers, 0.1));
        numbers = new ArrayList<>(Arrays.asList(1.1, 2.2, 3.1, 4.1, 5.1));
        assertEquals(true, HasCloseElements.hasCloseElements(numbers, 1.0));
        numbers = new ArrayList<>(Arrays.asList(1.1, 2.2, 3.1, 4.1, 5.1));
        assertEquals(false, HasCloseElements.hasCloseElements(numbers, 0.5));
    }
}