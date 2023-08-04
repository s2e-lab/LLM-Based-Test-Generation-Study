// QSAdminAPITest.java
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
class QSAdminAPITest {

    private static final Logger logger = Logger.getLogger(QSAdminAPITest.class.getName());

    private String username = "Admin";

    private String password = "<PASSWORD>";

    private String host = "localhost";

    private int port = 9877;

    private Socket socket;

    private InputStream in;

    private OutputStream out;

    private BufferedReader br;

    private BufferedWriter bw;

    @Test
    void testLogon() throws Exception {
        QSAdminAPI qsAdminApi = new QSAdminAPI(host, port);
        assertTrue(qsAdminApi.logon());
        qsAdminApi.logoff();
    }

    @Test
    void testLogonWithUsernameAndPassword() throws Exception {
        QSAdminAPI qsAdminApi = new QSAdminAPI(host, port);
        assertTrue(qsAdminApi.logon(username, password));
        qsAdminApi.logoff();
    }

    @Test
    void testLogonWithUsernameAndPasswordAndBadPassword() throws Exception {
        QSAdminAPI qsAdminApi = new QSAdminAPI(host, port);
        assertFalse(qsAdminApi.logon(username, "badPassword"));
        qsAdminApi.logoff();
    }

    @Test
    void testLogonWithUsernameAndPasswordAndBadUsername() throws Exception {
        QSAdminAPI qsAdminApi = new QSAdminAPI(host, port);
        assertFalse(qsAdminApi.logon("badUsername", password));
        qsAdminApi.logoff();
    }

    @Test
    void testLogonWithUsernameAndPasswordAndBadUsernameAndPassword() throws Exception {
        QSAdminAPI qsAdminApi = new QSAdminAPI(host, port);
        assertFalse(qsAdminApi.logon("badUsername", "badPassword"));
        qsAdminApi.logoff();
    }

    @Test
    void testLogonWithBadHost() throws Exception {
        QSAdminAPI qsAdminApi = new QSAdminAPI("badHost", port);
        assertFalse(qsAdminApi.logon());
        qsAdminApi.logoff();
    }

    @Test
    void testLogonWithBadPort() throws Exception {
        QSAdminAPI qsAdminApi = new QSAdminAPI(host, 9999);
        assertFalse(qsAdminApi.logon());
        qsAdminApi.logoff();
    }

    @Test
    void testLogonWithBadHostAndBadPort() throws Exception {
        QSAdminAPI qsAdminApi = new QSAdminAPI("badHost", 9999);
        assertFalse(qsAdminApi.logon());
        qsAdminApi.logoff();
    }

    @Test
    void testLogonWithBadHostAndBadPortAndBadUsernameAndPassword() throws Exception {
        QSAdminAPI qsAdminApi = new QSAdminAPI("badHost", 9999);
        assertFalse(qsAdminApi.logon("badUsername", "badPassword"));
        qsAdminApi.logoff();
    }

    @Test
    void testLogonWithBadHostAndBadPortAndBadUsername() throws Exception {
        QSAdminAPI qsAdminApi = new QSAdminAPI("badHost", 9999);
        assertFalse(qsAdminApi.logon("badUsername", password));
        qsAdminApi.logoff();
    }

    @Test
    void testLogonWithBadHostAndBadPortAndBadPassword() throws Exception {
        QSAdminAPI qsAdminApi = new QSAdminAPI("badHost", 9999);
        assertFalse(qsAdminApi.logon(username, "badPassword"));
        qsAdminApi.logoff();
    }

    @Test
    void testLogonWithBadHostAndBadPortAndBadUsernameAndPassword() throws Exception {
        QSAdminAPI qsAdminApi = new QSAdminAPI("badHost", 9999);
        assertFalse(qsAdminApi.logon("badUsername", "badPassword"));
        qsAdminApi.logoff();
    }

    @Test
    void testLogonWithBadHostAndBadPortAndBadUsernameAndPasswordAndBadPassword() throws Exception {
        QSAdminAPI qsAdminApi = new QSAdminAPI("badHost", 9999);
        assertFalse(qsAdminApi.logon("badUsername", "badPassword"));
        qsAdminApi.logoff();
    }

    @Test
    void testLogonWithBadHostAndBadPortAndBadUsernameAndPasswordAndBadUsername() throws Exception {
        QSAdminAPI qsAdminApi = new QSAdminAPI("badHost", 9999);
        assertFalse(qsAdminApi.logon("badUsername", "badPassword"));
        qsAdminApi.logoff();
    }

