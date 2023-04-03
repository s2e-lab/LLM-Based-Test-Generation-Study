// GenerateIntegersTest.java
package original;


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
    void testGenerateIntegers1() {
        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(4);
        expected.add(6);
        expected.add(8);
        expected.add(10);
        List<Integer> actual = GenerateIntegers.generateIntegers(2, 10);
        assertEquals(expected, actual);
    }
    
    @Test
    void testGenerateIntegers2() {
        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(4);
        expected.add(6);
        expected.add(8);
        expected.add(10);
        List<Integer> actual = GenerateIntegers.generateIntegers(10, 2);
        assertEquals(expected, actual);
    }
    
    @Test
    void testGenerateIntegers3() {
        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        List<Integer> actual = GenerateIntegers.generateIntegers(132, 2);
        assertEquals(expected, actual);
    }
    
    @Test
    void testGenerateIntegers4() {
        List<Integer> expected = new ArrayList<>();
        expected.add(18);
        expected.add(20);
        expected.add(22);
        expected.add(24);
        expected.add(26);
        expected.add(28);
        expected.add(80);
        expected.add(82);
        expected.add(84);
        expected.add(86);
        expected.add(88);
        List<Integer> actual = GenerateIntegers.generateIntegers(17, 89);
        assertEquals(expected, actual);
    }
    
    @Test
    void testGenerateIntegers5() {
        List<Integer> expected = new ArrayList<>();
        List<Integer> actual = GenerateIntegers.generateIntegers(10, 14);
        assertEquals(expected, actual);
    }
    
    @Test
    void testGenerateIntegers6() {
        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(4);
        expected.add(6);
        expected.add(8);
        List<Integer> actual = GenerateIntegers.generateIntegers(2, 8);
        assertEquals(expected, actual);
    }
    
    @Test
    void testGenerateIntegers7() {
        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(4);
        expected.add(6);
        expected.add(8);
        List<Integer> actual = GenerateIntegers.generateIntegers(8, 2);
        assertEquals(expected, actual);
    }
    
    @Test
    void testGenerateIntegers8() {
        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(4);
        expected.add(6);
        expected.add(8);
        expected.add(10);
        List<Integer> actual = GenerateIntegers.generateIntegers(2, 10);
        assertEquals(expected, actual);
    }
    
    @Test
    void testGenerateIntegers9() {
        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(4);
        expected.add(6);
        expected.add(8);
        expected.add(10);
        List<Integer> actual = GenerateIntegers.generateIntegers(10, 2);
        assertEquals(expected, actual);
    }
    
    @Test
    void testGenerateIntegers10() {
        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        List<Integer> actual = GenerateIntegers.generateIntegers(132, 2);
        assertEquals(expected, actual);
    }
}