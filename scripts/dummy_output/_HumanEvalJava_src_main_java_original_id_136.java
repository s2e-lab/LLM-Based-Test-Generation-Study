// LargestSmallestIntegersTest.java
package original;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LargestSmallestIntegers}.
* It contains ten unit test cases for the {@link LargestSmallestIntegers#largestSmallestIntegers(List)} method.
*/
class LargestSmallestIntegersTest {
    
    @Test
    void testLargestSmallestIntegers() {
        List<Integer> lst1 = Arrays.asList(2, 4, 1, 3, 5, 7);
        List<Integer> lst2 = new ArrayList<Integer>();
        List<Integer> lst3 = Arrays.asList(0);
        List<Integer> lst4 = Arrays.asList(1, 3, 2, 4, 5, 6, -2);
        List<Integer> lst5 = Arrays.asList(4, 5, 3, 6, 2, 7, -7);
        List<Integer> lst6 = Arrays.asList(7, 3, 8, 4, 9, 2, 5, -9);
        List<Integer> lst7 = new ArrayList<Integer>();
        List<Integer> lst8 = Arrays.asList(-1, -3, -5, -6);
        List<Integer> lst9 = Arrays.asList(-1, -3, -5, -6, 0);
        List<Integer> lst10 = Arrays.asList(-6, -4, -4, -3, 1);
        List<Integer> lst11 = Arrays.asList(-6, -4, -4, -3, -100, 1);
        
        assertEquals(Arrays.asList(null, 1), LargestSmallestIntegers.largestSmallestIntegers(lst1));
        assertEquals(Arrays.asList(null, null), LargestSmallestIntegers.largestSmallestIntegers(lst2));
        assertEquals(Arrays.asList(null, null), LargestSmallestIntegers.largestSmallestIntegers(lst3));
        assertEquals(Arrays.asList(-2, 1), LargestSmallestIntegers.largestSmallestIntegers(lst4));
        assertEquals(Arrays.asList(-7, 2), LargestSmallestIntegers.largestSmallestIntegers(lst5));
        assertEquals(Arrays.asList(-9, 2), LargestSmallestIntegers.largestSmallestIntegers(lst6));
        assertEquals(Arrays.asList(null, null), LargestSmallestIntegers.largestSmallestIntegers(lst7));
        assertEquals(Arrays.asList(-1, null), LargestSmallestIntegers.largestSmallestIntegers(lst8));
        assertEquals(Arrays.asList(-1, null), LargestSmallestIntegers.largestSmallestIntegers(lst9));
        assertEquals(Arrays.asList(-3, 1), LargestSmallestIntegers.largestSmallestIntegers(lst10));
        assertEquals(Arrays.asList(-3, 1), LargestSmallestIntegers.largestSmallestIntegers(lst11));
    }
}