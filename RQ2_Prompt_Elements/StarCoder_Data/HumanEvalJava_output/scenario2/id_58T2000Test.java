// CommonTest.java
package scenario2;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Common}.
* It contains ten unit test cases for the {@link Common#common(List, List)} method.
*/
class CommonTest {

    /**
     * Test case for the {@link Common#common(List, List)} method.
     */
    @Test
    void testCommon() {
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);
        l1.add(9);
        l1.add(10);
        List<Object> l2 = new ArrayList<Object>();
        l2.add(1);
        l2.add(2);
        l2.add(3);
        l2.add(4);
        l2.add(5);
        l2.add(6);
        l2.add(7);
        l2.add(8);
        l2.add(9);
        l2.add(10);
        l2.add("a");
        l2.add("b");
        l2.add("c");
        l2.add("d");
        l2.add("e");
        l2.add("f");
        l2.add("g");
        l2.add("h");
        l2.add("i");
        l2.add("j");
        l2.add("k");
        l2.add("l");
        l2.add("m");
        l2.add("n");
        l2.add("o");
        l2.add("p");
        l2.add("q");
        l2.add("r");
        l2.add("s");
        l2.add("t");
        l2.add("u");
        l2.add("v");
        l2.add("w");
        l2.add("x");
        l2.add("y");
        l2.add("z");
        List<Object> result = Common.common(l1, l2);
        assertEquals(10, result.size());
        assertEquals(1, result.get(0));
        assertEquals(2, result.get(1));
        assertEquals(3, result.get(2));
        assertEquals(4, result.get(3));
        assertEquals(5, result.get(4));
        assertEquals(6, result.get(5));
        assertEquals(7, result.get(6));
        assertEquals(8, result.get(7));
        assertEquals(9, result.get(8));
        assertEquals(10, result.get(9));
    }
}
