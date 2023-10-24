// HasCloseElementsTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HasCloseElements}.
* It contains ten unit test cases for the {@link HasCloseElements#hasCloseElements(List, Double)} method.
*/
class HasCloseElementsTest {

    /**
    * Test case number: 1
    * Test case values: [1.0, 2.0, 3.0], 0.5
    * Expected result (Post-state): false
    */
    @Test
    void testHasCloseElements1() {
        List<Double> numbers = List.of(1.0, 2.0, 3.0);
        Double threshold = 0.5;
        Boolean expected = false;
        assertEquals(expected, HasCloseElements.hasCloseElements(numbers, threshold));
    }

    /**
    * Test case number: 2
    * Test case values: [1.0, 2.8, 3.0, 4.0, 5.0, 2.0], 0.3
    * Expected result (Post-state): true
    */
    @Test
    void testHasCloseElements2() {
        List<Double> numbers = List.of(1.0, 2.8, 3.0, 4.0, 5.0, 2.0);
        Double threshold = 0.3;
        Boolean expected = true;
        assertEquals(expected, HasCloseElements.hasCloseElements(numbers, threshold));
    }

    /**
    * Test case number: 3
    * Test case values: [1.0, 2.0, 3.9, 4.0, 5.0, 2.2], 0.3
    * Expected result (Post-state): true
    */
    @Test
    void testHasCloseElements3() {
        List<Double> numbers = List.of(1.0, 2.0, 3.9, 4.0, 5.0, 2.2);
        Double threshold = 0.3;
        Boolean expected = true;
        assertEquals(expected, HasCloseElements.hasCloseElements(numbers, threshold));
    }

    /**
    * Test case number: 4
    * Test case values: [1.0, 2.0, 3.9, 4.0, 5.0, 2.2], 0.05
    * Expected result (Post-state): false
    */
    @Test
    void testHasCloseElements4() {
        List<Double> numbers = List.of(1.0, 2.0, 3.9, 4.0, 5.0, 2.2);
        Double threshold = 0.05;
        Boolean expected = false;
        assertEquals(expected, HasCloseElements.hasCloseElements(numbers, threshold));
    }

    /**
    * Test case number: 5
    * Test case values: [1.0, 2.0, 5.9, 4.0, 5.0], 0.95
    * Expected result (Post-state): true
    */
    @Test
    void testHasCloseElements5() {
        List<Double> numbers = List.of(1.0, 2.0, 5.9, 4.0, 5.0);
        Double threshold = 0.95;
        Boolean expected = true;
        assertEquals(expected, HasCloseElements.hasCloseElements(numbers, threshold));
    }

    /**
    * Test case number: 6
    * Test case values: [1.0, 2.0, 5.9, 4.0, 5.0], 0.8
    * Expected result (Post-state): false
    */
    @Test
    void testHasCloseElements6() {
        List<Double> numbers = List.of(1.0, 2.0, 5.9, 4.0, 5.0);
        Double threshold = 0.8;
        Boolean expected = false;
        assertEquals(expected, HasCloseElements.hasCloseElements(numbers, threshold));
    }

    /**
    * Test case number: 7
    * Test case values: [1.0, 2.0, 3.0, 4.0, 5.0, 2.0], 0.1
    * Expected result (Post-state): true
    */
    @Test
    void testHasCloseElements7() {
        List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 2.0);
        Double threshold = 0.1;
        Boolean expected = true;
        assertEquals(expected, HasCloseElements.hasCloseElements(numbers, threshold));
    }

    /**
    * Test case number: 8
    * Test case values: [1.1, 2.2, 3.1, 4.1, 5.1], 1.0
    * Expected result (Post-state): true
    */
    @Test
    void testHasCloseElements8() {
        List<Double> numbers = List.of(1.1, 2.2, 3.1, 4.1, 5.1);
        Double threshold = 1.0;
        Boolean expected = true;
        assertEquals(expected, HasCloseElements.hasCloseElements(numbers, threshold));
    }

    /**
    * Test case number: 9
    * Test case values: [1.1, 2.2, 3.1, 4.1, 5.1], 0.5
    * Expected result (Post-state): false
    */
    @Test
    void testHasCloseElements9() {
        List<Double> numbers = List.of(1.1, 2.2, 3.1, 4.1, 5.1);
        Double threshold = 0.5;
        Boolean expected = false;
        assertEquals(expected, HasCloseElements.hasCloseElements(numbers, threshold));
    }

    /**
    * Test case number: 10
    * Test case values: [1.0, 2.0, 3.0, 4.0, 5.0, 2.0], 0.0
    * Expected result (Post-state): false
    */
    @Test
    void testHasCloseElements10() {
        List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 2.0);
        Double threshold = 0.0;
        Boolean expected = false;
        assertEquals(expected, HasCloseElements.hasCloseElements(numbers, threshold));
    }
}
