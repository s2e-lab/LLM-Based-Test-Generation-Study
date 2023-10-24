// ExchangeTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Exchange}.
* It contains ten unit test cases for the {@link Exchange#exchange(List, List)} method.
*/
class ExchangeTest {

    /**
     * Test case for the {@link Exchange#exchange(List, List)} method.
     * It tests the case where the two lists are empty.
     */
    @Test
    void testExchange1() {
        List<Integer> lst1 = List.of();
        List<Integer> lst2 = List.of();
        assertEquals("YES", Exchange.exchange(lst1, lst2));
    }

    /**
     * Test case for the {@link Exchange#exchange(List, List)} method.
     * It tests the case where the two lists are not empty,
     * but they have different sizes.
     */
    @Test
    void testExchange2() {
        List<Integer> lst1 = List.of(1, 2, 3);
        List<Integer> lst2 = List.of(1, 2);
        assertEquals("NO", Exchange.exchange(lst1, lst2));
    }

    /**
     * Test case for the {@link Exchange#exchange(List, List)} method.
     * It tests the case where the two lists are not empty,
     * but they have different sizes.
     */
    @Test
    void testExchange3() {
        List<Integer> lst1 = List.of(1, 2, 3);
        List<Integer> lst2 = List.of(1, 2, 3, 4);
        assertEquals("NO", Exchange.exchange(lst1, lst2));
    }

    /**
     * Test case for the {@link Exchange#exchange(List, List)} method.
     * It tests the case where the two lists are not empty,
     * but they have different sizes.
     */
    @Test
    void testExchange4() {
        List<Integer> lst1 = List.of(1, 2, 3);
        List<Integer> lst2 = List.of(1, 2, 3, 4, 5);
        assertEquals("NO", Exchange.exchange(lst1, lst2));
    }

    /**
     * Test case for the {@link Exchange#exchange(List, List)} method.
     * It tests the case where the two lists are not empty,
     * but they have different sizes.
     */
    @Test
    void testExchange5() {
        List<Integer> lst1 = List.of(1, 2, 3);
        List<Integer> lst2 = List.of(1, 2, 3, 4, 5, 6);
        assertEquals("NO", Exchange.exchange(lst1, lst2));
    }

    /**
     * Test case for the {@link Exchange#exchange(List, List)} method.
     * It tests the case where the two lists are not empty,
     * but they have different sizes.
     */
    @Test
    void testExchange6() {
        List<Integer> lst1 = List.of(1, 2, 3);
        List<Integer> lst2 = List.of(1, 2, 3, 4, 5, 6, 7);
        assertEquals("NO", Exchange.exchange(lst1, lst2));
    }

    /**
     * Test case for the {@link Exchange#exchange(List, List)} method.
     * It tests the case where the two lists are not empty,
     * but they have different sizes.
     */
    @Test
    void testExchange7() {
        List<Integer> lst1 = List.of(1, 2, 3);
        List<Integer> lst2 = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        assertEquals("NO", Exchange.exchange(lst1, lst2));
    }

    /**
     * Test case for the {@link Exchange#exchange(List, List)} method.
     * It tests the case where the two lists are not empty,
     * but they have different sizes.
     */
    @Test
    void testExchange8() {
        List<Integer> lst1 = List.of(1, 2, 3);
        List<Integer> lst2 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        assertEquals("NO", Exchange.exchange(lst1, lst2));
    }

    /**
     * Test case for the {@link Exchange#exchange(List, List)} method.
     * It tests the case where the two lists are not empty,
     * but they have different sizes.
     */
    @Test
    void testExchange9() {
        List<Integer> lst1 = List.of(1, 2, 3);
        List<Integer> lst2 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertEquals("NO", Exchange.exchange(lst1, lst2));
    }

    /**
     * Test case for the {@link Exchange#exchange(List, List)} method.
     * It tests the case where the two lists are not empty,
     * but they have different sizes.
     */
    @Test
    void testExchange10() {
        List<Integer> lst1 = List.of(1, 2, 3);
        List<Integer> lst2 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        assertEquals("NO", Exchange.exchange(lst1, lst2));
    }

    /**
     * Test case for the {@link Exchange#exchange(List, List)} method.
     * It tests the case where the two lists are not empty,
     * but they have different sizes.
     */
    @Test
    void testExchange11() {
        List<Integer> lst1 = List.of(1, 2, 3);
        List<Integer> lst2 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        assertEquals("NO", Exchange.exchange(lst1, lst2));
    }

    /**
     * Test case for the {@link Exchange#exchange(List, List)} method.
     * It tests the case where the two lists are not empty,
     * but they have different sizes.
     */
    @Test
    void testExchange12() {
        List<Integer> lst1 = List.of(1, 2, 3);
        List<Integer> lst2 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13);
        assertEquals("NO", Exchange.exchange(lst1, lst2));
    }

    /**
     * Test case for the {@link Exchange#exchange(List, List)} method.
     * It tests the case where the two lists are not empty,
     * but they have different sizes.
     */
    @Test
    void testExchange13() {
        List<Integer> lst1 = List.of(1, 2, 3);
        List<Integer> lst2 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14);
        assertEquals("NO", Exchange.exchange(lst1, lst2));
    }

    /**
     * Test case for the {@link Exchange#exchange(List, List)} method.
     * It tests the case where the two lists are not empty,
     * but they have different sizes.
     */
    @Test
    void testExchange14() {
        List<Integer> lst1 = List.of(1, 2, 3);
        List<Integer> lst2 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        assertEquals("NO", Exchange.exchange(lst1, lst2));
    }

    /**
     * Test case for the {@link Exchange#exchange(List, List)} method.
     * It tests the case where the two lists are not empty,
     * but they have different sizes.
     */
    @Test
    void testExchange15() {
        List<Integer> lst1 = List.of(1, 2, 3);
        List<Integer> lst2 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
        assertEquals("NO", Exchange.exchange(lst1, lst2));
    }

    /**
     * Test case for the {@link Exchange#exchange(List, List)} method.
     * It tests the case where the two lists are not empty,
     * but they have different sizes.
     */
    @Test
    void testExchange16() {
       