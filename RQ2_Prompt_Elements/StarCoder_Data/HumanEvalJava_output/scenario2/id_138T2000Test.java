// IsEqualToSumEvenTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsEqualToSumEven}.
* It contains ten unit test cases for the {@link IsEqualToSumEven#isEqualToSumEven(int)} method.
*/
class IsEqualToSumEvenTest {

    /**
     * Test case for {@link IsEqualToSumEven#isEqualToSumEven(int)} with n = 10
     */
    @Test
    void testIsEqualToSumEven10() {
        assertTrue(IsEqualToSumEven.isEqualToSumEven(10));
    }

    /**
     * Test case for {@link IsEqualToSumEven#isEqualToSumEven(int)} with n = 12
     */
    @Test
    void testIsEqualToSumEven12() {
        assertFalse(IsEqualToSumEven.isEqualToSumEven(12));
    }

    /**
     * Test case for {@link IsEqualToSumEven#isEqualToSumEven(int)} with n = 14
     */
    @Test
    void testIsEqualToSumEven14() {
        assertTrue(IsEqualToSumEven.isEqualToSumEven(14));
    }

    /**
     * Test case for {@link IsEqualToSumEven#isEqualToSumEven(int)} with n = 16
     */
    @Test
    void testIsEqualToSumEven16() {
        assertFalse(IsEqualToSumEven.isEqualToSumEven(16));
    }

    /**
     * Test case for {@link IsEqualToSumEven#isEqualToSumEven(int)} with n = 18
     */
    @Test
    void testIsEqualToSumEven18() {
        assertTrue(IsEqualToSumEven.isEqualToSumEven(18));
    }

    /**
     * Test case for {@link IsEqualToSumEven#isEqualToSumEven(int)} with n = 20
     */
    @Test
    void testIsEqualToSumEven20() {
        assertFalse(IsEqualToSumEven.isEqualToSumEven(20));
    }

    /**
     * Test case for {@link IsEqualToSumEven#isEqualToSumEven(int)} with n = 22
     */
    @Test
    void testIsEqualToSumEven22() {
        assertTrue(IsEqualToSumEven.isEqualToSumEven(22));
    }

    /**
     * Test case for {@link IsEqualToSumEven#isEqualToSumEven(int)} with n = 24
     */
    @Test
    void testIsEqualToSumEven24() {
        assertFalse(IsEqualToSumEven.isEqualToSumEven(24));
    }

    /**
     * Test case for {@link IsEqualToSumEven#isEqualToSumEven(int)} with n = 26
     */
    @Test
    void testIsEqualToSumEven26() {
        assertTrue(IsEqualToSumEven.isEqualToSumEven(26));
    }
}
