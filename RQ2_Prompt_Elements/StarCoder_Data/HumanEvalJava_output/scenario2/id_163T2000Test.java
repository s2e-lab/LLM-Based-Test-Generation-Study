// GenerateIntegersTest.java
package scenario2;

import java.util.ArrayList;
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
        List<Object> expected = new ArrayList<>();
        expected.add(2);
        expected.add(4);
        expected.add(6);
        expected.add(8);
        assertEquals(expected, GenerateIntegers.generateIntegers(2, 8));
    }

    /**
    * Test case for {@link GenerateIntegers#generateIntegers(int, int)}.
    */
    @Test
    void testGenerateIntegers2() {
        List<Object> expected = new ArrayList<>();
        expected.add(2);
        expected.add(4);
        expected.add(6);
        expected.add(8);
        assertEquals(expected, GenerateIntegers.generateIntegers(8, 2));
    }

    /**
    * Test case for {@link GenerateIntegers#generateIntegers(int, int)}.
    */
    @Test
    void testGenerateIntegers3() {
        List<Object> expected = new ArrayList<>();
        assertEquals(expected, GenerateIntegers.generateIntegers(2, 2));
    }

    /**
    * Test case for {@link GenerateIntegers#generateIntegers(int, int)}.
    */
    @Test
    void testGenerateIntegers4() {
        List<Object> expected = new ArrayList<>();
        expected.add(2);
        expected.add(4);
        expected.add(6);
        expected.add(8);
        assertEquals(expected, GenerateIntegers.generateIntegers(2, 8));
    }

    /**
    * Test case for {@link GenerateIntegers#generateIntegers(int, int)}.
    */
    @Test
    void testGenerateIntegers5() {
        List<Object> expected = new ArrayList<>();
        expected.add(2);
        expected.add(4);
        expected.add(6);
        expected.add(8);
        assertEquals(expected, GenerateIntegers.generateIntegers(8, 2));
    }

    /**
    * Test case for {@link GenerateIntegers#generateIntegers(int, int)}.
    */
    @Test
    void testGenerateIntegers6() {
        List<Object> expected = new ArrayList<>();
        assertEquals(expected, GenerateIntegers.generateIntegers(2, 2));
    }

    /**
    * Test case for {@link GenerateIntegers#generateIntegers(int, int)}.
    */
    @Test
    void testGenerateIntegers7() {
        List<Object> expected = new ArrayList<>();
        expected.add(2);
        expected.add(4);
        expected.add(6);
        expected.add(8);
        assertEquals(expected, GenerateIntegers.generateIntegers(2, 8));
    }

    /**
    * Test case for {@link GenerateIntegers#generateIntegers(int, int)}.
    */
    @Test
    void testGenerateIntegers8() {
        List<Object> expected = new ArrayList<>();
        expected.add(2);
        expected.add(4);
        expected.add(6);
        expected.add(8);
        assertEquals(expected, GenerateIntegers.generateIntegers(8, 2));
    }

    /**
    * Test case for {@link GenerateIntegers#generateIntegers(int, int)}.
    */
    @Test
    void testGenerateIntegers9() {
        List<Object> expected = new ArrayList<>();
        assertEquals(expected, GenerateIntegers.generateIntegers(2, 2));
    }

    /**
    * Test case for {@link GenerateIntegers#generateIntegers(int, int)}.
    */
    @Test
    void testGenerateIntegers10() {
        List<Object> expected = new ArrayList<>();
        expected.add(2);
        expected.add(4);
        expected.add(6);
        expected.add(8);
        assertEquals(expected, GenerateIntegers.generateIntegers(2, 8));
    }
}
