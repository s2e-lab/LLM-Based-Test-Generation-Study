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
    */
    @Test
    void testIPCalculate() {
        BinaryCalculate test = new BinaryCalculate();
        String IP = "192.168.1.1";
        String IPPrefix = "255.255.255.0";
        String expected = "Total Range: 192.168.1.1 - 192.168.1.254\n" +
        "Usable Range: 192.168.1.2 - 192.168.1.253\n" +
        "\n" +
        "Total usable IP Addresses : 16777214\n" +
        "Subnet: 192.168.1.0\n" +
        "Binary Subnet: 11000000.10101000.00000001.00000000\n" +
        "Broadcast Address: 192.168.1.255\n" +
        "Prefix: 24\n" +
        "Netmask: 255.255.255.0\n" +
        "Binary Netmask: 11111111.11111111.11111111.00000000";
        assertEquals(expected, test.IPCalculate(IP, IPPrefix));
    }

    /**
    * Test case for the {@link BinaryCalculate#IPCalculate(String, String)} method.
    */
    @Test
    void testIPCalculate_2() {
        BinaryCalculate test = new BinaryCalculate();
        String IP = "192.168.1.1";
        String IPPrefix = "255.255.255.255";
        String expected = "Total Range: 192.168.1.1 - 192.168.1.254\n" +
        "Usable Range: 192.168.1.2 - 192.168.1.253\n" +
        "\n" +
        "Total usable IP Addresses : 16777214\n" +
        "Subnet: 192.168.1.0\n" +
        "Binary Subnet: 11000000.10101000.00000001.00000000\n" +
        "Broadcast Address: 192.168.1.255\n" +
        "Prefix: 24\n" +
        "Netmask: 255.255.255.255\n" +
        "Binary Netmask: 11111111.11111111.11111111.11111111";
        assertEquals(expected, test.IPCalculate(IP, IPPrefix));
    }

    /**
    * Test case for the {@link BinaryCalculate#IPCalculate(String, String)} method.
    */
    @Test
    void testIPCalculate_3() {
        BinaryCalculate test = new BinaryCalculate();
        String IP = "192.168.1.1";
        String IPPrefix = "255.255.255.128";
        String expected = "Total Range: 192.168.1.1 - 192.168.1.254\n" +
        "Usable Range: 192.168.1.2 - 192.168.1.253\n" +
        "\n" +
        "Total usable IP Addresses : 16777214\n" +
        "Subnet: 192.168.1.0\n" +
        "Binary Subnet: 11000000.10101000.00000001.00000000\n" +
        "Broadcast Address: 192.168.1.255\n" +
        "Prefix: 24\n" +
        "Netmask: 255.255.255.128\n" +
        "Binary Netmask: 11111111.11111111.11111111.10000000";
        assertEquals(expected, test.IPCalculate(IP, IPPrefix));
    }

    /**
    * Test case for the {@link BinaryCalculate#IPCalculate(String, String)} method.
    */
    @Test
    void testIPCalculate_4() {
        BinaryCalculate test = new BinaryCalculate();
        String IP = "192.168.1.1";
        String IPPrefix = "255.255.255.192";
        String expected = "Total Range: 192.168.1.1 - 192.168.1.254\n" +
        "Usable Range: 192.168.1.2 - 192.168.1.253\n" +
        "\n" +
        "Total usable IP Addresses : 16777214\n" +
        "Subnet: 192.168.1.0\n" +
        "Binary Subnet: 11000000.10101000.00000001.00000000\n" +
        "Broadcast Address: 192.168.1.255\n" +
        "Prefix: 24\n" +
        "Netmask: 255.255.255.192\n" +
        "Binary Netmask: 11111111.11111111.11111111.11000000";
        assertEquals(expected, test.IPCalculate(IP, IPPrefix));
    }

    /**
    * Test case for the {@link BinaryCalculate#IPCalculate(String, String)} method.
    */
    @Test
    void testIPCalculate_5() {
        BinaryCalculate test = new BinaryCalculate();
        String IP = "192.168.1.1";
        String IPPrefix = "255.255.255.224";
        String expected = "Total Range: 192.168.1.1 - 192.168.1.254\n" +
        "Usable Range: 192.168.1.2 - 192.168.1.253\n" +
        "\n" +
        "Total usable IP Addresses : 16777214\n" +
        "Subnet: 192.168.1.0\n" +
        "Binary Subnet: 11000000.10101000.00000001.00000000\n" +
        "Broadcast Address: 192.168.1.255\n" +
        "Prefix: 24\n" +
        "Netmask: 255.255.255.224\n" +
        "Binary Netmask: 11111111.11111111.11111111.11100000";
        assertEquals(expected, test.IPCalculate(IP, IPPrefix));
    }

    /**
    * Test case for the {@link BinaryCalculate#IPCalculate(String, String)} method.
    */
    @Test
    void testIPCalculate_6() {
        BinaryCalculate test = new BinaryCalculate();
        String IP = "192.168.1.1";
        String IPPrefix = "255.255.255.240";
        String expected = "Total Range: 192.168.1.1 - 192.168.1.254\n" +
        "Usable Range: 192.168.1.2 - 192.168.