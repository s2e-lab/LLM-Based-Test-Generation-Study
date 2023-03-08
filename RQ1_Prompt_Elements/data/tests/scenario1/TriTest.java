package scenario1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TriTest {

    @Test
    public void test() throws Exception {

        assertEquals(Arrays.asList(1, 3, 2.0, 8.0), scenario1.Tri.tri(3));
        assertEquals(Arrays.asList(1, 3, 2.0, 8.0, 3.0), scenario1.Tri.tri(4));
        assertEquals(Arrays.asList(1, 3, 2.0, 8.0, 3.0, 15.0), scenario1.Tri.tri(5));
        assertEquals(Arrays.asList(1, 3, 2.0, 8.0, 3.0, 15.0, 4.0), scenario1.Tri.tri(6));
        assertEquals(Arrays.asList(1, 3, 2.0, 8.0, 3.0, 15.0, 4.0, 24.0), scenario1.Tri.tri(7));
        assertEquals(Arrays.asList(1, 3, 2.0, 8.0, 3.0, 15.0, 4.0, 24.0, 5.0), scenario1.Tri.tri(8));
        assertEquals(Arrays.asList(1, 3, 2.0, 8.0, 3.0, 15.0, 4.0, 24.0, 5.0, 35.0), scenario1.Tri.tri(9));
        assertEquals(Arrays.asList(1, 3, 2.0, 8.0, 3.0, 15.0, 4.0, 24.0, 5.0, 35.0, 6.0, 48.0, 7.0, 63.0, 8.0, 80.0, 9.0, 99.0, 10.0, 120.0, 11.0), scenario1.Tri.tri(20));
        assertEquals(Arrays.asList(1), scenario1.Tri.tri(0));
        assertEquals(Arrays.asList(1, 3), scenario1.Tri.tri(1));

    }

}