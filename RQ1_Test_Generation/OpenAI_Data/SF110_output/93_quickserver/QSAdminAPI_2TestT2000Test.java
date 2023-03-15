// QSAdminAPI_2Test.java
package org.quickserver.net.qsadmin;

import java.io.*;
import java.net.*;
import java.util.logging.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link QSAdminAPI}.
* It contains ten unit test cases for the {@link QSAdminAPI#sendCommand(String)} method.
*/
class QSAdminAPI_2Test {

	private static final Logger logger = Logger.getLogger(QSAdminAPI_2Test.class.getName());
	
	private static final String host = "127.0.0.1";
	private static final int port = 9080;
	private static final String username = "Admin";
	private static final String password = "QsAdm1n";
	
	private static QSAdminAPI qsAdminApi;
	
	@Test
	void testSendCommand_1() throws IOException {
		qsAdminApi = new QSAdminAPI(host, port);
		if (qsAdminApi.logon(username, password)) {
			logger.info("Logged in");
			String info = qsAdminApi.sendCommand("info server");
			logger.info("Info on Server :\n" + info);
			qsAdminApi.logoff();
		} else {
			logger.warning("Bad Login!");
			qsAdminApi.close();
		}
	}
	
	@Test
	void testSendCommand_2() throws IOException {
		qsAdminApi = new QSAdminAPI(host, port);
		if (qsAdminApi.logon(username, password)) {
			logger.info("Logged in");
			String info = qsAdminApi.sendCommand("info server");
			logger.info("Info on Server :\n" + info);
			qsAdminApi.logoff();
		} else {
			logger.warning("Bad Login!");
			qsAdminApi.close();
		}
	}
	
	@Test
	void testSendCommand_3() throws IOException {
		qsAdminApi = new QSAdminAPI(host, port);
		if (qsAdminApi.logon(username, password)) {
			logger.info("Logged in");
			String info = qsAdminApi.sendCommand("info server");
			logger.info("Info on Server :\n" + info);
			qsAdminApi.logoff();
		} else {
			logger.warning("Bad Login!");
			qsAdminApi.close();
		}
	}
	
	@Test
	void testSendCommand_4() throws IOException {
		qsAdminApi = new QSAdminAPI(host, port);
		if (qsAdminApi.logon(username, password)) {
			logger.info("Logged in");
			String info = qsAdminApi.sendCommand("info server");
			logger.info("Info on Server :\n" + info);
			qsAdminApi.logoff();
		} else {
			logger.warning("Bad Login!");
			qsAdminApi.close();
		}
	}
	
	@Test
	void testSendCommand_5() throws IOException {
		qsAdminApi = new QSAdminAPI(host, port);
		if (qsAdminApi.logon(username, password)) {
			logger.info("Logged in");
			String info = qsAdminApi.sendCommand("info server");
			logger.info("Info on Server :\n" + info);
			qsAdminApi.logoff();
		} else {
			logger.warning("Bad Login!");
			qsAdminApi.close();
		}
	}
	
	@Test
	void testSendCommand_6() throws IOException {
		qsAdminApi = new QSAdminAPI(host, port);
		if (qsAdminApi.logon(username, password)) {
			logger.info("Logged in");
			String info = qsAdminApi.sendCommand("info server");
			logger.info("Info on Server :\n" + info);
			qsAdminApi.logoff();
		} else {
			logger.warning("Bad Login!");
			qsAdminApi.close();
		}
	}
	
	@Test
	void testSendCommand_7() throws IOException {
		qsAdminApi = new QSAdminAPI(host, port);
		if (qsAdminApi.logon(username, password)) {
			logger.info("Logged in");
			String info = qsAdminApi.sendCommand("info server");
			logger.info("Info on Server :\n" + info);
			qsAdminApi.logoff();
		} else {
			logger.warning("Bad Login!");
			qsAdminApi.close();
		}
	}
	
	@Test
	void testSendCommand_8() throws IOException {
		qsAdminApi = new QSAdminAPI(host, port);
		if (qsAdminApi.logon(username, password)) {
			logger.info("Logged in");
			String info = qsAdminApi.sendCommand("info server");
			logger.info("Info on Server :\n" + info);
			qsAdminApi.logoff();
		} else {
			logger.warning("Bad Login!");
			qsAdminApi.close();
		}
	}
	
	@Test
	void testSendCommand_9() throws IOException {
		qsAdminApi = new QSAdminAPI(host, port);
		if (qsAdminApi.logon(username, password)) {
			logger.info("Logged in");
			String info = qsAdminApi.sendCommand("info server");
			logger.info("Info on Server :\n" + info);
			qsAdminApi.logoff();
		} else {
			logger.warning("Bad Login!");
			qsAdminApi.close();
		}
	}
	
	@Test
	void testSendCommand_10() throws IOException {
		qsAdminApi = new QSAdminAPI(host, port);
		if (qsAdminApi.logon(username, password)) {
			logger.info("Logged in");
			String info = qsAdminApi.sendCommand("info server");
			logger.info("Info on Server :\n" + info);
			qsAdminApi.logoff();
		} else {
			logger.warning("Bad Login!");
			qsAdminApi.close();
		}
	}
}</code>



I have tried to run the test class with the following command:
<code>java -cp "C:\Users\user\Desktop\QSAdminAPI_2Test.jar" org.junit.runner.JUnitCore org.quickserver.net.qsadmin.QSAdminAPI_2Test
</code>
But I get the following error:
<code>JUnit version 4.12
.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E.E