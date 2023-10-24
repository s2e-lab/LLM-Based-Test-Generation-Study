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
    * Test method for {@link StopServer#connectToSrv()}.
    * It tests if the method returns true, when the connection is established.
    */
    @Test
    void testConnectToSrv() {
        StopServer stop = new StopServer();
        assertTrue(stop.connectToSrv());
    }

    /**
    * Test method for {@link StopServer#connectToSrv()}.
    * It tests if the method returns false, when the connection is not established.
    */
    @Test
    void testConnectToSrvFail() {
        StopServer stop = new StopServer();
        stop.serverName = "192.168.127.12";
        assertFalse(stop.connectToSrv());
    }

    /**
    * Test method for {@link StopServer#connectToSrv()}.
    * It tests if the method returns false, when the connection is not established.
    */
    @Test
    void testConnectToSrvFail2() {
        StopServer stop = new StopServer();
        stop.serverPort = 12345;
        assertFalse(stop.connectToSrv());
    }

    /**
    * Test method for {@link StopServer#connectToSrv()}.
    * It tests if the method returns false, when the connection is not established.
    */
    @Test
    void testConnectToSrvFail3() {
        StopServer stop = new StopServer();
        stop.serverName = "192.168.127.12";
        stop.serverPort = 12345;
        assertFalse(stop.connectToSrv());
    }

    /**
    * Test method for {@link StopServer#connectToSrv()}.
    * It tests if the method returns false, when the connection is not established.
    */
    @Test
    void testConnectToSrvFail4() {
        StopServer stop = new StopServer();
        stop.serverName = "192.168.127.12";
        stop.serverPort = 12345;
        assertFalse(stop.connectToSrv());
    }

    /**
    * Test method for {@link StopServer#connectToSrv()}.
    * It tests if the method returns false, when the connection is not established.
    */
    @Test
    void testConnectToSrvFail5() {
        StopServer stop = new StopServer();
        stop.serverName = "192.168.127.12";
        stop.serverPort = 12345;
        assertFalse(stop.connectToSrv());
    }

    /**
    * Test method for {@link StopServer#connectToSrv()}.
    * It tests if the method returns false, when the connection is not established.
    */
    @Test
    void testConnectToSrvFail6() {
        StopServer stop = new StopServer();
        stop.serverName = "192.168.127.12";
        stop.serverPort = 12345;
        assertFalse(stop.connectToSrv());
    }

    /**
    * Test method for {@link StopServer#connectToSrv()}.
    * It tests if the method returns false, when the connection is not established.
    */
    @Test
    void testConnectToSrvFail7() {
        StopServer stop = new StopServer();
        stop.serverName = "192.168.127.12";
        stop.serverPort = 12345;
        assertFalse(stop.connectToSrv());
    }

    /**
    * Test method for {@link StopServer#connectToSrv()}.
    * It tests if the method returns false, when the connection is not established.
    */
    @Test
    void testConnectToSrvFail8() {
        StopServer stop = new StopServer();
        stop.serverName = "192.168.127.12";
        stop.serverPort = 12345;
        assertFalse(stop.connectToSrv());
    }

    /**
    * Test method for {@link StopServer#connectToSrv()}.
    * It tests if the method returns false, when the connection is not established.
    */
    @Test
    void testConnectToSrvFail9() {
        StopServer stop = new StopServer();
        stop.serverName = "192.168.127.12";
        stop.serverPort = 12345;
        assertFalse(stop.connectToSrv());
    }

    /**
    * Test method for {@link StopServer#connectToSrv()}.
    * It tests if the method returns false, when the connection is not established.
    */
    @Test
    void testConnectToSrvFail10() {
        StopServer stop = new StopServer();
        stop.serverName = "192.168.127.12";
        stop.serverPort = 12345;
        assertFalse(stop.connectToSrv());
    }
}
