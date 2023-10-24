// QuickServer_3Test.java
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
* It contains ten unit test cases for the {@link QuickServer#initService(Object[])} method.
*/
class QuickServer_3Test {

    @Test
    void initService_1() {
        QuickServer quickServer = new QuickServer();
        Object[] param = new Object[1];
        param[0] = "QuickServer_3Test.xml";
        assertTrue(quickServer.initService(param));
    }

    @Test
    void initService_2() {
        QuickServer quickServer = new QuickServer();
        Object[] param = new Object[1];
        param[0] = "QuickServer_3Test_2.xml";
        assertTrue(quickServer.initService(param));
    }

    @Test
    void initService_3() {
        QuickServer quickServer = new QuickServer();
        Object[] param = new Object[1];
        param[0] = "QuickServer_3Test_3.xml";
        assertTrue(quickServer.initService(param));
    }

    @Test
    void initService_4() {
        QuickServer quickServer = new QuickServer();
        Object[] param = new Object[1];
        param[0] = "QuickServer_3Test_4.xml";
        assertTrue(quickServer.initService(param));
    }

    @Test
    void initService_5() {
        QuickServer quickServer = new QuickServer();
        Object[] param = new Object[1];
        param[0] = "QuickServer_3Test_5.xml";
        assertTrue(quickServer.initService(param));
    }

    @Test
    void initService_6() {
        QuickServer quickServer = new QuickServer();
        Object[] param = new Object[1];
        param[0] = "QuickServer_3Test_6.xml";
        assertTrue(quickServer.initService(param));
    }

    @Test
    void initService_7() {
        QuickServer quickServer = new QuickServer();
        Object[] param = new Object[1];
        param[0] = "QuickServer_3Test_7.xml";
        assertTrue(quickServer.initService(param));
    }

    @Test
    void initService_8() {
        QuickServer quickServer = new QuickServer();
        Object[] param = new Object[1];
        param[0] = "QuickServer_3Test_8.xml";
        assertTrue(quickServer.initService(param));
    }

    @Test
    void initService_9() {
        QuickServer quickServer = new QuickServer();
        Object[] param = new Object[1];
        param[0] = "QuickServer_3Test_9.xml";
        assertTrue(quickServer.initService(param));
    }

    @Test
    void initService_10() {
        QuickServer quickServer = new QuickServer();
        Object[] param = new Object[1];
        param[0] = "QuickServer_3Test_10.xml";
        assertTrue(quickServer.initService(param));
    }
}

// QuickServer_4Test.java
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
* It contains ten unit test cases for the {@link QuickServer#initService(Object[])} method.
*/
class QuickServer_4Test {
		
    @Test
    void initService_1() {
        QuickServer quickServer = new QuickServer();
        Object[] param = new Object[1];
        param[0] = "QuickServer_4Test.xml";
        assertTrue(quickServer.initService(param));
    }

    @Test
    void initService_2() {
        QuickServer quickServer = new QuickServer();
        Object[] param = new Object[1];
        param[0] = "QuickServer_4Test_2.xml";
        assertTrue(quickServer.initService(param));
    }

    @Test
    void initService_3() {
        QuickServer quickServer = new QuickServer();
        Object[] param = new Object[1];
        param[0] = "QuickServer_4Test_3.xml";
        assertTrue(quickServer.initService(param));
    }

    @Test
    void initService_4() {
        QuickServer quickServer = new QuickServer();
        Object[] param = new Object[1];
        param[0] = "QuickServer_4Test_4.xml";
        assertTrue(quickServer.initService(param));
    }

    @Test
    void initService_5() {
        QuickServer quickServer = new QuickServer();
        Object[] param = new Object[1];
        param[0] = "QuickServer_4Test_5.xml";
        assertTrue(quickServer.initService(param));
    }

    @Test
    void initService_6() {
        QuickServer quickServer = new QuickServer();
        Object[] param = new Object[1];
        param[0] = "QuickServer_4Test_6.xml";
        assertTrue(quickServer.initService(param));
    }

    @Test
    void initService_7() {
        QuickServer quickServer = new QuickServer();
        Object[] param = new Object[1];
        param[0] = "QuickServer_4Test_7.xml";
        assertTrue(quickServer.initService(param));
    }

    @Test
    void initService_8() {
        QuickServer quickServer = new QuickServer();
        Object[] param = new Object[1];
        param[0] = "QuickServer_4Test_8.xml";
        assertTrue(quickServer.initService(param));
    }

    @Test
    void initService_9() {
        QuickServer quickServer = new QuickServer();
        Object[] param = new Object[1];
        param[0] = "QuickServer_4Test_9.xml";
        assertTrue(quickServer.initService(param));
    }

    @Test
    void initService_10() {
        QuickServer quickServer = new QuickServer();
        Object[] param = new Object[1];
        param[0] = "QuickServer_4Test_10.xml";
        assertTrue(quickServer.initService(param));
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
* It contains ten unit test cases for the {@link QuickServer#initService(Object[])} method.
*/
class QuickServer_5Test {
		
    @Test
    void initService_1() {
        QuickServer quickServer = new QuickServer();
        Object[] param = new Object[1];
        param[0] = "QuickServer_5Test.xml";
        assertTrue(quickServer.initService(param));
    }

    @Test
    void initService_2() {
        QuickServer quickServer = new QuickServer();
        Object[] param = new Object[1];
        param