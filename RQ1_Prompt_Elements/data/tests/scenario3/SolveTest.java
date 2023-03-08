package scenario3;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolveTest {

    @Test
    public void test() throws Exception {

        assertEquals("aSdF", scenario3.Solve.solve("AsDf"));
        assertEquals("4321", scenario3.Solve.solve("1234"));
        assertEquals("AB", scenario3.Solve.solve("ab"));
        assertEquals("#A@c", scenario3.Solve.solve("#a@C"));
        assertEquals("#aSDFw^45", scenario3.Solve.solve("#AsdfW^45"));
        assertEquals("2@6#", scenario3.Solve.solve("#6@2"));
        assertEquals("#$A^d", scenario3.Solve.solve("#$a^D"));
        assertEquals("#CCC", scenario3.Solve.solve("#ccc"));

    }

}