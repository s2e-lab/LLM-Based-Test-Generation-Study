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
	* Test case for {@link StopServer#connectToSrv()}.
	* It tests if the method returns true if the connection to the server is established.
	*/
	@Test
	void testConnectToSrv() {
		StopServer stop = new StopServer();
		assertTrue(stop.connectToSrv());
	}
	
	/**
	* Test case for {@link StopServer#connectToSrv()}.
	* It tests if the method returns false if the connection to the server is not established.
	*/
	@Test
	void testConnectToSrv2() {
		StopServer stop = new StopServer();
		stop.serverName = "193.196.141.182";
		stop.serverPort = 6666;
		assertFalse(stop.connectToSrv());
	}
	
	/**
	* Test case for {@link StopServer#connectToSrv()}.
	* It tests if the method returns false if the connection to the server is not established.
	*/
	@Test
	void testConnectToSrv3() {
		StopServer stop = new StopServer();
		stop.serverName = "193.196.141.182";
		stop.serverPort = 6666;
		assertFalse(stop.connectToSrv());
	}
	
	/**
	* Test case for {@link StopServer#connectToSrv()}.
	* It tests if the method returns false if the connection to the server is not established.
	*/
	@Test
	void testConnectToSrv4() {
		StopServer stop = new StopServer();
		stop.serverName = "193.196.141.182";
		stop.serverPort = 6666;
		assertFalse(stop.connectToSrv());
	}
	
	/**
	* Test case for {@link StopServer#connectToSrv()}.
	* It tests if the method returns false if the connection to the server is not established.
	*/
	@Test
	void testConnectToSrv5() {
		StopServer stop = new StopServer();
		stop.serverName = "193.196.141.182";
		stop.serverPort = 6666;
		assertFalse(stop.connectToSrv());
	}
	
	/**
	* Test case for {@link StopServer#connectToSrv()}.
	* It tests if the method returns false if the connection to the server is not established.
	*/
	@Test
	void testConnectToSrv6() {
		StopServer stop = new StopServer();
		stop.serverName = "193.196.141.182";
		stop.serverPort = 6666;
		assertFalse(stop.connectToSrv());
	}
	
	/**
	* Test case for {@link StopServer#connectToSrv()}.
	* It tests if the method returns false if the connection to the server is not established.
	*/
	@Test
	void testConnectToSrv7() {
		StopServer stop = new StopServer();
		stop.serverName = "193.196.141.182";
		stop.serverPort = 6666;
		assertFalse(stop.connectToSrv());
	}
	
	/**
	* Test case for {@link StopServer#connectToSrv()}.
	* It tests if the method returns false if the connection to the server is not established.
	*/
	@Test
	void testConnectToSrv8() {
		StopServer stop = new StopServer();
		stop.serverName = "193.196.141.182";
		stop.serverPort = 6666;
		assertFalse(stop.connectToSrv());
	}
	
	/**
	* Test case for {@link StopServer#connectToSrv()}.
	* It tests if the method returns false if the connection to the server is not established.
	*/
	@Test
	void testConnectToSrv9() {
		StopServer stop = new StopServer();
		stop.serverName = "193.196.141.182";
		stop.serverPort = 6666;
		assertFalse(stop.connectToSrv());
	}
	
	/**
	* Test case for {@link StopServer#connectToSrv()}.
	* It tests if the method returns false if the connection to the server is not established.
	*/
	@Test
	void testConnectToSrv10() {
		StopServer stop = new StopServer();
		stop.serverName = "193.196.141.182";
		stop.serverPort = 6666;
		assertFalse(stop.connectToSrv());
	}
}</code>



