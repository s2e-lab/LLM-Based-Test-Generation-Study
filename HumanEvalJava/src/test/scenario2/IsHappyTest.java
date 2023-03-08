package scenario2;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IsHappyTest {

    @Test
    public void test() throws Exception {

        assertEquals(false, scenario2.IsHappy.isHappy("a"));
        assertEquals(false, scenario2.IsHappy.isHappy("aa"));
        assertEquals(true, scenario2.IsHappy.isHappy("abcd"));
        assertEquals(false, scenario2.IsHappy.isHappy("aabb"));
        assertEquals(true, scenario2.IsHappy.isHappy("adb"));
        assertEquals(false, scenario2.IsHappy.isHappy("xyy"));
        assertEquals(true, scenario2.IsHappy.isHappy("iopaxpoi"));
        assertEquals(false, scenario2.IsHappy.isHappy("iopaxioi"));

    }

}