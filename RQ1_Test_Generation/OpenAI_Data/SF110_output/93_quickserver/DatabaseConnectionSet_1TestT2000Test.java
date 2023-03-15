// DatabaseConnectionSet_1Test.java
package org.quickserver.util.xmlreader;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DatabaseConnectionSet}.
* It contains ten unit test cases for the {@link DatabaseConnectionSet#toXML(String)} method.
*/
class DatabaseConnectionSet_1Test {

	@Test
	public void testToXML_1() {
		DatabaseConnectionSet dcs = new DatabaseConnectionSet();
		DatabaseConnectionConfig dcc = new DatabaseConnectionConfig();
		dcc.setId("test");
		dcc.setDriver("org.hsqldb.jdbcDriver");
		dcc.setUrl("jdbc:hsqldb:hsql://localhost/test");
		dcc.setUser("sa");
		dcc.setPassword("");
		dcs.addDatabaseConnection(dcc);
		String xml = dcs.toXML(null);
		assertEquals("<database-connection-set>\n\t<database-connection id=\"test\" driver=\"org.hsqldb.jdbcDriver\" url=\"jdbc:hsqldb:hsql://localhost/test\" user=\"sa\" password=\"\" />\n</database-connection-set>\n", xml);
	}
	
	@Test
	public void testToXML_2() {
		DatabaseConnectionSet dcs = new DatabaseConnectionSet();
		DatabaseConnectionConfig dcc = new DatabaseConnectionConfig();
		dcc.setId("test");
		dcc.setDriver("org.hsqldb.jdbcDriver");
		dcc.setUrl("jdbc:hsqldb:hsql://localhost/test");
		dcc.setUser("sa");
		dcc.setPassword("");
		dcs.addDatabaseConnection(dcc);
		String xml = dcs.toXML("\t");
		assertEquals("\t<database-connection-set>\n\t\t<database-connection id=\"test\" driver=\"org.hsqldb.jdbcDriver\" url=\"jdbc:hsqldb:hsql://localhost/test\" user=\"sa\" password=\"\" />\n\t</database-connection-set>\n", xml);
	}
	
	@Test
	public void testToXML_3() {
		DatabaseConnectionSet dcs = new DatabaseConnectionSet();
		DatabaseConnectionConfig dcc = new DatabaseConnectionConfig();
		dcc.setId("test");
		dcc.setDriver("org.hsqldb.jdbcDriver");
		dcc.setUrl("jdbc:hsqldb:hsql://localhost/test");
		dcc.setUser("sa");
		dcc.setPassword("");
		dcs.addDatabaseConnection(dcc);
		String xml = dcs.toXML("");
		assertEquals("<database-connection-set>\n\t<database-connection id=\"test\" driver=\"org.hsqldb.jdbcDriver\" url=\"jdbc:hsqldb:hsql://localhost/test\" user=\"sa\" password=\"\" />\n</database-connection-set>\n", xml);
	}
	
	@Test
	public void testToXML_4() {
		DatabaseConnectionSet dcs = new DatabaseConnectionSet();
		DatabaseConnectionConfig dcc = new DatabaseConnectionConfig();
		dcc.setId("test");
		dcc.setDriver("org.hsqldb.jdbcDriver");
		dcc.setUrl("jdbc:hsqldb:hsql://localhost/test");
		dcc.setUser("sa");
		dcc.setPassword("");
		dcs.addDatabaseConnection(dcc);
		String xml = dcs.toXML("\t\t");
		assertEquals("\t\t<database-connection-set>\n\t\t\t<database-connection id=\"test\" driver=\"org.hsqldb.jdbcDriver\" url=\"jdbc:hsqldb:hsql://localhost/test\" user=\"sa\" password=\"\" />\n\t\t</database-connection-set>\n", xml);
	}
	
	@Test
	public void testToXML_5() {
		DatabaseConnectionSet dcs = new DatabaseConnectionSet();
		DatabaseConnectionConfig dcc = new DatabaseConnectionConfig();
		dcc.setId("test");
		dcc.setDriver("org.hsqldb.jdbcDriver");
		dcc.setUrl("jdbc:hsqldb:hsql://localhost/test");
		dcc.setUser("sa");
		dcc.setPassword("");
		dcs.addDatabaseConnection(dcc);
		String xml = dcs.toXML("\t\t\t");
		assertEquals("\t\t\t<database-connection-set>\n\t\t\t\t<database-connection id=\"test\" driver=\"org.hsqldb.jdbcDriver\" url=\"jdbc:hsqldb:hsql://localhost/test\" user=\"sa\" password=\"\" />\n\t\t\t</database-connection-set>\n", xml);
	}
	
	@Test
	public void testToXML_6() {
		DatabaseConnectionSet dcs = new DatabaseConnectionSet();
		DatabaseConnectionConfig dcc = new DatabaseConnectionConfig();
		dcc.setId("test");
		dcc.setDriver("org.hsqldb.jdbcDriver");
		dcc.setUrl("jdbc:hsqldb:hsql://localhost/test");
		dcc.setUser("sa");
		dcc.setPassword("");
		dcs.addDatabaseConnection(dcc);
		String xml = dcs.toXML("\t\t\t\t");
		assertEquals("\t\t\t\t<database-connection-set>\n\t\t\t\t\t<database-connection id=\"test\" driver=\"org.hsqldb.jdbcDriver\" url=\"jdbc:hsqldb:hsql://localhost/test\" user=\"sa\" password=\"\" />\n\t\t\t\t</database-connection-set>\n", xml);
	}
	
	@Test
	public void testToXML_7() {
		DatabaseConnectionSet dcs = new DatabaseConnectionSet();
		DatabaseConnectionConfig dcc = new DatabaseConnectionConfig();
		dcc.setId("test");
		dcc.setDriver("org.hsqldb.jdbcDriver");
		dcc.setUrl("jdbc:hsqldb:hsql://localhost/test");
		dcc.setUser("sa");
		dcc.setPassword("");
		dcs.addDatabaseConnection(dcc);
		String xml = dcs.toXML("\t\t\t\t\t");
		assertEquals("\t\t\t\t\t<database-connection-set>\n\t\t\t\t\t\t<database-connection id=\"test\" driver=\"org.hsqldb.jdbcDriver\" url=\"jdbc:hsqldb:hsql://localhost/test\" user=\"sa\" password=\"\" />\n\t\t\t\t\t</database-connection-set>\n", xml);
	}
	
	@Test
	public void testToXML_8() {
		DatabaseConnectionSet dcs = new DatabaseConnectionSet();
		DatabaseConnectionConfig dcc = new DatabaseConnectionConfig();
		dcc.setId("test");
		dcc.setDriver("org.hsqldb.jdbcDriver");
		dcc.setUrl("jdbc:hsqldb:hsql://localhost/test");
		dcc.setUser("sa");
		dcc.setPassword("");
		dcs.addDatabaseConnection(dcc);
		String xml = dcs.toXML("\t\t\t\t\t\t");
		assertEquals("\t\t\t\t\t\t<database-connection-set>\n\t\t\t\t\t\t\t<database-connection id=\"test\" driver=\"org.hsqldb.jdbcDriver\" url=\"jdbc:hsqldb:hsql://localhost/