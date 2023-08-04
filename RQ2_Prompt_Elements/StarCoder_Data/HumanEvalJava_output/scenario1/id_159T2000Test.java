// EatTest.java
package scenario1;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Eat}.
* It contains ten unit test cases for the {@link Eat#eat(int, int, int)} method.
*/
class EatTest {

    @Test
    void testEat1() {
        List<Integer> result = Eat.eat(1, 2, 3);
        assertEquals(Arrays.asList(3, 1), result);
    }

    @Test
    void testEat2() {
        List<Integer> result = Eat.eat(2, 2, 3);
        assertEquals(Arrays.asList(4, 1), result);
    }

    @Test
    void testEat3() {
        List<Integer> result = Eat.eat(3, 2, 3);
        assertEquals(Arrays.asList(5, 1), result);
    }

    @Test
    void testEat4() {
        List<Integer> result = Eat.eat(4, 2, 3);
        assertEquals(Arrays.asList(6, 1), result);
    }

    @Test
    void testEat5() {
        List<Integer> result = Eat.eat(5, 2, 3);
        assertEquals(Arrays.asList(7, 1), result);
    }

    @Test
    void testEat6() {
        List<Integer> result = Eat.eat(6, 2, 3);
        assertEquals(Arrays.asList(8, 1), result);
    }

    @Test
    void testEat7() {
        List<Integer> result = Eat.eat(7, 2, 3);
        assertEquals(Arrays.asList(9, 1), result);
    }

    @Test
    void testEat8() {
        List<Integer> result = Eat.eat(8, 2, 3);
        assertEquals(Arrays.asList(10, 1), result);
    }

    @Test
    void testEat9() {
        List<Integer> result = Eat.eat(9, 2, 3);
        assertEquals(Arrays.asList(11, 1), result);
    }

    @Test
    void testEat10() {
        List<Integer> result = Eat.eat(10, 2, 3);
        assertEquals(Arrays.asList(12, 1), result);
    }
}
