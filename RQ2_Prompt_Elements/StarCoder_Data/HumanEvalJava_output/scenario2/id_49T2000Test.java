// ModpTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Modp}.
* It contains ten unit test cases for the {@link Modp#modp(int, int)} method.
*/
class ModpTest {

    /**
     * Test of {@link Modp#modp(int, int)} with n = 0.
     */
    @Test
    void testModp0() {
        int n = 0;
        int p = 10;
        int expected = 1;
        int actual = Modp.modp(n, p);
        assertEquals(expected, actual);
    }

    /**
     * Test of {@link Modp#modp(int, int)} with n = 1.
     */
    @Test
    void testModp1() {
        int n = 1;
        int p = 10;
        int expected = 2;
        int actual = Modp.modp(n, p);
        assertEquals(expected, actual);
    }

    /**
     * Test of {@link Modp#modp(int, int)} with n = 2.
     */
    @Test
    void testModp2() {
        int n = 2;
        int p = 10;
        int expected = 4;
        int actual = Modp.modp(n, p);
        assertEquals(expected, actual);
    }

    /**
     * Test of {@link Modp#modp(int, int)} with n = 3.
     */
    @Test
    void testModp3() {
        int n = 3;
        int p = 10;
        int expected = 8;
        int actual = Modp.modp(n, p);
        assertEquals(expected, actual);
    }

    /**
     * Test of {@link Modp#modp(int, int)} with n = 4.
     */
    @Test
    void testModp4() {
        int n = 4;
        int p = 10;
        int expected = 1;
        int actual = Modp.modp(n, p);
        assertEquals(expected, actual);
    }

    /**
     * Test of {@link Modp#modp(int, int)} with n = 5.
     */
    @Test
    void testModp5() {
        int n = 5;
        int p = 10;
        int expected = 2;
        int actual = Modp.modp(n, p);
        assertEquals(expected, actual);
    }

    /**
     * Test of {@link Modp#modp(int, int)} with n = 6.
     */
    @Test
    void testModp6() {
        int n = 6;
        int p = 10;
        int expected = 4;
        int actual = Modp.modp(n, p);
        assertEquals(expected, actual);
    }

    /**
     * Test of {@link Modp#modp(int, int)} with n = 7.
     */
    @Test
    void testModp7() {
        int n = 7;
        int p = 10;
        int expected = 8;
        int actual = Modp.modp(n, p);
        assertEquals(expected, actual);
    }

    /**
     * Test of {@link Modp#modp(int, int)} with n = 8.
     */
    @Test
    void testModp8() {
        int n = 8;
        int p = 10;
        int expected = 1;
        int actual = Modp.modp(n, p);
        assertEquals(expected, actual);
    }

    /**
     * Test of {@link Modp#modp(int, int)} with n = 9.
     */
    @Test
    void testModp9() {
        int n = 9;
        int p = 10;
        int expected = 2;
        int actual = Modp.modp(n, p);
        assertEquals(expected, actual);
    }
}
