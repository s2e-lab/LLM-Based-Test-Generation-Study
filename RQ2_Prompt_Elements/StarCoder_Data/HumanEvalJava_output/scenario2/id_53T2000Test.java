// AddTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Add}.
* It contains ten unit test cases for the {@link Add#add(int, int)} method.
*/
class AddTest {

    /**
     * Test case for {@link Add#add(int, int)} when x = 1 and y = 2.
     */
    @Test
    void testAdd1() {
        int x = 1;
        int y = 2;
        int expected = 3;
        int actual = Add.add(x, y);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link Add#add(int, int)} when x = 2 and y = 3.
     */
    @Test
    void testAdd2() {
        int x = 2;
        int y = 3;
        int expected = 5;
        int actual = Add.add(x, y);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link Add#add(int, int)} when x = 3 and y = 4.
     */
    @Test
    void testAdd3() {
        int x = 3;
        int y = 4;
        int expected = 7;
        int actual = Add.add(x, y);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link Add#add(int, int)} when x = 4 and y = 5.
     */
    @Test
    void testAdd4() {
        int x = 4;
        int y = 5;
        int expected = 9;
        int actual = Add.add(x, y);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link Add#add(int, int)} when x = 5 and y = 6.
     */
    @Test
    void testAdd5() {
        int x = 5;
        int y = 6;
        int expected = 11;
        int actual = Add.add(x, y);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link Add#add(int, int)} when x = 6 and y = 7.
     */
    @Test
    void testAdd6() {
        int x = 6;
        int y = 7;
        int expected = 13;
        int actual = Add.add(x, y);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link Add#add(int, int)} when x = 7 and y = 8.
     */
    @Test
    void testAdd7() {
        int x = 7;
        int y = 8;
        int expected = 15;
        int actual = Add.add(x, y);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link Add#add(int, int)} when x = 8 and y = 9.
     */
    @Test
    void testAdd8() {
        int x = 8;
        int y = 9;
        int expected = 17;
        int actual = Add.add(x, y);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link Add#add(int, int)} when x = 9 and y = 10.
     */
    @Test
    void testAdd9() {
        int x = 9;
        int y = 10;
        int expected = 19;
        int actual = Add.add(x, y);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link Add#add(int, int)} when x = 10 and y = 11.
     */
    @Test
    void testAdd10() {
        int x = 10;
        int y = 11;
        int expected = 21;
        int actual = Add.add(x, y);
        assertEquals(expected, actual);
    }
}
