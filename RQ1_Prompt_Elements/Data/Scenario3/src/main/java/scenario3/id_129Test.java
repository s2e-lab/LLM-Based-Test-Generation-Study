package scenario3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
class MinpathTest {
    @Test
    public void testMinpath() {
        List<List<Integer>> grid = new ArrayList<>();
        List<Integer> row1 = new ArrayList<>();
        row1.add(1);
        row1.add(2);
        row1.add(3);
        List<Integer> row2 = new ArrayList<>();
        row2.add(4);
        row2.add(5);
        row2.add(6);
        List<Integer> row3 = new ArrayList<>();
        row3.add(7);
        row3.add(8);
        row3.add(9);
        grid.add(row1);
        grid.add(row2);
        grid.add(row3);
        List<Integer> ans = new ArrayList<>();
        ans.add(1);
        ans.add(2);
        ans.add(1);
        assertEquals(ans, Minpath.minpath(grid, 3));
    }

    @Test
    public void testMinpath2() {
        List<List<Integer>> grid = new ArrayList<>();
        List<Integer> row1 = new ArrayList<>();
        row1.add(5);
        row1.add(9);
        row1.add(3);
        List<Integer> row2 = new ArrayList<>();
        row2.add(4);
        row2.add(1);
        row2.add(6);
        List<Integer> row3 = new ArrayList<>();
        row3.add(7);
        row3.add(8);
        row3.add(2);
        grid.add(row1);
        grid.add(row2);
        grid.add(row3);
        List<Integer> ans = new ArrayList<>();
        ans.add(1);
        assertEquals(ans, Minpath.minpath(grid, 1));
    }

    @Test
    public void testMinpath3() {
        List<List<Integer>> grid = new ArrayList<>();
        List<Integer> row1 = new ArrayList<>();
        row1.add(1);
        row1.add(2);
        row1.add(3);
        row1.add(4);
        List<Integer> row2 = new ArrayList<>();
        row2.add(5);
        row2.add(6);
        row2.add(7);
        row2.add(8);
        List<Integer> row3 = new ArrayList<>();
        row3.add(9);
        row3.add(10);
        row3.add(11);
        row3.add(12);
        List<Integer> row4 = new ArrayList<>();
        row4.add(13);
        row4.add(14);
        row4.add(15);
        row4.add(16);
        grid.add(row1);
        grid.add(row2);
        grid.add(row3);
        grid.add(row4);
        List<Integer> ans = new ArrayList<>();
        ans.add(1);
        ans.add(2);
        ans.add(1);
        ans.add(2);
        assertEquals(ans, Minpath.minpath(grid, 4));
    }

    @Test
    public void testMinpath4() {
        List<List<Integer>> grid = new ArrayList<>();
        List<Integer> row1 = new ArrayList<>();
        row1.add(6);
        row1.add(4);
        row1.add(13);
        row1.add(10);
        List<Integer> row2 = new ArrayList<>();
        row2.add(5);
        row2.add(7);
        row2.add(12);
        row2.add(1);
        List<Integer> row3 = new ArrayList<>();
        row3.add(3);
        row3.add(16);
        row3.add(11);
        row3.add(15);
        List<Integer> row4 = new ArrayList<>();
        row4.add(8);
        row4.add(14);
        row4.add(9);
        row4.add(2);
        grid.add(row1);
        grid.add(row2);
        grid.add(row3);
        grid.add(row4);
        List<Integer> ans = new ArrayList<>();
        ans.add(1);
        ans.add(10);
        ans.add(1);
        ans.add(10);
        ans.add(1);
        ans.add(10);
        ans.add(1);
        assertEquals(ans, Minpath.minpath(grid, 7));
    }

    @Test
    public void testMinpath5() {
        List<List<Integer>> grid = new ArrayList<>();
        List<Integer> row1 = new ArrayList<>();
        row1.add(8);
        row1.add(14);
        row1.add(9);
        row1.add(2);
        List<Integer> row2 = new ArrayList<>();
        row2.add(6);
        row2.add(4);
        row2.add(13);
        row2.add(15);
        List<Integer> row3 = new ArrayList<>();
        row3.add(5);
        row3.add(7);
        row3.add(1);
        row3.add(12);
        List<Integer> row4 = new ArrayList<>();
        row4.add(3);
        row4.add(10);
        row4.add(11);
        row4.add(16);
        grid.add(row1);
        grid.add(row2);
        grid.add(row3);
        grid.add(row4);
        List<Integer> ans = new ArrayList<>();
        ans.add(1);
        ans.add(7);
        ans.add(1);
        ans.add(7);
        ans.add(1);
        assertEquals(ans, Minpath.minpath(grid, 5));
    }

