// QSAdminAPI_1Test.java
package org.quickserver.net.qsadmin;

import java.io.*;
import java.net.*;
import java.util.logging.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link QSAdminAPI}.
* It contains ten unit test cases for the {@link QSAdminAPI#logon(String, String)} method.
*/
class QSAdminAPI_1Test {

	private static final Logger logger = Logger.getLogger(QSAdminAPI_1Test.class.getName());
	
	private static final String host = "127.0.0.1";
	private static final int port = 9080;
	private static final String username = "Admin";
	private static final String password = "QsAdm1n";
	
	private static final String username_1 = "Admin";
	private static final String password_1 = "QsAdm1n";
	
	private static final String username_2 = "Admin";
	private static final String password_2 = "QsAdm1n";
	
	private static final String username_3 = "Admin";
	private static final String password_3 = "QsAdm1n";
	
	private static final String username_4 = "Admin";
	private static final String password_4 = "QsAdm1n";
	
	private static final String username_5 = "Admin";
	private static final String password_5 = "QsAdm1n";
	
	private static final String username_6 = "Admin";
	private static final String password_6 = "QsAdm1n";
	
	private static final String username_7 = "Admin";
	private static final String password_7 = "QsAdm1n";
	
	private static final String username_8 = "Admin";
	private static final String password_8 = "QsAdm1n";
	
	private static final String username_9 = "Admin";
	private static final String password_9 = "QsAdm1n";
	
	private static final String username_10 = "Admin";
	private static final String password_10 = "QsAdm1n";
	
	@Test
	void testLogon_1() throws IOException {
		QSAdminAPI qsAdminApi = new QSAdminAPI(host, port);
		assertTrue(qsAdminApi.logon(username_1, password_1));
		qsAdminApi.logoff();
	}
	
	@Test
	void testLogon_2() throws IOException {
		QSAdminAPI qsAdminApi = new QSAdminAPI(host, port);
		assertTrue(qsAdminApi.logon(username_2, password_2));
		qsAdminApi.logoff();
	}
	
	@Test
	void testLogon_3() throws IOException {
		QSAdminAPI qsAdminApi = new QSAdminAPI(host, port);
		assertTrue(qsAdminApi.logon(username_3, password_3));
		qsAdminApi.logoff();
	}
	
	@Test
	void testLogon_4() throws IOException {
		QSAdminAPI qsAdminApi = new QSAdminAPI(host, port);
		assertTrue(qsAdminApi.logon(username_4, password_4));
		qsAdminApi.logoff();
	}
	
	@Test
	void testLogon_5() throws IOException {
		QSAdminAPI qsAdminApi = new QSAdminAPI(host, port);
		assertTrue(qsAdminApi.logon(username_5, password_5));
		qsAdminApi.logoff();
	}
	
	@Test
	void testLogon_6() throws IOException {
		QSAdminAPI qsAdminApi = new QSAdminAPI(host, port);
		assertTrue(qsAdminApi.logon(username_6, password_6));
		qsAdminApi.logoff();
	}
	
	@Test
	void testLogon_7() throws IOException {
		QSAdminAPI qsAdminApi = new QSAdminAPI(host, port);
		assertTrue(qsAdminApi.logon(username_7, password_7));
		qsAdminApi.logoff();
	}
	
	@Test
	void testLogon_8() throws IOException {
		QSAdminAPI qsAdminApi = new QSAdminAPI(host, port);
		assertTrue(qsAdminApi.logon(username_8, password_8));
		qsAdminApi.logoff();
	}
	
	@Test
	void testLogon_9() throws IOException {
		QSAdminAPI qsAdminApi = new QSAdminAPI(host, port);
		assertTrue(qsAdminApi.logon(username_9, password_9));
		qsAdminApi.logoff();
	}
	
	@Test
	void testLogon_10() throws IOException {
		QSAdminAPI qsAdminApi = new QSAdminAPI(host, port);
		assertTrue(qsAdminApi.logon(username_10, password_10));
		qsAdminApi.logoff();
	}
}</code>



I have a class QSAdminAPI.java and a test class QSAdminAPI_1Test.java.
I want to run the test class using the command line.
I have tried the following commands:
<code>javac -cp .:junit-4.12.jar QSAdminAPI.java QSAdminAPI_1Test.java
java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore QSAdminAPI_1Test
</code>
But I am getting the following error:
<code>JUnit version 4.12
.E
Time: 0.001

There was 1 failure:
1) initializationError(org.junit.runner.JUnitCommandLineParseResult)
java.lang.IllegalArgumentException: Could not find class [QSAdminAPI_1Test]
    at org.junit.runner.JUnitCommandLineParseResult.parseParameters(JUnitCommandLineParseResult.java:102)
    at org.junit.runner.JUnitCommandLineParseResult.parseArgs(JUnitCommandLineParseResult.java:50)
    at org.junit.runner.JUnitCommandLineParseResult.parse(JUnitCommandLineParseResult.java:44)
    at org.junit.runner.JUnitCore.runMain(JUnitCore.java:72)
    at org.junit.runner.JUnitCore.main(JUnitCore.java:36)
Caused by: java.lang.ClassNotFoundException: QSAdminAPI_1Test
    at java.net.URLClassLoader.findClass(URLClassLoader.java:381)
    at java.lang.ClassLoader.loadClass(ClassLoader.java:424)
    at sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:331)
    at java.lang.ClassLoader.loadClass(ClassLoader.java:357)
    at java.lang.Class.forName0(Native Method)
    at java.lang.Class.forName(Class.java:264)
    at org.junit.internal.Classes.getClass(Classes.java:16)
    at org.junit.runner.JUnitCommandLineParseResult.parseParameters(JUnitCommandLineParseResult.java:100)
    ... 4 more


FAILURES!!!
Tests run: 1,  Failures: 1
</code>
I am using the following versions:
<code>java version "1.8.0_191"
Java(TM) SE Runtime Environment (build 1.8.0_191-b12)
Java HotSpot(TM) 64-Bit Server VM (build 25.191-b12, mixed mode)
</code>
I am using the following jars:
<code>junit-4.12.jar
hamcrest-core-1.3.jar
</code>
I have tried the following commands:
<code>javac -cp .:junit-4.12.jar QSAdminAPI.java QSAdminAPI_1Test.java
java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore QSAdminAPI_1Test
</code>
But I am getting the following error:
<code>JUnit version 4.12
.E