package scenario1;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CycpatternCheckTest {

    @Test
    public void test() throws Exception {

        assertEquals(false, scenario1.CycpatternCheck.cycpatternCheck("xyzw", "xyw"));
        assertEquals(true, scenario1.CycpatternCheck.cycpatternCheck("yello", "ell"));
        assertEquals(false, scenario1.CycpatternCheck.cycpatternCheck("whattup", "ptut"));
        assertEquals(true, scenario1.CycpatternCheck.cycpatternCheck("efef", "fee"));
        assertEquals(false, scenario1.CycpatternCheck.cycpatternCheck("abab", "aabb"));
        assertEquals(true, scenario1.CycpatternCheck.cycpatternCheck("winemtt", "tinem"));

    }

}