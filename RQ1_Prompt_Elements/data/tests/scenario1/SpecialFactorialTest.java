package scenario1;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SpecialFactorialTest {

    @Test
    public void test() throws Exception {

        assertEquals(288, scenario1.SpecialFactorial.specialFactorial(4));
        assertEquals(34560, scenario1.SpecialFactorial.specialFactorial(5));
        assertEquals(125411328000L, scenario1.SpecialFactorial.specialFactorial(7));
        assertEquals(1, scenario1.SpecialFactorial.specialFactorial(1));

    }

}