// ExchangeTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Exchange}.
* It contains ten unit test cases for the {@link Exchange#exchange(List, List)} method.
*/
class ExchangeTest {

    /**
    * Test case for {@link Exchange#exchange(List, List)} where the first list is empty.
    */
    @Test
    void testExchange1() {
        List<Integer> lst1 = List.of();
        List<Integer> lst2 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertEquals("YES", Exchange.exchange(lst1, lst2));
    }

    /**
    * Test case for {@link Exchange#exchange(List, List)} where the second list is empty.
    */
    @Test
    void testExchange2() {
        List<Integer> lst1 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> lst2 = List.of();
        assertEquals("YES", Exchange.exchange(lst1, lst2));
    }

    /**
    * Test case for {@link Exchange#exchange(List, List)} where the first list is not empty and the second list is not empty.
    */
    @Test
    void testExchange3() {
        List<Integer> lst1 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> lst2 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertEquals("YES", Exchange.exchange(lst1, lst2));
    }

    /**
    * Test case for {@link Exchange#exchange(List, List)} where the first list is not empty and the second list is not empty.
    */
    @Test
    void testExchange4() {
        List<Integer> lst1 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> lst2 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertEquals("YES", Exchange.exchange(lst1, lst2));
    }

    /**
    * Test case for {@link Exchange#exchange(List, List)} where the first list is not empty and the second list is not empty.
    */
    @Test
    void testExchange5() {
        List<Integer> lst1 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> lst2 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertEquals("YES", Exchange.exchange(lst1, lst2));
    }

    /**
    * Test case for {@link Exchange#exchange(List, List)} where the first list is not empty and the second list is not empty.
    */
    @Test
    void testExchange6() {
        List<Integer> lst1 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> lst2 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertEquals("YES", Exchange.exchange(lst1, lst2));
    }

    /**
    * Test case for {@link Exchange#exchange(List, List)} where the first list is not empty and the second list is not empty.
    */
    @Test
    void testExchange7() {
        List<Integer> lst1 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> lst2 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertEquals("YES", Exchange.exchange(lst1, lst2));
    }

    /**
    * Test case for {@link Exchange#exchange(List, List)} where the first list is not empty and the second list is not empty.
    */
    @Test
    void testExchange8() {
        List<Integer> lst1 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> lst2 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertEquals("YES", Exchange.exchange(lst1, lst2));
    }

    /**
    * Test case for {@link Exchange#exchange(List, List)} where the first list is not empty and the second list is not empty.
    */
    @Test
    void testExchange9() {
        List<Integer> lst1 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> lst2 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertEquals("YES", Exchange.exchange(lst1, lst2));
    }

    /**
    * Test case for {@link Exchange#exchange(List, List)} where the first list is not empty and the second list is not empty.
    */
    @Test
    void testExchange10() {
        List<Integer> lst1 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> lst2 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertEquals("YES", Exchange.exchange(lst1, lst2));
    }
}
