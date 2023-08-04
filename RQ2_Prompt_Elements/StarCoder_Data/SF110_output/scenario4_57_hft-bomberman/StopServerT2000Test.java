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
     * Test of {@link StopServer#connectToSrv()}
     *
     * @throws IOException
     */
    @Test
    void testConnectToSrv() throws IOException {
        StopServer stop = new StopServer();
        stop.connectToSrv();
        assertTrue(stop.server.isConnected());
    }

    /**
     * Test of {@link StopServer#connectToSrv()}
     *
     * @throws IOException
     */
    @Test
    void testConnectToSrv2() throws IOException {
        StopServer stop = new StopServer();
        stop.connectToSrv();
        assertTrue(stop.server.isConnected());
    }

    /**
     * Test of {@link StopServer#connectToSrv()}
     *
     * @throws IOException
     */
    @Test
    void testConnectToSrv3() throws IOException {
        StopServer stop = new StopServer();
        stop.connectToSrv();
        assertTrue(stop.server.isConnected());
    }

    /**
     * Test of {@link StopServer#connectToSrv()}
     *
     * @throws IOException
     */
    @Test
    void testConnectToSrv4() throws IOException {
        StopServer stop = new StopServer();
        stop.connectToSrv();
        assertTrue(stop.server.isConnected());
    }

    /**
     * Test of {@link StopServer#connectToSrv()}
     *
     * @throws IOException
     */
    @Test
    void testConnectToSrv5() throws IOException {
        StopServer stop = new StopServer();
        stop.connectToSrv();
        assertTrue(stop.server.isConnected());
    }

    /**
     * Test of {@link StopServer#connectToSrv()}
     *
     * @throws IOException
     */
    @Test
    void testConnectToSrv6() throws IOException {
        StopServer stop = new StopServer();
        stop.connectToSrv();
        assertTrue(stop.server.isConnected());
    }

    /**
     * Test of {@link StopServer#connectToSrv()}
     *
     * @throws IOException
     */
    @Test
    void testConnectToSrv7() throws IOException {
        StopServer stop = new StopServer();
        stop.connectToSrv();
        assertTrue(stop.server.isConnected());
    }

    /**
     * Test of {@link StopServer#connectToSrv()}
     *
     * @throws IOException
     */
    @Test
    void testConnectToSrv8() throws IOException {
        StopServer stop = new StopServer();
        stop.connectToSrv();
        assertTrue(stop.server.isConnected());
    }

    /**
     * Test of {@link StopServer#connectToSrv()}
     *
     * @throws IOException
     */
    @Test
    void testConnectToSrv9() throws IOException {
        StopServer stop = new StopServer();
        stop.connectToSrv();
        assertTrue(stop.server.isConnected());
    }

    /**
     * Test of {@link StopServer#connectToSrv()}
     *
     * @throws IOException
     */
    @Test
    void testConnectToSrv10() throws IOException {
        StopServer stop = new StopServer();
        stop.connectToSrv();
        assertTrue(stop.server.isConnected());
    }
}
