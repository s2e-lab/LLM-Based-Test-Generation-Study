// HasCloseElementsTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HasCloseElements}.
* It contains ten unit test cases for the {@link HasCloseElements#hasCloseElements(List, Double)} method.
*/
class HasCloseElementsTest {

    @Test
    void testHasCloseElements() {
        List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
        assertTrue(HasCloseElements.hasCloseElements(numbers, 1.0));
        assertFalse(HasCloseElements.hasCloseElements(numbers, 0.5));
    }
}
