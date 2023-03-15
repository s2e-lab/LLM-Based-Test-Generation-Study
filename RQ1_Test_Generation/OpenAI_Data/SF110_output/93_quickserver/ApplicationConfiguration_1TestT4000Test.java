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
	public void testToXML_1() {
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration.setPromptType("gui");
		applicationConfiguration.addProperty(new Property("FTP_ROOT", "c:\\"));
		applicationConfiguration.addProperty(new Property("Server Name", "My Server"));
		String expected = "<application-configuration>\n" +
			"\t<prompt-type>gui</prompt-type>" +
			"\t<property>\n" +
			"\t\t<property-name>FTP_ROOT</property-name>\n" +
			"\t\t<property-value>c:\\</property-value>\n" +
			"\t</property>\n" +
			"\t<property>\n" +
			"\t\t<property-name>Server Name</property-name>\n" +
			"\t\t<property-value>My Server</property-value>\n" +
			"\t</property>\n" +
			"</application-configuration>\n";
		assertEquals(expected, applicationConfiguration.toXML(null));
	}
	
	@Test
	public void testToXML_2() {
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration.setPromptType("console");
		applicationConfiguration.addProperty(new Property("FTP_ROOT", "c:\\"));
		applicationConfiguration.addProperty(new Property("Server Name", "My Server"));
		String expected = "<application-configuration>\n" +
			"\t<prompt-type>console</prompt-type>" +
			"\t<property>\n" +
			"\t\t<property-name>FTP_ROOT</property-name>\n" +
			"\t\t<property-value>c:\\</property-value>\n" +
			"\t</property>\n" +
			"\t<property>\n" +
			"\t\t<property-name>Server Name</property-name>\n" +
			"\t\t<property-value>My Server</property-value>\n" +
			"\t</property>\n" +
			"</application-configuration>\n";
		assertEquals(expected, applicationConfiguration.toXML(null));
	}
	
	@Test
	public void testToXML_3() {
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration.setPromptType("gui");
		applicationConfiguration.addProperty(new Property("FTP_ROOT", "c:\\"));
		applicationConfiguration.addProperty(new Property("Server Name", "My Server"));
		String expected = "<application-configuration>\n" +
			"\t<prompt-type>gui</prompt-type>" +
			"\t<property>\n" +
			"\t\t<property-name>FTP_ROOT</property-name>\n" +
			"\t\t<property-value>c:\\</property-value>\n" +
			"\t</property>\n" +
			"\t<property>\n" +
			"\t\t<property-name>Server Name</property-name>\n" +
			"\t\t<property-value>My Server</property-value>\n" +
			"\t</property>\n" +
			"</application-configuration>\n";
		assertEquals(expected, applicationConfiguration.toXML(""));
	}
	
	@Test
	public void testToXML_4() {
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration.setPromptType("console");
		applicationConfiguration.addProperty(new Property("FTP_ROOT", "c:\\"));
		applicationConfiguration.addProperty(new Property("Server Name", "My Server"));
		String expected = "<application-configuration>\n" +
			"\t<prompt-type>console</prompt-type>" +
			"\t<property>\n" +
			"\t\t<property-name>FTP_ROOT</property-name>\n" +
			"\t\t<property-value>c:\\</property-value>\n" +
			"\t</property>\n" +
			"\t<property>\n" +
			"\t\t<property-name>Server Name</property-name>\n" +
			"\t\t<property-value>My Server</property-value>\n" +
			"\t</property>\n" +
			"</application-configuration>\n";
		assertEquals(expected, applicationConfiguration.toXML(""));
	}
	
	@Test
	public void testToXML_5() {
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration.setPromptType("gui");
		applicationConfiguration.addProperty(new Property("FTP_ROOT", "c:\\"));
		applicationConfiguration.addProperty(new Property("Server Name", "My Server"));
		String expected = "<application-configuration>\n" +
			"\t<prompt-type>gui</prompt-type>" +
			"\t<property>\n" +
			"\t\t<property-name>FTP_ROOT</property-name>\n" +
			"\t\t<property-value>c:\\</property-value>\n" +
			"\t</property>\n" +
			"\t<property>\n" +
			"\t\t<property-name>Server Name</property-name>\n" +
			"\t\t<property-value>My Server</property-value>\n" +
			"\t</property>\n" +
			"</application-configuration>\n";
		assertEquals(expected, applicationConfiguration.toXML("\t"));
	}
	
	@Test
	public void testToXML_6() {
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration.setPromptType("console");
		applicationConfiguration.addProperty(new Property("FTP_ROOT", "c:\\"));
		applicationConfiguration.addProperty(new Property("Server Name", "My Server"));
		String expected = "<application-configuration>\n" +
			"\t<prompt-type>console</prompt-type>" +
			"\t<property>\n" +
			"\t\t<property-name>FTP_ROOT</property-name>\n" +
			"\t\t<property-value>c:\\</property-value>\n" +
			"\t</property>\n" +
			"\t<property>\n" +
			"\t\t<property-name>Server Name</property-name>\n" +
			"\t\t<property-value>My Server</property-value>\n" +
			"\t</property>\n" +
			"</application-configuration>\n";
		assertEquals(expected, applicationConfiguration.toXML("\t"));
	}
	
	@Test
	public void testToXML_7() {
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration.setPromptType("gui");
		applicationConfiguration.addProperty(new Property("FTP_ROOT", "c:\\"));
		applicationConfiguration.addProperty(new Property("Server Name", "My Server"));
		String expected = "<application-configuration>\n" +
			"\t<prompt-type>gui</prompt-type>" +
			"\t<property>\n" +
			"\t\t<property-name>FTP_ROOT</property-name>\n" +
			"\t\t<property-value>c:\\</property-value>\n" +
			"\t</property>\n" +
			"\t<property>\n" +
			"\t\t<property-name>Server Name</property-name>\n" +
			"\t\t<property-value>My Server</property-value>\n" +
			"\t</property>\n" +
			"</application-configuration>\n";
		assertEquals(expected, applicationConfiguration.toXML("\t\t"));
	}
	
	@Test
	public void testToXML_8() {
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration.setPromptType("console");
		applicationConfiguration.addProperty(new Property("FTP_ROOT", "c:\\"));
		applicationConfiguration.addProperty(new Property("Server Name", "My Server"));
		String expected = "<application-configuration>\n" +
			"\t<prompt-type>console</prompt-type>" +
			"\t<property>\n" +
			"\t\t<property-name>FTP_ROOT</property-name>\n" +
			"\t\t<property-value>c:\\</property-value>\n" +
			"\t</property>\n" +
			"\t<property>\n" +
			"\t\t<property-name>Server Name</property-name>\n" +
			"\t\t<property-value>My Server</property-value>\n" +
			"\t</property>\n" +
			"</application-configuration>\n";
		assertEquals(expected, applicationConfiguration.toXML("\t\t"));
	}
	
	@Test
	public void testToXML_9() {
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration.setPromptType("gui");
		applicationConfiguration.addProperty(new Property("FTP_ROOT", "c:\\"));
		applicationConfiguration.addProperty(new Property("Server Name", "My Server"));
		String expected = "<application-configuration>\n" +
			"\t<prompt-type>gui</prompt-type>" +
			"\t<property>\n" +
			"\t\t<property-name>FTP_ROOT</property-name>\n" +
			"\t\t<property-value>c:\\</property-value>\n" +
			"\t</property>\n" +
			"\t<property>\n" +
			"\t\t<property-name>Server Name</property-name>\n" +
			"\t\t<property-value>My Server</property-value>\n" +
			"\t</property>\n" +
			"</application-configuration>\n";
		assertEquals(expected, applicationConfiguration.toXML("\t\t\t"));
	}
	
	@Test
	public void testToXML_10() {
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration.setPromptType("console");
		applicationConfiguration.addProperty(new Property("FTP_ROOT", "c:\\"));
		applicationConfiguration.addProperty(new Property("Server Name", "My Server"));
		String expected = "<application-configuration>\n" +
			"\t<prompt-type>console</prompt-type>" +
			"\t<property>\n" +
			"\t\t<property-name>FTP_ROOT</property-name>\n" +
			"\t\t<property-value>c:\\</property-value>\n" +
			"\t</property>\n" +
			"\t<property>\n" +
			"\t\t<property-name>Server Name</property-name>\n" +
			"\t\t<property-value>My Server</property-value>\n" +
			"\t</property>\n" +
			"</application-configuration>\n";
		assertEquals(expected, applicationConfiguration.toXML("\t\t\t"));
	}
	
}

