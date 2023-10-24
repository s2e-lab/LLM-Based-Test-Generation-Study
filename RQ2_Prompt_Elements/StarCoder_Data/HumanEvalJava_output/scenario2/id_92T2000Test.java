// AnyIntTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AnyInt}.
* It contains ten unit test cases for the {@link AnyInt#anyInt(Number, Number, Number)} method.
*/
class AnyIntTest {

    /**
     * Test case for {@link AnyInt#anyInt(Number, Number, Number)} where all numbers are integers.
     */
    @Test
    void testAnyInt_allIntegers() {
        assertTrue(AnyInt.anyInt(1, 2, 3));
    }

    /**
     * Test case for {@link AnyInt#anyInt(Number, Number, Number)} where one of the numbers is equal to the sum of the other two.
     */
    @Test
    void testAnyInt_oneEqualSum() {
        assertTrue(AnyInt.anyInt(1, 2, 3));
    }

    /**
     * Test case for {@link AnyInt#anyInt(Number, Number, Number)} where none of the numbers is equal to the sum of the other two.
     */
    @Test
    void testAnyInt_noneEqualSum() {
        assertFalse(AnyInt.anyInt(1, 2, 4));
    }

    /**
     * Test case for {@link AnyInt#anyInt(Number, Number, Number)} where one of the numbers is not an integer.
     */
    @Test
    void testAnyInt_oneNotInteger() {
        assertFalse(AnyInt.anyInt(1, 2, 3.14));
    }

    /**
     * Test case for {@link AnyInt#anyInt(Number, Number, Number)} where none of the numbers is an integer.
     */
    @Test
    void testAnyInt_noneIntegers() {
        assertFalse(AnyInt.anyInt(1, 2.71, 3.14));
    }

    /**
     * Test case for {@link AnyInt#anyInt(Number, Number, Number)} where one of the numbers is null.
     */
    @Test
    void testAnyInt_oneNull() {
        assertFalse(AnyInt.anyInt(1, null, 3));
    }

    /**
     * Test case for {@link AnyInt#anyInt(Number, Number, Number)} where none of the numbers is null.
     */
    @Test
    void testAnyInt_noneNull() {
        assertFalse(AnyInt.anyInt(1, 2, null));
    }

    /**
     * Test case for {@link AnyInt#anyInt(Number, Number, Number)} where all numbers are null.
     */
    @Test
    void testAnyInt_allNull() {
        assertFalse(AnyInt.anyInt(null, null, null));
    }
}
