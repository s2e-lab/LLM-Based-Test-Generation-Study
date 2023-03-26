Here's the code for the test class:

```
package scenario2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link GenerateIntegers}.
 * It contains ten unit test cases for the {@link GenerateIntegers#generateIntegers(int, int)} method.
 */
class GenerateIntegersTest {

    @Test
    void testGenerateIntegersWithEqualEvenNumbers() {
        List<Object> expected = new ArrayList<>(Arrays.asList(2, 4, 6, 8));
        List<Object> actual = GenerateIntegers.generateIntegers(2, 8);
        assertEquals(expected, actual);
    }

    @Test
    void testGenerateIntegersWithEqualOddNumbers() {
        List<Object> expected = new ArrayList<>();
        List<Object> actual = GenerateIntegers.generateIntegers(1, 7);
        assertEquals(expected, actual);
    }

    @Test
    void testGenerateIntegersWithAscendingEvenNumbers() {
        List<Object> expected = new ArrayList<>(Arrays.asList(2, 4, 6, 8));
        List<Object> actual = GenerateIntegers.generateIntegers(2, 10);
        assertEquals(expected, actual);
    }

    @Test
    void testGenerateIntegersWithDescendingEvenNumbers() {
        List<Object> expected = new ArrayList<>(Arrays.asList(2, 4, 6, 8));
        List<Object> actual = GenerateIntegers.generateIntegers(10, 2);
        assertEquals(expected, actual);
    }

    @Test
    void testGenerateIntegersWithAscendingOddNumbers() {
        List<Object> expected = new ArrayList<>(Arrays.asList(4, 6));
        List<Object> actual = GenerateIntegers.generateIntegers(3, 7);
        assertEquals(expected, actual);
    }

    @Test
    void testGenerateIntegersWithDescendingOddNumbers() {
        List<Object> expected = new ArrayList<>(Arrays.asList(4, 6));
        List<Object> actual = GenerateIntegers.generateIntegers(7, 3);
        assertEquals(expected, actual);
    }

    @Test
    void testGenerateIntegersWithOneEvenNumber() {
        List<Object> expected = new ArrayList<>(Arrays.asList(2));
        List<Object> actual = GenerateIntegers.generateIntegers(2, 3);
        assertEquals(expected, actual);
    }

    @Test
    void testGenerateIntegersWithOneOddNumber() {
        List<Object> expected = new ArrayList<>();
        List<Object> actual = GenerateIntegers.generateIntegers(3, 4);
        assertEquals(expected, actual);
    }

    @Test
    void testGenerateIntegersWithEqualNumbersOutOfRange() {
        List<Object> expected = new ArrayList<>();
        List<Object> actual = GenerateIntegers.generateIntegers(10, 20);
        assertEquals(expected, actual);
    }

    @Test
    void testGenerateIntegersWithAscendingNumbersOutOfRange() {
        List<Object> expected = new ArrayList<>();
        List<Object> actual = GenerateIntegers.generateIntegers(10, 30);
        assertEquals(expected, actual);
    }
}
```