// CanArrangeTest.java
package original;


import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CanArrange}.
* It contains ten unit test cases for the {@link CanArrange#canArrange(List)} method.
*/
class CanArrangeTest {

    @Test
    void testCanArrange1() {
        List<Integer> arr = Arrays.asList(1, 2, 4, 3, 5);
        int expected = 3;
        int actual = CanArrange.canArrange(arr);
        assertEquals(expected, actual);
    }

    @Test
    void testCanArrange2() {
        List<Integer> arr = Arrays.asList(1, 2, 3);
        int expected = -1;
        int actual = CanArrange.canArrange(arr);
        assertEquals(expected, actual);
    }

    @Test
    void testCanArrange3() {
        List<Integer> arr = Arrays.asList(1, 2, 4, 5);
        int expected = -1;
        int actual = CanArrange.canArrange(arr);
        assertEquals(expected, actual);
    }

    @Test
    void testCanArrange4() {
        List<Integer> arr = Arrays.asList(1, 4, 2, 5, 6, 7, 8, 9, 10);
        int expected = 2;
        int actual = CanArrange.canArrange(arr);
        assertEquals(expected, actual);
    }

    @Test
    void testCanArrange5() {
        List<Integer> arr = Arrays.asList(4, 8, 5, 7, 3);
        int expected = 4;
        int actual = CanArrange.canArrange(arr);
        assertEquals(expected, actual);
    }

    @Test
    void testCanArrange6() {
        List<Integer> arr = Arrays.asList();
        int expected = -1;
        int actual = CanArrange.canArrange(arr);
        assertEquals(expected, actual);
    }

    @Test
    void testCanArrange7() {
        List<Integer> arr = Arrays.asList(1);
        int expected = -1;
        int actual = CanArrange.canArrange(arr);
        assertEquals(expected, actual);
    }

    @Test
    void testCanArrange8() {
        List<Integer> arr = Arrays.asList(1, 2);
        int expected = -1;
        int actual = CanArrange.canArrange(arr);
        assertEquals(expected, actual);
    }

    @Test
    void testCanArrange9() {
        List<Integer> arr = Arrays.asList(2, 1);
        int expected = 0;
        int actual = CanArrange.canArrange(arr);
        assertEquals(expected, actual);
    }

    @Test
    void testCanArrange10() {
        List<Integer> arr = Arrays.asList(1, 2, 3, 2, 1);
        int expected = 3;
        int actual = CanArrange.canArrange(arr);
        assertEquals(expected, actual);
    }
}