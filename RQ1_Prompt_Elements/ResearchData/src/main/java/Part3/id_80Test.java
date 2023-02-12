package Part3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
class IsHappyTest {
    @Test
    void testIsHappy() {
        assertEquals(false, IsHappy.isHappy("a"));
        assertEquals(false, IsHappy.isHappy("aa"));
        assertEquals(true, IsHappy.isHappy("abcd"));
        assertEquals(false, IsHappy.isHappy("aabb"));
        assertEquals(true, IsHappy.isHappy("adb"));
        assertEquals(false, IsHappy.isHappy("xyy"));
        assertEquals(true, IsHappy.isHappy("iopaxpoi"));
        assertEquals(false, IsHappy.isHappy("iopaxioi"));
        assertEquals(false, IsHappy.isHappy(""));
        assertEquals(false, IsHappy.isHappy("aab"));
    }
}