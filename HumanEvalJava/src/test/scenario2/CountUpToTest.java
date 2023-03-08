package scenario2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountUpToTest {

    @Test
    public void test() throws Exception {

        assertEquals(Arrays.asList(2, 3), scenario2.CountUpTo.countUpTo(5));
        assertEquals(Arrays.asList(2, 3, 5), scenario2.CountUpTo.countUpTo(6));
        assertEquals(Arrays.asList(2, 3, 5), scenario2.CountUpTo.countUpTo(7));
        assertEquals(Arrays.asList(2, 3, 5, 7), scenario2.CountUpTo.countUpTo(10));
        assertEquals(Arrays.asList(), scenario2.CountUpTo.countUpTo(0));
        assertEquals(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19), scenario2.CountUpTo.countUpTo(22));
        assertEquals(Arrays.asList(), scenario2.CountUpTo.countUpTo(1));
        assertEquals(Arrays.asList(2, 3, 5, 7, 11, 13, 17), scenario2.CountUpTo.countUpTo(18));
        assertEquals(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43), scenario2.CountUpTo.countUpTo(47));
        assertEquals(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97), scenario2.CountUpTo.countUpTo(101));

    }

}