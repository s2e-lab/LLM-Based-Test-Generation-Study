// AddTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Add}.
* It contains ten unit test cases for the {@link Add#add(int, int)} method.
*/
class AddTest {

    /**
    * Test case for {@link Add#add(int, int)} where both numbers are zero.
    */
    @Test
    void testAdd00() {
        assertEquals(0, Add.add(0, 0));
    }

    /**
    * Test case for {@link Add#add(int, int)} where the first number is zero.
    */
    @Test
    void testAdd01() {
        assertEquals(1, Add.add(0, 1));
    }

    /**
    * Test case for {@link Add#add(int, int)} where the second number is zero.
    */
    @Test
    void testAdd02() {
        assertEquals(1, Add.add(1, 0));
    }

    /**
    * Test case for {@link Add#add(int, int)} where both numbers are positive.
    */
    @Test
    void testAdd03() {
        assertEquals(5, Add.add(2, 3));
    }

    /**
    * Test case for {@link Add#add(int, int)} where both numbers are negative.
    */
    @Test
    void testAdd04() {
        assertEquals(-3, Add.add(-2, -3));
    }

    /**
    * Test case for {@link Add#add(int, int)} where both numbers are positive and large.
    */
    @Test
    void testAdd05() {
        assertEquals(1297, Add.add(572, 725));
    }

    /**
    * Test case for {@link Add#add(int, int)} where both numbers are negative and large.
    */
    @Test
    void testAdd06() {
        assertEquals(-244, Add.add(-422, -608));
    }

    /**
    * Test case for {@link Add#add(int, int)} where both numbers are positive and large.
    */
    @Test
    void testAdd07() {
        assertEquals(855, Add.add(51, 804));
    }

    /**
    * Test case for {@link Add#add(int, int)} where both numbers are negative and large.
    */
    @Test
    void testAdd08() {
        assertEquals(-105, Add.add(-76, -29));
    }

    /**
    * Test case for {@link Add#add(int, int)} where both numbers are positive and large.
    */
    @Test
    void testAdd09() {
        assertEquals(565, Add.add(145, 409));
    }

    /**
    * Test case for {@link Add#add(int, int)} where both numbers are negative and large.
    */
    @Test
    void testAdd10() {
        assertEquals(965, Add.add(535, 430));
    }
}
