// SmallestChangeTest.java
package updated;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SmallestChange}.
* It contains ten unit test cases for the {@link SmallestChange#smallestChange(List)} method.
*/
class SmallestChangeTest {

    @Test
    void smallestChange_shouldReturn4_whenGivenList12354796() {
        List<Integer> arr = Arrays.asList(1, 2, 3, 5, 4, 7, 9, 6);
        int expected = 4;
        int actual = SmallestChange.smallestChange(arr);
        assertEquals(expected, actual);
    }

    @Test
    void smallestChange_shouldReturn1_whenGivenList1234332() {
        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 3, 2, 2);
        int expected = 1;
        int actual = SmallestChange.smallestChange(arr);
        assertEquals(expected, actual);
    }

    @Test
    void smallestChange_shouldReturn0_whenGivenList12321() {
        List<Integer> arr = Arrays.asList(1, 2, 3, 2, 1);
        int expected = 0;
        int actual = SmallestChange.smallestChange(arr);
        assertEquals(expected, actual);
    }

    @Test
    void smallestChange_shouldReturn0_whenGivenList3113() {
        List<Integer> arr = Arrays.asList(3, 1, 1, 3);
        int expected = 0;
        int actual = SmallestChange.smallestChange(arr);
        assertEquals(expected, actual);
    }

    @Test
    void smallestChange_shouldReturn0_whenGivenList1() {
        List<Integer> arr = Arrays.asList(1);
        int expected = 0;
        int actual = SmallestChange.smallestChange(arr);
        assertEquals(expected, actual);
    }

    @Test
    void smallestChange_shouldReturn1_whenGivenList12() {
        List<Integer> arr = Arrays.asList(0, 1);
        int expected = 1;
        int actual = SmallestChange.smallestChange(arr);
        assertEquals(expected, actual);
    }

    @Test
    void smallestChange_shouldReturn1_whenGivenList142() {
        List<Integer> arr = Arrays.asList(1, 4, 2);
        int expected = 1;
        int actual = SmallestChange.smallestChange(arr);
        assertEquals(expected, actual);
    }

    @Test
    void smallestChange_shouldReturn1_whenGivenList1442() {
        List<Integer> arr = Arrays.asList(1, 4, 4, 2);
        int expected = 1;
        int actual = SmallestChange.smallestChange(arr);
        assertEquals(expected, actual);
    }

    @Test
    void smallestChange_shouldReturn0_whenGivenListEmpty() {
        List<Integer> arr = Arrays.asList();
        int expected = 0;
        int actual = SmallestChange.smallestChange(arr);
        assertEquals(expected, actual);
    }

    @Test
    void smallestChange_shouldReturn0_whenGivenListNull() {
        List<Integer> arr = null;
        int expected = 0;
        int actual = SmallestChange.smallestChange(arr);
        assertEquals(expected, actual);
    }
}