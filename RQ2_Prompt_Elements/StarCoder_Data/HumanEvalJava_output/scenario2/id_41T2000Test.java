// CarRaceCollisionTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CarRaceCollision}.
* It contains ten unit test cases for the {@link CarRaceCollision#carRaceCollision(int)} method.
*/
class CarRaceCollisionTest {

    /**
     * Test case for the {@link CarRaceCollision#carRaceCollision(int)} method.
     * It tests the case when the number of cars is 1.
     */
    @Test
    void testCarRaceCollision1() {
        int n = 1;
        int expected = 0;
        int actual = CarRaceCollision.carRaceCollision(n);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link CarRaceCollision#carRaceCollision(int)} method.
     * It tests the case when the number of cars is 2.
     */
    @Test
    void testCarRaceCollision2() {
        int n = 2;
        int expected = 0;
        int actual = CarRaceCollision.carRaceCollision(n);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link CarRaceCollision#carRaceCollision(int)} method.
     * It tests the case when the number of cars is 3.
     */
    @Test
    void testCarRaceCollision3() {
        int n = 3;
        int expected = 0;
        int actual = CarRaceCollision.carRaceCollision(n);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link CarRaceCollision#carRaceCollision(int)} method.
     * It tests the case when the number of cars is 4.
     */
    @Test
    void testCarRaceCollision4() {
        int n = 4;
        int expected = 0;
        int actual = CarRaceCollision.carRaceCollision(n);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link CarRaceCollision#carRaceCollision(int)} method.
     * It tests the case when the number of cars is 5.
     */
    @Test
    void testCarRaceCollision5() {
        int n = 5;
        int expected = 0;
        int actual = CarRaceCollision.carRaceCollision(n);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link CarRaceCollision#carRaceCollision(int)} method.
     * It tests the case when the number of cars is 6.
     */
    @Test
    void testCarRaceCollision6() {
        int n = 6;
        int expected = 0;
        int actual = CarRaceCollision.carRaceCollision(n);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link CarRaceCollision#carRaceCollision(int)} method.
     * It tests the case when the number of cars is 7.
     */
    @Test
    void testCarRaceCollision7() {
        int n = 7;
        int expected = 0;
        int actual = CarRaceCollision.carRaceCollision(n);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link CarRaceCollision#carRaceCollision(int)} method.
     * It tests the case when the number of cars is 8.
     */
    @Test
    void testCarRaceCollision8() {
        int n = 8;
        int expected = 0;
        int actual = CarRaceCollision.carRaceCollision(n);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link CarRaceCollision#carRaceCollision(int)} method.
     * It tests the case when the number of cars is 9.
     */
    @Test
    void testCarRaceCollision9() {
        int n = 9;
        int expected = 0;
        int actual = CarRaceCollision.carRaceCollision(n);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link CarRaceCollision#carRaceCollision(int)} method.
     * It tests the case when the number of cars is 10.
     */
    @Test
    void testCarRaceCollision10() {
        int n = 10;
        int expected = 0;
        int actual = CarRaceCollision.carRaceCollision(n);
        assertEquals(expected, actual);
    }
}
