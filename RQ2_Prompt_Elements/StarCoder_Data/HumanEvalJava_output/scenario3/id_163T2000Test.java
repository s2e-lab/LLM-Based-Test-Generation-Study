// GenerateIntegersTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GenerateIntegers}.
* It contains ten unit test cases for the {@link GenerateIntegers#generateIntegers(int, int)} method.
*/
class GenerateIntegersTest {

    /**
    * Test case for {@link GenerateIntegers#generateIntegers(int, int)}.
    */
    @Test
    void testGenerateIntegers() {
        List<Object> expected = List.of(2, 4, 6, 8);
        assertEquals(expected, GenerateIntegers.generateIntegers(2, 8));
    }

    /**
    * Test case for {@link GenerateIntegers#generateIntegers(int, int)}.
    */
    @Test
    void testGenerateIntegers2() {
        List<Object> expected = List.of(2, 4, 6, 8);
        assertEquals(expected, GenerateIntegers.generateIntegers(8, 2));
    }

    /**
    * Test case for {@link GenerateIntegers#generateIntegers(int, int)}.
    */
    @Test
    void testGenerateIntegers3() {
        List<Object> expected = List.of();
        assertEquals(expected, GenerateIntegers.generateIntegers(10, 14));
    }

    /**
    * Test case for {@link GenerateIntegers#generateIntegers(int, int)}.
    */
    @Test
    void testGenerateIntegers4() {
        List<Object> expected = List.of(2, 4, 6, 8);
        assertEquals(expected, GenerateIntegers.generateIntegers(2, 10));
    }

    /**
    * Test case for {@link GenerateIntegers#generateIntegers(int, int)}.
    */
    @Test
    void testGenerateIntegers5() {
        List<Object> expected = List.of(2, 4, 6, 8);
        assertEquals(expected, GenerateIntegers.generateIntegers(10, 2));
    }

    /**
    * Test case for {@link GenerateIntegers#generateIntegers(int, int)}.
    */
    @Test
    void testGenerateIntegers6() {
        List<Object> expected = List.of(2, 4, 6, 8);
        assertEquals(expected, GenerateIntegers.generateIntegers(132, 2));
    }

    /**
    * Test case for {@link GenerateIntegers#generateIntegers(int, int)}.
    */
    @Test
    void testGenerateIntegers7() {
        List<Object> expected = List.of();
        assertEquals(expected, GenerateIntegers.generateIntegers(17, 89));
    }
}
