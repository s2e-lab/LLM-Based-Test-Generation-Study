// ByteBufferObjectPoolConfigTest.java
package org.quickserver.util.xmlreader;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ByteBufferObjectPoolConfig}.
* It contains ten unit test cases for the {@link ByteBufferObjectPoolConfig#toXML(String)} method.
*/
class ByteBufferObjectPoolConfigTest {

	@Test
	void testToXML() {
		ByteBufferObjectPoolConfig config = new ByteBufferObjectPoolConfig();
		config.setMaxActive(10);
		config.setMaxIdle(5);
		config.setInitSize(2);
		String xml = config.toXML("");
		assertEquals("<byte-buffer-object-pool>\n" +
				"\t<max-active>10</max-active>\n" +
				"\t<max-idle>5</max-idle>\n" +
				"\t<init-size>2</init-size>\n" +
				"</byte-buffer-object-pool>\n", xml);
	}
	
	@Test
	void testToXMLWithPad() {
		ByteBufferObjectPoolConfig config = new ByteBufferObjectPoolConfig();
		config.setMaxActive(10);
		config.setMaxIdle(5);
		config.setInitSize(2);
		String xml = config.toXML("\t");
		assertEquals("\t<byte-buffer-object-pool>\n" +
				"\t\t<max-active>10</max-active>\n" +
				"\t\t<max-idle>5</max-idle>\n" +
				"\t\t<init-size>2</init-size>\n" +
				"\t</byte-buffer-object-pool>\n", xml);
	}
	
	@Test
	void testToXMLWithNullPad() {
		ByteBufferObjectPoolConfig config = new ByteBufferObjectPoolConfig();
		config.setMaxActive(10);
		config.setMaxIdle(5);
		config.setInitSize(2);
		String xml = config.toXML(null);
		assertEquals("<byte-buffer-object-pool>\n" +
				"\t<max-active>10</max-active>\n" +
				"\t<max-idle>5</max-idle>\n" +
				"\t<init-size>2</init-size>\n" +
				"</byte-buffer-object-pool>\n", xml);
	}
	
	@Test
	void testToXMLWithEmptyPad() {
		ByteBufferObjectPoolConfig config = new ByteBufferObjectPoolConfig();
		config.setMaxActive(10);
		config.setMaxIdle(5);
		config.setInitSize(2);
		String xml = config.toXML("");
		assertEquals("<byte-buffer-object-pool>\n" +
				"\t<max-active>10</max-active>\n" +
				"\t<max-idle>5</max-idle>\n" +
				"\t<init-size>2</init-size>\n" +
				"</byte-buffer-object-pool>\n", xml);
	}
	
	@Test
	void testToXMLWithMaxActive() {
		ByteBufferObjectPoolConfig config = new ByteBufferObjectPoolConfig();
		config.setMaxActive(10);
		String xml = config.toXML("");
		assertEquals("<byte-buffer-object-pool>\n" +
				"\t<max-active>10</max-active>\n" +
				"</byte-buffer-object-pool>\n", xml);
	}
	
	@Test
	void testToXMLWithMaxIdle() {
		ByteBufferObjectPoolConfig config = new ByteBufferObjectPoolConfig();
		config.setMaxIdle(5);
		String xml = config.toXML("");
		assertEquals("<byte-buffer-object-pool>\n" +
				"\t<max-idle>5</max-idle>\n" +
				"</byte-buffer-object-pool>\n", xml);
	}
	
	@Test
	void testToXMLWithInitSize() {
		ByteBufferObjectPoolConfig config = new ByteBufferObjectPoolConfig();
		config.setInitSize(2);
		String xml = config.toXML("");
		assertEquals("<byte-buffer-object-pool>\n" +
				"\t<init-size>2</init-size>\n" +
				"</byte-buffer-object-pool>\n", xml);
	}
	
	@Test
	void testToXMLWithMaxActiveAndMaxIdle() {
		ByteBufferObjectPoolConfig config = new ByteBufferObjectPoolConfig();
		config.setMaxActive(10);
		config.setMaxIdle(5);
		String xml = config.toXML("");
		assertEquals("<byte-buffer-object-pool>\n" +
				"\t<max-active>10</max-active>\n" +
				"\t<max-idle>5</max-idle>\n" +
				"</byte-buffer-object-pool>\n", xml);
	}
	
	@Test
	void testToXMLWithMaxActiveAndInitSize() {
		ByteBufferObjectPoolConfig config = new ByteBufferObjectPoolConfig();
		config.setMaxActive(10);
		config.setInitSize(2);
		String xml = config.toXML("");
		assertEquals("<byte-buffer-object-pool>\n" +
				"\t<max-active>10</max-active>\n" +
				"\t<init-size>2</init-size>\n" +
				"</byte-buffer-object-pool>\n", xml);
	}
	
	@Test
	void testToXMLWithMaxIdleAndInitSize() {
		ByteBufferObjectPoolConfig config = new ByteBufferObjectPoolConfig();
		config.setMaxIdle(5);
		config.setInitSize(2);
		String xml = config.toXML("");
		assertEquals("<byte-buffer-object-pool>\n" +
				"\t<max-idle>5</max-idle>\n" +
				"\t<init-size>2</init-size>\n" +
				"</byte-buffer-object-pool>\n", xml);
	}
	
	@Test
	void testToXMLWithMaxActiveAndMaxIdleAndInitSize() {
		ByteBufferObjectPoolConfig config = new ByteBufferObjectPoolConfig();
		config.setMaxActive(10);
		config.setMaxIdle(5);
		config.setInitSize(2);
		String xml = config.toXML("");
		assertEquals("<byte-buffer-object-pool>\n" +
				"\t<max-active>10</max-active>\n" +
				"\t<max-idle>5</max-idle>\n" +
				"\t<init-size>2</init-size>\n" +
				"</byte-buffer-object-pool>\n", xml);
	}
	
}

// ByteBufferObjectPoolConfigTest.java
package org.quickserver.util.xmlreader;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ByteBufferObjectPoolConfig}.
* It contains ten unit test cases for the {@link ByteBufferObjectPoolConfig#toXML(String)} method.
*/
class ByteBufferObjectPoolConfigTest {
		
	@Test
	void testToXML() {
