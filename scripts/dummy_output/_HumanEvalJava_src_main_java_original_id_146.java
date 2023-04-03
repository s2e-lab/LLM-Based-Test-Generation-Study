// SpecialfilterTest.java
package original;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Specialfilter}.
* It contains ten unit test cases for the {@link Specialfilter#specialfilter(List)} method.
*/
class SpecialfilterTest {
    @Test
    void testEmptyList() {
        List<Integer> nums = Arrays.asList();
        int expected = 0;
        int actual = Specialfilter.specialfilter(nums);
        assertEquals(expected, actual);
    }

    @Test
    void testSingleElementList() {
        List<Integer> nums = Arrays.asList(1);
        int expected = 0;
        int actual = Specialfilter.specialfilter(nums);
        assertEquals(expected, actual);
    }

    @Test
    void testNoSpecialElements() {
        List<Integer> nums = Arrays.asList(5, -2, 1, -5);
        int expected = 0;
        int actual = Specialfilter.specialfilter(nums);
        assertEquals(expected, actual);
    }

    @Test
    void testOneSpecialElement() {
        List<Integer> nums = Arrays.asList(15, -73, 14, -15);
        int expected = 1;
        int actual = Specialfilter.specialfilter(nums);
        assertEquals(expected, actual);
    }

    @Test
    void testTwoSpecialElements() {
        List<Integer> nums = Arrays.asList(33, -2, -3, 45, 21, 109);
        int expected = 2;
        int actual = Specialfilter.specialfilter(nums);
        assertEquals(expected, actual);
    }

    @Test
    void testFourSpecialElements() {
        List<Integer> nums = Arrays.asList(43, -12, 93, 125, 121, 109);
        int expected = 4;
        int actual = Specialfilter.specialfilter(nums);
        assertEquals(expected, actual);
    }

    @Test
    void testThreeSpecialElements() {
        List<Integer> nums = Arrays.asList(71, -2, -33, 75, 21, 19);
        int expected = 3;
        int actual = Specialfilter.specialfilter(nums);
        assertEquals(expected, actual);
    }

    @Test
    void testAllSpecialElements() {
        List<Integer> nums = Arrays.asList(135, -73, 145, -157);
        int expected = 4;
        int actual = Specialfilter.specialfilter(nums);
        assertEquals(expected, actual);
    }

    @Test
    void testAllElementsGreaterThan10() {
        List<Integer> nums = Arrays.asList(11, 12, 13, 14, 15);
        int expected = 0;
        int actual = Specialfilter.specialfilter(nums);
        assertEquals(expected, actual);
    }

    @Test
    void testAllElementsSpecial() {
        List<Integer> nums = Arrays.asList(135, -73, 145, -157, 135, -73, 145, -157);
        int expected = 8;
        int actual = Specialfilter.specialfilter(nums);
        assertEquals(expected, actual);
    }
}