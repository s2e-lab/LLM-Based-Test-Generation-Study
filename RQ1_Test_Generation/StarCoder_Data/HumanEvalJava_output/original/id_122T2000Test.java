// AddElementsTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AddElements}.
* It contains ten unit test cases for the {@link AddElements#addElements(List, int)} method.
*/
class AddElementsTest {

    /**
    * Test case number: 1
    * Test case values: [1, -2, -3, 41, 57, 76, 87, 88, 99], 3
    * Expected output (Post-state): -4
    */
    @Test
    void test1() {
        List<Integer> arr = List.of(1, -2, -3, 41, 57, 76, 87, 88, 99);
        int k = 3;
        int expected = -4;
        int output = AddElements.addElements(arr, k);
        assertEquals(expected, output);
    }

    /**
    * Test case number: 2
    * Test case values: [111, 121, 3, 4000, 5, 6], 2
    * Expected output (Post-state): 0
    */
    @Test
    void test2() {
        List<Integer> arr = List.of(111, 121, 3, 4000, 5, 6);
        int k = 2;
        int expected = 0;
        int output = AddElements.addElements(arr, k);
        assertEquals(expected, output);
    }

    /**
    * Test case number: 3
    * Test case values: [11, 21, 3, 90, 5, 6, 7, 8, 9], 4
    * Expected output (Post-state): 125
    */
    @Test
    void test3() {
        List<Integer> arr = List.of(11, 21, 3, 90, 5, 6, 7, 8, 9);
        int k = 4;
        int expected = 125;
        int output = AddElements.addElements(arr, k);
        assertEquals(expected, output);
    }

    /**
    * Test case number: 4
    * Test case values: [111, 21, 3, 4000, 5, 6, 7, 8, 9], 4
    * Expected output (Post-state): 24
    */
    @Test
    void test4() {
        List<Integer> arr = List.of(111, 21, 3, 4000, 5, 6, 7, 8, 9);
        int k = 4;
        int expected = 24;
        int output = AddElements.addElements(arr, k);
        assertEquals(expected, output);
    }

    /**
    * Test case number: 5
    * Test case values: [1], 1
    * Expected output (Post-state): 1
    */
    @Test
    void test5() {
        List<Integer> arr = List.of(1);
        int k = 1;
        int expected = 1;
        int output = AddElements.addElements(arr, k);
        assertEquals(expected, output);
    }

    /**
    * Test case number: 6
    * Test case values: [1, 2, 3, 4, 5, 6, 7, 8, 9], 9
    * Expected output (Post-state): 45
    */
    @Test
    void test6() {
        List<Integer> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int k = 9;
        int expected = 45;
        int output = AddElements.addElements(arr, k);
        assertEquals(expected, output);
    }

    /**
    * Test case number: 7
    * Test case values: [1, 2, 3, 4, 5, 6, 7, 8, 9], 10
    * Expected output (Post-state): 45
    */
    @Test
    void test7() {
        List<Integer> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int k = 10;
        int expected = 45;
        int output = AddElements.addElements(arr, k);
        assertEquals(expected, output);
    }

    /**
    * Test case number: 8
    * Test case values: [1, 2, 3, 4, 5, 6, 7, 8, 9], 11
    * Expected output (Post-state): 45
    */
    @Test
    void test8() {
        List<Integer> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int k = 11;
        int expected = 45;
        int output = AddElements.addElements(arr, k);
        assertEquals(expected, output);
    }

    /**
    * Test case number: 9
    * Test case values: [1, 2, 3, 4, 5, 6, 7, 8, 9], 12
    * Expected output (Post-state): 45
    */
    @Test
    void test9() {
        List<Integer> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int k = 12;
        int expected = 45;
        int output = AddElements.addElements(arr, k);
        assertEquals(expected, output);
    }

    /**
    * Test case number: 10
    * Test case values: [1, 2, 3, 4, 5, 6, 7, 8, 9], 13
    * Expected output (Post-state): 45
    */
    @Test
    void test10() {
        List<Integer> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int k = 13;
        int expected = 45;
        int output = AddElements.addElements(arr, k);
        assertEquals(expected, output);
    }
}
