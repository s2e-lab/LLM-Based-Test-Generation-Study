// IntersperseTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Intersperse}.
* It contains ten unit test cases for the {@link Intersperse#intersperse(List, int)} method.
*/
class IntersperseTest {

    /**
    * Test case for {@link Intersperse#intersperse(List, int)} where the input list is empty.
    */
    @Test
    void testIntersperse_emptyList() {
        List<Object> numbers = new ArrayList<Object>();
        List<Object> expected = new ArrayList<Object>();
        assertEquals(expected, Intersperse.intersperse(numbers, 4));
    }

    /**
    * Test case for {@link Intersperse#intersperse(List, int)} where the input list contains one element.
    */
    @Test
    void testIntersperse_listWithOneElement() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        assertEquals(expected, Intersperse.intersperse(numbers, 4));
    }

    /**
    * Test case for {@link Intersperse#intersperse(List, int)} where the input list contains two elements.
    */
    @Test
    void testIntersperse_listWithTwoElements() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(2);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(4);
        expected.add(2);
        assertEquals(expected, Intersperse.intersperse(numbers, 4));
    }

    /**
    * Test case for {@link Intersperse#intersperse(List, int)} where the input list contains three elements.
    */
    @Test
    void testIntersperse_listWithThreeElements() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(4);
        expected.add(2);
        expected.add(4);
        expected.add(3);
        assertEquals(expected, Intersperse.intersperse(numbers, 4));
    }

    /**
    * Test case for {@link Intersperse#intersperse(List, int)} where the input list contains four elements.
    */
    @Test
    void testIntersperse_listWithFourElements() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(4);
        expected.add(2);
        expected.add(4);
        expected.add(3);
        expected.add(4);
        expected.add(4);
        assertEquals(expected, Intersperse.intersperse(numbers, 4));
    }

    /**
    * Test case for {@link Intersperse#intersperse(List, int)} where the input list contains five elements.
    */
    @Test
    void testIntersperse_listWithFiveElements() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(4);
        expected.add(2);
        expected.add(4);
        expected.add(3);
        expected.add(4);
        expected.add(4);
        expected.add(5);
        assertEquals(expected, Intersperse.intersperse(numbers, 4));
    }

    /**
    * Test case for {@link Intersperse#intersperse(List, int)} where the input list contains six elements.
    */
    @Test
    void testIntersperse_listWithSixElements() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(4);
        expected.add(2);
        expected.add(4);
        expected.add(3);
        expected.add(4);
        expected.add(4);
        expected.add(5);
        expected.add(4);
        expected.add(6);
        assertEquals(expected, Intersperse.intersperse(numbers, 4));
    }

    /**
    * Test case for {@link Intersperse#intersperse(List, int)} where the input list contains seven elements.
    */
    @Test
    void testIntersperse_listWithSevenElements() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(4);
        expected.add(2);
        expected.add(4);
        expected.add(3);
        expected.add(4);
        expected.add(4);
        expected.add(5);
        expected.add(4);
        expected.add(6);
        expected.add(4);
        expected.add(7);
        assertEquals(expected, Intersperse.intersperse(numbers, 4));
    }

    /**
    * Test case for {@link Intersperse#intersperse(List, int)} where the input list contains eight elements.
    */
    @Test
    void testIntersperse_listWithEightElements() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(4);
        expected.add(2);
        expected.add(4);
        expected.add(3);
        expected.add(4);
        expected.add(4);
        expected.add(5);
        expected.add(4);
        expected.add(6);
        expected.add(4);
        expected.add(7);
        expected.add(4);
        expected.add(8);
        assertEquals(expected, Intersperse.intersperse(numbers, 4));
    }

    /**
    * Test case for {@link Intersperse#intersperse(List, int)} where the input list contains nine elements.
    */
    @Test
    void testIntersperse_listWithNineElements() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(4);
        expected.add(2);
        expected.add(4);
        expected.add(3);
        expected.add(4);
        expected.add(4);
        expected.add(5);
        expected.add(4);
        expected.add(6);
        expected.add(4);
        expected.add(7);
        expected.add(4);
        expected.add(8);
        expected.add(4);
        expected.add(9);
        assertEquals(expected, Intersperse.intersperse(numbers, 4));
    }

    /**
    * Test case for {@link Intersperse#intersperse(List, int)} where the input list contains ten elements.
    */
    @Test
    void testIntersperse_listWithTenElements() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(4);
        expected.add(2);
        expected.add(4);
        expected.add(3);
        expected.add(4);
        expected.add(4);
        expected.add(5);
        expected.add(4);
        expected.add(6);
        expected.add(4);
        expected.add(7);
        expected.add(4);
        expected.add(8);
        expected.