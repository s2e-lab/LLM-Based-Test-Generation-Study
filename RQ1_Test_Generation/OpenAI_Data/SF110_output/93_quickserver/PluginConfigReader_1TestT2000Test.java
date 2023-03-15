// PluginConfigReader_1Test.java
package org.quickserver.util.xmlreader;

import java.io.*;
import java.util.logging.*;
import org.apache.commons.digester3.Digester;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PluginConfigReader}.
* It contains ten unit test cases for the {@link PluginConfigReader#read(File)} method.
*/
class PluginConfigReader_1Test {

	@Test
	void testRead_1() throws Exception {
		File input = new File("src/test/resources/org/quickserver/util/xmlreader/PluginConfigReader_1Test_1.xml");
		QSAdminPluginConfig psc = PluginConfigReader.read(input);
		assertEquals("TestPlugin", psc.getName());
		assertEquals("Test Plugin", psc.getDesc());
		assertEquals("org.quickserver.net.qsadmin.TestPlugin", psc.getMainClass());
		assertEquals("org.quickserver.net.qsadmin.TestPlugin", psc.getType());
		assertEquals("true", psc.getActive());
	}
	
	@Test
	void testRead_2() throws Exception {
		File input = new File("src/test/resources/org/quickserver/util/xmlreader/PluginConfigReader_1Test_2.xml");
		QSAdminPluginConfig psc = PluginConfigReader.read(input);
		assertEquals("TestPlugin", psc.getName());
		assertEquals("Test Plugin", psc.getDesc());
		assertEquals("org.quickserver.net.qsadmin.TestPlugin", psc.getMainClass());
		assertEquals("org.quickserver.net.qsadmin.TestPlugin", psc.getType());
		assertEquals("true", psc.getActive());
	}
	
	@Test
	void testRead_3() throws Exception {
		File input = new File("src/test/resources/org/quickserver/util/xmlreader/PluginConfigReader_1Test_3.xml");
		QSAdminPluginConfig psc = PluginConfigReader.read(input);
		assertEquals("TestPlugin", psc.getName());
		assertEquals("Test Plugin", psc.getDesc());
		assertEquals("org.quickserver.net.qsadmin.TestPlugin", psc.getMainClass());
		assertEquals("org.quickserver.net.qsadmin.TestPlugin", psc.getType());
		assertEquals("true", psc.getActive());
	}
	
	@Test
	void testRead_4() throws Exception {
		File input = new File("src/test/resources/org/quickserver/util/xmlreader/PluginConfigReader_1Test_4.xml");
		QSAdminPluginConfig psc = PluginConfigReader.read(input);
		assertEquals("TestPlugin", psc.getName());
		assertEquals("Test Plugin", psc.getDesc());
		assertEquals("org.quickserver.net.qsadmin.TestPlugin", psc.getMainClass());
		assertEquals("org.quickserver.net.qsadmin.TestPlugin", psc.getType());
		assertEquals("true", psc.getActive());
	}
	
	@Test
	void testRead_5() throws Exception {
		File input = new File("src/test/resources/org/quickserver/util/xmlreader/PluginConfigReader_1Test_5.xml");
		QSAdminPluginConfig psc = PluginConfigReader.read(input);
		assertEquals("TestPlugin", psc.getName());
		assertEquals("Test Plugin", psc.getDesc());
		assertEquals("org.quickserver.net.qsadmin.TestPlugin", psc.getMainClass());
		assertEquals("org.quickserver.net.qsadmin.TestPlugin", psc.getType());
		assertEquals("true", psc.getActive());
	}
	
	@Test
	void testRead_6() throws Exception {
		File input = new File("src/test/resources/org/quickserver/util/xmlreader/PluginConfigReader_1Test_6.xml");
		QSAdminPluginConfig psc = PluginConfigReader.read(input);
		assertEquals("TestPlugin", psc.getName());
		assertEquals("Test Plugin", psc.getDesc());
		assertEquals("org.quickserver.net.qsadmin.TestPlugin", psc.getMainClass());
		assertEquals("org.quickserver.net.qsadmin.TestPlugin", psc.getType());
		assertEquals("true", psc.getActive());
	}
	
	@Test
	void testRead_7() throws Exception {
		File input = new File("src/test/resources/org/quickserver/util/xmlreader/PluginConfigReader_1Test_7.xml");
		QSAdminPluginConfig psc = PluginConfigReader.read(input);
		assertEquals("TestPlugin", psc.getName());
		assertEquals("Test Plugin", psc.getDesc());
		assertEquals("org.quickserver.net.qsadmin.TestPlugin", psc.getMainClass());
		assertEquals("org.quickserver.net.qsadmin.TestPlugin", psc.getType());
		assertEquals("true", psc.getActive());
	}
	
	@Test
	void testRead_8() throws Exception {
		File input = new File("src/test/resources/org/quickserver/util/xmlreader/PluginConfigReader_1Test_8.xml");
		QSAdminPluginConfig psc = PluginConfigReader.read(input);
		assertEquals("TestPlugin", psc.getName());
		assertEquals("Test Plugin", psc.getDesc());
		assertEquals("org.quickserver.net.qsadmin.TestPlugin", psc.getMainClass());
		assertEquals("org.quickserver.net.qsadmin.TestPlugin", psc.getType());
		assertEquals("true", psc.getActive());
	}
	
	@Test
	void testRead_9() throws Exception {
		File input = new File("src/test/resources/org/quickserver/util/xmlreader/PluginConfigReader_1Test_9.xml");
		QSAdminPluginConfig psc = PluginConfigReader.read(input);
		assertEquals("TestPlugin", psc.getName());
		assertEquals("Test Plugin", psc.getDesc());
		assertEquals("org.quickserver.net.qsadmin.TestPlugin", psc.getMainClass());
		assertEquals("org.quickserver.net.qsadmin.TestPlugin", psc.getType());
		assertEquals("true", psc.getActive());
	}
	
	@Test
	void testRead_10() throws Exception {
		File input = new File("src/test/resources/org/quickserver/util/xmlreader/PluginConfigReader_1Test_10.xml");
		QSAdminPluginConfig psc = PluginConfigReader.read(input);
		assertEquals("TestPlugin", psc.getName());
		assertEquals("Test Plugin", psc.getDesc());
		assertEquals("org.quickserver.net.qsadmin.TestPlugin", psc.getMainClass());
		assertEquals("org.quickserver.net.qsadmin.TestPlugin", psc.getType());
		assertEquals("true", psc.getActive());
	}
	
}

// PluginConfigReader_2Test.java
package org.quickserver.util.xmlreader;

import java.io.*;
import java.util.logging.*;
import org.apache.commons.digester3.Digester;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PluginConfigReader}.
* It contains ten unit test cases for the {@link PluginConfigReader#read(String)} method.
*/
class PluginConfigReader_2Test {
		
	@Test
	void testRead_1() throws Exception {
		String fileName = "src/test/resources/org/quickserver/util/xmlreader/PluginConfigReader_2Test_1.xml";
		QSAdminPluginConfig psc = PluginConfigReader.read(fileName);
		assertEqu