// BinaryCalculate_2Test.java
package ipac;

import java.text.*;
import java.util.*;
import java.math.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BinaryCalculate}.
* It contains ten unit test cases for the {@link BinaryCalculate#IPCalculate(String, String)} method.
*/
class BinaryCalculate_2Test {

    /**
     * Test case for the {@link BinaryCalculate#IPCalculate(String, String)} method.
     * It tests the method with the following inputs:
     * <ul>
     * <li>IP: 10.0.0.0</li>
     * <li>IPPrefix: 24</li>
     * </ul>
     * The expected result is:
     * <ul>
     * <li>10.0.0.0 - 10.0.0.255</li>
     * </ul>
     */
    @Test
    void testIPCalculate_1() {
        BinaryCalculate binaryCalculate = new BinaryCalculate();
        String expected = "10.0.0.0 - 10.0.0.255";
        String actual = binaryCalculate.IPCalculate("10.0.0.0", "24");
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link BinaryCalculate#IPCalculate(String, String)} method.
     * It tests the method with the following inputs:
     * <ul>
     * <li>IP: 10.0.0.0</li>
     * <li>IPPrefix: 16</li>
     * </ul>
     * The expected result is:
     * <ul>
     * <li>10.0.0.0 - 10.0.255.255</li>
     * </ul>
     */
    @Test
    void testIPCalculate_2() {
        BinaryCalculate binaryCalculate = new BinaryCalculate();
        String expected = "10.0.0.0 - 10.0.255.255";
        String actual = binaryCalculate.IPCalculate("10.0.0.0", "16");
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link BinaryCalculate#IPCalculate(String, String)} method.
     * It tests the method with the following inputs:
     * <ul>
     * <li>IP: 10.0.0.0</li>
     * <li>IPPrefix: 8</li>
     * </ul>
     * The expected result is:
     * <ul>
     * <li>10.0.0.0 - 10.255.255.255</li>
     * </ul>
     */
    @Test
    void testIPCalculate_3() {
        BinaryCalculate binaryCalculate = new BinaryCalculate();
        String expected = "10.0.0.0 - 10.255.255.255";
        String actual = binaryCalculate.IPCalculate("10.0.0.0", "8");
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link BinaryCalculate#IPCalculate(String, String)} method.
     * It tests the method with the following inputs:
     * <ul>
     * <li>IP: 10.0.0.0</li>
     * <li>IPPrefix: 4</li>
     * </ul>
     * The expected result is:
     * <ul>
     * <li>10.0.0.0 - 10.0.0.15</li>
     * <li>10.0.0.16 - 10.0.0.31</li>
     * <li>10.0.0.32 - 10.0.0.47</li>
     * <li>10.0.0.48 - 10.0.0.63</li>
     * <li>10.0.0.64 - 10.0.0.79</li>
     * <li>10.0.0.80 - 10.0.0.95</li>
     * <li>10.0.0.96 - 10.0.0.111</li>
     * <li>10.0.0.112 - 10.0.0.127</li>
     * <li>10.0.0.128 - 10.0.0.143</li>
     * <li>10.0.0.144 - 10.0.0.159</li>
     * <li>10.0.0.160 - 10.0.0.175</li>
     * <li>10.0.0.176 - 10.0.0.191</li>
     * <li>10.0.0.192 - 10.0.0.207</li>
     * <li>10.0.0.208 - 10.0.0.223</li>
     * <li>10.0.0.224 - 10.0.0.239</li>
     * <li>10.0.0.240 - 10.0.0.255</li>
     * </ul>
     */
    @Test
    void testIPCalculate_4() {
        BinaryCalculate binaryCalculate = new BinaryCalculate();
        String expected = "10.0.0.0 - 10.0.0.15\n" +
                          "10.0.0.16 - 10.0.0.31\n" +
                          "10.0.0.32 - 10.0.0.47\n" +
                          "10.0.0.48 - 10.0.0.63\n" +
                          "10.0.0.64 - 10.0.0.79\n" +
                          "10.0.0.80 - 10.0.0.95\n" +
                          "10.0.0.96 - 10.0.0.111\n" +
                          "10.0.0.112 - 10.0.0.127\n" +
                          "10.0.0.128 - 10.0.0.143\n" +
                          "10.0.0.144 - 10.0.0.159\n" +
                          "10.0.0.160 - 10.0.0.175\n" +
                          "10.0.0.176 - 10.0.0.191\n" +
                          "10.0.0.192 - 10.0.0.207\n" +
                          "10.0.0.208 - 10.0.0.223\n" +
                          "10.0.0.224 - 10.0.0.239\n" +
                          "10.0.0.240 - 10.0.0.255";
        String actual = binaryCalculate.IPCalculate("10.0.0.0", "4");
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link BinaryCalculate#IPCalculate(String, String)} method.
     * It tests the method with the following inputs:
     * <ul>
     * <li>IP: 10.0.0.0</li>
     * <li>IPPrefix: 2</li>
     * </ul>
     * The expected result is:
     * <ul>
     * <li>10.0.0.0 - 10.0.0.1</li>
     * <li>10.0.0.2 - 10.0.0.3</li>
     * <li>10.0.0.4 - 10.0.0.5</li>
     * <li>10.0.0.6 - 10.0.0.7</li>
     * <li>10.0.0.8 - 10.0.0.9</li>
     * <li>10.0.0.10 - 10.0.0.11</li>
     * <li>10.0.0.12 - 10.0.0.13</li>
     * <li>10.0.0.14 - 10.0.0.15</li>
     * <li>10.0.0.16 - 10.0.0.17</li>
     * <li>