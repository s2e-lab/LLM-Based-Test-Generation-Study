package scenario3;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StrlenTest {

    @Test
    public void test() throws Exception {

        assertEquals(0, scenario3.Strlen.strlen(""));
        assertEquals(3, scenario3.Strlen.strlen("abc"));
        assertEquals(0, scenario3.Strlen.strlen(""));
        assertEquals(1, scenario3.Strlen.strlen("x"));
        assertEquals(9, scenario3.Strlen.strlen("asdasnakj"));

    }

}