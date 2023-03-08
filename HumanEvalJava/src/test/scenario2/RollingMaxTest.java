package scenario2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RollingMaxTest {

    @Test
    public void test() throws Exception {

        assertEquals(Arrays.asList(1, 2, 3, 3, 3, 4, 4), scenario2.RollingMax.rollingMax(Arrays.asList(1, 2, 3, 2, 3, 4, 2)));
        assertEquals(Arrays.asList(), scenario2.RollingMax.rollingMax(Arrays.asList()));
        assertEquals(Arrays.asList(1, 2, 3, 4), scenario2.RollingMax.rollingMax(Arrays.asList(1, 2, 3, 4)));
        assertEquals(Arrays.asList(4, 4, 4, 4), scenario2.RollingMax.rollingMax(Arrays.asList(4, 3, 2, 1)));
        assertEquals(Arrays.asList(3, 3, 3, 100, 100), scenario2.RollingMax.rollingMax(Arrays.asList(3, 2, 3, 100, 3)));

    }

}