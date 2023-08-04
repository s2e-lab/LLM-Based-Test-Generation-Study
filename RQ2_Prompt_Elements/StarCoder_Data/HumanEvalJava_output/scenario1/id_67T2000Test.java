// FruitDistributionTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FruitDistribution}.
* It contains ten unit test cases for the {@link FruitDistribution#fruitDistribution(String, int)} method.
*/
class FruitDistributionTest {

    @Test
    void testFruitDistribution1() {
        String s = "apples 10 oranges 15";
        int n = 20;
        int expected = 5;
        int actual = FruitDistribution.fruitDistribution(s, n);
        assertEquals(expected, actual);
    }

    @Test
    void testFruitDistribution2() {
        String s = "apples 10 oranges 15";
        int n = 10;
        int expected = 0;
        int actual = FruitDistribution.fruitDistribution(s, n);
        assertEquals(expected, actual);
    }

    @Test
    void testFruitDistribution3() {
        String s = "apples 10 oranges 15";
        int n = 15;
        int expected = 5;
        int actual = FruitDistribution.fruitDistribution(s, n);
        assertEquals(expected, actual);
    }

    @Test
    void testFruitDistribution4() {
        String s = "apples 10 oranges 15";
        int n = 16;
        int expected = 6;
        int actual = FruitDistribution.fruitDistribution(s, n);
        assertEquals(expected, actual);
    }

    @Test
    void testFruitDistribution5() {
        String s = "apples 10 oranges 15";
        int n = 17;
        int expected = 7;
        int actual = FruitDistribution.fruitDistribution(s, n);
        assertEquals(expected, actual);
    }

    @Test
    void testFruitDistribution6() {
        String s = "apples 10 oranges 15";
        int n = 18;
        int expected = 8;
        int actual = FruitDistribution.fruitDistribution(s, n);
        assertEquals(expected, actual);
    }

    @Test
    void testFruitDistribution7() {
        String s = "apples 10 oranges 15";
        int n = 19;
        int expected = 9;
        int actual = FruitDistribution.fruitDistribution(s, n);
        assertEquals(expected, actual);
    }

    @Test
    void testFruitDistribution8() {
        String s = "apples 10 oranges 15";
        int n = 20;
        int expected = 10;
        int actual = FruitDistribution.fruitDistribution(s, n);
        assertEquals(expected, actual);
    }

    @Test
    void testFruitDistribution9() {
        String s = "apples 10 oranges 15";
        int n = 21;
        int expected = 11;
        int actual = FruitDistribution.fruitDistribution(s, n);
        assertEquals(expected, actual);
    }

    @Test
    void testFruitDistribution10() {
        String s = "apples 10 oranges 15";
        int n = 22;
        int expected = 12;
        int actual = FruitDistribution.fruitDistribution(s, n);
        assertEquals(expected, actual);
    }
}
