package scenario2;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {

    @Test
    public void test() throws Exception {

        assertEquals(0, scenario2.FizzBuzz.fizzBuzz(50));
        assertEquals(2, scenario2.FizzBuzz.fizzBuzz(78));
        assertEquals(3, scenario2.FizzBuzz.fizzBuzz(79));
        assertEquals(0, scenario2.FizzBuzz.fizzBuzz(50));
        assertEquals(2, scenario2.FizzBuzz.fizzBuzz(78));
        assertEquals(3, scenario2.FizzBuzz.fizzBuzz(79));
        assertEquals(3, scenario2.FizzBuzz.fizzBuzz(100));
        assertEquals(6, scenario2.FizzBuzz.fizzBuzz(200));
        assertEquals(192, scenario2.FizzBuzz.fizzBuzz(4000));
        assertEquals(639, scenario2.FizzBuzz.fizzBuzz(10000));
        assertEquals(8026, scenario2.FizzBuzz.fizzBuzz(100000));

    }

}