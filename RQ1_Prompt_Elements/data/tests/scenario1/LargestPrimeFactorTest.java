package scenario1;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LargestPrimeFactorTest {

    @Test
    public void test() throws Exception {

        assertEquals(2, scenario1.LargestPrimeFactor.largestPrimeFactor(2048));
        assertEquals(5, scenario1.LargestPrimeFactor.largestPrimeFactor(15));
        assertEquals(3, scenario1.LargestPrimeFactor.largestPrimeFactor(27));
        assertEquals(7, scenario1.LargestPrimeFactor.largestPrimeFactor(63));
        assertEquals(11, scenario1.LargestPrimeFactor.largestPrimeFactor(330));
        assertEquals(29, scenario1.LargestPrimeFactor.largestPrimeFactor(13195));

    }

}