// IsSimplePowerTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsSimplePower}.
* It contains ten unit test cases for the {@link IsSimplePower#isSimplePower(int, int)} method.
*/
class IsSimplePowerTest {

    @Test
    void testIsSimplePower1() {
        assertTrue(IsSimplePower.isSimplePower(1, 1));
    }

    @Test
    void testIsSimplePower2() {
        assertTrue(IsSimplePower.isSimplePower(2, 2));
    }

    @Test
    void testIsSimplePower3() {
        assertTrue(IsSimplePower.isSimplePower(4, 2));
    }

    @Test
    void testIsSimplePower4() {
        assertTrue(IsSimplePower.isSimplePower(8, 2));
    }

    @Test
    void testIsSimplePower5() {
        assertTrue(IsSimplePower.isSimplePower(16, 2));
    }

    @Test
    void testIsSimplePower6() {
        assertTrue(IsSimplePower.isSimplePower(32, 2));
    }

    @Test
    void testIsSimplePower7() {
        assertTrue(IsSimplePower.isSimplePower(64, 2));
    }

    @Test
    void testIsSimplePower8() {
        assertTrue(IsSimplePower.isSimplePower(128, 2));
    }

    @Test
    void testIsSimplePower9() {
        assertTrue(IsSimplePower.isSimplePower(256, 2));
    }

    @Test
    void testIsSimplePower10() {
        assertTrue(IsSimplePower.isSimplePower(512, 2));
    }
}
