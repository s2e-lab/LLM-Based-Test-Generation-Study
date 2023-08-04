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
     * It tests the method with a valid IP address and number of IP addresses.
     */
    @Test
    void testIPCalculate() {
        BinaryCalculate test = new BinaryCalculate();
        String IP = "192.168.1.1";
        String IPPrefix = "24";
        String expected = "Total Range: 192.168.1.1 - 192.168.1.254\n" +
                "Usable Range: 192.168.1.2 - 192.168.1.253\n" +
                "\n" +
                "Total usable IP Addresses : 254\n" +
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
     * It tests the method with a valid IP address and number of IP addresses.
     */
    @Test
    void testIPCalculate2() {
        BinaryCalculate test = new BinaryCalculate();
        String IP = "192.168.1.1";
        String IPPrefix = "25";
        String expected = "Total Range: 192.168.1.1 - 192.168.1.126\n" +
                "Usable Range: 192.168.1.2 - 192.168.1.125\n" +
                "\n" +
                "Total usable IP Addresses : 126\n" +
                "Subnet: 192.168.1.0\n" +
                "Binary Subnet: 11000000.10101000.00000001.00000000\n" +
                "Broadcast Address: 192.168.1.127\n" +
                "Prefix: 25\n" +
                "Netmask: 255.255.255.128\n" +
                "Binary Netmask: 11111111.11111111.11111111.10000000";
        assertEquals(expected, test.IPCalculate(IP, IPPrefix));
    }

    /**
     * Test case for the {@link BinaryCalculate#IPCalculate(String, String)} method.
     * It tests the method with a valid IP address and number of IP addresses.
     */
    @Test
    void testIPCalculate3() {
        BinaryCalculate test = new BinaryCalculate();
        String IP = "192.168.1.1";
        String IPPrefix = "26";
        String expected = "Total Range: 192.168.1.1 - 192.168.1.62\n" +
                "Usable Range: 192.168.1.2 - 192.168.1.61\n" +
                "\n" +
                "Total usable IP Addresses : 62\n" +
                "Subnet: 192.168.1.0\n" +
                "Binary Subnet: 11000000.10101000.00000001.00000000\n" +
                "Broadcast Address: 192.168.1.63\n" +
                "Prefix: 26\n" +
                "Netmask: 255.255.255.192\n" +
                "Binary Netmask: 11111111.11111111.11111111.11000000";
        assertEquals(expected, test.IPCalculate(IP, IPPrefix));
    }

    /**
     * Test case for the {@link BinaryCalculate#IPCalculate(String, String)} method.
     * It tests the method with a valid IP address and number of IP addresses.
     */
    @Test
    void testIPCalculate4() {
        BinaryCalculate test = new BinaryCalculate();
        String IP = "192.168.1.1";
        String IPPrefix = "27";
        String expected = "Total Range: 192.168.1.1 - 192.168.1.30\n" +
                "Usable Range: 192.168.1.2 - 192.168.1.29\n" +
                "\n" +
                "Total usable IP Addresses : 30\n" +
                "Subnet: 192.168.1.0\n" +
                "Binary Subnet: 11000000.10101000.00000001.00000000\n" +
                "Broadcast Address: 192.168.1.31\n" +
                "Prefix: 27\n" +
                "Netmask: 255.255.255.224\n" +
                "Binary Netmask: 11111111.11111111.11111111.11100000";
        assertEquals(expected, test.IPCalculate(IP, IPPrefix));
    }

    /**
     * Test case for the {@link BinaryCalculate#IPCalculate(String, String)} method.
     * It tests the method with a valid IP address and number of IP addresses.
     */
    @Test
    void testIPCalculate5() {
        BinaryCalculate test = new BinaryCalculate();
        String IP = "192.168.1.1";
        String IPPrefix = "28";
        String expected = "Total Range: 192.168.1.1 - 192.168.1.14\n" +
                "Usable Range: 192.168.1.2 - 192.168.1.13\n" +
                "\n" +
                "Total usable IP Addresses : 14\n" +
                "Subnet: 192.168.1.0\n" +
                "Binary Subnet: 11000000.10101000.00000001.00000000\n" +
                "Broadcast Address: 192.168.1.15\n" +
                "Prefix: 28\n" +
                "Netmask: 255.255.255.240\n" +
                "Binary Netmask: 11111111.11111111.11111111.11110000";
        assertEquals(expected, test.IPCalculate(IP, IPPrefix));
    }

    /**
     * Test case for the {@link BinaryCalculate#IPCalculate(String, String)} method.
     * It tests the method with a valid IP address and number of IP addresses.
     */
    @Test
    void testIPCalculate6() {
        BinaryCalculate test = new BinaryCalculate();
        String IP = "192.168.1.1";
        String IPPrefix = "29";
        String expected = "Total Range: 192.168.1.1 - 192.168.1.6\n" +
                "Usable Range: 192.168.1.2 - 192.168.1.5\n" +
                "\n" +
                "Total usable IP Add