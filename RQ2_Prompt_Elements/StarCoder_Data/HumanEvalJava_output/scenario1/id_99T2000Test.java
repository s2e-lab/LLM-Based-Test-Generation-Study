// ClosestIntegerTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClosestInteger}.
* It contains ten unit test cases for the {@link ClosestInteger#closestInteger(String)} method.
*/
class ClosestIntegerTest {

    @Test
    void testClosestInteger1() {
        assertEquals(0, ClosestInteger.closestInteger("0.0"));
    }

    @Test
    void testClosestInteger2() {
        assertEquals(1, ClosestInteger.closestInteger("1.0"));
    }

    @Test
    void testClosestInteger3() {
        assertEquals(1, ClosestInteger.closestInteger("1.1"));
    }

    @Test
    void testClosestInteger4() {
        assertEquals(1, ClosestInteger.closestInteger("1.2"));
    }

    @Test
    void testClosestInteger5() {
        assertEquals(1, ClosestInteger.closestInteger("1.3"));
    }

    @Test
    void testClosestInteger6() {
        assertEquals(1, ClosestInteger.closestInteger("1.4"));
    }

    @Test
    void testClosestInteger7() {
        assertEquals(1, ClosestInteger.closestInteger("1.5"));
    }

    @Test
    void testClosestInteger8() {
        assertEquals(2, ClosestInteger.closestInteger("2.0"));
    }

    @Test
    void testClosestInteger9() {
        assertEquals(2, ClosestInteger.closestInteger("2.1"));
    }

    @Test
    void testClosestInteger10() {
        assertEquals(2, ClosestInteger.closestInteger("2.2"));
    }
}
