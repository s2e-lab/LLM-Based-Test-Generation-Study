// AddTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Add}.
* It contains ten unit test cases for the {@link Add#add(int, int)} method.
*/
class AddTest {

    /**
     * Test case for {@link Add#add(int, int)} with x = 0 and y = 1.
     */
    @Test
    void testAdd01() {
        int x = 0;
        int y = 1;
        int expected = 1;
        int actual = Add.add(x, y);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link Add#add(int, int)} with x = 1 and y = 0.
     */
    @Test
    void testAdd02() {
        int x = 1;
        int y = 0;
        int expected = 1;
        int actual = Add.add(x, y);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link Add#add(int, int)} with x = 2 and y = 3.
     */
    @Test
    void testAdd03() {
        int x = 2;
        int y = 3;
        int expected = 5;
        int actual = Add.add(x, y);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link Add#add(int, int)} with x = 5 and y = 7.
     */
    @Test
    void testAdd04() {
        int x = 5;
        int y = 7;
        int expected = 12;
        int actual = Add.add(x, y);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link Add#add(int, int)} with x = 7 and y = 5.
     */
    @Test
    void testAdd05() {
        int x = 7;
        int y = 5;
        int expected = 12;
        int actual = Add.add(x, y);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link Add#add(int, int)} with x = 572 and y = 725.
     */
    @Test
    void testAdd06() {
        int x = 572;
        int y = 725;
        int expected = 1297;
        int actual = Add.add(x, y);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link Add#add(int, int)} with x = 51 and y = 804.
     */
    @Test
    void testAdd07() {
        int x = 51;
        int y = 804;
        int expected = 855;
        int actual = Add.add(x, y);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link Add#add(int, int)} with x = 645 and y = 96.
     */
    @Test
    void testAdd08() {
        int x = 645;
        int y = 96;
        int expected = 741;
        int actual = Add.add(x, y);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link Add#add(int, int)} with x = 712 and y = 853.
     */
    @Test
    void testAdd09() {
        int x = 712;
        int y = 853;
        int expected = 1565;
        int actual = Add.add(x, y);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link Add#add(int, int)} with x = 223 and y = 101.
     */
    @Test
    void testAdd10() {
        int x = 223;
        int y = 101;
        int expected = 324;
        int actual = Add.add(x, y);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link Add#add(int, int)} with x = 76 and y = 29.
     */
    @Test
    void testAdd11() {
        int x = 76;
        int y = 29;
        int expected = 105;
        int actual = Add.add(x, y);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link Add#add(int, int)} with x = 416 and y = 149.
     */
    @Test
    void testAdd12() {
        int x = 416;
        int y = 149;
        int expected = 565;
        int actual = Add.add(x, y);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link Add#add(int, int)} with x = 145 and y = 409.
     */
    @Test
    void testAdd13() {
        int x = 145;
        int y = 409;
        int expected = 554;
        int actual = Add.add(x, y);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link Add#add(int, int)} with x = 535 and y = 430.
     */
    @Test
    void testAdd14() {
        int x = 535;
        int y = 430;
        int expected = 965;
        int actual = Add.add(x, y);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link Add#add(int, int)} with x = 118 and y = 303.
     */
    @Test
    void testAdd15() {
        int x = 118;
        int y = 303;
        int expected = 421;
        int actual = Add.add(x, y);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link Add#add(int, int)} with x = 287 and y = 94.
     */
    @Test
    void testAdd16() {
        int x = 287;
        int y = 94;
        int expected = 381;
        int actual = Add.add(x, y);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link Add#add(int, int)} with x = 768 and y = 257.
     */
    @Test
    void testAdd17() {
        int x = 768;
        int y = 257;
        int expected = 1025;
        int actual = Add.add(x, y);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link Add#add(int, int)} with x = 421 and y = 677.
     */
    @Test
    void testAdd18() {
        int x = 421;
        int y = 677;
        int expected = 1098;
        int actual = Add.add(x, y);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link Add#add(int, int)} with x = 802 and y = 814.
     */
    @Test
    void testAdd19() {
        int x = 802;
        int y = 814;
        int expected = 1616;
        int actual = Add.add(x, y);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link Add#add(int, int)} with x = 510 and y = 922.
     */
    @Test
    void testAdd20() {
        int x = 510;
        int y = 922;
        int expected = 1432;
        int actual = Add.add(x, y);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link Add#add(int, int)} with x = 345 and y = 819.
     */
    @Test
    void testAdd21() {
        int x = 345;
        int y = 819;
        int expected = 1164;
        int actual = Add.add(x, y);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link Add#add(int, int)} with x = 895 and y = 436.
     */
    @Test
    void testAdd22() {
        int x = 895;
        int y = 436;
        int expected = 1331;
        int actual = Add.add(x, y);
        assertEquals(expected, actual);
    }

    /**
     *