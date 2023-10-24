// IsSimplePowerTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsSimplePower}.
* It contains ten unit test cases for the {@link IsSimplePower#isSimplePower(int, int)} method.
*/
class IsSimplePowerTest {

    /**
    * Test case for {@link IsSimplePower#isSimplePower(int, int)} where n is 1.
    */
    @Test
    void testIsSimplePower1() {
        assertTrue(IsSimplePower.isSimplePower(1, 1));
    }

    /**
    * Test case for {@link IsSimplePower#isSimplePower(int, int)} where n is 2.
    */
    @Test
    void testIsSimplePower2() {
        assertTrue(IsSimplePower.isSimplePower(4, 2));
    }

    /**
    * Test case for {@link IsSimplePower#isSimplePower(int, int)} where n is 3.
    */
    @Test
    void testIsSimplePower3() {
        assertTrue(IsSimplePower.isSimplePower(27, 3));
    }

    /**
    * Test case for {@link IsSimplePower#isSimplePower(int, int)} where n is 4.
    */
    @Test
    void testIsSimplePower4() {
        assertTrue(IsSimplePower.isSimplePower(256, 4));
    }

    /**
    * Test case for {@link IsSimplePower#isSimplePower(int, int)} where n is 5.
    */
    @Test
    void testIsSimplePower5() {
        assertTrue(IsSimplePower.isSimplePower(3125, 5));
    }

    /**
    * Test case for {@link IsSimplePower#isSimplePower(int, int)} where n is 6.
    */
    @Test
    void testIsSimplePower6() {
        assertTrue(IsSimplePower.isSimplePower(46656, 6));
    }

    /**
    * Test case for {@link IsSimplePower#isSimplePower(int, int)} where n is 7.
    */
    @Test
    void testIsSimplePower7() {
        assertTrue(IsSimplePower.isSimplePower(823543, 7));
    }

    /**
    * Test case for {@link IsSimplePower#isSimplePower(int, int)} where n is 8.
    */
    @Test
    void testIsSimplePower8() {
        assertTrue(IsSimplePower.isSimplePower(16777216, 8));
    }

    /**
    * Test case for {@link IsSimplePower#isSimplePower(int, int)} where n is 9.
    */
    @Test
    void testIsSimplePower9() {
        assertTrue(IsSimplePower.isSimplePower(387420489, 9));
    }

    /**
    * Test case for {@link IsSimplePower#isSimplePower(int, int)} where n is 10.
    */
    @Test
    void testIsSimplePower10() {
        assertTrue(IsSimplePower.isSimplePower(1000000000, 10));
    }

    /**
    * Test case for {@link IsSimplePower#isSimplePower(int, int)} where n is 11.
    */
    @Test
    void testIsSimplePower11() {
        assertFalse(IsSimplePower.isSimplePower(1000000000, 11));
    }

    /**
    * Test case for {@link IsSimplePower#isSimplePower(int, int)} where n is 12.
    */
    @Test
    void testIsSimplePower12() {
        assertFalse(IsSimplePower.isSimplePower(1000000000, 12));
    }

    /**
    * Test case for {@link IsSimplePower#isSimplePower(int, int)} where n is 13.
    */
    @Test
    void testIsSimplePower13() {
        assertFalse(IsSimplePower.isSimplePower(1000000000, 13));
    }

    /**
    * Test case for {@link IsSimplePower#isSimplePower(int, int)} where n is 14.
    */
    @Test
    void testIsSimplePower14() {
        assertFalse(IsSimplePower.isSimplePower(1000000000, 14));
    }

    /**
    * Test case for {@link IsSimplePower#isSimplePower(int, int)} where n is 15.
    */
    @Test
    void testIsSimplePower15() {
        assertFalse(IsSimplePower.isSimplePower(1000000000, 15));
    }

    /**
    * Test case for {@link IsSimplePower#isSimplePower(int, int)} where n is 16.
    */
    @Test
    void testIsSimplePower16() {
        assertFalse(IsSimplePower.isSimplePower(1000000000, 16));
    }

    /**
    * Test case for {@link IsSimplePower#isSimplePower(int, int)} where n is 17.
    */
    @Test
    void testIsSimplePower17() {
        assertFalse(IsSimplePower.isSimplePower(1000000000, 17));
    }

    /**
    * Test case for {@link IsSimplePower#isSimplePower(int, int)} where n is 18.
    */
    @Test
    void testIsSimplePower18() {
        assertFalse(IsSimplePower.isSimplePower(1000000000, 18));
    }

    /**
    * Test case for {@link IsSimplePower#isSimplePower(int, int)} where n is 19.
    */
    @Test
    void testIsSimplePower19() {
        assertFalse(IsSimplePower.isSimplePower(1000000000, 19));
    }

    /**
    * Test case for {@link IsSimplePower#isSimplePower(int, int)} where n is 20.
    */
    @Test
    void testIsSimplePower20() {
        assertFalse(IsSimplePower.isSimplePower(1000000000, 20));
    }
}
