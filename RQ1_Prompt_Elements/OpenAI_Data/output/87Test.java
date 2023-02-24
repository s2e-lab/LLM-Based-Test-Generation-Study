// GetRowTest.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests of {@link GetRow}.
 * It contains ten test cases for the {@link scenario1.GetRow#compare()} method.
 */
class GetRowTest {
		


    @Test
    void testGetRow() {
        List<Object> lst = new ArrayList<Object>();
        List<Object> row1 = new ArrayList<Object>();
        row1.add(1);
        row1.add(2);
        row1.add(3);
        List<Object> row2 = new ArrayList<Object>();
        row2.add(4);
        row2.add(5);
        row2.add(6);
        List<Object> row3 = new ArrayList<Object>();
        row3.add(7);
        row3.add(8);
        row3.add(9);
        lst.add(row1);
        lst.add(row2);
        lst.add(row3);
        List<Object> result = GetRow.getRow(lst, 5);
        List<Object> expected = new ArrayList<Object>();
        List<Object> coordinate1 = new ArrayList<Object>();
        coordinate1.add(1);
        coordinate1.add(1);
        List<Object> coordinate2 = new ArrayList<Object>();
        coordinate2.add(2);
        coordinate2.add(1);
        expected.add(coordinate1);
        expected.add(coordinate2);
        assertEquals(expected, result);
    }
}