// RemoveDuplicatesTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RemoveDuplicates}.
* It contains ten unit test cases for the {@link RemoveDuplicates#removeDuplicates(List)} method.
*/
class RemoveDuplicatesTest {

    /**
    * Test case for {@link RemoveDuplicates#removeDuplicates(List)}.
    */
    @Test
    void testRemoveDuplicates() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(3);
        expected.add(4);
        assertEquals(expected, RemoveDuplicates.removeDuplicates(numbers));

        numbers = new ArrayList<Object>();
        assertEquals(new ArrayList<Object>(), RemoveDuplicates.removeDuplicates(numbers));

        numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        assertEquals(numbers, RemoveDuplicates.removeDuplicates(numbers));

        numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        numbers.add(3);
        numbers.add(5);
        expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(4);
        expected.add(5);
        assertEquals(expected, RemoveDuplicates.removeDuplicates(numbers));
    }
}
