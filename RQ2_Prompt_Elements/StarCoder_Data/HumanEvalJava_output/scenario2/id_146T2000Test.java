// SpecialfilterTest.java
package scenario2;

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

    /**
     * Test case for {@link Specialfilter#specialfilter(List)}.
     */
    @Test
    void testSpecialfilter() {
        List<Object> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
        assertEquals(10, Specialfilter.specialfilter(nums));
    }

    /**
     * Test case for {@link Specialfilter#specialfilter(List)}.
     */
    @Test
    void testSpecialfilter2() {
        List<Object> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21);
        assertEquals(11, Specialfilter.specialfilter(nums));
    }

    /**
     * Test case for {@link Specialfilter#specialfilter(List)}.
     */
    @Test
    void testSpecialfilter3() {
        List<Object> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22);
        assertEquals(12, Specialfilter.specialfilter(nums));
    }

    /**
     * Test case for {@link Specialfilter#specialfilter(List)}.
     */
    @Test
    void testSpecialfilter4() {
        List<Object> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23);
        assertEquals(13, Specialfilter.specialfilter(nums));
    }

    /**
     * Test case for {@link Specialfilter#specialfilter(List)}.
     */
    @Test
    void testSpecialfilter5() {
        List<Object> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24);
        assertEquals(14, Specialfilter.specialfilter(nums));
    }

    /**
     * Test case for {@link Specialfilter#specialfilter(List)}.
     */
    @Test
    void testSpecialfilter6() {
        List<Object> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25);
        assertEquals(15, Specialfilter.specialfilter(nums));
    }

    /**
     * Test case for {@link Specialfilter#specialfilter(List)}.
     */
    @Test
    void testSpecialfilter7() {
        List<Object> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26);
        assertEquals(16, Specialfilter.specialfilter(nums));
    }

    /**
     * Test case for {@link Specialfilter#specialfilter(List)}.
     */
    @Test
    void testSpecialfilter8() {
        List<Object> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27);
        assertEquals(17, Specialfilter.specialfilter(nums));
    }

    /**
     * Test case for {@link Specialfilter#specialfilter(List)}.
     */
    @Test
    void testSpecialfilter9() {
        List<Object> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28);
        assertEquals(18, Specialfilter.specialfilter(nums));
    }

    /**
     * Test case for {@link Specialfilter#specialfilter(List)}.
     */
    @Test
    void testSpecialfilter10() {
        List<Object> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29);
        assertEquals(19, Specialfilter.specialfilter(nums));
    }
}
