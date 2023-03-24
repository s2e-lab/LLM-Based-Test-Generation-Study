// WillItFlyTest.java
package original;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link WillItFly}.
 * It contains ten unit test cases for the {@link WillItFly#willItFly(List, int)} method.
 */
class WillItFlyTest {

    @Test
    void testWillItFly_balancedAndSumLessThanMaxWeight() {
        List<Integer> q = Arrays.asList(3, 2, 3);
        int w = 9;
        assertTrue(WillItFly.willItFly(q, w));
    }

    @Test
    void testWillItFly_unbalanced() {
        List<Integer> q = Arrays.asList(1, 2);
        int w = 5;
        assertFalse(WillItFly.willItFly(q, w));
    }

    @Test
    void testWillItFly_balancedAndSumMoreThanMaxWeight() {
        List<Integer> q = Arrays.asList(3, 2, 3);
        int w = 1;
        assertFalse(WillItFly.willItFly(q, w));
    }

    @Test
    void testWillItFly_singleElementList() {
        List<Integer> q = Arrays.asList(3);
        int w = 5;
        assertTrue(WillItFly.willItFly(q, w));
    }

    @Test
    void testWillItFly_emptyList() {
        List<Integer> q = Arrays.asList();
        int w = 5;
        assertTrue(WillItFly.willItFly(q, w));
    }

    @Test
    void testWillItFly_palindromicListWithOddNumberOfElements() {
        List<Integer> q = Arrays.asList(1, 2, 3, 2, 1);
        int w = 10;
        assertTrue(WillItFly.willItFly(q, w));
    }

    @Test
    void testWillItFly_palindromicListWithEvenNumberOfElements() {
        List<Integer> q = Arrays.asList(1, 2, 2, 1);
        int w = 6;
        assertTrue(WillItFly.willItFly(q, w));
    }

    @Test
    void testWillItFly_palindromicListWithOddNumberOfElementsAndSumMoreThanMaxWeight() {
        List<Integer> q = Arrays.asList(1, 2, 3, 2, 1);
        int w = 10;
        assertFalse(WillItFly.willItFly(q, w - 1));
    }

    @Test
    void testWillItFly_palindromicListWithEvenNumberOfElementsAndSumMoreThanMaxWeight() {
        List<Integer> q = Arrays.asList(1, 2, 2, 1);
        int w = 6;
        assertFalse(WillItFly.willItFly(q, w - 1));
    }

    @Test
    void testWillItFly_palindromicListWithOddNumberOfElementsAndSumEqualToMaxWeight() {
        List<Integer> q = Arrays.asList(1, 2, 3, 2, 1);
        int w = 11;
        assertTrue(WillItFly.willItFly(q, w));
    }
}