// SSHPropertyHandlerTest.java
package mindbright.ssh;

import java.awt.Frame;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SSHPropertyHandler}.
* It contains ten unit test cases for the {@link SSHPropertyHandler#hasBinay()} method.
*/
class SSHPropertyHandlerTest {

		/**
		* Test case 1 for {@link SSHPropertyHandler#hasBinay()} method.
		* It tests the method with the following input:
		* <ul>
		* <li>remoteServer = "localhost"</li>
		* <li>remotePort = 21</li>
		* <li>remoteUser = "test"</li>
		* <li>remotePassword = "123456"</li>
		* <li>sshHomeDir = "/"</li>
		* <li>parent = null</li>
		* <li>hasBinay = true</li>
		* </ul>
		* The expected result is true.
		*/
		@Test
		void testHasBinay1() {
			SSHPropertyHandler sshPropertyHandler = new SSHPropertyHandler();
			sshPropertyHandler.setRemoteServer("localhost");
			sshPropertyHandler.setRemotePort(21);
			sshPropertyHandler.setRemoteUser("test");
			sshPropertyHandler.setRemotePassword("123456");
			sshPropertyHandler.setSshHomeDir("/");
			sshPropertyHandler.setParent(null);
			sshPropertyHandler.setHasBinay(true);
			assertTrue(sshPropertyHandler.hasBinay());
		}
		
		/**
		* Test case 2 for {@link SSHPropertyHandler#hasBinay()} method.
		* It tests the method with the following input:
		* <ul>
		* <li>remoteServer = "localhost"</li>
		* <li>remotePort = 21</li>
		* <li>remoteUser = "test"</li>
		* <li>remotePassword = "123456"</li>
		* <li>sshHomeDir = "/"</li>
		* <li>parent = null</li>
		* <li>hasBinay = false</li>
		* </ul>
		* The expected result is false.
		*/
		@Test
		void testHasBinay2() {
			SSHPropertyHandler sshPropertyHandler = new SSHPropertyHandler();
			sshPropertyHandler.setRemoteServer("localhost");
			sshPropertyHandler.setRemotePort(21);
			sshPropertyHandler.setRemoteUser("test");
			sshPropertyHandler.setRemotePassword("123456");
			sshPropertyHandler.setSshHomeDir("/");
			sshPropertyHandler.setParent(null);
			sshPropertyHandler.setHasBinay(false);
			assertFalse(sshPropertyHandler.hasBinay());
		}
		
		/**
		* Test case 3 for {@link SSHPropertyHandler#hasBinay()} method.
		* It tests the method with the following input:
		* <ul>
		* <li>remoteServer = "localhost"</li>
		* <li>remotePort = 21</li>
		* <li>remoteUser = "test"</li>
		* <li>remotePassword = "123456"</li>
		* <li>sshHomeDir = "/"</li>
		* <li>parent = null</li>
		* <li>hasBinay = true</li>
		* </ul>
		* The expected result is true.
		*/
		@Test
		void testHasBinay3() {
			SSHPropertyHandler sshPropertyHandler = new SSHPropertyHandler();
			sshPropertyHandler.setRemoteServer("localhost");
			sshPropertyHandler.setRemotePort(21);
			sshPropertyHandler.setRemoteUser("test");
			sshPropertyHandler.setRemotePassword("123456");
			sshPropertyHandler.setSshHomeDir("/");
			sshPropertyHandler.setParent(null);
			sshPropertyHandler.setHasBinay(true);
			assertTrue(sshPropertyHandler.hasBinay());
		}
		
		/**
		* Test case 4 for {@link SSHPropertyHandler#hasBinay()} method.
		* It tests the method with the following input:
		* <ul>
		* <li>remoteServer = "localhost"</li>
		* <li>remotePort = 21</li>
		* <li>remoteUser = "test"</li>
		* <li>remotePassword = "123456"</li>
		* <li>sshHomeDir = "/"</li>
		* <li>parent = null</li>
		* <li>hasBinay = false</li>
		* </ul>
		* The expected result is false.
		*/
		@Test
		void testHasBinay4() {
			SSHPropertyHandler sshPropertyHandler = new SSHPropertyHandler();
			sshPropertyHandler.setRemoteServer("localhost");
			sshPropertyHandler.setRemotePort(21);
			sshPropertyHandler.setRemoteUser("test");
			sshPropertyHandler.setRemotePassword("123456");
			sshPropertyHandler.setSshHomeDir("/");
			sshPropertyHandler.setParent(null);
			sshPropertyHandler.setHasBinay(false);
			assertFalse(sshPropertyHandler.hasBinay());
		}
		
		/**
		* Test case 5 for {@link SSHPropertyHandler#hasBinay()} method.
		* It tests the method with the following input:
		* <ul>
		* <li>remoteServer = "localhost"</li>
		* <li>remotePort = 21</li>
		* <li>remoteUser = "test"</li>
		* <li>remotePassword = "123456"</li>
		* <li>sshHomeDir = "/"</li>
		* <li>parent = null</li>
		* <li>hasBinay = true</li>
		* </ul>
		* The expected result is true.
		*/
		@Test
		void testHasBinay5() {
			SSHPropertyHandler sshPropertyHandler = new SSHPropertyHandler();
			sshPropertyHandler.setRemoteServer("localhost");
			sshPropertyHandler.setRemotePort(21);
			sshPropertyHandler.setRemoteUser("test");
			sshPropertyHandler.setRemotePassword("123456");
			sshPropertyHandler.setSshHomeDir("/");
			sshPropertyHandler.setParent(null);
			sshPropertyHandler.setHasBinay(true);
			assertTrue(sshPropertyHandler.hasBinay());
		}
		
		/**
		* Test case 6 for {@link SSHPropertyHandler#hasBinay()} method.
		* It tests the method with the following input:
		* <ul>
		* <li>remoteServer = "localhost"</li>
		* <li>remotePort = 21</li>
		* <li>remoteUser = "test"</li>
		* <li>remotePassword = "123456"</li>
		* <li>sshHomeDir = "/"</li>
		* <li>parent = null</li>
		* <li>hasBinay = false</li>
		* </ul>
		* The expected result is false.
		*/
		@Test
		void testHasBinay6() {
			SSHPropertyHandler sshPropertyHandler = new SSHPropertyHandler();
			sshPropertyHandler.setRemoteServer("localhost");
			sshPropertyHandler.setRemotePort(21);
			sshPropertyHandler.setRemoteUser("test");
			sshPropertyHandler.setRemotePassword("123456");
			sshPropertyHandler.setSshHomeDir("/");
			sshPropertyHandler.setParent(null);
			sshPropertyHandler.setHasBinay(false);
			assertFalse(sshPropertyHandler.hasBinay());
		}
		
		/**
		* Test case 7 for {@link SSHPropertyHandler#hasBinay()} method.
		* It tests the method with the following