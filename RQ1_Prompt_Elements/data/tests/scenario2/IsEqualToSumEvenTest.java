package scenario2;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IsEqualToSumEvenTest {

    @Test
    public void test() throws Exception {

        assertEquals(false, scenario2.IsEqualToSumEven.isEqualToSumEven(4));
        assertEquals(false, scenario2.IsEqualToSumEven.isEqualToSumEven(6));
        assertEquals(true, scenario2.IsEqualToSumEven.isEqualToSumEven(8));
        assertEquals(true, scenario2.IsEqualToSumEven.isEqualToSumEven(10));
        assertEquals(false, scenario2.IsEqualToSumEven.isEqualToSumEven(11));
        assertEquals(true, scenario2.IsEqualToSumEven.isEqualToSumEven(12));
        assertEquals(false, scenario2.IsEqualToSumEven.isEqualToSumEven(13));
        assertEquals(true, scenario2.IsEqualToSumEven.isEqualToSumEven(16));

    }

}