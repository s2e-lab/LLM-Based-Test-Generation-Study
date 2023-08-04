// IsEqualToSumEvenTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsEqualToSumEven}.
* It contains ten unit test cases for the {@link IsEqualToSumEven#isEqualToSumEven(int)} method.
*/
class IsEqualToSumEvenTest {

    /**
     * Test case for {@link IsEqualToSumEven#isEqualToSumEven(int)}.
     */
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
    }
}
