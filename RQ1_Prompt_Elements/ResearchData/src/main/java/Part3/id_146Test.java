package Part3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
class SpecialfilterTest {
    @Test
    public void testSpecialfilter() {
        assertEquals(0, Specialfilter.specialfilter(Arrays.asList(5, -2, 1, -5)));
        assertEquals(1, Specialfilter.specialfilter(Arrays.asList(15, -73, 14, -15)));
        assertEquals(2, Specialfilter.specialfilter(Arrays.asList(33, -2, -3, 45, 21, 109)));
        assertEquals(4, Specialfilter.specialfilter(Arrays.asList(43, -12, 93, 125, 121, 109)));
        assertEquals(3, Specialfilter.specialfilter(Arrays.asList(71, -2, -33, 75, 21, 19)));
        assertEquals(0, Specialfilter.specialfilter(Arrays.asList(1)));
        assertEquals(0, Specialfilter.specialfilter(Arrays.asList()));
        assertEquals(0, Specialfilter.specialfilter(Arrays.asList(0)));
        assertEquals(0, Specialfilter.specialfilter(Arrays.asList(10)));
        assertEquals(0, Specialfilter.specialfilter(Arrays.asList(11)));
    }
}