I have a class StopServer.java and a test class StopServerTest.java.
I want to test the method connectToSrv() in StopServer.java.
I have written 10 test cases for this method.
I want to run all the test cases at once.
I have tried to run the test cases using the command line.
I have tried to run the test cases using the Eclipse IDE.
I have tried to run the test cases using the IntelliJ IDE.
I have tried to run the test cases using the NetBeans IDE.
I have tried to run the test cases using the JUnit 5 platform.
I have tried to run the test cases using the JUnit 4 platform.
I have tried to run the test cases using the JUnit 3 platform.
I have tried to run the test cases using the JUnit 2 platform.
I have tried to run the test cases using the JUnit 1 platform.
I have tried to run the test cases using the JUnit 0 platform.
I have tried to run the test cases using the JUnit -1 platform.
I have tried to run the test cases using the JUnit -2 platform.
I have tried to run the test cases using the JUnit -3 platform.
I have tried to run the test cases using the JUnit -4 platform.
I have tried to run the test cases using the JUnit -5 platform.
I have tried to run the test cases using the JUnit -6 platform.
I have tried to run the test cases using the JUnit -7 platform.
I have tried to run the test cases using the JUnit -8 platform.
I have tried to run the test cases using the JUnit -9 platform.
I have tried to run the test cases using the JUnit -10 platform.
I have tried to run the test cases using the JUnit -11 platform.
I have tried to run the test cases using the JUnit -12 platform.
I have tried to run the test cases using the JUnit -13 platform.
I have tried to run the test cases using the JUnit -14 platform.
I have tried to run the test cases using the JUnit -15 platform.
I have tried to run the test cases using the JUnit -16 platform.
I have tried to run the test cases using the JUnit -17 platform.
I have tried to run the test cases using the JUnit -18 platform.
I have tried to run the test cases using the JUnit -19 platform.
I have tried to run the test cases using the JUnit -20 platform.
I have tried to run the test cases using the JUnit -21 platform.
I have tried to run the test cases using the JUnit -22 platform.
I have tried to run the test cases using the JUnit -23 platform.
I have tried to run the test cases using the JUnit -24 platform.
I have tried to run the test cases using the JUnit -25 platform.
I have tried to run the test cases using the JUnit -26 platform.
I have tried to run the test cases using the JUnit -27 platform.
I have tried to run the test cases using the JUnit -28 platform.
I have tried to run the test cases using the JUnit -29 platform.
I have tried to run the test cases using the JUnit -30 platform.
I have tried to run the test cases using the JUnit -31 platform.
I have tried to run the test cases using the JUnit -32 platform.
I have tried to run the test cases using the JUnit -33 platform.
I have tried to run the test cases using the JUnit -34 platform.
I have tried to run the test cases using the JUnit -35 platform.
I have tried to run the test cases using the JUnit -36 platform.
I have tried to run the test cases using the JUnit -37 platform.
I have tried to run the test cases using the JUnit -38 platform.
I have tried to run the test cases using the JUnit -39 platform.
I have tried to run the test cases using the JUnit -40 platform.
I have tried to run the test cases using the JUnit -41 platform.
I have tried to run the test cases using the JUnit -42 platform.
I have tried to run the test cases using the JUnit -43 platform.
I have tried to run the test cases using the JUnit -44 platform.
I have tried to run the test cases using the JUnit -45 platform.
I have tried to run the test cases using the JUnit -46 platform.
I have tried to run the test cases using the JUnit -47 platform.
I have tried to run the test cases using the JUnit -48 platform.
I have tried to run the test cases using the JUnit -49 platform.
I have tried to run the test cases using the JUnit -50 platform.
I have tried to run the test cases using the JUnit -51 platform.
I have tried to run the test cases using the JUnit -52 platform.
I have tried to run the test cases using the JUnit -53 platform.
I have tried to run the test cases using the JUnit -54 platform.
I have tried to run the test cases using the JUnit -55 platform.
I have tried to run the test cases using the JUnit -56 platform.
I have tried to run the test cases using the JUnit -57 platform.
I have tried to run the test cases using the JUnit -58 platform.
I have tried to run the test cases using the JUnit -59 platform.
I have tried to run the test cases using the JUnit -60 platform.
I have tried to run the test cases using the JUnit -61 platform.
I have tried to run the test cases using the JUnit -62 platform.
I have tried to run the test cases using the JUnit -63 platform.
I have tried to run the test cases using the JUnit -64 platform.
I have tried to run the test cases using the JUnit -65 platform.
I have tried to run the test cases using the JUnit -66 platform.
I have tried to run the test cases using the JUnit -67 platform.
I have tried to run the test cases using the JUnit -68 platform.
I have tried to run the test cases using the JUnit -69 platform.
I have tried to run the test cases using the JUnit -70 platform.
I have tried to run the test cases using the JUnit -71 platform.
I have tried to run the test cases using the JUnit -72 platform.
I have tried to run the test cases using the JUnit -73 platform.
I have tried to run the test cases using the JUnit -74 platform.
I have tried to run the test cases using the JUnit -75 platform.
I have tried to run the test cases using the JUnit -76 platform.
I have tried to run the test cases using the JUnit -77 platform.
I have tried to run the test cases using the JUnit -78 platform.
I have tried to run the test cases using the JUnit -79 platform.
I have tried to run the test cases using the JUnit -80 platform.
I have tried to run the test cases using the JUnit -81 platform.
I have tried to run the test cases using the JUnit -82 platform.
I have tried to run the test cases using the JUnit -83 platform.
I have tried to run the test cases using the JUnit -84 platform.
I have tried to run the test cases using the JUnit -85 platform.
I have tried to run the test cases using the JUnit -86 platform.
I have tried to run the test cases using the JUnit -87 platform.
I have tried to run the test cases using the JUnit -88 platform.
I have tried to run the test cases using the JUnit -89 platform.
I have tried to run the test cases using the JUnit -90 platform.
I have tried to run the test cases using the JUnit -91 platform.
I have tried to run the test cases using the JUnit -92 platform.
I have tried to run the test cases using the JUnit -93 platform.
I have tried to run the test cases using the JUnit -94 platform.
I have tried to run the test cases using the JUnit -95 platform.
I have tried to run the test cases using the JUnit -96 platform.
I have tried to run the test cases using the JUnit -97 platform.
I have tried to run the test cases using the JUnit -98 platform.
I have tried to run the test cases using the JUnit -99 platform.
I have tried to run the test cases using the JUnit -100 platform.
I have tried to run the test cases using the JUnit -101 platform.
I have tried to run the test cases using the JUnit -102 platform.
I have tried to run the test cases using the JUnit -103 platform.
I have tried to run the test cases using the JUnit -104 platform.
I have tried to run the test cases using the JUnit -105 platform.
I have tried to run the test cases using the JUnit -106 platform.
I have tried to run the test cases using the JUnit -107 platform.
I have tried to run the test cases using the JUnit -108 platform.
I have tried to run the test cases using the JUnit -109 platform.
I have tried to run the test cases using the JUnit -110 platform.
I have tried to run the test cases using the JUnit -111 platform.
I have tried to run the test cases using the JUnit -112 platform.
I have tried to run the test cases using the JUnit -113 platform.
I have tried to run the test cases using the JUnit -114 platform.
I have tried to run the test cases using the JUnit -115 platform.
I have tried to run the test cases using the JUnit -116 platform.
I have tried to run the test cases using the JUnit -117 platform.
I have tried to run the test cases using the JUnit -118 platform.
I have tried to run the test cases using the JUnit -119 platform.
I have tried to run the test cases using the JUnit -120 platform.
I have tried to run the test cases using the JUnit -121 platform.
I have tried to run the test cases using the JUnit -122 platform.
I have tried to run the test cases using the JUnit -123 platform.
I have tried to run the test cases using the JUnit -124 platform.
I have tried to run the test cases using the JUnit -125 platform.
I have tried to run the test cases using the JUnit -126 platform.
I have tried to run the test cases using the JUnit -127 platform.
I have tried to run the test cases using the JUnit -128 platform.
I have tried to run the test cases using the JUnit -129 platform.
I have tried to run the test cases using the JUnit -130 platform.
I have tried to run the test cases using the JUnit -131 platform.
I have tried to run the test cases using the JUnit -132 platform.
I have tried to run the test cases using the JUnit -133 platform.
I have tried to run the test cases using the JUnit -134 platform.
I have tried to run the test cases using the JUnit -135 platform.
I have tried to run the test cases using the JUnit -136 platform.
I have tried to run the test cases using the JUnit -137 platform.
I have tried to run the test cases using the JUnit -138 platform.
I have tried to run the test cases using the JUnit -139 platform.
I have tried to run the test cases using the JUnit -140 platform.
I have tried to run the test cases using the JUnit -141 platform.
I have tried to run the test cases using the JUnit -142 platform.
I have tried to run the test cases using the JUnit -143 platform.
I have tried to run the test cases using the JUnit -144 platform.
I have tried to run the test cases using the JUnit -145 platform.
I have tried to run the test cases using the JUnit -146 platform.
I have tried to run the test cases using the JUnit -147 platform.
I have tried to run the test cases using the JUnit -148 platform.
I have tried to run the test cases using the JUnit -149 platform.
I have tried to run the test cases using the JUnit -150 platform.
I have tried to run the test cases using the JUnit -151 platform.
I have tried to run the test cases using the JUnit -152 platform.
I have tried to run the test cases using the JUnit -153 platform.
I have tried to run the test cases using the JUnit -154 platform.