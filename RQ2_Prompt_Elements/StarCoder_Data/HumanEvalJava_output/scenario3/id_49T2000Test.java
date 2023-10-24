// ModpTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Modp}.
* It contains ten unit test cases for the {@link Modp#modp(int, int)} method.
*/
class ModpTest {

    /**
     * Test of {@link Modp#modp(int, int)} with n = 3, p = 5.
     */
    @Test
    void testModp35() {
        int n = 3;
        int p = 5;
        int expected = 3;
        int actual = Modp.modp(n, p);
        assertEquals(expected, actual);
    }

    /**
     * Test of {@link Modp#modp(int, int)} with n = 1101, p = 101.
     */
    @Test
    void testModp1101101() {
        int n = 1101;
        int p = 101;
        int expected = 2;
        int actual = Modp.modp(n, p);
        assertEquals(expected, actual);
    }

    /**
     * Test of {@link Modp#modp(int, int)} with n = 0, p = 101.
     */
    @Test
    void testModp0101() {
        int n = 0;
        int p = 101;
        int expected = 1;
        int actual = Modp.modp(n, p);
        assertEquals(expected, actual);
    }

    /**
     * Test of {@link Modp#modp(int, int)} with n = 3, p = 11.
     */
    @Test
    void testModp311() {
        int n = 3;
        int p = 11;
        int expected = 8;
        int actual = Modp.modp(n, p);
        assertEquals(expected, actual);
    }

    /**
     * Test of {@link Modp#modp(int, int)} with n = 100, p = 101.
     */
    @Test
    void testModp100101() {
        int n = 100;
        int p = 101;
        int expected = 1;
        int actual = Modp.modp(n, p);
        assertEquals(expected, actual);
    }

    /**
     * Test of {@link Modp#modp(int, int)} with n = 30, p = 5.
     */
    @Test
    void testModp305() {
        int n = 30;
        int p = 5;
        int expected = 4;
        int actual = Modp.modp(n, p);
        assertEquals(expected, actual);
    }

    /**
     * Test of {@link Modp#modp(int, int)} with n = 31, p = 5.
     */
    @Test
    void testModp315() {
        int n = 31;
        int p = 5;
        int expected = 3;
        int actual = Modp.modp(n, p);
        assertEquals(expected, actual);
    }
}
