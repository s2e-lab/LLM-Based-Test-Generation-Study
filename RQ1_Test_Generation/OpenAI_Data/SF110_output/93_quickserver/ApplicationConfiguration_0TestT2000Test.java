// ApplicationConfiguration_0Test.java
package org.quickserver.util.xmlreader;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ApplicationConfiguration}.
* It contains ten unit test cases for the {@link ApplicationConfiguration#findProperty(String)} method.
*/
class ApplicationConfiguration_0Test {

	@Test
	void testFindProperty_0() {
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration.addProperty(new Property("FTP_ROOT", "c:\\"));
		applicationConfiguration.addProperty(new Property("Server Name", "My Server"));
		Property property = applicationConfiguration.findProperty("FTP_ROOT");
		assertNotNull(property);
		assertEquals("FTP_ROOT", property.getName());
		assertEquals("c:\\", property.getValue());
	}
	
	@Test
	void testFindProperty_1() {
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration.addProperty(new Property("FTP_ROOT", "c:\\"));
		applicationConfiguration.addProperty(new Property("Server Name", "My Server"));
		Property property = applicationConfiguration.findProperty("Server Name");
		assertNotNull(property);
		assertEquals("Server Name", property.getName());
		assertEquals("My Server", property.getValue());
	}
	
	@Test
	void testFindProperty_2() {
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration.addProperty(new Property("FTP_ROOT", "c:\\"));
		applicationConfiguration.addProperty(new Property("Server Name", "My Server"));
		Property property = applicationConfiguration.findProperty("FTP_ROOT");
		assertNotNull(property);
		assertEquals("FTP_ROOT", property.getName());
		assertEquals("c:\\", property.getValue());
	}
	
	@Test
	void testFindProperty_3() {
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration.addProperty(new Property("FTP_ROOT", "c:\\"));
		applicationConfiguration.addProperty(new Property("Server Name", "My Server"));
		Property property = applicationConfiguration.findProperty("Server Name");
		assertNotNull(property);
		assertEquals("Server Name", property.getName());
		assertEquals("My Server", property.getValue());
	}
	
	@Test
	void testFindProperty_4() {
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration.addProperty(new Property("FTP_ROOT", "c:\\"));
		applicationConfiguration.addProperty(new Property("Server Name", "My Server"));
		Property property = applicationConfiguration.findProperty("FTP_ROOT");
		assertNotNull(property);
		assertEquals("FTP_ROOT", property.getName());
		assertEquals("c:\\", property.getValue());
	}
	
	@Test
	void testFindProperty_5() {
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration.addProperty(new Property("FTP_ROOT", "c:\\"));
		applicationConfiguration.addProperty(new Property("Server Name", "My Server"));
		Property property = applicationConfiguration.findProperty("Server Name");
		assertNotNull(property);
		assertEquals("Server Name", property.getName());
		assertEquals("My Server", property.getValue());
	}
	
	@Test
	void testFindProperty_6() {
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration.addProperty(new Property("FTP_ROOT", "c:\\"));
		applicationConfiguration.addProperty(new Property("Server Name", "My Server"));
		Property property = applicationConfiguration.findProperty("FTP_ROOT");
		assertNotNull(property);
		assertEquals("FTP_ROOT", property.getName());
		assertEquals("c:\\", property.getValue());
	}
	
	@Test
	void testFindProperty_7() {
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration.addProperty(new Property("FTP_ROOT", "c:\\"));
		applicationConfiguration.addProperty(new Property("Server Name", "My Server"));
		Property property = applicationConfiguration.findProperty("Server Name");
		assertNotNull(property);
		assertEquals("Server Name", property.getName());
		assertEquals("My Server", property.getValue());
	}
	
	@Test
	void testFindProperty_8() {
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration.addProperty(new Property("FTP_ROOT", "c:\\"));
		applicationConfiguration.addProperty(new Property("Server Name", "My Server"));
		Property property = applicationConfiguration.findProperty("FTP_ROOT");
		assertNotNull(property);
		assertEquals("FTP_ROOT", property.getName());
		assertEquals("c:\\", property.getValue());
	}
	
	@Test
	void testFindProperty_9() {
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration.addProperty(new Property("FTP_ROOT", "c:\\"));
		applicationConfiguration.addProperty(new Property("Server Name", "My Server"));
		Property property = applicationConfiguration.findProperty("Server Name");
		assertNotNull(property);
		assertEquals("Server Name", property.getName());
		assertEquals("My Server", property.getValue());
	}
	
}

// ApplicationConfiguration_1Test.java
package org.quickserver.util.xmlreader;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ApplicationConfiguration}.
* It contains ten unit test cases for the {@link ApplicationConfiguration#toXML(String)} method.
*/
class ApplicationConfiguration_1Test {
		
	@Test
	void testToXML_0() {
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration.addProperty(new Property("FTP_ROOT", "c:\\"));
		applicationConfiguration.addProperty(new Property("Server Name", "My Server"));
		String xml = applicationConfiguration.toXML(null);
		assertNotNull(xml);
		assertEquals("<application-configuration>\n\t<prompt-type>gui</prompt-type><property>\n\t\t<property-name>FTP_ROOT</property-name>\n\t\t<property-value>c:\\</property-value>\n\t</property>\n<property>\n\t\t<property-name>Server Name</property-name>\n\t\t<property-value>My Server</property-value>\n\t</property>\n</application-configuration>\n", xml);
	}
	
	@Test
	void testToXML_1() {
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration.addProperty(new Property("FTP_ROOT", "c:\\"));
		applicationConfiguration.addProperty(new Property("Server Name", "My Server"));
		String xml = applicationConfiguration.toXML("\t");
		assertNotNull(xml);
		assertEquals("\t<application-configuration>\n\t\t<prompt-type>gui</prompt-type><property>\n\t\t\t<property-name>FTP_ROOT</property-name>\n\t\t\t<property-value>c:\\</property-value>\n\t\t</property>\n\t<property>\n\t\t\t<property-name>Server Name</property-name>\n\t\t\t<property-value>My Server</property-value>\n\t\t</property>\n\t</application-configuration>\n", xml);
	}
	
	@Test
	void testToXML_2() {
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration.addProperty(new Property("FTP_ROOT", "c:\\"));
		applicationConfiguration.add