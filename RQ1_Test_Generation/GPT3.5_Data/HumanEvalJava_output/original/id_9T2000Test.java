// RollingMaxTest.java
package original;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RollingMax}.
* It contains ten unit test cases for the {@link RollingMax#rollingMax(List)} method.
*/
class RollingMaxTest {

    @Test
    void testRollingMaxWithValidInput() {
        List<Object> input = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 3, 4, 2));
        List<Object> expectedOutput = new ArrayList<>(Arrays.asList(1, 2, 3, 3, 3, 4, 4));
        assertEquals(expectedOutput, RollingMax.rollingMax(input));
    }

    @Test
    void testRollingMaxWithEmptyInput() {
        List<Object> input = new ArrayList<>();
        List<Object> expectedOutput = new ArrayList<>();
        assertEquals(expectedOutput, RollingMax.rollingMax(input));
    }

    @Test
    void testRollingMaxWithIncreasingInput() {
        List<Object> input = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Object> expectedOutput = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        assertEquals(expectedOutput, RollingMax.rollingMax(input));
    }

    @Test
    void testRollingMaxWithDecreasingInput() {
        List<Object> input = new ArrayList<>(Arrays.asList(4, 3, 2, 1));
        List<Object> expectedOutput = new ArrayList<>(Arrays.asList(4, 4, 4, 4));
        assertEquals(expectedOutput, RollingMax.rollingMax(input));
    }

    @Test
    void testRollingMaxWithMultipleMaxValues() {
        List<Object> input = new ArrayList<>(Arrays.asList(3, 2, 3, 100, 3));
        List<Object> expectedOutput = new ArrayList<>(Arrays.asList(3, 3, 3, 100, 100));
        assertEquals(expectedOutput, RollingMax.rollingMax(input));
    }

    @Test
    void testRollingMaxWithSingleValue() {
        List<Object> input = new ArrayList<>(Arrays.asList(5));
        List<Object> expectedOutput = new ArrayList<>(Arrays.asList(5));
        assertEquals(expectedOutput, RollingMax.rollingMax(input));
    }

    @Test
    void testRollingMaxWithNullInput() {
        assertThrows(NullPointerException.class, () -> RollingMax.rollingMax(null));
    }

    @Test
    void testRollingMaxWithInvalidInputType() {
        List<Object> input = new ArrayList<>(Arrays.asList(1, 2, "3", 4));
        assertThrows(IllegalArgumentException.class, () -> RollingMax.rollingMax(input));
    }

    @Test
    void testRollingMaxWithNegativeInput() {
        List<Object> input = new ArrayList<>(Arrays.asList(-1, -2, -3, -2, -3, -4, -2));
        List<Object> expectedOutput = new ArrayList<>(Arrays.asList(-1, -1, -1, -1, -1, -1, -1));
        assertEquals(expectedOutput, RollingMax.rollingMax(input));
    }

    @Test
    void testRollingMaxWithMixedInput() {
        List<Object> input = new ArrayList<>(Arrays.asList(1, -2, 3, -4, 5));
        List<Object> expectedOutput = new ArrayList<>(Arrays.asList(1, 1, 3, 3, 5));
        assertEquals(expectedOutput, RollingMax.rollingMax(input));
    }
}