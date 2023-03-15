// QuickServerConfigTest.java
package org.quickserver.util.xmlreader;

import org.quickserver.net.server.QuickServer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link QuickServerConfig}.
* It contains ten unit test cases for the {@link QuickServerConfig#toXML(String)} method.
*/
class QuickServerConfigTest {

	@Test
	void testToXML() {
		QuickServerConfig qsc = new QuickServerConfig();
		qsc.setName("Test Server");
		qsc.setServerBanner("Test Server Banner");
		qsc.setPort(1234);
		qsc.setBindAddr("127.0.0.1");
		qsc.setServerMode(ServerMode.SINGLE_THREADED);
		qsc.setClientEventHandler("org.quickserver.net.server.impl.ClientEventHandlerImpl");
		qsc.setClientCommandHandler("org.quickserver.net.server.impl.ClientCommandHandlerImpl");
		qsc.setClientObjectHandler("org.quickserver.net.server.impl.ClientObjectHandlerImpl");
		qsc.setClientBinaryHandler("org.quickserver.net.server.impl.ClientBinaryHandlerImpl");
		qsc.setClientWriteHandler("org.quickserver.net.server.impl.ClientWriteHandlerImpl");
		qsc.setClientAuthenticationHandler("org.quickserver.net.server.impl.ClientAuthenticationHandlerImpl");
		qsc.setClientData("org.quickserver.net.server.impl.ClientDataImpl");
		qsc.setClientExtendedEventHandler("org.quickserver.net.server.impl.ClientExtendedEventHandlerImpl");
		qsc.setDefaultDataMode(DataMode.BINARY);
		qsc.setTimeout(1234);
		qsc.setTimeoutMsg("Timeout Msg");
		qsc.setMaxAuthTry(1234);
		qsc.setMaxAuthTryMsg("Max Auth Try Msg");
		qsc.setMaxConnection(1234);
		qsc.setMaxConnectionMsg("Max Connection Msg");
		qsc.setConsoleLoggingLevel("INFO");
		qsc.setConsoleLoggingFormatter("org.quickserver.net.server.impl.ConsoleLoggingFormatterImpl");
		qsc.setObjectPoolConfig(new ObjectPoolConfig());
		qsc.setCommunicationLogging(true);
		qsc.setDBObjectPoolConfig(new DBObjectPoolConfig());
		qsc.setSecurityManagerClass("org.quickserver.net.server.impl.SecurityManagerImpl");
		qsc.setAccessConstraintConfig(new AccessConstraintConfig());
		qsc.setQSAdminServerConfig(new QSAdminServerConfig());
		qsc.setApplicationConfiguration(new ApplicationConfiguration());
		qsc.setApplicationJarPath("/home/user/app.jar");
		qsc.setServerHooks(new ServerHooks());
		qsc.setInitServerHooks(new InitServerHooks());
		qsc.setSecure(new Secure());
		qsc.setAdvancedSettings(new AdvancedSettings());
		
		String expected = "<quickserver>\n" + 
				"\t<name>Test Server</name>\n" + 
				"\t<server-banner>Test Server Banner</server-banner>\n" + 
				"\t<port>1234</port>\n" + 
				"\t<bind-address>127.0.0.1</bind-address>\n" + 
				"\t<server-mode>\n" + 
				"\t\t<type>SINGLE_THREADED</type>\n" + 
				"\t</server-mode>\n" + 
				"\t<client-event-handler>org.quickserver.net.server.impl.ClientEventHandlerImpl</client-event-handler>\n" + 
				"\t<client-command-handler>org.quickserver.net.server.impl.ClientCommandHandlerImpl</client-command-handler>\n" + 
				"\t<client-object-handler>org.quickserver.net.server.impl.ClientObjectHandlerImpl</client-object-handler>\n" + 
				"\t<client-binary-handler>org.quickserver.net.server.impl.ClientBinaryHandlerImpl</client-binary-handler>\n" + 
				"\t<client-write-handler>org.quickserver.net.server.impl.ClientWriteHandlerImpl</client-write-handler>\n" + 
				"\t<client-authentication-handler>org.quickserver.net.server.impl.ClientAuthenticationHandlerImpl</client-authentication-handler>\n" + 
				"\t<client-data>org.quickserver.net.server.impl.ClientDataImpl</client-data>\n" + 
				"\t<client-extended-event-handler>org.quickserver.net.server.impl.ClientExtendedEventHandlerImpl</client-extended-event-handler>\n" + 
				"\t<default-data-mode>\n" + 
				"\t\t<type>BINARY</type>\n" + 
				"\t</default-data-mode>\n" + 
				"\t<timeout>1234</timeout>\n" + 
				"\t<timeout-msg>Timeout Msg</timeout-msg>\n" + 
				"\t<max-auth-try>1234</max-auth-try>\n" + 
				"\t<max-auth-try-msg>Max Auth Try Msg</max-auth-try-msg>\n" + 
				"\t<max-connection>1234</max-connection>\n" + 
				"\t<max-connection-msg>Max Connection Msg</max-connection-msg>\n" + 
				"\t<console-logging-level>INFO</console-logging-level>\n" + 
				"\t<console-logging-formatter>org.quickserver.net.server.impl.ConsoleLoggingFormatterImpl</console-logging-formatter>\n" + 
				"\t<object-pool>\n" + 
				"\t\t<max-pool-size>10</max-pool-size>\n" + 
				"\t\t<min-pool-size>1</min-pool-size>\n" + 
				"\t\t<max-idle-time>3600</max-idle-time>\n" + 
				"\t\t<max-wait-time>1000</max-wait-time>\n" + 
				"\t\t<max-life-time>-1</max-life-time>\n" + 
				"\t\t<pool-size-increment>1</pool-size-increment>\n" + 
				"\t\t<pool-size-decrement>1</pool-size-decrement>\n" + 
				"\t\t<pool-size-decrement-on-error>true</pool-size-decrement-on-error>\n" + 
				"\t\t<pool-size-decrement-on-exception>true</pool-size-decrement-on-exception>\n" + 
				"\t\t<pool-size-decrement-on-close>true</pool-size-decrement-on-close>\n" + 
				"\t\t<pool-size-decrement-on-timeout>true</pool-size-decrement-on-timeout>\n" + 
				"\t\t<pool-size-decrement-on-max-life-time>true</pool-size-decrement-on-max-life-time>\n" + 
