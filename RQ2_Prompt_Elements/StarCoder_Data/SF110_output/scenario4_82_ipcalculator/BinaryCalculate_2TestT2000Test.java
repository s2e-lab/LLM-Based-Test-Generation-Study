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
     *  Test case for the {@link BinaryCalculate#IPCalculate(String, String)} method.
     *  <br>This test case tests the method with a valid IPv4 address and number of IP addresses.
     */
    @Test
    void testIPCalculate_1() {
        BinaryCalculate binaryCalculate = new BinaryCalculate();
        String IP = "10.10.10.10";
        String IPPrefix = "255.255.255.255";
        String expected = "10.10.10.10 - 10.10.10.10\n";
        String actual = binaryCalculate.IPCalculate(IP, IPPrefix);
        assertEquals(expected, actual);
    }

    /**
     *  Test case for the {@link BinaryCalculate#IPCalculate(String, String)} method.
     *  <br>This test case tests the method with a valid IPv6 address and number of IP addresses.
     */
    @Test
    void testIPCalculate_2() {
        BinaryCalculate binaryCalculate = new BinaryCalculate();
        String IP = "2001:0db8:85a3:0000:0000:8a2e:0370:7334";
        String IPPrefix = "FFFF:FFFF:FFFF:FFFF:FFFF:FFFF:FFFF:FFFF";
        String expected = "2001:0db8:85a3:0000:0000:8a2e:0370:7334 - 2001:0db8:85a3:0000:0000:8a2e:0370:7334\n";
        String actual = binaryCalculate.IPCalculate(IP, IPPrefix);
        assertEquals(expected, actual);
    }

    /**
     *  Test case for the {@link BinaryCalculate#IPCalculate(String, String)} method.
     *  <br>This test case tests the method with a valid IPv4 address and number of IP addresses.
     */
    @Test
    void testIPCalculate_3() {
        BinaryCalculate binaryCalculate = new BinaryCalculate();
        String IP = "10.10.10.10";
        String IPPrefix = "255.255.255.255";
        String expected = "10.10.10.10 - 10.10.10.10\n";
        String actual = binaryCalculate.IPCalculate(IP, IPPrefix);
        assertEquals(expected, actual);
    }

    /**
     *  Test case for the {@link BinaryCalculate#IPCalculate(String, String)} method.
     *  <br>This test case tests the method with a valid IPv6 address and number of IP addresses.
     */
    @Test
    void testIPCalculate_4() {
        BinaryCalculate binaryCalculate = new BinaryCalculate();
        String IP = "2001:0db8:85a3:0000:0000:8a2e:0370:7334";
        String IPPrefix = "FFFF:FFFF:FFFF:FFFF:FFFF:FFFF:FFFF:FFFF";
        String expected = "2001:0db8:85a3:0000:0000:8a2e:0370:7334 - 2001:0db8:85a3:0000:0000:8a2e:0370:7334\n";
        String actual = binaryCalculate.IPCalculate(IP, IPPrefix);
        assertEquals(expected, actual);
    }

    /**
     *  Test case for the {@link BinaryCalculate#IPCalculate(String, String)} method.
     *  <br>This test case tests the method with a valid IPv4 address and number of IP addresses.
     */
    @Test
    void testIPCalculate_5() {
        BinaryCalculate binaryCalculate = new BinaryCalculate();
        String IP = "10.10.10.10";
        String IPPrefix = "255.255.255.255";
        String expected = "10.10.10.10 - 10.10.10.10\n";
        String actual = binaryCalculate.IPCalculate(IP, IPPrefix);
        assertEquals(expected, actual);
    }

    /**
     *  Test case for the {@link BinaryCalculate#IPCalculate(String, String)} method.
     *  <br>This test case tests the method with a valid IPv6 address and number of IP addresses.
     */
    @Test
    void testIPCalculate_6() {
        BinaryCalculate binaryCalculate = new BinaryCalculate();
        String IP = "2001:0db8:85a3:0000:0000:8a2e:0370:7334";
        String IPPrefix = "FFFF:FFFF:FFFF:FFFF:FFFF:FFFF:FFFF:FFFF";
        String expected = "2001:0db8:85a3:0000:0000:8a2e:0370:7334 - 2001:0db8:85a3:0000:0000:8a2e:0370:7334\n";
        String actual = binaryCalculate.IPCalculate(IP, IPPrefix);
        assertEquals(expected, actual);
    }

    /**
     *  Test case for the {@link BinaryCalculate#IPCalculate(String, String)} method.
     *  <br>This test case tests the method with a valid IPv4 address and number of IP addresses.
     */
    @Test
    void testIPCalculate_7() {
        BinaryCalculate binaryCalculate = new BinaryCalculate();
        String IP = "10.10.10.10";
        String IPPrefix = "255.255.255.255";
        String expected = "10.10.10.10 - 10.10.10.10\n";
        String actual = binaryCalculate.IPCalculate(IP, IPPrefix);
        assertEquals(expected, actual);
    }

    /**
     *  Test case for the {@link BinaryCalculate#IPCalculate(String, String)} method.
     *  <br>This test case tests the method with a valid IPv6 address and number of IP addresses.
     */
    @Test
    void testIPCalculate_8() {
        BinaryCalculate binaryCalculate = new BinaryCalculate();
        String IP = "2001:0db8:85a3:0000:0000:8a2e:0370:7334";
        String IPPrefix = "FFFF:FFFF:FFFF:FFFF:FFFF:FFFF:FFFF:FFFF";
        String expected = "2001:0db8:85a3:0000:0000:8a2e:0370:7334 - 2001:0db8:85a3:0000:0000:8a2e:0370:7334\n";
        String actual = binaryCalculate.IPCalculate(IP, IPPrefix);
        assertEquals(expected, actual);
    }

    /**
     *  Test case for the {@link BinaryCalculate#IPCalculate(String, String)} method.
     *  <br>This test case tests the method with a valid IPv4 address and number of IP addresses.
     */
    @Test
    void testIPCalculate_9() {
        BinaryCalculate binaryCalculate = new BinaryCalculate();
        String IP = "10.10.10.10";
        String IPPrefix = "255.255.255.255";
        String expected = "10.10.10.10 - 10.10.10.10\n";
        String actual = binaryCalculate.IPCalculate(IP, IPPrefix);
        assertEquals(expected, actual);
    }

    /**
     *  Test case for the {@link BinaryCalculate#IPCalculate(String, String)} method.
     *  <br>This test case tests the method with a valid IPv6 address and number of IP addresses.
     */
    @Test
    void testIPCalculate_10() {
        BinaryCalculate binaryCalculate = new BinaryCalculate();
        String IP = "2001:0db8:85a3:0000:0000:8a2e:0370:7334";
        String IPPrefix = "FFFF:FFFF:FFFF:FFFF:FFFF:FFFF:FFFF:FFFF";
        String expected = "2001:0db8:85a3:0000:0000:8a2e:0370:7334 -