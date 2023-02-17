package Part3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
class IsEqualToSumEvenTest {
    @Test
    void testIsEqualToSumEven() {
        assertEquals(false, IsEqualToSumEven.isEqualToSumEven(4));
        assertEquals(false, IsEqualToSumEven.isEqualToSumEven(6));
        assertEquals(true, IsEqualToSumEven.isEqualToSumEven(8));
        assertEquals(true, IsEqualToSumEven.isEqualToSumEven(10));
        assertEquals(false, IsEqualToSumEven.isEqualToSumEven(11));
        assertEquals(true, IsEqualToSumEven.isEqualToSumEven(12));
        assertEquals(false, IsEqualToSumEven.isEqualToSumEven(13));
        assertEquals(true, IsEqualToSumEven.isEqualToSumEven(16));
        assertEquals(false, IsEqualToSumEven.isEqualToSumEven(17));
        assertEquals(true, IsEqualToSumEven.isEqualToSumEven(18));
    }
}