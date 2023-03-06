// SecServerTest.java
package dsachat.server.net;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.Vector;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.KeyAgreement;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import dsachat.server.Handler;
import dsachat.share.ConnectionEndpoint;
import dsachat.share.InputEvent;
import dsachat.share.InputListener;
import dsachat.share.KeyExc;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SecServer}.
* It contains ten unit test cases for the {@link SecServer#isConnected()} method.
*/
class SecServerTest {

	/**
	* Test case for {@link SecServer#isConnected()}.
	* This test case tests the method with a connected socket.
	*/
	@Test
	void testIsConnected1() {
		SecServer secServer = new SecServer(new Socket());
		secServer.connected = true;
		assertTrue(secServer.isConnected());
	}
	
	/**
	* Test case for {@link SecServer#isConnected()}.
	* This test case tests the method with a disconnected socket.
	*/
	@Test
	void testIsConnected2() {
		SecServer secServer = new SecServer(new Socket());
		secServer.connected = false;
		assertFalse(secServer.isConnected());
	}
	
	/**
	* Test case for {@link SecServer#isConnected()}.
	* This test case tests the method with a connected socket.
	*/
	@Test
	void testIsConnected3() {
		SecServer secServer = new SecServer(new Socket());
		secServer.connected = true;
		assertTrue(secServer.isConnected());
	}
	
	/**
	* Test case for {@link SecServer#isConnected()}.
	* This test case tests the method with a disconnected socket.
	*/
	@Test
	void testIsConnected4() {
		SecServer secServer = new SecServer(new Socket());
		secServer.connected = false;
		assertFalse(secServer.isConnected());
	}
	
	/**
	* Test case for {@link SecServer#isConnected()}.
	* This test case tests the method with a connected socket.
	*/
	@Test
	void testIsConnected5() {
		SecServer secServer = new SecServer(new Socket());
		secServer.connected = true;
		assertTrue(secServer.isConnected());
	}
	
	/**
	* Test case for {@link SecServer#isConnected()}.
	* This test case tests the method with a disconnected socket.
	*/
	@Test
	void testIsConnected6() {
		SecServer secServer = new SecServer(new Socket());
		secServer.connected = false;
		assertFalse(secServer.isConnected());
	}
	
	/**
	* Test case for {@link SecServer#isConnected()}.
	* This test case tests the method with a connected socket.
	*/
	@Test
	void testIsConnected7() {
		SecServer secServer = new SecServer(new Socket());
		secServer.connected = true;
		assertTrue(secServer.isConnected());
	}
	
	/**
	* Test case for {@link SecServer#isConnected()}.
	* This test case tests the method with a disconnected socket.
	*/
	@Test
	void testIsConnected8() {
		SecServer secServer = new SecServer(new Socket());
		secServer.connected = false;
		assertFalse(secServer.isConnected());
	}
	
	/**
	* Test case for {@link SecServer#isConnected()}.
	* This test case tests the method with a connected socket.
	*/
	@Test
	void testIsConnected9() {
		SecServer secServer = new SecServer(new Socket());
		secServer.connected = true;
		assertTrue(secServer.isConnected());
	}
	
	/**
	* Test case for {@link SecServer#isConnected()}.
	* This test case tests the method with a disconnected socket.
	*/
	@Test
	void testIsConnected10() {
		SecServer secServer = new SecServer(new Socket());
		secServer.connected = false;
		assertFalse(secServer.isConnected());
	}
}