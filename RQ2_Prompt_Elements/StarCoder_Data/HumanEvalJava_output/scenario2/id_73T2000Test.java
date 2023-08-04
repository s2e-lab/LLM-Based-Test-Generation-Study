// SmallestChangeTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SmallestChange}.
* It contains ten unit test cases for the {@link SmallestChange#smallestChange(List)} method.
*/
class SmallestChangeTest {

    /**
    * Test case for the {@link SmallestChange#smallestChange(List)} method.
    * Tests that the method returns 0 when the array is already palindromic.
    */
    @Test
    void testSmallestChange0() {
        List<Integer> arr = List.of(1, 2, 3, 3, 2, 1);
        assertEquals(0, SmallestChange.smallestChange(arr));
    }

    /**
    * Test case for the {@link SmallestChange#smallestChange(List)} method.
    * Tests that the method returns 1 when the array is not palindromic.
    */
    @Test
    void testSmallestChange1() {
        List<Integer> arr = List.of(1, 2, 3, 4, 5, 6);
        assertEquals(1, SmallestChange.smallestChange(arr));
    }

    /**
    * Test case for the {@link SmallestChange#smallestChange(List)} method.
    * Tests that the method returns 2 when the array is not palindromic.
    */
    @Test
    void testSmallestChange2() {
        List<Integer> arr = List.of(1, 2, 3, 4, 5, 6, 7);
        assertEquals(2, SmallestChange.smallestChange(arr));
    }

    /**
    * Test case for the {@link SmallestChange#smallestChange(List)} method.
    * Tests that the method returns 3 when the array is not palindromic.
    */
    @Test
    void testSmallestChange3() {
        List<Integer> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        assertEquals(3, SmallestChange.smallestChange(arr));
    }

    /**
    * Test case for the {@link SmallestChange#smallestChange(List)} method.
    * Tests that the method returns 4 when the array is not palindromic.
    */
    @Test
    void testSmallestChange4() {
        List<Integer> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        assertEquals(4, SmallestChange.smallestChange(arr));
    }

    /**
    * Test case for the {@link SmallestChange#smallestChange(List)} method.
    * Tests that the method returns 5 when the array is not palindromic.
    */
    @Test
    void testSmallestChange5() {
        List<Integer> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertEquals(5, SmallestChange.smallestChange(arr));
    }

    /**
    * Test case for the {@link SmallestChange#smallestChange(List)} method.
    * Tests that the method returns 6 when the array is not palindromic.
    */
    @Test
    void testSmallestChange6() {
        List<Integer> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        assertEquals(6, SmallestChange.smallestChange(arr));
    }

    /**
    * Test case for the {@link SmallestChange#smallestChange(List)} method.
    * Tests that the method returns 7 when the array is not palindromic.
    */
    @Test
    void testSmallestChange7() {
        List<Integer> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        assertEquals(7, SmallestChange.smallestChange(arr));
    }

    /**
    * Test case for the {@link SmallestChange#smallestChange(List)} method.
    * Tests that the method returns 8 when the array is not palindromic.
    */
    @Test
    void testSmallestChange8() {
        List<Integer> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13);
        assertEquals(8, SmallestChange.smallestChange(arr));
    }

    /**
    * Test case for the {@link SmallestChange#smallestChange(List)} method.
    * Tests that the method returns 9 when the array is not palindromic.
    */
    @Test
    void testSmallestChange9() {
        List<Integer> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14);
        assertEquals(9, SmallestChange.smallestChange(arr));
    }
}
