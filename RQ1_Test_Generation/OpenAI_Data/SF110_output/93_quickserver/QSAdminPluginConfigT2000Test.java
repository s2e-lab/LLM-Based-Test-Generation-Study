// QSAdminPluginConfigTest.java
package org.quickserver.util.xmlreader;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link QSAdminPluginConfig}.
* It contains ten unit test cases for the {@link QSAdminPluginConfig#toXML(String)} method.
*/
class QSAdminPluginConfigTest {

	@Test
	void testToXML() {
		QSAdminPluginConfig qsAdminPluginConfig = new QSAdminPluginConfig();
		qsAdminPluginConfig.setName("TestPlugin");
		qsAdminPluginConfig.setDesc("Test Plugin");
		qsAdminPluginConfig.setType("org.quickserver.net.qsadmin.PluginInterface");
		qsAdminPluginConfig.setMainClass("org.quickserver.net.qsadmin.TestPlugin");
		qsAdminPluginConfig.setActive("true");
		String xml = qsAdminPluginConfig.toXML("");
		assertEquals("<qsadmin-plugin>\n" + 
				"\t<name>TestPlugin</name>\n" + 
				"\t<desc>Test Plugin</desc>\n" + 
				"\t<type>org.quickserver.net.qsadmin.PluginInterface</type>\n" + 
				"\t<main-class>org.quickserver.net.qsadmin.TestPlugin</main-class>\n" + 
				"\t<active>true</active>\n" + 
				"</qsadmin-plugin>\n", xml);
	}
	
	@Test
	void testToXMLWithPad() {
		QSAdminPluginConfig qsAdminPluginConfig = new QSAdminPluginConfig();
		qsAdminPluginConfig.setName("TestPlugin");
		qsAdminPluginConfig.setDesc("Test Plugin");
		qsAdminPluginConfig.setType("org.quickserver.net.qsadmin.PluginInterface");
		qsAdminPluginConfig.setMainClass("org.quickserver.net.qsadmin.TestPlugin");
		qsAdminPluginConfig.setActive("true");
		String xml = qsAdminPluginConfig.toXML("\t");
		assertEquals("\t<qsadmin-plugin>\n" + 
				"\t\t<name>TestPlugin</name>\n" + 
				"\t\t<desc>Test Plugin</desc>\n" + 
				"\t\t<type>org.quickserver.net.qsadmin.PluginInterface</type>\n" + 
				"\t\t<main-class>org.quickserver.net.qsadmin.TestPlugin</main-class>\n" + 
				"\t\t<active>true</active>\n" + 
				"\t</qsadmin-plugin>\n", xml);
	}
	
	@Test
	void testToXMLWithNullPad() {
		QSAdminPluginConfig qsAdminPluginConfig = new QSAdminPluginConfig();
		qsAdminPluginConfig.setName("TestPlugin");
		qsAdminPluginConfig.setDesc("Test Plugin");
		qsAdminPluginConfig.setType("org.quickserver.net.qsadmin.PluginInterface");
		qsAdminPluginConfig.setMainClass("org.quickserver.net.qsadmin.TestPlugin");
		qsAdminPluginConfig.setActive("true");
		String xml = qsAdminPluginConfig.toXML(null);
		assertEquals("<qsadmin-plugin>\n" + 
				"\t<name>TestPlugin</name>\n" + 
				"\t<desc>Test Plugin</desc>\n" + 
				"\t<type>org.quickserver.net.qsadmin.PluginInterface</type>\n" + 
				"\t<main-class>org.quickserver.net.qsadmin.TestPlugin</main-class>\n" + 
				"\t<active>true</active>\n" + 
				"</qsadmin-plugin>\n", xml);
	}
	
	@Test
	void testToXMLWithEmptyPad() {
		QSAdminPluginConfig qsAdminPluginConfig = new QSAdminPluginConfig();
		qsAdminPluginConfig.setName("TestPlugin");
		qsAdminPluginConfig.setDesc("Test Plugin");
		qsAdminPluginConfig.setType("org.quickserver.net.qsadmin.PluginInterface");
		qsAdminPluginConfig.setMainClass("org.quickserver.net.qsadmin.TestPlugin");
		qsAdminPluginConfig.setActive("true");
		String xml = qsAdminPluginConfig.toXML("");
		assertEquals("<qsadmin-plugin>\n" + 
				"\t<name>TestPlugin</name>\n" + 
				"\t<desc>Test Plugin</desc>\n" + 
				"\t<type>org.quickserver.net.qsadmin.PluginInterface</type>\n" + 
				"\t<main-class>org.quickserver.net.qsadmin.TestPlugin</main-class>\n" + 
				"\t<active>true</active>\n" + 
				"</qsadmin-plugin>\n", xml);
	}
	
	@Test
	void testToXMLWithNullName() {
		QSAdminPluginConfig qsAdminPluginConfig = new QSAdminPluginConfig();
		qsAdminPluginConfig.setName(null);
		qsAdminPluginConfig.setDesc("Test Plugin");
		qsAdminPluginConfig.setType("org.quickserver.net.qsadmin.PluginInterface");
		qsAdminPluginConfig.setMainClass("org.quickserver.net.qsadmin.TestPlugin");
		qsAdminPluginConfig.setActive("true");
		String xml = qsAdminPluginConfig.toXML("");
		assertEquals("<qsadmin-plugin>\n" + 
				"\t<name></name>\n" + 
				"\t<desc>Test Plugin</desc>\n" + 
				"\t<type>org.quickserver.net.qsadmin.PluginInterface</type>\n" + 
				"\t<main-class>org.quickserver.net.qsadmin.TestPlugin</main-class>\n" + 
				"\t<active>true</active>\n" + 
				"</qsadmin-plugin>\n", xml);
	}
	
	@Test
	void testToXMLWithEmptyName() {
		QSAdminPluginConfig qsAdminPluginConfig = new QSAdminPluginConfig();
		qsAdminPluginConfig.setName("");
		qsAdminPluginConfig.setDesc("Test Plugin");
		qsAdminPluginConfig.setType("org.quickserver.net.qsadmin.PluginInterface");
		qsAdminPluginConfig.setMainClass("org.quickserver.net.qsadmin.TestPlugin");
		qsAdminPluginConfig.setActive("true");
		String xml = qsAdminPluginConfig.toXML("");
		assertEquals("<qsadmin-plugin>\n" + 
				"\t<name></name>\n" + 
				"\t<desc>Test Plugin</desc>\n" + 
				"\t<type>org.quickserver.net.qsadmin.PluginInterface</type>\n" + 
				"\t<main-class>org.quickserver.net.qsadmin.TestPlugin</main-class>\n" + 
				"\t<active>true</active>\n" + 
				"</qsadmin-plugin>\n", xml);
	}
	
	@Test
	void testToXMLWithNullDesc() {
		QSAdminPluginConfig qsAdminPluginConfig = new QSAdminPluginConfig();
		qsAdminPluginConfig.setName("TestPlugin");
		qsAdminPluginConfig.setDesc(null);
		qsAdminPluginConfig.setType("org.quickserver.net.qsadmin.PluginInterface");
		qsAdminPluginConfig.setMainClass