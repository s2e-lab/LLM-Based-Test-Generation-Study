// DBObjectPoolConfigTest.java
package org.quickserver.util.xmlreader;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DBObjectPoolConfig}.
* It contains ten unit test cases for the {@link DBObjectPoolConfig#toXML(String)} method.
*/
class DBObjectPoolConfigTest {

	@Test
	void testToXML() {
		DBObjectPoolConfig dbObjectPoolConfig = new DBObjectPoolConfig();
		dbObjectPoolConfig.setDbPoolUtil("org.quickserver.sql.DBPoolUtil");
		DatabaseConnectionSet databaseConnectionSet = new DatabaseConnectionSet();
		databaseConnectionSet.setName("test");
		databaseConnectionSet.setDriver("org.hsqldb.jdbcDriver");
		databaseConnectionSet.setUrl("jdbc:hsqldb:hsql://localhost/test");
		databaseConnectionSet.setUser("sa");
		databaseConnectionSet.setPassword("");
		databaseConnectionSet.setMinPoolSize("1");
		databaseConnectionSet.setMaxPoolSize("10");
		databaseConnectionSet.setMaxIdleTime("3600");
		databaseConnectionSet.setMaxWaitTime("1000");
		databaseConnectionSet.setMaxStatements("10");
		databaseConnectionSet.setTestQuery("select 1 from INFORMATION_SCHEMA.SYSTEM_USERS");
		dbObjectPoolConfig.setDatabaseConnectionSet(databaseConnectionSet);
		String xml = dbObjectPoolConfig.toXML("");
		assertEquals("<db-object-pool>\n" + 
				"\t<database-connection-set>\n" + 
				"\t\t<name>test</name>\n" + 
				"\t\t<driver>org.hsqldb.jdbcDriver</driver>\n" + 
				"\t\t<url>jdbc:hsqldb:hsql://localhost/test</url>\n" + 
				"\t\t<user>sa</user>\n" + 
				"\t\t<password></password>\n" + 
				"\t\t<min-pool-size>1</min-pool-size>\n" + 
				"\t\t<max-pool-size>10</max-pool-size>\n" + 
				"\t\t<max-idle-time>3600</max-idle-time>\n" + 
				"\t\t<max-wait-time>1000</max-wait-time>\n" + 
				"\t\t<max-statements>10</max-statements>\n" + 
				"\t\t<test-query>select 1 from INFORMATION_SCHEMA.SYSTEM_USERS</test-query>\n" + 
				"\t</database-connection-set>\n" + 
				"\t<db-pool-util>org.quickserver.sql.DBPoolUtil</db-pool-util>\n" + 
				"</db-object-pool>\n", xml);
	}
	
	@Test
	void testToXML_Null() {
		DBObjectPoolConfig dbObjectPoolConfig = new DBObjectPoolConfig();
		dbObjectPoolConfig.setDbPoolUtil("org.quickserver.sql.DBPoolUtil");
		DatabaseConnectionSet databaseConnectionSet = new DatabaseConnectionSet();
		databaseConnectionSet.setName("test");
		databaseConnectionSet.setDriver("org.hsqldb.jdbcDriver");
		databaseConnectionSet.setUrl("jdbc:hsqldb:hsql://localhost/test");
		databaseConnectionSet.setUser("sa");
		databaseConnectionSet.setPassword("");
		databaseConnectionSet.setMinPoolSize("1");
		databaseConnectionSet.setMaxPoolSize("10");
		databaseConnectionSet.setMaxIdleTime("3600");
		databaseConnectionSet.setMaxWaitTime("1000");
		databaseConnectionSet.setMaxStatements("10");
		databaseConnectionSet.setTestQuery("select 1 from INFORMATION_SCHEMA.SYSTEM_USERS");
		dbObjectPoolConfig.setDatabaseConnectionSet(databaseConnectionSet);
		String xml = dbObjectPoolConfig.toXML(null);
		assertEquals("<db-object-pool>\n" + 
				"<database-connection-set>\n" + 
				"\t<name>test</name>\n" + 
				"\t<driver>org.hsqldb.jdbcDriver</driver>\n" + 
				"\t<url>jdbc:hsqldb:hsql://localhost/test</url>\n" + 
				"\t<user>sa</user>\n" + 
				"\t<password></password>\n" + 
				"\t<min-pool-size>1</min-pool-size>\n" + 
				"\t<max-pool-size>10</max-pool-size>\n" + 
				"\t<max-idle-time>3600</max-idle-time>\n" + 
				"\t<max-wait-time>1000</max-wait-time>\n" + 
				"\t<max-statements>10</max-statements>\n" + 
				"\t<test-query>select 1 from INFORMATION_SCHEMA.SYSTEM_USERS</test-query>\n" + 
				"</database-connection-set>\n" + 
				"\t<db-pool-util>org.quickserver.sql.DBPoolUtil</db-pool-util>\n" + 
				"</db-object-pool>\n", xml);
	}
	
	@Test
	void testToXML_Empty() {
		DBObjectPoolConfig dbObjectPoolConfig = new DBObjectPoolConfig();
		dbObjectPoolConfig.setDbPoolUtil("org.quickserver.sql.DBPoolUtil");
		DatabaseConnectionSet databaseConnectionSet = new DatabaseConnectionSet();
		databaseConnectionSet.setName("test");
		databaseConnectionSet.setDriver("org.hsqldb.jdbcDriver");
		databaseConnectionSet.setUrl("jdbc:hsqldb:hsql://localhost/test");
		databaseConnectionSet.setUser("sa");
		databaseConnectionSet.setPassword("");
		databaseConnectionSet.setMinPoolSize("1");
		databaseConnectionSet.setMaxPoolSize("10");
		databaseConnectionSet.setMaxIdleTime("3600");
		databaseConnectionSet.setMaxWaitTime("1000");
		databaseConnectionSet.setMaxStatements("10");
		databaseConnectionSet.setTestQuery("select 1 from INFORMATION_SCHEMA.SYSTEM_USERS");
		dbObjectPoolConfig.setDatabaseConnectionSet(databaseConnectionSet);
		String xml = dbObjectPoolConfig.toXML("");
		assertEquals("<db-object-pool>\n" + 
				"\t<database-connection-set>\n" + 
				"\t\t<name>test</name>\n" + 
				"\t\t<driver>org.hsqldb.jdbcDriver</driver>\n" + 
				"\t\t<url>jdbc:hsqldb:hsql://localhost/test</url>\n" + 
				"\t\t<user>sa</user>\n" + 
				"\t\t<password></password>\n" + 
				"\t\t<min-pool-size>1</min-pool-size>\n" + 
				"\t\t<max-pool-size>10</max-pool-size>\n" + 
				"\t\t<max-idle-time>3600</max-idle-time>\n" + 
				"\t\t<max-wait-time>1000</max-wait-time>\n" + 
				"\t\t<max-statements>10</max-statements>\n" + 
				"\t\t<test-query>select 1 from INFORMATION_SCHEMA.SYSTEM_USERS</test-query>\n" + 
				"\t</database-connection-set>\n" + 
				"\t<db-pool-util>org.quickserver.sql.DBPoolUtil</db-pool-util>\n" + 
				"</db-object-pool>\n", xml);
	}
	
	@Test
	void testToXML_Tab() {
		DBObjectPoolConfig dbObjectPoolConfig = new DBObjectPoolConfig();
		dbObjectPoolConfig.setDbPoolUtil("org.quickserver.sql.DBPoolUtil");
		DatabaseConnectionSet databaseConnectionSet = new DatabaseConnectionSet();
		databaseConnectionSet.setName("test");
		databaseConnectionSet.setDriver("org.hsqldb.jdbcDriver");
		databaseConnectionSet.setUrl("jdbc:hsqldb:hsql://localhost/test");
		databaseConnectionSet.setUser("sa");
		databaseConnectionSet.setPassword("");
		databaseConnectionSet.setMinPoolSize("1");
		databaseConnectionSet.setMaxPoolSize("10");
		databaseConnectionSet.setMaxIdleTime("3600");
		databaseConnectionSet.setMaxWaitTime("1000");
		databaseConnectionSet.setMaxStatements("10");
		databaseConnectionSet.setTestQuery("select 1 from INFORMATION_SCHEMA.SYSTEM_USERS");
		dbObjectPoolConfig.setDatabaseConnectionSet(databaseConnectionSet);
		String xml = dbObjectPoolConfig.toXML("\t");
		assertEquals("\t<db-object-pool>\n" + 
				"\t\t<database-connection-set>\n" + 
				"\t\t\t<name>test</name>\n" + 
				"\t\t\t<driver>org.hsqldb.jdbcDriver</driver>\n" + 
				"\t\t\t<url>jdbc:hsqldb:hsql://localhost/test</url>\n" + 
				"\t\t\t<user>sa</user>\n" + 
				"\t\t\t<password></password>\n" + 
				"\t\t\t<min-pool-size>1</min-pool-size>\n" + 
				"\t\t\t<max-pool-size>10</max-pool-size>\n" + 
				"\t\t\t<max-idle-time>3600</max-idle-time>\n" + 
				"\t\t\t<max-wait-time>1000</max-wait-time>\n" + 
				"\t\t\t<max-statements>10</max-statements>\n" + 
				"\t\t\t<test-query>select 1 from INFORMATION_SCHEMA.SYSTEM_USERS</test-query>\n" + 
				"\t\t</database-connection-set>\n" + 
				"\t\t<db-pool-util>org.quickserver.sql.DBPoolUtil</db-pool-util>\n" + 
				"\t</db-object-pool>\n", xml);
	}
	
	@Test
	void testToXML_Tab_Null() {
		DBObjectPoolConfig dbObjectPoolConfig = new DBObjectPoolConfig();
		dbObjectPoolConfig.setDbPoolUtil("org.quickserver.sql.DBPoolUtil");
		DatabaseConnectionSet databaseConnectionSet = new DatabaseConnectionSet();
		databaseConnectionSet.setName("test");
		databaseConnectionSet.setDriver("org.hsqldb.jdbcDriver");
		databaseConnectionSet.setUrl("jdbc:hsqldb:hsql://localhost/test");
		databaseConnectionSet.setUser("sa");
		databaseConnectionSet.setPassword("");
		databaseConnectionSet.setMinPoolSize("1");
		databaseConnectionSet.setMaxPoolSize("10");
		databaseConnectionSet.setMaxIdleTime("3600");
		databaseConnectionSet.setMaxWaitTime("1000");
		databaseConnectionSet.setMaxStatements("10");
		databaseConnectionSet.setTestQuery("select 1 from INFORMATION_SCHEMA.SYSTEM_USERS");
		dbObjectPoolConfig.setDatabaseConnectionSet(databaseConnectionSet);
		String xml = dbObjectPoolConfig.toXML("\t");
		assertEquals("\t<db-object-pool>\n" + 
				"\t\t<database-connection-set>\n" + 
				"\t\t\t<name>test</name>\n" + 
				"\t\t\t<driver>org.hsqldb.jdbcDriver</driver>\n" + 
				"\t\t\t<url>jdbc:hsqldb:hsql://localhost/test</url>\n" + 
				"\t\t\t<user>sa</user>\n" + 
				"\t\t\t<password></password>\n" + 
				"\t\t\t<min-pool-size>1</min-pool-size>\n" + 
				"\t\t\t<max-pool-size>10</max-pool-size>\n" + 
				"\t\t\t<max-idle-time>3600</max-idle-time>\n" + 
				"\t\t\t<max-wait-time>1000</max-wait-time>\n" + 
				"\t\t\t<max-statements>10</max-statements>\n" + 
				"\t\t\t<test-query>select 1 from INFORMATION_SCHEMA.SYSTEM_USERS</test-query>\n" + 
				"\t\t</database-connection-set>\n" + 
				"\t\t<db-pool-util>org.quickserver.sql.DBPoolUtil</db-pool-util>\n" + 
				"\t</db-object-pool>\n", xml);
	}
	
	@Test
	void testToXML_Tab_Empty() {
		DBObjectPoolConfig dbObjectPoolConfig = new DBObjectPoolConfig();
		dbObjectPoolConfig.setDbPoolUtil("org.quickserver.sql.DBPoolUtil");
		DatabaseConnectionSet databaseConnectionSet = new DatabaseConnectionSet();
		databaseConnectionSet.setName("test");
		databaseConnectionSet.setDriver("org.hsqldb.jdbcDriver");
		databaseConnectionSet.setUrl("jdbc:hsqldb:hsql://localhost/test");
		databaseConnectionSet.setUser("sa");
		databaseConnectionSet.setPassword("");
		databaseConnectionSet.setMinPoolSize("1");
		databaseConnectionSet.setMaxPoolSize("10");
		databaseConnectionSet.setMaxIdleTime("3600");
		databaseConnectionSet.setMaxWaitTime("1000");
		databaseConnectionSet.setMaxStatements("10");
		databaseConnectionSet.setTestQuery("select 1 from INFORMATION_SCHEMA.SYSTEM_USERS");
		dbObjectPoolConfig.setDatabaseConnectionSet(databaseConnectionSet);
		String xml = dbObjectPoolConfig.toXML("\t");
		assert