    @Test
    void testLogonWithBadHostAndBadPortAndBadUsernameAndPasswordAndBadUsernameAndPassword() throws Exception {
        QSAdminAPI qsAdminApi = new QSAdminAPI("badHost", 9999);
        assertFalse(qsAdminApi.logon("badUsername", "badPassword"));
        qsAdminApi.logoff();
    }

    @Test
    void testLogonWithBadHostAndBadPortAndBadUsernameAndPasswordAndBadUsernameAndPasswordAndBadPassword() throws Exception {
        QSAdminAPI qsAdminApi = new QSAdminAPI("badHost", 9999);
        assertFalse(qsAdminApi.logon("badUsername", "badPassword"));
        qsAdminApi.logoff();
    }

    @Test
    void testLogonWithBadHostAndBadPortAndBadUsernameAndPasswordAndBadUsernameAndPasswordAndBadPasswordAndBadUsername() throws Exception {
        QSAdminAPI qsAdminApi = new QSAdminAPI("badHost", 9999);
        assertFalse(qsAdminApi.logon("badUsername", "badPassword"));
        qsAdminApi.logoff();
    }

    @Test
    void testLogonWithBadHostAndBadPortAndBadUsernameAndPasswordAndBadUsernameAndPasswordAndBadPasswordAndBadUsernameAndPassword() throws Exception {
        QSAdminAPI qsAdminApi = new QSAdminAPI("badHost", 9999);
        assertFalse(qsAdminApi.logon("badUsername", "badPassword"));
        qsAdminApi.logoff();
    }

    @Test
    void testLogonWithBadHostAndBadPortAndBadUsernameAndPasswordAndBadUsernameAndPasswordAndBadPasswordAndBadUsernameAndPasswordAndBadPassword() throws Exception {
        QSAdminAPI qsAdminApi = new QSAdminAPI("badHost", 9999);
        assertFalse(qsAdminApi.logon("badUsername", "badPassword"));
        qsAdminApi.logoff();
    }

    @Test
    void testLogonWithBadHostAndBadPortAndBadUsernameAndPasswordAndBadUsernameAndPasswordAndBadPasswordAndBadUsernameAndPasswordAndBadPasswordAndBadUsername() throws Exception {
        QSAdminAPI qsAdminApi = new QSAdminAPI("badHost", 9999);
        assertFalse(qsAdminApi.logon("badUsername", "badPassword"));
        qsAdminApi.logoff();
    }

    @Test
    void testLogonWithBadHostAndBadPortAndBadUsernameAndPasswordAndBadUsernameAndPasswordAndBadPasswordAndBadUsernameAndPasswordAndBadPasswordAndBadUsernameAndPassword() throws Exception {
        QSAdminAPI qsAdminApi = new QSAdminAPI("badHost", 9999);
        assertFalse(qsAdminApi.logon("badUsername", "badPassword"));
        qsAdminApi.logoff();
    }

    @Test
    void testLogonWithBadHostAndBadPortAndBadUsernameAndPasswordAndBadUsernameAndPasswordAndBadPasswordAndBadUsernameAndPasswordAndBadPasswordAndBadUsernameAndPasswordAndBadPassword() throws Exception {
        QSAdminAPI qsAdminApi = new QSAdminAPI("badHost", 9999);
        assertFalse(qsAdminApi.logon("badUsername", "badPassword"));
        qsAdminApi.logoff();
    }

    @Test
    void testLogonWithBadHostAndBadPortAndBadUsernameAndPasswordAndBadUsernameAndPasswordAndBadPasswordAndBadUsernameAndPasswordAndBadPasswordAndBadUsernameAndPasswordAndBadPasswordAndBadUsername() throws Exception {
        QSAdminAPI qsAdminApi = new QSAdminAPI("badHost", 9999);
        assertFalse(qsAdminApi.logon("badUsername", "badPassword"));
        qsAdminApi.logoff();
    }

    @Test
    void testLogonWithBadHostAndBadPortAndBadUsernameAndPasswordAndBadUsernameAndPasswordAndBadPasswordAndBadUsernameAndPasswordAndBadPasswordAndBadUsernameAndPasswordAndBadPasswordAndBadUsernameAndPassword() throws Exception {
        QSAdminAPI qsAdminApi = new QSAdminAPI("badHost", 9999);
        assertFalse(qsAdminApi.logon("badUsername", "badPassword"));
        qsAdminApi.logoff();
    }

    @Test
    void testLogonWithBadHostAndBadPortAndBadUsernameAndPasswordAndBadUsernameAndPasswordAndBadPasswordAndBadUsernameAndPasswordAndBadPasswordAndBadUsernameAndPasswordAndBadPasswordAndBadUsernameAndPasswordAndBadPassword() throws Exception {
        QSAdminAPI qsAdminApi = new QSAdminAPI("badHost", 9999);
        assertFalse(qsAdmin