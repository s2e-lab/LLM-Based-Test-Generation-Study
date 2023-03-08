package scenario2;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HowManyTimesTest {

    @Test
    public void test() throws Exception {

        assertEquals(0, scenario2.HowManyTimes.howManyTimes("", "a"));
        assertEquals(3, scenario2.HowManyTimes.howManyTimes("aaa", "a"));
        assertEquals(3, scenario2.HowManyTimes.howManyTimes("aaaa", "aa"));
        assertEquals(0, scenario2.HowManyTimes.howManyTimes("", "x"));
        assertEquals(4, scenario2.HowManyTimes.howManyTimes("xyxyxyx", "x"));
        assertEquals(4, scenario2.HowManyTimes.howManyTimes("cacacacac", "cac"));
        assertEquals(1, scenario2.HowManyTimes.howManyTimes("john doe", "john"));

    }

}