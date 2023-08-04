// ModpTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Modp}.
* It contains ten unit test cases for the {@link Modp#modp(int, int)} method.
*/
class ModpTest {

    @Test
    void testModp1() {
        int n = 1;
        int p = 2;
        int expected = 1;
        int actual = Modp.modp(n, p);
        assertEquals(expected, actual);
    }

    @Test
    void testModp2() {
        int n = 2;
        int p = 2;
        int expected = 0;
        int actual = Modp.modp(n, p);
        assertEquals(expected, actual);
    }

    @Test
    void testModp3() {
        int n = 3;
        int p = 2;
        int expected = 1;
        int actual = Modp.modp(n, p);
        assertEquals(expected, actual);
    }

    @Test
    void testModp4() {
        int n = 4;
        int p = 2;
        int expected = 0;
        int actual = Modp.modp(n, p);
        assertEquals(expected, actual);
    }

    @Test
    void testModp5() {
        int n = 5;
        int p = 2;
        int expected = 1;
        int actual = Modp.modp(n, p);
        assertEquals(expected, actual);
    }

    @Test
    void testModp6() {
        int n = 6;
        int p = 2;
        int expected = 0;
        int actual = Modp.modp(n, p);
        assertEquals(expected, actual);
    }

    @Test
    void testModp7() {
        int n = 7;
        int p = 2;
        int expected = 1;
        int actual = Modp.modp(n, p);
        assertEquals(expected, actual);
    }

    @Test
    void testModp8() {
        int n = 8;
        int p = 2;
        int expected = 0;
        int actual = Modp.modp(n, p);
        assertEquals(expected, actual);
    }

    @Test
    void testModp9() {
        int n = 9;
        int p = 2;
        int expected = 1;
        int actual = Modp.modp(n, p);
        assertEquals(expected, actual);
    }

    @Test
    void testModp10() {
        int n = 10;
        int p = 2;
        int expected = 0;
        int actual = Modp.modp(n, p);
        assertEquals(expected, actual);
    }
}
