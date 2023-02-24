package scenario3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
class StrlenTest {
    @Test
    void testStrlen() {
        assertEquals(0, Strlen.strlen(""));
        assertEquals(1, Strlen.strlen("x"));
        assertEquals(9, Strlen.strlen("asdasnakj"));
        assertEquals(3, Strlen.strlen("abc"));
        assertEquals(0, Strlen.strlen(""));
        assertEquals(1, Strlen.strlen("x"));
        assertEquals(9, Strlen.strlen("asdasnakj"));
        assertEquals(3, Strlen.strlen("abc"));
        assertEquals(0, Strlen.strlen(""));
        assertEquals(1, Strlen.strlen("x"));
        assertEquals(9, Strlen.strlen("asdasnakj"));
        assertEquals(3, Strlen.strlen("abc"));
    }
}