// FruitDistributionTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FruitDistribution}.
* It contains ten unit test cases for the {@link FruitDistribution#fruitDistribution(String, int)} method.
*/
class FruitDistributionTest {

    /**
     * Test case for {@link FruitDistribution#fruitDistribution(String, int)}
     * when the number of apples and oranges is equal to the number of fruits in the basket.
     */
    @Test
    void testFruitDistribution1() {
        String s = "5 apples and 6 oranges";
        int n = 19;
        int expected = 8;
        int actual = FruitDistribution.fruitDistribution(s, n);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link FruitDistribution#fruitDistribution(String, int)}
     * when the number of apples and oranges is less than the number of fruits in the basket.
     */
    @Test
    void testFruitDistribution2() {
        String s = "5 apples and 6 oranges";
        int n = 21;
        int expected = 10;
        int actual = FruitDistribution.fruitDistribution(s, n);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link FruitDistribution#fruitDistribution(String, int)}
     * when the number of apples and oranges is equal to zero.
     */
    @Test
    void testFruitDistribution3() {
        String s = "0 apples and 1 oranges";
        int n = 3;
        int expected = 2;
        int actual = FruitDistribution.fruitDistribution(s, n);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link FruitDistribution#fruitDistribution(String, int)}
     * when the number of apples and oranges is equal to one.
     */
    @Test
    void testFruitDistribution4() {
        String s = "1 apples and 0 oranges";
        int n = 3;
        int expected = 2;
        int actual = FruitDistribution.fruitDistribution(s, n);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link FruitDistribution#fruitDistribution(String, int)}
     * when the number of apples and oranges is greater than the number of fruits in the basket.
     */
    @Test
    void testFruitDistribution5() {
        String s = "2 apples and 3 oranges";
        int n = 100;
        int expected = 95;
        int actual = FruitDistribution.fruitDistribution(s, n);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link FruitDistribution#fruitDistribution(String, int)}
     * when the number of apples and oranges is less than the number of fruits in the basket.
     */
    @Test
    void testFruitDistribution6() {
        String s = "2 apples and 3 oranges";
        int n = 5;
        int expected = 0;
        int actual = FruitDistribution.fruitDistribution(s, n);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link FruitDistribution#fruitDistribution(String, int)}
     * when the number of apples and oranges is greater than the number of fruits in the basket.
     */
    @Test
    void testFruitDistribution7() {
        String s = "1 apples and 100 oranges";
        int n = 120;
        int expected = 19;
        int actual = FruitDistribution.fruitDistribution(s, n);
        assertEquals(expected, actual);
    }
}
