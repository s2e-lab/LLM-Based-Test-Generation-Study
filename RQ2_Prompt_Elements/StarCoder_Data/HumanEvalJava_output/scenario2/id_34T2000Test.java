// UniqueTest.java
package scenario2;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Unique}.
* It contains ten unit test cases for the {@link Unique#unique(List)} method.
*/
class UniqueTest {

    /**
     * Test case for the {@link Unique#unique(List)} method.
     * It tests the method with an empty list.
     */
    @Test
    void testUniqueEmptyList() {
        List<Integer> l = new ArrayList<Integer>();
        List<Integer> result = Unique.unique(l);
        assertEquals(0, result.size());
    }

    /**
     * Test case for the {@link Unique#unique(List)} method.
     * It tests the method with a list containing one element.
     */
    @Test
    void testUniqueOneElementList() {
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        List<Integer> result = Unique.unique(l);
        assertEquals(1, result.size());
        assertEquals(1, result.get(0));
    }

    /**
     * Test case for the {@link Unique#unique(List)} method.
     * It tests the method with a list containing two elements.
     */
    @Test
    void testUniqueTwoElementList() {
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        List<Integer> result = Unique.unique(l);
        assertEquals(2, result.size());
        assertEquals(1, result.get(0));
        assertEquals(2, result.get(1));
    }

    /**
     * Test case for the {@link Unique#unique(List)} method.
     * It tests the method with a list containing three elements.
     */
    @Test
    void testUniqueThreeElementList() {
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        List<Integer> result = Unique.unique(l);
        assertEquals(3, result.size());
        assertEquals(1, result.get(0));
        assertEquals(2, result.get(1));
        assertEquals(3, result.get(2));
    }

    /**
     * Test case for the {@link Unique#unique(List)} method.
     * It tests the method with a list containing four elements.
     */
    @Test
    void testUniqueFourElementList() {
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        List<Integer> result = Unique.unique(l);
        assertEquals(4, result.size());
        assertEquals(1, result.get(0));
        assertEquals(2, result.get(1));
        assertEquals(3, result.get(2));
        assertEquals(4, result.get(3));
    }

    /**
     * Test case for the {@link Unique#unique(List)} method.
     * It tests the method with a list containing five elements.
     */
    @Test
    void testUniqueFiveElementList() {
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        List<Integer> result = Unique.unique(l);
        assertEquals(5, result.size());
        assertEquals(1, result.get(0));
        assertEquals(2, result.get(1));
        assertEquals(3, result.get(2));
        assertEquals(4, result.get(3));
        assertEquals(5, result.get(4));
    }

    /**
     * Test case for the {@link Unique#unique(List)} method.
     * It tests the method with a list containing six elements.
     */
    @Test
    void testUniqueSixElementList() {
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        List<Integer> result = Unique.unique(l);
        assertEquals(6, result.size());
        assertEquals(1, result.get(0));
        assertEquals(2, result.get(1));
        assertEquals(3, result.get(2));
        assertEquals(4, result.get(3));
        assertEquals(5, result.get(4));
        assertEquals(6, result.get(5));
    }

    /**
     * Test case for the {@link Unique#unique(List)} method.
     * It tests the method with a list containing seven elements.
     */
    @Test
    void testUniqueSevenElementList() {
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);
        List<Integer> result = Unique.unique(l);
        assertEquals(7, result.size());
        assertEquals(1, result.get(0));
        assertEquals(2, result.get(1));
        assertEquals(3, result.get(2));
        assertEquals(4, result.get(3));
        assertEquals(5, result.get(4));
        assertEquals(6, result.get(5));
        assertEquals(7, result.get(6));
    }

    /**
     * Test case for the {@link Unique#unique(List)} method.
     * It tests the method with a list containing eight elements.
     */
    @Test
    void testUniqueEightElementList() {
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);
        l.add(8);
        List<Integer> result = Unique.unique(l);
        assertEquals(8, result.size());
        assertEquals(1, result.get(0));
        assertEquals(2, result.get(1));
        assertEquals(3, result.get(2));
        assertEquals(4, result.get(3));
        assertEquals(5, result.get(4));
        assertEquals(6, result.get(5));
        assertEquals(7, result.get(6));
        assertEquals(8, result.get(7));
    }

    /**
     * Test case for the {@link Unique#unique(List)} method.
     * It tests the method with a list containing nine elements.
     */
    @Test
    void testUniqueNineElementList() {
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);
        l.add(8);
        l.add(9);
        List<Integer> result = Unique.unique(l);
        assertEquals(9, result.size());
        assertEquals(1, result.get(0));
        assertEquals(2, result.get(1));
        assertEquals(3, result.get(2));
        assertEquals(4, result.get(3));
        assertEquals(5, result.get(4));
        assertEquals(6, result.get(5));
        assertEquals(7, result.get(6));
        assertEquals(8, result.get(7));
        assertEquals(9, result.get(8));
    }

    /**
     * Test case for the {@link Unique#unique(List)} method.
     * It tests the method with a list containing ten elements.
     */
    @Test
    void testUniqueTenElementList() {
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);
        l.add(8);
        l.add(9);
        l.add(10);
        List<Integer> result = Unique.unique(l);
        assertEquals(10, result.size());
        assertEquals(1, result.get(0));
        assertEquals(2, result.get(1));
        assertEquals(3, result.get(2));
        assertEquals(4, result.get(3));
        assertEquals(5, result.get(4));
        assertEquals(6, result.get(5));
        assertEquals(7, result.get(6));
        assertEquals(8, result.get(7));
        assertEquals(9, result.get(8));
        assertEquals(10, result.get(9));
    }
}
