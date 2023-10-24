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

    /**
    * Test case number: 1
    * Test case values: a = 2, b = 8
    * Expected test result: [2, 4, 6, 8]
    */
    @Test
    void test1() {
        List<Object> expected = new ArrayList<>();
        expected.add(2);
        expected.add(4);
        expected.add(6);
        expected.add(8);
        assertEquals(expected, GenerateIntegers.generateIntegers(2, 8));
    }

    /**
    * Test case number: 2
    * Test case values: a = 8, b = 2
    * Expected test result: [2, 4, 6, 8]
    */
    @Test
    void test2() {
        List<Object> expected = new ArrayList<>();
        expected.add(2);
        expected.add(4);
        expected.add(6);
        expected.add(8);
        assertEquals(expected, GenerateIntegers.generateIntegers(8, 2));
    }

    /**
    * Test case number: 3
    * Test case values: a = 10, b = 14
    * Expected test result: []
    */
    @Test
    void test3() {
        List<Object> expected = new ArrayList<>();
        assertEquals(expected, GenerateIntegers.generateIntegers(10, 14));
    }

    /**
    * Test case number: 4
    * Test case values: a = 2, b = 10
    * Expected test result: [2, 4, 6, 8]
    */
    @Test
    void test4() {
        List<Object> expected = new ArrayList<>();
        expected.add(2);
        expected.add(4);
        expected.add(6);
        expected.add(8);
        assertEquals(expected, GenerateIntegers.generateIntegers(2, 10));
    }

    /**
    * Test case number: 5
    * Test case values: a = 10, b = 2
    * Expected test result: [2, 4, 6, 8]
    */
    @Test
    void test5() {
        List<Object> expected = new ArrayList<>();
        expected.add(2);
        expected.add(4);
        expected.add(6);
        expected.add(8);
        assertEquals(expected, GenerateIntegers.generateIntegers(10, 2));
    }

    /**
    * Test case number: 6
    * Test case values: a = 132, b = 2
    * Expected test result: [2, 4, 6, 8]
    */
    @Test
    void test6() {
        List<Object> expected = new ArrayList<>();
        expected.add(2);
        expected.add(4);
        expected.add(6);
        expected.add(8);
        assertEquals(expected, GenerateIntegers.generateIntegers(132, 2));
    }

    /**
    * Test case number: 7
    * Test case values: a = 17, b = 89
    * Expected test result: []
    */
    @Test
    void test7() {
        List<Object> expected = new ArrayList<>();
        assertEquals(expected, GenerateIntegers.generateIntegers(17, 89));
    }

    /**
    * Test case number: 8
    * Test case values: a = 100, b = 100
    * Expected test result: [100]
    */
    @Test
    void test8() {
        List<Object> expected = new ArrayList<>();
        expected.add(100);
        assertEquals(expected, GenerateIntegers.generateIntegers(100, 100));
    }

    /**
    * Test case number: 9
    * Test case values: a = 100, b = 101
    * Expected test result: [100, 101]
    */
    @Test
    void test9() {
        List<Object> expected = new ArrayList<>();
        expected.add(100);
        expected.add(101);
        assertEquals(expected, GenerateIntegers.generateIntegers(100, 101));
    }

    /**
    * Test case number: 10
    * Test case values: a = 100, b = 102
    * Expected test result: [100, 102]
    */
    @Test
    void test10() {
        List<Object> expected = new ArrayList<>();
        expected.add(100);
        expected.add(102);
        assertEquals(expected, GenerateIntegers.generateIntegers(100, 102));
    }
}
