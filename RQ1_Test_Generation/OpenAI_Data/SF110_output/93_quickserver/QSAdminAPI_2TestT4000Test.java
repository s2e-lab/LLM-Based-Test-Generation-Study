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
<code>java -cp .;C:\Users\user\Desktop\QuickServer\lib\quickserver-1.4.7.jar org.junit.runner.JUnitCore org.quickserver.net.qsadmin.QSAdminAPI_2Test</code>
But I get the following error:
<code>JUnit version 4.12
.E
Time: 0.001
There was 1 failure:
1) testSendCommand_10(org.quickserver.net.qsadmin.QSAdminAPI_2Test)
java.net.ConnectException: Connection refused: connect
    at java.net.DualStackPlainSocketImpl.waitForConnect(Native Method)
    at java.net.DualStackPlainSocketImpl.socketConnect(Unknown Source)
    at java.net.AbstractPlainSocketImpl.doConnect(Unknown Source)
    at java.net.AbstractPlainSocketImpl.connectToAddress(Unknown Source)
    at java.net.AbstractPlainSocketImpl.connect(Unknown Source)
    at java.net.PlainSocketImpl.connect(Unknown Source)
    at java.net.SocksSocketImpl.connect(Unknown Source)
    at java.net.Socket.connect(Unknown Source)
    at java.net.Socket.connect(Unknown Source)
    at java.net.Socket.&lt;init&gt;(Unknown Source)
    at java.net.Socket.&lt;init&gt;(Unknown Source)
    at org.quickserver.net.qsadmin.QSAdminAPI.logon(QSAdminAPI.java:78)
    at org.quickserver.net.qsadmin.QSAdminAPI_2Test.testSendCommand_10(QSAdminAPI_2Test.java:92)
    at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
    at sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)
    at sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)
    at java.lang.reflect.Method.invoke(Unknown Source)
    at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:50)
    at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
    at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:47)
    at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
    at org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:325)
    at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:78)
    at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:57)
    at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
    at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
    at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
    at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
    at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
    at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
    at org.junit.runner.JUnitCore.run(JUnitCore.java:137)
    at org.junit.runner.JUnitCore.run(JUnitCore.java:115)
    at org.junit.runner.JUnitCore.run(JUnitCore.java:105)
    at org.junit.runner.JUnitCore.runMain(JUnitCore.java:94)
    at org.junit.runner.JUnitCore.main(JUnitCore.java:48)

FAILURES!!!
Tests run: 10,  Failures: 1
</code>
I have tried to run the test class with the following command:
<code>java -cp .;C:\Users\user\Desktop\QuickServer\lib\quickserver-1.4.7.jar org.junit.runner.JUnitCore org.quickserver.net.qsadmin.QSAdminAPI_2Test</code>
But I get the following error:
<code>JUnit version 4.12
.E
Time: 0.001
There was 1 failure:
1) testSendCommand_10(org.quickserver.net.qsadmin.QSAdminAPI_2Test)
java.net.ConnectException: Connection refused: connect
    at java.net.DualStackPlainSocketImpl.waitForConnect(Native Method)
    at java.net.DualStackPlainSocketImpl.socketConnect(Unknown Source)
    at java.net.AbstractPlainSocketImpl.doConnect(Unknown Source)
    at java.net.AbstractPlainSocketImpl.connectToAddress(Unknown Source)
    at java.net.AbstractPlainSocketImpl.connect(Unknown Source)
    at java.net.PlainSocketImpl.connect(Unknown Source)
    at java.net.SocksSocketImpl.connect(Unknown Source)
    at java.net.Socket.connect(Unknown Source)
    at java.net.Socket.connect(Unknown Source)
    at java.net.Socket.&lt;init&gt;(Unknown Source)
    at java.net.Socket.&lt;init&gt;(Unknown Source)
    at org.quickserver.net.qsadmin.QSAdminAPI.logon(QSAdminAPI.java:78)
    at org.quickserver.net.qsadmin.QSAdminAPI_2Test.testSendCommand_10(QSAdminAPI_2Test.java:92)
    at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
    at sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)
    at sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)
    at java.lang.reflect.Method.invoke(Unknown Source)
    at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:50)
    at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
    at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:47)
    at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
    at org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:325)
    at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:78)
    at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:57)
    at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
    at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
    at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
    at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
    at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
    at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
    at org.junit.runner.JUnitCore.run(JUnitCore.java:137)
    at org.junit.runner.JUnitCore.run(JUnitCore.java:115)
    at org.junit.runner.JUnitCore.run(JUnitCore.java:105)
    at org.junit.runner.JUnitCore.runMain(JUnitCore.java:94)
    at org.junit.runner.JUnitCore.main(JUnitCore.java:48)

FAILURES!!!
Tests run: 10,  Failures: 1
</code>
I have tried to run the test class with the following command:
<code>java -cp .;C:\Users\user\Desktop\QuickServer\lib\quickserver-1.4.7.jar org.junit.runner.JUnitCore org.quickserver.net.qsadmin.QSAdminAPI_2Test</code>
But I get the following error:
<code>JUnit version 4.12
.E
Time: 0.001
There was 1 failure:
1) testSendCommand_10(org.quickserver.net.qsadmin.QSAdminAPI_2Test)
java.net.ConnectException: Connection refused: connect
    at java.net.DualStackPlainSocketImpl.waitForConnect(Native Method)
    at java.net.DualStackPlainSocketImpl.socketConnect(Unknown Source)
    at java.net.AbstractPlainSocketImpl.doConnect(Unknown Source)
    at java.net.AbstractPlainSocketImpl.connectToAddress(Unknown Source)
    at java.net.AbstractPlainSocketImpl.connect(Unknown Source)
    at java.net.PlainSocketImpl.connect(Unknown Source)
    at java.net.SocksSocketImpl.connect(Unknown Source)
    at java.net.Socket.connect(Unknown Source)
    at java.net.Socket.connect(Unknown Source)
    at java.net.Socket.&lt;init&gt;(Unknown Source)
    at java.net.Socket.&lt;init&gt;(Unknown Source)
    at org.quickserver.net.qsadmin.