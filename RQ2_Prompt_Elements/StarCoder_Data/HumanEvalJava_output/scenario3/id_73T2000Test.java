// SmallestChangeTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SmallestChange}.
* It contains ten unit test cases for the {@link SmallestChange#smallestChange(List)} method.
*/
class SmallestChangeTest {

    /**
    * Test case for {@link SmallestChange#smallestChange(List)}.
    * Tests that the method returns 4 for the given array.
    */
    @Test
    void testSmallestChange1() {
        List<Integer> arr = List.of(1, 2, 3, 5, 4, 7, 9, 6);
        assertEquals(4, SmallestChange.smallestChange(arr));
    }

    /**
    * Test case for {@link SmallestChange#smallestChange(List)}.
    * Tests that the method returns 1 for the given array.
    */
    @Test
    void testSmallestChange2() {
        List<Integer> arr = List.of(1, 2, 3, 4, 3, 2, 2);
        assertEquals(1, SmallestChange.smallestChange(arr));
    }

    /**
    * Test case for {@link SmallestChange#smallestChange(List)}.
    * Tests that the method returns 1 for the given array.
    */
    @Test
    void testSmallestChange3() {
        List<Integer> arr = List.of(1, 4, 2);
        assertEquals(1, SmallestChange.smallestChange(arr));
    }

    /**
    * Test case for {@link SmallestChange#smallestChange(List)}.
    * Tests that the method returns 1 for the given array.
    */
    @Test
    void testSmallestChange4() {
        List<Integer> arr = List.of(1, 4, 4, 2);
        assertEquals(1, SmallestChange.smallestChange(arr));
    }

    /**
    * Test case for {@link SmallestChange#smallestChange(List)}.
    * Tests that the method returns 0 for the given array.
    */
    @Test
    void testSmallestChange5() {
        List<Integer> arr = List.of(1, 2, 3, 2, 1);
        assertEquals(0, SmallestChange.smallestChange(arr));
    }

    /**
    * Test case for {@link SmallestChange#smallestChange(List)}.
    * Tests that the method returns 0 for the given array.
    */
    @Test
    void testSmallestChange6() {
        List<Integer> arr = List.of(3, 1, 1, 3);
        assertEquals(0, SmallestChange.smallestChange(arr));
    }

    /**
    * Test case for {@link SmallestChange#smallestChange(List)}.
    * Tests that the method returns 0 for the given array.
    */
    @Test
    void testSmallestChange7() {
        List<Integer> arr = List.of(1);
        assertEquals(0, SmallestChange.smallestChange(arr));
    }

    /**
    * Test case for {@link SmallestChange#smallestChange(List)}.
    * Tests that the method returns 1 for the given array.
    */
    @Test
    void testSmallestChange8() {
        List<Integer> arr = List.of(0, 1);
        assertEquals(1, SmallestChange.smallestChange(arr));
    }
}
