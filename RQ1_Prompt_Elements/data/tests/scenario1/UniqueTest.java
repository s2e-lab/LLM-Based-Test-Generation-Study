package scenario1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UniqueTest {

    @Test
    public void test() throws Exception {

        assertEquals(Arrays.asList(0, 2, 3, 5, 9, 123), scenario1.Unique.unique(Arrays.asList(5, 3, 5, 2, 3, 3, 9, 0, 123)));
        assertEquals(Arrays.asList(0, 2, 3, 5, 9, 123), scenario1.Unique.unique(Arrays.asList(5, 3, 5, 2, 3, 3, 9, 0, 123)));

    }

}