// FruitDistributionTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FruitDistribution}.
* It contains ten unit test cases for the {@link FruitDistribution#fruitDistribution(String, int)} method.
*/
class FruitDistributionTest {

    /**
     * Test case for the {@link FruitDistribution#fruitDistribution(String, int)} method.
     * It tests the case when the number of apples and oranges are equal to the number of fruits.
     */
    @Test
    void testFruitDistribution1() {
        String s = "10 apples 10 oranges 10 mangoes";
        int n = 10;
        int expected = 10;
        int actual = FruitDistribution.fruitDistribution(s, n);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link FruitDistribution#fruitDistribution(String, int)} method.
     * It tests the case when the number of apples and oranges are less than the number of fruits.
     */
    @Test
    void testFruitDistribution2() {
        String s = "5 apples 5 oranges 10 mangoes";
        int n = 10;
        int expected = 5;
        int actual = FruitDistribution.fruitDistribution(s, n);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link FruitDistribution#fruitDistribution(String, int)} method.
     * It tests the case when the number of apples and oranges are greater than the number of fruits.
     */
    @Test
    void testFruitDistribution3() {
        String s = "15 apples 15 oranges 10 mangoes";
        int n = 10;
        int expected = 0;
        int actual = FruitDistribution.fruitDistribution(s, n);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link FruitDistribution#fruitDistribution(String, int)} method.
     * It tests the case when the number of apples and oranges are equal to the number of fruits.
     */
    @Test
    void testFruitDistribution4() {
        String s = "10 apples 10 oranges 10 mangoes";
        int n = 10;
        int expected = 10;
        int actual = FruitDistribution.fruitDistribution(s, n);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link FruitDistribution#fruitDistribution(String, int)} method.
     * It tests the case when the number of apples and oranges are equal to the number of fruits.
     */
    @Test
    void testFruitDistribution5() {
        String s = "10 apples 10 oranges 10 mangoes";
        int n = 10;
        int expected = 10;
        int actual = FruitDistribution.fruitDistribution(s, n);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link FruitDistribution#fruitDistribution(String, int)} method.
     * It tests the case when the number of apples and oranges are equal to the number of fruits.
     */
    @Test
    void testFruitDistribution6() {
        String s = "10 apples 10 oranges 10 mangoes";
        int n = 10;
        int expected = 10;
        int actual = FruitDistribution.fruitDistribution(s, n);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link FruitDistribution#fruitDistribution(String, int)} method.
     * It tests the case when the number of apples and oranges are equal to the number of fruits.
     */
    @Test
    void testFruitDistribution7() {
        String s = "10 apples 10 oranges 10 mangoes";
        int n = 10;
        int expected = 10;
        int actual = FruitDistribution.fruitDistribution(s, n);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link FruitDistribution#fruitDistribution(String, int)} method.
     * It tests the case when the number of apples and oranges are equal to the number of fruits.
     */
    @Test
    void testFruitDistribution8() {
        String s = "10 apples 10 oranges 10 mangoes";
        int n = 10;
        int expected = 10;
        int actual = FruitDistribution.fruitDistribution(s, n);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link FruitDistribution#fruitDistribution(String, int)} method.
     * It tests the case when the number of apples and oranges are equal to the number of fruits.
     */
    @Test
    void testFruitDistribution9() {
        String s = "10 apples 10 oranges 10 mangoes";
        int n = 10;
        int expected = 10;
        int actual = FruitDistribution.fruitDistribution(s, n);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link FruitDistribution#fruitDistribution(String, int)} method.
     * It tests the case when the number of apples and oranges are equal to the number of fruits.
     */
    @Test
    void testFruitDistribution10() {
        String s = "10 apples 10 oranges 10 mangoes";
        int n = 10;
        int expected = 10;
        int actual = FruitDistribution.fruitDistribution(s, n);
        assertEquals(expected, actual);
    }
}
