// ObjectPoolConfigTest.java
package org.quickserver.util.xmlreader;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ObjectPoolConfig}.
* It contains ten unit test cases for the {@link ObjectPoolConfig#toXML(String)} method.
*/
class ObjectPoolConfigTest {

	@Test
	void testToXML() {
		ObjectPoolConfig objectPoolConfig = new ObjectPoolConfig();
		objectPoolConfig.setMaxActive(10);
		objectPoolConfig.setMaxIdle(5);
		objectPoolConfig.setInitSize(2);
		objectPoolConfig.getThreadObjectPoolConfig().setMaxActive(10);
		objectPoolConfig.getThreadObjectPoolConfig().setMaxIdle(5);
		objectPoolConfig.getThreadObjectPoolConfig().setInitSize(2);
		objectPoolConfig.getClientHandlerObjectPoolConfig().setMaxActive(10);
		objectPoolConfig.getClientHandlerObjectPoolConfig().setMaxIdle(5);
		objectPoolConfig.getClientHandlerObjectPoolConfig().setInitSize(2);
		objectPoolConfig.getByteBufferObjectPoolConfig().setMaxActive(10);
		objectPoolConfig.getByteBufferObjectPoolConfig().setMaxIdle(5);
		objectPoolConfig.getByteBufferObjectPoolConfig().setInitSize(2);
		objectPoolConfig.getClientDataObjectPoolConfig().setMaxActive(10);
		objectPoolConfig.getClientDataObjectPoolConfig().setMaxIdle(5);
		objectPoolConfig.getClientDataObjectPoolConfig().setInitSize(2);
		objectPoolConfig.setPoolManager("org.quickserver.net.server.impl.BasicPoolManager");
		String expected = "<object-pool>\n" +
				"\t<max-active>10</max-active>\n" +
				"\t<max-idle>5</max-idle>\n" +
				"\t<init-size>2</init-size>\n" +
				"\t<thread-pool>\n" +
				"\t\t<max-active>10</max-active>\n" +
				"\t\t<max-idle>5</max-idle>\n" +
				"\t\t<init-size>2</init-size>\n" +
				"\t</thread-pool>\n" +
				"\t<client-handler-pool>\n" +
				"\t\t<max-active>10</max-active>\n" +
				"\t\t<max-idle>5</max-idle>\n" +
				"\t\t<init-size>2</init-size>\n" +
				"\t</client-handler-pool>\n" +
				"\t<byte-buffer-pool>\n" +
				"\t\t<max-active>10</max-active>\n" +
				"\t\t<max-idle>5</max-idle>\n" +
				"\t\t<init-size>2</init-size>\n" +
				"\t</byte-buffer-pool>\n" +
				"\t<client-data-pool>\n" +
				"\t\t<max-active>10</max-active>\n" +
				"\t\t<max-idle>5</max-idle>\n" +
				"\t\t<init-size>2</init-size>\n" +
				"\t</client-data-pool>\n" +
				"\t<pool-manager>org.quickserver.net.server.impl.BasicPoolManager</pool-manager>\n" +
				"</object-pool>\n";
		assertEquals(expected, objectPoolConfig.toXML(null));
	}
	
	@Test
	void testToXML2() {
		ObjectPoolConfig objectPoolConfig = new ObjectPoolConfig();
		objectPoolConfig.setMaxActive(10);
		objectPoolConfig.setMaxIdle(5);
		objectPoolConfig.setInitSize(2);
		objectPoolConfig.getThreadObjectPoolConfig().setMaxActive(10);
		objectPoolConfig.getThreadObjectPoolConfig().setMaxIdle(5);
		objectPoolConfig.getThreadObjectPoolConfig().setInitSize(2);
		objectPoolConfig.getClientHandlerObjectPoolConfig().setMaxActive(10);
		objectPoolConfig.getClientHandlerObjectPoolConfig().setMaxIdle(5);
		objectPoolConfig.getClientHandlerObjectPoolConfig().setInitSize(2);
		objectPoolConfig.getByteBufferObjectPoolConfig().setMaxActive(10);
		objectPoolConfig.getByteBufferObjectPoolConfig().setMaxIdle(5);
		objectPoolConfig.getByteBufferObjectPoolConfig().setInitSize(2);
		objectPoolConfig.getClientDataObjectPoolConfig().setMaxActive(10);
		objectPoolConfig.getClientDataObjectPoolConfig().setMaxIdle(5);
		objectPoolConfig.getClientDataObjectPoolConfig().setInitSize(2);
		objectPoolConfig.setPoolManager("org.quickserver.net.server.impl.BasicPoolManager");
		String expected = "    <object-pool>\n" +
				"        <max-active>10</max-active>\n" +
				"        <max-idle>5</max-idle>\n" +
				"        <init-size>2</init-size>\n" +
				"        <thread-pool>\n" +
				"            <max-active>10</max-active>\n" +
				"            <max-idle>5</max-idle>\n" +
				"            <init-size>2</init-size>\n" +
				"        </thread-pool>\n" +
				"        <client-handler-pool>\n" +
				"            <max-active>10</max-active>\n" +
				"            <max-idle>5</max-idle>\n" +
				"            <init-size>2</init-size>\n" +
				"        </client-handler-pool>\n" +
				"        <byte-buffer-pool>\n" +
				"            <max-active>10</max-active>\n" +
				"            <max-idle>5</max-idle>\n" +
				"            <init-size>2</init-size>\n" +
				"        </byte-buffer-pool>\n" +
				"        <client-data-pool>\n" +
				"            <max-active>10</max-active>\n" +
				"            <max-idle>5</max-idle>\n" +
				"            <init-size>2</init-size>\n" +
				"        </client-data-pool>\n" +
				"        <pool-manager>org.quickserver.net.server.impl.BasicPoolManager</pool-manager>\n" +
				"    </object-pool>\n";
		assertEquals(expected, objectPoolConfig.toXML("    "));
	}
	
	@Test
	void testToXML3() {
		ObjectPoolConfig objectPoolConfig = new ObjectPoolConfig();
		objectPoolConfig.setMaxActive(10);
		objectPoolConfig.setMaxIdle(5);
		objectPoolConfig.setInitSize(2);
		objectPoolConfig.getThreadObjectPoolConfig().setMaxActive(10);
		objectPoolConfig.getThreadObjectPoolConfig().setMaxIdle(5);
		objectPoolConfig.getThreadObjectPoolConfig().setInitSize(2);
		objectPoolConfig.getClientHandler