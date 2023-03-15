// ClientHandlerObjectPoolConfigTest.java
package org.quickserver.util.xmlreader;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClientHandlerObjectPoolConfig}.
* It contains ten unit test cases for the {@link ClientHandlerObjectPoolConfig#toXML(String)} method.
*/
class ClientHandlerObjectPoolConfigTest {

	@Test
	void testToXML() {
		ClientHandlerObjectPoolConfig config = new ClientHandlerObjectPoolConfig();
		config.setMaxActive(10);
		config.setMaxIdle(5);
		config.setInitSize(2);
		String xml = config.toXML("");
		assertEquals("<client-handler-object-pool>\n" +
				"\t<max-active>10</max-active>\n" +
				"\t<max-idle>5</max-idle>\n" +
				"\t<init-size>2</init-size>\n" +
				"</client-handler-object-pool>\n", xml);
	}
	
	@Test
	void testToXMLWithPad() {
		ClientHandlerObjectPoolConfig config = new ClientHandlerObjectPoolConfig();
		config.setMaxActive(10);
		config.setMaxIdle(5);
		config.setInitSize(2);
		String xml = config.toXML("\t");
		assertEquals("\t<client-handler-object-pool>\n" +
				"\t\t<max-active>10</max-active>\n" +
				"\t\t<max-idle>5</max-idle>\n" +
				"\t\t<init-size>2</init-size>\n" +
				"\t</client-handler-object-pool>\n", xml);
	}
	
	@Test
	void testToXMLWithNullPad() {
		ClientHandlerObjectPoolConfig config = new ClientHandlerObjectPoolConfig();
		config.setMaxActive(10);
		config.setMaxIdle(5);
		config.setInitSize(2);
		String xml = config.toXML(null);
		assertEquals("<client-handler-object-pool>\n" +
				"\t<max-active>10</max-active>\n" +
				"\t<max-idle>5</max-idle>\n" +
				"\t<init-size>2</init-size>\n" +
				"</client-handler-object-pool>\n", xml);
	}
	
	@Test
	void testToXMLWithEmptyPad() {
		ClientHandlerObjectPoolConfig config = new ClientHandlerObjectPoolConfig();
		config.setMaxActive(10);
		config.setMaxIdle(5);
		config.setInitSize(2);
		String xml = config.toXML("");
		assertEquals("<client-handler-object-pool>\n" +
				"\t<max-active>10</max-active>\n" +
				"\t<max-idle>5</max-idle>\n" +
				"\t<init-size>2</init-size>\n" +
				"</client-handler-object-pool>\n", xml);
	}
	
	@Test
	void testToXMLWithMaxActiveZero() {
		ClientHandlerObjectPoolConfig config = new ClientHandlerObjectPoolConfig();
		config.setMaxActive(0);
		config.setMaxIdle(5);
		config.setInitSize(2);
		String xml = config.toXML("");
		assertEquals("<client-handler-object-pool>\n" +
				"\t<max-active>0</max-active>\n" +
				"\t<max-idle>5</max-idle>\n" +
				"\t<init-size>2</init-size>\n" +
				"</client-handler-object-pool>\n", xml);
	}
	
	@Test
	void testToXMLWithMaxActiveNegative() {
		ClientHandlerObjectPoolConfig config = new ClientHandlerObjectPoolConfig();
		config.setMaxActive(-1);
		config.setMaxIdle(5);
		config.setInitSize(2);
		String xml = config.toXML("");
		assertEquals("<client-handler-object-pool>\n" +
				"\t<max-active>-1</max-active>\n" +
				"\t<max-idle>5</max-idle>\n" +
				"\t<init-size>2</init-size>\n" +
				"</client-handler-object-pool>\n", xml);
	}
	
	@Test
	void testToXMLWithMaxIdleZero() {
		ClientHandlerObjectPoolConfig config = new ClientHandlerObjectPoolConfig();
		config.setMaxActive(10);
		config.setMaxIdle(0);
		config.setInitSize(2);
		String xml = config.toXML("");
		assertEquals("<client-handler-object-pool>\n" +
				"\t<max-active>10</max-active>\n" +
				"\t<max-idle>0</max-idle>\n" +
				"\t<init-size>2</init-size>\n" +
				"</client-handler-object-pool>\n", xml);
	}
	
	@Test
	void testToXMLWithMaxIdleNegative() {
		ClientHandlerObjectPoolConfig config = new ClientHandlerObjectPoolConfig();
		config.setMaxActive(10);
		config.setMaxIdle(-1);
		config.setInitSize(2);
		String xml = config.toXML("");
		assertEquals("<client-handler-object-pool>\n" +
				"\t<max-active>10</max-active>\n" +
				"\t<max-idle>-1</max-idle>\n" +
				"\t<init-size>2</init-size>\n" +
				"</client-handler-object-pool>\n", xml);
	}
	
	@Test
	void testToXMLWithInitSizeZero() {
		ClientHandlerObjectPoolConfig config = new ClientHandlerObjectPoolConfig();
		config.setMaxActive(10);
		config.setMaxIdle(5);
		config.setInitSize(0);
		String xml = config.toXML("");
		assertEquals("<client-handler-object-pool>\n" +
				"\t<max-active>10</max-active>\n" +
				"\t<max-idle>5</max-idle>\n" +
				"\t<init-size>0</init-size>\n" +
				"</client-handler-object-pool>\n", xml);
	}
	
	@Test
	void testToXMLWithInitSizeNegative() {
		ClientHandlerObjectPoolConfig config = new ClientHandlerObjectPoolConfig();
		config.setMaxActive(10);
		config.setMaxIdle(5);
		config.setInitSize(-1);
		String xml = config.toXML("");
		assertEquals("<client-handler-object-pool>\n" +
				"\t<max-active>10</max-active>\n" +
				"\t<max-idle>5</max-idle>\n" +
				"\t<init-size>-1</init-size>\n" +
				"</client-handler-object-pool>\n", xml);
	}
	
	@Test
	void testToXMLWithAllZero() {
		ClientHandlerObjectPoolConfig config = new ClientHandlerObjectPoolConfig();
		config.setMaxActive(0);
		config.setMaxIdle(0);
		config.setInitSize(0);
		String xml = config.toXML("");
		assertEquals("<client-handler-object-pool>\n" +
				"\t<max-active>0</max-active>\n" +
				"\t<max-idle>0</max-idle>\n" +
				"\t<init-size>0</init-size>\n" +
				"</client-handler-object-pool>\n", xml);
	}
	
	@Test
	void testToXMLWithAllNegative() {
		ClientHandlerObjectPoolConfig config = new ClientHandlerObjectPoolConfig();
		config.setMaxActive(-1);
		config.setMaxIdle(-1);
		config.setInitSize(-1);
		String xml = config.toXML("");
		assertEquals("<client-handler-object-pool>\n" +
				"\t<max-active>-1</max-active>\n" +
				"\t<max-idle>-1</max-idle>\n" +
				"\t<init-size>-1</init-size>\n" +
				"</client-handler-object-pool>\n", xml);
	}
}

// ClientHandlerObjectPoolConfigTest.java
package org.quickserver.util.xmlreader;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClientHandlerObjectPoolConfig}.
* It contains ten unit test cases for the {@link ClientHandlerObjectPoolConfig#toXML(String)} method.
*/
class ClientHandlerObjectPoolConfigTest {
		
	@Test
	void testToXML() {
		ClientHandlerObjectPoolConfig config = new ClientHandlerObjectPoolConfig();
		config.setMaxActive(10);
		config.setMaxIdle(5);
		config.setInitSize(2);
		String xml = config.toXML("");
		assertEquals("<client-handler-object-pool>\n" +
				"\t<max-active>10</max-active>\n" +
				"\t<max-idle>5</max-idle>\n" +
				"\t<init-size>2</init-size>\n" +
				"</client-handler-object-pool>\n", xml);
	}
	
	@Test
	void testToXMLWithPad() {
		ClientHandlerObjectPoolConfig config = new ClientHandlerObjectPoolConfig();
		config.setMaxActive(10);
		config.setMaxIdle(5);
		config.setInitSize(2);
		String xml = config.toXML("\t");
		assertEquals("\t<client-handler-object-pool>\n" +
				"\t\t<max-active>10</max-active>\n" +
				"\t\t<max-idle>5</max-idle>\n" +
				"\t\t<init-size>2</init-size>\n" +
				"\t</client-handler-object-pool>\n", xml);
	}
	
	@Test
	void testToXMLWithNullPad() {
		ClientHandlerObjectPoolConfig config = new ClientHandlerObjectPoolConfig();
		config.setMaxActive(10);
		config.setMaxIdle(5);
		config.setInitSize(2);
		String xml = config.toXML(null);
		assertEquals("<client-handler-object-pool>\n" +
				"\t<max-active>10</max-active>\n" +
				"\t<max-idle>5</max-idle>\n" +
				"\t<init-size>2</init-size>\n" +
				"</client-handler-object-pool>\n", xml);
	}
	
	@Test
	void testToXMLWithEmptyPad() {
		ClientHandlerObjectPoolConfig config = new ClientHandlerObjectPoolConfig();
		config.setMaxActive(10);
		config.setMaxIdle(5);
		config.setInitSize(2);
		String xml = config.toXML("");
		assertEquals("<client-handler-object-pool>\n" +
				"\t<max-active>10</max-active>\n" +
				"\t<max-idle>5</max-idle>\n" +
				"\t<init-size>2</init-size>\n" +
				"</client-handler-object-pool>\n", xml);
	}
	
	@Test
	void testToXMLWithMaxActiveZero() {
		ClientHandlerObjectPoolConfig config = new ClientHandlerObjectPoolConfig();
		config.setMaxActive(0);
		config.setMaxIdle(5);
		config.setInitSize(2);
		String xml = config.toXML("");
		assertEquals("<client-handler-object-pool>\n" +
				"\t<max-active>0</max-active>\n" +
				"\t<max-idle>5</max-idle>\n" +
				"\t<init-size>2</init-size>\n" +
				"</client-handler-object-pool>\n", xml);
	}
	
	@Test
	void testToXMLWithMaxActiveNegative() {
		ClientHandlerObjectPoolConfig config = new ClientHandlerObjectPoolConfig();
		config.setMaxActive(-1);
		config.setMaxIdle(5);
		config.setInitSize(2);
		String xml = config.toXML("");
		assertEquals("<client-handler-object-pool>\n" +
				"\t<max-active>-1</max-active>\n" +
				"\t<max-idle>5</max-idle>\n" +
				"\t<init-size>2</init-size>\n" +
				"</client-handler-object-pool>\n", xml);
	}
	
	@Test
	void testToXMLWithMaxIdleZero() {
		ClientHandlerObjectPoolConfig config = new ClientHandlerObjectPoolConfig();
		config.setMaxActive(10);
		config.setMaxIdle(0);
		config.setInitSize(2);
		String xml = config.toXML("");
		assertEquals("<client-handler-object-pool>\n" +
				"\t<max-active>10</max-active>\n" +
				"\t<max-idle>0</max-idle>\n" +
				"\t<init-size>2</init-size>\n" +
				"</client-handler-object-pool>\n", xml);
	}
	
	@Test
	void testToXMLWithMaxIdleNegative() {
		ClientHandlerObjectPoolConfig config = new ClientHandlerObjectPoolConfig();
		config.setMaxActive(10);
		config.setMaxIdle(-1);
		config.setInitSize(2);
		String xml = config.toXML("");
		assertEquals("<client-handler-object-pool>\n" +
				"\t<max-active>10</max