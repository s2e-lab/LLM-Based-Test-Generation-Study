// ClientDataObjectPoolConfigTest.java
package org.quickserver.util.xmlreader;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClientDataObjectPoolConfig}.
* It contains ten unit test cases for the {@link ClientDataObjectPoolConfig#toXML(String)} method.
*/
class ClientDataObjectPoolConfigTest {

	@Test
	void testToXML() {
		ClientDataObjectPoolConfig clientDataObjectPoolConfig = new ClientDataObjectPoolConfig();
		clientDataObjectPoolConfig.setMaxActive(10);
		clientDataObjectPoolConfig.setMaxIdle(5);
		clientDataObjectPoolConfig.setInitSize(2);
		String expected = "<client-data-object-pool>\n" +
				"\t<max-active>10</max-active>\n" +
				"\t<max-idle>5</max-idle>\n" +
				"\t<init-size>2</init-size>\n" +
				"</client-data-object-pool>\n";
		assertEquals(expected, clientDataObjectPoolConfig.toXML(null));
	}
	
	@Test
	void testToXMLWithPad() {
		ClientDataObjectPoolConfig clientDataObjectPoolConfig = new ClientDataObjectPoolConfig();
		clientDataObjectPoolConfig.setMaxActive(10);
		clientDataObjectPoolConfig.setMaxIdle(5);
		clientDataObjectPoolConfig.setInitSize(2);
		String expected = "    <client-data-object-pool>\n" +
				"        <max-active>10</max-active>\n" +
				"        <max-idle>5</max-idle>\n" +
				"        <init-size>2</init-size>\n" +
				"    </client-data-object-pool>\n";
		assertEquals(expected, clientDataObjectPoolConfig.toXML("    "));
	}
	
	@Test
	void testToXMLWithPadAndMaxActive() {
		ClientDataObjectPoolConfig clientDataObjectPoolConfig = new ClientDataObjectPoolConfig();
		clientDataObjectPoolConfig.setMaxActive(10);
		String expected = "    <client-data-object-pool>\n" +
				"        <max-active>10</max-active>\n" +
				"    </client-data-object-pool>\n";
		assertEquals(expected, clientDataObjectPoolConfig.toXML("    "));
	}
	
	@Test
	void testToXMLWithPadAndMaxIdle() {
		ClientDataObjectPoolConfig clientDataObjectPoolConfig = new ClientDataObjectPoolConfig();
		clientDataObjectPoolConfig.setMaxIdle(5);
		String expected = "    <client-data-object-pool>\n" +
				"        <max-idle>5</max-idle>\n" +
				"    </client-data-object-pool>\n";
		assertEquals(expected, clientDataObjectPoolConfig.toXML("    "));
	}
	
	@Test
	void testToXMLWithPadAndInitSize() {
		ClientDataObjectPoolConfig clientDataObjectPoolConfig = new ClientDataObjectPoolConfig();
		clientDataObjectPoolConfig.setInitSize(2);
		String expected = "    <client-data-object-pool>\n" +
				"        <init-size>2</init-size>\n" +
				"    </client-data-object-pool>\n";
		assertEquals(expected, clientDataObjectPoolConfig.toXML("    "));
	}
	
	@Test
	void testToXMLWithPadAndMaxActiveAndMaxIdle() {
		ClientDataObjectPoolConfig clientDataObjectPoolConfig = new ClientDataObjectPoolConfig();
		clientDataObjectPoolConfig.setMaxActive(10);
		clientDataObjectPoolConfig.setMaxIdle(5);
		String expected = "    <client-data-object-pool>\n" +
				"        <max-active>10</max-active>\n" +
				"        <max-idle>5</max-idle>\n" +
				"    </client-data-object-pool>\n";
		assertEquals(expected, clientDataObjectPoolConfig.toXML("    "));
	}
	
	@Test
	void testToXMLWithPadAndMaxActiveAndInitSize() {
		ClientDataObjectPoolConfig clientDataObjectPoolConfig = new ClientDataObjectPoolConfig();
		clientDataObjectPoolConfig.setMaxActive(10);
		clientDataObjectPoolConfig.setInitSize(2);
		String expected = "    <client-data-object-pool>\n" +
				"        <max-active>10</max-active>\n" +
				"        <init-size>2</init-size>\n" +
				"    </client-data-object-pool>\n";
		assertEquals(expected, clientDataObjectPoolConfig.toXML("    "));
	}
	
	@Test
	void testToXMLWithPadAndMaxIdleAndInitSize() {
		ClientDataObjectPoolConfig clientDataObjectPoolConfig = new ClientDataObjectPoolConfig();
		clientDataObjectPoolConfig.setMaxIdle(5);
		clientDataObjectPoolConfig.setInitSize(2);
		String expected = "    <client-data-object-pool>\n" +
				"        <max-idle>5</max-idle>\n" +
				"        <init-size>2</init-size>\n" +
				"    </client-data-object-pool>\n";
		assertEquals(expected, clientDataObjectPoolConfig.toXML("    "));
	}
	
	@Test
	void testToXMLWithPadAndMaxActiveAndMaxIdleAndInitSize() {
		ClientDataObjectPoolConfig clientDataObjectPoolConfig = new ClientDataObjectPoolConfig();
		clientDataObjectPoolConfig.setMaxActive(10);
		clientDataObjectPoolConfig.setMaxIdle(5);
		clientDataObjectPoolConfig.setInitSize(2);
		String expected = "    <client-data-object-pool>\n" +
				"        <max-active>10</max-active>\n" +
				"        <max-idle>5</max-idle>\n" +
				"        <init-size>2</init-size>\n" +
				"    </client-data-object-pool>\n";
		assertEquals(expected, clientDataObjectPoolConfig.toXML("    "));
	}
	
	@Test
	void testToXMLWithPadAndMaxActiveAndMaxIdleAndInitSizeAndNull() {
		ClientDataObjectPoolConfig clientDataObjectPoolConfig = new ClientDataObjectPoolConfig();
		clientDataObjectPoolConfig.setMaxActive(10);
		clientDataObjectPoolConfig.setMaxIdle(5);
		clientDataObjectPoolConfig.setInitSize(2);
		String expected = "    <client-data-object-pool>\n" +
				"        <max-active>10</max-active>\n" +
				"        <max-idle>5</max-idle>\n" +
				"        <init-size>2</init-size>\n" +
				"    </client-data-object-pool>\n";
		assertEquals(expected, clientDataObjectPoolConfig.toXML("    "));
	}
	
	@Test
	void testToXMLWithPadAndMaxActiveAndMaxIdleAndInitSizeAndEmpty() {
		ClientDataObjectPoolConfig clientDataObjectPoolConfig = new ClientDataObjectPoolConfig();
		clientDataObjectPoolConfig.setMaxActive(10);
		clientDataObjectPoolConfig.setMaxIdle(5);
		clientDataObjectPoolConfig.setInitSize(2);
		String expected = "    <client-data-object-pool>\n" +
				"        <