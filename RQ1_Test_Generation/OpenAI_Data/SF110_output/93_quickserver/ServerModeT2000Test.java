// ServerModeTest.java
package org.quickserver.util.xmlreader;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ServerMode}.
* It contains ten unit test cases for the {@link ServerMode#toXML(String)} method.
*/
class ServerModeTest {

	@Test
	void testToXML() {
		ServerMode serverMode = new ServerMode();
		serverMode.setBlocking(true);
		String xml = serverMode.toXML(null);
		assertEquals("<server-mode>\n\t<blocking>true</blocking>\n</server-mode>\n", xml);
	}
	
	@Test
	void testToXML2() {
		ServerMode serverMode = new ServerMode();
		serverMode.setBlocking(false);
		String xml = serverMode.toXML(null);
		assertEquals("<server-mode>\n\t<blocking>false</blocking>\n</server-mode>\n", xml);
	}
	
	@Test
	void testToXML3() {
		ServerMode serverMode = new ServerMode();
		serverMode.setBlocking(true);
		String xml = serverMode.toXML("\t");
		assertEquals("\t<server-mode>\n\t\t<blocking>true</blocking>\n\t</server-mode>\n", xml);
	}
	
	@Test
	void testToXML4() {
		ServerMode serverMode = new ServerMode();
		serverMode.setBlocking(false);
		String xml = serverMode.toXML("\t");
		assertEquals("\t<server-mode>\n\t\t<blocking>false</blocking>\n\t</server-mode>\n", xml);
	}
	
	@Test
	void testToXML5() {
		ServerMode serverMode = new ServerMode();
		serverMode.setBlocking(true);
		String xml = serverMode.toXML("");
		assertEquals("<server-mode>\n\t<blocking>true</blocking>\n</server-mode>\n", xml);
	}
	
	@Test
	void testToXML6() {
		ServerMode serverMode = new ServerMode();
		serverMode.setBlocking(false);
		String xml = serverMode.toXML("");
		assertEquals("<server-mode>\n\t<blocking>false</blocking>\n</server-mode>\n", xml);
	}
	
	@Test
	void testToXML7() {
		ServerMode serverMode = new ServerMode();
		serverMode.setBlocking(true);
		String xml = serverMode.toXML("\t\t");
		assertEquals("\t\t<server-mode>\n\t\t\t<blocking>true</blocking>\n\t\t</server-mode>\n", xml);
	}
	
	@Test
	void testToXML8() {
		ServerMode serverMode = new ServerMode();
		serverMode.setBlocking(false);
		String xml = serverMode.toXML("\t\t");
		assertEquals("\t\t<server-mode>\n\t\t\t<blocking>false</blocking>\n\t\t</server-mode>\n", xml);
	}
	
	@Test
	void testToXML9() {
		ServerMode serverMode = new ServerMode();
		serverMode.setBlocking(true);
		String xml = serverMode.toXML("\t\t\t");
		assertEquals("\t\t\t<server-mode>\n\t\t\t\t<blocking>true</blocking>\n\t\t\t</server-mode>\n", xml);
	}
	
	@Test
	void testToXML10() {
		ServerMode serverMode = new ServerMode();
		serverMode.setBlocking(false);
		String xml = serverMode.toXML("\t\t\t");
		assertEquals("\t\t\t<server-mode>\n\t\t\t\t<blocking>false</blocking>\n\t\t\t</server-mode>\n", xml);
	}
	
}

// ServerModeTest.java
package org.quickserver.util.xmlreader;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ServerMode}.
* It contains ten unit test cases for the {@link ServerMode#toXML(String)} method.
*/
class ServerModeTest {
		
	@Test
	void testToXML() {
		ServerMode serverMode = new ServerMode();
		serverMode.setBlocking(true);
		String xml = serverMode.toXML(null);
		assertEquals("<server-mode>\n\t<blocking>true</blocking>\n</server-mode>\n", xml);
	}
	
	@Test
	void testToXML2() {
		ServerMode serverMode = new ServerMode();
		serverMode.setBlocking(false);
		String xml = serverMode.toXML(null);
		assertEquals("<server-mode>\n\t<blocking>false</blocking>\n</server-mode>\n", xml);
	}
	
	@Test
	void testToXML3() {
		ServerMode serverMode = new ServerMode();
		serverMode.setBlocking(true);
		String xml = serverMode.toXML("\t");
		assertEquals("\t<server-mode>\n\t\t<blocking>true</blocking>\n\t</server-mode>\n", xml);
	}
	
	@Test
	void testToXML4() {
		ServerMode serverMode = new ServerMode();
		serverMode.setBlocking(false);
		String xml = serverMode.toXML("\t");
		assertEquals("\t<server-mode>\n\t\t<blocking>false</blocking>\n\t</server-mode>\n", xml);
	}
	
	@Test
	void testToXML5() {
		ServerMode serverMode = new ServerMode();
		serverMode.setBlocking(true);
		String xml = serverMode.toXML("");
		assertEquals("<server-mode>\n\t<blocking>true</blocking>\n</server-mode>\n", xml);
	}
	
	@Test
	void testToXML6() {
		ServerMode serverMode = new ServerMode();
		serverMode.setBlocking(false);
		String xml = serverMode.toXML("");
		assertEquals("<server-mode>\n\t<blocking>false</blocking>\n</server-mode>\n", xml);
	}
	
	@Test
	void testToXML7() {
		ServerMode serverMode = new ServerMode();
		serverMode.setBlocking(true);
		String xml = serverMode.toXML("\t\t");
		assertEquals("\t\t<server-mode>\n\t\t\t<blocking>true</blocking>\n\t\t</server-mode>\n", xml);
	}
	
	@Test
	void testToXML8() {
		ServerMode serverMode = new ServerMode();
		serverMode.setBlocking(false);
		String xml = serverMode.toXML("\t\t");
		assertEquals("\t\t<server-mode>\n\t\t\t<blocking>false</blocking>\n\t\t</server-mode>\n", xml);
	}
	
	@Test
	void testToXML9() {
		ServerMode serverMode = new ServerMode();
		serverMode.setBlocking(true);
		String xml = serverMode.toXML("\t\t\t");
		assertEquals("\t\t\t<server-mode>\n\t\t\t\t<blocking>true</blocking>