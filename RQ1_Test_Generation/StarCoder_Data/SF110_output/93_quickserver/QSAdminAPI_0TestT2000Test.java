// QSAdminAPI_0Test.java
package org.quickserver.net.qsadmin;

import java.io.*;
import java.net.*;
import java.util.logging.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link QSAdminAPI}.
* It contains ten unit test cases for the {@link QSAdminAPI#logon()} method.
*/
class QSAdminAPI_0Test {
	@Test
	void testQSAdminAPI_0() throws Exception {
		QSAdminAPI qsAdminApi = new QSAdminAPI("127.0.0.1", 9080);
		assertTrue(qsAdminApi.logon());
		qsAdminApi.logoff();
		qsAdminApi.close();
	}
}

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
			@Test
	void testQSAdminAPI_1() throws Exception {
		QSAdminAPI qsAdminApi = new QSAdminAPI("127.0.0.1", 9080);
		assertTrue(qsAdminApi.logon("Admin", "QsAdm1n"));
		qsAdminApi.logoff();
		qsAdminApi.close();
	}
}

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
			@Test
	void testQSAdminAPI_2() throws Exception {
		QSAdminAPI qsAdminApi = new QSAdminAPI("127.0.0.1", 9080);
		assertTrue(qsAdminApi.logon());
		String info = qsAdminApi.sendCommand("info server");
		assertTrue(info.startsWith("+OK info follows"));
		qsAdminApi.logoff();
		qsAdminApi.close();
	}
}

// QSAdminAPI_3Test.java
package org.quickserver.net.qsadmin;

import java.io.*;
import java.net.*;
import java.util.logging.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link QSAdminAPI}.
* It contains ten unit test cases for the {@link QSAdminAPI#logoff()} method.
*/
class QSAdminAPI_3Test {
			@Test
	void testQSAdminAPI_3() throws Exception {
		QSAdminAPI qsAdminApi = new QSAdminAPI("127.0.0.1", 9080);
		assertTrue(qsAdminApi.logon());
		qsAdminApi.logoff();
		qsAdminApi.close();
	}
}

// QSAdminAPI_4Test.java
package org.quickserver.net.qsadmin;

import java.io.*;
import java.net.*;
import java.util.logging.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link QSAdminAPI}.
* It contains ten unit test cases for the {@link QSAdminAPI#close()} method.
*/
class QSAdminAPI_4Test {
			@Test
	void testQSAdminAPI_4() throws Exception {
		QSAdminAPI qsAdminApi = new QSAdminAPI("127.0.0.1", 9080);
		assertTrue(qsAdminApi.logon());
		qsAdminApi.logoff();
		qsAdminApi.close();
	}
}

// QSAdminAPI_5Test.java
package org.quickserver.net.qsadmin;

import java.io.*;
import java.net.*;
import java.util.logging.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link QSAdminAPI}.
* It contains ten unit test cases for the {@link QSAdminAPI#logon()} method.
*/
class QSAdminAPI_5Test {
			@Test
	void testQSAdminAPI_5() throws Exception {
		QSAdminAPI qsAdminApi = new QSAdminAPI("127.0.0.1", 9080);
		assertTrue(qsAdminApi.logon());
		String info = qsAdminApi.sendCommand("info server");
		assertTrue(info.startsWith("+OK info follows"));
		qsAdminApi.logoff();
		qsAdminApi.close();
	}
}

// QSAdminAPI_6Test.java
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
class QSAdminAPI_6Test {
			@Test
	void testQSAdminAPI_6() throws Exception {
		QSAdminAPI qsAdminApi = new QSAdminAPI("127.0.0.1", 9080);
		assertTrue(qsAdminApi.logon("Admin", "QsAdm1n"));
		String info = qsAdminApi.sendCommand("info server");
		assertTrue(info.startsWith("+OK info follows"));
		qsAdminApi.logoff();
		qsAdminApi.close();
	}
}

// QSAdminAPI_7Test.java
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
class QSAdminAPI_7Test {
			@Test
	void testQSAdminAPI_7() throws Exception {
		QSAdminAPI qsAdminApi = new QSAdminAPI("127.0.0.1", 9080);
		assertTrue(qsAdminApi.logon());
		String info = qsAdminApi.sendCommand("info server");
		assertTrue(info.startsWith("+OK info follows"));
		qsAdminApi.logoff();
		qsAdminApi.close();
	}
}

// QSAdminAPI_8Test.java
package org.quickserver.net.qsadmin;

import java.io.*;
import java.net.*;
import java.util.logging.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link QSAdminAPI}.
* It contains ten unit test cases for the {@link QSAdminAPI#logoff()} method.
*/
class QSAdminAPI_8Test {
			@Test
	void testQSAdminAPI_8() throws Exception {
		QSAdminAPI qsAdminApi = new QSAdminAPI("127.0.0.1", 9080);
		assertTrue(qsAdminApi.logon());
		qsAdminApi.logoff();
		qsAdminApi.close();
	}
}

// QSAdminAPI_9Test.java
package org.quickserver.net.qsadmin;

import java.io.*;
import java.net.*;
import java.util.logging.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link QSAdminAPI}.
* It contains ten unit test cases for the {@link QSAdminAPI#close()} method.
*/
class QSAdminAPI_9Test {
			@Test
	void testQSAdminAPI_9() throws Exception {
		QSAdminAPI qsAdminApi = new QSAdminAPI("127.0.0.1", 9080);
		assertTrue(qsAdminApi.logon());
		qsAdminApi.