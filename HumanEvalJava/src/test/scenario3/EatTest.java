package scenario3;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EatTest {

    @Test
    public void test() throws Exception {

        assertEquals(Arrays.asList(11, 4), scenario3.Eat.eat(5, 6, 10));
        assertEquals(Arrays.asList(12, 1), scenario3.Eat.eat(4, 8, 9));
        assertEquals(Arrays.asList(11, 0), scenario3.Eat.eat(1, 10, 10));
        assertEquals(Arrays.asList(7, 0), scenario3.Eat.eat(2, 11, 5));
        assertEquals(Arrays.asList(9, 2), scenario3.Eat.eat(4, 5, 7));
        assertEquals(Arrays.asList(5, 0), scenario3.Eat.eat(4, 5, 1));

    }

}