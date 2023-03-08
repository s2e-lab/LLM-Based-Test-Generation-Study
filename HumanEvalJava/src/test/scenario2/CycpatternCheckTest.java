package scenario2;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CycpatternCheckTest {

    @Test
    public void test() throws Exception {

        assertEquals(false, scenario2.CycpatternCheck.cycpatternCheck("xyzw", "xyw"));
        assertEquals(true, scenario2.CycpatternCheck.cycpatternCheck("yello", "ell"));
        assertEquals(false, scenario2.CycpatternCheck.cycpatternCheck("whattup", "ptut"));
        assertEquals(true, scenario2.CycpatternCheck.cycpatternCheck("efef", "fee"));
        assertEquals(false, scenario2.CycpatternCheck.cycpatternCheck("abab", "aabb"));
        assertEquals(true, scenario2.CycpatternCheck.cycpatternCheck("winemtt", "tinem"));

    }

}