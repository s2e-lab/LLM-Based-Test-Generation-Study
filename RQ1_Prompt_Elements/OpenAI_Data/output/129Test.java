// MinpathTest.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
* Unit tests of {@link Minpath}.
* It contains ten test cases for the {@link Minpath#minpath()} method.
*/
class MinpathTest {

    @Test
    void testMinpath() {
        List<List<Integer>> grid = new ArrayList<>();
        List<Integer> row1 = new ArrayList<>();
        row1.add(1);
        row1.add(1);
        row1.add(1);
        row1.add(1);
        List<Integer> row2 = new ArrayList<>();
        row2.add(1);
        row2.add(1);
        row2.add(1);
        row2.add(1);
        List<Integer> row3 = new ArrayList<>();
        row3.add(1);
        row3.add(1);
        row3.add(1);
        row3.add(1);
        List<Integer> row4 = new ArrayList<>();
        row4.add(1);
        row4.add(1);
        row4.add(1);
        row4.add(1);
        grid.add(row1);
        grid.add(row2);
        grid.add(row3);
        grid.add(row4);
        List<Integer> ans = new ArrayList<>();
        ans.add(1);
        ans.add(1);
        ans.add(1);
        ans.add(1);
        ans.add(1);
        ans.add(1);
        ans.add(1);
        ans.add(1);
        ans.add(1);
        ans.add(1);
        assertEquals(ans, Minpath.minpath(grid, 10));
    }
}