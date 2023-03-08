package scenario1;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolveTest {

    @Test
    public void test() throws Exception {

        assertEquals("aSdF", scenario1.Solve.solve("AsDf"));
        assertEquals("4321", scenario1.Solve.solve("1234"));
        assertEquals("AB", scenario1.Solve.solve("ab"));
        assertEquals("#A@c", scenario1.Solve.solve("#a@C"));
        assertEquals("#aSDFw^45", scenario1.Solve.solve("#AsdfW^45"));
        assertEquals("2@6#", scenario1.Solve.solve("#6@2"));
        assertEquals("#$A^d", scenario1.Solve.solve("#$a^D"));
        assertEquals("#CCC", scenario1.Solve.solve("#ccc"));

    }

}