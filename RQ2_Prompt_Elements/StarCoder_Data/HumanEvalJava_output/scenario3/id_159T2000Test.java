// EatTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Eat}.
* It contains ten unit test cases for the {@link Eat#eat(int, int, int)} method.
*/
class EatTest {

    /**
     * Test case for {@link Eat#eat(int, int, int)}.
     */
    @Test
    void testEat() {
        List<Integer> result = Eat.eat(5, 6, 10);
        assertEquals(11, result.get(0));
        assertEquals(4, result.get(1));

        result = Eat.eat(4, 8, 9);
        assertEquals(12, result.get(0));
        assertEquals(1, result.get(1));

        result = Eat.eat(1, 10, 10);
        assertEquals(11, result.get(0));
        assertEquals(0, result.get(1));

        result = Eat.eat(2, 11, 5);
        assertEquals(7, result.get(0));
        assertEquals(0, result.get(1));

        result = Eat.eat(4, 5, 7);
        assertEquals(9, result.get(0));
        assertEquals(2, result.get(1));

        result = Eat.eat(4, 5, 1);
        assertEquals(5, result.get(0));
        assertEquals(0, result.get(1));
    }
}
