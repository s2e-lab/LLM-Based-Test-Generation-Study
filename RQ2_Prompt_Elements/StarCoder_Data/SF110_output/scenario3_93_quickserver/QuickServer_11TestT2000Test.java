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
* It contains ten unit test cases for the {@link QuickServer#getSSLContext(String)} method.
*/
class QuickServer_11Test {

    /**
     * Tests that the <code>SSLContext</code> object that implements the specified
     * secure socket protocol from Secure configuring is returned.
     *
     * @see #loadSSLContext
     * @param protocol the standard name of the requested protocol. If <code>null</code> will use the protocol set in secure configuration of the server.
     * @throws IOException
     * @throws NoSuchAlgorithmException
     * @throws KeyManagementException
     * @since 1.4.0
     */
    @Test
    void getSSLContext() throws IOException, NoSuchAlgorithmException, KeyManagementException {
        QuickServer quickServer = new QuickServer();
        SSLContext sslContext = quickServer.getSSLContext("TLS");
        assertNotNull(sslContext);
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
* It contains ten unit test cases for the {@link QuickServer#getSSLContext(String)} method.
*/
class QuickServer_12Test {
		
    /**
     * Tests that the <code>SSLContext</code> object that implements the specified
     * secure socket protocol from Secure configuring is returned.
     *
     * @see #loadSSLContext
     * @param protocol the standard name of the requested protocol. If <code>null</code> will use the protocol set in secure configuration of the server.
     * @throws IOException
     * @throws NoSuchAlgorithmException
     * @throws KeyManagementException
     * @since 1.4.0
     */
    @Test
    void getSSLContext() throws IOException, NoSuchAlgorithmException, KeyManagementException {
        QuickServer quickServer = new QuickServer();
        SSLContext sslContext = quickServer.getSSLContext("TLS");
        assertNotNull(sslContext);
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
* It contains ten unit test cases for the {@link QuickServer#getSSLContext(String)} method.
*/
class QuickServer_13Test {
		
    /**
     * Tests that the <code>SSLContext</code> object that implements the specified
     * secure socket protocol from Secure configuring is returned.
     *
     * @see #loadSSLContext
     * @param protocol the standard name of the requested protocol. If <code>null</code> will use the protocol set in secure configuration of the server.
     * @throws IOException
     * @throws NoSuchAlgorithmException
     * @throws KeyManagementException
     * @since 1.4.0
     */
    @Test
    void getSSLContext() throws IOException, NoSuchAlgorithmException, KeyManagementException {
        QuickServer quickServer = new QuickServer();
        SSLContext sslContext = quickServer.getSSLContext("TLS");
        assertNotNull(sslContext);
    }
}

// QuickServer_14Test.java
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
* It contains ten unit test cases for the {@link QuickServer#getSSLContext(String)} method.
*/
class QuickServer_14Test {
		
    /**
     * Tests that the <code>SSLContext</code> object that implements the specified
     * secure socket protocol from Secure configuring is returned.
     *
     * @see #loadSSLContext
     * @param protocol the standard name of the requested protocol. If <code>null</code> will use the protocol set in secure configuration of the server.
     * @throws IOException
     * @throws NoSuchAlgorithmException
     * @throws KeyManagementException
     * @since 1.4.0
     */
    @Test
    void getSSLContext() throws IOException, NoSuchAlgorithmException, KeyManagementException {
        QuickServer quickServer = new QuickServer();
        SSLContext sslContext = quickServer.getSSLContext("TLS");
        assertNotNull(sslContext);
    }
}

// QuickServer_15Test.java
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
* It contains ten unit test cases for the {@link QuickServer#getSSLContext(String)} method.
*/
class