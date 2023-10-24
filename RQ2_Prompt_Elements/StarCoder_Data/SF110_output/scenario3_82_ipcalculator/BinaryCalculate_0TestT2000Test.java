// BinaryCalculate_0Test.java
package ipac;

import java.text.*;
import java.util.*;
import java.math.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BinaryCalculate}.
* It contains ten unit test cases for the {@link BinaryCalculate#addBinary(String, String)} method.
*/
class BinaryCalculate_0Test {

    /**
    * Test case number: 0
    * Test case values: "11", "1"
    * Expected output: "100"
    */
    @Test
    void test_0() {
        BinaryCalculate_0 binaryCalculate = new BinaryCalculate_0();
        String expected = "100";
        String actual = binaryCalculate.addBinary("11", "1");
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 1
    * Test case values: "1010", "1011"
    * Expected output: "10101"
    */
    @Test
    void test_1() {
        BinaryCalculate_0 binaryCalculate = new BinaryCalculate_0();
        String expected = "10101";
        String actual = binaryCalculate.addBinary("1010", "1011");
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 2
    * Test case values: "1111", "1111"
    * Expected output: "11110"
    */
    @Test
    void test_2() {
        BinaryCalculate_0 binaryCalculate = new BinaryCalculate_0();
        String expected = "11110";
        String actual = binaryCalculate.addBinary("1111", "1111");
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 3
    * Test case values: "1111", "11111"
    * Expected output: "111100"
    */
    @Test
    void test_3() {
        BinaryCalculate_0 binaryCalculate = new BinaryCalculate_0();
        String expected = "111100";
        String actual = binaryCalculate.addBinary("1111", "11111");
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 4
    * Test case values: "11111", "11111"
    * Expected output: "111110"
    */
    @Test
    void test_4() {
        BinaryCalculate_0 binaryCalculate = new BinaryCalculate_0();
        String expected = "111110";
        String actual = binaryCalculate.addBinary("11111", "11111");
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 5
    * Test case values: "111111", "11111"
    * Expected output: "1111110"
    */
    @Test
    void test_5() {
        BinaryCalculate_0 binaryCalculate = new BinaryCalculate_0();
        String expected = "1111110";
        String actual = binaryCalculate.addBinary("111111", "11111");
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 6
    * Test case values: "1111111", "11111"
    * Expected output: "11111110"
    */
    @Test
    void test_6() {
        BinaryCalculate_0 binaryCalculate = new BinaryCalculate_0();
        String expected = "11111110";
        String actual = binaryCalculate.addBinary("1111111", "11111");
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 7
    * Test case values: "11111111", "11111"
    * Expected output: "111111110"
    */
    @Test
    void test_7() {
        BinaryCalculate_0 binaryCalculate = new BinaryCalculate_0();
        String expected = "111111110";
        String actual = binaryCalculate.addBinary("11111111", "11111");
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 8
    * Test case values: "111111111", "11111"
    * Expected output: "1111111110"
    */
    @Test
    void test_8() {
        BinaryCalculate_0 binaryCalculate = new BinaryCalculate_0();
        String expected = "1111111110";
        String actual = binaryCalculate.addBinary("111111111", "11111");
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 9
    * Test case values: "1111111111", "11111"
    * Expected output: "11111111110"
    */
    @Test
    void test_9() {
        BinaryCalculate_0 binaryCalculate = new BinaryCalculate_0();
        String expected = "11111111110";
        String actual = binaryCalculate.addBinary("1111111111", "11111");
        assertEquals(expected, actual);
    }
}

// BinaryCalculate_1Test.java
package ipac;

import java.text.*;
import java.util.*;
import java.math.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BinaryCalculate}.
* It contains ten unit test cases for the {@link BinaryCalculate#addBinary(String, String)} method.
*/
class BinaryCalculate_1Test {
		
    /**
    * Test case number: 0
    * Test case values: "11", "1"
    * Expected output: "100"
    */
    @Test
    void test_0() {
        BinaryCalculate_1 binaryCalculate = new BinaryCalculate_1();
        String expected = "100";
        String actual = binaryCalculate.addBinary("11", "1");
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 1
    * Test case values: "1010", "1011"
    * Expected output: "10101"
    */
    @Test
    void test_1() {
        BinaryCalculate_1 binaryCalculate = new BinaryCalculate_1();
        String expected = "10101";
        String actual = binaryCalculate.addBinary("1010", "1011");
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 2
    * Test case values: "1111", "1111"
    * Expected output: "11110"
    */
    @Test
    void test_2() {
        BinaryCalculate_1 binaryCalculate = new BinaryCalculate_1();
        String expected = "11110";
        String actual = binaryCalculate.addBinary("1111", "1111");
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 3
    * Test case values: "1111", "11111"
    * Expected output: "111100"
    */
    @Test
    void test_3() {
        BinaryCalculate_1 binaryCalculate = new BinaryCalculate_1();
        String expected = "111100";
        String actual = binaryCalculate.addBinary("1111", "11111");
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 4
    * Test case values: "11111", "11111"
    * Expected output: "111110"
    */
    @Test
    void test_4() {
        BinaryCalculate_1 binaryCalculate = new BinaryCalculate_1();
        String expected = "111110";
        String actual = binaryCalculate.addBinary("11111", "11111");
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 5
    * Test case values: "111111", "11111"
    * Expected output: "1111110"
    */
    @Test
    void test_5() {
        BinaryCalculate_1 binaryCalculate = new BinaryCalculate_1();
        String expected = "1111110";
        String actual = binaryCalculate.addBinary("111111", "11111");
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 6
    * Test case values: "1111111", "11111"
    * Expected output: "11111110"
    */
    @Test
    void test_6() {
        BinaryCalculate_1 binaryCalculate = new BinaryCalculate_1();
        String expected = "11111110";