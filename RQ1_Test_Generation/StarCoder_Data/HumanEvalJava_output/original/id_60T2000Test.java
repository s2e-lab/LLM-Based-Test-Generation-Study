// SumToNTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumToN}.
* It contains ten unit test cases for the {@link SumToN#sumToN(int)} method.
*/
class SumToNTest {

    /**
     * Test case for {@link SumToN#sumToN(int)}.
     */
    @Test
    void testSumToN() {
        assertEquals(15, SumToN.sumToN(5));
        assertEquals(55, SumToN.sumToN(10));
        assertEquals(1, SumToN.sumToN(1));
        assertEquals(21, SumToN.sumToN(6));
        assertEquals(66, SumToN.sumToN(11));
        assertEquals(465, SumToN.sumToN(30));
        assertEquals(5050, SumToN.sumToN(100));
    }
}
