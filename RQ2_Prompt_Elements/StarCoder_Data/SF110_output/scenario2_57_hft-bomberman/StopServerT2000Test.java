// StopServerTest.java
package server;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import messages.Message;
import messages.global.StopServerMsg;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StopServer}.
* It contains ten unit test cases for the {@link StopServer#connectToSrv()} method.
*/
class StopServerTest {

    /**
     * The name of the Server.
     */
    private static final String serverName = "localhost";

    /**
     * The port of the Server.
     */
    private static final int serverPort = 5000;

    /**
     * The Socket of the Server.
     */
    private Socket server;

    /**
     * The ObjectOutputStream of the Server.
     */
    private ObjectOutputStream out;

    /**
     * Test case for the {@link StopServer#connectToSrv()} method.
     * It tests if the method returns true, when the connection to the Server is established.
     */
    @Test
    void testConnectToSrv() {
        StopServer stopServer = new StopServer();
        assertTrue(stopServer.connectToSrv());
    }

    /**
     * Test case for the {@link StopServer#connectToSrv()} method.
     * It tests if the method returns false, when the connection to the Server is not established.
     */
    @Test
    void testConnectToSrv2() {
        StopServer stopServer = new StopServer();
        stopServer.serverName = "127.0.0.1";
        assertFalse(stopServer.connectToSrv());
    }

    /**
     * Test case for the {@link StopServer#connectToSrv()} method.
     * It tests if the method returns false, when the connection to the Server is not established.
     */
    @Test
    void testConnectToSrv3() {
        StopServer stopServer = new StopServer();
        stopServer.serverPort = 12345;
        assertFalse(stopServer.connectToSrv());
    }

    /**
     * Test case for the {@link StopServer#connectToSrv()} method.
     * It tests if the method returns false, when the connection to the Server is not established.
     */
    @Test
    void testConnectToSrv4() {
        StopServer stopServer = new StopServer();
        stopServer.serverName = "127.0.0.1";
        stopServer.serverPort = 12345;
        assertFalse(stopServer.connectToSrv());
    }

    /**
     * Test case for the {@link StopServer#connectToSrv()} method.
     * It tests if the method returns false, when the connection to the Server is not established.
     */
    @Test
    void testConnectToSrv5() {
        StopServer stopServer = new StopServer();
        stopServer.serverName = "127.0.0.1";
        stopServer.serverPort = 12345;
        assertFalse(stopServer.connectToSrv());
    }

    /**
     * Test case for the {@link StopServer#connectToSrv()} method.
     * It tests if the method returns false, when the connection to the Server is not established.
     */
    @Test
    void testConnectToSrv6() {
        StopServer stopServer = new StopServer();
        stopServer.serverName = "127.0.0.1";
        stopServer.serverPort = 12345;
        assertFalse(stopServer.connectToSrv());
    }

    /**
     * Test case for the {@link StopServer#connectToSrv()} method.
     * It tests if the method returns false, when the connection to the Server is not established.
     */
    @Test
    void testConnectToSrv7() {
        StopServer stopServer = new StopServer();
        stopServer.serverName = "127.0.0.1";
        stopServer.serverPort = 12345;
        assertFalse(stopServer.connectToSrv());
    }

    /**
     * Test case for the {@link StopServer#connectToSrv()} method.
     * It tests if the method returns false, when the connection to the Server is not established.
     */
    @Test
    void testConnectToSrv8() {
        StopServer stopServer = new StopServer();
        stopServer.serverName = "127.0.0.1";
        stopServer.serverPort = 12345;
        assertFalse(stopServer.connectToSrv());
    }

    /**
     * Test case for the {@link StopServer#connectToSrv()} method.
     * It tests if the method returns false, when the connection to the Server is not established.
     */
    @Test
    void testConnectToSrv9() {
        StopServer stopServer = new StopServer();
        stopServer.serverName = "127.0.0.1";
        stopServer.serverPort = 12345;
        assertFalse(stopServer.connectToSrv());
    }

    /**
     * Test case for the {@link StopServer#connectToSrv()} method.
     * It tests if the method returns false, when the connection to the Server is not established.
     */
    @Test
    void testConnectToSrv10() {
        StopServer stopServer = new StopServer();
        stopServer.serverName = "127.0.0.1";
        stopServer.serverPort = 12345;
        assertFalse(stopServer.connectToSrv());
    }
}
