package scenario1;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ChangeBaseTest {

    @Test
    public void test() throws Exception {

        assertEquals("22", scenario1.ChangeBase.changeBase(8, 3));
        assertEquals("1000", scenario1.ChangeBase.changeBase(8, 2));
        assertEquals("111", scenario1.ChangeBase.changeBase(7, 2));
        assertEquals("22", scenario1.ChangeBase.changeBase(8, 3));
        assertEquals("100", scenario1.ChangeBase.changeBase(9, 3));
        assertEquals("11101010", scenario1.ChangeBase.changeBase(234, 2));
        assertEquals("10000", scenario1.ChangeBase.changeBase(16, 2));
        assertEquals("1000", scenario1.ChangeBase.changeBase(8, 2));
        assertEquals("111", scenario1.ChangeBase.changeBase(7, 2));
        assertEquals("2", scenario1.ChangeBase.changeBase(2, 3));
        assertEquals("3", scenario1.ChangeBase.changeBase(3, 4));
        assertEquals("4", scenario1.ChangeBase.changeBase(4, 5));
        assertEquals("5", scenario1.ChangeBase.changeBase(5, 6));
        assertEquals("6", scenario1.ChangeBase.changeBase(6, 7));
        assertEquals("7", scenario1.ChangeBase.changeBase(7, 8));

    }

}