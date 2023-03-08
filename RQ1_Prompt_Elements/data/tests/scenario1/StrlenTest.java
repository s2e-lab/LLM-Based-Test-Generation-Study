package scenario1;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StrlenTest {

    @Test
    public void test() throws Exception {

        assertEquals(0, scenario1.Strlen.strlen(""));
        assertEquals(3, scenario1.Strlen.strlen("abc"));
        assertEquals(0, scenario1.Strlen.strlen(""));
        assertEquals(1, scenario1.Strlen.strlen("x"));
        assertEquals(9, scenario1.Strlen.strlen("asdasnakj"));

    }

}