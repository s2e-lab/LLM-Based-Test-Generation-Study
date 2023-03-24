// SpecialfilterTest.java
package original;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Specialfilter}.
* It contains ten unit test cases for the {@link Specialfilter#specialfilter(List)} method.
*/
class SpecialfilterTest {
    
    @Test
    void testEmptyList() {
        List<Object> nums = Arrays.asList();
        int result = Specialfilter.specialfilter(nums);
        assertEquals(0, result);
    }
    
    @Test
    void testSingleElementList() {
        List<Object> nums = Arrays.asList(1);
        int result = Specialfilter.specialfilter(nums);
        assertEquals(0, result);
    }
    
    @Test
    void testNoSpecialElements() {
        List<Object> nums = Arrays.asList(5, -2, 1, -5);
        int result = Specialfilter.specialfilter(nums);
        assertEquals(0, result);
    }
    
    @Test
    void testOneSpecialElement() {
        List<Object> nums = Arrays.asList(15, -73, 14, -15);
        int result = Specialfilter.specialfilter(nums);
        assertEquals(1, result);
    }
    
    @Test
    void testTwoSpecialElements() {
        List<Object> nums = Arrays.asList(33, -2, -3, 45, 21, 109);
        int result = Specialfilter.specialfilter(nums);
        assertEquals(2, result);
    }
    
    @Test
    void testAllSpecialElements() {
        List<Object> nums = Arrays.asList(43, -12, 93, 125, 121, 109);
        int result = Specialfilter.specialfilter(nums);
        assertEquals(4, result);
    }
    
    @Test
    void testSomeSpecialElements() {
        List<Object> nums = Arrays.asList(71, -2, -33, 75, 21, 19);
        int result = Specialfilter.specialfilter(nums);
        assertEquals(3, result);
    }
    
    @Test
    void testAllElementsGreaterThan10() {
        List<Object> nums = Arrays.asList(11, 12, 13, 14, 15);
        int result = Specialfilter.specialfilter(nums);
        assertEquals(0, result);
    }
    
    @Test
    void testAllElementsWithEvenFirstDigit() {
        List<Object> nums = Arrays.asList(22, 24, 26, 28, 20);
        int result = Specialfilter.specialfilter(nums);
        assertEquals(0, result);
    }
    
    @Test
    void testAllElementsWithEvenLastDigit() {
        List<Object> nums = Arrays.asList(31, 32, 33, 34, 36);
        int result = Specialfilter.specialfilter(nums);
        assertEquals(0, result);
    }
}