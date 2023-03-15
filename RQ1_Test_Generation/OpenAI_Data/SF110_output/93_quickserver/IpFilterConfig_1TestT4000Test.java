// IpFilterConfig_1Test.java
package org.quickserver.util.xmlreader;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IpFilterConfig}.
* It contains ten unit test cases for the {@link IpFilterConfig#toXML(String)} method.
*/
class IpFilterConfig_1Test {

	@Test
	void testToXML_1() {
		IpFilterConfig ipFilterConfig = new IpFilterConfig();
		ipFilterConfig.setEnable(true);
		ipFilterConfig.setAllowAccess(true);
		ipFilterConfig.addClientIpAddress("127.0.0.1");
		ipFilterConfig.addClientIpAddress("192.168.1.1");
		String expected = "<ip-filter>\n" +
			"\t<enable>true</enable>\n" +
			"\t<allow-access>true</allow-access>\n" +
			"\t<ip-collection>\n" +
			"\t\t<client-ip-address>127.0.0.1</client-ip-address>\n" +
			"\t\t<client-ip-address>192.168.1.1</client-ip-address>\n" +
			"\t</ip-collection>\n" +
			"</ip-filter>\n";
		assertEquals(expected, ipFilterConfig.toXML(null));
	}
	
	@Test
	void testToXML_2() {
		IpFilterConfig ipFilterConfig = new IpFilterConfig();
		ipFilterConfig.setEnable(true);
		ipFilterConfig.setAllowAccess(false);
		ipFilterConfig.addClientIpAddress("127.0.0.1");
		ipFilterConfig.addClientIpAddress("192.168.1.1");
		String expected = "<ip-filter>\n" +
			"\t<enable>true</enable>\n" +
			"\t<allow-access>false</allow-access>\n" +
			"\t<ip-collection>\n" +
			"\t\t<client-ip-address>127.0.0.1</client-ip-address>\n" +
			"\t\t<client-ip-address>192.168.1.1</client-ip-address>\n" +
			"\t</ip-collection>\n" +
			"</ip-filter>\n";
		assertEquals(expected, ipFilterConfig.toXML(null));
	}
	
	@Test
	void testToXML_3() {
		IpFilterConfig ipFilterConfig = new IpFilterConfig();
		ipFilterConfig.setEnable(false);
		ipFilterConfig.setAllowAccess(true);
		ipFilterConfig.addClientIpAddress("127.0.0.1");
		ipFilterConfig.addClientIpAddress("192.168.1.1");
		String expected = "<ip-filter>\n" +
			"\t<enable>false</enable>\n" +
			"\t<allow-access>true</allow-access>\n" +
			"\t<ip-collection>\n" +
			"\t\t<client-ip-address>127.0.0.1</client-ip-address>\n" +
			"\t\t<client-ip-address>192.168.1.1</client-ip-address>\n" +
			"\t</ip-collection>\n" +
			"</ip-filter>\n";
		assertEquals(expected, ipFilterConfig.toXML(null));
	}
	
	@Test
	void testToXML_4() {
		IpFilterConfig ipFilterConfig = new IpFilterConfig();
		ipFilterConfig.setEnable(false);
		ipFilterConfig.setAllowAccess(false);
		ipFilterConfig.addClientIpAddress("127.0.0.1");
		ipFilterConfig.addClientIpAddress("192.168.1.1");
		String expected = "<ip-filter>\n" +
			"\t<enable>false</enable>\n" +
			"\t<allow-access>false</allow-access>\n" +
			"\t<ip-collection>\n" +
			"\t\t<client-ip-address>127.0.0.1</client-ip-address>\n" +
			"\t\t<client-ip-address>192.168.1.1</client-ip-address>\n" +
			"\t</ip-collection>\n" +
			"</ip-filter>\n";
		assertEquals(expected, ipFilterConfig.toXML(null));
	}
	
	@Test
	void testToXML_5() {
		IpFilterConfig ipFilterConfig = new IpFilterConfig();
		ipFilterConfig.setEnable(true);
		ipFilterConfig.setAllowAccess(true);
		ipFilterConfig.addClientIpAddress("127.0.0.1");
		String expected = "<ip-filter>\n" +
			"\t<enable>true</enable>\n" +
			"\t<allow-access>true</allow-access>\n" +
			"\t<ip-collection>\n" +
			"\t\t<client-ip-address>127.0.0.1</client-ip-address>\n" +
			"\t</ip-collection>\n" +
			"</ip-filter>\n";
		assertEquals(expected, ipFilterConfig.toXML(null));
	}
	
	@Test
	void testToXML_6() {
		IpFilterConfig ipFilterConfig = new IpFilterConfig();
		ipFilterConfig.setEnable(true);
		ipFilterConfig.setAllowAccess(false);
		ipFilterConfig.addClientIpAddress("127.0.0.1");
		String expected = "<ip-filter>\n" +
			"\t<enable>true</enable>\n" +
			"\t<allow-access>false</allow-access>\n" +
			"\t<ip-collection>\n" +
			"\t\t<client-ip-address>127.0.0.1</client-ip-address>\n" +
			"\t</ip-collection>\n" +
			"</ip-filter>\n";
		assertEquals(expected, ipFilterConfig.toXML(null));
	}
	
	@Test
	void testToXML_7() {
		IpFilterConfig ipFilterConfig = new IpFilterConfig();
		ipFilterConfig.setEnable(false);
		ipFilterConfig.setAllowAccess(true);
		ipFilterConfig.addClientIpAddress("127.0.0.1");
		String expected = "<ip-filter>\n" +
			"\t<enable>false</enable>\n" +
			"\t<allow-access>true</allow-access>\n" +
			"\t<ip-collection>\n" +
			"\t\t<client-ip-address>127.0.0.1</client-ip-address>\n" +
			"\t</ip-collection>\n" +
			"</ip-filter>\n";
		assertEquals(expected, ipFilterConfig.toXML(null));
	}
	
	@Test
	void testToXML_8() {
		IpFilterConfig ipFilterConfig = new IpFilterConfig();
		ipFilterConfig.setEnable(false);
		ipFilterConfig.setAllowAccess(false);
		ipFilterConfig.addClientIpAddress("127.0.0.1");
		String expected = "<ip-filter>\n" +
			"\t<enable>false</enable>\n" +
			"\t<allow-access>false</allow-access>\n" +
			"\t<ip-collection>\n" +
			"\t\t<client-ip-address>127.0.0.1</client-ip-address>\n" +
			"\t</ip-collection>\n" +
			"</ip-filter>\n";
		assertEquals(expected, ipFilterConfig.toXML(null));
	}
	
	@Test
	void testToXML_9() {
		IpFilterConfig ipFilterConfig = new IpFilterConfig();
		ipFilterConfig.setEnable(true);
		ipFilterConfig.setAllowAccess(true);
		String expected = "<ip-filter>\n" +
			"\t<enable>true</enable>\n" +
			"\t<allow-access>true</allow-access>\n" +
			"\t<ip-collection>\n" +
			"\t</ip-collection>\n" +
			"</ip-filter>\n";
		assertEquals(expected, ipFilterConfig.toXML(null));
	}
	
	@Test
	void testToXML_10() {
		IpFilterConfig ipFilterConfig = new IpFilterConfig();
		ipFilterConfig.setEnable(true);
		ipFilterConfig.setAllowAccess(false);
		String expected = "<ip-filter>\n" +
			"\t<enable>true</enable>\n" +
			"\t<allow-access>false</allow-access>\n" +
			"\t<ip-collection>\n" +
			"\t</ip-collection>\n" +
			"</ip-filter>\n";
		assertEquals(expected, ipFilterConfig.toXML(null));
	}
	
}

// IpFilterConfig_2Test.java
package org.quickserver.util.xmlreader;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IpFilterConfig}.
* It contains ten unit test cases for the {@link IpFilterConfig#toXML(String)} method.
*/
class IpFilterConfig_2Test {
		
	@Test
	void testToXML_1() {
		IpFilterConfig ipFilterConfig = new IpFilterConfig();
		ipFilterConfig.setEnable(true);
		ipFilterConfig.setAllowAccess(true);
		ipFilterConfig.addClientIpAddress("127.0.0.1");
		ipFilterConfig.addClientIpAddress("192.168.1.1");
		String expected = "<ip-filter>\n" +
			"\t<enable>true</enable>\n" +
			"\t<allow-access>true</allow-access>\n" +
			"\t<ip-collection>\n" +
			"\t\t<client-ip-address>127.0.0.1</client-ip-address>\n" +
			"\t\t<client-ip-address>192.168.1.1</client-ip-address>\n" +
			"\t</ip-collection>\n" +
			"</ip-filter>\n";
		assertEquals(expected, ipFilterConfig.toXML(null));
	}
	
	@Test
	void testToXML_2() {
		IpFilterConfig ipFilterConfig = new IpFilterConfig();
		ipFilterConfig.setEnable(true);
		ipFilterConfig.setAllowAccess(false);
		ipFilterConfig.addClientIpAddress("127.0.0.1");
		ipFilterConfig.addClientIpAddress("192.168.1.1");
		String expected = "<ip-filter>\n" +
			"\t<enable>true</enable>\n" +
			"\t<allow-access>false</allow-access>\n" +
			"\t<ip-collection>\n" +
			"\t\t<client-ip-address>127.0.0.1</client-ip-address>\n" +
			"\t\t<client-ip-address>192.168.1.1</client-ip-address>\n" +
			"\t</ip-collection>\n" +
			"</ip-filter>\n";
		assertEquals(expected, ipFilterConfig.toXML(null));
	}
	
	@Test
	void testToXML_3() {
		IpFilterConfig ipFilterConfig = new IpFilterConfig();
		ipFilterConfig.setEnable(false);
		ipFilterConfig.setAllowAccess(true);
		ipFilterConfig.addClientIpAddress("127.0.0.1");
		ipFilterConfig.addClientIpAddress("192.168.1.1");
		String expected = "<ip-filter>\n" +
			"\t<enable>false</enable>\n" +
			"\t<allow-access>true</allow-access>\n" +
			"\t<ip-collection>\n" +
			"\t\t<client-ip-address>127.0.0.1</client-ip-address>\n" +
			"\t\t<client-ip-address>192.168.1.1</client-ip-address>\n" +
			"\t</ip-collection>\n" +
			"</ip-filter>\n";
		assertEquals(expected, ipFilterConfig.toXML(null));
	}
	
	@Test
	void testToXML_4() {
		IpFilterConfig ipFilterConfig = new IpFilterConfig();
		ipFilterConfig.setEnable(false);
		ipFilterConfig.setAllowAccess(false);
		ipFilterConfig.addClientIpAddress("127.0.0.1");
		ipFilterConfig.addClientIpAddress("192.168.1.1");
		String expected = "<ip-filter>\n" +
			"\t<enable>false</enable>\n" +
			"\t<allow-access>false</allow-access>\n" +
			"\t<ip-collection>\n" +
			"\t\t<client-ip-address>127.0.0.1</client-ip-address>\n" +
			"\t\t<client-ip-address>192.168.1.1</client-ip-address>\n" +
			"\t</ip-collection>\n" +
			"</ip-filter>\n";
		assertEquals(expected, ipFilterConfig.toXML(null));
	}
	
	@Test
	void testToXML_5() {
		IpFilterConfig ipFilterConfig = new IpFilterConfig();
		ipFilterConfig.setEnable(true);
		ipFilterConfig.setAllowAccess(true);
		ipFilterConfig.addClientIpAddress("127.0.0.1");
		String expected = "<ip-filter>\n" +
			"\t<enable>true</enable>\n" +
			"\t<allow-access>true</allow-access>\n" +
			"\t<ip-collection>\n" +
			"\t\t<client-ip-address>127.0.0.1</client-ip-address>\n" +
			"\t</ip-collection>\n" +
			"</ip-filter>\n";
		assertEquals(expected, ipFilterConfig.toXML(null));
	}
	
	@Test
	