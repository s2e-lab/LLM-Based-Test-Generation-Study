package scenario2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IntersectionTest {

    @Test
    public void test() throws Exception {

        assertEquals("NO", scenario2.Intersection.intersection(Arrays.asList(1, 2), Arrays.asList(2, 3)));
        assertEquals("NO", scenario2.Intersection.intersection(Arrays.asList(-1, 1), Arrays.asList(0, 4)));
        assertEquals("YES", scenario2.Intersection.intersection(Arrays.asList(-3, -1), Arrays.asList(-5, 5)));
        assertEquals("YES", scenario2.Intersection.intersection(Arrays.asList(-2, 2), Arrays.asList(-4, 0)));
        assertEquals("NO", scenario2.Intersection.intersection(Arrays.asList(-11, 2), Arrays.asList(-1, -1)));
        assertEquals("NO", scenario2.Intersection.intersection(Arrays.asList(1, 2), Arrays.asList(3, 5)));
        assertEquals("NO", scenario2.Intersection.intersection(Arrays.asList(1, 2), Arrays.asList(1, 2)));
        assertEquals("NO", scenario2.Intersection.intersection(Arrays.asList(-2, -2), Arrays.asList(-3, -2)));

    }

}