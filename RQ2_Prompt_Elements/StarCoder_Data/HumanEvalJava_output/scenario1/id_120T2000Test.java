// Maximum1Test.java
package scenario1;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Maximum1}.
* It contains ten unit test cases for the {@link Maximum1#maximum(List, int)} method.
*/
class Maximum1Test {

    /**
    * Test case for {@link Maximum1#maximum(List, int)}.
    */
    @Test
    void testMaximum() {
        List<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        arr.add(10);
        List<Object> res = Maximum1.maximum(arr, 3);
        assertEquals(3, res.size());
        assertEquals(10, res.get(0));
        assertEquals(9, res.get(1));
        assertEquals(8, res.get(2));
    }

    /**
    * Test case for {@link Maximum1#maximum(List, int)}.
    */
    @Test
    void testMaximum2() {
        List<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        arr.add(10);
        List<Object> res = Maximum1.maximum(arr, 5);
        assertEquals(5, res.size());
        assertEquals(10, res.get(0));
        assertEquals(9, res.get(1));
        assertEquals(8, res.get(2));
        assertEquals(7, res.get(3));
        assertEquals(6, res.get(4));
    }

    /**
    * Test case for {@link Maximum1#maximum(List, int)}.
    */
    @Test
    void testMaximum3() {
        List<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        arr.add(10);
        List<Object> res = Maximum1.maximum(arr, 10);
        assertEquals(10, res.size());
        assertEquals(10, res.get(0));
        assertEquals(9, res.get(1));
        assertEquals(8, res.get(2));
        assertEquals(7, res.get(3));
        assertEquals(6, res.get(4));
        assertEquals(5, res.get(5));
        assertEquals(4, res.get(6));
        assertEquals(3, res.get(7));
        assertEquals(2, res.get(8));
        assertEquals(1, res.get(9));
    }

    /**
    * Test case for {@link Maximum1#maximum(List, int)}.
    */
    @Test
    void testMaximum4() {
        List<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        arr.add(10);
        List<Object> res = Maximum1.maximum(arr, 1);
        assertEquals(1, res.size());
        assertEquals(10, res.get(0));
    }

    /**
    * Test case for {@link Maximum1#maximum(List, int)}.
    */
    @Test
    void testMaximum5() {
        List<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        arr.add(10);
        List<Object> res = Maximum1.maximum(arr, 0);
        assertEquals(0, res.size());
    }

    /**
    * Test case for {@link Maximum1#maximum(List, int)}.
    */
    @Test
    void testMaximum6() {
        List<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        arr.add(10);
        List<Object> res = Maximum1.maximum(arr, 11);
        assertEquals(10, res.size());
        assertEquals(10, res.get(0));
        assertEquals(9, res.get(1));
        assertEquals(8, res.get(2));
        assertEquals(7, res.get(3));
        assertEquals(6, res.get(4));
        assertEquals(5, res.get(5));
        assertEquals(4, res.get(6));
        assertEquals(3, res.get(7));
        assertEquals(2, res.get(8));
        assertEquals(1, res.get(9));
    }

    /**
    * Test case for {@link Maximum1#maximum(List, int)}.
    */
    @Test
    void testMaximum7() {
        List<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        arr.add(10);
        List<Object> res = Maximum1.maximum(arr, 2);
        assertEquals(2, res.size());
        assertEquals(10, res.get(0));
        assertEquals(9, res.get(1));
    }

    /**
    * Test case for {@link Maximum1#maximum(List, int)}.
    */
    @Test
    void testMaximum8() {
        List<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        arr.add(10);
        List<Object> res = Maximum1.maximum(arr, 4);
        assertEquals(4, res.size());
        assertEquals(10, res.get(0));
        assertEquals(9, res.get(1));
        assertEquals(8, res.get(2));
        assertEquals(7, res.get(3));
    }

    /**
    * Test case for {@link Maximum1#maximum(List, int)}.
    */
    @Test
    void testMaximum9() {
        List<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        arr.add(10);
        List<Object> res = Maximum1.maximum(arr, 6);
        assertEquals(6, res.size());
        assertEquals(10, res.get(0));
        assertEquals(9, res.get(1));
        assertEquals(8, res.get(2));
        assertEquals(7, res.get(3));
        assertEquals(6, res.get(4));
        assertEquals(5, res.get(5));
    }

    /**
    * Test case for {@link Maximum1#maximum(List, int)}.
    */
    @Test
    void testMaximum10() {
        List<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        arr.add(10);
        List<Object> res = Maximum1.maximum(arr, 8);
        assertEquals(8, res.size());
        assertEquals(10, res.get(0));
        assertEquals(9, res.get(1));
        assertEquals(8, res.get(2));
        assertEquals(7, res.get(3));
        assertEquals(6, res.get(4));
        assertEquals(5, res.get(5));
        assertEquals(4, res.get(6));
        assertEquals(3, res.get(7));
    }
}
