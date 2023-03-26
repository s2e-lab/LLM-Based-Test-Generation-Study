Here's the source code for the MaxFillTest class:

```
package scenario1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaxFillTest {

    @Test
    void testMaxFillWithEmptyGrid() {
        List<List<Integer>> grid = new ArrayList<>();
        int capacity = 5;
        int expected = 0;
        int actual = MaxFill.maxFill(grid, capacity);
        assertEquals(expected, actual);
    }

    @Test
    void testMaxFillWithSingleRow() {
        List<List<Integer>> grid = new ArrayList<>();
        grid.add(Arrays.asList(3, 4, 2, 1));
        int capacity = 5;
        int expected = 2;
        int actual = MaxFill.maxFill(grid, capacity);
        assertEquals(expected, actual);
    }

    @Test
    void testMaxFillWithMultipleRows() {
        List<List<Integer>> grid = new ArrayList<>();
        grid.add(Arrays.asList(3, 4, 2, 1));
        grid.add(Arrays.asList(5, 2, 1, 3));
        grid.add(Arrays.asList(2, 3, 5, 4));
        int capacity = 5;
        int expected = 5;
        int actual = MaxFill.maxFill(grid, capacity);
        assertEquals(expected, actual);
    }

    @Test
    void testMaxFillWithCapacityGreaterThanSum() {
        List<List<Integer>> grid = new ArrayList<>();
        grid.add(Arrays.asList(3, 4, 2, 1));
        int capacity = 20;
        int expected = 1;
        int actual = MaxFill.maxFill(grid, capacity);
        assertEquals(expected, actual);
    }

    @Test
    void testMaxFillWithCapacityEqualToSum() {
        List<List<Integer>> grid = new ArrayList<>();
        grid.add(Arrays.asList(3, 4, 2, 1));
        int capacity = 10;
        int expected = 1;
        int actual = MaxFill.maxFill(grid, capacity);
        assertEquals(expected, actual);
    }

    @Test
    void testMaxFillWithCapacityLessThanSum() {
        List<List<Integer>> grid = new ArrayList<>();
        grid.add(Arrays.asList(3, 4, 2, 1));
        int capacity = 3;
        int expected = 4;
        int actual = MaxFill.maxFill(grid, capacity);
        assertEquals(expected, actual);
    }

    @Test
    void testMaxFillWithNegativeValues() {
        List<List<Integer>> grid = new ArrayList<>();
        grid.add(Arrays.asList(-3, 4, -2, 1));
        int capacity = 5;
        int expected = 2;
        int actual = MaxFill.maxFill(grid, capacity);
        assertEquals(expected, actual);
    }

    @Test
    void testMaxFillWithZeroCapacity() {
        List<List<Integer>> grid = new ArrayList<>();
        grid.add(Arrays.asList(3, 4, 2, 1));
        int capacity = 0;
        assertThrows(ArithmeticException.class, () -> MaxFill.maxFill(grid, capacity));
    }

    @Test
    void testMaxFillWithNullGrid() {
        List<List<Integer>> grid = null;
        int capacity = 5;
        assertThrows(NullPointerException.class, () -> MaxFill.maxFill(grid, capacity));
    }

    @Test
    void testMaxFillWithNullRow() {
        List<List<Integer>> grid = new ArrayList<>();
        grid.add(Arrays.asList(3, 4, 2, 1));
        grid.add(null);
        int capacity = 5;
        assertThrows(NullPointerException.class, () -> MaxFill.maxFill(grid, capacity));
    }
}
```

This class contains ten unit test cases for the `maxFill` method of the `MaxFill` class. Each test case tests a different scenario, such as an empty grid, a single row, multiple rows, negative values, zero capacity, and null inputs. The `assertEquals` method is used to compare the expected result with the actual result returned by the `maxFill` method. The `assertThrows` method is used to test for exceptions thrown by the `maxFill` method.