package Part3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
class TestStartsOneEnds {
    @Test
    void testStartsOneEnds() {
        assertEquals(1, StartsOneEnds.startsOneEnds(1));
        assertEquals(18, StartsOneEnds.startsOneEnds(2));
        assertEquals(180, StartsOneEnds.startsOneEnds(3));
        assertEquals(1800, StartsOneEnds.startsOneEnds(4));
        assertEquals(18000, StartsOneEnds.startsOneEnds(5));
        assertEquals(180000, StartsOneEnds.startsOneEnds(6));
        assertEquals(1800000, StartsOneEnds.startsOneEnds(7));
        assertEquals(18000000, StartsOneEnds.startsOneEnds(8));
        assertEquals(180000000, StartsOneEnds.startsOneEnds(9));
        assertEquals(1800000000, StartsOneEnds.startsOneEnds(10));
    }
}