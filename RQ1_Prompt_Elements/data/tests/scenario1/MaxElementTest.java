package scenario1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxElementTest {

    @Test
    public void test() throws Exception {

        assertEquals(3, scenario1.MaxElement.maxElement(Arrays.asList(1, 2, 3)));
        assertEquals(123, scenario1.MaxElement.maxElement(Arrays.asList(5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10)));
        assertEquals(3, scenario1.MaxElement.maxElement(Arrays.asList(1, 2, 3)));
        assertEquals(124, scenario1.MaxElement.maxElement(Arrays.asList(5, 3, -5, 2, -3, 3, 9, 0, 124, 1, -10)));

    }

}