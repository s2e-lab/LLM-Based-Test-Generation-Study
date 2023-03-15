// QSAdminServerConfigTest.java
package org.quickserver.util.xmlreader;

import org.quickserver.net.server.QuickServer;
import org.quickserver.net.qsadmin.QSAdminServer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link QSAdminServerConfig}.
* It contains ten unit test cases for the {@link QSAdminServerConfig#toXML(String)} method.
*/
class QSAdminServerConfigTest {

	@Test
	void testToXML() {
		QSAdminServerConfig qsadminServerConfig = new QSAdminServerConfig();
		qsadminServerConfig.setName("QSAdminServer v " + QSAdminServer.getVersion());
		qsadminServerConfig.setPort(9877);
		qsadminServerConfig.setBindAddr("127.0.0.1");
		qsadminServerConfig.setClientCommandHandler("org.quickserver.net.qsadmin.CommandHandler");
		qsadminServerConfig.setClientEventHandler("org.quickserver.net.qsadmin.CommandHandler");
		qsadminServerConfig.setClientAuthenticationHandler("org.quickserver.net.qsadmin.Authenticator");
		qsadminServerConfig.setClientData("org.quickserver.net.qsadmin.Data");
		qsadminServerConfig.setMaxConnection(1);
		qsadminServerConfig.getServerMode().setBlocking(true);
		qsadminServerConfig.setCommandPlugin("org.quickserver.net.qsadmin.Plugin");
		qsadminServerConfig.setCommandShellEnable("true");
		qsadminServerConfig.setCommandShellPromptName("QSAdmin");
		
		String expected = "<qsadmin-server>\n" + 
				"\t<name>QSAdminServer v 1.4.5</name>\n" + 
				"\t<port>9877</port>\n" + 
				"\t<bind-address>127.0.0.1</bind-address>\n" + 
				"\t<server-mode>\n" + 
				"\t\t<blocking>true</blocking>\n" + 
				"\t</server-mode>\n" + 
				"\t<client-event-handler>org.quickserver.net.qsadmin.CommandHandler</client-event-handler>\n" + 
				"\t<client-command-handler>org.quickserver.net.qsadmin.CommandHandler</client-command-handler>\n" + 
				"\t<client-authentication-handler>org.quickserver.net.qsadmin.Authenticator</client-authentication-handler>\n" + 
				"\t<client-data>org.quickserver.net.qsadmin.Data</client-data>\n" + 
				"\t<timeout>0</timeout>\n" + 
				"\t<max-auth-try>3</max-auth-try>\n" + 
				"\t<max-connection>1</max-connection>\n" + 
				"\t<object-pool>\n" + 
				"\t\t<max-active>10</max-active>\n" + 
				"\t\t<max-idle>5</max-idle>\n" + 
				"\t\t<max-wait>-1</max-wait>\n" + 
				"\t\t<min-evictable-idle-time>1800000</min-evictable-idle-time>\n" + 
				"\t\t<time-between-eviction-runs>-1</time-between-eviction-runs>\n" + 
				"\t\t<num-tests-per-eviction-run>3</num-tests-per-eviction-run>\n" + 
				"\t\t<min-idle>0</min-idle>\n" + 
				"\t\t<test-on-borrow>false</test-on-borrow>\n" + 
				"\t\t<test-on-return>false</test-on-return>\n" + 
				"\t\t<test-while-idle>false</test-while-idle>\n" + 
				"\t\t<lifo>true</lifo>\n" + 
				"\t\t<fairness>false</fairness>\n" + 
				"\t\t<block-when-exhausted>true</block-when-exhausted>\n" + 
				"\t\t<jmx-enabled>false</jmx-enabled>\n" + 
				"\t\t<jmx-name-base>pool</jmx-name-base>\n" + 
				"\t\t<jmx-name-prefix>pool</jmx-name-prefix>\n" + 
				"\t</object-pool>\n" + 
				"\t<communication-logging>\n" + 
				"\t\t<enable>false</enable>\n" + 
				"\t</communication-logging>\n" + 
				"\t<command-plugin>org.quickserver.net.qsadmin.Plugin</command-plugin>\n" + 
				"\t<command-shell>\n" + 
				"\t\t<enable>true</enable>\n" + 
				"\t\t<prompt-name>QSAdmin</prompt-name>\n" + 
				"\t</command-shell>\n" + 
				"\t<access-constraint>\n" + 
				"\t\t<allow-all>false</allow-all>\n" + 
				"\t\t<allow-ip>\n" + 
				"\t\t\t<ip>127.0.0.1</ip>\n" + 
				"\t\t</allow-ip>\n" + 
				"\t\t<allow-host>\n" + 
				"\t\t\t<host>localhost</host>\n" + 
				"\t\t</allow-host>\n" + 
				"\t\t<deny-ip>\n" + 
				"\t\t\t<ip>127.0.0.1</ip>\n" + 
				"\t\t</deny-ip>\n" + 
				"\t\t<deny-host>\n" + 
				"\t\t\t<host>localhost</host>\n" + 
				"\t\t</deny-host>\n" + 
				"\t</access-constraint>\n" + 
				"\t<server-hooks>\n" + 
				"\t\t<init-service>\n" + 
				"\t\t\t<class>org.quickserver.net.qsadmin.InitServiceHook</class>\n" + 
				"\t\t</init-service>\n" + 
				"\t\t<pre-accept>\n" + 
				"\t\t\t<class>org.quickserver.net.qsadmin.PreAcceptHook</class>\n" + 
				"\t\t</pre-accept>\n" + 
				"\t\t<post-accept>\n" + 
				"\t\t\t<class>org.quickserver.net.qsadmin.PostAcceptHook</class>\n" + 
				"\t\t</post-accept>\n" + 
				"\t\t<pre-close>