// BelowZeroTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BelowZero}.
* It contains ten unit test cases for the {@link BelowZero#belowZero(List)} method.
*/
class BelowZeroTest {

    /**
    * Test case for {@link BelowZero#belowZero(List)}.
    */
    @Test
    void testBelowZero() {
        List<Object> operations = List.of(1, 2, 3);
        assertEquals(false, BelowZero.belowZero(operations));

        operations = List.of(1, 2, -4, 5);
        assertEquals(true, BelowZero.belowZero(operations));

        operations = List.of();
        assertEquals(false, BelowZero.belowZero(operations));

        operations = List.of(1, 2, -3, 1, 2, -3);
        assertEquals(false, BelowZero.belowZero(operations));

        operations = List.of(1, 2, -4, 5, 6);
        assertEquals(true, BelowZero.belowZero(operations));

        operations = List.of(1, -1, 2, -2, 5, -5, 4, -4);
        assertEquals(false, BelowZero.belowZero(operations));

        operations = List.of(1, -1, 2, -2, 5, -5, 4, -5);
        assertEquals(true, BelowZero.belowZero(operations));

        operations = List.of(1, -2, 2, -2, 5, -5, 4, -4);
        assertEquals(true, BelowZero.belowZero(operations));
    }
}
