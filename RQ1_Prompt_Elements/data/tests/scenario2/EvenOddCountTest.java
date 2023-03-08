package scenario2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EvenOddCountTest {

    @Test
    public void test() throws Exception {

        assertEquals(Arrays.asList(0, 1), scenario2.EvenOddCount.evenOddCount(7));
        assertEquals(Arrays.asList(1, 1), scenario2.EvenOddCount.evenOddCount(-78));
        assertEquals(Arrays.asList(2, 2), scenario2.EvenOddCount.evenOddCount(3452));
        assertEquals(Arrays.asList(3, 3), scenario2.EvenOddCount.evenOddCount(346211));
        assertEquals(Arrays.asList(3, 3), scenario2.EvenOddCount.evenOddCount(-345821));
        assertEquals(Arrays.asList(1, 0), scenario2.EvenOddCount.evenOddCount(-2));
        assertEquals(Arrays.asList(2, 3), scenario2.EvenOddCount.evenOddCount(-45347));
        assertEquals(Arrays.asList(1, 0), scenario2.EvenOddCount.evenOddCount(0));

    }

}