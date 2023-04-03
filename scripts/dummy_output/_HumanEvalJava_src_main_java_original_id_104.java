// UniqueDigitsTest.java
package original;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link UniqueDigits}.
* It contains ten unit test cases for the {@link UniqueDigits#uniqueDigits(List)} method.
*/
class UniqueDigitsTest {
    
    @Test
    void testUniqueDigits() {
        List<Integer> input1 = Arrays.asList(15, 33, 1422, 1);
        List<Integer> expected1 = Arrays.asList(1, 15, 33);
        assertEquals(expected1, UniqueDigits.uniqueDigits(input1));
        
        List<Integer> input2 = Arrays.asList(152, 323, 1422, 10);
        List<Integer> expected2 = new ArrayList<Integer>();
        assertEquals(expected2, UniqueDigits.uniqueDigits(input2));
        
        List<Integer> input3 = Arrays.asList(12345, 2033, 111, 151);
        List<Integer> expected3 = Arrays.asList(111, 151);
        assertEquals(expected3, UniqueDigits.uniqueDigits(input3));
        
        List<Integer> input4 = Arrays.asList(135, 103, 31);
        List<Integer> expected4 = Arrays.asList(31, 135);
        assertEquals(expected4, UniqueDigits.uniqueDigits(input4));
        
        List<Integer> input5 = Arrays.asList(0, 2, 4, 6, 8);
        List<Integer> expected5 = new ArrayList<Integer>();
        assertEquals(expected5, UniqueDigits.uniqueDigits(input5));
        
        List<Integer> input6 = Arrays.asList(1, 3, 5, 7, 9);
        List<Integer> expected6 = Arrays.asList(1, 3, 5, 7, 9);
        assertEquals(expected6, UniqueDigits.uniqueDigits(input6));
        
        List<Integer> input7 = Arrays.asList(10, 20, 30, 40, 50);
        List<Integer> expected7 = new ArrayList<Integer>();
        assertEquals(expected7, UniqueDigits.uniqueDigits(input7));
        
        List<Integer> input8 = Arrays.asList(11, 22, 33, 44, 55);
        List<Integer> expected8 = Arrays.asList(11, 33, 55);
        assertEquals(expected8, UniqueDigits.uniqueDigits(input8));
        
        List<Integer> input9 = Arrays.asList(123, 456, 789);
        List<Integer> expected9 = new ArrayList<Integer>();
        assertEquals(expected9, UniqueDigits.uniqueDigits(input9));
        
        List<Integer> input10 = Arrays.asList(123, 456, 789, 101, 202, 303);
        List<Integer> expected10 = Arrays.asList(101, 303);
        assertEquals(expected10, UniqueDigits.uniqueDigits(input10));
    }
}