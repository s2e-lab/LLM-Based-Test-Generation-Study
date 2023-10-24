// IsEqualToSumEvenTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsEqualToSumEven}.
* It contains ten unit test cases for the {@link IsEqualToSumEven#isEqualToSumEven(int)} method.
*/
class IsEqualToSumEvenTest {

    @Test
    void testIsEqualToSumEven1() {
        assertEquals(false, IsEqualToSumEven.isEqualToSumEven(1));
    }

    @Test
    void testIsEqualToSumEven2() {
        assertEquals(false, IsEqualToSumEven.isEqualToSumEven(2));
    }

    @Test
    void testIsEqualToSumEven3() {
        assertEquals(false, IsEqualToSumEven.isEqualToSumEven(3));
    }

    @Test
    void testIsEqualToSumEven4() {
        assertEquals(false, IsEqualToSumEven.isEqualToSumEven(4));
    }

    @Test
    void testIsEqualToSumEven5() {
        assertEquals(false, IsEqualToSumEven.isEqualToSumEven(5));
    }

    @Test
    void testIsEqualToSumEven6() {
        assertEquals(false, IsEqualToSumEven.isEqualToSumEven(6));
    }

    @Test
    void testIsEqualToSumEven7() {
        assertEquals(false, IsEqualToSumEven.isEqualToSumEven(7));
    }

    @Test
    void testIsEqualToSumEven8() {
        assertEquals(true, IsEqualToSumEven.isEqualToSumEven(8));
    }

    @Test
    void testIsEqualToSumEven9() {
        assertEquals(false, IsEqualToSumEven.isEqualToSumEven(9));
    }

    @Test
    void testIsEqualToSumEven10() {
        assertEquals(false, IsEqualToSumEven.isEqualToSumEven(10));
    }
}
