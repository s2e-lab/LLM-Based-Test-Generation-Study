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
		dcc.setMaxConn(10);
		dcc.setMinConn(1);
		dcc.setMaxWait(10000);
		dcc.setMaxIdleTime(600000);
		dcc.setMaxUseCount(0);
		dcc.setTestQuery("SELECT COUNT(*) FROM INFORMATION_SCHEMA.SYSTEM_TABLES");
		dcc.setTestOnBorrow(true);
		dcc.setTestOnReturn(true);
		dcc.setTestWhileIdle(true);
		dcc.setTimeBetweenEvictionRunsMillis(600000);
		dcc.setNumTestsPerEvictionRun(3);
		dcc.setMinEvictableIdleTimeMillis(600000);
		dcc.setRemoveAbandoned(true);
		dcc.setRemoveAbandonedTimeout(300);
		dcc.setLogAbandoned(true);
		dcs.addDatabaseConnection(dcc);
		String xml = dcs.toXML(null);
		assertEquals("<database-connection-set>\n" + 
			"\t<database-connection id=\"test\" driver=\"org.hsqldb.jdbcDriver\" url=\"jdbc:hsqldb:hsql://localhost/test\" user=\"sa\" password=\"\" max-conn=\"10\" min-conn=\"1\" max-wait=\"10000\" max-idle-time=\"600000\" max-use-count=\"0\" test-query=\"SELECT COUNT(*) FROM INFORMATION_SCHEMA.SYSTEM_TABLES\" test-on-borrow=\"true\" test-on-return=\"true\" test-while-idle=\"true\" time-between-eviction-runs-millis=\"600000\" num-tests-per-eviction-run=\"3\" min-evictable-idle-time-millis=\"600000\" remove-abandoned=\"true\" remove-abandoned-timeout=\"300\" log-abandoned=\"true\" />\n" + 
			"</database-connection-set>\n", xml);
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
		dcc.setMaxConn(10);
		dcc.setMinConn(1);
		dcc.setMaxWait(10000);
		dcc.setMaxIdleTime(600000);
		dcc.setMaxUseCount(0);
		dcc.setTestQuery("SELECT COUNT(*) FROM INFORMATION_SCHEMA.SYSTEM_TABLES");
		dcc.setTestOnBorrow(true);
		dcc.setTestOnReturn(true);
		dcc.setTestWhileIdle(true);
		dcc.setTimeBetweenEvictionRunsMillis(600000);
		dcc.setNumTestsPerEvictionRun(3);
		dcc.setMinEvictableIdleTimeMillis(600000);
		dcc.setRemoveAbandoned(true);
		dcc.setRemoveAbandonedTimeout(300);
		dcc.setLogAbandoned(true);
		dcs.addDatabaseConnection(dcc);
		String xml = dcs.toXML("\t");
		assertEquals("\t<database-connection-set>\n" + 
			"\t\t<database-connection id=\"test\" driver=\"org.hsqldb.jdbcDriver\" url=\"jdbc:hsqldb:hsql://localhost/test\" user=\"sa\" password=\"\" max-conn=\"10\" min-conn=\"1\" max-wait=\"10000\" max-idle-time=\"600000\" max-use-count=\"0\" test-query=\"SELECT COUNT(*) FROM INFORMATION_SCHEMA.SYSTEM_TABLES\" test-on-borrow=\"true\" test-on-return=\"true\" test-while-idle=\"true\" time-between-eviction-runs-millis=\"600000\" num-tests-per-eviction-run=\"3\" min-evictable-idle-time-millis=\"600000\" remove-abandoned=\"true\" remove-abandoned-timeout=\"300\" log-abandoned=\"true\" />\n" + 
			"\t</database-connection-set>\n", xml);
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
		dcc.setMaxConn(10);
		dcc.setMinConn(1);
		dcc.setMaxWait(10000);
		dcc.setMaxIdleTime(600000);
		dcc.setMaxUseCount(0);
		dcc.setTestQuery("SELECT COUNT(*) FROM INFORMATION_SCHEMA.SYSTEM_TABLES");
		dcc.setTestOnBorrow(true);
		dcc.setTestOnReturn(true);
		dcc.setTestWhileIdle(true);
		dcc.setTimeBetweenEvictionRunsMillis(600000);
		dcc.setNumTestsPerEvictionRun(3);
		dcc.setMinEvictableIdleTimeMillis(600000);
		dcc.setRemoveAbandoned(true);
		dcc.setRemoveAbandonedTimeout(300);
		dcc.setLogAbandoned(true);
		dcs.addDatabaseConnection(dcc);
		String xml = dcs.toXML("");
		assertEquals("<database-connection-set>\n" + 
			"\t<database-connection id=\"test\" driver=\"org.hsqldb.jdbcDriver\" url=\"jdbc:hsqldb:hsql://localhost/test\" user=\"sa\" password=\"\" max-conn=\"10\" min-conn=\"1\" max-wait=\"10000\" max-idle-time=\"600000\" max-use-count=\"0\" test-query=\"SELECT COUNT(*) FROM INFORMATION_SCHEMA.SYSTEM_TABLES\" test-on-borrow=\"true\" test-on-return=\"true\" test-while-idle=\"true\" time-between-eviction-runs-millis=\"600000\" num-tests-per-eviction-run=\"3\" min-evictable-idle-time-millis=\"600000\" remove-abandoned=\"true\" remove-abandoned-timeout=\"300\" log-abandoned=\"true\" />\n" + 
			"</database-connection-set>\n", xml);
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
		dcc.setMaxConn(10);
		dcc.setMinConn(1);
		dcc.setMaxWait(10000);
		dcc.setMaxIdleTime(600000);
		dcc.setMaxUseCount(0);
		dcc.setTestQuery("SELECT COUNT(*) FROM INFORMATION_SCHEMA.SYSTEM_TABLES");
		dcc.setTestOnBorrow(true);
		dcc.setTestOnReturn(true);
		dcc.setTestWhileIdle(true);
		dcc.setTimeBetweenEvictionRunsMillis(600000);
		dcc.setNumTestsPerEvictionRun(3);
		dcc.setMinEvictableIdleTimeMillis(600000);
		dcc.setRemoveAbandoned(true);
		dcc.setRemoveAbandonedTimeout(300);
		dcc.setLogAbandoned(true);
		dcs.addDatabaseConnection(dcc);
		String xml = dcs.toXML("\t\t");
		assertEquals("\t\t<database-connection-set>\n" + 
			"\t\t\t<database-connection id=\"test\" driver=\"org.hsqldb.jdbcDriver\" url=\"jdbc:hsqldb:hsql://localhost/test\" user=\"sa\" password=\"\" max-conn=\"10\" min-conn=\"1\" max-wait=\"10000\" max-idle-time=\"600000\" max-use-count=\"0\" test-query=\"SELECT COUNT(*) FROM INFORMATION_SCHEMA.SYSTEM_TABLES\" test-on-borrow=\"true\" test-on-return=\"true\" test-while-idle=\"true\" time-between-eviction-runs-millis=\"600000\" num-tests-per-eviction-run=\"3\" min-evictable-idle-time-millis=\"600000\" remove-abandoned=\"true\" remove-abandoned-timeout=\"300\" log-abandoned=\"true\" />\n" + 
			"\t\t</database-connection-set>\n", xml);
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
		dcc.setMaxConn(10);
		dcc.setMinConn(1);
		dcc.setMaxWait(10000);
		dcc.setMaxIdleTime(600000);
		dcc.setMaxUseCount(0);
		dcc.setTestQuery("SELECT COUNT(*) FROM INFORMATION_SCHEMA.SYSTEM_TABLES");
		dcc.setTestOnBorrow(true);
		dcc.setTestOnReturn(true);
		dcc.setTestWhileIdle(true);
		dcc.setTimeBetweenEvictionRunsMillis(600000);
		dcc.setNumTestsPerEvictionRun(3);
		dcc.setMinEvictableIdleTimeMillis(600000);
		dcc.setRemoveAbandoned(true);
		dcc.setRemoveAbandonedTimeout(300);
		dcc.setLogAbandoned(true);
		dcs.addDatabaseConnection(dcc);
		String xml = dcs.toXML("\t\t\t");
		assertEquals("\t\t\t<database-connection-set>\n" + 
			"\t\t\t\t<database-connection id=\"test\" driver=\"org.hsqldb.jdbcDriver\" url=\"jdbc:hsqldb:hsql://localhost/test\" user=\"sa\" password=\"\" max-conn=\"10\" min-conn=\"1\" max-wait=\"10000\" max-idle-time=\"600000\" max-use-count=\"0\" test-query=\"SELECT COUNT(*) FROM INFORMATION_SCHEMA.SYSTEM_TABLES\" test-on-borrow=\"true\" test-on-return=\"true\" test-while-idle=\"true\" time-between-eviction-runs-millis=\"600000\" num-tests-per-eviction-run=\"3\" min-evictable-idle-time-millis=\"600000\" remove-abandoned=\"true\" remove-abandoned-timeout=\"300\" log-abandoned=\"true\" />\n" + 
			"\t\t\t</database-connection-set>\n", xml);
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
		dcc.setMaxConn(10);
		dcc.setMinConn(1);
		dcc.setMaxWait(10000);
		dcc.setMaxIdleTime(600000);
		dcc.setMaxUseCount(0);
		dcc.setTestQuery("SELECT COUNT(*) FROM INFORMATION_SCHEMA.SYSTEM_TABLES");
		dcc.setTestOnBorrow(true);
		dcc.setTestOnReturn(true);
		dcc.setTestWhileIdle(true);
		dcc.setTimeBetweenEvictionRunsMillis(600000);
		dcc.setNumTestsPerEvictionRun(3);
		dcc.setMinEvictableIdleTimeMillis(600000);
		dcc.setRemoveAbandoned(true);
		dcc.setRemoveAbandonedTimeout(300);
		dcc.setLogAbandoned(true);
		dcs.addDatabaseConnection(dcc);
		String xml = dcs.toXML("\t\t\t\t");
		assertEquals("\t\t\t\t<database-connection-set>\n" + 
			"\t\t\t\t\t<database-connection id=\"test\" driver=\"org.hsqldb.jdbcDriver\" url=\"jdbc:hsqldb:hsql://localhost/test\" user=\"sa\" password=\"\" max-conn=\"10\" min-conn=\"1\" max-wait=\"10000\" max-idle-time=\"600000\" max-use-count=\"0\" test-query=\"SELECT COUNT(*) FROM INFORMATION_SCHEMA.SYSTEM_TABLES\" test-on-borrow=\"true\" test-on-return=\"true\" test-while-idle=\"true\" time-between-eviction-runs-millis=\"600000\" num-tests-per-eviction-run=\"3\" min-evictable-idle-time-millis=\"600000\" remove-abandoned=\"true\" remove-abandoned-timeout=\"300\" log-abandoned=\"true\" />\n" + 
			"\t\t\t\t</database-connection-set>\n", xml);
	}
	
	@Test
	public void testToXML_7() {
		DatabaseConnectionSet dcs = new DatabaseConnectionSet();
		DatabaseConnectionConfig dcc = new DatabaseConnectionConfig();
		dcc.setId("test");
		dcc.setDriver("org.hsqldb.jdbcDriver");
		dcc.setUrl("