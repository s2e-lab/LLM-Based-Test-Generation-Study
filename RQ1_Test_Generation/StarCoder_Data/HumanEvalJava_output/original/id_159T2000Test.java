// EatTest.java
package original;

import java.util.Arrays;
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
        List<Integer> expected = Arrays.asList(11, 4);
        assertEquals(expected, Eat.eat(5, 6, 10));

        expected = Arrays.asList(12, 1);
        assertEquals(expected, Eat.eat(4, 8, 9));

        expected = Arrays.asList(11, 0);
        assertEquals(expected, Eat.eat(1, 10, 10));

        expected = Arrays.asList(7, 0);
        assertEquals(expected, Eat.eat(2, 11, 5));

        expected = Arrays.asList(9, 2);
        assertEquals(expected, Eat.eat(4, 5, 7));

        expected = Arrays.asList(5, 0);
        assertEquals(expected, Eat.eat(4, 5, 1));
    }
}
