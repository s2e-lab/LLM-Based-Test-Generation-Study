// DatabaseConnectionConfigTest.java
package org.quickserver.util.xmlreader;

import org.quickserver.net.server.QuickServer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DatabaseConnectionConfig}.
* It contains ten unit test cases for the {@link DatabaseConnectionConfig#toXML(String)} method.
*/
class DatabaseConnectionConfigTest {

	@Test
	void testToXML() {
		DatabaseConnectionConfig databaseConnectionConfig = new DatabaseConnectionConfig();
		databaseConnectionConfig.setId("id");
		databaseConnectionConfig.setDriver("driver");
		databaseConnectionConfig.setUrl("url");
		databaseConnectionConfig.setUsername("username");
		databaseConnectionConfig.setPassword("password");
		String xml = databaseConnectionConfig.toXML("");
		assertEquals("<database-connection>\n" + 
			"\t<id>id</id>\n" + 
			"\t<driver>driver</driver>\n" + 
			"\t<url>url</url>\n" + 
			"\t<username>username</username>\n" + 
			"\t<password>password</password>\n" + 
			"</database-connection>\n", xml);
	}
	
	@Test
	void testToXML_null() {
		DatabaseConnectionConfig databaseConnectionConfig = new DatabaseConnectionConfig();
		databaseConnectionConfig.setId(null);
		databaseConnectionConfig.setDriver(null);
		databaseConnectionConfig.setUrl(null);
		databaseConnectionConfig.setUsername(null);
		databaseConnectionConfig.setPassword(null);
		String xml = databaseConnectionConfig.toXML("");
		assertEquals("<database-connection>\n" + 
			"\t<id></id>\n" + 
			"\t<driver></driver>\n" + 
			"\t<url></url>\n" + 
			"\t<username></username>\n" + 
			"\t<password></password>\n" + 
			"</database-connection>\n", xml);
	}
	
	@Test
	void testToXML_empty() {
		DatabaseConnectionConfig databaseConnectionConfig = new DatabaseConnectionConfig();
		databaseConnectionConfig.setId("");
		databaseConnectionConfig.setDriver("");
		databaseConnectionConfig.setUrl("");
		databaseConnectionConfig.setUsername("");
		databaseConnectionConfig.setPassword("");
		String xml = databaseConnectionConfig.toXML("");
		assertEquals("<database-connection>\n" + 
			"\t<id></id>\n" + 
			"\t<driver></driver>\n" + 
			"\t<url></url>\n" + 
			"\t<username></username>\n" + 
			"\t<password></password>\n" + 
			"</database-connection>\n", xml);
	}
	
	@Test
	void testToXML_pad() {
		DatabaseConnectionConfig databaseConnectionConfig = new DatabaseConnectionConfig();
		databaseConnectionConfig.setId("id");
		databaseConnectionConfig.setDriver("driver");
		databaseConnectionConfig.setUrl("url");
		databaseConnectionConfig.setUsername("username");
		databaseConnectionConfig.setPassword("password");
		String xml = databaseConnectionConfig.toXML("\t");
		assertEquals("<database-connection>\n" + 
			"\t\t<id>id</id>\n" + 
			"\t\t<driver>driver</driver>\n" + 
			"\t\t<url>url</url>\n" + 
			"\t\t<username>username</username>\n" + 
			"\t\t<password>password</password>\n" + 
			"\t</database-connection>\n", xml);
	}
	
	@Test
	void testToXML_pad_null() {
		DatabaseConnectionConfig databaseConnectionConfig = new DatabaseConnectionConfig();
		databaseConnectionConfig.setId(null);
		databaseConnectionConfig.setDriver(null);
		databaseConnectionConfig.setUrl(null);
		databaseConnectionConfig.setUsername(null);
		databaseConnectionConfig.setPassword(null);
		String xml = databaseConnectionConfig.toXML("\t");
		assertEquals("<database-connection>\n" + 
			"\t\t<id></id>\n" + 
			"\t\t<driver></driver>\n" + 
			"\t\t<url></url>\n" + 
			"\t\t<username></username>\n" + 
			"\t\t<password></password>\n" + 
			"\t</database-connection>\n", xml);
	}
	
	@Test
	void testToXML_pad_empty() {
		DatabaseConnectionConfig databaseConnectionConfig = new DatabaseConnectionConfig();
		databaseConnectionConfig.setId("");
		databaseConnectionConfig.setDriver("");
		databaseConnectionConfig.setUrl("");
		databaseConnectionConfig.setUsername("");
		databaseConnectionConfig.setPassword("");
		String xml = databaseConnectionConfig.toXML("\t");
		assertEquals("<database-connection>\n" + 
			"\t\t<id></id>\n" + 
			"\t\t<driver></driver>\n" + 
			"\t\t<url></url>\n" + 
			"\t\t<username></username>\n" + 
			"\t\t<password></password>\n" + 
			"\t</database-connection>\n", xml);
	}
	
	@Test
	void testToXML_pad_null_pad() {
		DatabaseConnectionConfig databaseConnectionConfig = new DatabaseConnectionConfig();
		databaseConnectionConfig.setId("id");
		databaseConnectionConfig.setDriver("driver");
		databaseConnectionConfig.setUrl("url");
		databaseConnectionConfig.setUsername("username");
		databaseConnectionConfig.setPassword("password");
		String xml = databaseConnectionConfig.toXML(null);
		assertEquals("<database-connection>\n" + 
			"\t<id>id</id>\n" + 
			"\t<driver>driver</driver>\n" + 
			"\t<url>url</url>\n" + 
			"\t<username>username</username>\n" + 
			"\t<password>password</password>\n" + 
			"</database-connection>\n", xml);
	}
	
	@Test
	void testToXML_pad_empty_pad() {
		DatabaseConnectionConfig databaseConnectionConfig = new DatabaseConnectionConfig();
		databaseConnectionConfig.setId("id");
		databaseConnectionConfig.setDriver("driver");
		databaseConnectionConfig.setUrl("url");
		databaseConnectionConfig.setUsername("username");
		databaseConnectionConfig.setPassword("password");
		String xml = databaseConnectionConfig.toXML("");
		assertEquals("<database-connection>\n" + 
			"\t<id>id</id>\n" + 
			"\t<driver>driver</driver>\n" + 
			"\t<url>url</url>\n" + 
			"\t<username>username</username>\n" + 
			"\t<password>password</password>\n" + 
			"</database-connection>\n", xml);
	}
	
	@Test
	void testToXML_pad_null_pad_null() {
		DatabaseConnectionConfig databaseConnectionConfig = new DatabaseConnectionConfig();
		databaseConnectionConfig.setId(null);
		databaseConnectionConfig.setDriver(null);
		databaseConnectionConfig.setUrl(null);
		databaseConnectionConfig.setUsername(null);
		databaseConnectionConfig.setPassword(null);
		String xml = databaseConnectionConfig.toXML(null);
		assertEquals("<database-connection>\n" + 
			"\t<id></id>\n" + 
			"\t<driver></driver>\n" + 
			"\t<url></url>\n" + 
			"\t<username></username>\n" + 
			"\t<password></password>\n" + 
			"</database-connection>\n", xml);
	}
	
	@Test
	void testToXML_pad_empty_pad_empty() {
		DatabaseConnectionConfig databaseConnectionConfig = new DatabaseConnectionConfig();
		databaseConnectionConfig.setId("");
		databaseConnectionConfig.setDriver("");
		databaseConnectionConfig.setUrl("");
		databaseConnectionConfig.setUsername("");
		databaseConnectionConfig.setPassword("");
		String xml = databaseConnectionConfig.toXML("");
		assertEquals("<database-connection>\n" + 
			"\t<id></id>\n" + 
			"\t<driver></driver>\n" + 
			"\t<url></url>\n" + 
			"\t<username></username>\n" + 
			"\t<password></password>\n" + 
			"</database-connection>\n", xml);
	}
	
}

// DatabaseConnectionConfigTest.java
package org.quickserver.util.xmlreader;

import org.quickserver.net.server.QuickServer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DatabaseConnectionConfig}.
* It contains ten unit test cases for the {@link DatabaseConnectionConfig#toXML(String)} method.
*/
class DatabaseConnectionConfigTest {
		
	@Test
	void testToXML() {
		DatabaseConnectionConfig databaseConnectionConfig = new DatabaseConnectionConfig();
		databaseConnectionConfig.setId("id");
		databaseConnectionConfig.setDriver("driver");
		databaseConnectionConfig.setUrl("url");
		databaseConnectionConfig.setUsername("username");
		databaseConnectionConfig.setPassword("password");
		String xml = databaseConnectionConfig.toXML("");
		assertEquals("<database-connection>\n" + 
			"\t<id>id</id>\n" + 
			"\t<driver>driver</driver>\n" + 
			"\t<url>url</url>\n" + 
			"\t<username>username</username>\n" + 
			"\t<password>password</password>\n" + 
			"</database-connection>\n", xml);
	}
	
	@Test
	void testToXML_null() {
		DatabaseConnectionConfig databaseConnectionConfig = new DatabaseConnectionConfig();
		databaseConnectionConfig.setId(null);
		databaseConnectionConfig.setDriver(null);
		databaseConnectionConfig.setUrl(null);
		databaseConnectionConfig.setUsername(null);
		databaseConnectionConfig.setPassword(null);
		String xml = databaseConnectionConfig.toXML("");
		assertEquals("<database-connection>\n" + 
			"\t<id></id>\n" + 
			"\t<driver></driver>\n" + 
			"\t<url></url>\n" + 
			"\t<username></username>\n" + 
			"\t<password></password>\n" + 
			"</database-connection>\n", xml);
	}
	
	@Test
	void testToXML_empty() {
		DatabaseConnectionConfig databaseConnectionConfig = new DatabaseConnectionConfig();
		databaseConnectionConfig.setId("");
		databaseConnectionConfig.setDriver("");
		databaseConnectionConfig.setUrl("");
		databaseConnectionConfig.setUsername("");
		databaseConnectionConfig.setPassword("");
		String xml = databaseConnectionConfig.toXML("");
		assertEquals("<database-connection>\n" + 
			"\t<id></id>\n" + 
			"\t<driver></driver>\n" + 
			"\t<url></url>\n" + 
			"\t<username></username>\n" + 
			"\t<password></password>\n" + 
			"</database-connection>\n", xml);
	}
	
	@Test
	void testToXML_pad() {
		DatabaseConnectionConfig databaseConnectionConfig = new DatabaseConnectionConfig();
		databaseConnectionConfig.setId("id");
		databaseConnectionConfig.setDriver("driver");
		databaseConnectionConfig.setUrl("url");
		databaseConnectionConfig.setUsername("username");
		databaseConnectionConfig.setPassword("password");
		String xml = databaseConnectionConfig.toXML("\t");
		assertEquals("<database-connection>\n" + 
			"\t\t<id>id</id>\n" + 
			"\t\t<driver>driver</driver>\n" + 
			"\t\t<url>url</url>\n" + 
			"\t\t<username>username</username>\n" + 
			"\t\t<password>password</password>\n" + 
			"\t</database-connection>\n", xml);
	}
	
	@Test
	void testToXML_pad_null() {
		DatabaseConnectionConfig databaseConnectionConfig = new DatabaseConnectionConfig();
		databaseConnectionConfig.setId(null);
		databaseConnectionConfig.setDriver(null);
		databaseConnectionConfig.setUrl(null);
		databaseConnectionConfig.setUsername(null);
		databaseConnectionConfig.setPassword(null);
		String xml = databaseConnectionConfig.toXML("\t");
		assertEquals("<database-connection>\n" + 
			"\t\t<id></id>\n" + 
			"\t\t<driver></driver>\n" + 
			"\t\t<url></url>\n" + 
			"\t\t<username></username>\n" + 
			"\t\t<password></password>\n" + 
			"\t</database-connection>\n", xml);
	}
	
	@Test
	void testToXML_pad_empty() {
		DatabaseConnectionConfig databaseConnectionConfig = new DatabaseConnectionConfig();
		databaseConnectionConfig.setId("");
		databaseConnectionConfig.setDriver("");
		databaseConnectionConfig.setUrl("");
		databaseConnectionConfig.setUsername("");
		databaseConnectionConfig.setPassword("");
		String xml = databaseConnectionConfig.toXML("\t");
		assertEquals("<database-connection>\n" + 
			"\t\t<id></id>\n" + 
			"\t\t<driver></driver>\n" + 
			"\t\t<url></url>\n" + 
			"\t\t<username></username>\n" + 
			"\t\t<password></password>\n" + 
			"\t</database-connection>\n", xml);
	}
	
	@Test
	void testToXML_pad_null_pad() {
		DatabaseConnectionConfig databaseConnectionConfig = new DatabaseConnectionConfig();
		databaseConnectionConfig.setId("id");
		databaseConnectionConfig.setDriver("driver");
		databaseConnectionConfig.setUrl("url");
		databaseConnectionConfig.setUsername("username");