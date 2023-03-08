package scenario1;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IsHappyTest {

    @Test
    public void test() throws Exception {

        assertEquals(false, scenario1.IsHappy.isHappy("a"));
        assertEquals(false, scenario1.IsHappy.isHappy("aa"));
        assertEquals(true, scenario1.IsHappy.isHappy("abcd"));
        assertEquals(false, scenario1.IsHappy.isHappy("aabb"));
        assertEquals(true, scenario1.IsHappy.isHappy("adb"));
        assertEquals(false, scenario1.IsHappy.isHappy("xyy"));
        assertEquals(true, scenario1.IsHappy.isHappy("iopaxpoi"));
        assertEquals(false, scenario1.IsHappy.isHappy("iopaxioi"));

    }

}