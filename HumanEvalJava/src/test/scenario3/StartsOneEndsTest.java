package scenario3;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StartsOneEndsTest {

    @Test
    public void test() throws Exception {

        assertEquals(1, scenario3.StartsOneEnds.startsOneEnds(1));
        assertEquals(18, scenario3.StartsOneEnds.startsOneEnds(2));
        assertEquals(180, scenario3.StartsOneEnds.startsOneEnds(3));
        assertEquals(1800, scenario3.StartsOneEnds.startsOneEnds(4));
        assertEquals(18000, scenario3.StartsOneEnds.startsOneEnds(5));

    }

}