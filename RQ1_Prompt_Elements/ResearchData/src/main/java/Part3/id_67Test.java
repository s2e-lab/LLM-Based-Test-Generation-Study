package Part3;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class FruitDistributionTest {
    @Test
    public void testFruitDistribution() {
        assertEquals(8, FruitDistribution.fruitDistribution("5 apples and 6 oranges", 19));
        assertEquals(10, FruitDistribution.fruitDistribution("5 apples and 6 oranges", 21));
        assertEquals(2, FruitDistribution.fruitDistribution("0 apples and 1 oranges", 3));
        assertEquals(2, FruitDistribution.fruitDistribution("1 apples and 0 oranges", 3));
        assertEquals(95, FruitDistribution.fruitDistribution("2 apples and 3 oranges", 100));
        assertEquals(0, FruitDistribution.fruitDistribution("2 apples and 3 oranges", 5));
        assertEquals(19, FruitDistribution.fruitDistribution("1 apples and 100 oranges", 120));
    }
}