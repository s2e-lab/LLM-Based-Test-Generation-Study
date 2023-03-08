package scenario2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveDuplicatesTest {

    @Test
    public void test() throws Exception {

        assertEquals(Arrays.asList(1, 3, 4), scenario2.RemoveDuplicates.removeDuplicates(Arrays.asList(1, 2, 3, 2, 4)));
        assertEquals(Arrays.asList(), scenario2.RemoveDuplicates.removeDuplicates(Arrays.asList()));
        assertEquals(Arrays.asList(1, 2, 3, 4), scenario2.RemoveDuplicates.removeDuplicates(Arrays.asList(1, 2, 3, 4)));
        assertEquals(Arrays.asList(1, 4, 5), scenario2.RemoveDuplicates.removeDuplicates(Arrays.asList(1, 2, 3, 2, 4, 3, 5)));

    }

}