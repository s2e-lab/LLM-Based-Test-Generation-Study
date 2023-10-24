// FilterIntegersTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FilterIntegers}.
* It contains ten unit test cases for the {@link FilterIntegers#filterIntegers(List)} method.
*/
class FilterIntegersTest {

    @Test
    void testFilterIntegers() {
        List<Object> values = new ArrayList<Object>();
        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);
        values.add(5);
        values.add(6);
        values.add(7);
        values.add(8);
        values.add(9);
        values.add(10);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        expected.add(6);
        expected.add(7);
        expected.add(8);
        expected.add(9);
        expected.add(10);
        assertEquals(expected, FilterIntegers.filterIntegers(values));
    }

    @Test
    void testFilterIntegersWithNull() {
        List<Object> values = new ArrayList<Object>();
        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);
        values.add(5);
        values.add(6);
        values.add(7);
        values.add(8);
        values.add(9);
        values.add(10);
        values.add(null);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        expected.add(6);
        expected.add(7);
        expected.add(8);
        expected.add(9);
        expected.add(10);
        assertEquals(expected, FilterIntegers.filterIntegers(values));
    }

    @Test
    void testFilterIntegersWithNullAndEmpty() {
        List<Object> values = new ArrayList<Object>();
        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);
        values.add(5);
        values.add(6);
        values.add(7);
        values.add(8);
        values.add(9);
        values.add(10);
        values.add(null);
        values.add("");
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        expected.add(6);
        expected.add(7);
        expected.add(8);
        expected.add(9);
        expected.add(10);
        assertEquals(expected, FilterIntegers.filterIntegers(values));
    }

    @Test
    void testFilterIntegersWithNullAndEmptyAndString() {
        List<Object> values = new ArrayList<Object>();
        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);
        values.add(5);
        values.add(6);
        values.add(7);
        values.add(8);
        values.add(9);
        values.add(10);
        values.add(null);
        values.add("");
        values.add("a");
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        expected.add(6);
        expected.add(7);
        expected.add(8);
        expected.add(9);
        expected.add(10);
        assertEquals(expected, FilterIntegers.filterIntegers(values));
    }

    @Test
    void testFilterIntegersWithNullAndEmptyAndStringAndInteger() {
        List<Object> values = new ArrayList<Object>();
        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);
        values.add(5);
        values.add(6);
        values.add(7);
        values.add(8);
        values.add(9);
        values.add(10);
        values.add(null);
        values.add("");
        values.add("a");
        values.add(1);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        expected.add(6);
        expected.add(7);
        expected.add(8);
        expected.add(9);
        expected.add(10);
        assertEquals(expected, FilterIntegers.filterIntegers(values));
    }

    @Test
    void testFilterIntegersWithNullAndEmptyAndStringAndIntegerAndDouble() {
        List<Object> values = new ArrayList<Object>();
        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);
        values.add(5);
        values.add(6);
        values.add(7);
        values.add(8);
        values.add(9);
        values.add(10);
        values.add(null);
        values.add("");
        values.add("a");
        values.add(1);
        values.add(1.0);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        expected.add(6);
        expected.add(7);
        expected.add(8);
        expected.add(9);
        expected.add(10);
        assertEquals(expected, FilterIntegers.filterIntegers(values));
    }

    @Test
    void testFilterIntegersWithNullAndEmptyAndStringAndIntegerAndDoubleAndBoolean() {
        List<Object> values = new ArrayList<Object>();
        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);
        values.add(5);
        values.add(6);
        values.add(7);
        values.add(8);
        values.add(9);
        values.add(10);
        values.add(null);
        values.add("");
        values.add("a");
        values.add(1);
        values.add(1.0);
        values.add(true);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        expected.add(6);
        expected.add(7);
        expected.add(8);
        expected.add(9);
        expected.add(10);
        assertEquals(expected, FilterIntegers.filterIntegers(values));
    }

    @Test
    void testFilterIntegersWithNullAndEmptyAndStringAndIntegerAndDoubleAndBooleanAndCharacter() {
        List<Object> values = new ArrayList<Object>();
        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);
        values.add(5);
        values.add(6);
        values.add(7);
        values.add(8);
        values.add(9);
        values.add(10);
        values.add(null);
        values.add("");
        values.add("a");
        values.add(1);
        values.add(1.0);
        values.add(true);
        values.add('a');
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        expected.add(6);
        expected.add(7);
        expected.add(8);
        expected.add(9);
        expected.add(10);
        assertEquals(expected, FilterIntegers.filterIntegers(values));
    }

    @Test
    void testFilterIntegersWithNullAndEmptyAndStringAndIntegerAndDoubleAndBooleanAndCharacterAndString() {
        List<Object> values = new ArrayList<Object>();
        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);
        values.add(5);
        values.add(6);
        values.add(7);
        values.add(8);
        values.add(9);
        values.add(10);
        values.add(null);
        values.add("");
        values.add("a");
        values.add(1);
        values.add(1.0);
        values.add(true);
        values.add('a');
        values.add("a");
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.