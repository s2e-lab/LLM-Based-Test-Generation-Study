// SpecialfilterTest.java
package scenario3;

import java.util.List;
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
        List<Object> nums1 = List.of(15, -73, 14, -15);
        assertEquals(1, Specialfilter.specialfilter(nums1));
        List<Object> nums2 = List.of(33, -2, -3, 45, 21, 109);
        assertEquals(2, Specialfilter.specialfilter(nums2));
        List<Object> nums3 = List.of(43, -12, 93, 125, 121, 109);
        assertEquals(4, Specialfilter.specialfilter(nums3));
        List<Object> nums4 = List.of(71, -2, -33, 75, 21, 19);
        assertEquals(3, Specialfilter.specialfilter(nums4));
        List<Object> nums5 = List.of(1);
        assertEquals(0, Specialfilter.specialfilter(nums5));
        List<Object> nums6 = List.of();
        assertEquals(0, Specialfilter.specialfilter(nums6));
    }
}
