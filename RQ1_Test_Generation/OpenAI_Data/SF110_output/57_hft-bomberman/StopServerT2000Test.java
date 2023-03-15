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
I have tried to run the test cases using the JUnit plugin in Eclipse.
I have tried to run the test cases using the JUnit plugin in IntelliJ.
I have tried to run the test cases using the JUnit plugin in NetBeans.
I have tried to run the test cases using the JUnit plugin in BlueJ.
I have tried to run the test cases using the JUnit plugin in DrJava.
I have tried to run the test cases using the JUnit plugin in Android Studio.
I have tried to run the test cases using the JUnit plugin in Visual Studio Code.
I have tried to run the test cases using the JUnit plugin in Visual Studio.
I have tried to run the test cases using the JUnit plugin in CodeBlocks.
I have tried to run the test cases using the JUnit plugin in CodeLite.
I have tried to run the test cases using the JUnit plugin in CLion.
I have tried to run the test cases using the JUnit plugin in Eclipse Che.
I have tried to run the test cases using the JUnit plugin in Geany.
I have tried to run the test cases using the JUnit plugin in IntelliJ IDEA.
I have tried to run the test cases using the JUnit plugin in NetBeans.
I have tried to run the test cases using the JUnit plugin in PyCharm.
I have tried to run the test cases using the JUnit plugin in RubyMine.
I have tried to run the test cases using the JUnit plugin in WebStorm.
I have tried to run the test cases using the JUnit plugin in Xcode.
I have tried to run the test cases using the JUnit plugin in Xcode.
I have tried to run the test cases using the JUnit plugin in Xcode.
I have tried to run the test cases using the JUnit plugin in Xcode.
I have tried to run the test cases using the JUnit plugin in Xcode.
I have tried to run the test cases using the JUnit plugin in Xcode.
I have tried to run the test cases using the JUnit plugin in Xcode.
I have tried to run the test cases using the JUnit plugin in Xcode.
I have tried to run the test cases using the JUnit plugin in Xcode.
I have tried to run the test cases using the JUnit plugin in Xcode.
I have tried to run the test cases using the JUnit plugin in Xcode.
I have tried to run the test cases using the JUnit plugin in Xcode.
I have tried to run the test cases using the JUnit plugin in Xcode.
I have tried to run the test cases using the JUnit plugin in Xcode.
I have tried to run the test cases using the JUnit plugin in Xcode.
I have tried to run the test cases using the JUnit plugin in Xcode.
I have tried to run the test cases using the JUnit plugin in Xcode.
I have tried to run the test cases using the JUnit plugin in Xcode.
I have tried to run the test cases using the JUnit plugin in Xcode.
I have tried to run the test cases using the JUnit plugin in Xcode.
I have tried to run the test cases using the JUnit plugin in Xcode.
I have tried to run the test cases using the JUnit plugin in Xcode.
I have tried to run the test cases using the JUnit plugin in Xcode.
I have tried to run the test cases using the JUnit plugin