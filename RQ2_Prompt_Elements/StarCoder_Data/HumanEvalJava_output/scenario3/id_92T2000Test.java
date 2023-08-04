// AnyIntTest.java
package scenario3;


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
        assertTrue(AnyInt.anyInt(5, 2, 7));
    }

    /**
    * Test case for {@link AnyInt#anyInt(Number, Number, Number)} where one of the numbers is equal to the sum of the other two.
    */
    @Test
    void testAnyInt_oneNumberEqualToSumOfOtherTwo() {
        assertFalse(AnyInt.anyInt(3, 2, 2));
    }

    /**
    * Test case for {@link AnyInt#anyInt(Number, Number, Number)} where one of the numbers is equal to the sum of the other two.
    */
    @Test
    void testAnyInt_oneNumberEqualToSumOfOtherTwo_2() {
        assertTrue(AnyInt.anyInt(3, -2, 1));
    }

    /**
    * Test case for {@link AnyInt#anyInt(Number, Number, Number)} where one of the numbers is equal to the sum of the other two.
    */
    @Test
    void testAnyInt_oneNumberEqualToSumOfOtherTwo_3() {
        assertFalse(AnyInt.anyInt(3.6, -2.2, 2));
    }

    /**
    * Test case for {@link AnyInt#anyInt(Number, Number, Number)} where one of the numbers is equal to the sum of the other two.
    */
    @Test
    void testAnyInt_oneNumberEqualToSumOfOtherTwo_4() {
        assertFalse(AnyInt.anyInt(2, 3, 1));
    }

    /**
    * Test case for {@link AnyInt#anyInt(Number, Number, Number)} where one of the numbers is equal to the sum of the other two.
    */
    @Test
    void testAnyInt_oneNumberEqualToSumOfOtherTwo_5() {
        assertFalse(AnyInt.anyInt(2.5, 2, 3));
    }

    /**
    * Test case for {@link AnyInt#anyInt(Number, Number, Number)} where one of the numbers is equal to the sum of the other two.
    */
    @Test
    void testAnyInt_oneNumberEqualToSumOfOtherTwo_6() {
        assertFalse(AnyInt.anyInt(1.5, 5, 3.5));
    }

    /**
    * Test case for {@link AnyInt#anyInt(Number, Number, Number)} where one of the numbers is equal to the sum of the other two.
    */
    @Test
    void testAnyInt_oneNumberEqualToSumOfOtherTwo_7() {
        assertFalse(AnyInt.anyInt(2, 6, 2));
    }

    /**
    * Test case for {@link AnyInt#anyInt(Number, Number, Number)} where one of the numbers is equal to the sum of the other two.
    */
    @Test
    void testAnyInt_oneNumberEqualToSumOfOtherTwo_8() {
        assertTrue(AnyInt.anyInt(4, 2, 2));
    }

    /**
    * Test case for {@link AnyInt#anyInt(Number, Number, Number)} where one of the numbers is equal to the sum of the other two.
    */
    @Test
    void testAnyInt_oneNumberEqualToSumOfOtherTwo_9() {
        assertFalse(AnyInt.anyInt(2.2, 2.2, 2.2));
    }

    /**
    * Test case for {@link AnyInt#anyInt(Number, Number, Number)} where one of the numbers is equal to the sum of the other two.
    */
    @Test
    void testAnyInt_oneNumberEqualToSumOfOtherTwo_10() {
        assertTrue(AnyInt.anyInt(-4, 6, 2));
    }

    /**
    * Test case for {@link AnyInt#anyInt(Number, Number, Number)} where one of the numbers is equal to the sum of the other two.
    */
    @Test
    void testAnyInt_oneNumberEqualToSumOfOtherTwo_11() {
        assertTrue(AnyInt.anyInt(2, 1, 1));
    }

    /**
    * Test case for {@link AnyInt#anyInt(Number, Number, Number)} where one of the numbers is equal to the sum of the other two.
    */
    @Test
    void testAnyInt_oneNumberEqualToSumOfOtherTwo_12() {
        assertTrue(AnyInt.anyInt(3, 4, 7));
    }

    /**
    * Test case for {@link AnyInt#anyInt(Number, Number, Number)} where one of the numbers is equal to the sum of the other two.
    */
    @Test
    void testAnyInt_oneNumberEqualToSumOfOtherTwo_13() {
        assertFalse(AnyInt.anyInt(3.0, 4, 7));
    }
}
