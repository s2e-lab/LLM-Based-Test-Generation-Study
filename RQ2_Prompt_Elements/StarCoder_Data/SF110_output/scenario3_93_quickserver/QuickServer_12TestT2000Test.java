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
* It contains ten unit test cases for the {@link QuickServer#getSSLSocketFactory(String)} method.
*/
class QuickServer_12Test {

    /**
     * Tests that the {@link QuickServer#getSSLSocketFactory(String)} method returns a SSLSocketFactory object
     * to be used for creating SSLSockets.
     *
     * @throws IOException
     * @throws NoSuchAlgorithmException
     * @throws KeyManagementException
     * @since 1.4.0
     */
    @Test
    void getSSLSocketFactory() throws IOException, NoSuchAlgorithmException, KeyManagementException {
        QuickServer quickServer = new QuickServer();
        SSLSocketFactory sslSocketFactory = quickServer.getSSLSocketFactory(null);
        assertNotNull(sslSocketFactory);
    }

    /**
     * Tests that the {@link QuickServer#getSSLSocketFactory(String)} method returns a SSLSocketFactory object
     * to be used for creating SSLSockets.
     *
     * @throws IOException
     * @throws NoSuchAlgorithmException
     * @throws KeyManagementException
     * @since 1.4.0
     */
    @Test
    void getSSLSocketFactoryWithProtocol() throws IOException, NoSuchAlgorithmException, KeyManagementException {
        QuickServer quickServer = new QuickServer();
        SSLSocketFactory sslSocketFactory = quickServer.getSSLSocketFactory("TLS");
        assertNotNull(sslSocketFactory);
    }

    /**
     * Tests that the {@link QuickServer#getSSLSocketFactory(String)} method returns a SSLSocketFactory object
     * to be used for creating SSLSockets.
     *
     * @throws IOException
     * @throws NoSuchAlgorithmException
     * @throws KeyManagementException
     * @since 1.4.0
     */
    @Test
    void getSSLSocketFactoryWithInvalidProtocol() throws IOException, NoSuchAlgorithmException, KeyManagementException {
        QuickServer quickServer = new QuickServer();
        SSLSocketFactory sslSocketFactory = quickServer.getSSLSocketFactory("invalid");
        assertNull(sslSocketFactory);
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
* It contains ten unit test cases for the {@link QuickServer#getSSLSocketFactory(String)} method.
*/
class QuickServer_13Test {
		
    /**
     * Tests that the {@link QuickServer#getSSLSocketFactory(String)} method returns a SSLSocketFactory object
     * to be used for creating SSLSockets.
     *
     * @throws IOException
     * @throws NoSuchAlgorithmException
     * @throws KeyManagementException
     * @since 1.4.0
     */
    @Test
    void getSSLSocketFactory() throws IOException, NoSuchAlgorithmException, KeyManagementException {
        QuickServer quickServer = new QuickServer();
        SSLSocketFactory sslSocketFactory = quickServer.getSSLSocketFactory(null);
        assertNotNull(sslSocketFactory);
    }

    /**
     * Tests that the {@link QuickServer#getSSLSocketFactory(String)} method returns a SSLSocketFactory object
     * to be used for creating SSLSockets.
     *
     * @throws IOException
     * @throws NoSuchAlgorithmException
     * @throws KeyManagementException
     * @since 1.4.0
     */
    @Test
    void getSSLSocketFactoryWithProtocol() throws IOException, NoSuchAlgorithmException, KeyManagementException {
        QuickServer quickServer = new QuickServer();
        SSLSocketFactory sslSocketFactory = quickServer.getSSLSocketFactory("TLS");
        assertNotNull(sslSocketFactory);
    }

    /**
     * Tests that the {@link QuickServer#getSSLSocketFactory(String)} method returns a SSLSocketFactory object
     * to be used for creating SSLSockets.
     *
     * @throws IOException
     * @throws NoSuchAlgorithmException
     * @throws KeyManagementException
     * @since 1.4.0
     */
    @Test
    void getSSLSocketFactoryWithInvalidProtocol() throws IOException, NoSuchAlgorithmException, KeyManagementException {
        QuickServer quickServer = new QuickServer();
        SSLSocketFactory sslSocketFactory = quickServer.getSSLSocketFactory("invalid");
        assertNull(sslSocketFactory);
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
* It contains ten unit test cases for the {@link QuickServer#getSSLSocketFactory(String)} method.
*/
class QuickServer_14Test {
		
    /**
     * Tests that the {@link QuickServer#getSSLSocketFactory(String)} method returns a SSLSocketFactory object
     * to be used for creating SSLSockets.
     *
     * @throws IOException
     * @throws NoSuchAlgorithmException
     * @throws KeyManagementException
     * @since 1.4.0
     */
    @Test
    void getSSLSocketFactory() throws IOException, NoSuchAlgorithmException, KeyManagementException {
        QuickServer quickServer = new QuickServer();
        SSLSocketFactory sslSocketFactory = quickServer.getSSLSocketFactory(null);
        assertNotNull(sslSocketFactory);
    }

    /**
     * Tests that the {@link QuickServer#getSSLSocketFactory(String)} method returns a SSLSocketFactory object
     * to be used for creating SSLSockets.
     *
     * @throws IOException
     * @throws NoSuchAlgorithmException
     * @throws KeyManagementException
     * @since 1.4.0
     */
    @Test
    void getSSLSocketFactoryWithProtocol() throws IOException, NoSuchAlgorithmException, KeyManagementException {
        QuickServer quickServer = new QuickServer();
        SSLSocketFactory sslSocketFactory = quickServer.getSSLSocketFactory("TLS");
        assertNotNull(sslSocketFactory);
    }

    /**
     * Tests that the {@link QuickServer#getSSLSocketFactory(String)} method returns a SSLSocketFactory object
     * to be used for creating SSLSockets.
     *
     * @throws IOException
     * @throws NoSuchAlgorithmException
     * @throws KeyManagementException
     * @since 1.4.0
     */
    @Test
    void getSSLSocketFactoryWithInvalidProtocol() throws IOException, NoSuchAlgorithmException, KeyManagementException {
        QuickServer quickServer = new QuickServer();
        SSLSocketFactory sslSocketFactory = quickServer.getSSLSocketFactory("invalid");
        assertNull(sslSocketFactory);
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
import org.quickserver.util