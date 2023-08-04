// CanArrangeTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CanArrange}.
* It contains ten unit test cases for the {@link CanArrange#canArrange(List)} method.
*/
class CanArrangeTest {

    /**
    * Test case for {@link CanArrange#canArrange(List)} where the given array is empty.
    */
    @Test
    void testCanArrangeEmpty() {
        List<Object> arr = List.of();
        assertEquals(-1, CanArrange.canArrange(arr));
    }

    /**
    * Test case for {@link CanArrange#canArrange(List)} where the given array contains only one element.
    */
    @Test
    void testCanArrangeOneElement() {
        List<Object> arr = List.of(1);
        assertEquals(-1, CanArrange.canArrange(arr));
    }

    /**
    * Test case for {@link CanArrange#canArrange(List)} where the given array contains two elements.
    */
    @Test
    void testCanArrangeTwoElements() {
        List<Object> arr = List.of(1, 2);
        assertEquals(-1, CanArrange.canArrange(arr));
    }

    /**
    * Test case for {@link CanArrange#canArrange(List)} where the given array contains three elements.
    */
    @Test
    void testCanArrangeThreeElements() {
        List<Object> arr = List.of(1, 2, 3);
        assertEquals(-1, CanArrange.canArrange(arr));
    }

    /**
    * Test case for {@link CanArrange#canArrange(List)} where the given array contains four elements.
    */
    @Test
    void testCanArrangeFourElements() {
        List<Object> arr = List.of(1, 2, 3, 4);
        assertEquals(-1, CanArrange.canArrange(arr));
    }

    /**
    * Test case for {@link CanArrange#canArrange(List)} where the given array contains five elements.
    */
    @Test
    void testCanArrangeFiveElements() {
        List<Object> arr = List.of(1, 2, 3, 4, 5);
        assertEquals(-1, CanArrange.canArrange(arr));
    }

    /**
    * Test case for {@link CanArrange#canArrange(List)} where the given array contains six elements.
    */
    @Test
    void testCanArrangeSixElements() {
        List<Object> arr = List.of(1, 2, 3, 4, 5, 6);
        assertEquals(-1, CanArrange.canArrange(arr));
    }

    /**
    * Test case for {@link CanArrange#canArrange(List)} where the given array contains seven elements.
    */
    @Test
    void testCanArrangeSevenElements() {
        List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7);
        assertEquals(-1, CanArrange.canArrange(arr));
    }

    /**
    * Test case for {@link CanArrange#canArrange(List)} where the given array contains eight elements.
    */
    @Test
    void testCanArrangeEightElements() {
        List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        assertEquals(-1, CanArrange.canArrange(arr));
    }

    /**
    * Test case for {@link CanArrange#canArrange(List)} where the given array contains nine elements.
    */
    @Test
    void testCanArrangeNineElements() {
        List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        assertEquals(-1, CanArrange.canArrange(arr));
    }

    /**
    * Test case for {@link CanArrange#canArrange(List)} where the given array contains ten elements.
    */
    @Test
    void testCanArrangeTenElements() {
        List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertEquals(-1, CanArrange.canArrange(arr));
    }

    /**
    * Test case for {@link CanArrange#canArrange(List)} where the given array contains eleven elements.
    */
    @Test
    void testCanArrangeElevenElements() {
        List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        assertEquals(-1, CanArrange.canArrange(arr));
    }

    /**
    * Test case for {@link CanArrange#canArrange(List)} where the given array contains twelve elements.
    */
    @Test
    void testCanArrangeTwelveElements() {
        List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        assertEquals(-1, CanArrange.canArrange(arr));
    }

    /**
    * Test case for {@link CanArrange#canArrange(List)} where the given array contains thirteen elements.
    */
    @Test
    void testCanArrangeThirteenElements() {
        List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13);
        assertEquals(-1, CanArrange.canArrange(arr));
    }

    /**
    * Test case for {@link CanArrange#canArrange(List)} where the given array contains fourteen elements.
    */
    @Test
    void testCanArrangeFourteenElements() {
        List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14);
        assertEquals(-1, CanArrange.canArrange(arr));
    }

    /**
    * Test case for {@link CanArrange#canArrange(List)} where the given array contains fifteen elements.
    */
    @Test
    void testCanArrangeFifteenElements() {
        List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        assertEquals(-1, CanArrange.canArrange(arr));
    }

    /**
    * Test case for {@link CanArrange#canArrange(List)} where the given array contains sixteen elements.
    */
    @Test
    void testCanArrangeSixteenElements() {
        List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
        assertEquals(-1, CanArrange.canArrange(arr));
    }

    /**
    * Test case for {@link CanArrange#canArrange(List)} where the given array contains seventeen elements.
    */
    @Test
    void testCanArrangeSeventeenElements() {
        List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17);
        assertEquals(-1, CanArrange.canArrange(arr));
    }

    /**
    * Test case for {@link CanArrange#canArrange(List)} where the given array contains eighteen elements.
    */
    @Test
    void testCanArrangeEighteenElements() {
        List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18);
        assertEquals(-1, CanArrange.canArrange(arr));
    }

    /**
    * Test case for {@link CanArrange#canArrange(List)} where the given array contains nineteen elements.
    */
    @Test
    void testCanArrangeNineteenElements() {
        List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19);
        assertEquals(-1, CanArrange.canArrange(arr));
    }

    /**
    * Test case for {@link CanArrange#canArrange(List)} where the given array contains twenty elements.
    */
    @Test
    void testCanArrangeTwentyElements() {
        List<Object> arr = List.of(1, 2, 3, 4