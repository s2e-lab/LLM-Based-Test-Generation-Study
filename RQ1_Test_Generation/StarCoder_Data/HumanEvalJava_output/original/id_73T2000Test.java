// SmallestChangeTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SmallestChange}.
* It contains ten unit test cases for the {@link SmallestChange#smallestChange(List)} method.
*/
class SmallestChangeTest {

    /**
    * Test case number: 1
    * Test case values: [1, 2, 3, 5, 4, 7, 9, 6]
    * Expected output (Post-state): 4
    */
    @Test
    void testSmallestChange1() {
        List<Integer> arr = List.of(1, 2, 3, 5, 4, 7, 9, 6);
        int expected = 4;
        int actual = SmallestChange.smallestChange(arr);
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 2
    * Test case values: [1, 2, 3, 4, 3, 2, 2]
    * Expected output (Post-state): 1
    */
    @Test
    void testSmallestChange2() {
        List<Integer> arr = List.of(1, 2, 3, 4, 3, 2, 2);
        int expected = 1;
        int actual = SmallestChange.smallestChange(arr);
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 3
    * Test case values: [1, 4, 2]
    * Expected output (Post-state): 1
    */
    @Test
    void testSmallestChange3() {
        List<Integer> arr = List.of(1, 4, 2);
        int expected = 1;
        int actual = SmallestChange.smallestChange(arr);
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 4
    * Test case values: [1, 4, 4, 2]
    * Expected output (Post-state): 1
    */
    @Test
    void testSmallestChange4() {
        List<Integer> arr = List.of(1, 4, 4, 2);
        int expected = 1;
        int actual = SmallestChange.smallestChange(arr);
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 5
    * Test case values: [1, 2, 3, 2, 1]
    * Expected output (Post-state): 0
    */
    @Test
    void testSmallestChange5() {
        List<Integer> arr = List.of(1, 2, 3, 2, 1);
        int expected = 0;
        int actual = SmallestChange.smallestChange(arr);
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 6
    * Test case values: [3, 1, 1, 3]
    * Expected output (Post-state): 0
    */
    @Test
    void testSmallestChange6() {
        List<Integer> arr = List.of(3, 1, 1, 3);
        int expected = 0;
        int actual = SmallestChange.smallestChange(arr);
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 7
    * Test case values: [1]
    * Expected output (Post-state): 0
    */
    @Test
    void testSmallestChange7() {
        List<Integer> arr = List.of(1);
        int expected = 0;
        int actual = SmallestChange.smallestChange(arr);
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 8
    * Test case values: [0, 1]
    * Expected output (Post-state): 1
    */
    @Test
    void testSmallestChange8() {
        List<Integer> arr = List.of(0, 1);
        int expected = 1;
        int actual = SmallestChange.smallestChange(arr);
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 9
    * Test case values: [1, 2, 3, 5, 4, 7, 9, 6]
    * Expected output (Post-state): 4
    */
    @Test
    void testSmallestChange9() {
        List<Integer> arr = List.of(1, 2, 3, 5, 4, 7, 9, 6);
        int expected = 4;
        int actual = SmallestChange.smallestChange(arr);
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 10
    * Test case values: [1, 2, 3, 4, 3, 2, 2]
    * Expected output (Post-state): 1
    */
    @Test
    void testSmallestChange10() {
        List<Integer> arr = List.of(1, 2, 3, 4, 3, 2, 2);
        int expected = 1;
        int actual = SmallestChange.smallestChange(arr);
        assertEquals(expected, actual);
    }
}
