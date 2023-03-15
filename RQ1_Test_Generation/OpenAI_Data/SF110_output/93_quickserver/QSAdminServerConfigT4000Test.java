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
		
		String expectedXML = "<qsadmin-server>\n" + 
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
				"\t\t<max-pool-size>10</max-pool-size>\n" + 
				"\t\t<min-pool-size>1</min-pool-size>\n" + 
				"\t\t<max-idle-time>0</max-idle-time>\n" + 
				"\t\t<max-wait-time>0</max-wait-time>\n" + 
				"\t\t<max-life-time>0</max-life-time>\n" + 
				"\t\t<pool-resize-quantity>1</pool-resize-quantity>\n" + 
				"\t\t<pool-resize-timeout>0</pool-resize-timeout>\n" + 
				"\t\t<pool-resize-timer>0</pool-resize-timer>\n" + 
				"\t\t<pool-resize-check-enabled>false</pool-resize-check-enabled>\n" + 
				"\t\t<pool-resize-check-timer>0</pool-resize-check-timer>\n" + 
				"\t\t<pool-resize-check-timeout>0</pool-resize-check-timeout>\n" + 
				"\t\t<pool-resize-check-quantity>1</pool-resize-check-quantity>\n" + 
				"\t\t<pool-resize-check-min-pool-size>1</pool-resize-check-min-pool-size>\n" + 
				"\t\t<pool-resize-check-max-pool-size>10</pool-resize-check-max-pool-size>\n" + 
				"\t\t<pool-resize-check-min-idle-objects>1</pool-resize-check-min-idle-objects>\n" + 
				"\t\t<pool-resize-check-max-idle-objects>10</pool-resize-check-max-idle-objects>\n" + 
				"\t\t<pool-resize-check-min-busy-objects>1</pool-resize-check-min-busy-objects>\n" + 
				"\t\t<pool-resize-check-max-busy-objects>10</pool-resize-check-max-busy-objects>\n" + 
				"\t\t<pool-resize-check-min-life-time>0</pool-resize-check-min-life-time>\n" + 
				"\t\t<pool-resize-check-max-life-time>0</pool-resize-check-max-life-time>\n" + 
				"\t\t<pool-resize-check-min-idle-time>0</pool-resize-check-min-idle-time>\n" + 
				"\t\t<pool-resize-check-max-idle-time>0</pool-resize-check-max-idle-time>\n" + 
				"\t\t<pool-resize-check-min-wait-time>0</pool-resize-check-min-wait-time>\n" + 
				"\t\t<pool-resize-check-max-wait-time>0</pool-resize-check-max-wait-time>\n" + 
				"\t\t<pool-resize-check-min-busy-time>0</pool-resize-check-min-busy-time>\n" + 
				"\t\t<pool-resize-check-max-busy-time>0</pool-resize-check-max-busy-time>\n" + 
				"\t\t<pool-resize-check-min-create-time>0</pool-resize-check-min-create-time>\n" + 
				"\t\t<pool-resize-check-max-create-time>0</pool-resize-check-max-create-time>\n" + 
				"\t\t<pool-resize-check-min-destroy-time>0</pool-resize-check-min-destroy-time>\n" + 
				"\t\t<pool-resize-check-max-destroy-time>0</pool-resize-check-max-destroy-time>\n" + 
				"\t\t<pool-resize-check-min-create-count>0</pool-resize-check-min-create-count>\n" + 
				"\t\t<pool-resize-check-max-create-count>0</pool-resize-check-max-create-count>\n" + 
				"\t\t<pool-resize-check-min-destroy-count>0</pool-resize-check-min-destroy-count>\n" + 
				"\t\t<pool-resize-check-max-destroy-count>0</pool-resize-check-max-destroy-count>\n" + 
				"\t\t<pool-resize-check-min-active-count>0</pool-resize-check-min-active-count>\n" + 
				"\t\t<pool-resize-check-max-active-count>0</pool-resize-check-max-active-count>\n" + 
				"\t\t<pool-resize-check-min-idle-count>0</pool-resize-check-min-idle-count>\n" + 
				"\t\t<pool-resize-check-max-idle-count>0</pool-resize-check-max-idle-count>\n" + 
				"\t\t<pool-resize-check-min-busy-count>0</pool-resize-check-min-busy-count>\n" + 
				"\t\t<pool-resize-check-max-busy-count>0</pool-resize-check-max-busy-count>\n" + 
				"\t\t<pool-resize-check-min-wait-count>0</pool-resize-check-min-wait-count>\n" + 
				"\t\t<pool-resize-check-max-wait-count>0</pool-resize-check-max-wait-count>\n" + 
				"\t\t<pool-resize-check-min-active-time>0</pool-resize-check-min-active-time>\n" + 
				"\t\t<pool-resize-check-max-active-time>0</pool-resize-check-max-active-time>\n" + 
				"\t\t<pool-resize-check-min-wait-time-per-object>0</pool-resize-check-min-wait-time-per-object>\n" + 
				"\t\t<pool-resize-check-max-wait-time-per-object>0</pool-resize-check-max-wait-time-per-object>\n" + 
				"\t\t<pool-resize-check-min-busy-time-per-object>0</pool-resize-check-min-busy-time-per-object>\n" + 
				"\t\t<pool-resize-check-max-busy-time-per-object>0</pool-resize-check-max-busy-time-per-object>\n" + 
				"\t\t<pool-resize-check-min-create-time-per-object>0</pool-resize-check-min-create-time-per-object>\n" + 
				"\t\t<pool-resize-check-max-create-time-per-object>0</pool-resize-check-max-create-time-per-object>\n" + 
				"\t\t<pool-resize-check-min-destroy-time-per-object>0</pool-resize-check-min-destroy-time-per-object>\n" + 
				"\t\t<pool-resize-check-max-destroy-time-per-object>0</pool-resize-check-max-destroy-time-per-object>\n" + 
				"\t\t<pool-resize-check-min-active-time-per-object>0</pool-resize-check-min-active-time-per-object>\n" + 
				"\t\t<pool-resize-check-max-active-time-per-object>0</pool-resize-check-max-active-time-per-object>\n" + 
				"\t\t<pool-resize-check-min-idle-time-per-object>0</pool-resize-check-min-idle-time-per-object>\n" + 
				"\t\t<pool-resize-check-max-idle-time-per-object>0</pool-resize-check-max-idle-time-per-object>\n" + 
				"\t\t<pool-resize-check-min-life-time-per-object>0</pool-resize-check-min-life-time-per-object>\n" + 
				"\t\t<pool-resize-check-max-life-time-per-object>0</pool-resize-check-max-life-time-per-object>\n" + 
				"\t\t<pool-resize-check-min-create-count-per-object>0</pool-resize-check-min-create-count-per-object>\n" + 
				"\t\t<pool-resize-check-max-create-count-per-object>0</pool-resize-check-max-create-count-per-object>\n" + 
				"\t\t<pool-resize-check-min-destroy-count-per-object>0</pool-resize-check-min-destroy-count-per-object>\n" + 
				"\t\t<pool-resize-check-max-destroy-count-per-object>0</pool-resize-check-max-destroy-count-per-object>\n" + 
				"\t\t<pool-resize-check-min-active-count-per-object>0</pool-resize-check-min-active-count-per-object>\n" + 
				"\t\t<pool-resize-check-max-active-count-per-object>0</pool-resize-check-max-active-count-per-object>\n" + 
				"\t\t<pool-resize-check-min-idle-count-per-object>0</pool-resize-check-min-idle-count-per-object>\n" + 
				"\t\t<pool-resize-check-max-idle-count-per-object>0</pool-resize-check-max-idle-count-per-object>\n" + 
				"\t\t<pool-resize-check-min-busy-count-per-object>0</pool-resize-check-min-busy-count-per-object>\n" + 
				"\t\t<pool-resize-check-max-busy-count-per-object>0</pool-resize-check-max-busy-count-per-object>\n" + 
				"\t\t<pool-resize-check-min-wait-count-per-object>0</pool-resize-check-min-wait-count-per-object>\n" + 
				"\t\t<pool-resize-check-max-wait-count-per-object>0</pool-resize-check-max-wait-count-per-object>\n" + 
				"\t</object-pool>\n" + 
				"\t<communication-logging>\n" + 
				"\t\t<enable>false</enable>\n" + 
				"\t</communication-logging>\n" + 
				"\t<command-plugin>org.quickserver.net.qsadmin.Plugin</