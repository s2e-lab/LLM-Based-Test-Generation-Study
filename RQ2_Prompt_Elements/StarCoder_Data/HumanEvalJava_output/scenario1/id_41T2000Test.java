// CarRaceCollisionTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CarRaceCollision}.
* It contains ten unit test cases for the {@link CarRaceCollision#carRaceCollision(int)} method.
*/
class CarRaceCollisionTest {

    /**
    * Test case for the {@link CarRaceCollision#carRaceCollision(int)} method.
    * It tests the method with a value of 1.
    */
    @Test
    void testCarRaceCollision1() {
        int n = 1;
        int expected = 1;
        int actual = CarRaceCollision.carRaceCollision(n);
        assertEquals(expected, actual);
    }

    /**
    * Test case for the {@link CarRaceCollision#carRaceCollision(int)} method.
    * It tests the method with a value of 2.
    */
    @Test
    void testCarRaceCollision2() {
        int n = 2;
        int expected = 4;
        int actual = CarRaceCollision.carRaceCollision(n);
        assertEquals(expected, actual);
    }

    /**
    * Test case for the {@link CarRaceCollision#carRaceCollision(int)} method.
    * It tests the method with a value of 3.
    */
    @Test
    void testCarRaceCollision3() {
        int n = 3;
        int expected = 9;
        int actual = CarRaceCollision.carRaceCollision(n);
        assertEquals(expected, actual);
    }

    /**
    * Test case for the {@link CarRaceCollision#carRaceCollision(int)} method.
    * It tests the method with a value of 4.
    */
    @Test
    void testCarRaceCollision4() {
        int n = 4;
        int expected = 16;
        int actual = CarRaceCollision.carRaceCollision(n);
        assertEquals(expected, actual);
    }

    /**
    * Test case for the {@link CarRaceCollision#carRaceCollision(int)} method.
    * It tests the method with a value of 5.
    */
    @Test
    void testCarRaceCollision5() {
        int n = 5;
        int expected = 25;
        int actual = CarRaceCollision.carRaceCollision(n);
        assertEquals(expected, actual);
    }

    /**
    * Test case for the {@link CarRaceCollision#carRaceCollision(int)} method.
    * It tests the method with a value of 6.
    */
    @Test
    void testCarRaceCollision6() {
        int n = 6;
        int expected = 36;
        int actual = CarRaceCollision.carRaceCollision(n);
        assertEquals(expected, actual);
    }

    /**
    * Test case for the {@link CarRaceCollision#carRaceCollision(int)} method.
    * It tests the method with a value of 7.
    */
    @Test
    void testCarRaceCollision7() {
        int n = 7;
        int expected = 49;
        int actual = CarRaceCollision.carRaceCollision(n);
        assertEquals(expected, actual);
    }

    /**
    * Test case for the {@link CarRaceCollision#carRaceCollision(int)} method.
    * It tests the method with a value of 8.
    */
    @Test
    void testCarRaceCollision8() {
        int n = 8;
        int expected = 64;
        int actual = CarRaceCollision.carRaceCollision(n);
        assertEquals(expected, actual);
    }

    /**
    * Test case for the {@link CarRaceCollision#carRaceCollision(int)} method.
    * It tests the method with a value of 9.
    */
    @Test
    void testCarRaceCollision9() {
        int n = 9;
        int expected = 81;
        int actual = CarRaceCollision.carRaceCollision(n);
        assertEquals(expected, actual);
    }

    /**
    * Test case for the {@link CarRaceCollision#carRaceCollision(int)} method.
    * It tests the method with a value of 10.
    */
    @Test
    void testCarRaceCollision10() {
        int n = 10;
        int expected = 100;
        int actual = CarRaceCollision.carRaceCollision(n);
        assertEquals(expected, actual);
    }
}
