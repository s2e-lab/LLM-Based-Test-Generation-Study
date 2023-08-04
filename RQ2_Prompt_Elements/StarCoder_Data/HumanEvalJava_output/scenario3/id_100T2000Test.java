// MakeAPileTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MakeAPile}.
* It contains ten unit test cases for the {@link MakeAPile#makeAPile(int)} method.
*/
class MakeAPileTest {

    /**
     * Test case for {@link MakeAPile#makeAPile(int)} with n = 3.
     */
    @Test
    void testMakeAPile3() {
        List<Integer> expected = List.of(3, 5, 7);
        assertEquals(expected, MakeAPile.makeAPile(3));
    }

    /**
     * Test case for {@link MakeAPile#makeAPile(int)} with n = 4.
     */
    @Test
    void testMakeAPile4() {
        List<Integer> expected = List.of(4, 6, 8, 10);
        assertEquals(expected, MakeAPile.makeAPile(4));
    }

    /**
     * Test case for {@link MakeAPile#makeAPile(int)} with n = 5.
     */
    @Test
    void testMakeAPile5() {
        List<Integer> expected = List.of(5, 7, 9, 11, 13);
        assertEquals(expected, MakeAPile.makeAPile(5));
    }

    /**
     * Test case for {@link MakeAPile#makeAPile(int)} with n = 6.
     */
    @Test
    void testMakeAPile6() {
        List<Integer> expected = List.of(6, 8, 10, 12, 14, 16);
        assertEquals(expected, MakeAPile.makeAPile(6));
    }

    /**
     * Test case for {@link MakeAPile#makeAPile(int)} with n = 8.
     */
    @Test
    void testMakeAPile8() {
        List<Integer> expected = List.of(8, 10, 12, 14, 16, 18, 20, 22);
        assertEquals(expected, MakeAPile.makeAPile(8));
    }

    /**
     * Test case for {@link MakeAPile#makeAPile(int)} with n = 1.
     */
    @Test
    void testMakeAPile1() {
        List<Integer> expected = List.of(1);
        assertEquals(expected, MakeAPile.makeAPile(1));
    }

    /**
     * Test case for {@link MakeAPile#makeAPile(int)} with n = 0.
     */
    @Test
    void testMakeAPile0() {
        List<Integer> expected = List.of();
        assertEquals(expected, MakeAPile.makeAPile(0));
    }

    /**
     * Test case for {@link MakeAPile#makeAPile(int)} with n = -1.
     */
    @Test
    void testMakeAPileNegative1() {
        List<Integer> expected = List.of();
        assertEquals(expected, MakeAPile.makeAPile(-1));
    }
}
