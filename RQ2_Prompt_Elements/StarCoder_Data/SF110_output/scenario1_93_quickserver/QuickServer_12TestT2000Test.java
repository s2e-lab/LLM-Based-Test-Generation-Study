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

    @Test
    void getSSLSocketFactory() throws IOException, NoSuchAlgorithmException, KeyManagementException {
        QuickServer quickServer = new QuickServer();
        SSLSocketFactory sslSocketFactory = quickServer.getSSLSocketFactory("TLS");
        assertNotNull(sslSocketFactory);
    }

    @Test
    void getSSLSocketFactory_1() throws IOException, NoSuchAlgorithmException, KeyManagementException {
        QuickServer quickServer = new QuickServer();
        SSLSocketFactory sslSocketFactory = quickServer.getSSLSocketFactory("SSL");
        assertNotNull(sslSocketFactory);
    }

    @Test
    void getSSLSocketFactory_2() throws IOException, NoSuchAlgorithmException, KeyManagementException {
        QuickServer quickServer = new QuickServer();
        SSLSocketFactory sslSocketFactory = quickServer.getSSLSocketFactory("SSLv2");
        assertNotNull(sslSocketFactory);
    }

    @Test
    void getSSLSocketFactory_3() throws IOException, NoSuchAlgorithmException, KeyManagementException {
        QuickServer quickServer = new QuickServer();
        SSLSocketFactory sslSocketFactory = quickServer.getSSLSocketFactory("SSLv3");
        assertNotNull(sslSocketFactory);
    }

    @Test
    void getSSLSocketFactory_4() throws IOException, NoSuchAlgorithmException, KeyManagementException {
        QuickServer quickServer = new QuickServer();
        SSLSocketFactory sslSocketFactory = quickServer.getSSLSocketFactory("TLSv1");
        assertNotNull(sslSocketFactory);
    }

    @Test
    void getSSLSocketFactory_5() throws IOException, NoSuchAlgorithmException, KeyManagementException {
        QuickServer quickServer = new QuickServer();
        SSLSocketFactory sslSocketFactory = quickServer.getSSLSocketFactory("TLSv1.1");
        assertNotNull(sslSocketFactory);
    }

    @Test
    void getSSLSocketFactory_6() throws IOException, NoSuchAlgorithmException, KeyManagementException {
        QuickServer quickServer = new QuickServer();
        SSLSocketFactory sslSocketFactory = quickServer.getSSLSocketFactory("TLSv1.2");
        assertNotNull(sslSocketFactory);
    }

    @Test
    void getSSLSocketFactory_7() throws IOException, NoSuchAlgorithmException, KeyManagementException {
        QuickServer quickServer = new QuickServer();
        SSLSocketFactory sslSocketFactory = quickServer.getSSLSocketFactory("TLSv1.3");
        assertNotNull(sslSocketFactory);
    }

    @Test
    void getSSLSocketFactory_8() throws IOException, NoSuchAlgorithmException, KeyManagementException {
        QuickServer quickServer = new QuickServer();
        SSLSocketFactory sslSocketFactory = quickServer.getSSLSocketFactory("TLSv1.4");
        assertNotNull(sslSocketFactory);
    }

    @Test
    void getSSLSocketFactory_9() throws IOException, NoSuchAlgorithmException, KeyManagementException {
        QuickServer quickServer = new QuickServer();
        SSLSocketFactory sslSocketFactory = quickServer.getSSLSocketFactory("TLSv1.5");
        assertNotNull(sslSocketFactory);
    }

    @Test
    void getSSLSocketFactory_10() throws IOException, NoSuchAlgorithmException, KeyManagementException {
        QuickServer quickServer = new QuickServer();
        SSLSocketFactory sslSocketFactory = quickServer.getSSLSocketFactory("TLSv1.6");
        assertNotNull(sslSocketFactory);
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
		
    @Test
    void getSSLSocketFactory() throws IOException, NoSuchAlgorithmException, KeyManagementException {
        QuickServer quickServer = new QuickServer();
        SSLSocketFactory sslSocketFactory = quickServer.getSSLSocketFactory("TLS");
        assertNotNull(sslSocketFactory);
    }

    @Test
    void getSSLSocketFactory_1() throws IOException, NoSuchAlgorithmException, KeyManagementException {
        QuickServer quickServer = new QuickServer();
        SSLSocketFactory sslSocketFactory = quickServer.getSSLSocketFactory("SSL");
        assertNotNull(sslSocketFactory);
    }

    @Test
    void getSSLSocketFactory_2() throws IOException, NoSuchAlgorithmException, KeyManagementException {
        QuickServer quickServer = new QuickServer();
        SSLSocketFactory sslSocketFactory = quickServer.getSSLSocketFactory("SSLv2");
        assertNotNull(sslSocketFactory);
    }

    @Test
    void getSSLSocketFactory_3() throws IOException, NoSuchAlgorithmException, KeyManagementException {
        QuickServer quickServer = new QuickServer();
        SSLSocketFactory sslSocketFactory = quickServer.getSSLSocketFactory("SSLv3");
        assertNotNull(sslSocketFactory);
    }

    @Test
    void getSSLSocketFactory_4() throws IOException, NoSuchAlgorithmException, KeyManagementException {
        QuickServer quickServer = new QuickServer();
        SSLSocketFactory sslSocketFactory = quickServer.getSSLSocketFactory("TLSv1");
        assertNotNull(sslSocketFactory);
    }

    @Test
    void getSSLSocketFactory_5() throws IOException, NoSuchAlgorithmException, KeyManagementException {
        QuickServer quickServer = new QuickServer();
        SSLSocketFactory sslSocketFactory = quickServer.getSSLSocketFactory("TLSv1.1");
        assertNotNull(sslSocketFactory);
    }

    @Test
    void getSSLSocketFactory_6() throws IOException, NoSuchAlgorithmException, KeyManagementException {
        QuickServer quickServer = new QuickServer();
        SSLSocketFactory sslSocketFactory = quickServer.getSSLSocketFactory("TLSv1.2");
        assertNotNull(sslSocketFactory);
    }

    @Test
    void getSSLSocketFactory_7() throws IOException, NoSuchAlgorithmException, KeyManagementException {
        QuickServer quickServer = new QuickServer();
        SSLSocketFactory sslSocketFactory = quickServer.getSSLSocketFactory("TLSv1.3");
        assertNotNull(sslSocketFactory);
    }

    @Test
    void getSSLSocketFactory_8() throws IOException, NoSuchAlgorithmException, KeyManagementException {
        QuickServer quickServer = new QuickServer();
        SSLSocketFactory sslSocketFactory = quickServer.getSSLSocketFactory("TLSv1.4");
        assertNotNull(sslSocketFactory);
    }

    @Test
    void getSSLSocketFactory_9() throws IOException, NoSuchAlgorithmException, KeyManagementException {
        QuickServer quickServer = new QuickServer();
        SSLSocketFactory sslSocketFactory = quickServer.getSSLSocketFactory("TLSv1.5");
        assertNotNull(sslSocketFactory);
    }

    @Test
    void getSSLSocketFactory_10() throws IOException, NoSuchAlgorithmException, KeyManagementException {
        QuickServer quickServer = new QuickServer();
        SSLSocketFactory sslSocketFactory = quickServer.getSSLSocketFactory("TLSv1.6");
        assertNotNull(sslSocketFactory);
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