// ApplicationConfiguration_2Test.java
package org.quickserver.util.xmlreader;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ApplicationConfiguration}.
* It contains ten unit test cases for the {@link ApplicationConfiguration#toXML(String)} method.
*/
class ApplicationConfiguration_2Test {
		
	@Test
	public void testToXML_1() {
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration.setPromptType("gui");
		applicationConfiguration.addProperty(new Property("FTP_ROOT", "c:\\"));
		applicationConfiguration.addProperty(new Property("Server Name", "My Server"));
		String expected = "<application-configuration>\n" +
			"\t<prompt-type>gui</prompt-type>" +
			"\t<property>\n" +
			"\t\t<property-name>FTP_ROOT</property-name>\n" +
			"\t\t<property-value>c:\\</property-value>\n" +
			"\t</property>\n" +
			"\t<property>\n" +
			"\t\t<property-name>Server Name</property-name>\n" +
			"\t\t<property-value>My Server</property-value>\n" +
			"\t</property>\n" +
			"</application-configuration>\n";
		assertEquals(expected, applicationConfiguration.toXML(null));
	}
	
	@Test
	public void testToXML_2() {
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration.setPromptType("console");
		applicationConfiguration.addProperty(new Property("FTP_ROOT", "c:\\"));
		applicationConfiguration.addProperty(new Property("Server Name", "My Server"));
		String expected = "<application-configuration>\n" +
			"\t<prompt-type>console</prompt-type>" +
			"\t<property>\n" +
			"\t\t<property-name>FTP_ROOT</property-name>\n" +
			"\t\t<property-value>c:\\</property-value>\n" +
			"\t</property>\n" +
			"\t<property>\n" +
			"\t\t<property-name>Server Name</property-name>\n" +
			"\t\t<property-value>My Server</property-value>\n" +
			"\t</property>\n" +
			"</application-configuration>\n";
		assertEquals(expected, applicationConfiguration.toXML(null));
	}
	
	@Test
	public void testToXML_3() {
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		application