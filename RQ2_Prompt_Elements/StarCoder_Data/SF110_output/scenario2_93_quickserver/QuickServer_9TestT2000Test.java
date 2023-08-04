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

    /**
     * Tests the {@link QuickServer#info()} method.
     */
    @Test
    void testInfo() {
        QuickServer quickServer = new QuickServer();
        quickServer.setName("QuickServer");
        quickServer.setBindAddr(InetAddress.getLoopbackAddress());
        quickServer.setPort(1234);
        String info = quickServer.info();
        assertEquals("QuickServer\n" +
                "127.0.0.1 1234\n", info);
    }
}

// QuickServer_10Test.java
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
class QuickServer_10Test {
		
    /**
     * Tests the {@link QuickServer#info()} method.
     */
    @Test
    void testInfo() {
        QuickServer quickServer = new QuickServer();
        quickServer.setName("QuickServer");
        quickServer.setBindAddr(InetAddress.getLoopbackAddress());
        quickServer.setPort(1234);
        String info = quickServer.info();
        assertEquals("QuickServer\n" +
                "127.0.0.1 1234\n", info);
    }
}

// QuickServer_11Test.java
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
class QuickServer_11Test {
		
    /**
     * Tests the {@link QuickServer#info()} method.
     */
    @Test
    void testInfo() {
        QuickServer quickServer = new QuickServer();
        quickServer.setName("QuickServer");
        quickServer.setBindAddr(InetAddress.getLoopbackAddress());
        quickServer.setPort(1234);
        String info = quickServer.info();
        assertEquals("QuickServer\n" +
                "127.0.0.1 1234\n", info);
    }
}

// QuickServer_12Test.java
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
class QuickServer_12Test {
		
    /**
     * Tests the {@link QuickServer#info()} method.
     */
    @Test
    void testInfo() {
        QuickServer quickServer = new QuickServer();
        quickServer.setName("QuickServer");
        quickServer.setBindAddr(InetAddress.getLoopbackAddress());
        quickServer.setPort(1234);
        String info = quickServer.info();
        assertEquals("QuickServer\n" +
                "127.0.0.1 1234\n", info);
    }
}

// QuickServer_13Test.java
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
class QuickServer_13Test {
		
    /**
     * Tests the {@link QuickServer#info()} method.
     */
    @Test
    void testInfo() {
        QuickServer quickServer = new QuickServer();
        quickServer.setName("QuickServer");
        quickServer.setBindAddr(InetAddress.getLoopbackAddress());
        quickServer.setPort(1234);
        String info = quickServer.info();
        assertEquals("QuickServer\n" +
                "127.0.0.1 1234\n", info);
    }
}

// QuickServer_14Test.java
package org.quickserver.net.server;

import java.io.*;
import java.lang.management.ManagementFactory;
import java.net.*;
import org.quickserver.net.*;
//v1.