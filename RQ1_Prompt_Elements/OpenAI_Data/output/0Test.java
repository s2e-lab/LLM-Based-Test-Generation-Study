// HasCloseElementsTest.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests of {@link HasCloseElements}.
 * It contains ten test cases for the {@link scenario1.HasCloseElements#hasCloseElements()} method.
 */
class HasCloseElementsTest {
		


    @Test
    void testHasCloseElements() {
        List<Double> numbers = new ArrayList<Double>();
        numbers.add(1.0);
        numbers.add(2.0);
        numbers.add(3.0);
        numbers.add(4.0);
        numbers.add(5.0);
        numbers.add(6.0);
        numbers.add(7.0);
        numbers.add(8.0);
        numbers.add(9.0);
        numbers.add(10.0);
        assertEquals(true, HasCloseElements.hasCloseElements(numbers, 1.0));
        assertEquals(true, HasCloseElements.hasCloseElements(numbers, 2.0));
        assertEquals(true, HasCloseElements.hasCloseElements(numbers, 3.0));
        assertEquals(true, HasCloseElements.hasCloseElements(numbers, 4.0));
        assertEquals(true, HasCloseElements.hasCloseElements(numbers, 5.0));
        assertEquals(true, HasCloseElements.hasCloseElements(numbers, 6.0));
        assertEquals(true, HasCloseElements.hasCloseElements(numbers, 7.0));
        assertEquals(true, HasCloseElements.hasCloseElements(numbers, 8.0));
        assertEquals(true, HasCloseElements.hasCloseElements(numbers, 9.0));
        assertEquals(false, HasCloseElements.hasCloseElements(numbers, 10.0));
    }
}