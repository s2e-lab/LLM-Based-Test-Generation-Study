package scenario2;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solve1Test {

    @Test
    public void test() throws Exception {

        assertEquals("1", scenario2.Solve1.solve(1000));
        assertEquals("110", scenario2.Solve1.solve(150));
        assertEquals("1100", scenario2.Solve1.solve(147));
        assertEquals("1001", scenario2.Solve1.solve(333));
        assertEquals("10010", scenario2.Solve1.solve(963));

    }

}