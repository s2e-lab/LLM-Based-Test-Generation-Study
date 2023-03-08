package scenario3;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IsHappyTest {

    @Test
    public void test() throws Exception {

        assertEquals(false, scenario3.IsHappy.isHappy("a"));
        assertEquals(false, scenario3.IsHappy.isHappy("aa"));
        assertEquals(true, scenario3.IsHappy.isHappy("abcd"));
        assertEquals(false, scenario3.IsHappy.isHappy("aabb"));
        assertEquals(true, scenario3.IsHappy.isHappy("adb"));
        assertEquals(false, scenario3.IsHappy.isHappy("xyy"));
        assertEquals(true, scenario3.IsHappy.isHappy("iopaxpoi"));
        assertEquals(false, scenario3.IsHappy.isHappy("iopaxioi"));

    }

}