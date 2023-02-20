package scenario3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
class Part3Test {
    @Test
    public void testByLength() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(2);
        arr.add(1);
        arr.add(1);
        arr.add(4);
        arr.add(5);
        arr.add(8);
        arr.add(2);
        arr.add(3);
        List<Object> result = new ArrayList<Object>();
        result.add("Eight");
        result.add("Five");
        result.add("Four");
        result.add("Three");
        result.add("Two");
        result.add("Two");
        result.add("One");
        result.add("One");
        assertEquals(result, ByLength.byLength(arr));
    }

    @Test
    public void testByLengthEmpty() {
        List<Object> arr = new ArrayList<Object>();
        List<Object> result = new ArrayList<Object>();
        assertEquals(result, ByLength.byLength(arr));
    }

    @Test
    public void testByLengthStrange() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(1);
        arr.add(-1);
        arr.add(55);
        List<Object> result = new ArrayList<Object>();
        result.add("One");
        assertEquals(result, ByLength.byLength(arr));
    }

    @Test
    public void testByLengthStrange2() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(1);
        arr.add(-1);
        arr.add(3);
        arr.add(2);
        List<Object> result = new ArrayList<Object>();
        result.add("Three");
        result.add("Two");
        result.add("One");
        assertEquals(result, ByLength.byLength(arr));
    }

    @Test
    public void testByLengthNine() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(9);
        arr.add(4);
        arr.add(8);
        List<Object> result = new ArrayList<Object>();
        result.add("Nine");
        result.add("Eight");
        result.add("Four");
        assertEquals(result, ByLength.byLength(arr));
    }
}