// GenerateIntegersTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link GenerateIntegers}.
 * It contains ten unit test cases for the {@link GenerateIntegers#generateIntegers(int, int)} method.
 */
class GenerateIntegersTest {

    @Test
    void testGenerateIntegers_1() {
        List<Object> expected = new ArrayList<>();
        expected.add(2);
        expected.add(4);
        expected.add(6);
        expected.add(8);
        List<Object> actual = GenerateIntegers.generateIntegers(2, 8);
        assertEquals(expected, actual);
    }

    @Test
    void testGenerateIntegers_2() {
        List<Object> expected = new ArrayList<>();
        expected.add(2);
        expected.add(4);
        expected.add(6);
        expected.add(8);
        List<Object> actual = GenerateIntegers.generateIntegers(8, 2);
        assertEquals(expected, actual);
    }

    @Test
    void testGenerateIntegers_3() {
        List<Object> expected = new ArrayList<>();
        expected.add(2);
        expected.add(4);
        expected.add(6);
        expected.add(8);
        List<Object> actual = GenerateIntegers.generateIntegers(2, 2);
        assertEquals(expected, actual);
    }

    @Test
    void testGenerateIntegers_4() {
        List<Object> expected = new ArrayList<>();
        expected.add(2);
        expected.add(4);
        expected.add(6);
        expected.add(8);
        List<Object> actual = GenerateIntegers.generateIntegers(8, 8);
        assertEquals(expected, actual);
    }

    @Test
    void testGenerateIntegers_5() {
        List<Object> expected = new ArrayList<>();
        expected.add(2);
        expected.add(4);
        expected.add(6);
        expected.add(8);
        List<Object> actual = GenerateIntegers.generateIntegers(0, 0);
        assertEquals(expected, actual);
    }

    @Test
    void testGenerateIntegers_6() {
        List<Object> expected = new ArrayList<>();
        expected.add(2);
        expected.add(4);
        expected.add(6);
        expected.add(8);
        List<Object> actual = GenerateIntegers.generateIntegers(1, 1);
        assertEquals(expected, actual);
    }

    @Test
    void testGenerateIntegers_7() {
        List<Object> expected = new ArrayList<>();
        expected.add(2);
        expected.add(4);
        expected.add(6);
        expected.add(8);
        List<Object> actual = GenerateIntegers.generateIntegers(9, 9);
        assertEquals(expected, actual);
    }

    @Test
    void testGenerateIntegers_8() {
        List<Object> expected = new ArrayList<>();
        expected.add(2);
        expected.add(4);
        expected.add(6);
        expected.add(8);
        List<Object> actual = GenerateIntegers.generateIntegers(10, 10);
        assertEquals(expected, actual);
    }

    @Test
    void testGenerateIntegers_9() {
        List<Object> expected = new ArrayList<>();
        expected.add(2);
        expected.add(4);
        expected.add(6);
        expected.add(8);
        List<Object> actual = GenerateIntegers.generateIntegers(11, 11);
        assertEquals(expected, actual);
    }

    @Test
    void testGenerateIntegers_10() {
        List<Object> expected = new ArrayList<>();
        expected.add(2);
        expected.add(4);
        expected.add(6);
        expected.add(8);
        List<Object> actual = GenerateIntegers.generateIntegers(12, 12);
        assertEquals(expected, actual);
    }
}
