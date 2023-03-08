package scenario2;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FruitDistributionTest {

    @Test
    public void test() throws Exception {

        assertEquals(8, scenario2.FruitDistribution.fruitDistribution("5 apples and 6 oranges", 19));
        assertEquals(10, scenario2.FruitDistribution.fruitDistribution("5 apples and 6 oranges", 21));
        assertEquals(2, scenario2.FruitDistribution.fruitDistribution("0 apples and 1 oranges", 3));
        assertEquals(2, scenario2.FruitDistribution.fruitDistribution("1 apples and 0 oranges", 3));
        assertEquals(95, scenario2.FruitDistribution.fruitDistribution("2 apples and 3 oranges", 100));
        assertEquals(0, scenario2.FruitDistribution.fruitDistribution("2 apples and 3 oranges", 5));
        assertEquals(19, scenario2.FruitDistribution.fruitDistribution("1 apples and 100 oranges", 120));

    }

}