package Part3;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
class CycpatternCheckTest {
    @Test
    void cycpatternCheck() {
        assertEquals(false, CycpatternCheck.cycpatternCheck("xyzw", "xyw"));
        assertEquals(true, CycpatternCheck.cycpatternCheck("yello", "ell"));
        assertEquals(false, CycpatternCheck.cycpatternCheck("whattup", "ptut"));
        assertEquals(true, CycpatternCheck.cycpatternCheck("efef", "fee"));
        assertEquals(false, CycpatternCheck.cycpatternCheck("abab", "aabb"));
        assertEquals(true, CycpatternCheck.cycpatternCheck("winemtt", "tinem"));
        assertEquals(false, CycpatternCheck.cycpatternCheck("abcd", "abd"));
        assertEquals(true, CycpatternCheck.cycpatternCheck("hello", "ell"));
        assertEquals(false, CycpatternCheck.cycpatternCheck("whassup", "psus"));
        assertEquals(true, CycpatternCheck.cycpatternCheck("abab", "baa"));
        assertEquals(false, CycpatternCheck.cycpatternCheck("efef", "eeff"));
        assertEquals(true, CycpatternCheck.cycpatternCheck("himenss", "simen"));
    }
}