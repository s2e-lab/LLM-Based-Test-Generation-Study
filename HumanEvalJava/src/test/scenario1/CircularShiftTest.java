package scenario1;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CircularShiftTest {

    @Test
    public void test() throws Exception {

        assertEquals("001", scenario1.CircularShift.circularShift(100, 2));
        assertEquals("12", scenario1.CircularShift.circularShift(12, 2));
        assertEquals("79", scenario1.CircularShift.circularShift(97, 8));
        assertEquals("21", scenario1.CircularShift.circularShift(12, 1));
        assertEquals("11", scenario1.CircularShift.circularShift(11, 101));

    }

}