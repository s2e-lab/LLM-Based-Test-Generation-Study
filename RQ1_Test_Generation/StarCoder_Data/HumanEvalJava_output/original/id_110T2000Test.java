// ExchangeTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Exchange}.
* It contains ten unit test cases for the {@link Exchange#exchange(List, List)} method.
*/
class ExchangeTest {

    /**
    * Test case number: 1
    * Test case values: ([1, 2, 3, 4], [1, 2, 3, 4])
    * Expected output (Post-state): "YES"
    */
    @Test
    void test1() {
        List<Integer> lst1 = List.of(1, 2, 3, 4);
        List<Integer> lst2 = List.of(1, 2, 3, 4);
        String expected = "YES";
        String actual = Exchange.exchange(lst1, lst2);
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 2
    * Test case values: ([1, 2, 3, 4], [1, 5, 3, 4])
    * Expected output (Post-state): "NO"
    */
    @Test
    void test2() {
        List<Integer> lst1 = List.of(1, 2, 3, 4);
        List<Integer> lst2 = List.of(1, 5, 3, 4);
        String expected = "NO";
        String actual = Exchange.exchange(lst1, lst2);
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 3
    * Test case values: ([1, 2, 3, 4], [2, 1, 4, 3])
    * Expected output (Post-state): "YES"
    */
    @Test
    void test3() {
        List<Integer> lst1 = List.of(1, 2, 3, 4);
        List<Integer> lst2 = List.of(2, 1, 4, 3);
        String expected = "YES";
        String actual = Exchange.exchange(lst1, lst2);
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 4
    * Test case values: ([5, 7, 3], [2, 6, 4])
    * Expected output (Post-state): "YES"
    */
    @Test
    void test4() {
        List<Integer> lst1 = List.of(5, 7, 3);
        List<Integer> lst2 = List.of(2, 6, 4);
        String expected = "YES";
        String actual = Exchange.exchange(lst1, lst2);
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 5
    * Test case values: ([5, 7, 3], [2, 6, 3])
    * Expected output (Post-state): "NO"
    */
    @Test
    void test5() {
        List<Integer> lst1 = List.of(5, 7, 3);
        List<Integer> lst2 = List.of(2, 6, 3);
        String expected = "NO";
        String actual = Exchange.exchange(lst1, lst2);
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 6
    * Test case values: ([3, 2, 6, 1, 8, 9], [3, 5, 5, 1, 1, 1])
    * Expected output (Post-state): "NO"
    */
    @Test
    void test6() {
        List<Integer> lst1 = List.of(3, 2, 6, 1, 8, 9);
        List<Integer> lst2 = List.of(3, 5, 5, 1, 1, 1);
        String expected = "NO";
        String actual = Exchange.exchange(lst1, lst2);
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 7
    * Test case values: ([100, 200], [200, 200])
    * Expected output (Post-state): "YES"
    */
    @Test
    void test7() {
        List<Integer> lst1 = List.of(100, 200);
        List<Integer> lst2 = List.of(200, 200);
        String expected = "YES";
        String actual = Exchange.exchange(lst1, lst2);
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 8
    * Test case values: ([100, 200], [200, 200, 200])
    * Expected output (Post-state): "NO"
    */
    @Test
    void test8() {
        List<Integer> lst1 = List.of(100, 200);
        List<Integer> lst2 = List.of(200, 200, 200);
        String expected = "NO";
        String actual = Exchange.exchange(lst1, lst2);
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 9
    * Test case values: ([100, 200, 300], [200, 200, 200])
    * Expected output (Post-state): "NO"
    */
    @Test
    void test9() {
        List<Integer> lst1 = List.of(100, 200, 300);
        List<Integer> lst2 = List.of(200, 200, 200);
        String expected = "NO";
        String actual = Exchange.exchange(lst1, lst2);
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 10
    * Test case values: ([100, 200, 300], [200, 200, 200, 200])
    * Expected output (Post-state): "NO"
    */
    @Test
    void test10() {
        List<Integer> lst1 = List.of(100, 200, 300);
        List<Integer> lst2 = List.of(200, 200, 200, 200);
        String expected = "NO";
        String actual = Exchange.exchange(lst1, lst2);
        assertEquals(expected, actual);
    }
}
