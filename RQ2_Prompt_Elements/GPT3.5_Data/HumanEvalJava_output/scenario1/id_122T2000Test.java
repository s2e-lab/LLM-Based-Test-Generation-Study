Here's the code for the AddElementsTest class:

```
package scenario1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AddElementsTest {

    @Test
    void testAddElementsWithEmptyList() {
        List<Integer> arr = new ArrayList<>();
        int k = 0;
        int expected = 0;
        int actual = AddElements.addElements(arr, k);
        assertEquals(expected, actual);
    }

    @Test
    void testAddElementsWithKGreaterThanListSize() {
        List<Integer> arr = Arrays.asList(1, 2, 3);
        int k = 4;
        int expected = 6;
        int actual = AddElements.addElements(arr, k);
        assertEquals(expected, actual);
    }

    @Test
    void testAddElementsWithAllElementsGreaterThan100() {
        List<Integer> arr = Arrays.asList(200, 300, 400);
        int k = 3;
        int expected = 0;
        int actual = AddElements.addElements(arr, k);
        assertEquals(expected, actual);
    }

    @Test
    void testAddElementsWithSomeElementsGreaterThan100() {
        List<Integer> arr = Arrays.asList(50, 200, 300);
        int k = 3;
        int expected = 50;
        int actual = AddElements.addElements(arr, k);
        assertEquals(expected, actual);
    }

    @Test
    void testAddElementsWithAllElementsLessThan100() {
        List<Integer> arr = Arrays.asList(50, 60, 70);
        int k = 3;
        int expected = 180;
        int actual = AddElements.addElements(arr, k);
        assertEquals(expected, actual);
    }

    @Test
    void testAddElementsWithSomeElementsLessThan100() {
        List<Integer> arr = Arrays.asList(50, 60, 200);
        int k = 3;
        int expected = 110;
        int actual = AddElements.addElements(arr, k);
        assertEquals(expected, actual);
    }

    @Test
    void testAddElementsWithKEqualToListSize() {
        List<Integer> arr = Arrays.asList(50, 60, 70);
        int k = 3;
        int expected = 180;
        int actual = AddElements.addElements(arr, k);
        assertEquals(expected, actual);
    }

    @Test
    void testAddElementsWithKLessThanListSize() {
        List<Integer> arr = Arrays.asList(50, 60, 70, 80, 90);
        int k = 3;
        int expected = 180;
        int actual = AddElements.addElements(arr, k);
        assertEquals(expected, actual);
    }

    @Test
    void testAddElementsWithKEqualToZero() {
        List<Integer> arr = Arrays.asList(50, 60, 70);
        int k = 0;
        int expected = 0;
        int actual = AddElements.addElements(arr, k);
        assertEquals(expected, actual);
    }

    @Test
    void testAddElementsWithNegativeK() {
        List<Integer> arr = Arrays.asList(50, 60, 70);
        int k = -1;
        assertThrows(IndexOutOfBoundsException.class, () -> AddElements.addElements(arr, k));
    }
}
```

This test class contains ten unit test cases for the `AddElements.addElements(List<Integer>, int)` method. Each test case tests a different scenario, such as an empty list, a list with all elements greater than 100, a list with some elements less than 100, etc. The `assertEquals()` method is used to compare the expected result with the actual result. The `assertThrows()` method is used to test for an exception being thrown when the value of `k` is negative.