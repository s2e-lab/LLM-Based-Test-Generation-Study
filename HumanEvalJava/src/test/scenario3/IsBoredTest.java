package scenario3;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IsBoredTest {

    @Test
    public void test() throws Exception {

        assertEquals(0, scenario3.IsBored.isBored("Hello world"));
        assertEquals(0, scenario3.IsBored.isBored("Is the sky blue?"));
        assertEquals(1, scenario3.IsBored.isBored("I love It !"));
        assertEquals(0, scenario3.IsBored.isBored("bIt"));
        assertEquals(2, scenario3.IsBored.isBored("I feel good today. I will be productive. will kill It"));
        assertEquals(0, scenario3.IsBored.isBored("You and I are going for a walk"));

    }

}