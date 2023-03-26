// CarRaceCollisionTest.java
package scenario2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link CarRaceCollision}.
 * It contains ten unit test cases for the {@link CarRaceCollision#carRaceCollision(int)} method.
 */
class CarRaceCollisionTest {

    @Test
    void testNoCollisions() {
        int n = 1;
        int expected = 0;
        int actual = CarRaceCollision.carRaceCollision(n);
        assertEquals(expected, actual);
    }

    @Test
    void testOneCollision() {
        int n = 2;
        int expected = 1;
        int actual = CarRaceCollision.carRaceCollision(n);
        assertEquals(expected, actual);
    }

    @Test
    void testTwoCollisions() {
        int n = 3;
        int expected = 3;
        int actual = CarRaceCollision.carRaceCollision(n);
        assertEquals(expected, actual);
    }

    @Test
    void testThreeCollisions() {
        int n = 4;
        int expected = 6;
        int actual = CarRaceCollision.carRaceCollision(n);
        assertEquals(expected, actual);
    }

    @Test
    void testFourCollisions() {
        int n = 5;
        int expected = 10;
        int actual = CarRaceCollision.carRaceCollision(n);
        assertEquals(expected, actual);
    }

    @Test
    void testFiveCollisions() {
        int n = 6;
        int expected = 15;
        int actual = CarRaceCollision.carRaceCollision(n);
        assertEquals(expected, actual);
    }

    @Test
    void testSixCollisions() {
        int n = 7;
        int expected = 21;
        int actual = CarRaceCollision.carRaceCollision(n);
        assertEquals(expected, actual);
    }

    @Test
    void testSevenCollisions() {
        int n = 8;
        int expected = 28;
        int actual = CarRaceCollision.carRaceCollision(n);
        assertEquals(expected, actual);
    }

    @Test
    void testEightCollisions() {
        int n = 9;
        int expected = 36;
        int actual = CarRaceCollision.carRaceCollision(n);
        assertEquals(expected, actual);
    }

    @Test
    void testNineCollisions() {
        int n = 10;
        int expected = 45;
        int actual = CarRaceCollision.carRaceCollision(n);
        assertEquals(expected, actual);
    }
}