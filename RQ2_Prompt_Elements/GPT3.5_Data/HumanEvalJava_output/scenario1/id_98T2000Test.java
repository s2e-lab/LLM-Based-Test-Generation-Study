Here's the completed `CountUpperTest` class with ten unit test cases for the `countUpper` method:

```
package scenario1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link CountUpper}.
 * It contains ten unit test cases for the {@link CountUpper#countUpper(String)} method.
 */
class CountUpperTest {

    @Test
    void testEmptyString() {
        assertEquals(0, CountUpper.countUpper(""));
    }

    @Test
    void testNoUpperCase() {
        assertEquals(0, CountUpper.countUpper("hello world"));
    }

    @Test
    void testNoVowels() {
        assertEquals(0, CountUpper.countUpper("BCDFGHJKLMNPQRSTVWXYZ"));
    }

    @Test
    void testEvenIndex() {
        assertEquals(2, CountUpper.countUpper("aEbIcOdUe"));
    }

    @Test
    void testOddIndex() {
        assertEquals(1, CountUpper.countUpper("aEbIcOdUeF"));
    }

    @Test
    void testAllUpperCase() {
        assertEquals(2, CountUpper.countUpper("AEIOU"));
    }

    @Test
    void testAllVowels() {
        assertEquals(2, CountUpper.countUpper("aeiou"));
    }

    @Test
    void testMixedCase() {
        assertEquals(1, CountUpper.countUpper("aEbIcOdUeFg"));
    }

    @Test
    void testMixedCaseAndNonLetters() {
        assertEquals(1, CountUpper.countUpper("aEbIcOdUeFg!"));
    }

    @Test
    void testLongString() {
        String s = "aEbIcOdUeFgHiJkLmNoPqRsTuVwXyZ" +
                   "aEbIcOdUeFgHiJkLmNoPqRsTuVwXyZ" +
                   "aEbIcOdUeFgHiJkLmNoPqRsTuVwXyZ" +
                   "aEbIcOdUeFgHiJkLmNoPqRsTuVwXyZ" +
                   "aEbIcOdUeFgHiJkLmNoPqRsTuVwXyZ" +
                   "aEbIcOdUeFgHiJkLmNoPqRsTuVwXyZ" +
                   "aEbIcOdUeFgHiJkLmNoPqRsTuVwXyZ" +
                   "aEbIcOdUeFgHiJkLmNoPqRsTuVwXyZ" +
                   "aEbIcOdUeFgHiJkLmNoPqRsTuVwXyZ" +
                   "aEbIcOdUeFgHiJkLmNoPqRsTuVwXyZ";
        assertEquals(25, CountUpper.countUpper(s));
    }
}
```