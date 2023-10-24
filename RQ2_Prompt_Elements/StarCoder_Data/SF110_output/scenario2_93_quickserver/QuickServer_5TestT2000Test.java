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
* It contains ten unit test cases for the {@link QuickServer#startService()} method.
*/
class QuickServer_5Test {

    /**
     * Tests that the service is started successfully.
     */
    @Test
    void startService_1() {
        QuickServer quickServer = new QuickServer();
        assertTrue(quickServer.startService());
    }

    /**
     * Tests that the service is started successfully.
     */
    @Test
    void startService_2() {
        QuickServer quickServer = new QuickServer();
        quickServer.setClientCommandHandler("org.quickserver.net.server.impl.BasicClientCommandHandler");
        assertTrue(quickServer.startService());
    }

    /**
     * Tests that the service is started successfully.
     */
    @Test
    void startService_3() {
        QuickServer quickServer = new QuickServer();
        quickServer.setClientCommandHandler("org.quickserver.net.server.impl.BasicClientCommandHandler");
        quickServer.setClientObjectHandler("org.quickserver.net.server.impl.BasicClientObjectHandler");
        assertTrue(quickServer.startService());
    }

    /**
     * Tests that the service is started successfully.
     */
    @Test
    void startService_4() {
        QuickServer quickServer = new QuickServer();
        quickServer.setClientCommandHandler("org.quickserver.net.server.impl.BasicClientCommandHandler");
        quickServer.setClientObjectHandler("org.quickserver.net.server.impl.BasicClientObjectHandler");
        quickServer.setClientBinaryHandler("org.quickserver.net.server.impl.BasicClientBinaryHandler");
        assertTrue(quickServer.startService());
    }

    /**
     * Tests that the service is started successfully.
     */
    @Test
    void startService_5() {
        QuickServer quickServer = new QuickServer();
        quickServer.setClientCommandHandler("org.quickserver.net.server.impl.BasicClientCommandHandler");
        quickServer.setClientObjectHandler("org.quickserver.net.server.impl.BasicClientObjectHandler");
        quickServer.setClientBinaryHandler("org.quickserver.net.server.impl.BasicClientBinaryHandler");
        quickServer.setClientWriteHandler("org.quickserver.net.server.impl.BasicClientWriteHandler");
        assertTrue(quickServer.startService());
    }

    /**
     * Tests that the service is started successfully.
     */
    @Test
    void startService_6() {
        QuickServer quickServer = new QuickServer();
        quickServer.setClientCommandHandler("org.quickserver.net.server.impl.BasicClientCommandHandler");
        quickServer.setClientObjectHandler("org.quickserver.net.server.impl.BasicClientObjectHandler");
        quickServer.setClientBinaryHandler("org.quickserver.net.server.impl.BasicClientBinaryHandler");
        quickServer.setClientWriteHandler("org.quickserver.net.server.impl.BasicClientWriteHandler");
        quickServer.setClientAuthenticationHandler("org.quickserver.net.server.impl.BasicClientAuthenticationHandler");
        assertTrue(quickServer.startService());
    }

    /**
     * Tests that the service is started successfully.
     */
    @Test
    void startService_7() {
        QuickServer quickServer = new QuickServer();
        quickServer.setClientCommandHandler("org.quickserver.net.server.impl.BasicClientCommandHandler");
        quickServer.setClientObjectHandler("org.quickserver.net.server.impl.BasicClientObjectHandler");
        quickServer.setClientBinaryHandler("org.quickserver.net.server.impl.BasicClientBinaryHandler");
        quickServer.setClientWriteHandler("org.quickserver.net.server.impl.BasicClientWriteHandler");
        quickServer.setClientAuthenticationHandler("org.quickserver.net.server.impl.BasicClientAuthenticationHandler");
        quickServer.setClientData("org.quickserver.net.server.impl.BasicClientData");
        assertTrue(quickServer.startService());
    }

    /**
     * Tests that the service is started successfully.
     */
    @Test
    void startService_8() {
        QuickServer quickServer = new QuickServer();
        quickServer.setClientCommandHandler("org.quickserver.net.server.impl.BasicClientCommandHandler");
        quickServer.setClientObjectHandler("org.quickserver.net.server.impl.BasicClientObjectHandler");
        quickServer.setClientBinaryHandler("org.quickserver.net.server.impl.BasicClientBinaryHandler");
        quickServer.setClientWriteHandler("org.quickserver.net.server.impl.BasicClientWriteHandler");
        quickServer.setClientAuthenticationHandler("org.quickserver.net.server.impl.BasicClientAuthenticationHandler");
        quickServer.setClientData("org.quickserver.net.server.impl.BasicClientData");
        quickServer.setClientExtendedEventHandler("org.quickserver.net.server.impl.BasicClientExtendedEventHandler");
        assertTrue(quickServer.startService());
    }

    /**
     * Tests that the service is started successfully.
     */
    @Test
    void startService_9() {
        QuickServer quickServer = new QuickServer();
        quickServer.setClientCommandHandler("org.quickserver.net.server.impl.BasicClientCommandHandler");
        quickServer.setClientObjectHandler("org.quickserver.net.server.impl.BasicClientObjectHandler");
        quickServer.setClientBinaryHandler("org.quickserver.net.server.impl.BasicClientBinaryHandler");
        quickServer.setClientWriteHandler("org.quickserver.net.server.impl.BasicClientWriteHandler");
        quickServer.setClientAuthenticationHandler("org.quickserver.net.server.impl.BasicClientAuthenticationHandler");
        quickServer.setClientData("org.quickserver.net.server.impl.BasicClientData");
        quickServer.setClientExtendedEventHandler("org.quickserver.net.server.impl.BasicClientExtendedEventHandler");
        quickServer.setClientEventHandler("org.quickserver.net.server.impl.BasicClientEventHandler");
        assertTrue(quickServer.startService());
    }

    /**
     * Tests that the service is started successfully.
     */
    @Test
    void startService_10() {
        QuickServer quickServer = new QuickServer();
        quickServer.setClientCommandHandler("org.quickserver.net.server.impl.BasicClientCommandHandler");
        quickServer.setClientObjectHandler("org.quickserver.net.server.impl.BasicClientObjectHandler");
        quickServer.setClientBinaryHandler("org.quickserver.net.server.impl.BasicClientBinaryHandler");
        quickServer.setClientWriteHandler("org.quickserver.net.server.impl.BasicClientWriteHandler");
        quickServer.setClientAuthenticationHandler("org.quickserver.net.server.impl.BasicClientAuthenticationHandler");
        quickServer.setClientData("org.quickserver.net.server.impl.BasicClientData");
        quickServer.setClientExtendedEventHandler("org.quickserver.net.server.impl.BasicClientExtendedEventHandler");
        quickServer.setClientEventHandler("org.quickserver.net.server.impl.BasicClientEventHandler");
        quickServer.setClientDataMode(ClientDataMode.BINARY);
        assertTrue(quickServer.startService());
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
* It contains ten unit test cases for the {@link QuickServer#startService()} method.
*/
class QuickServer_6Test {
		
    /**
     * Tests that the service is started successfully.
     */
    @Test
    void startService_1() {
        QuickServer quickServer = new QuickServer();
        assertTrue(quickServer.startService());
    }

    /**
     * Tests that the service is started successfully.
     */
    @Test
    void startService_2() {
        QuickServer quickServer = new QuickServer();
        quickServer.setClientCommandHandler("org.quickserver.net.server.impl.BasicClientCommandHandler");
        assertTrue(quickServer.startService());