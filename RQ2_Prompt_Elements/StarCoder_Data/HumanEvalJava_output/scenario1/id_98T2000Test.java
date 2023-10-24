// CountUpperTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CountUpper}.
* It contains ten unit test cases for the {@link CountUpper#countUpper(String)} method.
*/
class CountUpperTest {

    @Test
    void testCountUpper() {
        assertEquals(0, CountUpper.countUpper(""));
        assertEquals(0, CountUpper.countUpper("a"));
        assertEquals(1, CountUpper.countUpper("A"));
        assertEquals(1, CountUpper.countUpper("aA"));
        assertEquals(2, CountUpper.countUpper("Aa"));
        assertEquals(2, CountUpper.countUpper("aAa"));
        assertEquals(3, CountUpper.countUpper("Aaa"));
        assertEquals(3, CountUpper.countUpper("aAaA"));
        assertEquals(4, CountUpper.countUpper("AaAa"));
        assertEquals(4, CountUpper.countUpper("aAaAa"));
        assertEquals(5, CountUpper.countUpper("AaaAa"));
        assertEquals(5, CountUpper.countUpper("aAaAaa"));
    }
}
