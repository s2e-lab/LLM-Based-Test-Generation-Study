// OddCountTest.java
package original;


import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OddCount}.
* It contains ten unit test cases for the {@link OddCount#oddCount(List)} method.
*/
class OddCountTest {
    
    @Test
    void testOddCountWithOneString() {
        List<String> lst = new ArrayList<String>();
        lst.add("1234567");
        List<String> expected = new ArrayList<String>();
        expected.add("the number of odd elements 4 in the string 1 of the input.");
        assertEquals(expected, OddCount.oddCount(lst));
    }
    
    @Test
    void testOddCountWithTwoStrings() {
        List<String> lst = new ArrayList<String>();
        lst.add("3");
        lst.add("11111111");
        List<String> expected = new ArrayList<String>();
        expected.add("the number of odd elements 1 in the string 1 of the input.");
        expected.add("the number of odd elements 8 in the string 2 of the input.");
        assertEquals(expected, OddCount.oddCount(lst));
    }
    
    @Test
    void testOddCountWithThreeStrings() {
        List<String> lst = new ArrayList<String>();
        lst.add("271");
        lst.add("137");
        lst.add("314");
        List<String> expected = new ArrayList<String>();
        expected.add("the number of odd elements 2 in the string 1 of the input.");
        expected.add("the number of odd elements 3 in the string 2 of the input.");
        expected.add("the number of odd elements 2 in the string 3 of the input.");
        assertEquals(expected, OddCount.oddCount(lst));
    }
    
    @Test
    void testOddCountWithEmptyList() {
        List<String> lst = new ArrayList<String>();
        List<String> expected = new ArrayList<String>();
        assertEquals(expected, OddCount.oddCount(lst));
    }
    
    @Test
    void testOddCountWithNullList() {
        List<String> lst = null;
        assertThrows(NullPointerException.class, () -> {
            OddCount.oddCount(lst);
        });
    }
    
    @Test
    void testOddCountWithOneEvenNumber() {
        List<String> lst = new ArrayList<String>();
        lst.add("2468");
        List<String> expected = new ArrayList<String>();
        expected.add("the number of odd elements 0 in the string 1 of the input.");
        assertEquals(expected, OddCount.oddCount(lst));
    }
    
    @Test
    void testOddCountWithOneOddNumber() {
        List<String> lst = new ArrayList<String>();
        lst.add("13579");
        List<String> expected = new ArrayList<String>();
        expected.add("the number of odd elements 5 in the string 1 of the input.");
        assertEquals(expected, OddCount.oddCount(lst));
    }
    
    @Test
    void testOddCountWithMixedNumbers() {
        List<String> lst = new ArrayList<String>();
        lst.add("123456789");
        List<String> expected = new ArrayList<String>();
        expected.add("the number of odd elements 5 in the string 1 of the input.");
        assertEquals(expected, OddCount.oddCount(lst));
    }
    
    @Test
    void testOddCountWithLeadingZeros() {
        List<String> lst = new ArrayList<String>();
        lst.add("00123");
        List<String> expected = new ArrayList<String>();
        expected.add("the number of odd elements 2 in the string 1 of the input.");
        assertEquals(expected, OddCount.oddCount(lst));
    }
    
    @Test
    void testOddCountWithTrailingZeros() {
        List<String> lst = new ArrayList<String>();
        lst.add("12300");
        List<String> expected = new ArrayList<String>();
        expected.add("the number of odd elements 2 in the string 1 of the input.");
        assertEquals(expected, OddCount.oddCount(lst));
    }
}