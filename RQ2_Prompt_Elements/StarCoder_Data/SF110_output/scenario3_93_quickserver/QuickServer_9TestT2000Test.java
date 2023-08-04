// QuickServer_9Test.java
package org.quickserver.net.server;

import java.io.*;
import java.lang.management.ManagementFactory;
import java.net.*;
import org.quickserver.net.*;
//v1.1
import org.quickserver.net.qsadmin.*;
//v1.2
import java.util.logging.*;
//v1.3
import org.quickserver.util.pool.*;
import org.quickserver.util.pool.thread.*;
import org.apache.commons.pool.*;
import org.quickserver.util.xmlreader.*;
import org.quickserver.sql.*;
//v1.3.1
import java.util.logging.Formatter;
import java.util.*;
//v1.3.2
import org.quickserver.util.*;
//v1.3.3
import org.quickserver.security.*;
//v1.4.0
import javax.net.ssl.*;
import javax.net.*;
import java.security.*;
import java.security.cert.*;
//v1.4.5
import java.nio.channels.*;
import org.quickserver.net.server.impl.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link QuickServer}.
* It contains ten unit test cases for the {@link QuickServer#info()} method.
*/
class QuickServer_9Test {
	@Test
			void testInfo() {
				QuickServer quickServer = new QuickServer();
				String info = quickServer.info();
				assertNotNull(info);
				assertTrue(info.contains("QuickServer"));
				assertTrue(info.contains("1.4.8"));
				assertTrue(info.contains("1.4.8"));
				assertTrue(info.contains("1.4.8"));
				assertTrue(info.contains("1.4.8"));
				assertTrue(info.contains("1.4.8"));
				assertTrue(info.contains("1.4.8"));
				assertTrue(info.contains("1.4.8"));
				assertTrue(info.contains("1.4.8"));
				assertTrue(info.contains("1.4.8"));
			}
}

// QuickServer_8Test.java
package org.quickserver.net.server;

import java.io.*;
import java.lang.management.ManagementFactory;
import java.net.*;
import org.quickserver.net.*;
//v1.1
import org.quickserver.net.qsadmin.*;
//v1.2
import java.util.logging.*;
//v1.3
import org.quickserver.util.pool.*;
import org.quickserver.util.pool.thread.*;
import org.apache.commons.pool.*;
import org.quickserver.util.xmlreader.*;
import org.quickserver.sql.*;
//v1.3.1
import java.util.logging.Formatter;
import java.util.*;
//v1.3.2
import org.quickserver.util.*;
//v1.3.3
import org.quickserver.security.*;
//v1.4.0
import javax.net.ssl.*;
import javax.net.*;
import java.security.*;
import java.security.cert.*;
//v1.4.5
import java.nio.channels.*;
import org.quickserver.net.server.impl.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link QuickServer}.
* It contains nine unit test cases for the {@link QuickServer#info()} method.
*/
class QuickServer_8Test {
			@Test
			void testInfo() {
				QuickServer quickServer = new QuickServer();
				String info = quickServer.info();
				assertNotNull(info);
				assertTrue(info.contains("QuickServer"));
				assertTrue(info.contains("1.4.8"));
				assertTrue(info.contains("1.4.8"));
				assertTrue(info.contains("1.4.8"));
				assertTrue(info.contains("1.4.8"));
				assertTrue(info.contains("1.4.8"));
				assertTrue(info.contains("1.4.8"));
				assertTrue(info.contains("1.4.8"));
				assertTrue(info.contains("1.4.8"));
			}
}

// QuickServer_7Test.java
package org.quickserver.net.server;

import java.io.*;
import java.lang.management.ManagementFactory;
import java.net.*;
import org.quickserver.net.*;
//v1.1
import org.quickserver.net.qsadmin.*;
//v1.2
import java.util.logging.*;
//v1.3
import org.quickserver.util.pool.*;
import org.quickserver.util.pool.thread.*;
import org.apache.commons.pool.*;
import org.quickserver.util.xmlreader.*;
import org.quickserver.sql.*;
//v1.3.1
import java.util.logging.Formatter;
import java.util.*;
//v1.3.2
import org.quickserver.util.*;
//v1.3.3
import org.quickserver.security.*;
//v1.4.0
import javax.net.ssl.*;
import javax.net.*;
import java.security.*;
import java.security.cert.*;
//v1.4.5
import java.nio.channels.*;
import org.quickserver.net.server.impl.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link QuickServer}.
* It contains eight unit test cases for the {@link QuickServer#info()} method.
*/
class QuickServer_7Test {
			@Test
			void testInfo() {
				QuickServer quickServer = new QuickServer();
				String info = quickServer.info();
				assertNotNull(info);
				assertTrue(info.contains("QuickServer"));
				assertTrue(info.contains("1.4.8"));
				assertTrue(info.contains("1.4.8"));
				assertTrue(info.contains("1.4.8"));
				assertTrue(info.contains("1.4.8"));
				assertTrue(info.contains("1.4.8"));
				assertTrue(info.contains("1.4.8"));
				assertTrue(info.contains("1.4.8"));
			}
}

// QuickServer_6Test.java
package org.quickserver.net.server;

import java.io.*;
import java.lang.management.ManagementFactory;
import java.net.*;
import org.quickserver.net.*;
//v1.1
import org.quickserver.net.qsadmin.*;
//v1.2
import java.util.logging.*;
//v1.3
import org.quickserver.util.pool.*;
import org.quickserver.util.pool.thread.*;
import org.apache.commons.pool.*;
import org.quickserver.util.xmlreader.*;
import org.quickserver.sql.*;
//v1.3.1
import java.util.logging.Formatter;
import java.util.*;
//v1.3.2
import org.quickserver.util.*;
//v1.3.3
import org.quickserver.security.*;
//v1.4.0
import javax.net.ssl.*;
import javax.net.*;
import java.security.*;
import java.security.cert.*;
//v1.4.5
import java.nio.channels.*;
import org.quickserver.net.server.impl.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link QuickServer}.
* It contains seven unit test cases for the {@link QuickServer#info()} method.
*/
class QuickServer_6Test {
			@Test
			void testInfo() {
				QuickServer quickServer = new QuickServer();
				String info = quickServer.info();
				assertNotNull(info);
				assertTrue(info.contains("QuickServer"));
				assertTrue(info.contains("1.4.8"));
				assertTrue(info.contains("1.4.8"));
				assertTrue(info.contains("1.4.8"));
				assertTrue(info.contains("1.4.8"));
				assertTrue(info.contains("1.4.8"));
				assertTrue(info.contains("1.4.8"));
			}
}

// QuickServer_5Test.java
package org.quickserver.net.server;

import java.io.*;
import java.lang.management.ManagementFactory;
import java.net.*;
import org.quickserver.net.*;
//v1.1
import org.quickserver.net.qsadmin.*;
//v1.2
import java.util.logging.*;
//v1.3
import org.quickserver.util.pool.*;
import org.quickserver.util.pool.thread.*;
import org.apache.commons.pool.*;
import org.quickserver.util.xmlreader.*;
import org.quickserver.sql.*;
//v1.3.1
import java.util.logging.Formatter;
import java.util.*;
//v1.3.2
import org.quickserver.util.*;
//v1.3.3
import org.quickserver.security.*;
//v1.4.0
import javax.net.ssl.*;
import javax.net.*;
import java.security.*;
import java.security.cert.*;
//v1.4.5
import java.nio.channels.*;
import org.quickserver.net.server.impl.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link QuickServer}.
* It contains six unit test cases for the {@link QuickServer#info()} method.
*/
class QuickServer_5Test {
			@Test
			void testInfo() {
				QuickServer quick