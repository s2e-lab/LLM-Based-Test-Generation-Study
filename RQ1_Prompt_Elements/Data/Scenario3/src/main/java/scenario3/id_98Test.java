package scenario3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
class CountUpperTest {
    @Test
    public void testCountUpper() {
        assertEquals(0, CountUpper.countUpper("abcdefg"));
        assertEquals(0, CountUpper.countUpper("dBBE"));
        assertEquals(0, CountUpper.countUpper(""));
        assertEquals(2, CountUpper.countUpper("EEEE"));
        assertEquals(0, CountUpper.countUpper("aBCdEf"));
        assertEquals(0, CountUpper.countUpper("abcdefg"));
        assertEquals(0, CountUpper.countUpper("dBBE"));
        assertEquals(0, CountUpper.countUpper(""));
        assertEquals(2, CountUpper.countUpper("EEEE"));
        assertEquals(0, CountUpper.countUpper("aBCdEf"));
    }
}