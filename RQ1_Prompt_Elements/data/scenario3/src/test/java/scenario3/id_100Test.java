package scenario3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
class MakeAPileTest {
    @Test
    void testMakeAPile() {
        assertEquals(MakeAPile.makeAPile(3), Arrays.asList(3, 5, 7));
        assertEquals(MakeAPile.makeAPile(4), Arrays.asList(4, 6, 8, 10));
        assertEquals(MakeAPile.makeAPile(5), Arrays.asList(5, 7, 9, 11, 13));
        assertEquals(MakeAPile.makeAPile(6), Arrays.asList(6, 8, 10, 12, 14, 16));
        assertEquals(MakeAPile.makeAPile(8), Arrays.asList(8, 10, 12, 14, 16, 18, 20, 22));
        assertEquals(MakeAPile.makeAPile(9), Arrays.asList(9, 11, 13, 15, 17, 19, 21, 23, 25));
        assertEquals(MakeAPile.makeAPile(10), Arrays.asList(10, 12, 14, 16, 18, 20, 22, 24, 26, 28));
        assertEquals(MakeAPile.makeAPile(11), Arrays.asList(11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31));
        assertEquals(MakeAPile.makeAPile(12), Arrays.asList(12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34));
        assertEquals(MakeAPile.makeAPile(13), Arrays.asList(13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37));
    }
}