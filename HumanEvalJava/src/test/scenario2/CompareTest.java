package scenario2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CompareTest {

    @Test
    public void test() throws Exception {

        assertEquals(Arrays.asList(0, 0, 0, 0, 3, 3), scenario2.Compare.compare(Arrays.asList(1, 2, 3, 4, 5, 1), Arrays.asList(1, 2, 3, 4, 2, -2)));
        assertEquals(Arrays.asList(0, 0, 0, 0, 0, 0), scenario2.Compare.compare(Arrays.asList(0, 0, 0, 0, 0, 0), Arrays.asList(0, 0, 0, 0, 0, 0)));
        assertEquals(Arrays.asList(2, 4, 6), scenario2.Compare.compare(Arrays.asList(1, 2, 3), Arrays.asList(-1, -2, -3)));
        assertEquals(Arrays.asList(2, 0, 0, 1), scenario2.Compare.compare(Arrays.asList(1, 2, 3, 5), Arrays.asList(-1, 2, 3, 4)));

    }

}