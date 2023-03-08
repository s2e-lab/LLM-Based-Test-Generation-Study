package scenario3;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountUpperTest {

    @Test
    public void test() throws Exception {

        assertEquals(0, scenario3.CountUpper.countUpper("abcdefg"));
        assertEquals(0, scenario3.CountUpper.countUpper("dBBE"));
        assertEquals(0, scenario3.CountUpper.countUpper(""));
        assertEquals(2, scenario3.CountUpper.countUpper("EEEE"));

    }

}