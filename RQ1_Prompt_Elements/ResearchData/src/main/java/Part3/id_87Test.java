package Part3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
class GetRowTest {
    @Test
    public void testGetRow() {
        List<Object> lst = new ArrayList<Object>();
        List<Object> row1 = new ArrayList<Object>();
        row1.add(1);
        row1.add(2);
        row1.add(3);
        row1.add(4);
        row1.add(5);
        row1.add(6);
        List<Object> row2 = new ArrayList<Object>();
        row2.add(1);
        row2.add(2);
        row2.add(3);
        row2.add(4);
        row2.add(1);
        row2.add(6);
        List<Object> row3 = new ArrayList<Object>();
        row3.add(1);
        row3.add(2);
        row3.add(3);
        row3.add(4);
        row3.add(5);
        row3.add(1);
        lst.add(row1);
        lst.add(row2);
        lst.add(row3);
        List<Object> result = new ArrayList<Object>();
        List<Object> coordinate1 = new ArrayList<Object>();
        coordinate1.add(0);
        coordinate1.add(0);
        List<Object> coordinate2 = new ArrayList<Object>();
        coordinate2.add(1);
        coordinate2.add(4);
        List<Object> coordinate3 = new ArrayList<Object>();
        coordinate3.add(1);
        coordinate3.add(0);
        List<Object> coordinate4 = new ArrayList<Object>();
        coordinate4.add(2);
        coordinate4.add(5);
        List<Object> coordinate5 = new ArrayList<Object>();
        coordinate5.add(2);
        coordinate5.add(0);
        result.add(coordinate1);
        result.add(coordinate2);
        result.add(coordinate3);
        result.add(coordinate4);
        result.add(coordinate5);
        assertEquals(result, GetRow.getRow(lst, 1));
    }
}