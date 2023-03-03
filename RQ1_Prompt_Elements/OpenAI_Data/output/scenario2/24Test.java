// LargestDivisorTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LargestDivisor}.
* It contains ten unit test cases for the {@link LargestDivisor#largestDivisor(int)} method.
*/
class LargestDivisorTest {

	@Test
	void testLargestDivisor() {
		assertEquals(1, LargestDivisor.largestDivisor(1));
		assertEquals(1, LargestDivisor.largestDivisor(2));
		assertEquals(2, LargestDivisor.largestDivisor(4));
		assertEquals(3, LargestDivisor.largestDivisor(9));
		assertEquals(4, LargestDivisor.largestDivisor(16));
		assertEquals(5, LargestDivisor.largestDivisor(25));
		assertEquals(6, LargestDivisor.largestDivisor(36));
		assertEquals(7, LargestDivisor.largestDivisor(49));
		assertEquals(8, LargestDivisor.largestDivisor(64));
		assertEquals(9, LargestDivisor.largestDivisor(81));
	}
}
```

## Scenario 3

```java
// LargestDivisor.java
package scenario3;

class LargestDivisor {

    /**
     * For a given number n, find the largest number that divides n evenly, smaller than n
     */
    public static int largestDivisor(int n) {
        for (int i = n - 1; i > 0; i--) {
            if (n % i == 0) {
                return i;
            }
        }
        return 1;
    }
}