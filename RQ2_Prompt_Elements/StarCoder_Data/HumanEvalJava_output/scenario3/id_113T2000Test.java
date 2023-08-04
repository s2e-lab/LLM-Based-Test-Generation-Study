// OddCountTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OddCount}.
* It contains ten unit test cases for the {@link OddCount#oddCount(List)} method.
*/
class OddCountTest {

    /**
     * Test case for the {@link OddCount#oddCount(List)} method.
     * It tests the following conditions:
     * <ul>
     * <li>The input is null.</li>
     * <li>The input is empty.</li>
     * <li>The input contains only one string.</li>
     * <li>The input contains multiple strings.</li>
     * </ul>
     */
    @Test
    void testOddCount() {
        // Test case for the input is null.
        List<String> lst = null;
        List<String> expected = null;
        assertEquals(expected, OddCount.oddCount(lst));

        // Test case for the input is empty.
        lst = List.of();
        expected = List.of();
        assertEquals(expected, OddCount.oddCount(lst));

        // Test case for the input contains only one string.
        lst = List.of("1234567");
        expected = List.of("the number of odd elements 4n the str4ng 4 of the 4nput.");
        assertEquals(expected, OddCount.oddCount(lst));

        // Test case for the input contains multiple strings.
        lst = List.of("3", "11111111");
        expected = List.of("the number of odd elements 1n the str1ng 1 of the 1nput.", "the number of odd elements 8n the str8ng 8 of the 8nput.");
        assertEquals(expected, OddCount.oddCount(lst));
    }
}
