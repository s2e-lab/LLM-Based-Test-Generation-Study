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
		ClientDataObjectPoolConfig config = new ClientDataObjectPoolConfig();
		config.setMaxActive(10);
		config.setMaxIdle(5);
		config.setInitSize(2);
		String xml = config.toXML("");
		assertEquals("<client-data-object-pool>\n" +
				"\t<max-active>10</max-active>\n" +
				"\t<max-idle>5</max-idle>\n" +
				"\t<init-size>2</init-size>\n" +
				"</client-data-object-pool>\n", xml);
	}
	
	@Test
	void testToXMLWithPad() {
		ClientDataObjectPoolConfig config = new ClientDataObjectPoolConfig();
		config.setMaxActive(10);
		config.setMaxIdle(5);
		config.setInitSize(2);
		String xml = config.toXML("\t");
		assertEquals("\t<client-data-object-pool>\n" +
				"\t\t<max-active>10</max-active>\n" +
				"\t\t<max-idle>5</max-idle>\n" +
				"\t\t<init-size>2</init-size>\n" +
				"\t</client-data-object-pool>\n", xml);
	}
	
	@Test
	void testToXMLWithNullPad() {
		ClientDataObjectPoolConfig config = new ClientDataObjectPoolConfig();
		config.setMaxActive(10);
		config.setMaxIdle(5);
		config.setInitSize(2);
		String xml = config.toXML(null);
		assertEquals("<client-data-object-pool>\n" +
				"\t<max-active>10</max-active>\n" +
				"\t<max-idle>5</max-idle>\n" +
				"\t<init-size>2</init-size>\n" +
				"</client-data-object-pool>\n", xml);
	}
	
	@Test
	void testToXMLWithEmptyPad() {
		ClientDataObjectPoolConfig config = new ClientDataObjectPoolConfig();
		config.setMaxActive(10);
		config.setMaxIdle(5);
		config.setInitSize(2);
		String xml = config.toXML("");
		assertEquals("<client-data-object-pool>\n" +
				"\t<max-active>10</max-active>\n" +
				"\t<max-idle>5</max-idle>\n" +
				"\t<init-size>2</init-size>\n" +
				"</client-data-object-pool>\n", xml);
	}
	
	@Test
	void testToXMLWithMaxActiveZero() {
		ClientDataObjectPoolConfig config = new ClientDataObjectPoolConfig();
		config.setMaxActive(0);
		config.setMaxIdle(5);
		config.setInitSize(2);
		String xml = config.toXML("");
		assertEquals("<client-data-object-pool>\n" +
				"\t<max-active>0</max-active>\n" +
				"\t<max-idle>5</max-idle>\n" +
				"\t<init-size>2</init-size>\n" +
				"</client-data-object-pool>\n", xml);
	}
	
	@Test
	void testToXMLWithMaxActiveNegative() {
		ClientDataObjectPoolConfig config = new ClientDataObjectPoolConfig();
		config.setMaxActive(-1);
		config.setMaxIdle(5);
		config.setInitSize(2);
		String xml = config.toXML("");
		assertEquals("<client-data-object-pool>\n" +
				"\t<max-active>-1</max-active>\n" +
				"\t<max-idle>5</max-idle>\n" +
				"\t<init-size>2</init-size>\n" +
				"</client-data-object-pool>\n", xml);
	}
	
	@Test
	void testToXMLWithMaxIdleZero() {
		ClientDataObjectPoolConfig config = new ClientDataObjectPoolConfig();
		config.setMaxActive(10);
		config.setMaxIdle(0);
		config.setInitSize(2);
		String xml = config.toXML("");
		assertEquals("<client-data-object-pool>\n" +
				"\t<max-active>10</max-active>\n" +
				"\t<max-idle>0</max-idle>\n" +
				"\t<init-size>2</init-size>\n" +
				"</client-data-object-pool>\n", xml);
	}
	
	@Test
	void testToXMLWithMaxIdleNegative() {
		ClientDataObjectPoolConfig config = new ClientDataObjectPoolConfig();
		config.setMaxActive(10);
		config.setMaxIdle(-1);
		config.setInitSize(2);
		String xml = config.toXML("");
		assertEquals("<client-data-object-pool>\n" +
				"\t<max-active>10</max-active>\n" +
				"\t<max-idle>-1</max-idle>\n" +
				"\t<init-size>2</init-size>\n" +
				"</client-data-object-pool>\n", xml);
	}
	
	@Test
	void testToXMLWithInitSizeZero() {
		ClientDataObjectPoolConfig config = new ClientDataObjectPoolConfig();
		config.setMaxActive(10);
		config.setMaxIdle(5);
		config.setInitSize(0);
		String xml = config.toXML("");
		assertEquals("<client-data-object-pool>\n" +
				"\t<max-active>10</max-active>\n" +
				"\t<max-idle>5</max-idle>\n" +
				"\t<init-size>0</init-size>\n" +
				"</client-data-object-pool>\n", xml);
	}
	
	@Test
	void testToXMLWithInitSizeNegative() {
		ClientDataObjectPoolConfig config = new ClientDataObjectPoolConfig();
		config.setMaxActive(10);
		config.setMaxIdle(5);
		config.setInitSize(-1);
		String xml = config.toXML("");
		assertEquals("<client-data-object-pool>\n" +
				"\t<max-active>10</max-active>\n" +
				"\t<max-idle>5</max-idle>\n" +
				"\t<init-size>-1</init-size>\n" +
				"</client-data-object-pool>\n", xml);
	}
	
	@Test
	void testToXMLWithAllZero() {
		ClientDataObjectPoolConfig config = new ClientDataObjectPoolConfig();
		config.setMaxActive(0);
		config.setMaxIdle(0);
		config.setInitSize(0);
		String xml = config.toXML("");
		assertEquals("<client-data-object-pool>\n" +
				"\t<max-active>0</max-active>\n" +
				"\t<max-idle>0</max-idle>\n" +
				"\t<init-size>0</init-size>\n" +
				"</client-data-object-pool>\n", xml);
	}
	
	@Test
	void testToXMLWithAllNegative() {
		ClientDataObjectPoolConfig config = new ClientDataObjectPoolConfig();
		config.setMaxActive(-1);
		config.setMaxIdle(-1);
		config.setInitSize(-1);
		String xml = config.toXML("");
		assertEquals("<client-data-object-pool>\n" +
				"\t<max-active>-1</max-active>\n" +
				"\t<max-idle>-1</max-idle>\n" +
				"\t<init-size>-1</init-size>\n" +
				"</client-data-object-pool>\n", xml);
	}
}

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
		ClientDataObjectPoolConfig config = new ClientDataObjectPoolConfig();
		config.setMaxActive(10);
		config.setMaxIdle(5);
		config.setInitSize(2);
		String xml = config.toXML("");
		assertEquals("<client-data-object-pool>\n" +
				"\t<max-active>10</max-active>\n" +
				"\t<max-idle>5</max-idle>\n" +
				"\t<init-size>2</init-size>\n" +
				"</client-data-object-pool>\n", xml);
	}
	
	@Test
	void testToXMLWithPad() {
		ClientDataObjectPoolConfig config = new ClientDataObjectPoolConfig();
		config.setMaxActive(10);
		config.setMaxIdle(5);
		config.setInitSize(2);
		String xml = config.toXML("\t");
		assertEquals("\t<client-data-object-pool>\n" +
				"\t\t<max-active>10</max-active>\n" +
				"\t\t<max-idle>5</max-idle>\n" +
				"\t\t<init-size>2</init-size>\n" +
				"\t</client-data-object-pool>\n", xml);
	}
	
	@Test
	void testToXMLWithNullPad() {
		ClientDataObjectPoolConfig config = new ClientDataObjectPoolConfig();
		config.setMaxActive(10);
		config.setMaxIdle(5);
		config.setInitSize(2);
		String xml = config.toXML(null);
		assertEquals("<client-data-object-pool>\n" +
				"\t<max-active>10</max-active>\n" +
				"\t<max-idle>5</max-idle>\n" +
				"\t<init-size>2</init-size>\n" +
				"</client-data-object-pool>\n", xml);
	}
	
	@Test
	void testToXMLWithEmptyPad() {
		ClientDataObjectPoolConfig config = new ClientDataObjectPoolConfig();
		config.setMaxActive(10);
		config.setMaxIdle(5);
		config.setInitSize(2);
		String xml = config.toXML("");
		assertEquals("<client-data-object-pool>\n" +
				"\t<max-active>10</max-active>\n" +
				"\t<max-idle>5</max-idle>\n" +
				"\t<init-size>2</init-size>\n" +
				"</client-data-object-pool>\n", xml);
	}
	
	@Test
	void testToXMLWithMaxActiveZero() {
		ClientDataObjectPoolConfig config = new ClientDataObjectPoolConfig();
		config.setMaxActive(0);
		config.setMaxIdle(5);
		config.setInitSize(2);
		String xml = config.toXML("");
		assertEquals("<client-data-object-pool>\n" +
				"\t<max-active>0</max-active>\n" +
				"\t<max-idle>5</max-idle>\n" +
				"\t<init-size>2</init-size>\n" +
				"</client-data-object-pool>\n", xml);
	}
	
	@Test
	void testToXMLWithMaxActiveNegative() {
		ClientDataObjectPoolConfig config = new ClientDataObjectPoolConfig();
		config.setMaxActive(-1);
		config.setMaxIdle(5);
		config.setInitSize(2);
		String xml = config.toXML("");
		assertEquals("<client-data-object-pool>\n" +
				"\t<max-active>-1</max-active>\n" +
				"\t<max-idle>5</max-idle>\n" +
				"\t<init-size>2</init-size>\n" +
				"</client-data-object-pool>\n", xml);
	}
	
	@Test
	void testToXMLWithMaxIdleZero() {
		ClientDataObjectPoolConfig config = new ClientDataObjectPoolConfig();
		config.setMaxActive(10);
		config.setMaxIdle(0);
		config.setInitSize(2);
		String xml = config.toXML("");
		assertEquals("<client-data-object-pool>\n" +
				"\t<max-active>10</max-active>\n" +
				"\t<max-idle>0</max-idle>\n" +
				"\t<init-size>2</init-size>\n" +
				"</client-data-object-pool>\n", xml);
	}
	
	@Test
	void testToXMLWithMaxIdleNegative() {
		ClientDataObjectPoolConfig config = new ClientDataObjectPoolConfig();
		config.setMaxActive(10);
		config.setMaxIdle(-1);
		config.setInitSize(2);
		String xml = config.toXML("");
		assertEquals("<client-data-object-pool>\n" +
				"\t<max-active>10</max