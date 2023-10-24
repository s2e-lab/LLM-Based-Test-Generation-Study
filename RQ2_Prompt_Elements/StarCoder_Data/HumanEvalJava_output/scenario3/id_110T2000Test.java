// ExchangeTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Exchange}.
* It contains ten unit test cases for the {@link Exchange#exchange(List, List)} method.
*/
class ExchangeTest {

    /**
     * Test case for {@link Exchange#exchange(List, List)}.
     * It tests the first example in the problem description.
     */
    @Test
    void testExchange1() {
        List<Integer> lst1 = List.of(1, 2, 3, 4);
        List<Integer> lst2 = List.of(1, 2, 3, 4);
        assertEquals("YES", Exchange.exchange(lst1, lst2));
    }

    /**
     * Test case for {@link Exchange#exchange(List, List)}.
     * It tests the second example in the problem description.
     */
    @Test
    void testExchange2() {
        List<Integer> lst1 = List.of(1, 2, 3, 4);
        List<Integer> lst2 = List.of(1, 5, 3, 4);
        assertEquals("NO", Exchange.exchange(lst1, lst2));
    }

    /**
     * Test case for {@link Exchange#exchange(List, List)}.
     * It tests the third example in the problem description.
     */
    @Test
    void testExchange3() {
        List<Integer> lst1 = List.of(1, 2, 3, 4);
        List<Integer> lst2 = List.of(2, 1, 4, 3);
        assertEquals("YES", Exchange.exchange(lst1, lst2));
    }

    /**
     * Test case for {@link Exchange#exchange(List, List)}.
     * It tests the fourth example in the problem description.
     */
    @Test
    void testExchange4() {
        List<Integer> lst1 = List.of(5, 7, 3);
        List<Integer> lst2 = List.of(2, 6, 4);
        assertEquals("YES", Exchange.exchange(lst1, lst2));
    }

    /**
     * Test case for {@link Exchange#exchange(List, List)}.
     * It tests the fifth example in the problem description.
     */
    @Test
    void testExchange5() {
        List<Integer> lst1 = List.of(5, 7, 3);
        List<Integer> lst2 = List.of(2, 6, 3);
        assertEquals("NO", Exchange.exchange(lst1, lst2));
    }

    /**
     * Test case for {@link Exchange#exchange(List, List)}.
     * It tests the sixth example in the problem description.
     */
    @Test
    void testExchange6() {
        List<Integer> lst1 = List.of(3, 2, 6, 1, 8, 9);
        List<Integer> lst2 = List.of(3, 5, 5, 1, 1, 1);
        assertEquals("NO", Exchange.exchange(lst1, lst2));
    }

    /**
     * Test case for {@link Exchange#exchange(List, List)}.
     * It tests the seventh example in the problem description.
     */
    @Test
    void testExchange7() {
        List<Integer> lst1 = List.of(100, 200);
        List<Integer> lst2 = List.of(200, 200);
        assertEquals("YES", Exchange.exchange(lst1, lst2));
    }

    /**
     * Test case for {@link Exchange#exchange(List, List)}.
     * It tests the eighth example in the problem description.
     */
    @Test
    void testExchange8() {
        List<Integer> lst1 = List.of(100, 200);
        List<Integer> lst2 = List.of(200, 200, 200);
        assertEquals("NO", Exchange.exchange(lst1, lst2));
    }

    /**
     * Test case for {@link Exchange#exchange(List, List)}.
     * It tests the ninth example in the problem description.
     */
    @Test
    void testExchange9() {
        List<Integer> lst1 = List.of(100, 200, 300);
        List<Integer> lst2 = List.of(200, 200, 200);
        assertEquals("NO", Exchange.exchange(lst1, lst2));
    }

    /**
     * Test case for {@link Exchange#exchange(List, List)}.
     * It tests the tenth example in the problem description.
     */
    @Test
    void testExchange10() {
        List<Integer> lst1 = List.of(100, 200, 300);
        List<Integer> lst2 = List.of(200, 200, 200, 200);
        assertEquals("NO", Exchange.exchange(lst1, lst2));
    }
}
