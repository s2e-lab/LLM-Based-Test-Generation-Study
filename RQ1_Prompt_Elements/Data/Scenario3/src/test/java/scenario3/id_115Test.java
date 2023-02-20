package scenario3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
class MaxFillTest {
    @Test
    public void testMaxFill() {
        List<List<Integer>> grid = new ArrayList<List<Integer>>();
        grid.add(Arrays.asList(0, 0, 1, 0));
        grid.add(Arrays.asList(0, 1, 0, 0));
        grid.add(Arrays.asList(1, 1, 1, 1));
        assertEquals(6, MaxFill.maxFill(grid, 1));

        grid = new ArrayList<List<Integer>>();
        grid.add(Arrays.asList(0, 0, 1, 1));
        grid.add(Arrays.asList(0, 0, 0, 0));
        grid.add(Arrays.asList(1, 1, 1, 1));
        grid.add(Arrays.asList(0, 1, 1, 1));
        assertEquals(5, MaxFill.maxFill(grid, 2));

        grid = new ArrayList<List<Integer>>();
        grid.add(Arrays.asList(0, 0, 0));
        grid.add(Arrays.asList(0, 0, 0));
        assertEquals(0, MaxFill.maxFill(grid, 5));

        grid = new ArrayList<List<Integer>>();
        grid.add(Arrays.asList(1, 1, 1, 1));
        grid.add(Arrays.asList(1, 1, 1, 1));
        assertEquals(4, MaxFill.maxFill(grid, 2));

        grid = new ArrayList<List<Integer>>();
        grid.add(Arrays.asList(1, 1, 1, 1));
        grid.add(Arrays.asList(1, 1, 1, 1));
        assertEquals(2, MaxFill.maxFill(grid, 9));
    }
}