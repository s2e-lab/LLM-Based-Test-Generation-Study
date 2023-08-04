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
        String num1 = "11";
        String num2 = "1";
        String expected = "100";
        String output = new BinaryCalculate().addBinary(num1, num2);
        assertEquals(expected, output);
    }

    /**
    * Test case number: 1
    * Test case values: "1010", "1011"
    * Expected output: "10101"
    */
    @Test
    void test_1() {
        String num1 = "1010";
        String num2 = "1011";
        String expected = "10101";
        String output = new BinaryCalculate().addBinary(num1, num2);
        assertEquals(expected, output);
    }

    /**
    * Test case number: 2
    * Test case values: "1111", "1111"
    * Expected output: "11110"
    */
    @Test
    void test_2() {
        String num1 = "1111";
        String num2 = "1111";
        String expected = "11110";
        String output = new BinaryCalculate().addBinary(num1, num2);
        assertEquals(expected, output);
    }

    /**
    * Test case number: 3
    * Test case values: "1111", "11111"
    * Expected output: "111100"
    */
    @Test
    void test_3() {
        String num1 = "1111";
        String num2 = "11111";
        String expected = "111100";
        String output = new BinaryCalculate().addBinary(num1, num2);
        assertEquals(expected, output);
    }

    /**
    * Test case number: 4
    * Test case values: "11111", "11111"
    * Expected output: "111110"
    */
    @Test
    void test_4() {
        String num1 = "11111";
        String num2 = "11111";
        String expected = "111110";
        String output = new BinaryCalculate().addBinary(num1, num2);
        assertEquals(expected, output);
    }

    /**
    * Test case number: 5
    * Test case values: "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111