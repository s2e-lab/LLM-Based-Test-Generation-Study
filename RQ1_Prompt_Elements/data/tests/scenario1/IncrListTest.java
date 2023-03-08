package scenario1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IncrListTest {

    @Test
    public void test() throws Exception {

        assertEquals(Arrays.asList(2, 3, 4), scenario1.IncrList.incrList(Arrays.asList(1, 2, 3)));
        assertEquals(Arrays.asList(6, 4, 6, 3, 4, 4, 10, 1, 124), scenario1.IncrList.incrList(Arrays.asList(5, 3, 5, 2, 3, 3, 9, 0, 123)));
        assertEquals(Arrays.asList(), scenario1.IncrList.incrList(Arrays.asList()));
        assertEquals(Arrays.asList(4, 3, 2), scenario1.IncrList.incrList(Arrays.asList(3, 2, 1)));
        assertEquals(Arrays.asList(6, 3, 6, 3, 4, 4, 10, 1, 124), scenario1.IncrList.incrList(Arrays.asList(5, 2, 5, 2, 3, 3, 9, 0, 123)));

    }

}