    @Test
    public void testMinpath6() {
        List<List<Integer>> grid = new ArrayList<>();
        List<Integer> row1 = new ArrayList<>();
        row1.add(11);
        row1.add(8);
        row1.add(7);
        row1.add(2);
        List<Integer> row2 = new ArrayList<>();
        row2.add(5);
        row2.add(16);
        row2.add(14);
        row2.add(4);
        List<Integer> row3 = new ArrayList<>();
        row3.add(9);
        row3.add(3);
        row3.add(15);
        row3.add(6);
        List<Integer> row4 = new ArrayList<>();
        row4.add(12);
        row4.add(13);
        row4.add(10);
        row4.add(1);
        grid.add(row1);
        grid.add(row2);
        grid.add(row3);
        grid.add(row4);
        List<Integer> ans = new ArrayList<>();
        ans.add(1);
        ans.add(6);
        ans.add(1);
        ans.add(6);
        ans.add(1);
        ans.add(6);
        ans.add(1);
        ans.add(6);
        ans.add(1);
        assertEquals(ans, Minpath.minpath(grid, 9));
    }

    @Test
    public void testMinpath7() {
        List<List<Integer>> grid = new ArrayList<>();
        List<Integer> row1 = new ArrayList<>();
        row1.add(12);
        row1.add(13);
        row1.add(10);
        row1.add(1);
        List<Integer> row2 = new ArrayList<>();
        row2.add(9);
        row2.add(3);
        row2.add(15);
        row2.add(6);
        List<Integer> row3 = new ArrayList<>();
        row3.add(5);
        row3.add(16);
        row3.add(14);
        row3.add(4);
        List<Integer> row4 = new ArrayList<>();
        row4.add(11);
        row4.add(8);
        row4.add(7);
        row4.add(2);
        grid.add(row1);
        grid.add(row2);
        grid.add(row3);
        grid.add(row4);
        List<Integer> ans = new ArrayList<>();
        ans.add(1);
        ans.add(6);
        ans.add(1);
        ans.add(6);
        ans.add(1);
        ans.add(6);
        ans.add(1);
        ans.add(6);
        ans.add(1);
        ans.add(6);
        ans.add(1);
        ans.add(6);
        assertEquals(ans, Minpath.minpath(grid, 12));
    }

    @Test
    public void testMinpath8() {
        List<List<Integer>> grid = new ArrayList<>();
        List<Integer> row1 = new ArrayList<>();
        row1.add(2);
        row1.add(7);
        row1.add(4);
        List<Integer> row2 = new ArrayList<>();
        row2.add(3);
        row2.add(1);
        row2.add(5);
        List<Integer> row3 = new ArrayList<>();
        row3.add(6);
        row3.add(8);
        row3.add(9);
        grid.add(row1);
        grid.add(row2);
        grid.add(row3);
        List<Integer> ans = new ArrayList<>();
        ans.add(1);
        ans.add(3);
        ans.add(1);
        ans.add(3);
        ans.add(1);
        ans.add(3);
        ans.add(1);
        ans.add(3);
        assertEquals(ans, Minpath.minpath(grid, 8));
    }

    @Test
    public void testMinpath9() {
        List<List<Integer>> grid = new ArrayList<>();
        List<Integer> row1 = new ArrayList<>();
        row1.add(6);
        row1.add(1);
        row1.add(5);
        List<Integer> row2 = new ArrayList<>();
        row2.add(3);
        row2.add(8);
        row2.add(9);
        List<Integer> row3 = new ArrayList<>();
        row3.add(2);
        row3.add(7);
        row3.add(4);
        grid.add(row1);
        grid.add(row2);
        grid.add(row3);
        List<Integer> ans = new ArrayList<>();
        ans.add(1);
        ans.add(5);
        ans.add(1);
        ans.add(5);
        ans.add(1);
        ans.add(5);
        ans.add(1);
        ans.add(5);
        assertEquals(ans, Minpath.minpath(grid, 8));
    }

    @Test
    public void testMinpath10() {
        List<List<Integer>> grid = new ArrayList<>();
        List<Integer> row1 = new ArrayList<>();
        row1.add(1);
        row1.add(2);
        List<Integer> row2 = new ArrayList<>();
        row2.add(3);
        row2.add(4);
        grid.add(row1);
        grid.add(row2);
        List<Integer> ans = new ArrayList<>();
        ans.add(1);
        ans.add(2);
        ans.add(1);
        ans.add(2);
        ans.add(1);
        ans.add(2);
        ans.add(1);
        ans.add(2);
        ans.add(1);
        ans.add(2);
        assertEquals(ans, Minpath.minpath(grid, 10));
    }
}